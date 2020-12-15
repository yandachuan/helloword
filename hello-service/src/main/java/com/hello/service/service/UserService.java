package com.hello.service.service;


import com.github.pagehelper.PageInfo;
import com.hello.api.dto.UserDTO;
import com.hello.api.req.HelloRequest;
import com.hello.api.req.UserRequest;

import java.util.List;

public interface UserService {

    String getHelloContent(HelloRequest helloRequest);

    Long insert(UserRequest entity);

    Long deleteByUserId(Integer userId);

    Long update(UserRequest entity);

    UserDTO getByUserId(Integer userId);

    List<UserDTO> findUserList();

    PageInfo<UserDTO> getUserList(int pageNum, int pageSize);
}
