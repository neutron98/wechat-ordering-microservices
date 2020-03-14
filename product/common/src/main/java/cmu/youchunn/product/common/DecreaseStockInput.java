package cmu.youchunn.product.common;

import lombok.Data;
/**
 * Cart DTO.
 * Used to carry product id and quantity when placing an order.
 */
@Data
public class DecreaseStockInput {
    /** product Id */
    private String productId;
    /** product quantity */
    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}