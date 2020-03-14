package cmu.youchunn.product.viewobject;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * {
 *          "name":"xxx",
 *          "type":xxx,
 *          "foods":[
 *             {(ProductInfoVO)
 *             },
 *             {...
 *             }
 *             ]
 *       }
 *
 *
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;
}