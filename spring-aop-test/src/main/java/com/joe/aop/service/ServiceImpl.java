package com.joe.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by joker on 2022/11/26.
 */

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ServiceImpl {
}
