package com.learning.spring.boot.dao;

import com.learning.spring.boot.domain.entity.UserEntity;
import com.learning.spring.boot.domain.request.UserCreateRequest;
import com.learning.spring.boot.domain.request.UserUpdateRequest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * @Package: com.learning.spring.boot.dao
 * @ClassName: UserDao
 * @Author: beibei.huang
 * @Description: 用户数据操作类
 * @Date: 2019/1/21 11:08
 */
@Repository
public class UserDao {

    private static List<UserEntity> userEntityList;

    static {
        userEntityList = new ArrayList<>();
        UserEntity userEntity1 = new UserEntity(1, "李磊", "lilei", 16);
        UserEntity userEntity2 = new UserEntity(2, "小明", "xiaoming", 16);
        UserEntity userEntity3 = new UserEntity(3, "汤姆", "tom", 16);
        UserEntity userEntity4 = new UserEntity(4, "杰森", "Jason", 16);
        userEntityList.add(userEntity1);
        userEntityList.add(userEntity2);
        userEntityList.add(userEntity3);
        userEntityList.add(userEntity4);
    }

    public List<UserEntity> findUserList(){
        return userEntityList;
    }

    public UserEntity findUser(Integer userId){
        for (UserEntity user:userEntityList) {
            if (user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    public Integer deleteUser(Integer userId){
        for (int i=0 ;i<userEntityList.size();i++){
            if (userEntityList.get(i).getUserId().equals(userId)) {
                userEntityList.remove(i--);
                return 1;
            }
        }
        return 0;
    }

    public Integer createUser(UserCreateRequest userInfo){
        Integer maxUserId = 0;
        for (UserEntity user:userEntityList) {
            if (user.getUserId()>maxUserId){
                maxUserId=user.getUserId();
            }
        }
        UserEntity userEntity = new UserEntity(maxUserId+1, userInfo.getUserName(), userInfo.getPassword(), userInfo.getAge());
        userEntityList.add(userEntity);
        return maxUserId+1;
    }

    public Integer updateUser(UserUpdateRequest userInfo){
        for (UserEntity user:userEntityList) {
            if (user.getUserId()==userInfo.getUserId()){
                user.setAge(userInfo.getAge());
                user.setPassword(userInfo.getPassword());
                user.setUserName(userInfo.getUserName());
                return 1;
            }
        }
        return 0;
    }

}
