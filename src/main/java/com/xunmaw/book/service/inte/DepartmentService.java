package com.xunmaw.book.service.inte;

import com.xunmaw.book.pojo.Department;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : xunmaw
 * @create 2022/7/17 9:49
 */
public interface DepartmentService {

    List<Department> getDepartList();

    Department getDepartById(int id);

    void addDepart(String name);

    void delDepart(int id);

    void updateDepart(Department department);


}
