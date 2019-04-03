package com.fudan.aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


/**
 * @author qiaoying
 * @date 2019-04-03 16:19
 */
public class Cglib2AopProxy extends AbstractAopProxy {

    public Cglib2AopProxy(AdvisedSupport advised) {
        super(advised);
    }

    @Override
    public Object getProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(advised.getTargetSource().getTargetClass());
        enhancer.setInterfaces(advised.getTargetSource().getInterfaces());
        enhancer.setCallback(new DynamicAdvisedInterceptor(advised));
        Object enhanced = enhancer.create();
        return enhanced;
    }

    private static class DynamicAdvisedInterceptor implements MethodInterceptor {

        private AdvisedSupport advised;

        private org.aopalliance.intercept.MethodInterceptor delegateMethodIntercept;

        private DynamicAdvisedInterceptor(AdvisedSupport advised) {
            this.advised = advised;
            this.delegateMethodIntercept = advised.getMethodInterceptor();
        }

        @Override
        public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
            if (advised.getMethodMatcher() == null
            || advised.getMethodMatcher().matches(method, advised.getTargetSource().getTargetClass())) {
                return delegateMethodIntercept.invoke(new CglibMethodInvocation(advised.getTargetSource().getTarget(), method, objects, methodProxy));
            }
            return new CglibMethodInvocation(advised.getTargetSource().getTarget(),method,objects,methodProxy).proceed();
        }
    }


    private static class CglibMethodInvocation extends ReflactiveMethodInvocation {

        private final MethodProxy methodProxy;

        public CglibMethodInvocation(Object target, Method method,Object[] args, MethodProxy methodProxy) {
            super(target,method,args);
            this.methodProxy = methodProxy;
        }
        @Override
        public Object proceed() throws Throwable {
            return this.methodProxy.invoke(this.target, this.arguments);
        }
    }
}
