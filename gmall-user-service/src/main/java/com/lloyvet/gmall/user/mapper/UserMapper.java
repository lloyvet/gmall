package com.lloyvet.gmall.user.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lloyvet.gmall.bean.UmsMembers;

import java.util.List;

public interface UserMapper extends BaseMapper<UmsMembers> {
    List<UmsMembers> selectAllUser();
}