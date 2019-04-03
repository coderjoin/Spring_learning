package com.fudan;

/**
 * @author qiaoying
 * @date 2019-04-03 14:49
 */
public class OutputServiceImpl implements OutputService {

    @Override
    public void output(String text) {

        System.out.println(text);
    }
}
