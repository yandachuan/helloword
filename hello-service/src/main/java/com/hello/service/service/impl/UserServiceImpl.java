package com.hello.service.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hello.api.dto.UserDTO;
import com.hello.api.req.HelloRequest;
import com.hello.api.req.UserRequest;
import com.hello.dal.config.dao.UserDAO;
import com.hello.service.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public String getHelloContent(HelloRequest helloRequest) {
        return "你好!" + helloRequest.getParame();
    }

    @Override
    public Long insert(UserRequest entity) {
        return userDAO.insert(entity);
    }

    @Override
    public Long deleteByUserId(Integer userId) {
        return userDAO.deleteByUserId(userId);
    }

    @Override
    public Long update(UserRequest entity) {
        return userDAO.update(entity);
    }

    @Override
    public UserDTO getByUserId(Integer userId) {
        return userDAO.getByUserId(userId);
    }

    @Override
    public List<UserDTO> findUserList() {
        return userDAO.findUserList();
    }

    @Override
    public PageInfo<UserDTO> getUserList(int pageNum, int pageSize) {

        //设置分页信息
        PageHelper.startPage(pageNum, pageSize);
        List<UserDTO> userList = userDAO.findUserList();

        //创建分页对象
        PageInfo<UserDTO> userDTOPageInfo = new PageInfo<>(userList);
        return userDTOPageInfo;
    }

}
