package cmu.youchunn.product.common;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductInfoOutput {

    private String productId;

    /** Name. */
    private String productName;

    /** Unit price. */
    private BigDecimal productPrice;

    /** Stock. */
    private Integer productStock;

    /** Description. */
    private String productDescription;

    /** Icon. */
    private String productIcon;

    /** Status. */
    private Integer productStatus;

    /** Type id. */
    private Integer categoryType;
}