package com.xunmaw.book.service.inte;

import com.xunmaw.book.pojo.Major;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : xunmaw
 * @create 2022/7/17 13:34
 */
public interface MajorService {

    List<Major> getMajorList();

    Major getMajorById(Integer id);

    void addMajor(Major major);

    void delMajor(int id);

    void updMajor(Major major);

}
