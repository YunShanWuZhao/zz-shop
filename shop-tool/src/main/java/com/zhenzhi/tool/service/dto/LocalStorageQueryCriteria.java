package com.zhenzhi.tool.service.dto;

import co.yixiang.annotation.Query;
import lombok.Data;

/**
* @author Zheng Jie
* @date 2019-09-05
*/
@Data
public class LocalStorageQueryCriteria{

    // 模糊
    @Query(blurry = "name,suffix,type,operate,size")
    private String blurry;
}
