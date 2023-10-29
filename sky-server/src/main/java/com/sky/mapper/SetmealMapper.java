package com.sky.mapper;

import com.github.pagehelper.Page;
import com.sky.annotation.AutoFill;
import com.sky.dto.SetmealPageQueryDTO;
import com.sky.entity.Setmeal;
import com.sky.enumeration.OperationType;
import com.sky.vo.SetmealVO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SetmealMapper {


    /**
     * 根据分类id查询套餐的数量
     * @param id
     * @return
     * @data 2023/10/25 0:06
     */
    @Select("select count(id) from setmeal where category_id = #{categoryId}")
    Integer countByCategoryId(Long id);

    /**
     * 新增套餐
     * @param setmeal
     * @data 2023/10/29 0:07
     */
    @AutoFill(OperationType.INSERT)
    void insert(Setmeal setmeal);


    Page<SetmealVO> pageQuery(SetmealPageQueryDTO setmealPageQueryDTO);

    @Select("select * from setmeal where id = #{id}")
    Setmeal getById(Long id);

    @Delete("delete from setmeal where id = #{id}")
    void deleteById(Long setmealId);

    /**
     * 修改菜单
     * @param  dish
     * @return void
     * @author LanL
     * @date 2023/10/29 17:41
     */
    @AutoFill(value = OperationType.UPDATE)
    void update(Setmeal dish);

}
