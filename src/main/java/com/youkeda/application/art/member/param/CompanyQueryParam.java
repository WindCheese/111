package com.youkeda.application.art.member.param;

public class CompanyQueryParam {

    /**
     * 根据编码查询
     */
    private String code;

    /**
     * 根据域名查询
     */
    private String domain;

    /**
     * 创建查询参数实例对象
     *
     * @return
     */
    public static CompanyQueryParam create(){
        return new CompanyQueryParam();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
