package com.sky.service;


import com.sky.dto.DishDTO;

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
}

