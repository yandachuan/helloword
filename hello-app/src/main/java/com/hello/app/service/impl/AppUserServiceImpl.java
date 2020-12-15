package com.hello.app.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.github.pagehelper.PageInfo;
import com.hello.api.dto.UserDTO;
import com.hello.api.req.UserRequest;
import com.hello.api.service.testUser;
import com.hello.app.service.AppUserService;
import com.hello.api.req.HelloRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AppUserServiceImpl implements AppUserService {

    @Reference(check = false)
    testUser testUser;

    @Override
    public String getResult(HelloRequest helloRequest) {

        return testUser.getResult(helloRequest);
    }

    @Override
    public Long insert(UserRequest entity) {

        return testUser.insert(entity);
    }

    @Override
    public Long deleteByUserId(Integer userId) {
        return testUser.deleteByUserId(userId);
    }

    @Override
    public Long update(UserRequest entity) {
        return testUser.update(entity);
    }

    @Override
    public UserDTO getByUserId(Integer userId) {
        return testUser.getByUserId(userId);
    }

    @Override
    public List<UserDTO> findUserList() {
        return testUser.findUserList();
    }

    @Override
    public PageInfo<UserDTO> getUserList(int pageNum, int pageSize) {
        return testUser.getUserList(pageNum, pageSize);
    }

}
