package sample.di.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.di.business.domain.Product;

@Component("productService")
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;

    public Product getProduct() {
        // それっぽく、検索条件をいれてます
        return productDao.getProduct("ホチキス");
    }
}