package com.kanous.car_rental.controller;

import com.kanous.car_rental.pojo.Result;
import com.kanous.car_rental.pojo.AdminInfo;
import com.kanous.car_rental.service.AdminInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequestMapping("/adminInfo")
@RestController
public class AdminInfoController {
    @Autowired
    private AdminInfoService adminInfoService;

    @PostMapping("/insert")
    public Result insert(@RequestBody AdminInfo adminInfo){
        log.info("新增adminInfo: {}" , adminInfo);
        adminInfoService.insert(adminInfo);
        return Result.success();
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestParam String adminID){
        log.info("按adminID删除: {}", adminID);
        adminInfoService.delete(adminID);
        return Result.success();
    }

    @PutMapping("/update")
    public Result update(){
        adminInfoService.update();
        return Result.success();
    }

    @GetMapping("select1")
    public Result list1(@RequestParam(required = false) String adminID, @RequestParam(required = false) String adminName){
        List<AdminInfo> adminInfoList = adminInfoService.list1(adminID, adminName);
        return Result.success(adminInfoList);
    }

    @GetMapping("/select2")
    public Result list2(){
        List<AdminInfo> adminInfoList = adminInfoService.list2();
        return Result.success(adminInfoList);
    }
}
