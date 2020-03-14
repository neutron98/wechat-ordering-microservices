package cmu.youchunn.product.enums;


import lombok.Getter;

/**
 * Product Status
 */
@Getter
public enum ProductStatusEnum {
    UP(0, "in stock"),
    DOWN(1, "un available"),
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
