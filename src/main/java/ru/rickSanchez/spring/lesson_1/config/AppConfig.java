package ru.rickSanchez.spring.lesson_1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"ru.rickSanchez.spring.lesson_1"})
public class AppConfig {
//    @Bean
//    Product product(){
//        Product product = new Product();
//        product.setId(2);
//        return product;
//    }
}
