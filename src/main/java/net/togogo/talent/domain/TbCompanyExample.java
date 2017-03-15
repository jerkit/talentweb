package net.togogo.talent.domain;

import java.util.ArrayList;
import java.util.List;

public class TbCompanyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCompanyExample() {
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

        public Criteria andCompEmailIsNull() {
            addCriterion("comp_email is null");
            return (Criteria) this;
        }

        public Criteria andCompEmailIsNotNull() {
            addCriterion("comp_email is not null");
            return (Criteria) this;
        }

        public Criteria andCompEmailEqualTo(String value) {
            addCriterion("comp_email =", value, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompEmailNotEqualTo(String value) {
            addCriterion("comp_email <>", value, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompEmailGreaterThan(String value) {
            addCriterion("comp_email >", value, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompEmailGreaterThanOrEqualTo(String value) {
            addCriterion("comp_email >=", value, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompEmailLessThan(String value) {
            addCriterion("comp_email <", value, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompEmailLessThanOrEqualTo(String value) {
            addCriterion("comp_email <=", value, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompEmailLike(String value) {
            addCriterion("comp_email like", value, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompEmailNotLike(String value) {
            addCriterion("comp_email not like", value, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompEmailIn(List<String> values) {
            addCriterion("comp_email in", values, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompEmailNotIn(List<String> values) {
            addCriterion("comp_email not in", values, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompEmailBetween(String value1, String value2) {
            addCriterion("comp_email between", value1, value2, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompEmailNotBetween(String value1, String value2) {
            addCriterion("comp_email not between", value1, value2, "compEmail");
            return (Criteria) this;
        }

        public Criteria andCompPasswordIsNull() {
            addCriterion("comp_password is null");
            return (Criteria) this;
        }

        public Criteria andCompPasswordIsNotNull() {
            addCriterion("comp_password is not null");
            return (Criteria) this;
        }

        public Criteria andCompPasswordEqualTo(String value) {
            addCriterion("comp_password =", value, "compPassword");
            return (Criteria) this;
        }

        public Criteria andCompPasswordNotEqualTo(String value) {
            addCriterion("comp_password <>", value, "compPassword");
            return (Criteria) this;
        }

        public Criteria andCompPasswordGreaterThan(String value) {
            addCriterion("comp_password >", value, "compPassword");
            return (Criteria) this;
        }

        public Criteria andCompPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("comp_password >=", value, "compPassword");
            return (Criteria) this;
        }

        public Criteria andCompPasswordLessThan(String value) {
            addCriterion("comp_password <", value, "compPassword");
            return (Criteria) this;
        }

        public Criteria andCompPasswordLessThanOrEqualTo(String value) {
            addCriterion("comp_password <=", value, "compPassword");
            return (Criteria) this;
        }

        public Criteria andCompPasswordLike(String value) {
            addCriterion("comp_password like", value, "compPassword");
            return (Criteria) this;
        }

        public Criteria andCompPasswordNotLike(String value) {
            addCriterion("comp_password not like", value, "compPassword");
            return (Criteria) this;
        }

        public Criteria andCompPasswordIn(List<String> values) {
            addCriterion("comp_password in", values, "compPassword");
            return (Criteria) this;
        }

        public Criteria andCompPasswordNotIn(List<String> values) {
            addCriterion("comp_password not in", values, "compPassword");
            return (Criteria) this;
        }

        public Criteria andCompPasswordBetween(String value1, String value2) {
            addCriterion("comp_password between", value1, value2, "compPassword");
            return (Criteria) this;
        }

        public Criteria andCompPasswordNotBetween(String value1, String value2) {
            addCriterion("comp_password not between", value1, value2, "compPassword");
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

        public Criteria andCompInfoIsNull() {
            addCriterion("comp_info is null");
            return (Criteria) this;
        }

        public Criteria andCompInfoIsNotNull() {
            addCriterion("comp_info is not null");
            return (Criteria) this;
        }

        public Criteria andCompInfoEqualTo(String value) {
            addCriterion("comp_info =", value, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompInfoNotEqualTo(String value) {
            addCriterion("comp_info <>", value, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompInfoGreaterThan(String value) {
            addCriterion("comp_info >", value, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompInfoGreaterThanOrEqualTo(String value) {
            addCriterion("comp_info >=", value, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompInfoLessThan(String value) {
            addCriterion("comp_info <", value, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompInfoLessThanOrEqualTo(String value) {
            addCriterion("comp_info <=", value, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompInfoLike(String value) {
            addCriterion("comp_info like", value, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompInfoNotLike(String value) {
            addCriterion("comp_info not like", value, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompInfoIn(List<String> values) {
            addCriterion("comp_info in", values, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompInfoNotIn(List<String> values) {
            addCriterion("comp_info not in", values, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompInfoBetween(String value1, String value2) {
            addCriterion("comp_info between", value1, value2, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompInfoNotBetween(String value1, String value2) {
            addCriterion("comp_info not between", value1, value2, "compInfo");
            return (Criteria) this;
        }

        public Criteria andCompLogoIsNull() {
            addCriterion("comp_logo is null");
            return (Criteria) this;
        }

        public Criteria andCompLogoIsNotNull() {
            addCriterion("comp_logo is not null");
            return (Criteria) this;
        }

        public Criteria andCompLogoEqualTo(String value) {
            addCriterion("comp_logo =", value, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompLogoNotEqualTo(String value) {
            addCriterion("comp_logo <>", value, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompLogoGreaterThan(String value) {
            addCriterion("comp_logo >", value, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompLogoGreaterThanOrEqualTo(String value) {
            addCriterion("comp_logo >=", value, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompLogoLessThan(String value) {
            addCriterion("comp_logo <", value, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompLogoLessThanOrEqualTo(String value) {
            addCriterion("comp_logo <=", value, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompLogoLike(String value) {
            addCriterion("comp_logo like", value, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompLogoNotLike(String value) {
            addCriterion("comp_logo not like", value, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompLogoIn(List<String> values) {
            addCriterion("comp_logo in", values, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompLogoNotIn(List<String> values) {
            addCriterion("comp_logo not in", values, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompLogoBetween(String value1, String value2) {
            addCriterion("comp_logo between", value1, value2, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompLogoNotBetween(String value1, String value2) {
            addCriterion("comp_logo not between", value1, value2, "compLogo");
            return (Criteria) this;
        }

        public Criteria andCompAddressIsNull() {
            addCriterion("comp_address is null");
            return (Criteria) this;
        }

        public Criteria andCompAddressIsNotNull() {
            addCriterion("comp_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompAddressEqualTo(String value) {
            addCriterion("comp_address =", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressNotEqualTo(String value) {
            addCriterion("comp_address <>", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressGreaterThan(String value) {
            addCriterion("comp_address >", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressGreaterThanOrEqualTo(String value) {
            addCriterion("comp_address >=", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressLessThan(String value) {
            addCriterion("comp_address <", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressLessThanOrEqualTo(String value) {
            addCriterion("comp_address <=", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressLike(String value) {
            addCriterion("comp_address like", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressNotLike(String value) {
            addCriterion("comp_address not like", value, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressIn(List<String> values) {
            addCriterion("comp_address in", values, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressNotIn(List<String> values) {
            addCriterion("comp_address not in", values, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressBetween(String value1, String value2) {
            addCriterion("comp_address between", value1, value2, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompAddressNotBetween(String value1, String value2) {
            addCriterion("comp_address not between", value1, value2, "compAddress");
            return (Criteria) this;
        }

        public Criteria andCompFocusIsNull() {
            addCriterion("comp_focus is null");
            return (Criteria) this;
        }

        public Criteria andCompFocusIsNotNull() {
            addCriterion("comp_focus is not null");
            return (Criteria) this;
        }

        public Criteria andCompFocusEqualTo(String value) {
            addCriterion("comp_focus =", value, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompFocusNotEqualTo(String value) {
            addCriterion("comp_focus <>", value, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompFocusGreaterThan(String value) {
            addCriterion("comp_focus >", value, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompFocusGreaterThanOrEqualTo(String value) {
            addCriterion("comp_focus >=", value, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompFocusLessThan(String value) {
            addCriterion("comp_focus <", value, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompFocusLessThanOrEqualTo(String value) {
            addCriterion("comp_focus <=", value, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompFocusLike(String value) {
            addCriterion("comp_focus like", value, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompFocusNotLike(String value) {
            addCriterion("comp_focus not like", value, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompFocusIn(List<String> values) {
            addCriterion("comp_focus in", values, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompFocusNotIn(List<String> values) {
            addCriterion("comp_focus not in", values, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompFocusBetween(String value1, String value2) {
            addCriterion("comp_focus between", value1, value2, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompFocusNotBetween(String value1, String value2) {
            addCriterion("comp_focus not between", value1, value2, "compFocus");
            return (Criteria) this;
        }

        public Criteria andCompLicenseIsNull() {
            addCriterion("comp_license is null");
            return (Criteria) this;
        }

        public Criteria andCompLicenseIsNotNull() {
            addCriterion("comp_license is not null");
            return (Criteria) this;
        }

        public Criteria andCompLicenseEqualTo(String value) {
            addCriterion("comp_license =", value, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompLicenseNotEqualTo(String value) {
            addCriterion("comp_license <>", value, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompLicenseGreaterThan(String value) {
            addCriterion("comp_license >", value, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("comp_license >=", value, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompLicenseLessThan(String value) {
            addCriterion("comp_license <", value, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompLicenseLessThanOrEqualTo(String value) {
            addCriterion("comp_license <=", value, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompLicenseLike(String value) {
            addCriterion("comp_license like", value, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompLicenseNotLike(String value) {
            addCriterion("comp_license not like", value, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompLicenseIn(List<String> values) {
            addCriterion("comp_license in", values, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompLicenseNotIn(List<String> values) {
            addCriterion("comp_license not in", values, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompLicenseBetween(String value1, String value2) {
            addCriterion("comp_license between", value1, value2, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompLicenseNotBetween(String value1, String value2) {
            addCriterion("comp_license not between", value1, value2, "compLicense");
            return (Criteria) this;
        }

        public Criteria andCompPhoneIsNull() {
            addCriterion("comp_phone is null");
            return (Criteria) this;
        }

        public Criteria andCompPhoneIsNotNull() {
            addCriterion("comp_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCompPhoneEqualTo(String value) {
            addCriterion("comp_phone =", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneNotEqualTo(String value) {
            addCriterion("comp_phone <>", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneGreaterThan(String value) {
            addCriterion("comp_phone >", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("comp_phone >=", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneLessThan(String value) {
            addCriterion("comp_phone <", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneLessThanOrEqualTo(String value) {
            addCriterion("comp_phone <=", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneLike(String value) {
            addCriterion("comp_phone like", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneNotLike(String value) {
            addCriterion("comp_phone not like", value, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneIn(List<String> values) {
            addCriterion("comp_phone in", values, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneNotIn(List<String> values) {
            addCriterion("comp_phone not in", values, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneBetween(String value1, String value2) {
            addCriterion("comp_phone between", value1, value2, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompPhoneNotBetween(String value1, String value2) {
            addCriterion("comp_phone not between", value1, value2, "compPhone");
            return (Criteria) this;
        }

        public Criteria andCompStateIsNull() {
            addCriterion("comp_state is null");
            return (Criteria) this;
        }

        public Criteria andCompStateIsNotNull() {
            addCriterion("comp_state is not null");
            return (Criteria) this;
        }

        public Criteria andCompStateEqualTo(Integer value) {
            addCriterion("comp_state =", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateNotEqualTo(Integer value) {
            addCriterion("comp_state <>", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateGreaterThan(Integer value) {
            addCriterion("comp_state >", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("comp_state >=", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateLessThan(Integer value) {
            addCriterion("comp_state <", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateLessThanOrEqualTo(Integer value) {
            addCriterion("comp_state <=", value, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateIn(List<Integer> values) {
            addCriterion("comp_state in", values, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateNotIn(List<Integer> values) {
            addCriterion("comp_state not in", values, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateBetween(Integer value1, Integer value2) {
            addCriterion("comp_state between", value1, value2, "compState");
            return (Criteria) this;
        }

        public Criteria andCompStateNotBetween(Integer value1, Integer value2) {
            addCriterion("comp_state not between", value1, value2, "compState");
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