package ru.rickSanchez.spring.lesson_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import ru.rickSanchez.spring.lesson_1.entities.Product;

@Component("cartService")
public class CartServiceImpl implements CartService{

    private ProductRepository productRepository;

    @Override
    public List<Product> getProductList(){
        return productRepository.findAll();
    }

    @Override
    public List<Product> addById(Long id){
        return null;
    }

    @Override
    public List<Product> deleteById(Long id) {
        return null;
    }


    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
