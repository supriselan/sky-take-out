package com.sky.mapper;

import com.sky.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @projectName: sky-take-out
 * @package: com.sky.mapper
 * @className: ShoppingCartMapper
 * @author: lanL
 * @description: TODO
 * @date: 2023/11/8 22:26
 * @version: 1.0
 */

@Mapper
public interface ShoppingCartMapper {
    /**
     * 条件查询
     * @param shoppingCart
     * @return
     */
    List<ShoppingCart> list(ShoppingCart shoppingCart);

    /**
     * 更新商品数量
     * @param shoppingCart
     */
    void updateNumberById(ShoppingCart shoppingCart);

    /**
     * 插入购物车数据
     * @param shoppingCart
     */
    void insert(ShoppingCart shoppingCart);

    /**
     * 清空购物车商品
     * @param currentId
     */
    void deleteByUserId(Long currentId);

    /**
     * 根据id删除商品
     * @param id
     */
    void deleteById(Long id);

    /**
     * 将购物车对象批量添加到购物车
     * @param shoppingCartList
     */
    void insertBatch(List<ShoppingCart> shoppingCartList);
}
