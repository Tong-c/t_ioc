package com.tc.beans.factory.support;

import com.tc.beans.factory.BeansException;
import com.tc.beans.factory.config.BeanDefinition;

public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy{

    @Override
    public Object instantiate(BeanDefinition beanDefinition) throws BeansException {
        throw new UnsupportedOperationException("CGLIB instantiation strategy is not supported");
    }
}
