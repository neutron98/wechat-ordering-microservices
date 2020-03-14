package cmu.youchunn.order.repository;

import cmu.youchunn.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {

}
