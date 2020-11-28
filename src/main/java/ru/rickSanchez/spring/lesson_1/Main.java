package ru.rickSanchez.spring.lesson_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import ru.rickSanchez.spring.lesson_1.config.AppConfig;

public class Main {
    public static void main(String[] args) {
//        Product product = new Product(2,"Milk",2.0);
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
//
//        context.getBean("product", Product.class);
//        System.out.println(product.getTitle());

//        Product product = context.getBean("product", Product.class);
//        System.out.println(product.getId());

        CartService cartService = context.getBean("cartService", CartService.class);
        System.out.println(cartService.getProductList());

    }
}
