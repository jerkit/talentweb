package net.togogo.talent.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbHuntExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbHuntExample() {
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

        public Criteria andHuntIdIsNull() {
            addCriterion("hunt_id is null");
            return (Criteria) this;
        }

        public Criteria andHuntIdIsNotNull() {
            addCriterion("hunt_id is not null");
            return (Criteria) this;
        }

        public Criteria andHuntIdEqualTo(Integer value) {
            addCriterion("hunt_id =", value, "huntId");
            return (Criteria) this;
        }

        public Criteria andHuntIdNotEqualTo(Integer value) {
            addCriterion("hunt_id <>", value, "huntId");
            return (Criteria) this;
        }

        public Criteria andHuntIdGreaterThan(Integer value) {
            addCriterion("hunt_id >", value, "huntId");
            return (Criteria) this;
        }

        public Criteria andHuntIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hunt_id >=", value, "huntId");
            return (Criteria) this;
        }

        public Criteria andHuntIdLessThan(Integer value) {
            addCriterion("hunt_id <", value, "huntId");
            return (Criteria) this;
        }

        public Criteria andHuntIdLessThanOrEqualTo(Integer value) {
            addCriterion("hunt_id <=", value, "huntId");
            return (Criteria) this;
        }

        public Criteria andHuntIdIn(List<Integer> values) {
            addCriterion("hunt_id in", values, "huntId");
            return (Criteria) this;
        }

        public Criteria andHuntIdNotIn(List<Integer> values) {
            addCriterion("hunt_id not in", values, "huntId");
            return (Criteria) this;
        }

        public Criteria andHuntIdBetween(Integer value1, Integer value2) {
            addCriterion("hunt_id between", value1, value2, "huntId");
            return (Criteria) this;
        }

        public Criteria andHuntIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hunt_id not between", value1, value2, "huntId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andHuntJobIsNull() {
            addCriterion("hunt_job is null");
            return (Criteria) this;
        }

        public Criteria andHuntJobIsNotNull() {
            addCriterion("hunt_job is not null");
            return (Criteria) this;
        }

        public Criteria andHuntJobEqualTo(String value) {
            addCriterion("hunt_job =", value, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntJobNotEqualTo(String value) {
            addCriterion("hunt_job <>", value, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntJobGreaterThan(String value) {
            addCriterion("hunt_job >", value, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntJobGreaterThanOrEqualTo(String value) {
            addCriterion("hunt_job >=", value, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntJobLessThan(String value) {
            addCriterion("hunt_job <", value, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntJobLessThanOrEqualTo(String value) {
            addCriterion("hunt_job <=", value, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntJobLike(String value) {
            addCriterion("hunt_job like", value, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntJobNotLike(String value) {
            addCriterion("hunt_job not like", value, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntJobIn(List<String> values) {
            addCriterion("hunt_job in", values, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntJobNotIn(List<String> values) {
            addCriterion("hunt_job not in", values, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntJobBetween(String value1, String value2) {
            addCriterion("hunt_job between", value1, value2, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntJobNotBetween(String value1, String value2) {
            addCriterion("hunt_job not between", value1, value2, "huntJob");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceIsNull() {
            addCriterion("hunt_place is null");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceIsNotNull() {
            addCriterion("hunt_place is not null");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceEqualTo(String value) {
            addCriterion("hunt_place =", value, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceNotEqualTo(String value) {
            addCriterion("hunt_place <>", value, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceGreaterThan(String value) {
            addCriterion("hunt_place >", value, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("hunt_place >=", value, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceLessThan(String value) {
            addCriterion("hunt_place <", value, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceLessThanOrEqualTo(String value) {
            addCriterion("hunt_place <=", value, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceLike(String value) {
            addCriterion("hunt_place like", value, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceNotLike(String value) {
            addCriterion("hunt_place not like", value, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceIn(List<String> values) {
            addCriterion("hunt_place in", values, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceNotIn(List<String> values) {
            addCriterion("hunt_place not in", values, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceBetween(String value1, String value2) {
            addCriterion("hunt_place between", value1, value2, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntPlaceNotBetween(String value1, String value2) {
            addCriterion("hunt_place not between", value1, value2, "huntPlace");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeIsNull() {
            addCriterion("hunt_degree is null");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeIsNotNull() {
            addCriterion("hunt_degree is not null");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeEqualTo(String value) {
            addCriterion("hunt_degree =", value, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeNotEqualTo(String value) {
            addCriterion("hunt_degree <>", value, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeGreaterThan(String value) {
            addCriterion("hunt_degree >", value, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("hunt_degree >=", value, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeLessThan(String value) {
            addCriterion("hunt_degree <", value, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeLessThanOrEqualTo(String value) {
            addCriterion("hunt_degree <=", value, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeLike(String value) {
            addCriterion("hunt_degree like", value, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeNotLike(String value) {
            addCriterion("hunt_degree not like", value, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeIn(List<String> values) {
            addCriterion("hunt_degree in", values, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeNotIn(List<String> values) {
            addCriterion("hunt_degree not in", values, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeBetween(String value1, String value2) {
            addCriterion("hunt_degree between", value1, value2, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntDegreeNotBetween(String value1, String value2) {
            addCriterion("hunt_degree not between", value1, value2, "huntDegree");
            return (Criteria) this;
        }

        public Criteria andHuntSkillIsNull() {
            addCriterion("hunt_skill is null");
            return (Criteria) this;
        }

        public Criteria andHuntSkillIsNotNull() {
            addCriterion("hunt_skill is not null");
            return (Criteria) this;
        }

        public Criteria andHuntSkillEqualTo(String value) {
            addCriterion("hunt_skill =", value, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntSkillNotEqualTo(String value) {
            addCriterion("hunt_skill <>", value, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntSkillGreaterThan(String value) {
            addCriterion("hunt_skill >", value, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntSkillGreaterThanOrEqualTo(String value) {
            addCriterion("hunt_skill >=", value, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntSkillLessThan(String value) {
            addCriterion("hunt_skill <", value, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntSkillLessThanOrEqualTo(String value) {
            addCriterion("hunt_skill <=", value, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntSkillLike(String value) {
            addCriterion("hunt_skill like", value, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntSkillNotLike(String value) {
            addCriterion("hunt_skill not like", value, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntSkillIn(List<String> values) {
            addCriterion("hunt_skill in", values, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntSkillNotIn(List<String> values) {
            addCriterion("hunt_skill not in", values, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntSkillBetween(String value1, String value2) {
            addCriterion("hunt_skill between", value1, value2, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntSkillNotBetween(String value1, String value2) {
            addCriterion("hunt_skill not between", value1, value2, "huntSkill");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceIsNull() {
            addCriterion("hunt_experience is null");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceIsNotNull() {
            addCriterion("hunt_experience is not null");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceEqualTo(String value) {
            addCriterion("hunt_experience =", value, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceNotEqualTo(String value) {
            addCriterion("hunt_experience <>", value, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceGreaterThan(String value) {
            addCriterion("hunt_experience >", value, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("hunt_experience >=", value, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceLessThan(String value) {
            addCriterion("hunt_experience <", value, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceLessThanOrEqualTo(String value) {
            addCriterion("hunt_experience <=", value, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceLike(String value) {
            addCriterion("hunt_experience like", value, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceNotLike(String value) {
            addCriterion("hunt_experience not like", value, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceIn(List<String> values) {
            addCriterion("hunt_experience in", values, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceNotIn(List<String> values) {
            addCriterion("hunt_experience not in", values, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceBetween(String value1, String value2) {
            addCriterion("hunt_experience between", value1, value2, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntExperienceNotBetween(String value1, String value2) {
            addCriterion("hunt_experience not between", value1, value2, "huntExperience");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryIsNull() {
            addCriterion("hunt_salary is null");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryIsNotNull() {
            addCriterion("hunt_salary is not null");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryEqualTo(String value) {
            addCriterion("hunt_salary =", value, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryNotEqualTo(String value) {
            addCriterion("hunt_salary <>", value, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryGreaterThan(String value) {
            addCriterion("hunt_salary >", value, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("hunt_salary >=", value, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryLessThan(String value) {
            addCriterion("hunt_salary <", value, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryLessThanOrEqualTo(String value) {
            addCriterion("hunt_salary <=", value, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryLike(String value) {
            addCriterion("hunt_salary like", value, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryNotLike(String value) {
            addCriterion("hunt_salary not like", value, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryIn(List<String> values) {
            addCriterion("hunt_salary in", values, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryNotIn(List<String> values) {
            addCriterion("hunt_salary not in", values, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryBetween(String value1, String value2) {
            addCriterion("hunt_salary between", value1, value2, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntSalaryNotBetween(String value1, String value2) {
            addCriterion("hunt_salary not between", value1, value2, "huntSalary");
            return (Criteria) this;
        }

        public Criteria andHuntDateIsNull() {
            addCriterion("hunt_date is null");
            return (Criteria) this;
        }

        public Criteria andHuntDateIsNotNull() {
            addCriterion("hunt_date is not null");
            return (Criteria) this;
        }

        public Criteria andHuntDateEqualTo(Date value) {
            addCriterion("hunt_date =", value, "huntDate");
            return (Criteria) this;
        }

        public Criteria andHuntDateNotEqualTo(Date value) {
            addCriterion("hunt_date <>", value, "huntDate");
            return (Criteria) this;
        }

        public Criteria andHuntDateGreaterThan(Date value) {
            addCriterion("hunt_date >", value, "huntDate");
            return (Criteria) this;
        }

        public Criteria andHuntDateGreaterThanOrEqualTo(Date value) {
            addCriterion("hunt_date >=", value, "huntDate");
            return (Criteria) this;
        }

        public Criteria andHuntDateLessThan(Date value) {
            addCriterion("hunt_date <", value, "huntDate");
            return (Criteria) this;
        }

        public Criteria andHuntDateLessThanOrEqualTo(Date value) {
            addCriterion("hunt_date <=", value, "huntDate");
            return (Criteria) this;
        }

        public Criteria andHuntDateIn(List<Date> values) {
            addCriterion("hunt_date in", values, "huntDate");
            return (Criteria) this;
        }

        public Criteria andHuntDateNotIn(List<Date> values) {
            addCriterion("hunt_date not in", values, "huntDate");
            return (Criteria) this;
        }

        public Criteria andHuntDateBetween(Date value1, Date value2) {
            addCriterion("hunt_date between", value1, value2, "huntDate");
            return (Criteria) this;
        }

        public Criteria andHuntDateNotBetween(Date value1, Date value2) {
            addCriterion("hunt_date not between", value1, value2, "huntDate");
            return (Criteria) this;
        }

        public Criteria andHuntStateIsNull() {
            addCriterion("hunt_state is null");
            return (Criteria) this;
        }

        public Criteria andHuntStateIsNotNull() {
            addCriterion("hunt_state is not null");
            return (Criteria) this;
        }

        public Criteria andHuntStateEqualTo(Integer value) {
            addCriterion("hunt_state =", value, "huntState");
            return (Criteria) this;
        }

        public Criteria andHuntStateNotEqualTo(Integer value) {
            addCriterion("hunt_state <>", value, "huntState");
            return (Criteria) this;
        }

        public Criteria andHuntStateGreaterThan(Integer value) {
            addCriterion("hunt_state >", value, "huntState");
            return (Criteria) this;
        }

        public Criteria andHuntStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hunt_state >=", value, "huntState");
            return (Criteria) this;
        }

        public Criteria andHuntStateLessThan(Integer value) {
            addCriterion("hunt_state <", value, "huntState");
            return (Criteria) this;
        }

        public Criteria andHuntStateLessThanOrEqualTo(Integer value) {
            addCriterion("hunt_state <=", value, "huntState");
            return (Criteria) this;
        }

        public Criteria andHuntStateIn(List<Integer> values) {
            addCriterion("hunt_state in", values, "huntState");
            return (Criteria) this;
        }

        public Criteria andHuntStateNotIn(List<Integer> values) {
            addCriterion("hunt_state not in", values, "huntState");
            return (Criteria) this;
        }

        public Criteria andHuntStateBetween(Integer value1, Integer value2) {
            addCriterion("hunt_state between", value1, value2, "huntState");
            return (Criteria) this;
        }

        public Criteria andHuntStateNotBetween(Integer value1, Integer value2) {
            addCriterion("hunt_state not between", value1, value2, "huntState");
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