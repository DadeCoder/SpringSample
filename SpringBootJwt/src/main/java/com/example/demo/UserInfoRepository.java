package com.example.demo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Dade on 2017/5/13.
 */
public interface UserInfoRepository extends CrudRepository<UserInfo, Integer> {
    UserInfo findUserInfoById(int id);
    List<UserInfo> findUserInfoByRole(String role);
    UserInfo findUserInfoByName(String name);

    @Query(value = "select * from t_user limit ?1", nativeQuery =true)
    List<UserInfo> findAllUsersByCount(int count);
}
