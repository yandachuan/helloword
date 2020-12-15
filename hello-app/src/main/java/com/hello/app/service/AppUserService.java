package com.hello.app.service;

import com.github.pagehelper.PageInfo;
import com.hello.api.dto.UserDTO;
import com.hello.api.req.HelloRequest;
import com.hello.api.req.UserRequest;

import java.util.List;

public interface AppUserService {

    String getResult(HelloRequest helloRequest);

    Long insert(UserRequest entity);

    Long deleteByUserId(Integer userId);

    Long update(UserRequest entity);

    UserDTO getByUserId(Integer userId);

    List<UserDTO> findUserList();

    PageInfo<UserDTO> getUserList(int pageNum, int pageSize);
}
