package com.zhenzhi.tool.service.dto;

import co.yixiang.annotation.Query;
import lombok.Data;

/**
 * sm.ms图床
 *
 * @author Zheng Jie
 * @date 2019-6-4 09:52:09
 */
@Data
public class PictureQueryCriteria{

    @Query(type = Query.Type.INNER_LIKE)
    private String filename;

    @Query(type = Query.Type.INNER_LIKE)
    private String username;
}
