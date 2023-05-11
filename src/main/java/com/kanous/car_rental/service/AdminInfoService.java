package com.kanous.car_rental.service;

import com.kanous.car_rental.pojo.AdminInfo;

import java.util.List;

public interface AdminInfoService {

    // 增
    void insert(AdminInfo adminInfo);

    // 指定adminID删除
    void delete(String adminID);

    // 指定adminID更新
    void update();

    // 指定adminID或adminName查询
    List<AdminInfo> list1(String adminID, String adminName);

    // 全部查
    List<AdminInfo> list2();
}
