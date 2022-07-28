package com.youkeda.application.art.member.repository;

import com.youkeda.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository extends MongoRepository<Company,String> {

    /**
     * 根据 code 查询公司信息
     *
     * @param code
     * @return
     */
    Optional<Company> findByCode(String code);

    /**
     * 根据 domain 查询公司信息
     *
     * @param domain
     * @return
     */
    Optional<Company> findByDomain(String domain);

    /**
     * 根据 accountId 查询公司信息
     *
     * @param accountId
     * @return
     */
    Optional<List<Company>> findByOwnerUserId(String accountId);
}
