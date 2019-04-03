package com.fudan.aop;

import org.aopalliance.aop.Advice;

/**
 * @author qiaoying
 * @date 2019-04-03 15:38
 */
public interface Advisor {

    Advice getAdvice();
}
