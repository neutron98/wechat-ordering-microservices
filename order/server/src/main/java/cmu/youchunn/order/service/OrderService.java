package cmu.youchunn.order.service;

import cmu.youchunn.order.dto.OrderDTO;

public interface OrderService {
    /**
     * create an order
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * finish an order (only sellers can do this)
     * @param orderId
     * @return
     */
    OrderDTO finish(String orderId);
}
