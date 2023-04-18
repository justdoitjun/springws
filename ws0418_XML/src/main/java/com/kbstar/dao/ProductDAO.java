package com.kbstar.dao;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.DAO;

import java.util.List;

public class ProductDAO implements DAO<String, ProductDTO> {
    public void insert(ProductDTO productDTO) {
        System.out.println("Insert");
        System.out.println("Complete!!!!!!");
    }

    public void delete(String K) {
        System.out.println("Delete");
        System.out.println("Complete!!!!!!");
    }

    public void update(ProductDTO productDTO) {
        System.out.println("Update");
        System.out.println("Complete!!!!!!");
    }

    public ProductDTO select(String s) {
        ProductDTO product = null;
        product = new ProductDTO(1, "test", 1, 1);
        System.out.println("Complete!!!!!!");
        return product;
    }

    public List<ProductDTO> select() {
        List<ProductDTO> list = null;
        list.add(new ProductDTO(2, "test",2, 2));
        list.add(new ProductDTO(3, "test",3, 3));
        list.add(new ProductDTO(4, "test",4, 4));
        System.out.println("Complete!!!!!!");
        return list;
    }
}
