package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.List;

public class FilergbsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public FilergbsExample() {
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

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getOffset() {
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

        public Criteria andFilenameIsNull() {
            addCriterion("fileName is null");
            return (Criteria) this;
        }

        public Criteria andFilenameIsNotNull() {
            addCriterion("fileName is not null");
            return (Criteria) this;
        }

        public Criteria andFilenameEqualTo(String value) {
            addCriterion("fileName =", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotEqualTo(String value) {
            addCriterion("fileName <>", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThan(String value) {
            addCriterion("fileName >", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameGreaterThanOrEqualTo(String value) {
            addCriterion("fileName >=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThan(String value) {
            addCriterion("fileName <", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLessThanOrEqualTo(String value) {
            addCriterion("fileName <=", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameLike(String value) {
            addCriterion("fileName like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotLike(String value) {
            addCriterion("fileName not like", value, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameIn(List<String> values) {
            addCriterion("fileName in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotIn(List<String> values) {
            addCriterion("fileName not in", values, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameBetween(String value1, String value2) {
            addCriterion("fileName between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andFilenameNotBetween(String value1, String value2) {
            addCriterion("fileName not between", value1, value2, "filename");
            return (Criteria) this;
        }

        public Criteria andRIsNull() {
            addCriterion("r is null");
            return (Criteria) this;
        }

        public Criteria andRIsNotNull() {
            addCriterion("r is not null");
            return (Criteria) this;
        }

        public Criteria andREqualTo(Integer value) {
            addCriterion("r =", value, "r");
            return (Criteria) this;
        }

        public Criteria andRNotEqualTo(Integer value) {
            addCriterion("r <>", value, "r");
            return (Criteria) this;
        }

        public Criteria andRGreaterThan(Integer value) {
            addCriterion("r >", value, "r");
            return (Criteria) this;
        }

        public Criteria andRGreaterThanOrEqualTo(Integer value) {
            addCriterion("r >=", value, "r");
            return (Criteria) this;
        }

        public Criteria andRLessThan(Integer value) {
            addCriterion("r <", value, "r");
            return (Criteria) this;
        }

        public Criteria andRLessThanOrEqualTo(Integer value) {
            addCriterion("r <=", value, "r");
            return (Criteria) this;
        }

        public Criteria andRIn(List<Integer> values) {
            addCriterion("r in", values, "r");
            return (Criteria) this;
        }

        public Criteria andRNotIn(List<Integer> values) {
            addCriterion("r not in", values, "r");
            return (Criteria) this;
        }

        public Criteria andRBetween(Integer value1, Integer value2) {
            addCriterion("r between", value1, value2, "r");
            return (Criteria) this;
        }

        public Criteria andRNotBetween(Integer value1, Integer value2) {
            addCriterion("r not between", value1, value2, "r");
            return (Criteria) this;
        }

        public Criteria andGIsNull() {
            addCriterion("g is null");
            return (Criteria) this;
        }

        public Criteria andGIsNotNull() {
            addCriterion("g is not null");
            return (Criteria) this;
        }

        public Criteria andGEqualTo(Integer value) {
            addCriterion("g =", value, "g");
            return (Criteria) this;
        }

        public Criteria andGNotEqualTo(Integer value) {
            addCriterion("g <>", value, "g");
            return (Criteria) this;
        }

        public Criteria andGGreaterThan(Integer value) {
            addCriterion("g >", value, "g");
            return (Criteria) this;
        }

        public Criteria andGGreaterThanOrEqualTo(Integer value) {
            addCriterion("g >=", value, "g");
            return (Criteria) this;
        }

        public Criteria andGLessThan(Integer value) {
            addCriterion("g <", value, "g");
            return (Criteria) this;
        }

        public Criteria andGLessThanOrEqualTo(Integer value) {
            addCriterion("g <=", value, "g");
            return (Criteria) this;
        }

        public Criteria andGIn(List<Integer> values) {
            addCriterion("g in", values, "g");
            return (Criteria) this;
        }

        public Criteria andGNotIn(List<Integer> values) {
            addCriterion("g not in", values, "g");
            return (Criteria) this;
        }

        public Criteria andGBetween(Integer value1, Integer value2) {
            addCriterion("g between", value1, value2, "g");
            return (Criteria) this;
        }

        public Criteria andGNotBetween(Integer value1, Integer value2) {
            addCriterion("g not between", value1, value2, "g");
            return (Criteria) this;
        }

        public Criteria andBIsNull() {
            addCriterion("b is null");
            return (Criteria) this;
        }

        public Criteria andBIsNotNull() {
            addCriterion("b is not null");
            return (Criteria) this;
        }

        public Criteria andBEqualTo(Integer value) {
            addCriterion("b =", value, "b");
            return (Criteria) this;
        }

        public Criteria andBNotEqualTo(Integer value) {
            addCriterion("b <>", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThan(Integer value) {
            addCriterion("b >", value, "b");
            return (Criteria) this;
        }

        public Criteria andBGreaterThanOrEqualTo(Integer value) {
            addCriterion("b >=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThan(Integer value) {
            addCriterion("b <", value, "b");
            return (Criteria) this;
        }

        public Criteria andBLessThanOrEqualTo(Integer value) {
            addCriterion("b <=", value, "b");
            return (Criteria) this;
        }

        public Criteria andBIn(List<Integer> values) {
            addCriterion("b in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBNotIn(List<Integer> values) {
            addCriterion("b not in", values, "b");
            return (Criteria) this;
        }

        public Criteria andBBetween(Integer value1, Integer value2) {
            addCriterion("b between", value1, value2, "b");
            return (Criteria) this;
        }

        public Criteria andBNotBetween(Integer value1, Integer value2) {
            addCriterion("b not between", value1, value2, "b");
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