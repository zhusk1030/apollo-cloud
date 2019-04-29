package com.apollo.admin.service.impl;

import com.apollo.admin.api.entity.SysUser;
import com.apollo.admin.mapper.SysUserMapper;
import com.apollo.admin.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 用户Service接口实现类
 *
 * @author 73955
 * @date 2019/4/29 18:59
 */
@Slf4j
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {
}
