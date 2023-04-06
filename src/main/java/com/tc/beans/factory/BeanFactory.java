package com.tc.beans.factory;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
