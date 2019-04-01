package com.fudan.beans.io;

import java.io.InputStream;

/**
 * @author qiaoying
 * @date 2019-04-01 10:04
 */
public interface Resource {

    InputStream getInputStream() throws Exception;
}
