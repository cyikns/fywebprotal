package cn.ncufz.webprotal.service;

import cn.ncufz.webprotal.common.pojo.User;

/**
 * @author cyikns
 * @create 2018-09-13 18:17
 */
public interface UserService {

 User findUser();


 User findUserById(Integer id);
}
