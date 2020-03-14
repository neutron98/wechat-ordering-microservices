package cmu.youchunn.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class CategoryInfo {

    @Id
    @GeneratedValue
    private Integer categoryId;

    /** Category name. */
    private String categoryName;

    /** Category type id */
    private Integer categoryType;

    /** Create time. */
    private Date createTime;

    /** Update Time. */
    private Date updateTime;
}
