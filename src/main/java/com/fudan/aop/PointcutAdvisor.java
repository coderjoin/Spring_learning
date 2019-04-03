package com.fudan.aop;

/**
 * @author qiaoying
 * @date 2019-04-03 16:10
 */
public interface PointcutAdvisor extends Advisor {

    Pointcut getPointcut();
}
