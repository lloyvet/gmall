package com.lloyvet.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lloyvet.gmall.bean.UmsMemberReceiveAddress;
import com.lloyvet.gmall.bean.UmsMembers;
import com.lloyvet.gmall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMembers> getAllUser(){
        List<UmsMembers> umsMembers = userService.getAllUser();
        return umsMembers;
    }
    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddres = userService.UmsMemberReceiveAddress(memberId);
        return umsMemberReceiveAddres;
    }
}
