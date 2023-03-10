/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farid.spring.core;

import com.farid.spring.core.data.Bar;
import com.farid.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

/**
 *
 * @author IIISI
 */
@Slf4j
@Configuration
public class DependsOnConfiguration {
    
    @Lazy
    @Bean
    @DependsOn({
        "bar"
    })
    public Foo foo(){
        log.info("Create new Foo");
        return new Foo();
    }
    
    @Bean
    public Bar bar(){
        log.info("Create new Bar");
        return new Bar();
    }
}
