/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farid.spring.core;

import com.farid.spring.core.DependsOnConfiguration;
import com.farid.spring.core.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author IIISI
 */
public class DependsOnTest {
    
    private ApplicationContext applicationContext;
    
    @BeforeEach
    void setUp(){
        applicationContext = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }
    
    @Test
    void testDependsOn(){
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
