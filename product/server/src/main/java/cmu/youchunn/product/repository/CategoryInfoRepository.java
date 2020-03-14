package cmu.youchunn.product.repository;

import cmu.youchunn.product.dataobject.CategoryInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryInfoRepository extends JpaRepository<CategoryInfo, Integer> {

    List<CategoryInfo> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
