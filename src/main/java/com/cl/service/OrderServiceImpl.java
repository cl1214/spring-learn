package com.cl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private A a;

    @Override
    public Boolean order(Long id) {


        return true;
    }

    @Override
    public Boolean orderRedisson(Long id) {

        return true;
    }
}
