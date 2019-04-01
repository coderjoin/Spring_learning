package com.fudan.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qiaoying
 * @date 2019-04-01 10:48
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<PropertyValue>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValues() {
        return propertyValueList;
    }
}
