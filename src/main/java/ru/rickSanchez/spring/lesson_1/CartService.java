package ru.rickSanchez.spring.lesson_1;

import java.util.List;

import ru.rickSanchez.spring.lesson_1.entities.Product;

public interface CartService {
    List<Product> getProductList();
    List<Product> addById(Long id);
    List<Product> deleteById(Long id);
}
