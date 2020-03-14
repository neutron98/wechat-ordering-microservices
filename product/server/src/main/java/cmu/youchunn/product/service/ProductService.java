package cmu.youchunn.product.service;

import cmu.youchunn.product.common.DecreaseStockInput;
import cmu.youchunn.product.common.ProductInfoOutput;
import cmu.youchunn.product.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {
    /**
     * Find all product in stock
     *
     */
    List<ProductInfo> findUpAll();

    /**
     * Find product list.
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * Decrease stock
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);

}
