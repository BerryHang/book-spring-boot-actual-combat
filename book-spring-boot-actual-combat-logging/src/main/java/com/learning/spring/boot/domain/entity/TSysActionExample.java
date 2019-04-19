package com.learning.spring.boot.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TSysActionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TSysActionExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andActionIdIsNull() {
            addCriterion("t_sys_action.action_id is null");
            return (Criteria) this;
        }

        public Criteria andActionIdIsNotNull() {
            addCriterion("t_sys_action.action_id is not null");
            return (Criteria) this;
        }

        public Criteria andActionIdEqualTo(Integer value) {
            addCriterion("t_sys_action.action_id =", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotEqualTo(Integer value) {
            addCriterion("t_sys_action.action_id <>", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThan(Integer value) {
            addCriterion("t_sys_action.action_id >", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_sys_action.action_id >=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThan(Integer value) {
            addCriterion("t_sys_action.action_id <", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_sys_action.action_id <=", value, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdIn(List<Integer> values) {
            addCriterion("t_sys_action.action_id in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotIn(List<Integer> values) {
            addCriterion("t_sys_action.action_id not in", values, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdBetween(Integer value1, Integer value2) {
            addCriterion("t_sys_action.action_id between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_sys_action.action_id not between", value1, value2, "actionId");
            return (Criteria) this;
        }

        public Criteria andActionNameIsNull() {
            addCriterion("t_sys_action.action_name is null");
            return (Criteria) this;
        }

        public Criteria andActionNameIsNotNull() {
            addCriterion("t_sys_action.action_name is not null");
            return (Criteria) this;
        }

        public Criteria andActionNameEqualTo(String value) {
            addCriterion("t_sys_action.action_name =", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotEqualTo(String value) {
            addCriterion("t_sys_action.action_name <>", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThan(String value) {
            addCriterion("t_sys_action.action_name >", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameGreaterThanOrEqualTo(String value) {
            addCriterion("t_sys_action.action_name >=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThan(String value) {
            addCriterion("t_sys_action.action_name <", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLessThanOrEqualTo(String value) {
            addCriterion("t_sys_action.action_name <=", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameLike(String value) {
            addCriterion("t_sys_action.action_name like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotLike(String value) {
            addCriterion("t_sys_action.action_name not like", value, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameIn(List<String> values) {
            addCriterion("t_sys_action.action_name in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotIn(List<String> values) {
            addCriterion("t_sys_action.action_name not in", values, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameBetween(String value1, String value2) {
            addCriterion("t_sys_action.action_name between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andActionNameNotBetween(String value1, String value2) {
            addCriterion("t_sys_action.action_name not between", value1, value2, "actionName");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("t_sys_action.menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("t_sys_action.menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("t_sys_action.menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("t_sys_action.menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("t_sys_action.menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_sys_action.menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("t_sys_action.menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_sys_action.menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("t_sys_action.menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("t_sys_action.menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("t_sys_action.menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_sys_action.menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andPermissionsIsNull() {
            addCriterion("t_sys_action.permissions is null");
            return (Criteria) this;
        }

        public Criteria andPermissionsIsNotNull() {
            addCriterion("t_sys_action.permissions is not null");
            return (Criteria) this;
        }

        public Criteria andPermissionsEqualTo(String value) {
            addCriterion("t_sys_action.permissions =", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsNotEqualTo(String value) {
            addCriterion("t_sys_action.permissions <>", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsGreaterThan(String value) {
            addCriterion("t_sys_action.permissions >", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsGreaterThanOrEqualTo(String value) {
            addCriterion("t_sys_action.permissions >=", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsLessThan(String value) {
            addCriterion("t_sys_action.permissions <", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsLessThanOrEqualTo(String value) {
            addCriterion("t_sys_action.permissions <=", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsLike(String value) {
            addCriterion("t_sys_action.permissions like", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsNotLike(String value) {
            addCriterion("t_sys_action.permissions not like", value, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsIn(List<String> values) {
            addCriterion("t_sys_action.permissions in", values, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsNotIn(List<String> values) {
            addCriterion("t_sys_action.permissions not in", values, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsBetween(String value1, String value2) {
            addCriterion("t_sys_action.permissions between", value1, value2, "permissions");
            return (Criteria) this;
        }

        public Criteria andPermissionsNotBetween(String value1, String value2) {
            addCriterion("t_sys_action.permissions not between", value1, value2, "permissions");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("t_sys_action.description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("t_sys_action.description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("t_sys_action.description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("t_sys_action.description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("t_sys_action.description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("t_sys_action.description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("t_sys_action.description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("t_sys_action.description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("t_sys_action.description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("t_sys_action.description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("t_sys_action.description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("t_sys_action.description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("t_sys_action.description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("t_sys_action.description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("t_sys_action.sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("t_sys_action.sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Byte value) {
            addCriterion("t_sys_action.sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Byte value) {
            addCriterion("t_sys_action.sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Byte value) {
            addCriterion("t_sys_action.sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Byte value) {
            addCriterion("t_sys_action.sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Byte value) {
            addCriterion("t_sys_action.sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Byte value) {
            addCriterion("t_sys_action.sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Byte> values) {
            addCriterion("t_sys_action.sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Byte> values) {
            addCriterion("t_sys_action.sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Byte value1, Byte value2) {
            addCriterion("t_sys_action.sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Byte value1, Byte value2) {
            addCriterion("t_sys_action.sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("t_sys_action.version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("t_sys_action.version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Short value) {
            addCriterion("t_sys_action.version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Short value) {
            addCriterion("t_sys_action.version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Short value) {
            addCriterion("t_sys_action.version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Short value) {
            addCriterion("t_sys_action.version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Short value) {
            addCriterion("t_sys_action.version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Short value) {
            addCriterion("t_sys_action.version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Short> values) {
            addCriterion("t_sys_action.version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Short> values) {
            addCriterion("t_sys_action.version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Short value1, Short value2) {
            addCriterion("t_sys_action.version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Short value1, Short value2) {
            addCriterion("t_sys_action.version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("t_sys_action.flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("t_sys_action.flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Boolean value) {
            addCriterion("t_sys_action.flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Boolean value) {
            addCriterion("t_sys_action.flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Boolean value) {
            addCriterion("t_sys_action.flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("t_sys_action.flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Boolean value) {
            addCriterion("t_sys_action.flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("t_sys_action.flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Boolean> values) {
            addCriterion("t_sys_action.flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Boolean> values) {
            addCriterion("t_sys_action.flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("t_sys_action.flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("t_sys_action.flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("t_sys_action.create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("t_sys_action.create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Integer value) {
            addCriterion("t_sys_action.create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Integer value) {
            addCriterion("t_sys_action.create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Integer value) {
            addCriterion("t_sys_action.create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_sys_action.create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Integer value) {
            addCriterion("t_sys_action.create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Integer value) {
            addCriterion("t_sys_action.create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Integer> values) {
            addCriterion("t_sys_action.create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Integer> values) {
            addCriterion("t_sys_action.create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Integer value1, Integer value2) {
            addCriterion("t_sys_action.create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Integer value1, Integer value2) {
            addCriterion("t_sys_action.create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("t_sys_action.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("t_sys_action.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("t_sys_action.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("t_sys_action.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("t_sys_action.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_sys_action.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("t_sys_action.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_sys_action.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("t_sys_action.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("t_sys_action.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("t_sys_action.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_sys_action.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("t_sys_action.update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("t_sys_action.update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("t_sys_action.update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("t_sys_action.update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("t_sys_action.update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_sys_action.update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("t_sys_action.update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("t_sys_action.update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("t_sys_action.update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("t_sys_action.update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("t_sys_action.update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("t_sys_action.update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("t_sys_action.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("t_sys_action.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("t_sys_action.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("t_sys_action.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("t_sys_action.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_sys_action.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("t_sys_action.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_sys_action.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("t_sys_action.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("t_sys_action.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("t_sys_action.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_sys_action.update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    /**
     */
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