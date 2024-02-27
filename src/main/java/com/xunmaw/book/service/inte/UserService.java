package com.xunmaw.book.service.inte;


import com.xunmaw.book.pojo.User;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : xunmaw
 * @create 2022/7/16 13:48
 */

public interface UserService {

    List<User> getUsers();

    User getUserById(int id);

    List<User> accuracyQueryUser(String username, String name, Integer dept_id, Integer major_id);

    List<User> likeQueryUser(String username, String name, Integer dept_id, Integer major_id);

}
