package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
//        return new RandomRule();//默认轮询，现在改为随机RandomRule_Adam
        return new RandomRule_Adam();//自定义算法RandomRule_Adam
    }
}
