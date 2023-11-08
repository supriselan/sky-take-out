package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;

import java.util.List;
/**
 * @projectName: sky-take-out
 * @package: com.sky.service
 * @className: ShoppingCartService
 * @author: lanL
 * @description: TODO
 * @date: 2023/11/8 22:26
 * @version: 1.0
 */
public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    void addShoppingCart(ShoppingCartDTO shoppingCartDTO);

    /**
     * 查看购物车
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 清空购物车商品
     */
    void cleanShoppingCart();

    /**
     * 删除购物车中一个商品
     * @param shoppingCartDTO
     */
    void subShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
