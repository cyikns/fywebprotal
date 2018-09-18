package cn.ncufz.webprotal.dao;

import cn.ncufz.webprotal.common.pojo.User;

/**
 * @author cyikns
 * @create 2018-09-18 9:57
 */
public interface UserMapper {

 User findUserById(Integer id);
}
