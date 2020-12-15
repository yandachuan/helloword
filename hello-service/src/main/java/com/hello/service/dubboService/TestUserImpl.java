package com.hello.service.dubboService;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageInfo;
import com.hello.api.dto.UserDTO;
import com.hello.api.req.HelloRequest;
import com.hello.api.req.UserRequest;
import com.hello.api.service.testUser;
import com.hello.service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class TestUserImpl implements testUser {

    @Autowired
    private UserService userService;

    @Override
    public String getResult(HelloRequest helloRequest) {
        return userService.getHelloContent(helloRequest);
    }

    @Override
    public Long insert(UserRequest entity) {
        return userService.insert(entity);
    }

    @Override
    public Long deleteByUserId(Integer userId) {
        return userService.deleteByUserId(userId);
    }

    @Override
    public Long update(UserRequest entity) {
        return userService.update(entity);
    }

    @Override
    public UserDTO getByUserId(Integer userId) {
        return userService.getByUserId(userId);
    }

    @Override
    public List<UserDTO> findUserList() {
        return userService.findUserList();
    }

    @Override
    public PageInfo<UserDTO> getUserList(int pageNum, int pageSize) {
        return userService.getUserList(pageNum, pageSize);
    }

}
