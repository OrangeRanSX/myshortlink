package com.rsx.myshortlink.admin.controller;

import com.rsx.myshortlink.admin.common.convention.result.Result;
import com.rsx.myshortlink.admin.common.convention.result.Results;
import com.rsx.myshortlink.admin.dto.req.ShortLinkGroupSaveReqDTO;
import com.rsx.myshortlink.admin.service.GroupService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 短链接分组控制层
 */
@RestController
@RequiredArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @PostMapping("/api/short-link/v1/group")
    public Result<Void> save(@RequestBody ShortLinkGroupSaveReqDTO requestParam) {
        groupService.saveGroup(requestParam.getName());
        return Results.success();
    }
}