package com.rsx.myshortlink.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.rsx.myshortlink.admin.common.convention.result.Result;
import com.rsx.myshortlink.admin.common.convention.result.Results;
import com.rsx.myshortlink.admin.dto.req.UserRegisterReqDTO;
import com.rsx.myshortlink.admin.dto.req.UserUpdateReqDTO;
import com.rsx.myshortlink.admin.dto.resp.UserActualRespDTO;
import com.rsx.myshortlink.admin.dto.resp.UserRespDTO;
import com.rsx.myshortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理控制层
 */
@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/short-link/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     * 根据用户名查询用户实际信息(手机号未脱敏)
     */
    @GetMapping("/api/short-link/v1/actual/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable("username") String username) {
        return Results.success(BeanUtil.toBean(userService.getUserByUsername(username), UserActualRespDTO.class));
    }

    /**
     * 查询用户名是否存在
     */
    @GetMapping("/api/short-link/admin/v1/user/has-username")
    public Result<Boolean> hasUsername(@RequestParam("username") String username) {
        return Results.success(userService.hasUsername(username));
    }

    /**
     * 注册用户
     */
    @PostMapping("/api/short-link/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }

    /**
     * 修改用户
     */
    @PutMapping("/api/short-link/v1/user")
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam) {
        userService.update(requestParam);
        return Results.success();
    }
}
