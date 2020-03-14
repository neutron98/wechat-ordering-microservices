package cmu.youchunn.product.utils;

import cmu.youchunn.product.viewobject.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("Success");
        return resultVO;
    }
}