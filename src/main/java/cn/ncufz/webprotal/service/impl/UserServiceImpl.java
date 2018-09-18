package cn.ncufz.webprotal.service.impl;

import cn.ncufz.webprotal.common.pojo.User;
import cn.ncufz.webprotal.dao.UserMapper;
import cn.ncufz.webprotal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author cyikns
 * @create 2018-09-13 18:19
 */
@Service
public class UserServiceImpl implements UserService {

 @Autowired
 private UserMapper userMapper;

 @Override
 public User findUser() {
  User user = new User();
  user.setUid(1);
  return user;
 }

 @Override
 public User findUserById(Integer id) {
  User user = userMapper.findUserById(id);
  return user;
 }
}
