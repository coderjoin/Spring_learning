package com.fudan.aop;

/**
 * @author qiaoying
 * @date 2019-04-03 16:06
 */
public interface ClassFilter {

    boolean matches(Class targetClass);
}
