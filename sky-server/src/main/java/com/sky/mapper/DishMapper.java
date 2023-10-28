package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.enumeration.OperationType;
import com.sky.vo.DishVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface DishMapper {

    /**
     * 根据分类id查询菜品数量
     * @param categoryId
     * @return
     */
    @Select("select count(id) from dish where category_id = #{categoryId}")
    Integer countByCategoryId(Long categoryId);

    @AutoFill(value = OperationType.INSERT)
    void insert();

    /**
     * 菜品分页查询
     * @param dishPageQueryDTO
     * @return com.github.pagehelper.Page<com.sky.vo.DishVO>
     * @author LanL
     * @date 2023/10/27 13:02
     */
    Page<DishVO> pageQuery(DishPageQueryDTO dishPageQueryDTO);

    @Select("select * from dish where id = #{id}")
    Dish getById(Long id);

    /**
     * 根据主键删除菜品数据
     * @param id
     * @return void
     * @author LanL
     * @date 2023/10/27 15:33
     */
    @Delete("delete from dish where id = #{id}")
     void deleteById(Long id);

    /**
     * 根据id动态修改菜品基本信息
     * @param  dish
     * @return void
     * @author LanL
     * @date 2023/10/27 23:44
     */
    @AutoFill(value = OperationType.UPDATE)
    void update(Dish dish);

    /***
     * 动态查询菜品
     * @param dish
     * @return java.util.List<com.sky.entity.Dish>
     * @author LanL
     * @date 2023/10/29 0:00
     */
    List<Dish> list(Dish dish);

    @Select("select a.* from dish a left join setmeal_dish b on a.id = b.dish_id where b.setmeal_id = #{setmealId}")
    List<Dish> getBySetmealId(Long setmealId);

}
