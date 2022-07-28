package com.youkeda.application.art.member.service;

import com.youkeda.application.art.member.param.CompanyQueryParam;
import com.youkeda.model.Company;

import java.util.List;

public interface CompanyService {

    /**
     * 创建企业，生成一个 code
     *
     * @param company
     * @return
     */
    Company save(Company company);

    /**
     * 获取企业
     *
     * @param param
     * @return
     */
    Company find(CompanyQueryParam param);

    /**
     * 根据 accountId 查询公司信息
     *
     * @param accountId
     * @return
     */
    List<Company> queryByAccountId(String accountId);

    /**
     * 根据域名查询公司信息
     *
     * @param domainUrl
     * @return
     */
    Company getByDomain(String domainUrl);

    /**
     * 根据主键 id 删除公司
     *
     * @param companyId
     * @return
     */
    boolean delete(String companyId);

    /**
     * 根据主键 id 查询企业信息
     *
     * @param companyId
     * @return
     */
    Company get(String companyId);
}
