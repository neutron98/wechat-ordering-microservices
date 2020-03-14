package cmu.youchunn.order.enums;

import lombok.Getter;

@Getter
public enum ResultEnum {
    SUCCESS(0, "Success"),
    PARAM_ERROR(1, "Invalid parameters"),
    /**
     * Product: Begins with 1001
     */
    PRODUCT_NOT_EXIST(1001, "Product does not exist"),
    PRODUCT_STOCK_ERROR(1002, "Invalid stock quantity"),
    PRODUCT_STATUS_ERROR(1003, "Invalid product status"),

    /***
     * Order: Begins with 1101
     */
    ORDER_NOT_EXIST(1101, "Order does not exist"),
    ORDER_DETAIL_NOT_EXIST(1102, "Order detail does not exist"),
    ORDER_STATUS_ERROR(1103, "Invalid order status"),
    ORDER_UPDATE_FAIL(1104, "Order update failed"),
    ORDER_DETAIL_EMPTY(1105, "Order detail is empty"),

    ORDER_CANCEL_SUCCESS(1106,"You have successfully canceled the order"),
    ORDER_FINISH_SUCCESS(1107,"You have successfully finished the order"),


    /***
     * Payment: Begins with 1201
     */
    PAY_STATUS_ERROR(1201, "Invalid payment status"),
    CART_EMPTY(1202, "Cart can not be empty"),
    ORDER_OWNER_ERROR(1203, "The order does not belong to current user"),
    WECHAT_MP_ERROR(1204, "Error from WeChat Public Account"),
    WXPAY_NOTIFY_MONEY_VERIFY_ERROR(1205, "Wrong amount in WeChat pay asynchronous notification"),


    /**
     * Account
     */
    LOGIN_FAILED(2001, "Login failed: wrong login message"),
    LOGOUT_SUCCESS(2002, "You have successfully logged out")

    ;

    private  Integer code;
    private  String message;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.message = msg;
    }
}
