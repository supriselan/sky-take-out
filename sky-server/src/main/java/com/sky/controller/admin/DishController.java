package com.sky.controller.admin;

import com.sky.dto.DishDTO;
import com.sky.dto.DishPageQueryDTO;
import com.sky.entity.Dish;
import com.sky.result.PageResult;
import com.sky.result.Result;
import com.sky.service.DishService;
import com.sky.vo.DishVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @projectName: sky-take-out
 * @package: com.sky.controller.admin
 * @className: DishController
 * @author: lanL
 * @description: TODO
 * @date: 2023/10/26 20:20
 * @version: 1.0
 */

@RestController
@RequestMapping("/admin/dish")
@Api(tags = "菜品相关接口")
@Slf4j
public class DishController {
    @Autowired
    private DishService dishService;

    /**
     * 新增菜品
     *
     * @param dishDTO
     * @return java.lang.String
     * @author LanL
     * @date 2023/10/26 23:13
     */
    @RequestMapping("/list")
    @ApiOperation("新增菜品列表")
    public Result save(@RequestBody DishDTO dishDTO) {
        log.info("新增菜品列表：{}",dishDTO);
        return Result.success();
    }

    /**
     * 菜品分页查询
     * @param dishPageQueryDTO
     * @return com.sky.result.Result<com.sky.result.PageResult>
     * @author LanL
     * @date 2023/10/27 12:58
     */
    public Result<PageResult> page(DishPageQueryDTO dishPageQueryDTO){
        log.info("菜品分页查询：{}",dishPageQueryDTO);
        PageResult pageResult=dishService.pageQuery(dishPageQueryDTO);
        return Result.success(pageResult);
    }

    /**
     * 菜品批量删除
     * @param ids
     * @return com.sky.result.Result
     * @author LanL
     * @date 2023/10/27 14:52
     */
    @DeleteMapping
    @ApiOperation("菜品批量删除")
    public Result delete(@RequestParam List<Long> ids){
        log.info("菜品批量删除：{}",ids);
        dishService.deleteBatch(ids);
        return Result.success();
    }

    /**
     * 根据id查询菜品
     * @param id
     * @return com.sky.result.Result<com.sky.vo.DishVO>
     * @author LanL
     * @date 2023/10/27 23:26
     */
    @GetMapping("/{id}")
    @ApiOperation("根据id查询菜品")
    public Result<DishVO> getById(@PathVariable Long id){
        log.info("根据id查询菜品：{}",id);
        DishVO dishVO=dishService.getByIdWithFlavor(id);
        return Result.success(dishVO);
    }

    /***
     * 修改菜品
     * @param dishDTO
     * @return com.sky.result.Result
     * @author LanL
     * @date 2023/10/28 23:57
     */
    @PutMapping
    @ApiOperation("修改菜品")
    public Result update(@RequestBody DishDTO dishDTO){
        log.info("修改菜品：{} ",dishDTO);
        dishService.updateWithFlavor(dishDTO);
        return null;
    }

    /**
     * 根据分类id查询菜品
     * @param categoryId
     * @return
     * @author LanL
     * @date 2023/10/28 23:57
     */
    @GetMapping("/list")
    @ApiOperation("根据分类id查询菜品")
    public Result<List<Dish>> list(Long categoryId){
        List<Dish> list = dishService.list(categoryId);
        return Result.success(list);
    }

}
