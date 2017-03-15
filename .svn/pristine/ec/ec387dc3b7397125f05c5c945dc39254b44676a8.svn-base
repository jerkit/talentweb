package net.togogo.talent.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbRecruitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbRecruitExample() {
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

        public Criteria andRecrIdIsNull() {
            addCriterion("recr_id is null");
            return (Criteria) this;
        }

        public Criteria andRecrIdIsNotNull() {
            addCriterion("recr_id is not null");
            return (Criteria) this;
        }

        public Criteria andRecrIdEqualTo(Integer value) {
            addCriterion("recr_id =", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdNotEqualTo(Integer value) {
            addCriterion("recr_id <>", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdGreaterThan(Integer value) {
            addCriterion("recr_id >", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("recr_id >=", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdLessThan(Integer value) {
            addCriterion("recr_id <", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdLessThanOrEqualTo(Integer value) {
            addCriterion("recr_id <=", value, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdIn(List<Integer> values) {
            addCriterion("recr_id in", values, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdNotIn(List<Integer> values) {
            addCriterion("recr_id not in", values, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdBetween(Integer value1, Integer value2) {
            addCriterion("recr_id between", value1, value2, "recrId");
            return (Criteria) this;
        }

        public Criteria andRecrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("recr_id not between", value1, value2, "recrId");
            return (Criteria) this;
        }

        public Criteria andCompNameIsNull() {
            addCriterion("comp_name is null");
            return (Criteria) this;
        }

        public Criteria andCompNameIsNotNull() {
            addCriterion("comp_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompNameEqualTo(String value) {
            addCriterion("comp_name =", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotEqualTo(String value) {
            addCriterion("comp_name <>", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameGreaterThan(String value) {
            addCriterion("comp_name >", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameGreaterThanOrEqualTo(String value) {
            addCriterion("comp_name >=", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLessThan(String value) {
            addCriterion("comp_name <", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLessThanOrEqualTo(String value) {
            addCriterion("comp_name <=", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameLike(String value) {
            addCriterion("comp_name like", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotLike(String value) {
            addCriterion("comp_name not like", value, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameIn(List<String> values) {
            addCriterion("comp_name in", values, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotIn(List<String> values) {
            addCriterion("comp_name not in", values, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameBetween(String value1, String value2) {
            addCriterion("comp_name between", value1, value2, "compName");
            return (Criteria) this;
        }

        public Criteria andCompNameNotBetween(String value1, String value2) {
            addCriterion("comp_name not between", value1, value2, "compName");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNull() {
            addCriterion("comp_id is null");
            return (Criteria) this;
        }

        public Criteria andCompIdIsNotNull() {
            addCriterion("comp_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompIdEqualTo(Integer value) {
            addCriterion("comp_id =", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotEqualTo(Integer value) {
            addCriterion("comp_id <>", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThan(Integer value) {
            addCriterion("comp_id >", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comp_id >=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThan(Integer value) {
            addCriterion("comp_id <", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdLessThanOrEqualTo(Integer value) {
            addCriterion("comp_id <=", value, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdIn(List<Integer> values) {
            addCriterion("comp_id in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotIn(List<Integer> values) {
            addCriterion("comp_id not in", values, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdBetween(Integer value1, Integer value2) {
            addCriterion("comp_id between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andCompIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comp_id not between", value1, value2, "compId");
            return (Criteria) this;
        }

        public Criteria andRecrJobIsNull() {
            addCriterion("recr_job is null");
            return (Criteria) this;
        }

        public Criteria andRecrJobIsNotNull() {
            addCriterion("recr_job is not null");
            return (Criteria) this;
        }

        public Criteria andRecrJobEqualTo(String value) {
            addCriterion("recr_job =", value, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrJobNotEqualTo(String value) {
            addCriterion("recr_job <>", value, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrJobGreaterThan(String value) {
            addCriterion("recr_job >", value, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrJobGreaterThanOrEqualTo(String value) {
            addCriterion("recr_job >=", value, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrJobLessThan(String value) {
            addCriterion("recr_job <", value, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrJobLessThanOrEqualTo(String value) {
            addCriterion("recr_job <=", value, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrJobLike(String value) {
            addCriterion("recr_job like", value, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrJobNotLike(String value) {
            addCriterion("recr_job not like", value, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrJobIn(List<String> values) {
            addCriterion("recr_job in", values, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrJobNotIn(List<String> values) {
            addCriterion("recr_job not in", values, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrJobBetween(String value1, String value2) {
            addCriterion("recr_job between", value1, value2, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrJobNotBetween(String value1, String value2) {
            addCriterion("recr_job not between", value1, value2, "recrJob");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceIsNull() {
            addCriterion("recr_place is null");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceIsNotNull() {
            addCriterion("recr_place is not null");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceEqualTo(String value) {
            addCriterion("recr_place =", value, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceNotEqualTo(String value) {
            addCriterion("recr_place <>", value, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceGreaterThan(String value) {
            addCriterion("recr_place >", value, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("recr_place >=", value, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceLessThan(String value) {
            addCriterion("recr_place <", value, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceLessThanOrEqualTo(String value) {
            addCriterion("recr_place <=", value, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceLike(String value) {
            addCriterion("recr_place like", value, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceNotLike(String value) {
            addCriterion("recr_place not like", value, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceIn(List<String> values) {
            addCriterion("recr_place in", values, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceNotIn(List<String> values) {
            addCriterion("recr_place not in", values, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceBetween(String value1, String value2) {
            addCriterion("recr_place between", value1, value2, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrPlaceNotBetween(String value1, String value2) {
            addCriterion("recr_place not between", value1, value2, "recrPlace");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryIsNull() {
            addCriterion("recr_salary is null");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryIsNotNull() {
            addCriterion("recr_salary is not null");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryEqualTo(String value) {
            addCriterion("recr_salary =", value, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryNotEqualTo(String value) {
            addCriterion("recr_salary <>", value, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryGreaterThan(String value) {
            addCriterion("recr_salary >", value, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryGreaterThanOrEqualTo(String value) {
            addCriterion("recr_salary >=", value, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryLessThan(String value) {
            addCriterion("recr_salary <", value, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryLessThanOrEqualTo(String value) {
            addCriterion("recr_salary <=", value, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryLike(String value) {
            addCriterion("recr_salary like", value, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryNotLike(String value) {
            addCriterion("recr_salary not like", value, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryIn(List<String> values) {
            addCriterion("recr_salary in", values, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryNotIn(List<String> values) {
            addCriterion("recr_salary not in", values, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryBetween(String value1, String value2) {
            addCriterion("recr_salary between", value1, value2, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrSalaryNotBetween(String value1, String value2) {
            addCriterion("recr_salary not between", value1, value2, "recrSalary");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeIsNull() {
            addCriterion("recr_degree is null");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeIsNotNull() {
            addCriterion("recr_degree is not null");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeEqualTo(String value) {
            addCriterion("recr_degree =", value, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeNotEqualTo(String value) {
            addCriterion("recr_degree <>", value, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeGreaterThan(String value) {
            addCriterion("recr_degree >", value, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("recr_degree >=", value, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeLessThan(String value) {
            addCriterion("recr_degree <", value, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeLessThanOrEqualTo(String value) {
            addCriterion("recr_degree <=", value, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeLike(String value) {
            addCriterion("recr_degree like", value, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeNotLike(String value) {
            addCriterion("recr_degree not like", value, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeIn(List<String> values) {
            addCriterion("recr_degree in", values, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeNotIn(List<String> values) {
            addCriterion("recr_degree not in", values, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeBetween(String value1, String value2) {
            addCriterion("recr_degree between", value1, value2, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDegreeNotBetween(String value1, String value2) {
            addCriterion("recr_degree not between", value1, value2, "recrDegree");
            return (Criteria) this;
        }

        public Criteria andRecrDutyIsNull() {
            addCriterion("recr_duty is null");
            return (Criteria) this;
        }

        public Criteria andRecrDutyIsNotNull() {
            addCriterion("recr_duty is not null");
            return (Criteria) this;
        }

        public Criteria andRecrDutyEqualTo(String value) {
            addCriterion("recr_duty =", value, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDutyNotEqualTo(String value) {
            addCriterion("recr_duty <>", value, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDutyGreaterThan(String value) {
            addCriterion("recr_duty >", value, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDutyGreaterThanOrEqualTo(String value) {
            addCriterion("recr_duty >=", value, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDutyLessThan(String value) {
            addCriterion("recr_duty <", value, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDutyLessThanOrEqualTo(String value) {
            addCriterion("recr_duty <=", value, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDutyLike(String value) {
            addCriterion("recr_duty like", value, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDutyNotLike(String value) {
            addCriterion("recr_duty not like", value, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDutyIn(List<String> values) {
            addCriterion("recr_duty in", values, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDutyNotIn(List<String> values) {
            addCriterion("recr_duty not in", values, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDutyBetween(String value1, String value2) {
            addCriterion("recr_duty between", value1, value2, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDutyNotBetween(String value1, String value2) {
            addCriterion("recr_duty not between", value1, value2, "recrDuty");
            return (Criteria) this;
        }

        public Criteria andRecrDemandIsNull() {
            addCriterion("recr_demand is null");
            return (Criteria) this;
        }

        public Criteria andRecrDemandIsNotNull() {
            addCriterion("recr_demand is not null");
            return (Criteria) this;
        }

        public Criteria andRecrDemandEqualTo(String value) {
            addCriterion("recr_demand =", value, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDemandNotEqualTo(String value) {
            addCriterion("recr_demand <>", value, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDemandGreaterThan(String value) {
            addCriterion("recr_demand >", value, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDemandGreaterThanOrEqualTo(String value) {
            addCriterion("recr_demand >=", value, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDemandLessThan(String value) {
            addCriterion("recr_demand <", value, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDemandLessThanOrEqualTo(String value) {
            addCriterion("recr_demand <=", value, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDemandLike(String value) {
            addCriterion("recr_demand like", value, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDemandNotLike(String value) {
            addCriterion("recr_demand not like", value, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDemandIn(List<String> values) {
            addCriterion("recr_demand in", values, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDemandNotIn(List<String> values) {
            addCriterion("recr_demand not in", values, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDemandBetween(String value1, String value2) {
            addCriterion("recr_demand between", value1, value2, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDemandNotBetween(String value1, String value2) {
            addCriterion("recr_demand not between", value1, value2, "recrDemand");
            return (Criteria) this;
        }

        public Criteria andRecrDateIsNull() {
            addCriterion("recr_date is null");
            return (Criteria) this;
        }

        public Criteria andRecrDateIsNotNull() {
            addCriterion("recr_date is not null");
            return (Criteria) this;
        }

        public Criteria andRecrDateEqualTo(Date value) {
            addCriterion("recr_date =", value, "recrDate");
            return (Criteria) this;
        }

        public Criteria andRecrDateNotEqualTo(Date value) {
            addCriterion("recr_date <>", value, "recrDate");
            return (Criteria) this;
        }

        public Criteria andRecrDateGreaterThan(Date value) {
            addCriterion("recr_date >", value, "recrDate");
            return (Criteria) this;
        }

        public Criteria andRecrDateGreaterThanOrEqualTo(Date value) {
            addCriterion("recr_date >=", value, "recrDate");
            return (Criteria) this;
        }

        public Criteria andRecrDateLessThan(Date value) {
            addCriterion("recr_date <", value, "recrDate");
            return (Criteria) this;
        }

        public Criteria andRecrDateLessThanOrEqualTo(Date value) {
            addCriterion("recr_date <=", value, "recrDate");
            return (Criteria) this;
        }

        public Criteria andRecrDateIn(List<Date> values) {
            addCriterion("recr_date in", values, "recrDate");
            return (Criteria) this;
        }

        public Criteria andRecrDateNotIn(List<Date> values) {
            addCriterion("recr_date not in", values, "recrDate");
            return (Criteria) this;
        }

        public Criteria andRecrDateBetween(Date value1, Date value2) {
            addCriterion("recr_date between", value1, value2, "recrDate");
            return (Criteria) this;
        }

        public Criteria andRecrDateNotBetween(Date value1, Date value2) {
            addCriterion("recr_date not between", value1, value2, "recrDate");
            return (Criteria) this;
        }

        public Criteria andRecrStateIsNull() {
            addCriterion("recr_state is null");
            return (Criteria) this;
        }

        public Criteria andRecrStateIsNotNull() {
            addCriterion("recr_state is not null");
            return (Criteria) this;
        }

        public Criteria andRecrStateEqualTo(Integer value) {
            addCriterion("recr_state =", value, "recrState");
            return (Criteria) this;
        }

        public Criteria andRecrStateNotEqualTo(Integer value) {
            addCriterion("recr_state <>", value, "recrState");
            return (Criteria) this;
        }

        public Criteria andRecrStateGreaterThan(Integer value) {
            addCriterion("recr_state >", value, "recrState");
            return (Criteria) this;
        }

        public Criteria andRecrStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("recr_state >=", value, "recrState");
            return (Criteria) this;
        }

        public Criteria andRecrStateLessThan(Integer value) {
            addCriterion("recr_state <", value, "recrState");
            return (Criteria) this;
        }

        public Criteria andRecrStateLessThanOrEqualTo(Integer value) {
            addCriterion("recr_state <=", value, "recrState");
            return (Criteria) this;
        }

        public Criteria andRecrStateIn(List<Integer> values) {
            addCriterion("recr_state in", values, "recrState");
            return (Criteria) this;
        }

        public Criteria andRecrStateNotIn(List<Integer> values) {
            addCriterion("recr_state not in", values, "recrState");
            return (Criteria) this;
        }

        public Criteria andRecrStateBetween(Integer value1, Integer value2) {
            addCriterion("recr_state between", value1, value2, "recrState");
            return (Criteria) this;
        }

        public Criteria andRecrStateNotBetween(Integer value1, Integer value2) {
            addCriterion("recr_state not between", value1, value2, "recrState");
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