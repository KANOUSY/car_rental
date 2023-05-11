package com.kanous.car_rental.mapper;

import com.kanous.car_rental.pojo.AdminInfo;
import com.kanous.car_rental.pojo.Result;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Mapper
public interface AdminInfoMapper {

    // 增
    @Insert("insert into adminInfo values(#{adminID}, #{adminName}, #{gender}, #{phone}, #{address})")
    void insert(AdminInfo adminInfo);

    // 指定adminID删除
    @Delete("delete from adminInfo where adminID = #{adminID}")
    void delete(String adminID);

    // 指定adminID更新
    @Update("")
    void update();

    // 指定adminID或adminName查询
    @Select("select * from adminInfo where adminID = #{adminID} or adminName = #{adminName}")
    List<AdminInfo> list1(String adminID, String adminName);

    // 全部查
    @Select("select * from adminInfo")
    List<AdminInfo> list2();
}
