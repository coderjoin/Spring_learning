package com.fudan.aop;

import java.lang.reflect.Method;

/**
 * @author qiaoying
 * @date 2019-04-03 15:58
 */
public interface MethodMatcher {

    boolean matches(Method method, Class targetClass);
}
