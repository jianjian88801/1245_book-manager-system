package com.xunmaw.book.service.inte;

import com.xunmaw.book.pojo.Wish;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : xunmaw
 * @create 2022/7/17 15:05
 */
public interface WishService {

    List<Wish> getWishList();

    Wish getWishById(int id);

}
