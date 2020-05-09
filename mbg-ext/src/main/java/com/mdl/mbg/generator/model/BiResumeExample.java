package com.mdl.mbg.generator.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BiResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BiResumeExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameIsNull() {
            addCriterion("job_seeker_name is null");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameIsNotNull() {
            addCriterion("job_seeker_name is not null");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameEqualTo(String value) {
            addCriterion("job_seeker_name =", value, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameNotEqualTo(String value) {
            addCriterion("job_seeker_name <>", value, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameGreaterThan(String value) {
            addCriterion("job_seeker_name >", value, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameGreaterThanOrEqualTo(String value) {
            addCriterion("job_seeker_name >=", value, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameLessThan(String value) {
            addCriterion("job_seeker_name <", value, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameLessThanOrEqualTo(String value) {
            addCriterion("job_seeker_name <=", value, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameLike(String value) {
            addCriterion("job_seeker_name like", value, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameNotLike(String value) {
            addCriterion("job_seeker_name not like", value, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameIn(List<String> values) {
            addCriterion("job_seeker_name in", values, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameNotIn(List<String> values) {
            addCriterion("job_seeker_name not in", values, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameBetween(String value1, String value2) {
            addCriterion("job_seeker_name between", value1, value2, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andJobSeekerNameNotBetween(String value1, String value2) {
            addCriterion("job_seeker_name not between", value1, value2, "jobSeekerName");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNull() {
            addCriterion("degree is null");
            return (Criteria) this;
        }

        public Criteria andDegreeIsNotNull() {
            addCriterion("degree is not null");
            return (Criteria) this;
        }

        public Criteria andDegreeEqualTo(String value) {
            addCriterion("degree =", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotEqualTo(String value) {
            addCriterion("degree <>", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThan(String value) {
            addCriterion("degree >", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("degree >=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThan(String value) {
            addCriterion("degree <", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLessThanOrEqualTo(String value) {
            addCriterion("degree <=", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeLike(String value) {
            addCriterion("degree like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotLike(String value) {
            addCriterion("degree not like", value, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeIn(List<String> values) {
            addCriterion("degree in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotIn(List<String> values) {
            addCriterion("degree not in", values, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeBetween(String value1, String value2) {
            addCriterion("degree between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andDegreeNotBetween(String value1, String value2) {
            addCriterion("degree not between", value1, value2, "degree");
            return (Criteria) this;
        }

        public Criteria andCurrentStateIsNull() {
            addCriterion("current_state is null");
            return (Criteria) this;
        }

        public Criteria andCurrentStateIsNotNull() {
            addCriterion("current_state is not null");
            return (Criteria) this;
        }

        public Criteria andCurrentStateEqualTo(String value) {
            addCriterion("current_state =", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotEqualTo(String value) {
            addCriterion("current_state <>", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThan(String value) {
            addCriterion("current_state >", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateGreaterThanOrEqualTo(String value) {
            addCriterion("current_state >=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThan(String value) {
            addCriterion("current_state <", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLessThanOrEqualTo(String value) {
            addCriterion("current_state <=", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateLike(String value) {
            addCriterion("current_state like", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotLike(String value) {
            addCriterion("current_state not like", value, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateIn(List<String> values) {
            addCriterion("current_state in", values, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotIn(List<String> values) {
            addCriterion("current_state not in", values, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateBetween(String value1, String value2) {
            addCriterion("current_state between", value1, value2, "currentState");
            return (Criteria) this;
        }

        public Criteria andCurrentStateNotBetween(String value1, String value2) {
            addCriterion("current_state not between", value1, value2, "currentState");
            return (Criteria) this;
        }

        public Criteria andInWayIsNull() {
            addCriterion("in_way is null");
            return (Criteria) this;
        }

        public Criteria andInWayIsNotNull() {
            addCriterion("in_way is not null");
            return (Criteria) this;
        }

        public Criteria andInWayEqualTo(String value) {
            addCriterion("in_way =", value, "inWay");
            return (Criteria) this;
        }

        public Criteria andInWayNotEqualTo(String value) {
            addCriterion("in_way <>", value, "inWay");
            return (Criteria) this;
        }

        public Criteria andInWayGreaterThan(String value) {
            addCriterion("in_way >", value, "inWay");
            return (Criteria) this;
        }

        public Criteria andInWayGreaterThanOrEqualTo(String value) {
            addCriterion("in_way >=", value, "inWay");
            return (Criteria) this;
        }

        public Criteria andInWayLessThan(String value) {
            addCriterion("in_way <", value, "inWay");
            return (Criteria) this;
        }

        public Criteria andInWayLessThanOrEqualTo(String value) {
            addCriterion("in_way <=", value, "inWay");
            return (Criteria) this;
        }

        public Criteria andInWayLike(String value) {
            addCriterion("in_way like", value, "inWay");
            return (Criteria) this;
        }

        public Criteria andInWayNotLike(String value) {
            addCriterion("in_way not like", value, "inWay");
            return (Criteria) this;
        }

        public Criteria andInWayIn(List<String> values) {
            addCriterion("in_way in", values, "inWay");
            return (Criteria) this;
        }

        public Criteria andInWayNotIn(List<String> values) {
            addCriterion("in_way not in", values, "inWay");
            return (Criteria) this;
        }

        public Criteria andInWayBetween(String value1, String value2) {
            addCriterion("in_way between", value1, value2, "inWay");
            return (Criteria) this;
        }

        public Criteria andInWayNotBetween(String value1, String value2) {
            addCriterion("in_way not between", value1, value2, "inWay");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPlatIdIsNull() {
            addCriterion("plat_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatIdIsNotNull() {
            addCriterion("plat_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatIdEqualTo(String value) {
            addCriterion("plat_id =", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotEqualTo(String value) {
            addCriterion("plat_id <>", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdGreaterThan(String value) {
            addCriterion("plat_id >", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdGreaterThanOrEqualTo(String value) {
            addCriterion("plat_id >=", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdLessThan(String value) {
            addCriterion("plat_id <", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdLessThanOrEqualTo(String value) {
            addCriterion("plat_id <=", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdLike(String value) {
            addCriterion("plat_id like", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotLike(String value) {
            addCriterion("plat_id not like", value, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdIn(List<String> values) {
            addCriterion("plat_id in", values, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotIn(List<String> values) {
            addCriterion("plat_id not in", values, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdBetween(String value1, String value2) {
            addCriterion("plat_id between", value1, value2, "platId");
            return (Criteria) this;
        }

        public Criteria andPlatIdNotBetween(String value1, String value2) {
            addCriterion("plat_id not between", value1, value2, "platId");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("age is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("age is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(Integer value) {
            addCriterion("age =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(Integer value) {
            addCriterion("age <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(Integer value) {
            addCriterion("age >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("age >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(Integer value) {
            addCriterion("age <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(Integer value) {
            addCriterion("age <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<Integer> values) {
            addCriterion("age in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<Integer> values) {
            addCriterion("age not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(Integer value1, Integer value2) {
            addCriterion("age between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("age not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("birthday like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("birthday not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxIsNull() {
            addCriterion("work_length_max is null");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxIsNotNull() {
            addCriterion("work_length_max is not null");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxEqualTo(Integer value) {
            addCriterion("work_length_max =", value, "workLengthMax");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxNotEqualTo(Integer value) {
            addCriterion("work_length_max <>", value, "workLengthMax");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxGreaterThan(Integer value) {
            addCriterion("work_length_max >", value, "workLengthMax");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_length_max >=", value, "workLengthMax");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxLessThan(Integer value) {
            addCriterion("work_length_max <", value, "workLengthMax");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxLessThanOrEqualTo(Integer value) {
            addCriterion("work_length_max <=", value, "workLengthMax");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxIn(List<Integer> values) {
            addCriterion("work_length_max in", values, "workLengthMax");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxNotIn(List<Integer> values) {
            addCriterion("work_length_max not in", values, "workLengthMax");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxBetween(Integer value1, Integer value2) {
            addCriterion("work_length_max between", value1, value2, "workLengthMax");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("work_length_max not between", value1, value2, "workLengthMax");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinIsNull() {
            addCriterion("work_length_min is null");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinIsNotNull() {
            addCriterion("work_length_min is not null");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinEqualTo(Integer value) {
            addCriterion("work_length_min =", value, "workLengthMin");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinNotEqualTo(Integer value) {
            addCriterion("work_length_min <>", value, "workLengthMin");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinGreaterThan(Integer value) {
            addCriterion("work_length_min >", value, "workLengthMin");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_length_min >=", value, "workLengthMin");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinLessThan(Integer value) {
            addCriterion("work_length_min <", value, "workLengthMin");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinLessThanOrEqualTo(Integer value) {
            addCriterion("work_length_min <=", value, "workLengthMin");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinIn(List<Integer> values) {
            addCriterion("work_length_min in", values, "workLengthMin");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinNotIn(List<Integer> values) {
            addCriterion("work_length_min not in", values, "workLengthMin");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinBetween(Integer value1, Integer value2) {
            addCriterion("work_length_min between", value1, value2, "workLengthMin");
            return (Criteria) this;
        }

        public Criteria andWorkLengthMinNotBetween(Integer value1, Integer value2) {
            addCriterion("work_length_min not between", value1, value2, "workLengthMin");
            return (Criteria) this;
        }

        public Criteria andWorkLengthIsNull() {
            addCriterion("work_length is null");
            return (Criteria) this;
        }

        public Criteria andWorkLengthIsNotNull() {
            addCriterion("work_length is not null");
            return (Criteria) this;
        }

        public Criteria andWorkLengthEqualTo(String value) {
            addCriterion("work_length =", value, "workLength");
            return (Criteria) this;
        }

        public Criteria andWorkLengthNotEqualTo(String value) {
            addCriterion("work_length <>", value, "workLength");
            return (Criteria) this;
        }

        public Criteria andWorkLengthGreaterThan(String value) {
            addCriterion("work_length >", value, "workLength");
            return (Criteria) this;
        }

        public Criteria andWorkLengthGreaterThanOrEqualTo(String value) {
            addCriterion("work_length >=", value, "workLength");
            return (Criteria) this;
        }

        public Criteria andWorkLengthLessThan(String value) {
            addCriterion("work_length <", value, "workLength");
            return (Criteria) this;
        }

        public Criteria andWorkLengthLessThanOrEqualTo(String value) {
            addCriterion("work_length <=", value, "workLength");
            return (Criteria) this;
        }

        public Criteria andWorkLengthLike(String value) {
            addCriterion("work_length like", value, "workLength");
            return (Criteria) this;
        }

        public Criteria andWorkLengthNotLike(String value) {
            addCriterion("work_length not like", value, "workLength");
            return (Criteria) this;
        }

        public Criteria andWorkLengthIn(List<String> values) {
            addCriterion("work_length in", values, "workLength");
            return (Criteria) this;
        }

        public Criteria andWorkLengthNotIn(List<String> values) {
            addCriterion("work_length not in", values, "workLength");
            return (Criteria) this;
        }

        public Criteria andWorkLengthBetween(String value1, String value2) {
            addCriterion("work_length between", value1, value2, "workLength");
            return (Criteria) this;
        }

        public Criteria andWorkLengthNotBetween(String value1, String value2) {
            addCriterion("work_length not between", value1, value2, "workLength");
            return (Criteria) this;
        }

        public Criteria andIsMarryIsNull() {
            addCriterion("is_marry is null");
            return (Criteria) this;
        }

        public Criteria andIsMarryIsNotNull() {
            addCriterion("is_marry is not null");
            return (Criteria) this;
        }

        public Criteria andIsMarryEqualTo(String value) {
            addCriterion("is_marry =", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotEqualTo(String value) {
            addCriterion("is_marry <>", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryGreaterThan(String value) {
            addCriterion("is_marry >", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryGreaterThanOrEqualTo(String value) {
            addCriterion("is_marry >=", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryLessThan(String value) {
            addCriterion("is_marry <", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryLessThanOrEqualTo(String value) {
            addCriterion("is_marry <=", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryLike(String value) {
            addCriterion("is_marry like", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotLike(String value) {
            addCriterion("is_marry not like", value, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryIn(List<String> values) {
            addCriterion("is_marry in", values, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotIn(List<String> values) {
            addCriterion("is_marry not in", values, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryBetween(String value1, String value2) {
            addCriterion("is_marry between", value1, value2, "isMarry");
            return (Criteria) this;
        }

        public Criteria andIsMarryNotBetween(String value1, String value2) {
            addCriterion("is_marry not between", value1, value2, "isMarry");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNull() {
            addCriterion("job_title is null");
            return (Criteria) this;
        }

        public Criteria andJobTitleIsNotNull() {
            addCriterion("job_title is not null");
            return (Criteria) this;
        }

        public Criteria andJobTitleEqualTo(String value) {
            addCriterion("job_title =", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotEqualTo(String value) {
            addCriterion("job_title <>", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThan(String value) {
            addCriterion("job_title >", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleGreaterThanOrEqualTo(String value) {
            addCriterion("job_title >=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThan(String value) {
            addCriterion("job_title <", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLessThanOrEqualTo(String value) {
            addCriterion("job_title <=", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleLike(String value) {
            addCriterion("job_title like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotLike(String value) {
            addCriterion("job_title not like", value, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleIn(List<String> values) {
            addCriterion("job_title in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotIn(List<String> values) {
            addCriterion("job_title not in", values, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleBetween(String value1, String value2) {
            addCriterion("job_title between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andJobTitleNotBetween(String value1, String value2) {
            addCriterion("job_title not between", value1, value2, "jobTitle");
            return (Criteria) this;
        }

        public Criteria andResideAddressIsNull() {
            addCriterion("reside_address is null");
            return (Criteria) this;
        }

        public Criteria andResideAddressIsNotNull() {
            addCriterion("reside_address is not null");
            return (Criteria) this;
        }

        public Criteria andResideAddressEqualTo(String value) {
            addCriterion("reside_address =", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressNotEqualTo(String value) {
            addCriterion("reside_address <>", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressGreaterThan(String value) {
            addCriterion("reside_address >", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressGreaterThanOrEqualTo(String value) {
            addCriterion("reside_address >=", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressLessThan(String value) {
            addCriterion("reside_address <", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressLessThanOrEqualTo(String value) {
            addCriterion("reside_address <=", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressLike(String value) {
            addCriterion("reside_address like", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressNotLike(String value) {
            addCriterion("reside_address not like", value, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressIn(List<String> values) {
            addCriterion("reside_address in", values, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressNotIn(List<String> values) {
            addCriterion("reside_address not in", values, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressBetween(String value1, String value2) {
            addCriterion("reside_address between", value1, value2, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andResideAddressNotBetween(String value1, String value2) {
            addCriterion("reside_address not between", value1, value2, "resideAddress");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxIsNull() {
            addCriterion("expect_salary_max is null");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxIsNotNull() {
            addCriterion("expect_salary_max is not null");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxEqualTo(Integer value) {
            addCriterion("expect_salary_max =", value, "expectSalaryMax");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxNotEqualTo(Integer value) {
            addCriterion("expect_salary_max <>", value, "expectSalaryMax");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxGreaterThan(Integer value) {
            addCriterion("expect_salary_max >", value, "expectSalaryMax");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("expect_salary_max >=", value, "expectSalaryMax");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxLessThan(Integer value) {
            addCriterion("expect_salary_max <", value, "expectSalaryMax");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxLessThanOrEqualTo(Integer value) {
            addCriterion("expect_salary_max <=", value, "expectSalaryMax");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxIn(List<Integer> values) {
            addCriterion("expect_salary_max in", values, "expectSalaryMax");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxNotIn(List<Integer> values) {
            addCriterion("expect_salary_max not in", values, "expectSalaryMax");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxBetween(Integer value1, Integer value2) {
            addCriterion("expect_salary_max between", value1, value2, "expectSalaryMax");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("expect_salary_max not between", value1, value2, "expectSalaryMax");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinIsNull() {
            addCriterion("expect_salary_min is null");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinIsNotNull() {
            addCriterion("expect_salary_min is not null");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinEqualTo(Integer value) {
            addCriterion("expect_salary_min =", value, "expectSalaryMin");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinNotEqualTo(Integer value) {
            addCriterion("expect_salary_min <>", value, "expectSalaryMin");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinGreaterThan(Integer value) {
            addCriterion("expect_salary_min >", value, "expectSalaryMin");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("expect_salary_min >=", value, "expectSalaryMin");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinLessThan(Integer value) {
            addCriterion("expect_salary_min <", value, "expectSalaryMin");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinLessThanOrEqualTo(Integer value) {
            addCriterion("expect_salary_min <=", value, "expectSalaryMin");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinIn(List<Integer> values) {
            addCriterion("expect_salary_min in", values, "expectSalaryMin");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinNotIn(List<Integer> values) {
            addCriterion("expect_salary_min not in", values, "expectSalaryMin");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinBetween(Integer value1, Integer value2) {
            addCriterion("expect_salary_min between", value1, value2, "expectSalaryMin");
            return (Criteria) this;
        }

        public Criteria andExpectSalaryMinNotBetween(Integer value1, Integer value2) {
            addCriterion("expect_salary_min not between", value1, value2, "expectSalaryMin");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceIsNull() {
            addCriterion("expect_place is null");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceIsNotNull() {
            addCriterion("expect_place is not null");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceEqualTo(String value) {
            addCriterion("expect_place =", value, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceNotEqualTo(String value) {
            addCriterion("expect_place <>", value, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceGreaterThan(String value) {
            addCriterion("expect_place >", value, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("expect_place >=", value, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceLessThan(String value) {
            addCriterion("expect_place <", value, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceLessThanOrEqualTo(String value) {
            addCriterion("expect_place <=", value, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceLike(String value) {
            addCriterion("expect_place like", value, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceNotLike(String value) {
            addCriterion("expect_place not like", value, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceIn(List<String> values) {
            addCriterion("expect_place in", values, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceNotIn(List<String> values) {
            addCriterion("expect_place not in", values, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceBetween(String value1, String value2) {
            addCriterion("expect_place between", value1, value2, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectPlaceNotBetween(String value1, String value2) {
            addCriterion("expect_place not between", value1, value2, "expectPlace");
            return (Criteria) this;
        }

        public Criteria andExpectJobIsNull() {
            addCriterion("expect_job is null");
            return (Criteria) this;
        }

        public Criteria andExpectJobIsNotNull() {
            addCriterion("expect_job is not null");
            return (Criteria) this;
        }

        public Criteria andExpectJobEqualTo(String value) {
            addCriterion("expect_job =", value, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectJobNotEqualTo(String value) {
            addCriterion("expect_job <>", value, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectJobGreaterThan(String value) {
            addCriterion("expect_job >", value, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectJobGreaterThanOrEqualTo(String value) {
            addCriterion("expect_job >=", value, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectJobLessThan(String value) {
            addCriterion("expect_job <", value, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectJobLessThanOrEqualTo(String value) {
            addCriterion("expect_job <=", value, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectJobLike(String value) {
            addCriterion("expect_job like", value, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectJobNotLike(String value) {
            addCriterion("expect_job not like", value, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectJobIn(List<String> values) {
            addCriterion("expect_job in", values, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectJobNotIn(List<String> values) {
            addCriterion("expect_job not in", values, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectJobBetween(String value1, String value2) {
            addCriterion("expect_job between", value1, value2, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectJobNotBetween(String value1, String value2) {
            addCriterion("expect_job not between", value1, value2, "expectJob");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryIsNull() {
            addCriterion("expect_industry is null");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryIsNotNull() {
            addCriterion("expect_industry is not null");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryEqualTo(String value) {
            addCriterion("expect_industry =", value, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryNotEqualTo(String value) {
            addCriterion("expect_industry <>", value, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryGreaterThan(String value) {
            addCriterion("expect_industry >", value, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryGreaterThanOrEqualTo(String value) {
            addCriterion("expect_industry >=", value, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryLessThan(String value) {
            addCriterion("expect_industry <", value, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryLessThanOrEqualTo(String value) {
            addCriterion("expect_industry <=", value, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryLike(String value) {
            addCriterion("expect_industry like", value, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryNotLike(String value) {
            addCriterion("expect_industry not like", value, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryIn(List<String> values) {
            addCriterion("expect_industry in", values, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryNotIn(List<String> values) {
            addCriterion("expect_industry not in", values, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryBetween(String value1, String value2) {
            addCriterion("expect_industry between", value1, value2, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andExpectIndustryNotBetween(String value1, String value2) {
            addCriterion("expect_industry not between", value1, value2, "expectIndustry");
            return (Criteria) this;
        }

        public Criteria andPhotoPathIsNull() {
            addCriterion("photo_path is null");
            return (Criteria) this;
        }

        public Criteria andPhotoPathIsNotNull() {
            addCriterion("photo_path is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoPathEqualTo(String value) {
            addCriterion("photo_path =", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathNotEqualTo(String value) {
            addCriterion("photo_path <>", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathGreaterThan(String value) {
            addCriterion("photo_path >", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathGreaterThanOrEqualTo(String value) {
            addCriterion("photo_path >=", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathLessThan(String value) {
            addCriterion("photo_path <", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathLessThanOrEqualTo(String value) {
            addCriterion("photo_path <=", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathLike(String value) {
            addCriterion("photo_path like", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathNotLike(String value) {
            addCriterion("photo_path not like", value, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathIn(List<String> values) {
            addCriterion("photo_path in", values, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathNotIn(List<String> values) {
            addCriterion("photo_path not in", values, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathBetween(String value1, String value2) {
            addCriterion("photo_path between", value1, value2, "photoPath");
            return (Criteria) this;
        }

        public Criteria andPhotoPathNotBetween(String value1, String value2) {
            addCriterion("photo_path not between", value1, value2, "photoPath");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyIsNull() {
            addCriterion("expect_job_property is null");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyIsNotNull() {
            addCriterion("expect_job_property is not null");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyEqualTo(String value) {
            addCriterion("expect_job_property =", value, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyNotEqualTo(String value) {
            addCriterion("expect_job_property <>", value, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyGreaterThan(String value) {
            addCriterion("expect_job_property >", value, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyGreaterThanOrEqualTo(String value) {
            addCriterion("expect_job_property >=", value, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyLessThan(String value) {
            addCriterion("expect_job_property <", value, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyLessThanOrEqualTo(String value) {
            addCriterion("expect_job_property <=", value, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyLike(String value) {
            addCriterion("expect_job_property like", value, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyNotLike(String value) {
            addCriterion("expect_job_property not like", value, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyIn(List<String> values) {
            addCriterion("expect_job_property in", values, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyNotIn(List<String> values) {
            addCriterion("expect_job_property not in", values, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyBetween(String value1, String value2) {
            addCriterion("expect_job_property between", value1, value2, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andExpectJobPropertyNotBetween(String value1, String value2) {
            addCriterion("expect_job_property not between", value1, value2, "expectJobProperty");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNull() {
            addCriterion("political_status is null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIsNotNull() {
            addCriterion("political_status is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusEqualTo(String value) {
            addCriterion("political_status =", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotEqualTo(String value) {
            addCriterion("political_status <>", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThan(String value) {
            addCriterion("political_status >", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("political_status >=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThan(String value) {
            addCriterion("political_status <", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLessThanOrEqualTo(String value) {
            addCriterion("political_status <=", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusLike(String value) {
            addCriterion("political_status like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotLike(String value) {
            addCriterion("political_status not like", value, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusIn(List<String> values) {
            addCriterion("political_status in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotIn(List<String> values) {
            addCriterion("political_status not in", values, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusBetween(String value1, String value2) {
            addCriterion("political_status between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticalStatusNotBetween(String value1, String value2) {
            addCriterion("political_status not between", value1, value2, "politicalStatus");
            return (Criteria) this;
        }

        public Criteria andUniversityIsNull() {
            addCriterion("university is null");
            return (Criteria) this;
        }

        public Criteria andUniversityIsNotNull() {
            addCriterion("university is not null");
            return (Criteria) this;
        }

        public Criteria andUniversityEqualTo(String value) {
            addCriterion("university =", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotEqualTo(String value) {
            addCriterion("university <>", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityGreaterThan(String value) {
            addCriterion("university >", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityGreaterThanOrEqualTo(String value) {
            addCriterion("university >=", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityLessThan(String value) {
            addCriterion("university <", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityLessThanOrEqualTo(String value) {
            addCriterion("university <=", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityLike(String value) {
            addCriterion("university like", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotLike(String value) {
            addCriterion("university not like", value, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityIn(List<String> values) {
            addCriterion("university in", values, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotIn(List<String> values) {
            addCriterion("university not in", values, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityBetween(String value1, String value2) {
            addCriterion("university between", value1, value2, "university");
            return (Criteria) this;
        }

        public Criteria andUniversityNotBetween(String value1, String value2) {
            addCriterion("university not between", value1, value2, "university");
            return (Criteria) this;
        }

        public Criteria andMajorIsNull() {
            addCriterion("major is null");
            return (Criteria) this;
        }

        public Criteria andMajorIsNotNull() {
            addCriterion("major is not null");
            return (Criteria) this;
        }

        public Criteria andMajorEqualTo(String value) {
            addCriterion("major =", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotEqualTo(String value) {
            addCriterion("major <>", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThan(String value) {
            addCriterion("major >", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorGreaterThanOrEqualTo(String value) {
            addCriterion("major >=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThan(String value) {
            addCriterion("major <", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLessThanOrEqualTo(String value) {
            addCriterion("major <=", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorLike(String value) {
            addCriterion("major like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotLike(String value) {
            addCriterion("major not like", value, "major");
            return (Criteria) this;
        }

        public Criteria andMajorIn(List<String> values) {
            addCriterion("major in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotIn(List<String> values) {
            addCriterion("major not in", values, "major");
            return (Criteria) this;
        }

        public Criteria andMajorBetween(String value1, String value2) {
            addCriterion("major between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andMajorNotBetween(String value1, String value2) {
            addCriterion("major not between", value1, value2, "major");
            return (Criteria) this;
        }

        public Criteria andNationIsNull() {
            addCriterion("nation is null");
            return (Criteria) this;
        }

        public Criteria andNationIsNotNull() {
            addCriterion("nation is not null");
            return (Criteria) this;
        }

        public Criteria andNationEqualTo(String value) {
            addCriterion("nation =", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotEqualTo(String value) {
            addCriterion("nation <>", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThan(String value) {
            addCriterion("nation >", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationGreaterThanOrEqualTo(String value) {
            addCriterion("nation >=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThan(String value) {
            addCriterion("nation <", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLessThanOrEqualTo(String value) {
            addCriterion("nation <=", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationLike(String value) {
            addCriterion("nation like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotLike(String value) {
            addCriterion("nation not like", value, "nation");
            return (Criteria) this;
        }

        public Criteria andNationIn(List<String> values) {
            addCriterion("nation in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotIn(List<String> values) {
            addCriterion("nation not in", values, "nation");
            return (Criteria) this;
        }

        public Criteria andNationBetween(String value1, String value2) {
            addCriterion("nation between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andNationNotBetween(String value1, String value2) {
            addCriterion("nation not between", value1, value2, "nation");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceIsNull() {
            addCriterion("bitrh_place is null");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceIsNotNull() {
            addCriterion("bitrh_place is not null");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceEqualTo(String value) {
            addCriterion("bitrh_place =", value, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceNotEqualTo(String value) {
            addCriterion("bitrh_place <>", value, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceGreaterThan(String value) {
            addCriterion("bitrh_place >", value, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("bitrh_place >=", value, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceLessThan(String value) {
            addCriterion("bitrh_place <", value, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceLessThanOrEqualTo(String value) {
            addCriterion("bitrh_place <=", value, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceLike(String value) {
            addCriterion("bitrh_place like", value, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceNotLike(String value) {
            addCriterion("bitrh_place not like", value, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceIn(List<String> values) {
            addCriterion("bitrh_place in", values, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceNotIn(List<String> values) {
            addCriterion("bitrh_place not in", values, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceBetween(String value1, String value2) {
            addCriterion("bitrh_place between", value1, value2, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andBitrhPlaceNotBetween(String value1, String value2) {
            addCriterion("bitrh_place not between", value1, value2, "bitrhPlace");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNull() {
            addCriterion("certificate_type is null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIsNotNull() {
            addCriterion("certificate_type is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeEqualTo(String value) {
            addCriterion("certificate_type =", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotEqualTo(String value) {
            addCriterion("certificate_type <>", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThan(String value) {
            addCriterion("certificate_type >", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_type >=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThan(String value) {
            addCriterion("certificate_type <", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLessThanOrEqualTo(String value) {
            addCriterion("certificate_type <=", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeLike(String value) {
            addCriterion("certificate_type like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotLike(String value) {
            addCriterion("certificate_type not like", value, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeIn(List<String> values) {
            addCriterion("certificate_type in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotIn(List<String> values) {
            addCriterion("certificate_type not in", values, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeBetween(String value1, String value2) {
            addCriterion("certificate_type between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateTypeNotBetween(String value1, String value2) {
            addCriterion("certificate_type not between", value1, value2, "certificateType");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIsNull() {
            addCriterion("certificate_num is null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIsNotNull() {
            addCriterion("certificate_num is not null");
            return (Criteria) this;
        }

        public Criteria andCertificateNumEqualTo(String value) {
            addCriterion("certificate_num =", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotEqualTo(String value) {
            addCriterion("certificate_num <>", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumGreaterThan(String value) {
            addCriterion("certificate_num >", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumGreaterThanOrEqualTo(String value) {
            addCriterion("certificate_num >=", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLessThan(String value) {
            addCriterion("certificate_num <", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLessThanOrEqualTo(String value) {
            addCriterion("certificate_num <=", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumLike(String value) {
            addCriterion("certificate_num like", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotLike(String value) {
            addCriterion("certificate_num not like", value, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumIn(List<String> values) {
            addCriterion("certificate_num in", values, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotIn(List<String> values) {
            addCriterion("certificate_num not in", values, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumBetween(String value1, String value2) {
            addCriterion("certificate_num between", value1, value2, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andCertificateNumNotBetween(String value1, String value2) {
            addCriterion("certificate_num not between", value1, value2, "certificateNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumIsNull() {
            addCriterion("wechat_num is null");
            return (Criteria) this;
        }

        public Criteria andWechatNumIsNotNull() {
            addCriterion("wechat_num is not null");
            return (Criteria) this;
        }

        public Criteria andWechatNumEqualTo(String value) {
            addCriterion("wechat_num =", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumNotEqualTo(String value) {
            addCriterion("wechat_num <>", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumGreaterThan(String value) {
            addCriterion("wechat_num >", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_num >=", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumLessThan(String value) {
            addCriterion("wechat_num <", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumLessThanOrEqualTo(String value) {
            addCriterion("wechat_num <=", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumLike(String value) {
            addCriterion("wechat_num like", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumNotLike(String value) {
            addCriterion("wechat_num not like", value, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumIn(List<String> values) {
            addCriterion("wechat_num in", values, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumNotIn(List<String> values) {
            addCriterion("wechat_num not in", values, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumBetween(String value1, String value2) {
            addCriterion("wechat_num between", value1, value2, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andWechatNumNotBetween(String value1, String value2) {
            addCriterion("wechat_num not between", value1, value2, "wechatNum");
            return (Criteria) this;
        }

        public Criteria andHealthIsNull() {
            addCriterion("health is null");
            return (Criteria) this;
        }

        public Criteria andHealthIsNotNull() {
            addCriterion("health is not null");
            return (Criteria) this;
        }

        public Criteria andHealthEqualTo(String value) {
            addCriterion("health =", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotEqualTo(String value) {
            addCriterion("health <>", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThan(String value) {
            addCriterion("health >", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthGreaterThanOrEqualTo(String value) {
            addCriterion("health >=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThan(String value) {
            addCriterion("health <", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLessThanOrEqualTo(String value) {
            addCriterion("health <=", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthLike(String value) {
            addCriterion("health like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotLike(String value) {
            addCriterion("health not like", value, "health");
            return (Criteria) this;
        }

        public Criteria andHealthIn(List<String> values) {
            addCriterion("health in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotIn(List<String> values) {
            addCriterion("health not in", values, "health");
            return (Criteria) this;
        }

        public Criteria andHealthBetween(String value1, String value2) {
            addCriterion("health between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHealthNotBetween(String value1, String value2) {
            addCriterion("health not between", value1, value2, "health");
            return (Criteria) this;
        }

        public Criteria andHobbiesIsNull() {
            addCriterion("hobbies is null");
            return (Criteria) this;
        }

        public Criteria andHobbiesIsNotNull() {
            addCriterion("hobbies is not null");
            return (Criteria) this;
        }

        public Criteria andHobbiesEqualTo(String value) {
            addCriterion("hobbies =", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesNotEqualTo(String value) {
            addCriterion("hobbies <>", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesGreaterThan(String value) {
            addCriterion("hobbies >", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesGreaterThanOrEqualTo(String value) {
            addCriterion("hobbies >=", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesLessThan(String value) {
            addCriterion("hobbies <", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesLessThanOrEqualTo(String value) {
            addCriterion("hobbies <=", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesLike(String value) {
            addCriterion("hobbies like", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesNotLike(String value) {
            addCriterion("hobbies not like", value, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesIn(List<String> values) {
            addCriterion("hobbies in", values, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesNotIn(List<String> values) {
            addCriterion("hobbies not in", values, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesBetween(String value1, String value2) {
            addCriterion("hobbies between", value1, value2, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHobbiesNotBetween(String value1, String value2) {
            addCriterion("hobbies not between", value1, value2, "hobbies");
            return (Criteria) this;
        }

        public Criteria andHousingStatusIsNull() {
            addCriterion("housing_status is null");
            return (Criteria) this;
        }

        public Criteria andHousingStatusIsNotNull() {
            addCriterion("housing_status is not null");
            return (Criteria) this;
        }

        public Criteria andHousingStatusEqualTo(String value) {
            addCriterion("housing_status =", value, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHousingStatusNotEqualTo(String value) {
            addCriterion("housing_status <>", value, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHousingStatusGreaterThan(String value) {
            addCriterion("housing_status >", value, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHousingStatusGreaterThanOrEqualTo(String value) {
            addCriterion("housing_status >=", value, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHousingStatusLessThan(String value) {
            addCriterion("housing_status <", value, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHousingStatusLessThanOrEqualTo(String value) {
            addCriterion("housing_status <=", value, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHousingStatusLike(String value) {
            addCriterion("housing_status like", value, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHousingStatusNotLike(String value) {
            addCriterion("housing_status not like", value, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHousingStatusIn(List<String> values) {
            addCriterion("housing_status in", values, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHousingStatusNotIn(List<String> values) {
            addCriterion("housing_status not in", values, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHousingStatusBetween(String value1, String value2) {
            addCriterion("housing_status between", value1, value2, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHousingStatusNotBetween(String value1, String value2) {
            addCriterion("housing_status not between", value1, value2, "housingStatus");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNull() {
            addCriterion("house_area is null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIsNotNull() {
            addCriterion("house_area is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAreaEqualTo(String value) {
            addCriterion("house_area =", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotEqualTo(String value) {
            addCriterion("house_area <>", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThan(String value) {
            addCriterion("house_area >", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaGreaterThanOrEqualTo(String value) {
            addCriterion("house_area >=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThan(String value) {
            addCriterion("house_area <", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLessThanOrEqualTo(String value) {
            addCriterion("house_area <=", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaLike(String value) {
            addCriterion("house_area like", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotLike(String value) {
            addCriterion("house_area not like", value, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaIn(List<String> values) {
            addCriterion("house_area in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotIn(List<String> values) {
            addCriterion("house_area not in", values, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaBetween(String value1, String value2) {
            addCriterion("house_area between", value1, value2, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAreaNotBetween(String value1, String value2) {
            addCriterion("house_area not between", value1, value2, "houseArea");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNull() {
            addCriterion("house_address is null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIsNotNull() {
            addCriterion("house_address is not null");
            return (Criteria) this;
        }

        public Criteria andHouseAddressEqualTo(String value) {
            addCriterion("house_address =", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotEqualTo(String value) {
            addCriterion("house_address <>", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThan(String value) {
            addCriterion("house_address >", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressGreaterThanOrEqualTo(String value) {
            addCriterion("house_address >=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThan(String value) {
            addCriterion("house_address <", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLessThanOrEqualTo(String value) {
            addCriterion("house_address <=", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressLike(String value) {
            addCriterion("house_address like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotLike(String value) {
            addCriterion("house_address not like", value, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressIn(List<String> values) {
            addCriterion("house_address in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotIn(List<String> values) {
            addCriterion("house_address not in", values, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressBetween(String value1, String value2) {
            addCriterion("house_address between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andHouseAddressNotBetween(String value1, String value2) {
            addCriterion("house_address not between", value1, value2, "houseAddress");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNull() {
            addCriterion("create_dt is null");
            return (Criteria) this;
        }

        public Criteria andCreateDtIsNotNull() {
            addCriterion("create_dt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDtEqualTo(Date value) {
            addCriterion("create_dt =", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotEqualTo(Date value) {
            addCriterion("create_dt <>", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThan(Date value) {
            addCriterion("create_dt >", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_dt >=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThan(Date value) {
            addCriterion("create_dt <", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtLessThanOrEqualTo(Date value) {
            addCriterion("create_dt <=", value, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtIn(List<Date> values) {
            addCriterion("create_dt in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotIn(List<Date> values) {
            addCriterion("create_dt not in", values, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtBetween(Date value1, Date value2) {
            addCriterion("create_dt between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andCreateDtNotBetween(Date value1, Date value2) {
            addCriterion("create_dt not between", value1, value2, "createDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtIsNull() {
            addCriterion("modify_dt is null");
            return (Criteria) this;
        }

        public Criteria andModifyDtIsNotNull() {
            addCriterion("modify_dt is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDtEqualTo(Date value) {
            addCriterion("modify_dt =", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotEqualTo(Date value) {
            addCriterion("modify_dt <>", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtGreaterThan(Date value) {
            addCriterion("modify_dt >", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_dt >=", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtLessThan(Date value) {
            addCriterion("modify_dt <", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtLessThanOrEqualTo(Date value) {
            addCriterion("modify_dt <=", value, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtIn(List<Date> values) {
            addCriterion("modify_dt in", values, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotIn(List<Date> values) {
            addCriterion("modify_dt not in", values, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtBetween(Date value1, Date value2) {
            addCriterion("modify_dt between", value1, value2, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andModifyDtNotBetween(Date value1, Date value2) {
            addCriterion("modify_dt not between", value1, value2, "modifyDt");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNull() {
            addCriterion("sort_no is null");
            return (Criteria) this;
        }

        public Criteria andSortNoIsNotNull() {
            addCriterion("sort_no is not null");
            return (Criteria) this;
        }

        public Criteria andSortNoEqualTo(Integer value) {
            addCriterion("sort_no =", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotEqualTo(Integer value) {
            addCriterion("sort_no <>", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThan(Integer value) {
            addCriterion("sort_no >", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort_no >=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThan(Integer value) {
            addCriterion("sort_no <", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoLessThanOrEqualTo(Integer value) {
            addCriterion("sort_no <=", value, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoIn(List<Integer> values) {
            addCriterion("sort_no in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotIn(List<Integer> values) {
            addCriterion("sort_no not in", values, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoBetween(Integer value1, Integer value2) {
            addCriterion("sort_no between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andSortNoNotBetween(Integer value1, Integer value2) {
            addCriterion("sort_no not between", value1, value2, "sortNo");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceIsNull() {
            addCriterion("domicile_place is null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceIsNotNull() {
            addCriterion("domicile_place is not null");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceEqualTo(String value) {
            addCriterion("domicile_place =", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceNotEqualTo(String value) {
            addCriterion("domicile_place <>", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceGreaterThan(String value) {
            addCriterion("domicile_place >", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceGreaterThanOrEqualTo(String value) {
            addCriterion("domicile_place >=", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceLessThan(String value) {
            addCriterion("domicile_place <", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceLessThanOrEqualTo(String value) {
            addCriterion("domicile_place <=", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceLike(String value) {
            addCriterion("domicile_place like", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceNotLike(String value) {
            addCriterion("domicile_place not like", value, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceIn(List<String> values) {
            addCriterion("domicile_place in", values, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceNotIn(List<String> values) {
            addCriterion("domicile_place not in", values, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceBetween(String value1, String value2) {
            addCriterion("domicile_place between", value1, value2, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andDomicilePlaceNotBetween(String value1, String value2) {
            addCriterion("domicile_place not between", value1, value2, "domicilePlace");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIsNull() {
            addCriterion("self_evaluation is null");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIsNotNull() {
            addCriterion("self_evaluation is not null");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationEqualTo(String value) {
            addCriterion("self_evaluation =", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationNotEqualTo(String value) {
            addCriterion("self_evaluation <>", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationGreaterThan(String value) {
            addCriterion("self_evaluation >", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationGreaterThanOrEqualTo(String value) {
            addCriterion("self_evaluation >=", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationLessThan(String value) {
            addCriterion("self_evaluation <", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationLessThanOrEqualTo(String value) {
            addCriterion("self_evaluation <=", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationLike(String value) {
            addCriterion("self_evaluation like", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationNotLike(String value) {
            addCriterion("self_evaluation not like", value, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationIn(List<String> values) {
            addCriterion("self_evaluation in", values, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationNotIn(List<String> values) {
            addCriterion("self_evaluation not in", values, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationBetween(String value1, String value2) {
            addCriterion("self_evaluation between", value1, value2, "selfEvaluation");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluationNotBetween(String value1, String value2) {
            addCriterion("self_evaluation not between", value1, value2, "selfEvaluation");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}