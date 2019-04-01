package com.fudan.beans.io;

import java.net.URL;

/**
 * @author qiaoying
 * @date 2019-04-01 10:11
 */
public class ResourceLoader {

    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
