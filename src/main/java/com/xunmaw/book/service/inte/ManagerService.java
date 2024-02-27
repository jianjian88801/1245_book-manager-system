package com.xunmaw.book.service.inte;

import com.xunmaw.book.pojo.Manager;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : xunmaw
 * @create 2022/7/16 13:48
 */

public interface ManagerService {

    Manager getManagerByUsername(String username);

}
