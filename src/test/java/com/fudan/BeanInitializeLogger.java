package com.fudan;

import com.fudan.beans.BeanPostProcessor;

/**
 * @author qiaoying
 * @date 2019-04-03 15:08
 */
public class BeanInitializeLogger implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception {
        System.out.println("Initialize bean " + beanName + " start !");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws Exception {
        System.out.println("Initialize bean " + beanName + " end !");
        return bean;
    }
}
