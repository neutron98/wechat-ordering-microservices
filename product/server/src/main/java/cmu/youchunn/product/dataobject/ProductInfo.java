package cmu.youchunn.product.dataobject;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Data
//@Table(name = "T_proxxx")
@Entity
public class ProductInfo {

    @Id
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

    /** Status; 0 = in store, 1 = unavailable. */
    private Integer productStatus;

    /** Category id. */
    private Integer categoryType;

    /** Create Time. */
    private Date createTime;

    /** Update Time. */
    private Date updateTime;
}