package com.hello.dal.config.dao;

import com.hello.api.dto.UserDTO;
import com.hello.api.req.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.hello.dal.config.mapper.UserDOMapper;

/**
* The Table user.
* USER
*/
@Repository
public class UserDAO{

    @Autowired
    private UserDOMapper userDOMapper;

    /**
     * desc:插入表:user.<br/>
     * @param entity entity
     * @return Long
     */
    public Long insert(UserRequest entity){
        return userDOMapper.insert(entity);
    }
    /**
     * desc:批量插入表:user.<br/>
     * @param list list
     * @return Long
     */
    public Long insertBatch(List<UserRequest> list){
        return userDOMapper.insertBatch(list);
    }
    /**
     * desc:更新表:user.<br/>
     * @param entity entity
     * @return Long
     */
    public Long update(UserRequest entity){
        return userDOMapper.update(entity);
    }
    /**
     * desc:根据主键删除数据:user.<br/>
     * @param userId userId
     * @return Long
     */
    public Long deleteByUserId(Integer userId){
        return userDOMapper.deleteByUserId(userId);
    }
    /**
     * desc:根据主键获取数据:user.<br/>
     * @param userId userId
     * @return UserDO
     */
    public UserDTO getByUserId(Integer userId){
        return userDOMapper.getByUserId(userId);
    }

    public List<UserDTO> findUserList(){
        return userDOMapper.findUserList();
    }
}
