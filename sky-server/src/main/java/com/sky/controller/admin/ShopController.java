package com.sky.controller.admin;

import com.sky.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @projectName: sky-take-out
 * @package: com.sky.controller.admin
 * @className: ShopController
 * @author: lanL
 * @description: TODO
 * @date: 2023/11/2 15:52
 * @version: 1.0
 */
@RestController("adminShopController")
@RequestMapping("admin/shop")
@Api(tags = "店铺相关接口")
@Slf4j
public class ShopController {

    public static final String KEY = "shop_status";

    @Autowired
    private RedisTemplate redisTemplate;

    @PutMapping("/{status}")
    @ApiOperation("设置后店铺状态")
    public Result setStatus(@PathVariable Integer status){
        log.info("设置店铺状态为：{}",status == 1 ? "营业":"打烊");
        redisTemplate.opsForValue().set(KEY,status);
        return Result.success();
    }

    @GetMapping("/status")
    @ApiOperation("获取店铺状态")
    public Result<Integer> getStatus(){
        Integer status = (Integer) redisTemplate.opsForValue().get(KEY);
        log.info("获取店铺状态为：{}",status == 1?"营业":"打烊");
        return Result.success(status);
    }
}