package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @projectName: sky-take-out
 * @package: com.sky.mapper
 * @className: DishFlavorMapper
 * @author: lanL
 * @description: TODO
 * @date: 2023/10/26 23:26
 * @version: 1.0
 */

@Mapper
public interface DishFlavorMapper {
    /**
     * 批量插入口味数据
     *
     * @param flavors
     * @return
     * @author LanL
     * @date 2023/10/26 23:28
     */
    void insertBatch(List<DishFlavor> flavors);

}
