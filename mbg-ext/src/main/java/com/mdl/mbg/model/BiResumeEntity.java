package com.mdl.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class BiResumeEntity implements Serializable {
    private String id;

    @ApiModelProperty(value = "姓名")
    private String jobSeekerName;

    @ApiModelProperty(value = "教育背景ids 参考constant表")
    private String degree;

    @ApiModelProperty(value = "求职状态  ")
    private String currentState;

    @ApiModelProperty(value = "简历来源方式：190001：主动投递，190002：搜索后存入，190003：从简历管理上传后存入，190004：从人才库上传后存入")
    private String inWay;

    @ApiModelProperty(value = "手机号码")
    private String phone;

    @ApiModelProperty(value = "简历来源 10001：智联，10002:58同城，10003：猎聘，10004：Boss直聘，10005:前程无忧，10006：拉钩")
    private String platId;

    @ApiModelProperty(value = "状态")
    private Integer state;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    @ApiModelProperty(value = "电子邮箱")
    private String email;

    @ApiModelProperty(value = "性别，70001表示男，70002表示女")
    private String sex;

    @ApiModelProperty(value = "生日")
    private String birthday;

    @ApiModelProperty(value = "工作年限最高")
    private Integer workLengthMax;

    @ApiModelProperty(value = "工作年限最低")
    private Integer workLengthMin;

    @ApiModelProperty(value = "工作年限，有的简历可能存的是1-3年，有的可能直接存的3年")
    private String workLength;

    @ApiModelProperty(value = "已婚，未婚")
    private String isMarry;

    @ApiModelProperty(value = "应聘职位  Java工程师")
    private String jobTitle;

    @ApiModelProperty(value = "住址")
    private String resideAddress;

    @ApiModelProperty(value = "期望最高薪资")
    private Integer expectSalaryMax;

    @ApiModelProperty(value = "期望最低薪资")
    private Integer expectSalaryMin;

    @ApiModelProperty(value = "期望工作地点")
    private String expectPlace;

    @ApiModelProperty(value = "期望从事职业")
    private String expectJob;

    @ApiModelProperty(value = "期待行业 互联网/电子商务、计算机软件、其他")
    private String expectIndustry;

    @ApiModelProperty(value = "头像路径")
    private String photoPath;

    @ApiModelProperty(value = "20001全职，20002兼职，20003实习")
    private String expectJobProperty;

    @ApiModelProperty(value = "团员，党员等")
    private String politicalStatus;

    @ApiModelProperty(value = "毕业院校")
    private String university;

    @ApiModelProperty(value = "专业")
    private String major;

    @ApiModelProperty(value = "民族")
    private String nation;

    @ApiModelProperty(value = "籍贯")
    private String bitrhPlace;

    @ApiModelProperty(value = "证件类型")
    private String certificateType;

    @ApiModelProperty(value = "证件号码")
    private String certificateNum;

    @ApiModelProperty(value = "微信号")
    private String wechatNum;

    @ApiModelProperty(value = "健康状况")
    private String health;

    @ApiModelProperty(value = "兴趣爱好")
    private String hobbies;

    @ApiModelProperty(value = "居住状况")
    private String housingStatus;

    @ApiModelProperty(value = "居住所在区")
    private String houseArea;

    @ApiModelProperty(value = "目前住址")
    private String houseAddress;

    @ApiModelProperty(value = "插件获取的html文件")
    private String traceId;

    private Integer deleted;

    @ApiModelProperty(value = "创建时间")
    private Date createDt;

    @ApiModelProperty(value = "最后修改时间")
    private Date modifyDt;

    private String version;

    @ApiModelProperty(value = "排序")
    private Integer sortNo;

    @ApiModelProperty(value = "户口所在地")
    private String domicilePlace;

    @ApiModelProperty(value = "自我评价")
    private String selfEvaluation;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobSeekerName() {
        return jobSeekerName;
    }

    public void setJobSeekerName(String jobSeekerName) {
        this.jobSeekerName = jobSeekerName;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String getInWay() {
        return inWay;
    }

    public void setInWay(String inWay) {
        this.inWay = inWay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPlatId() {
        return platId;
    }

    public void setPlatId(String platId) {
        this.platId = platId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getWorkLengthMax() {
        return workLengthMax;
    }

    public void setWorkLengthMax(Integer workLengthMax) {
        this.workLengthMax = workLengthMax;
    }

    public Integer getWorkLengthMin() {
        return workLengthMin;
    }

    public void setWorkLengthMin(Integer workLengthMin) {
        this.workLengthMin = workLengthMin;
    }

    public String getWorkLength() {
        return workLength;
    }

    public void setWorkLength(String workLength) {
        this.workLength = workLength;
    }

    public String getIsMarry() {
        return isMarry;
    }

    public void setIsMarry(String isMarry) {
        this.isMarry = isMarry;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getResideAddress() {
        return resideAddress;
    }

    public void setResideAddress(String resideAddress) {
        this.resideAddress = resideAddress;
    }

    public Integer getExpectSalaryMax() {
        return expectSalaryMax;
    }

    public void setExpectSalaryMax(Integer expectSalaryMax) {
        this.expectSalaryMax = expectSalaryMax;
    }

    public Integer getExpectSalaryMin() {
        return expectSalaryMin;
    }

    public void setExpectSalaryMin(Integer expectSalaryMin) {
        this.expectSalaryMin = expectSalaryMin;
    }

    public String getExpectPlace() {
        return expectPlace;
    }

    public void setExpectPlace(String expectPlace) {
        this.expectPlace = expectPlace;
    }

    public String getExpectJob() {
        return expectJob;
    }

    public void setExpectJob(String expectJob) {
        this.expectJob = expectJob;
    }

    public String getExpectIndustry() {
        return expectIndustry;
    }

    public void setExpectIndustry(String expectIndustry) {
        this.expectIndustry = expectIndustry;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getExpectJobProperty() {
        return expectJobProperty;
    }

    public void setExpectJobProperty(String expectJobProperty) {
        this.expectJobProperty = expectJobProperty;
    }

    public String getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(String politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getBitrhPlace() {
        return bitrhPlace;
    }

    public void setBitrhPlace(String bitrhPlace) {
        this.bitrhPlace = bitrhPlace;
    }

    public String getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(String certificateType) {
        this.certificateType = certificateType;
    }

    public String getCertificateNum() {
        return certificateNum;
    }

    public void setCertificateNum(String certificateNum) {
        this.certificateNum = certificateNum;
    }

    public String getWechatNum() {
        return wechatNum;
    }

    public void setWechatNum(String wechatNum) {
        this.wechatNum = wechatNum;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getHousingStatus() {
        return housingStatus;
    }

    public void setHousingStatus(String housingStatus) {
        this.housingStatus = housingStatus;
    }

    public String getHouseArea() {
        return houseArea;
    }

    public void setHouseArea(String houseArea) {
        this.houseArea = houseArea;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getModifyDt() {
        return modifyDt;
    }

    public void setModifyDt(Date modifyDt) {
        this.modifyDt = modifyDt;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public String getDomicilePlace() {
        return domicilePlace;
    }

    public void setDomicilePlace(String domicilePlace) {
        this.domicilePlace = domicilePlace;
    }

    public String getSelfEvaluation() {
        return selfEvaluation;
    }

    public void setSelfEvaluation(String selfEvaluation) {
        this.selfEvaluation = selfEvaluation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", jobSeekerName=").append(jobSeekerName);
        sb.append(", degree=").append(degree);
        sb.append(", currentState=").append(currentState);
        sb.append(", inWay=").append(inWay);
        sb.append(", phone=").append(phone);
        sb.append(", platId=").append(platId);
        sb.append(", state=").append(state);
        sb.append(", age=").append(age);
        sb.append(", email=").append(email);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", workLengthMax=").append(workLengthMax);
        sb.append(", workLengthMin=").append(workLengthMin);
        sb.append(", workLength=").append(workLength);
        sb.append(", isMarry=").append(isMarry);
        sb.append(", jobTitle=").append(jobTitle);
        sb.append(", resideAddress=").append(resideAddress);
        sb.append(", expectSalaryMax=").append(expectSalaryMax);
        sb.append(", expectSalaryMin=").append(expectSalaryMin);
        sb.append(", expectPlace=").append(expectPlace);
        sb.append(", expectJob=").append(expectJob);
        sb.append(", expectIndustry=").append(expectIndustry);
        sb.append(", photoPath=").append(photoPath);
        sb.append(", expectJobProperty=").append(expectJobProperty);
        sb.append(", politicalStatus=").append(politicalStatus);
        sb.append(", university=").append(university);
        sb.append(", major=").append(major);
        sb.append(", nation=").append(nation);
        sb.append(", bitrhPlace=").append(bitrhPlace);
        sb.append(", certificateType=").append(certificateType);
        sb.append(", certificateNum=").append(certificateNum);
        sb.append(", wechatNum=").append(wechatNum);
        sb.append(", health=").append(health);
        sb.append(", hobbies=").append(hobbies);
        sb.append(", housingStatus=").append(housingStatus);
        sb.append(", houseArea=").append(houseArea);
        sb.append(", houseAddress=").append(houseAddress);
        sb.append(", traceId=").append(traceId);
        sb.append(", deleted=").append(deleted);
        sb.append(", createDt=").append(createDt);
        sb.append(", modifyDt=").append(modifyDt);
        sb.append(", version=").append(version);
        sb.append(", sortNo=").append(sortNo);
        sb.append(", domicilePlace=").append(domicilePlace);
        sb.append(", selfEvaluation=").append(selfEvaluation);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}