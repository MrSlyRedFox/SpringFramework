package ru.rickSanchez.spring.lesson_1;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;

import ru.rickSanchez.spring.lesson_1.entities.Product;

@Component
public class ProductRepository {
    private List<Product> productList =
            new ArrayList<>();

    public List<Product> findAll(){
        return Collections.unmodifiableList(productList);
    }

//    public List<Product> getById(Long id){
//        for(Product product : productList) {
//            if(product.getId() == id){
//                return product.getId();
//            }
//        }
//        return null;
//    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public ProductRepository() {

    }
    @PostConstruct
    public void init(){
        productList.add(new Product(1,"milk",20.0));
        productList.add(new Product(2,"orange",5.0));
        productList.add(new Product(3,"apple",5.0));
    }
}
