package cmu.youchunn.product.viewobject;

import lombok.Data;

@Data
public class ResultVO<T> {

    /**
     * Status code.
     */
    private Integer code;

    /**
     * Message.
     */
    private String msg;

    /**
     * Data.
     */
    private T data;
}