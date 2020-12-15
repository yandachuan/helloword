package com.hello.dal.config.mapper;

import com.hello.api.dto.UserDTO;
import com.hello.api.req.UserRequest;
import java.util.List;

/**
 * 由于需要对分页支持,请直接使用对应的DAO类
 * The Table user.
 * USER
 */
public interface UserDOMapper{

    /**
     * desc:插入表:user.<br/>
     * descSql =  SELECT LAST_INSERT_ID() <![CDATA[ INSERT INTO user( PHOTO ,PASSWORD ,USERNAME ,USER_ID ,REG_TIME )VALUES( #{photo,jdbcType=VARCHAR} , #{password,jdbcType=VARCHAR} , #{username,jdbcType=VARCHAR} , #{userId,jdbcType=INTEGER} , #{regTime,jdbcType=TIMESTAMP} ) ]]>
     * @param entity entity
     * @return Long
     */
    Long insert(UserRequest entity);
    /**
     * desc:批量插入表:user.<br/>
     * descSql =  INSERT INTO user( PHOTO ,PASSWORD ,USERNAME ,USER_ID ,REG_TIME )VALUES ( #{item.photo,jdbcType=VARCHAR} , #{item.password,jdbcType=VARCHAR} , #{item.username,jdbcType=VARCHAR} , #{item.userId,jdbcType=INTEGER} , #{item.regTime,jdbcType=TIMESTAMP} ) 
     * @param list list
     * @return Long
     */
    Long insertBatch(List<UserRequest> list);
    /**
     * desc:更新表:user.<br/>
     * descSql =  <![CDATA[ UPDATE user SET PHOTO = #{photo,jdbcType=VARCHAR} ,PASSWORD = #{password,jdbcType=VARCHAR} ,USERNAME = #{username,jdbcType=VARCHAR} WHERE USER_ID = #{userId,jdbcType=INTEGER} ]]> 
     * @param entity entity
     * @return Long
     */
    Long update(UserRequest entity);
    /**
     * desc:根据主键删除数据:user.<br/>
     * descSql =  <![CDATA[ DELETE FROM user WHERE USER_ID = #{userId,jdbcType=INTEGER} ]]>
     * @param userId userId
     * @return Long
     */
    Long deleteByUserId(Integer userId);
    /**
     * desc:根据主键获取数据:user.<br/>
     * descSql =  SELECT * FROM user WHERE <![CDATA[ USER_ID = #{userId,jdbcType=INTEGER} ]]>
     * @param userId userId
     * @return UserDO
     */
    UserDTO getByUserId(Integer userId);

    List<UserDTO> findUserList();
}
