package com.apollo.admin.controller;

import com.apollo.admin.api.entity.SysUser;
import com.apollo.admin.service.SysUserService;
import com.apollo.common.core.util.BaseResp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制器
 *
 * @author 73955
 * @date 2019/4/29 16:45
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private SysUserService sysUserService;

    @PostMapping
    public BaseResp user(@RequestBody SysUser sysUser) {
        return new BaseResp<>(sysUserService.save(sysUser));
    }

    @GetMapping("/{id}")
    public BaseResp<SysUser> get(@PathVariable Integer id) {
        return new BaseResp<>(sysUserService.getById(id));
    }

}
