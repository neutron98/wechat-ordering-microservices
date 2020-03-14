package cmu.youchunn.order.dto;

import cmu.youchunn.order.dataobject.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class OrderDTO {

    /** order id */
    private String orderId;

    /** customer first name. */
    private String firstName;

    /** customer last name. */
    private String lastName;

    /** customer phone number. */
    private String buyerPhone;

    /** customer address. */
    private String buyerAddress;

    /** customer WeChat Openid. */
    private String buyerOpenid;

    /** order total amount. */
    private BigDecimal orderAmount;

    /** order status, in default: 0 - new order */
    private Integer orderStatus;

    /** payment status, in default: 0 - not paid */
    private Integer payStatus;

    private List<OrderDetail> orderDetailList;
}