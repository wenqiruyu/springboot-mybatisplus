package com.wen.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author yingxing
 * @description
 * @date 2019/8/27
 */
@Configuration
@MapperScan("com.example.demo.mapper")
public class MybatisPlusConfig {

    @Bean
    public PaginationInterceptor paginationInterceptor() {

        return new PaginationInterceptor();
    }
}
