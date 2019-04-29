package com.apollo.admin.controller;

import com.apollo.admin.api.entity.SysUser;
import com.apollo.admin.service.SysUserService;
import com.apollo.common.core.util.BaseResp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 73955
 * @date 2019/4/29 16:45
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private SysUserService sysUserService;

    @PostMapping
    public BaseResp user(@RequestBody SysUser sysUser) {
        return new BaseResp<>(sysUserService.save(sysUser));
    }

}
