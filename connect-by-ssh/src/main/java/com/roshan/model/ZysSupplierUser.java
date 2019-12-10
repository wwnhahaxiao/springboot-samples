package com.roshan.model;

import java.util.Date;

public class ZysSupplierUser {
    /**
     * 主键服务生成
     */
    private String userId;

    /**
     * 用户编号
     */
    private String userCode;

    /**
     * 支付密码
     */
    private String password;

    /**
     * 消费限额(超过限额后需要输入支付密码)
     */
    private Integer payLimit;

    /**
     * 用户姓名
     */
    private String userName;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 学/工号
     */
    private String userNumber;

    /**
     * 证件号码
     */
    private String idCard;

    /**
     * 生日
     */
    private String birthday;

    /**
     * 性别(0:未知1:男2:女)
     */
    private Byte sex;

    /**
     * 民族(国标码GB3304-91的数字代码)
     */
    private String ethnicGroup;

    /**
     * email地址
     */
    private String email;

    /**
     * 状态(1:有效 0:无效 -1:删除）
     */
    private Byte userStatus;

    /**
     * 人脸紧急联系人手机号
     */
    private String faceLinkmanMobile;

    /**
     * 人脸信息刷新时间
     */
    private Long faceOprateTime;

    /**
     * 代扣签约状态(0：未签约1：已签约)
     */
    private Boolean withholdStatus;

    /**
     * 代扣签约账号
     */
    private String withholdAccount;

    /**
     * 组织机构id
     */
    private Integer orgId;

    /**
     * 组织机构名称
     */
    private String orgName;

    /**
     * 组织架构编码
     */
    private String orgCode;

    /**
     * 全部组织架构编码
     */
    private String orgFullCode;

    /**
     * 会员分类id
     */
    private Integer classId;

    /**
     * 饭卡ID
     */
    private String cardId;

    /**
     * 饭卡号
     */
    private String cardCode;

    /**
     * 失效日期(永久有效为空)
     */
    private String expiry;

    /**
     * 是否在有效期内(1:是,0:否)
     */
    private Byte unexpired;

    /**
     * 企业标识
     */
    private Integer supplierId;

    /**
     * 企业编码
     */
    private Integer supplierCode;

    /**
     * 操作时间
     */
    private Date updateTime;

    /**
     * 操作人id
     */
    private Integer updateUserId;

    /**
     * 操作人
     */
    private String updateUserName;

    /**
     * 创建人
     */
    private String createUserName;

    /**
     * 创建用户id
     */
    private Integer createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 商家中心用户ID
     */
    private Long eUserId;

    /**
     * 身高（cm）
     */
    private Double height;

    /**
     * 体重（kg）
     */
    private Double weight;

    /**
     * 编辑基础信息时间
     */
    private Date editBasicTime;

    private Date lastUpdateTime;

    /**
     * 会员是否长期有效：1是，0否
     */
    private Byte longEffective;

    /**
     * 会员有效期开始时间（长期有效时不启用）
     */
    private Date effectiveDate;

    /**
     * 会员有效期结束时间（长期有效时不启用）
     */
    private Date expiryDate;

    /**
     * 签约状态(代扣签约状态(0:未签约1:已签约,2:已解约))
     */
    private Byte agreementStatus;

    /**
     * 证件类型（1.身份证，2.港澳台通行证，3.外籍护照）
     */
    private Byte cardType;

    /**
     * 获取主键服务生成
     *
     * @return user_id - 主键服务生成
     */
    public String getUserId() {
        return userId;
    }

    /**
     * 设置主键服务生成
     *
     * @param userId 主键服务生成
     */
    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * 获取用户编号
     *
     * @return user_code - 用户编号
     */
    public String getUserCode() {
        return userCode;
    }

