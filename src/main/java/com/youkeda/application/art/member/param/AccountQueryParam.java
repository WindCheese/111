package com.youkeda.application.art.member.param;

import com.youkeda.application.art.member.model.AccountStatus;
import com.youkeda.model.BasePagingParam;

import java.util.List;

public class AccountQueryParam extends BasePagingParam<AccountQueryParam> {

    private static final long serialVersionUID = 4679489114099008390L;

    private String name;

    /**
     * 用户名称
     */
    private String userName;

    private String mobile;

    private List<String> mobiles;

    private String accountId;

    /**
     * 账户集合
     */
    private List<String> accountIds;

    /**
     * 用户id
     */
    private String userId;

    private String companyId;

    private AccountStatus status;

    public AccountQueryParam() {

    }

    public static AccountQueryParam create() {
        return new AccountQueryParam();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getMobiles() {
        return mobiles;
    }

    public void setMobiles(List<String> mobiles) {
        this.mobiles = mobiles;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public List<String> getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }
}
