package com.fudan.aop;

import com.fudan.HelloWorldService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author qiaoying
 * @date 2019-04-03 21:08
 */
public class AspectJExpressionPointcutTest {

    @Test
    public void testClassFilter() throws Exception {
        String expression = "execution(* com.fudan.*.*(..))";
        AspectJExpressionPointcut aspectJExpressionPointcut = new AspectJExpressionPointcut();
        aspectJExpressionPointcut.setExpression(expression);
        boolean matches = aspectJExpressionPointcut.getClassFilter().matches(HelloWorldService.class);
        Assert.assertTrue(matches);
    }
}
