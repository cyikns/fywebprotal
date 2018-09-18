package cn.ncufz.webprotal.common.pojo;

import java.io.Serializable;

/**
 * 用户属性
 *
 * @author cyikns
 * @create 2018-09-13 17:47
 */
public class User implements Serializable {

 private int uid;
 private String username;

 public int getUid() {
  return uid;
 }

 public void setUid(int uid) {
  this.uid = uid;
 }

 public String getUsername() {
  return username;
 }

 public void setUsername(String username) {
  this.username = username;
 }

 @Override
 public String toString() {
  return "User{" +
   "uid=" + uid +
   ", username='" + username + '\'' +
   '}';
 }
}
