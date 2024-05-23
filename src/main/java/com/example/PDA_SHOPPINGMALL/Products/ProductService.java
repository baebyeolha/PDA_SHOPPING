package com.example.PDA_SHOPPINGMALL.Products;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    ProductRepository productRepository;

    public Product findProduct(int id){return productRepository.findProduct(id);}

    public List<Product> readAllProduct(int limit, int currentPage){return productRepository.readAllProduct(limit, currentPage);}
    public List<Product> readAllProduct(int limit, int currentPage, Integer categoryId){return productRepository.readAllProduct(limit, currentPage, categoryId);}

    @Transactional
    public  Product createProduct(ProductDTO productDTO){
        Product product = productDTO.convertToEntity();
        productRepository.createProduct(product);
        return productRepository.findProduct(product.getId());
    }

    public void deleteProduct(int id) {productRepository.deleteProduct(id);}

    public void deleteProducts(List<Integer> deleteId) {productRepository.deleteProducts(deleteId);}


}

