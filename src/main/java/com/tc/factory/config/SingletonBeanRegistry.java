package com.tc.factory.config;

public interface SingletonBeanRegistry {

    Object getSingleton(String beanName);

}