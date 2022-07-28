package com.youkeda.application.art.member.repository;

import com.youkeda.application.art.member.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface UserRepository extends MongoRepository<User, String> {

    /**
     * 根据手机号查询 user
     *
     * @param mobile
     * @return
     */
    User findByMobile(String mobile);

    /**
     * 根据用户名查询 user
     *
     * @param userName
     * @return
     */
    User findByUserName(String userName);

    /**
     * 根据邮箱查询 user
     *
     * @param email
     * @return
     */
    User findByEmail(String email);

}
