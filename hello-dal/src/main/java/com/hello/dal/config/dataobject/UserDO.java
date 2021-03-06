package com.hello.dal.config.dataobject;

import java.util.Date;

/**
 * The table USER
 */
public class UserDO{

    /**
     * photo PHOTO.
     */
    private String photo;
    /**
     * password PASSWORD.
     */
    private String password;
    /**
     * username USERNAME.
     */
    private String username;
    /**
     * userId USER_ID.
     */
    private Integer userId;
    /**
     * regTime REG_TIME.
     */
    private Date regTime;

    /**
     * Set photo PHOTO.
     */
    public void setPhoto(String photo){
        this.photo = photo;
    }

    /**
     * Get photo PHOTO.
     *
     * @return the string
     */
    public String getPhoto(){
        return photo;
    }

    /**
     * Set password PASSWORD.
     */
    public void setPassword(String password){
        this.password = password;
    }

    /**
     * Get password PASSWORD.
     *
     * @return the string
     */
    public String getPassword(){
        return password;
    }

    /**
     * Set username USERNAME.
     */
    public void setUsername(String username){
        this.username = username;
    }

    /**
     * Get username USERNAME.
     *
     * @return the string
     */
    public String getUsername(){
        return username;
    }

    /**
     * Set userId USER_ID.
     */
    public void setUserId(Integer userId){
        this.userId = userId;
    }

    /**
     * Get userId USER_ID.
     *
     * @return the string
     */
    public Integer getUserId(){
        return userId;
    }

    /**
     * Set regTime REG_TIME.
     */
    public void setRegTime(Date regTime){
        this.regTime = regTime;
    }

    /**
     * Get regTime REG_TIME.
     *
     * @return the string
     */
    public Date getRegTime(){
        return regTime;
    }
}
