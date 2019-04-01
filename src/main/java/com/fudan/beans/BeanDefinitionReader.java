package com.fudan.beans;

/**
 * @author qiaoying
 * @date 2019-04-01 10:00
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}
