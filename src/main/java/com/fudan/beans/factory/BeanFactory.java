package com.fudan.beans.factory;

/**
 * @author qiaoying
 * @date 2019-04-01 10:24
 */
public interface BeanFactory {

    Object getBean(String name) throws Exception;
}
