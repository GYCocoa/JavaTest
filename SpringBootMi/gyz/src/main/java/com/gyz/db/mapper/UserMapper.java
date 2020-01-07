package com.gyz.db.mapper;

import com.gyz.db.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    int addUser(User user);

    int deleteUser(int id);

    int updateUser(User user);

    Map queryUserById(int id);

    Map queryUserByNickname(String nickname);

    List<User> queryUserList();

}
