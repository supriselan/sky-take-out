package com.sky.service;


import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.vo.DishVO;

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

    /**
     * 根据id查询对应口味数据
     * @param
     * @return com.sky.vo.DishVO
     * @author LanL
     * @date 2023/10/27 23:28
     */
    DishVO getByIdWithFlavor(Long id);

    /**
     * 根据id修改菜品基本信息和口味信息
     * @param dishDTO
     * @return void
     * @author LanL
     * @date 2023/10/27 23:40
     */
    void updateWithFlavor(DishDTO dishDTO);

    List<Dish> list(Long categoryId);
}

