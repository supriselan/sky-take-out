package com.sky.mapper;

import com.sky.entity.DishFlavor;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

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

    /**
     * 根据菜品id删除对应的口味数据
     * @param  dishId
     * @return void
     * @author LanL
     * @date 2023/10/27 15:39
     */
    @Delete("delete from dish_flavor where dish_id = #{dishId}")
    void deleteByDishId(Long dishId);

    /**
     * 根据菜品id获取对应的口味数据
     * @param dishId
     * @return java.util.List<com.sky.entity.DishFlavor>
     * @author LanL
     * @date 2023/10/27 23:33
     */
    @Select("select * from dish_flavor where dish_id = #{dishId}")
    List<DishFlavor> getByDishId(Long dishId);
}
