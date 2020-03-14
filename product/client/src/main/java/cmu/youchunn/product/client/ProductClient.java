package cmu.youchunn.product.client;

import cmu.youchunn.product.common.DecreaseStockInput;
import cmu.youchunn.product.common.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
/**
 * Access "/msg" interface in "product" application
 */
@FeignClient(name = "product")
public interface ProductClient {

    /**
     * Get product id list (for order service)
     *
     * @param productIdList
     * @return
     */
    @PostMapping("/product/listForOrder")
    public List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);

    @PostMapping("product/decreaseStock")
    public void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList);
}
