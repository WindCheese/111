package com.youkeda.application.art.member.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.youkeda.model.Base;
import com.youkeda.model.Company;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import java.time.LocalDateTime;

@Document(collection = "accounts", collation = "{locale: 'zh'}")
public class Account extends Base<Account> {

    @Transient
    public static final Company DEFAULT = new Company("youkeda","default","default");

    private static long serialVersionUID;

    /**
     * 关联的User
     */
    @Transient
    private User user;

    @Field(targetType = FieldType.OBJECT_ID)
    private String userId;

    /**
     * 个人资料
     */
    private AccountProfile profile = new AccountProfile();

    /**
     * 状态，默认激活状态
     */
    private AccountStatus status = AccountStatus.enabled;

    /**
     * 账户名称，用于手工创建
     */
    private String accountName;

    /**
     * 账户手机号码，用于企业创建账户
     */
    private String accountMobile;

    /**
     * 旧 ID，备用
     */
    private String oldId;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 入职时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime joinTime;

    /**
     * 用户工号
     */
    private String jobNumber;

    /**
     * 是否被封禁
     */
    private boolean ban;

    public Account(){

    }

    public Account(String accountName, String accountMobile, AccountStatus status){
        this.accountName = accountName;
        this.accountMobile = accountMobile;
        this.status = status;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        Account.serialVersionUID = serialVersionUID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public AccountProfile getProfile() {
        return profile;
    }

    public void setProfile(AccountProfile profile) {
        this.profile = profile;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountMobile() {
        return accountMobile;
    }

    public void setAccountMobile(String accountMobile) {
        this.accountMobile = accountMobile;
    }

    public String getOldId() {
        return oldId;
    }

    public void setOldId(String oldId) {
        this.oldId = oldId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getJoinTime() {
        if (joinTime == null) {
            return this.getGmtCreated();
        }
        return joinTime;
    }

    public void setJoinTime(LocalDateTime joinTime) {
        this.joinTime = joinTime;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public boolean isBan() {
        return ban;
    }

    public void setBan(boolean ban) {
        this.ban = ban;
    }

    public String getCompanyId() {
        return companyId;
    }
}