    /**
     * 设置用户编号
     *
     * @param userCode 用户编号
     */
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    /**
     * 获取支付密码
     *
     * @return password - 支付密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置支付密码
     *
     * @param password 支付密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取消费限额(超过限额后需要输入支付密码)
     *
     * @return pay_limit - 消费限额(超过限额后需要输入支付密码)
     */
    public Integer getPayLimit() {
        return payLimit;
    }

    /**
     * 设置消费限额(超过限额后需要输入支付密码)
     *
     * @param payLimit 消费限额(超过限额后需要输入支付密码)
     */
    public void setPayLimit(Integer payLimit) {
        this.payLimit = payLimit;
    }

    /**
     * 获取用户姓名
     *
     * @return user_name - 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户姓名
     *
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取手机号
     *
     * @return mobile - 手机号
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机号
     *
     * @param mobile 手机号
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取学/工号
     *
     * @return user_number - 学/工号
     */
    public String getUserNumber() {
        return userNumber;
    }

    /**
     * 设置学/工号
     *
     * @param userNumber 学/工号
     */
    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    /**
     * 获取证件号码
     *
     * @return id_card - 证件号码
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置证件号码
     *
     * @param idCard 证件号码
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取生日
     *
     * @return birthday - 生日
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置生日
     *
     * @param birthday 生日
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取性别(0:未知1:男2:女)
     *
     * @return sex - 性别(0:未知1:男2:女)
     */
    public Byte getSex() {
        return sex;
    }

    /**
     * 设置性别(0:未知1:男2:女)
     *
     * @param sex 性别(0:未知1:男2:女)
     */
    public void setSex(Byte sex) {
        this.sex = sex;
    }

    /**
     * 获取民族(国标码GB3304-91的数字代码)
     *
     * @return ethnic_group - 民族(国标码GB3304-91的数字代码)
     */
    public String getEthnicGroup() {
        return ethnicGroup;
    }

    /**
     * 设置民族(国标码GB3304-91的数字代码)
     *
     * @param ethnicGroup 民族(国标码GB3304-91的数字代码)
     */
    public void setEthnicGroup(String ethnicGroup) {
        this.ethnicGroup = ethnicGroup;
    }

    /**
     * 获取email地址
     *
     * @return email - email地址
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置email地址
     *
     * @param email email地址
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取状态(1:有效 0:无效 -1:删除）
     *
     * @return user_status - 状态(1:有效 0:无效 -1:删除）
     */
    public Byte getUserStatus() {
        return userStatus;
    }

