package com.sky.controller.admin;

import com.sky.dto.DishDTO;
import com.sky.result.Result;
import com.sky.service.DishService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
