package com.youkeda.application.art.member.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.youkeda.model.Base;

import java.time.LocalDateTime;

public class AccountProfile extends Base<AccountProfile> {

    private static long serialVersionUID;

    /**
     * 大学学校名称
     */
    private String schoolName;

    /**
     * 入学时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime schoolBeginDate;

    /**
     * 毕业时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime schoolEndDate;

    /**
     * 专业
     */
    private String major;

    /**
     * qq号
     */
    private String qq;

    /**
     * 院系
     */
    private String faculty;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public static void setSerialVersionUID(long serialVersionUID) {
        AccountProfile.serialVersionUID = serialVersionUID;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public LocalDateTime getSchoolBeginDate() {
        return schoolBeginDate;
    }

    public void setSchoolBeginDate(LocalDateTime schoolBeginDate) {
        this.schoolBeginDate = schoolBeginDate;
    }

    public LocalDateTime getSchoolEndDate() {
        return schoolEndDate;
    }

    public void setSchoolEndDate(LocalDateTime schoolEndDate) {
        this.schoolEndDate = schoolEndDate;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
