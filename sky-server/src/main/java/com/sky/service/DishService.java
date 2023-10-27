package com.sky.service;


import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.result.PageResult;

import java.util.List;

public interface DishService {
    /**
     * 新增菜品和对应口味
     * @param
     * @param dishDTO
     * @return void
     * @author LanL
     * @date 2023/10/26 23:12
     */

    public void saveWithFlavor(DishDTO dishDTO);

    PageResult pageQuery(DishPageQueryDTO dishPageQueryDTO);

    /**
     * 菜品批量删除
     * @return void
     * @author LanL
     * @date 2023/10/27 14:54
     */
    void deleteBatch(List<Long> ids);
}

