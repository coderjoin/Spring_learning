package com.fudan.aop;

import com.fudan.beans.factory.BeanFactory;

/**
 * @author qiaoying
 * @date 2019-04-01 14:11
 */
public interface BeanFactoryAware {

    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
