package com.kbstar.app;

import com.kbstar.dto.ProductDTO;
import com.kbstar.frame.GeneralService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OG_ProductInsertTest {
    public static void main(String[] args) {
        ApplicationContext factory =
                new ClassPathXmlApplicationContext("spring.xml"); //레고 판떼기 실행

        GeneralService<String, ProductDTO> generalService =
                (GeneralService<String, ProductDTO>) factory.getBean("pservice");

        ProductDTO u = new ProductDTO(7, "test", 7, 7);
        generalService.register(u);
    }
}
