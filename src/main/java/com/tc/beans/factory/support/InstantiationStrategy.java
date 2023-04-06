package com.tc.beans.factory.support;

import com.tc.beans.factory.BeansException;
import com.tc.beans.factory.config.BeanDefinition;

public interface InstantiationStrategy {

    Object instantiate(BeanDefinition beanDefinition) throws BeansException;
}
