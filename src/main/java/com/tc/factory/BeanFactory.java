package com.tc.factory;

import com.tc.BeansException;

public interface BeanFactory {

    Object getBean(String name) throws BeansException;

}
