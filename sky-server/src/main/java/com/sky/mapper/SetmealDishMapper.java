package com.sky.mapper;


import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SetmealDishMapper {

    /**
     * 根据菜品id查询对应的套餐id
     * @param  dishIds
     * @return java.util.List<java.lang.Long>
     * @author LanL
     * @date 2023/10/27 15:24
     */
    List<Long> getSetmealIdsByDishIds(List<Long> dishIds);


}
