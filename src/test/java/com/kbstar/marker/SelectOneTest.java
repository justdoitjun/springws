package com.kbstar.marker;

import com.kbstar.dto.Marker;
import com.kbstar.service.MarkerService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@Slf4j
@SpringBootTest
class SelectOneTest {
    @Autowired
    MarkerService service;

    @Test
    void contextLoads() {

        try{
            service.get(106);
//            Marker[] list = new Marker[]{service.get(106)};
//            log.info(Arrays.toString(list));
            log.info("Success");
        }catch(Exception e){
            log.info("Error");
            e.printStackTrace();
        }

    }

}
