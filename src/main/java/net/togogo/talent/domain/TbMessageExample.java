package net.togogo.talent.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbMessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbMessageExample() {
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

        public Criteria andMessIdIsNull() {
            addCriterion("mess_id is null");
            return (Criteria) this;
        }

        public Criteria andMessIdIsNotNull() {
            addCriterion("mess_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessIdEqualTo(Integer value) {
            addCriterion("mess_id =", value, "messId");
            return (Criteria) this;
        }

        public Criteria andMessIdNotEqualTo(Integer value) {
            addCriterion("mess_id <>", value, "messId");
            return (Criteria) this;
        }

        public Criteria andMessIdGreaterThan(Integer value) {
            addCriterion("mess_id >", value, "messId");
            return (Criteria) this;
        }

        public Criteria andMessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mess_id >=", value, "messId");
            return (Criteria) this;
        }

        public Criteria andMessIdLessThan(Integer value) {
            addCriterion("mess_id <", value, "messId");
            return (Criteria) this;
        }

        public Criteria andMessIdLessThanOrEqualTo(Integer value) {
            addCriterion("mess_id <=", value, "messId");
            return (Criteria) this;
        }

        public Criteria andMessIdIn(List<Integer> values) {
            addCriterion("mess_id in", values, "messId");
            return (Criteria) this;
        }

        public Criteria andMessIdNotIn(List<Integer> values) {
            addCriterion("mess_id not in", values, "messId");
            return (Criteria) this;
        }

        public Criteria andMessIdBetween(Integer value1, Integer value2) {
            addCriterion("mess_id between", value1, value2, "messId");
            return (Criteria) this;
        }

        public Criteria andMessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mess_id not between", value1, value2, "messId");
            return (Criteria) this;
        }

        public Criteria andMessTopicIsNull() {
            addCriterion("mess_topic is null");
            return (Criteria) this;
        }

        public Criteria andMessTopicIsNotNull() {
            addCriterion("mess_topic is not null");
            return (Criteria) this;
        }

        public Criteria andMessTopicEqualTo(String value) {
            addCriterion("mess_topic =", value, "messTopic");
            return (Criteria) this;
        }

        public Criteria andMessTopicNotEqualTo(String value) {
            addCriterion("mess_topic <>", value, "messTopic");
            return (Criteria) this;
        }

        public Criteria andMessTopicGreaterThan(String value) {
            addCriterion("mess_topic >", value, "messTopic");
            return (Criteria) this;
        }

        public Criteria andMessTopicGreaterThanOrEqualTo(String value) {
            addCriterion("mess_topic >=", value, "messTopic");
            return (Criteria) this;
        }

        public Criteria andMessTopicLessThan(String value) {
            addCriterion("mess_topic <", value, "messTopic");
            return (Criteria) this;
        }

        public Criteria andMessTopicLessThanOrEqualTo(String value) {
            addCriterion("mess_topic <=", value, "messTopic");
            return (Criteria) this;
        }

        public Criteria andMessTopicLike(String value) {
            addCriterion("mess_topic like", value, "messTopic");
            return (Criteria) this;
        }

        public Criteria andMessTopicNotLike(String value) {
            addCriterion("mess_topic not like", value, "messTopic");
            return (Criteria) this;
        }

        public Criteria andMessTopicIn(List<String> values) {
            addCriterion("mess_topic in", values, "messTopic");
            return (Criteria) this;
        }

        public Criteria andMessTopicNotIn(List<String> values) {
            addCriterion("mess_topic not in", values, "messTopic");
            return (Criteria) this;
        }

        public Criteria andMessTopicBetween(String value1, String value2) {
            addCriterion("mess_topic between", value1, value2, "messTopic");
            return (Criteria) this;
        }

        public Criteria andMessTopicNotBetween(String value1, String value2) {
            addCriterion("mess_topic not between", value1, value2, "messTopic");
            return (Criteria) this;
        }

        public Criteria andResourceIsNull() {
            addCriterion("resource is null");
            return (Criteria) this;
        }

        public Criteria andResourceIsNotNull() {
            addCriterion("resource is not null");
            return (Criteria) this;
        }

        public Criteria andResourceEqualTo(String value) {
            addCriterion("resource =", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotEqualTo(String value) {
            addCriterion("resource <>", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThan(String value) {
            addCriterion("resource >", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceGreaterThanOrEqualTo(String value) {
            addCriterion("resource >=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThan(String value) {
            addCriterion("resource <", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLessThanOrEqualTo(String value) {
            addCriterion("resource <=", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceLike(String value) {
            addCriterion("resource like", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotLike(String value) {
            addCriterion("resource not like", value, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceIn(List<String> values) {
            addCriterion("resource in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotIn(List<String> values) {
            addCriterion("resource not in", values, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceBetween(String value1, String value2) {
            addCriterion("resource between", value1, value2, "resource");
            return (Criteria) this;
        }

        public Criteria andResourceNotBetween(String value1, String value2) {
            addCriterion("resource not between", value1, value2, "resource");
            return (Criteria) this;
        }

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andMessDateIsNull() {
            addCriterion("mess_date is null");
            return (Criteria) this;
        }

        public Criteria andMessDateIsNotNull() {
            addCriterion("mess_date is not null");
            return (Criteria) this;
        }

        public Criteria andMessDateEqualTo(Date value) {
            addCriterion("mess_date =", value, "messDate");
            return (Criteria) this;
        }

        public Criteria andMessDateNotEqualTo(Date value) {
            addCriterion("mess_date <>", value, "messDate");
            return (Criteria) this;
        }

        public Criteria andMessDateGreaterThan(Date value) {
            addCriterion("mess_date >", value, "messDate");
            return (Criteria) this;
        }

        public Criteria andMessDateGreaterThanOrEqualTo(Date value) {
            addCriterion("mess_date >=", value, "messDate");
            return (Criteria) this;
        }

        public Criteria andMessDateLessThan(Date value) {
            addCriterion("mess_date <", value, "messDate");
            return (Criteria) this;
        }

        public Criteria andMessDateLessThanOrEqualTo(Date value) {
            addCriterion("mess_date <=", value, "messDate");
            return (Criteria) this;
        }

        public Criteria andMessDateIn(List<Date> values) {
            addCriterion("mess_date in", values, "messDate");
            return (Criteria) this;
        }

        public Criteria andMessDateNotIn(List<Date> values) {
            addCriterion("mess_date not in", values, "messDate");
            return (Criteria) this;
        }

        public Criteria andMessDateBetween(Date value1, Date value2) {
            addCriterion("mess_date between", value1, value2, "messDate");
            return (Criteria) this;
        }

        public Criteria andMessDateNotBetween(Date value1, Date value2) {
            addCriterion("mess_date not between", value1, value2, "messDate");
            return (Criteria) this;
        }

        public Criteria andMessTypeIsNull() {
            addCriterion("mess_type is null");
            return (Criteria) this;
        }

        public Criteria andMessTypeIsNotNull() {
            addCriterion("mess_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessTypeEqualTo(String value) {
            addCriterion("mess_type =", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeNotEqualTo(String value) {
            addCriterion("mess_type <>", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeGreaterThan(String value) {
            addCriterion("mess_type >", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mess_type >=", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeLessThan(String value) {
            addCriterion("mess_type <", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeLessThanOrEqualTo(String value) {
            addCriterion("mess_type <=", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeLike(String value) {
            addCriterion("mess_type like", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeNotLike(String value) {
            addCriterion("mess_type not like", value, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeIn(List<String> values) {
            addCriterion("mess_type in", values, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeNotIn(List<String> values) {
            addCriterion("mess_type not in", values, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeBetween(String value1, String value2) {
            addCriterion("mess_type between", value1, value2, "messType");
            return (Criteria) this;
        }

        public Criteria andMessTypeNotBetween(String value1, String value2) {
            addCriterion("mess_type not between", value1, value2, "messType");
            return (Criteria) this;
        }

        public Criteria andSendRoleIsNull() {
            addCriterion("send_role is null");
            return (Criteria) this;
        }

        public Criteria andSendRoleIsNotNull() {
            addCriterion("send_role is not null");
            return (Criteria) this;
        }

        public Criteria andSendRoleEqualTo(String value) {
            addCriterion("send_role =", value, "sendRole");
            return (Criteria) this;
        }

        public Criteria andSendRoleNotEqualTo(String value) {
            addCriterion("send_role <>", value, "sendRole");
            return (Criteria) this;
        }

        public Criteria andSendRoleGreaterThan(String value) {
            addCriterion("send_role >", value, "sendRole");
            return (Criteria) this;
        }

        public Criteria andSendRoleGreaterThanOrEqualTo(String value) {
            addCriterion("send_role >=", value, "sendRole");
            return (Criteria) this;
        }

        public Criteria andSendRoleLessThan(String value) {
            addCriterion("send_role <", value, "sendRole");
            return (Criteria) this;
        }

        public Criteria andSendRoleLessThanOrEqualTo(String value) {
            addCriterion("send_role <=", value, "sendRole");
            return (Criteria) this;
        }

        public Criteria andSendRoleLike(String value) {
            addCriterion("send_role like", value, "sendRole");
            return (Criteria) this;
        }

        public Criteria andSendRoleNotLike(String value) {
            addCriterion("send_role not like", value, "sendRole");
            return (Criteria) this;
        }

        public Criteria andSendRoleIn(List<String> values) {
            addCriterion("send_role in", values, "sendRole");
            return (Criteria) this;
        }

        public Criteria andSendRoleNotIn(List<String> values) {
            addCriterion("send_role not in", values, "sendRole");
            return (Criteria) this;
        }

        public Criteria andSendRoleBetween(String value1, String value2) {
            addCriterion("send_role between", value1, value2, "sendRole");
            return (Criteria) this;
        }

        public Criteria andSendRoleNotBetween(String value1, String value2) {
            addCriterion("send_role not between", value1, value2, "sendRole");
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