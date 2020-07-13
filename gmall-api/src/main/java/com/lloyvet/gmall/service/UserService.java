package com.lloyvet.gmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lloyvet.gmall.bean.UmsMemberReceiveAddress;
import com.lloyvet.gmall.bean.UmsMembers;


import java.util.List;

public interface UserService extends IService<UmsMembers>{


    List<UmsMembers> getAllUser();

    List<UmsMemberReceiveAddress> UmsMemberReceiveAddress(Long memberId);
}
