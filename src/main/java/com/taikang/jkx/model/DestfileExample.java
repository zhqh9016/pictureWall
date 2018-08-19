package com.taikang.jkx.model;

import java.util.ArrayList;
import java.util.List;

public class DestfileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Integer offset;

    public DestfileExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDstFileNameIsNull() {
            addCriterion("dst_file_name is null");
            return (Criteria) this;
        }

        public Criteria andDstFileNameIsNotNull() {
            addCriterion("dst_file_name is not null");
            return (Criteria) this;
        }

        public Criteria andDstFileNameEqualTo(String value) {
            addCriterion("dst_file_name =", value, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andDstFileNameNotEqualTo(String value) {
            addCriterion("dst_file_name <>", value, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andDstFileNameGreaterThan(String value) {
            addCriterion("dst_file_name >", value, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andDstFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("dst_file_name >=", value, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andDstFileNameLessThan(String value) {
            addCriterion("dst_file_name <", value, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andDstFileNameLessThanOrEqualTo(String value) {
            addCriterion("dst_file_name <=", value, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andDstFileNameLike(String value) {
            addCriterion("dst_file_name like", value, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andDstFileNameNotLike(String value) {
            addCriterion("dst_file_name not like", value, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andDstFileNameIn(List<String> values) {
            addCriterion("dst_file_name in", values, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andDstFileNameNotIn(List<String> values) {
            addCriterion("dst_file_name not in", values, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andDstFileNameBetween(String value1, String value2) {
            addCriterion("dst_file_name between", value1, value2, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andDstFileNameNotBetween(String value1, String value2) {
            addCriterion("dst_file_name not between", value1, value2, "dstFileName");
            return (Criteria) this;
        }

        public Criteria andXIsNull() {
            addCriterion("x is null");
            return (Criteria) this;
        }

        public Criteria andXIsNotNull() {
            addCriterion("x is not null");
            return (Criteria) this;
        }

        public Criteria andXEqualTo(Integer value) {
            addCriterion("x =", value, "x");
            return (Criteria) this;
        }

        public Criteria andXNotEqualTo(Integer value) {
            addCriterion("x <>", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThan(Integer value) {
            addCriterion("x >", value, "x");
            return (Criteria) this;
        }

        public Criteria andXGreaterThanOrEqualTo(Integer value) {
            addCriterion("x >=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThan(Integer value) {
            addCriterion("x <", value, "x");
            return (Criteria) this;
        }

        public Criteria andXLessThanOrEqualTo(Integer value) {
            addCriterion("x <=", value, "x");
            return (Criteria) this;
        }

        public Criteria andXIn(List<Integer> values) {
            addCriterion("x in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXNotIn(List<Integer> values) {
            addCriterion("x not in", values, "x");
            return (Criteria) this;
        }

        public Criteria andXBetween(Integer value1, Integer value2) {
            addCriterion("x between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andXNotBetween(Integer value1, Integer value2) {
            addCriterion("x not between", value1, value2, "x");
            return (Criteria) this;
        }

        public Criteria andYIsNull() {
            addCriterion("y is null");
            return (Criteria) this;
        }

        public Criteria andYIsNotNull() {
            addCriterion("y is not null");
            return (Criteria) this;
        }

        public Criteria andYEqualTo(Integer value) {
            addCriterion("y =", value, "y");
            return (Criteria) this;
        }

        public Criteria andYNotEqualTo(Integer value) {
            addCriterion("y <>", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThan(Integer value) {
            addCriterion("y >", value, "y");
            return (Criteria) this;
        }

        public Criteria andYGreaterThanOrEqualTo(Integer value) {
            addCriterion("y >=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThan(Integer value) {
            addCriterion("y <", value, "y");
            return (Criteria) this;
        }

        public Criteria andYLessThanOrEqualTo(Integer value) {
            addCriterion("y <=", value, "y");
            return (Criteria) this;
        }

        public Criteria andYIn(List<Integer> values) {
            addCriterion("y in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYNotIn(List<Integer> values) {
            addCriterion("y not in", values, "y");
            return (Criteria) this;
        }

        public Criteria andYBetween(Integer value1, Integer value2) {
            addCriterion("y between", value1, value2, "y");
            return (Criteria) this;
        }

        public Criteria andYNotBetween(Integer value1, Integer value2) {
            addCriterion("y not between", value1, value2, "y");
            return (Criteria) this;
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

        public Criteria andSourceRIsNull() {
            addCriterion("source_r is null");
            return (Criteria) this;
        }

        public Criteria andSourceRIsNotNull() {
            addCriterion("source_r is not null");
            return (Criteria) this;
        }

        public Criteria andSourceREqualTo(Integer value) {
            addCriterion("source_r =", value, "sourceR");
            return (Criteria) this;
        }

        public Criteria andSourceRNotEqualTo(Integer value) {
            addCriterion("source_r <>", value, "sourceR");
            return (Criteria) this;
        }

        public Criteria andSourceRGreaterThan(Integer value) {
            addCriterion("source_r >", value, "sourceR");
            return (Criteria) this;
        }

        public Criteria andSourceRGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_r >=", value, "sourceR");
            return (Criteria) this;
        }

        public Criteria andSourceRLessThan(Integer value) {
            addCriterion("source_r <", value, "sourceR");
            return (Criteria) this;
        }

        public Criteria andSourceRLessThanOrEqualTo(Integer value) {
            addCriterion("source_r <=", value, "sourceR");
            return (Criteria) this;
        }

        public Criteria andSourceRIn(List<Integer> values) {
            addCriterion("source_r in", values, "sourceR");
            return (Criteria) this;
        }

        public Criteria andSourceRNotIn(List<Integer> values) {
            addCriterion("source_r not in", values, "sourceR");
            return (Criteria) this;
        }

        public Criteria andSourceRBetween(Integer value1, Integer value2) {
            addCriterion("source_r between", value1, value2, "sourceR");
            return (Criteria) this;
        }

        public Criteria andSourceRNotBetween(Integer value1, Integer value2) {
            addCriterion("source_r not between", value1, value2, "sourceR");
            return (Criteria) this;
        }

        public Criteria andSourceGIsNull() {
            addCriterion("source_g is null");
            return (Criteria) this;
        }

        public Criteria andSourceGIsNotNull() {
            addCriterion("source_g is not null");
            return (Criteria) this;
        }

        public Criteria andSourceGEqualTo(Integer value) {
            addCriterion("source_g =", value, "sourceG");
            return (Criteria) this;
        }

        public Criteria andSourceGNotEqualTo(Integer value) {
            addCriterion("source_g <>", value, "sourceG");
            return (Criteria) this;
        }

        public Criteria andSourceGGreaterThan(Integer value) {
            addCriterion("source_g >", value, "sourceG");
            return (Criteria) this;
        }

        public Criteria andSourceGGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_g >=", value, "sourceG");
            return (Criteria) this;
        }

        public Criteria andSourceGLessThan(Integer value) {
            addCriterion("source_g <", value, "sourceG");
            return (Criteria) this;
        }

        public Criteria andSourceGLessThanOrEqualTo(Integer value) {
            addCriterion("source_g <=", value, "sourceG");
            return (Criteria) this;
        }

        public Criteria andSourceGIn(List<Integer> values) {
            addCriterion("source_g in", values, "sourceG");
            return (Criteria) this;
        }

        public Criteria andSourceGNotIn(List<Integer> values) {
            addCriterion("source_g not in", values, "sourceG");
            return (Criteria) this;
        }

        public Criteria andSourceGBetween(Integer value1, Integer value2) {
            addCriterion("source_g between", value1, value2, "sourceG");
            return (Criteria) this;
        }

        public Criteria andSourceGNotBetween(Integer value1, Integer value2) {
            addCriterion("source_g not between", value1, value2, "sourceG");
            return (Criteria) this;
        }

        public Criteria andSourceBIsNull() {
            addCriterion("source_b is null");
            return (Criteria) this;
        }

        public Criteria andSourceBIsNotNull() {
            addCriterion("source_b is not null");
            return (Criteria) this;
        }

        public Criteria andSourceBEqualTo(Integer value) {
            addCriterion("source_b =", value, "sourceB");
            return (Criteria) this;
        }

        public Criteria andSourceBNotEqualTo(Integer value) {
            addCriterion("source_b <>", value, "sourceB");
            return (Criteria) this;
        }

        public Criteria andSourceBGreaterThan(Integer value) {
            addCriterion("source_b >", value, "sourceB");
            return (Criteria) this;
        }

        public Criteria andSourceBGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_b >=", value, "sourceB");
            return (Criteria) this;
        }

        public Criteria andSourceBLessThan(Integer value) {
            addCriterion("source_b <", value, "sourceB");
            return (Criteria) this;
        }

        public Criteria andSourceBLessThanOrEqualTo(Integer value) {
            addCriterion("source_b <=", value, "sourceB");
            return (Criteria) this;
        }

        public Criteria andSourceBIn(List<Integer> values) {
            addCriterion("source_b in", values, "sourceB");
            return (Criteria) this;
        }

        public Criteria andSourceBNotIn(List<Integer> values) {
            addCriterion("source_b not in", values, "sourceB");
            return (Criteria) this;
        }

        public Criteria andSourceBBetween(Integer value1, Integer value2) {
            addCriterion("source_b between", value1, value2, "sourceB");
            return (Criteria) this;
        }

        public Criteria andSourceBNotBetween(Integer value1, Integer value2) {
            addCriterion("source_b not between", value1, value2, "sourceB");
            return (Criteria) this;
        }

        public Criteria andFileRIsNull() {
            addCriterion("file_r is null");
            return (Criteria) this;
        }

        public Criteria andFileRIsNotNull() {
            addCriterion("file_r is not null");
            return (Criteria) this;
        }

        public Criteria andFileREqualTo(Integer value) {
            addCriterion("file_r =", value, "fileR");
            return (Criteria) this;
        }

        public Criteria andFileRNotEqualTo(Integer value) {
            addCriterion("file_r <>", value, "fileR");
            return (Criteria) this;
        }

        public Criteria andFileRGreaterThan(Integer value) {
            addCriterion("file_r >", value, "fileR");
            return (Criteria) this;
        }

        public Criteria andFileRGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_r >=", value, "fileR");
            return (Criteria) this;
        }

        public Criteria andFileRLessThan(Integer value) {
            addCriterion("file_r <", value, "fileR");
            return (Criteria) this;
        }

        public Criteria andFileRLessThanOrEqualTo(Integer value) {
            addCriterion("file_r <=", value, "fileR");
            return (Criteria) this;
        }

        public Criteria andFileRIn(List<Integer> values) {
            addCriterion("file_r in", values, "fileR");
            return (Criteria) this;
        }

        public Criteria andFileRNotIn(List<Integer> values) {
            addCriterion("file_r not in", values, "fileR");
            return (Criteria) this;
        }

        public Criteria andFileRBetween(Integer value1, Integer value2) {
            addCriterion("file_r between", value1, value2, "fileR");
            return (Criteria) this;
        }

        public Criteria andFileRNotBetween(Integer value1, Integer value2) {
            addCriterion("file_r not between", value1, value2, "fileR");
            return (Criteria) this;
        }

        public Criteria andFileGIsNull() {
            addCriterion("file_g is null");
            return (Criteria) this;
        }

        public Criteria andFileGIsNotNull() {
            addCriterion("file_g is not null");
            return (Criteria) this;
        }

        public Criteria andFileGEqualTo(Integer value) {
            addCriterion("file_g =", value, "fileG");
            return (Criteria) this;
        }

        public Criteria andFileGNotEqualTo(Integer value) {
            addCriterion("file_g <>", value, "fileG");
            return (Criteria) this;
        }

        public Criteria andFileGGreaterThan(Integer value) {
            addCriterion("file_g >", value, "fileG");
            return (Criteria) this;
        }

        public Criteria andFileGGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_g >=", value, "fileG");
            return (Criteria) this;
        }

        public Criteria andFileGLessThan(Integer value) {
            addCriterion("file_g <", value, "fileG");
            return (Criteria) this;
        }

        public Criteria andFileGLessThanOrEqualTo(Integer value) {
            addCriterion("file_g <=", value, "fileG");
            return (Criteria) this;
        }

        public Criteria andFileGIn(List<Integer> values) {
            addCriterion("file_g in", values, "fileG");
            return (Criteria) this;
        }

        public Criteria andFileGNotIn(List<Integer> values) {
            addCriterion("file_g not in", values, "fileG");
            return (Criteria) this;
        }

        public Criteria andFileGBetween(Integer value1, Integer value2) {
            addCriterion("file_g between", value1, value2, "fileG");
            return (Criteria) this;
        }

        public Criteria andFileGNotBetween(Integer value1, Integer value2) {
            addCriterion("file_g not between", value1, value2, "fileG");
            return (Criteria) this;
        }

        public Criteria andFileBIsNull() {
            addCriterion("file_b is null");
            return (Criteria) this;
        }

        public Criteria andFileBIsNotNull() {
            addCriterion("file_b is not null");
            return (Criteria) this;
        }

        public Criteria andFileBEqualTo(Integer value) {
            addCriterion("file_b =", value, "fileB");
            return (Criteria) this;
        }

        public Criteria andFileBNotEqualTo(Integer value) {
            addCriterion("file_b <>", value, "fileB");
            return (Criteria) this;
        }

        public Criteria andFileBGreaterThan(Integer value) {
            addCriterion("file_b >", value, "fileB");
            return (Criteria) this;
        }

        public Criteria andFileBGreaterThanOrEqualTo(Integer value) {
            addCriterion("file_b >=", value, "fileB");
            return (Criteria) this;
        }

        public Criteria andFileBLessThan(Integer value) {
            addCriterion("file_b <", value, "fileB");
            return (Criteria) this;
        }

        public Criteria andFileBLessThanOrEqualTo(Integer value) {
            addCriterion("file_b <=", value, "fileB");
            return (Criteria) this;
        }

        public Criteria andFileBIn(List<Integer> values) {
            addCriterion("file_b in", values, "fileB");
            return (Criteria) this;
        }

        public Criteria andFileBNotIn(List<Integer> values) {
            addCriterion("file_b not in", values, "fileB");
            return (Criteria) this;
        }

        public Criteria andFileBBetween(Integer value1, Integer value2) {
            addCriterion("file_b between", value1, value2, "fileB");
            return (Criteria) this;
        }

        public Criteria andFileBNotBetween(Integer value1, Integer value2) {
            addCriterion("file_b not between", value1, value2, "fileB");
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