    /**
     * 设置状态(1:有效 0:无效 -1:删除）
     *
     * @param userStatus 状态(1:有效 0:无效 -1:删除）
     */
    public void setUserStatus(Byte userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * 获取人脸紧急联系人手机号
     *
     * @return face_linkman_mobile - 人脸紧急联系人手机号
     */
    public String getFaceLinkmanMobile() {
        return faceLinkmanMobile;
    }

    /**
     * 设置人脸紧急联系人手机号
     *
     * @param faceLinkmanMobile 人脸紧急联系人手机号
     */
    public void setFaceLinkmanMobile(String faceLinkmanMobile) {
        this.faceLinkmanMobile = faceLinkmanMobile;
    }

    /**
     * 获取人脸信息刷新时间
     *
     * @return face_oprate_time - 人脸信息刷新时间
     */
    public Long getFaceOprateTime() {
        return faceOprateTime;
    }

    /**
     * 设置人脸信息刷新时间
     *
     * @param faceOprateTime 人脸信息刷新时间
     */
    public void setFaceOprateTime(Long faceOprateTime) {
        this.faceOprateTime = faceOprateTime;
    }

    /**
     * 获取代扣签约状态(0：未签约1：已签约)
     *
     * @return withhold_status - 代扣签约状态(0：未签约1：已签约)
     */
    public Boolean getWithholdStatus() {
        return withholdStatus;
    }

    /**
     * 设置代扣签约状态(0：未签约1：已签约)
     *
     * @param withholdStatus 代扣签约状态(0：未签约1：已签约)
     */
    public void setWithholdStatus(Boolean withholdStatus) {
        this.withholdStatus = withholdStatus;
    }

    /**
     * 获取代扣签约账号
     *
     * @return withhold_account - 代扣签约账号
     */
    public String getWithholdAccount() {
        return withholdAccount;
    }

    /**
     * 设置代扣签约账号
     *
     * @param withholdAccount 代扣签约账号
     */
    public void setWithholdAccount(String withholdAccount) {
        this.withholdAccount = withholdAccount;
    }

    /**
     * 获取组织机构id
     *
     * @return org_id - 组织机构id
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * 设置组织机构id
     *
     * @param orgId 组织机构id
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取组织机构名称
     *
     * @return org_name - 组织机构名称
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置组织机构名称
     *
     * @param orgName 组织机构名称
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取组织架构编码
     *
     * @return org_code - 组织架构编码
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * 设置组织架构编码
     *
     * @param orgCode 组织架构编码
     */
    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    /**
     * 获取全部组织架构编码
     *
     * @return org_full_code - 全部组织架构编码
     */
    public String getOrgFullCode() {
        return orgFullCode;
    }

    /**
     * 设置全部组织架构编码
     *
     * @param orgFullCode 全部组织架构编码
     */
    public void setOrgFullCode(String orgFullCode) {
        this.orgFullCode = orgFullCode;
    }

    /**
     * 获取会员分类id
     *
     * @return class_id - 会员分类id
     */
    public Integer getClassId() {
        return classId;
    }

    /**
     * 设置会员分类id
     *
     * @param classId 会员分类id
     */
    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    /**
     * 获取饭卡ID
     *
     * @return card_id - 饭卡ID
     */
    public String getCardId() {
        return cardId;
    }

    /**
     * 设置饭卡ID
     *
     * @param cardId 饭卡ID
     */
    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    /**
     * 获取饭卡号
     *
     * @return card_code - 饭卡号
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置饭卡号
     *
     * @param cardCode 饭卡号
     */
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    /**
     * 获取失效日期(永久有效为空)
     *
     * @return expiry - 失效日期(永久有效为空)
     */
    public String getExpiry() {
        return expiry;
    }

    /**
     * 设置失效日期(永久有效为空)
     *
     * @param expiry 失效日期(永久有效为空)
     */
    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    /**
     * 获取是否在有效期内(1:是,0:否)
     *
     * @return unexpired - 是否在有效期内(1:是,0:否)
     */
    public Byte getUnexpired() {
        return unexpired;
    }

    /**
     * 设置是否在有效期内(1:是,0:否)
     *
     * @param unexpired 是否在有效期内(1:是,0:否)
     */
    public void setUnexpired(Byte unexpired) {
        this.unexpired = unexpired;
    }

    /**
     * 获取企业标识
     *
     * @return supplier_id - 企业标识
     */
    public Integer getSupplierId() {
        return supplierId;
    }

    /**
     * 设置企业标识
     *
     * @param supplierId 企业标识
     */
    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * 获取企业编码
     *
     * @return supplier_code - 企业编码
     */
    public Integer getSupplierCode() {
        return supplierCode;
    }

    /**
     * 设置企业编码
     *
     * @param supplierCode 企业编码
     */
    public void setSupplierCode(Integer supplierCode) {
        this.supplierCode = supplierCode;
    }

    /**
     * 获取操作时间
     *
     * @return update_time - 操作时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置操作时间
     *
     * @param updateTime 操作时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取操作人id
     *
     * @return update_user_id - 操作人id
     */
    public Integer getUpdateUserId() {
        return updateUserId;
    }

    /**
     * 设置操作人id
     *
     * @param updateUserId 操作人id
     */
    public void setUpdateUserId(Integer updateUserId) {
        this.updateUserId = updateUserId;
    }

    /**
     * 获取操作人
     *
     * @return update_user_name - 操作人
     */
    public String getUpdateUserName() {
        return updateUserName;
    }

    /**
     * 设置操作人
     *
     * @param updateUserName 操作人
     */
    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    /**
     * 获取创建人
     *
     * @return create_user_name - 创建人
     */
    public String getCreateUserName() {
        return createUserName;
    }

    /**
     * 设置创建人
     *
     * @param createUserName 创建人
     */
    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    /**
     * 获取创建用户id
     *
     * @return create_user_id - 创建用户id
     */
    public Integer getCreateUserId() {
        return createUserId;
    }

    /**
     * 设置创建用户id
     *
     * @param createUserId 创建用户id
     */
    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取商家中心用户ID
     *
     * @return e_user_id - 商家中心用户ID
     */
    public Long geteUserId() {
        return eUserId;
    }

    /**
     * 设置商家中心用户ID
     *
     * @param eUserId 商家中心用户ID
     */
    public void seteUserId(Long eUserId) {
        this.eUserId = eUserId;
    }

    /**
     * 获取身高（cm）
     *
     * @return height - 身高（cm）
     */
    public Double getHeight() {
        return height;
    }

    /**
     * 设置身高（cm）
     *
     * @param height 身高（cm）
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * 获取体重（kg）
     *
     * @return weight - 体重（kg）
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * 设置体重（kg）
     *
     * @param weight 体重（kg）
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * 获取编辑基础信息时间
     *
     * @return edit_basic_time - 编辑基础信息时间
     */
    public Date getEditBasicTime() {
        return editBasicTime;
    }

    /**
     * 设置编辑基础信息时间
     *
     * @param editBasicTime 编辑基础信息时间
     */
    public void setEditBasicTime(Date editBasicTime) {
        this.editBasicTime = editBasicTime;
    }

    /**
     * @return last_update_time
     */
    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime
     */
    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * 获取会员是否长期有效：1是，0否
     *
     * @return long_effective - 会员是否长期有效：1是，0否
     */
    public Byte getLongEffective() {
        return longEffective;
    }

    /**
     * 设置会员是否长期有效：1是，0否
     *
     * @param longEffective 会员是否长期有效：1是，0否
     */
    public void setLongEffective(Byte longEffective) {
        this.longEffective = longEffective;
    }

    /**
     * 获取会员有效期开始时间（长期有效时不启用）
     *
     * @return effective_date - 会员有效期开始时间（长期有效时不启用）
     */
    public Date getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置会员有效期开始时间（长期有效时不启用）
     *
     * @param effectiveDate 会员有效期开始时间（长期有效时不启用）
     */
    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    /**
     * 获取会员有效期结束时间（长期有效时不启用）
     *
     * @return expiry_date - 会员有效期结束时间（长期有效时不启用）
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * 设置会员有效期结束时间（长期有效时不启用）
     *
     * @param expiryDate 会员有效期结束时间（长期有效时不启用）
     */
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    /**
     * 获取签约状态(代扣签约状态(0:未签约1:已签约,2:已解约))
     *
     * @return agreement_status - 签约状态(代扣签约状态(0:未签约1:已签约,2:已解约))
     */
    public Byte getAgreementStatus() {
        return agreementStatus;
    }

    /**
     * 设置签约状态(代扣签约状态(0:未签约1:已签约,2:已解约))
     *
     * @param agreementStatus 签约状态(代扣签约状态(0:未签约1:已签约,2:已解约))
     */
    public void setAgreementStatus(Byte agreementStatus) {
        this.agreementStatus = agreementStatus;
    }

    /**
     * 获取证件类型（1.身份证，2.港澳台通行证，3.外籍护照）
     *
     * @return card_type - 证件类型（1.身份证，2.港澳台通行证，3.外籍护照）
     */
    public Byte getCardType() {
        return cardType;
    }

    /**
     * 设置证件类型（1.身份证，2.港澳台通行证，3.外籍护照）
     *
     * @param cardType 证件类型（1.身份证，2.港澳台通行证，3.外籍护照）
     */
    public void setCardType(Byte cardType) {
        this.cardType = cardType;
    }
}