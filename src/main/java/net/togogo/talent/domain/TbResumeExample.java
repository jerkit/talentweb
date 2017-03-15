package net.togogo.talent.domain;

import java.util.ArrayList;
import java.util.List;

public class TbResumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbResumeExample() {
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

        public Criteria andResuIdIsNull() {
            addCriterion("resu_id is null");
            return (Criteria) this;
        }

        public Criteria andResuIdIsNotNull() {
            addCriterion("resu_id is not null");
            return (Criteria) this;
        }

        public Criteria andResuIdEqualTo(Integer value) {
            addCriterion("resu_id =", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdNotEqualTo(Integer value) {
            addCriterion("resu_id <>", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdGreaterThan(Integer value) {
            addCriterion("resu_id >", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("resu_id >=", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdLessThan(Integer value) {
            addCriterion("resu_id <", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdLessThanOrEqualTo(Integer value) {
            addCriterion("resu_id <=", value, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdIn(List<Integer> values) {
            addCriterion("resu_id in", values, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdNotIn(List<Integer> values) {
            addCriterion("resu_id not in", values, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdBetween(Integer value1, Integer value2) {
            addCriterion("resu_id between", value1, value2, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("resu_id not between", value1, value2, "resuId");
            return (Criteria) this;
        }

        public Criteria andResuNameIsNull() {
            addCriterion("resu_name is null");
            return (Criteria) this;
        }

        public Criteria andResuNameIsNotNull() {
            addCriterion("resu_name is not null");
            return (Criteria) this;
        }

        public Criteria andResuNameEqualTo(String value) {
            addCriterion("resu_name =", value, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuNameNotEqualTo(String value) {
            addCriterion("resu_name <>", value, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuNameGreaterThan(String value) {
            addCriterion("resu_name >", value, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuNameGreaterThanOrEqualTo(String value) {
            addCriterion("resu_name >=", value, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuNameLessThan(String value) {
            addCriterion("resu_name <", value, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuNameLessThanOrEqualTo(String value) {
            addCriterion("resu_name <=", value, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuNameLike(String value) {
            addCriterion("resu_name like", value, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuNameNotLike(String value) {
            addCriterion("resu_name not like", value, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuNameIn(List<String> values) {
            addCriterion("resu_name in", values, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuNameNotIn(List<String> values) {
            addCriterion("resu_name not in", values, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuNameBetween(String value1, String value2) {
            addCriterion("resu_name between", value1, value2, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuNameNotBetween(String value1, String value2) {
            addCriterion("resu_name not between", value1, value2, "resuName");
            return (Criteria) this;
        }

        public Criteria andResuJobIsNull() {
            addCriterion("resu_job is null");
            return (Criteria) this;
        }

        public Criteria andResuJobIsNotNull() {
            addCriterion("resu_job is not null");
            return (Criteria) this;
        }

        public Criteria andResuJobEqualTo(String value) {
            addCriterion("resu_job =", value, "resuJob");
            return (Criteria) this;
        }

        public Criteria andResuJobNotEqualTo(String value) {
            addCriterion("resu_job <>", value, "resuJob");
            return (Criteria) this;
        }

        public Criteria andResuJobGreaterThan(String value) {
            addCriterion("resu_job >", value, "resuJob");
            return (Criteria) this;
        }

        public Criteria andResuJobGreaterThanOrEqualTo(String value) {
            addCriterion("resu_job >=", value, "resuJob");
            return (Criteria) this;
        }

        public Criteria andResuJobLessThan(String value) {
            addCriterion("resu_job <", value, "resuJob");
            return (Criteria) this;
        }

        public Criteria andResuJobLessThanOrEqualTo(String value) {
            addCriterion("resu_job <=", value, "resuJob");
            return (Criteria) this;
        }

        public Criteria andResuJobLike(String value) {
            addCriterion("resu_job like", value, "resuJob");
            return (Criteria) this;
        }

        public Criteria andResuJobNotLike(String value) {
            addCriterion("resu_job not like", value, "resuJob");
            return (Criteria) this;
        }

        public Criteria andResuJobIn(List<String> values) {
            addCriterion("resu_job in", values, "resuJob");
            return (Criteria) this;
        }

        public Criteria andResuJobNotIn(List<String> values) {
            addCriterion("resu_job not in", values, "resuJob");
            return (Criteria) this;
        }

        public Criteria andResuJobBetween(String value1, String value2) {
            addCriterion("resu_job between", value1, value2, "resuJob");
            return (Criteria) this;
        }

        public Criteria andResuJobNotBetween(String value1, String value2) {
            addCriterion("resu_job not between", value1, value2, "resuJob");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("education is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("education is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("education =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("education <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("education >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("education >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("education <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("education <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("education like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("education not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("education in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("education not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("education between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("education not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andJobExperienceIsNull() {
            addCriterion("job_experience is null");
            return (Criteria) this;
        }

        public Criteria andJobExperienceIsNotNull() {
            addCriterion("job_experience is not null");
            return (Criteria) this;
        }

        public Criteria andJobExperienceEqualTo(String value) {
            addCriterion("job_experience =", value, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andJobExperienceNotEqualTo(String value) {
            addCriterion("job_experience <>", value, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andJobExperienceGreaterThan(String value) {
            addCriterion("job_experience >", value, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andJobExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("job_experience >=", value, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andJobExperienceLessThan(String value) {
            addCriterion("job_experience <", value, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andJobExperienceLessThanOrEqualTo(String value) {
            addCriterion("job_experience <=", value, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andJobExperienceLike(String value) {
            addCriterion("job_experience like", value, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andJobExperienceNotLike(String value) {
            addCriterion("job_experience not like", value, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andJobExperienceIn(List<String> values) {
            addCriterion("job_experience in", values, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andJobExperienceNotIn(List<String> values) {
            addCriterion("job_experience not in", values, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andJobExperienceBetween(String value1, String value2) {
            addCriterion("job_experience between", value1, value2, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andJobExperienceNotBetween(String value1, String value2) {
            addCriterion("job_experience not between", value1, value2, "jobExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIsNull() {
            addCriterion("project_experience is null");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIsNotNull() {
            addCriterion("project_experience is not null");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceEqualTo(String value) {
            addCriterion("project_experience =", value, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceNotEqualTo(String value) {
            addCriterion("project_experience <>", value, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceGreaterThan(String value) {
            addCriterion("project_experience >", value, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceGreaterThanOrEqualTo(String value) {
            addCriterion("project_experience >=", value, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceLessThan(String value) {
            addCriterion("project_experience <", value, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceLessThanOrEqualTo(String value) {
            addCriterion("project_experience <=", value, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceLike(String value) {
            addCriterion("project_experience like", value, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceNotLike(String value) {
            addCriterion("project_experience not like", value, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceIn(List<String> values) {
            addCriterion("project_experience in", values, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceNotIn(List<String> values) {
            addCriterion("project_experience not in", values, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceBetween(String value1, String value2) {
            addCriterion("project_experience between", value1, value2, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andProjectExperienceNotBetween(String value1, String value2) {
            addCriterion("project_experience not between", value1, value2, "projectExperience");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateIsNull() {
            addCriterion("self_evaluate is null");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateIsNotNull() {
            addCriterion("self_evaluate is not null");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateEqualTo(String value) {
            addCriterion("self_evaluate =", value, "selfEvaluate");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateNotEqualTo(String value) {
            addCriterion("self_evaluate <>", value, "selfEvaluate");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateGreaterThan(String value) {
            addCriterion("self_evaluate >", value, "selfEvaluate");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateGreaterThanOrEqualTo(String value) {
            addCriterion("self_evaluate >=", value, "selfEvaluate");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateLessThan(String value) {
            addCriterion("self_evaluate <", value, "selfEvaluate");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateLessThanOrEqualTo(String value) {
            addCriterion("self_evaluate <=", value, "selfEvaluate");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateLike(String value) {
            addCriterion("self_evaluate like", value, "selfEvaluate");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateNotLike(String value) {
            addCriterion("self_evaluate not like", value, "selfEvaluate");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateIn(List<String> values) {
            addCriterion("self_evaluate in", values, "selfEvaluate");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateNotIn(List<String> values) {
            addCriterion("self_evaluate not in", values, "selfEvaluate");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateBetween(String value1, String value2) {
            addCriterion("self_evaluate between", value1, value2, "selfEvaluate");
            return (Criteria) this;
        }

        public Criteria andSelfEvaluateNotBetween(String value1, String value2) {
            addCriterion("self_evaluate not between", value1, value2, "selfEvaluate");
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