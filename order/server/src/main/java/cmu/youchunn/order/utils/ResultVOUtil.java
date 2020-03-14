package cmu.youchunn.order.utils;


import cmu.youchunn.order.viewobject.ResultVO;

public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("Success");
        return resultVO;
    }
}