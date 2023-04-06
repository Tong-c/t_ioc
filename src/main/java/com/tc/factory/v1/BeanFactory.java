package com.tc.factory.v1;

import java.util.HashMap;
import java.util.Map;

public class BeanFactory {

    private Map<String, Object> beanMap = new HashMap<>();

    public void registerBean(String name, Object bean) {
        this.beanMap.put(name, bean);
    }

    public Object getBean(String name) {
        return this.beanMap.get(name);
    }

}
