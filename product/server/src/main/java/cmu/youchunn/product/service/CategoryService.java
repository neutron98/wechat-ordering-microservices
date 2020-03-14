package cmu.youchunn.product.service;

import cmu.youchunn.product.dataobject.CategoryInfo;

import java.util.List;

public interface CategoryService {
    List<CategoryInfo> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
