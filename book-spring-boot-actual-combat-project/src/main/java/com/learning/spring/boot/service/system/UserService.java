package com.learning.spring.boot.service.system;

import com.learning.spring.boot.domain.entity.TUser;
import com.learning.spring.boot.domain.response.QueryRequest;
import com.learning.spring.boot.domain.response.User;
import com.learning.spring.boot.domain.response.UserWithRole;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

@CacheConfig(cacheNames = "UserService")
public interface UserService {

    UserWithRole findById(Long userId);

    TUser findByName(String userName);

    @Cacheable(key = "#p0.toString() + (#p1 != null ? #p1.toString() : '')")
    List<TUser> findUserWithDept(User user, QueryRequest request);

    @CacheEvict(key = "#p0", allEntries = true)
    void registUser(User user);

    void updateTheme(String theme, String userName);

    @CacheEvict(allEntries = true)
    void addUser(User user, Long[] roles);

    @CacheEvict(key = "#p0", allEntries = true)
    void updateUser(User user, Long[] roles);

    @CacheEvict(key = "#p0", allEntries = true)
    void deleteUsers(String userIds);

    void updateLoginTime(String userName);

    void updatePassword(String password);

    User findUserProfile(User user);

    void updateUserProfile(User user);

    void updateUser(User user);
}
