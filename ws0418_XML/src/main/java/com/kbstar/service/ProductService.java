package com.kbstar.service;

import com.kbstar.dao.ProductDAO;
import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

import java.util.List;

public class ProductService implements Service<String, ProductDTO> {
    DAO<String, ProductDTO> dao;
    public ProductService(ProductDAO dao) {
        this.dao = dao;
    }

    public void register(ProductDTO product) {
        dao.insert(product);
    }

    public void remove(String s) {
        dao.delete(s);
    }

    public void modify(ProductDTO product) {
        dao.update(product);
    }

    public ProductDTO get(String s) {
        return dao.select(s);
    }

    public List<ProductDTO> get() {
        return dao.select();
    }
}
