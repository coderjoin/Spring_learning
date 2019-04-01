package com.fudan.beans;

/**
 * @author qiaoying
 * @date 2019-04-01 12:38
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

    Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;
}
