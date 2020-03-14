package cmu.youchunn.product.controller;

import cmu.youchunn.product.common.DecreaseStockInput;
import cmu.youchunn.product.common.ProductInfoOutput;
import cmu.youchunn.product.dataobject.CategoryInfo;
import cmu.youchunn.product.dataobject.ProductInfo;
import cmu.youchunn.product.service.CategoryService;
import cmu.youchunn.product.service.ProductService;
import cmu.youchunn.product.utils.ResultVOUtil;
import cmu.youchunn.product.viewobject.ProductInfoVO;
import cmu.youchunn.product.viewobject.ProductVO;
import cmu.youchunn.product.viewobject.ResultVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 1. Search all in store products
     * 2. Get type list
     * 3. Search category
     * 4. Construct data object
     */
    @GetMapping("/list")
    public ResultVO<ProductVO> list() {
        //1. Search all in store products
        List<ProductInfo> productInfoList = productService.findUpAll();

        //2. Get type list
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType)
                .collect(Collectors.toList());

        //3. Search category
        List<CategoryInfo> categoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        //4. Construct data object
        List<ProductVO> productVOList = new ArrayList<>();
        for (CategoryInfo category : categoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(category.getCategoryName());
            productVO.setCategoryType(category.getCategoryType());
            // construct the productInfoList
            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(category.getCategoryType())) { // group by category type
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return ResultVOUtil.success(productVOList);
    }

    /**
     * Get product id list (for order service)
     *
     * @param productIdList
     * @return
     */
    @PostMapping("/listForOrder")
    public List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return productService.findList(productIdList);
    }

    @PostMapping("/decreaseStock")
    public void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList) {
        productService.decreaseStock(decreaseStockInputList);
    }
}