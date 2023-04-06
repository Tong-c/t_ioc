package com.tc.factory.support;

import com.tc.BeansException;
import com.tc.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
