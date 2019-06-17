package com.learning.spring.boot.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class TDictExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public TDictExample() {
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

        public Criteria andDictIdIsNull() {
            addCriterion("DICT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDictIdIsNotNull() {
            addCriterion("DICT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDictIdEqualTo(Long value) {
            addCriterion("DICT_ID =", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotEqualTo(Long value) {
            addCriterion("DICT_ID <>", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThan(Long value) {
            addCriterion("DICT_ID >", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DICT_ID >=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThan(Long value) {
            addCriterion("DICT_ID <", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdLessThanOrEqualTo(Long value) {
            addCriterion("DICT_ID <=", value, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdIn(List<Long> values) {
            addCriterion("DICT_ID in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotIn(List<Long> values) {
            addCriterion("DICT_ID not in", values, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdBetween(Long value1, Long value2) {
            addCriterion("DICT_ID between", value1, value2, "dictId");
            return (Criteria) this;
        }

        public Criteria andDictIdNotBetween(Long value1, Long value2) {
            addCriterion("DICT_ID not between", value1, value2, "dictId");
            return (Criteria) this;
        }

        public Criteria andKeyyIsNull() {
            addCriterion("KEYY is null");
            return (Criteria) this;
        }

        public Criteria andKeyyIsNotNull() {
            addCriterion("KEYY is not null");
            return (Criteria) this;
        }

        public Criteria andKeyyEqualTo(Long value) {
            addCriterion("KEYY =", value, "keyy");
            return (Criteria) this;
        }

        public Criteria andKeyyNotEqualTo(Long value) {
            addCriterion("KEYY <>", value, "keyy");
            return (Criteria) this;
        }

        public Criteria andKeyyGreaterThan(Long value) {
            addCriterion("KEYY >", value, "keyy");
            return (Criteria) this;
        }

        public Criteria andKeyyGreaterThanOrEqualTo(Long value) {
            addCriterion("KEYY >=", value, "keyy");
            return (Criteria) this;
        }

        public Criteria andKeyyLessThan(Long value) {
            addCriterion("KEYY <", value, "keyy");
            return (Criteria) this;
        }

        public Criteria andKeyyLessThanOrEqualTo(Long value) {
            addCriterion("KEYY <=", value, "keyy");
            return (Criteria) this;
        }

        public Criteria andKeyyIn(List<Long> values) {
            addCriterion("KEYY in", values, "keyy");
            return (Criteria) this;
        }

        public Criteria andKeyyNotIn(List<Long> values) {
            addCriterion("KEYY not in", values, "keyy");
            return (Criteria) this;
        }

        public Criteria andKeyyBetween(Long value1, Long value2) {
            addCriterion("KEYY between", value1, value2, "keyy");
            return (Criteria) this;
        }

        public Criteria andKeyyNotBetween(Long value1, Long value2) {
            addCriterion("KEYY not between", value1, value2, "keyy");
            return (Criteria) this;
        }

        public Criteria andValueeIsNull() {
            addCriterion("VALUEE is null");
            return (Criteria) this;
        }

        public Criteria andValueeIsNotNull() {
            addCriterion("VALUEE is not null");
            return (Criteria) this;
        }

        public Criteria andValueeEqualTo(String value) {
            addCriterion("VALUEE =", value, "valuee");
            return (Criteria) this;
        }

        public Criteria andValueeNotEqualTo(String value) {
            addCriterion("VALUEE <>", value, "valuee");
            return (Criteria) this;
        }

        public Criteria andValueeGreaterThan(String value) {
            addCriterion("VALUEE >", value, "valuee");
            return (Criteria) this;
        }

        public Criteria andValueeGreaterThanOrEqualTo(String value) {
            addCriterion("VALUEE >=", value, "valuee");
            return (Criteria) this;
        }

        public Criteria andValueeLessThan(String value) {
            addCriterion("VALUEE <", value, "valuee");
            return (Criteria) this;
        }

        public Criteria andValueeLessThanOrEqualTo(String value) {
            addCriterion("VALUEE <=", value, "valuee");
            return (Criteria) this;
        }

        public Criteria andValueeLike(String value) {
            addCriterion("VALUEE like", value, "valuee");
            return (Criteria) this;
        }

        public Criteria andValueeNotLike(String value) {
            addCriterion("VALUEE not like", value, "valuee");
            return (Criteria) this;
        }

        public Criteria andValueeIn(List<String> values) {
            addCriterion("VALUEE in", values, "valuee");
            return (Criteria) this;
        }

        public Criteria andValueeNotIn(List<String> values) {
            addCriterion("VALUEE not in", values, "valuee");
            return (Criteria) this;
        }

        public Criteria andValueeBetween(String value1, String value2) {
            addCriterion("VALUEE between", value1, value2, "valuee");
            return (Criteria) this;
        }

        public Criteria andValueeNotBetween(String value1, String value2) {
            addCriterion("VALUEE not between", value1, value2, "valuee");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNull() {
            addCriterion("FIELD_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFieldNameIsNotNull() {
            addCriterion("FIELD_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFieldNameEqualTo(String value) {
            addCriterion("FIELD_NAME =", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotEqualTo(String value) {
            addCriterion("FIELD_NAME <>", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThan(String value) {
            addCriterion("FIELD_NAME >", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameGreaterThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME >=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThan(String value) {
            addCriterion("FIELD_NAME <", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLessThanOrEqualTo(String value) {
            addCriterion("FIELD_NAME <=", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameLike(String value) {
            addCriterion("FIELD_NAME like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotLike(String value) {
            addCriterion("FIELD_NAME not like", value, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameIn(List<String> values) {
            addCriterion("FIELD_NAME in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotIn(List<String> values) {
            addCriterion("FIELD_NAME not in", values, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameBetween(String value1, String value2) {
            addCriterion("FIELD_NAME between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andFieldNameNotBetween(String value1, String value2) {
            addCriterion("FIELD_NAME not between", value1, value2, "fieldName");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("`TABLE_NAME` is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("`TABLE_NAME` is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("`TABLE_NAME` =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("`TABLE_NAME` <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("`TABLE_NAME` >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("`TABLE_NAME` >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("`TABLE_NAME` <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("`TABLE_NAME` <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("`TABLE_NAME` like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("`TABLE_NAME` not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("`TABLE_NAME` in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("`TABLE_NAME` not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("`TABLE_NAME` between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("`TABLE_NAME` not between", value1, value2, "tableName");
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