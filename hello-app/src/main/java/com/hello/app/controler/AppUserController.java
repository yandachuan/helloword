package com.hello.app.controler;

import com.github.pagehelper.PageInfo;
import com.hello.api.dto.UserDTO;
import com.hello.api.req.HelloRequest;
import com.hello.api.req.UserRequest;
import com.hello.app.service.AppUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@EnableCaching
@Api(tags = "测试swagger接口")
public class AppUserController {

    @Autowired
    AppUserService appUserService;

    HelloRequest helloRequest = new HelloRequest();

    @RequestMapping("/hello")
    public String hello() {

        helloRequest.setParame("helloworld");

        return appUserService.getResult(helloRequest);
    }
    @RequestMapping("/insert")
    public Boolean insert(UserRequest entity) {

        entity.setRegTime(new Date());
        return appUserService.insert(entity)>0;

    }
    @RequestMapping("/deleteByUserId")
    @CacheEvict(cacheNames = "user",key = "#userId")
    public Boolean deleteByUserId(Integer userId) {

        return appUserService.deleteByUserId(userId)>0;

    }
    @RequestMapping("/update")
    @CacheEvict(cacheNames = "user",key = "#entity.userId")
    public Boolean update(UserRequest entity) {

        return appUserService.update(entity)>0;

    }
    @RequestMapping("/getByUserId")
    @Cacheable(cacheNames = "user")
    @ApiOperation("根据Id获取用户信息")
    @ApiImplicitParam(name = "userId",value = "userId",required = true,paramType = "query",dataType = "int")
    public UserDTO getByUserId(Integer userId) {

        return appUserService.getByUserId(userId);

    }
    @RequestMapping("/findUserList")
    public List<UserDTO> findUserList() {

        return appUserService.findUserList();

    }

    @RequestMapping("/getUserList")
    public PageInfo<UserDTO> getUserList(int pageNum,int pageSize) {

        return appUserService.getUserList(pageNum, pageSize);

    }
}
