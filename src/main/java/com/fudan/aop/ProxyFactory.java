package com.fudan.aop;

/**
 * @author qiaoying
 * @date 2019-04-03 16:12
 */
public class ProxyFactory extends AdvisedSupport implements AopProxy {

    @Override
    public Object getProxy() {
        return creatAopProxy().getProxy();
    }

    protected final AopProxy creatAopProxy() {
        return new Cglib2AopProxy(this);
    }
}
