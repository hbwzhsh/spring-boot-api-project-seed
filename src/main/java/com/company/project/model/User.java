package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * Email
     */
    private String email;

    /**
     * 证件类型
     */
    @Column(name = "certificate_type")
    private Byte certificateType;

    /**
     * 证件号码
     */
    @Column(name = "certificate_num")
    private String certificateNum;

    /**
     * 推荐人姓名
     */
    @Column(name = "referee_name")
    private String refereeName;

    /**
     * 是否可用
     */
    @Column(name = "is_used")
    private Byte isUsed;

    /**
     * 是否高级认证
     */
    @Column(name = "is_advanced")
    private Byte isAdvanced;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "update_time")
    private Date updateTime;

    @Column(name = "update_by")
    private String updateBy;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取Email
     *
     * @return email - Email
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置Email
     *
     * @param email Email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取证件类型
     *
     * @return certificate_type - 证件类型
     */
    public Byte getCertificateType() {
        return certificateType;
    }

    /**
     * 设置证件类型
     *
     * @param certificateType 证件类型
     */
    public void setCertificateType(Byte certificateType) {
        this.certificateType = certificateType;
    }

    /**
     * 获取证件号码
     *
     * @return certificate_num - 证件号码
     */
    public String getCertificateNum() {
        return certificateNum;
    }

    /**
     * 设置证件号码
     *
     * @param certificateNum 证件号码
     */
    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    /**
     * 获取推荐人姓名
     *
     * @return referee_name - 推荐人姓名
     */
    public String getRefereeName() {
        return refereeName;
    }

    /**
     * 设置推荐人姓名
     *
     * @param refereeName 推荐人姓名
     */
    public void setRefereeName(String refereeName) {
        this.refereeName = refereeName;
    }

    /**
     * 获取是否可用
     *
     * @return is_used - 是否可用
     */
    public Byte getIsUsed() {
        return isUsed;
    }

    /**
     * 设置是否可用
     *
     * @param isUsed 是否可用
     */
    public void setIsUsed(Byte isUsed) {
        this.isUsed = isUsed;
    }

    /**
     * 获取是否高级认证
     *
     * @return is_advanced - 是否高级认证
     */
    public Byte getIsAdvanced() {
        return isAdvanced;
    }

    /**
     * 设置是否高级认证
     *
     * @param isAdvanced 是否高级认证
     */
    public void setIsAdvanced(Byte isAdvanced) {
        this.isAdvanced = isAdvanced;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return create_by
     */
    public String getCreateBy() {
        return createBy;
    }

    /**
     * @param createBy
     */
    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return update_by
     */
    public String getUpdateBy() {
        return updateBy;
    }

    /**
     * @param updateBy
     */
    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}