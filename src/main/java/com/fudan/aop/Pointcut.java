package com.fudan.aop;

/**
 * @author qiaoying
 * @date 2019-04-03 16:08
 */
public interface Pointcut {

    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
