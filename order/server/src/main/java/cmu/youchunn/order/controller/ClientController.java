package cmu.youchunn.order.controller;



import cmu.youchunn.product.client.ProductClient;
import cmu.youchunn.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Test controller for communictaion between product and order service.
 */
@RestController
@Slf4j
public class ClientController {
    @Autowired
    private ProductClient productClient;

    @GetMapping("/getProductList")
    public String getProductList(){
        List<ProductInfoOutput> productInfoOutputList = productClient.listForOrder(Arrays.asList("123457"));
        log.info("response = {}", productInfoOutputList);
        return "ok";
    }


}
