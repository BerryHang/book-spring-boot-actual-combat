package com.learning.spring.boot.domain.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TComRoleMenuRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TComRoleMenuRelationExample() {
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

        public Criteria andRoleMenuRelationIdIsNull() {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleMenuRelationIdIsNotNull() {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleMenuRelationIdEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id =", value, "roleMenuRelationId");
            return (Criteria) this;
        }

        public Criteria andRoleMenuRelationIdNotEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id <>", value, "roleMenuRelationId");
            return (Criteria) this;
        }

        public Criteria andRoleMenuRelationIdGreaterThan(Integer value) {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id >", value, "roleMenuRelationId");
            return (Criteria) this;
        }

        public Criteria andRoleMenuRelationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id >=", value, "roleMenuRelationId");
            return (Criteria) this;
        }

        public Criteria andRoleMenuRelationIdLessThan(Integer value) {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id <", value, "roleMenuRelationId");
            return (Criteria) this;
        }

        public Criteria andRoleMenuRelationIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id <=", value, "roleMenuRelationId");
            return (Criteria) this;
        }

        public Criteria andRoleMenuRelationIdIn(List<Integer> values) {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id in", values, "roleMenuRelationId");
            return (Criteria) this;
        }

        public Criteria andRoleMenuRelationIdNotIn(List<Integer> values) {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id not in", values, "roleMenuRelationId");
            return (Criteria) this;
        }

        public Criteria andRoleMenuRelationIdBetween(Integer value1, Integer value2) {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id between", value1, value2, "roleMenuRelationId");
            return (Criteria) this;
        }

        public Criteria andRoleMenuRelationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_com_role_menu_relation.role_menu_relation_id not between", value1, value2, "roleMenuRelationId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("t_com_role_menu_relation.menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("t_com_role_menu_relation.menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("t_com_role_menu_relation.menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("t_com_role_menu_relation.menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("t_com_role_menu_relation.menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("t_com_role_menu_relation.menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("t_com_role_menu_relation.menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_com_role_menu_relation.menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("t_com_role_menu_relation.role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("t_com_role_menu_relation.role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(Integer value) {
            addCriterion("t_com_role_menu_relation.role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(Integer value) {
            addCriterion("t_com_role_menu_relation.role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<Integer> values) {
            addCriterion("t_com_role_menu_relation.role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<Integer> values) {
            addCriterion("t_com_role_menu_relation.role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("t_com_role_menu_relation.role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_com_role_menu_relation.role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("t_com_role_menu_relation.version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("t_com_role_menu_relation.version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(Short value) {
            addCriterion("t_com_role_menu_relation.version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(Short value) {
            addCriterion("t_com_role_menu_relation.version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(Short value) {
            addCriterion("t_com_role_menu_relation.version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(Short value) {
            addCriterion("t_com_role_menu_relation.version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(Short value) {
            addCriterion("t_com_role_menu_relation.version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(Short value) {
            addCriterion("t_com_role_menu_relation.version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<Short> values) {
            addCriterion("t_com_role_menu_relation.version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<Short> values) {
            addCriterion("t_com_role_menu_relation.version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(Short value1, Short value2) {
            addCriterion("t_com_role_menu_relation.version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(Short value1, Short value2) {
            addCriterion("t_com_role_menu_relation.version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("t_com_role_menu_relation.flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("t_com_role_menu_relation.flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Boolean value) {
            addCriterion("t_com_role_menu_relation.flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Boolean value) {
            addCriterion("t_com_role_menu_relation.flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Boolean value) {
            addCriterion("t_com_role_menu_relation.flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("t_com_role_menu_relation.flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Boolean value) {
            addCriterion("t_com_role_menu_relation.flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("t_com_role_menu_relation.flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Boolean> values) {
            addCriterion("t_com_role_menu_relation.flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Boolean> values) {
            addCriterion("t_com_role_menu_relation.flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("t_com_role_menu_relation.flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("t_com_role_menu_relation.flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("t_com_role_menu_relation.create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("t_com_role_menu_relation.create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(Integer value) {
            addCriterion("t_com_role_menu_relation.create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(Integer value) {
            addCriterion("t_com_role_menu_relation.create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<Integer> values) {
            addCriterion("t_com_role_menu_relation.create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<Integer> values) {
            addCriterion("t_com_role_menu_relation.create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(Integer value1, Integer value2) {
            addCriterion("t_com_role_menu_relation.create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(Integer value1, Integer value2) {
            addCriterion("t_com_role_menu_relation.create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("t_com_role_menu_relation.create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("t_com_role_menu_relation.create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("t_com_role_menu_relation.create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("t_com_role_menu_relation.create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("t_com_role_menu_relation.create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_com_role_menu_relation.create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("t_com_role_menu_relation.create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_com_role_menu_relation.create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("t_com_role_menu_relation.create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("t_com_role_menu_relation.create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("t_com_role_menu_relation.create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_com_role_menu_relation.create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("t_com_role_menu_relation.update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("t_com_role_menu_relation.update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(Integer value) {
            addCriterion("t_com_role_menu_relation.update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(Integer value) {
            addCriterion("t_com_role_menu_relation.update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(Integer value) {
            addCriterion("t_com_role_menu_relation.update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<Integer> values) {
            addCriterion("t_com_role_menu_relation.update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<Integer> values) {
            addCriterion("t_com_role_menu_relation.update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(Integer value1, Integer value2) {
            addCriterion("t_com_role_menu_relation.update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(Integer value1, Integer value2) {
            addCriterion("t_com_role_menu_relation.update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("t_com_role_menu_relation.update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("t_com_role_menu_relation.update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("t_com_role_menu_relation.update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("t_com_role_menu_relation.update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("t_com_role_menu_relation.update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t_com_role_menu_relation.update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("t_com_role_menu_relation.update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("t_com_role_menu_relation.update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("t_com_role_menu_relation.update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("t_com_role_menu_relation.update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("t_com_role_menu_relation.update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("t_com_role_menu_relation.update_time not between", value1, value2, "updateTime");
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