package com.lloyvet.gmall.user.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lloyvet.gmall.bean.UmsMemberReceiveAddress;
import com.lloyvet.gmall.bean.UmsMembers;
import com.lloyvet.gmall.service.UserService;
import com.lloyvet.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.lloyvet.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UmsMembers> implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;
    @Override
    public List<UmsMembers> getAllUser() {
        List<UmsMembers> umsMembers = userMapper.selectAllUser();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> UmsMemberReceiveAddress(Long memberId) {
        QueryWrapper<UmsMemberReceiveAddress> qw = new QueryWrapper<>();
        qw.eq("member_id",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = umsMemberReceiveAddressMapper.selectList(qw);
        return umsMemberReceiveAddresses;
    }
}
