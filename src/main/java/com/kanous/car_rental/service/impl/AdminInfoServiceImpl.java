package com.kanous.car_rental.service.impl;

import com.kanous.car_rental.pojo.AdminInfo;
import com.kanous.car_rental.service.AdminInfoService;
import com.kanous.car_rental.mapper.AdminInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminInfoServiceImpl implements AdminInfoService {
    @Autowired
    private AdminInfoMapper adminInfoMapper;

    // 增
    @Override
    public void insert(AdminInfo adminInfo){
        adminInfoMapper.insert(adminInfo);
    }

    // 指定adminID删除
    @Override
    public void delete(String adminID){
        adminInfoMapper.delete(adminID);
    }

    // 指定adminID更新
    @Override
    public void update(){
        adminInfoMapper.update();
    }

    // 指定adminID或adminName查询
    @Override
    public List<AdminInfo> list1(String adminID, String adminName){
        return adminInfoMapper.list1(adminID, adminName);
    }

    // 全部查
    @Override
    public List<AdminInfo> list2(){
        return adminInfoMapper.list2();
    }
}
