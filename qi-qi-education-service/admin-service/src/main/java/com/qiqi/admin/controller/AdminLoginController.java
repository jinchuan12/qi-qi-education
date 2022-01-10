package com.qiqi.admin.controller;

import com.qiqi.admin.service.IAdminService;
import com.qiqi.common.result.Result;
import com.qiqi.model.admin.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: 金川
 * @Description:
 * @Date:Created in 2022/1/8 21:34
 * @Modified By:
 */
@RestController
@RequestMapping("/admin")
public class AdminLoginController {

    @Autowired
    private IAdminService adminService;

    @GetMapping("login")
    public Result login(){
        List<Admin> list = adminService.list();
        return Result.ok(list);
    }


}
