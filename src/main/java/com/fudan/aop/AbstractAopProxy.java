package com.fudan.aop;



/**
 * @author qiaoying
 * @date 2019-04-03 15:43
 */
public abstract class AbstractAopProxy implements AopProxy{

    protected AdvisedSupport advised;

    public AbstractAopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }
}
