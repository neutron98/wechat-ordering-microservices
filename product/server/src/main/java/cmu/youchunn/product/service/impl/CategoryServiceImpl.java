package cmu.youchunn.product.service.impl;

import cmu.youchunn.product.dataobject.CategoryInfo;
import cmu.youchunn.product.repository.CategoryInfoRepository;
import cmu.youchunn.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryInfoRepository categoryInfoRepository;

    @Override
    public List<CategoryInfo> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return categoryInfoRepository.findByCategoryTypeIn(categoryTypeList);
    }
}