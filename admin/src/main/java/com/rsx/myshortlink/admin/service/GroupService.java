package com.rsx.myshortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.rsx.myshortlink.admin.dao.entity.GroupDO;
import com.rsx.myshortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * 短链接分组接口层
 */
public interface GroupService extends IService<GroupDO> {
    /**
     * 新增短链接分组
     *
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);

    /**
     * 查询用户短链接分组集合
     *
     * @return 用户短链接分组集合
     */
    List<ShortLinkGroupRespDTO> listGroup();
}
