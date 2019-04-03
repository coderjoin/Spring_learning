package com.fudan;

import com.fudan.beans.BeanDefinition;
import com.fudan.beans.factory.AbstractBeanFactory;
import com.fudan.beans.factory.AutowireCapableBeanFactory;
import com.fudan.beans.io.ResourceLoader;
import com.fudan.beans.xml.XmlBeanDefinitionReader;
import org.junit.Test;

import java.util.Map;

/**
 * @author qiaoying
 * @date 2019-04-03 14:53
 */
public class BeanFactoryTest {



    @Test
    public void testLazy() throws Exception {

        // 1.读取配置
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("postbeanprocessor.xml");

        // 2.初始化BeanFactory并注册bean
        AbstractBeanFactory beanFactory = new AutowireCapableBeanFactory();
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }

        // 3.获取bean
        HelloWorldService helloWorldService = (HelloWorldService) beanFactory.getBean("helloWorldService");
        helloWorldService.helloWorld();
    }

}
