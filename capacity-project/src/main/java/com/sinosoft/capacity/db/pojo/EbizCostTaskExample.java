package com.sinosoft.capacity.db.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EbizCostTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EbizCostTaskExample() {
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

        public Criteria andSystemNameIsNull() {
            addCriterion("SYSTEM_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSystemNameIsNotNull() {
            addCriterion("SYSTEM_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSystemNameEqualTo(String value) {
            addCriterion("SYSTEM_NAME =", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotEqualTo(String value) {
            addCriterion("SYSTEM_NAME <>", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThan(String value) {
            addCriterion("SYSTEM_NAME >", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEM_NAME >=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThan(String value) {
            addCriterion("SYSTEM_NAME <", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThanOrEqualTo(String value) {
            addCriterion("SYSTEM_NAME <=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLike(String value) {
            addCriterion("SYSTEM_NAME like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotLike(String value) {
            addCriterion("SYSTEM_NAME not like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameIn(List<String> values) {
            addCriterion("SYSTEM_NAME in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotIn(List<String> values) {
            addCriterion("SYSTEM_NAME not in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameBetween(String value1, String value2) {
            addCriterion("SYSTEM_NAME between", value1, value2, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotBetween(String value1, String value2) {
            addCriterion("SYSTEM_NAME not between", value1, value2, "systemName");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andYearIsNull() {
            addCriterion("YEAR is null");
            return (Criteria) this;
        }

        public Criteria andYearIsNotNull() {
            addCriterion("YEAR is not null");
            return (Criteria) this;
        }

        public Criteria andYearEqualTo(String value) {
            addCriterion("YEAR =", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotEqualTo(String value) {
            addCriterion("YEAR <>", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThan(String value) {
            addCriterion("YEAR >", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearGreaterThanOrEqualTo(String value) {
            addCriterion("YEAR >=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThan(String value) {
            addCriterion("YEAR <", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLessThanOrEqualTo(String value) {
            addCriterion("YEAR <=", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearLike(String value) {
            addCriterion("YEAR like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotLike(String value) {
            addCriterion("YEAR not like", value, "year");
            return (Criteria) this;
        }

        public Criteria andYearIn(List<String> values) {
            addCriterion("YEAR in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotIn(List<String> values) {
            addCriterion("YEAR not in", values, "year");
            return (Criteria) this;
        }

        public Criteria andYearBetween(String value1, String value2) {
            addCriterion("YEAR between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andYearNotBetween(String value1, String value2) {
            addCriterion("YEAR not between", value1, value2, "year");
            return (Criteria) this;
        }

        public Criteria andDecemberIsNull() {
            addCriterion("DECEMBER is null");
            return (Criteria) this;
        }

        public Criteria andDecemberIsNotNull() {
            addCriterion("DECEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDecemberEqualTo(BigDecimal value) {
            addCriterion("DECEMBER =", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotEqualTo(BigDecimal value) {
            addCriterion("DECEMBER <>", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberGreaterThan(BigDecimal value) {
            addCriterion("DECEMBER >", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DECEMBER >=", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberLessThan(BigDecimal value) {
            addCriterion("DECEMBER <", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DECEMBER <=", value, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberIn(List<BigDecimal> values) {
            addCriterion("DECEMBER in", values, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotIn(List<BigDecimal> values) {
            addCriterion("DECEMBER not in", values, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DECEMBER between", value1, value2, "december");
            return (Criteria) this;
        }

        public Criteria andDecemberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DECEMBER not between", value1, value2, "december");
            return (Criteria) this;
        }

        public Criteria andJanuaryIsNull() {
            addCriterion("JANUARY is null");
            return (Criteria) this;
        }

        public Criteria andJanuaryIsNotNull() {
            addCriterion("JANUARY is not null");
            return (Criteria) this;
        }

        public Criteria andJanuaryEqualTo(BigDecimal value) {
            addCriterion("JANUARY =", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotEqualTo(BigDecimal value) {
            addCriterion("JANUARY <>", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThan(BigDecimal value) {
            addCriterion("JANUARY >", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JANUARY >=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThan(BigDecimal value) {
            addCriterion("JANUARY <", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JANUARY <=", value, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryIn(List<BigDecimal> values) {
            addCriterion("JANUARY in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotIn(List<BigDecimal> values) {
            addCriterion("JANUARY not in", values, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JANUARY between", value1, value2, "january");
            return (Criteria) this;
        }

        public Criteria andJanuaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JANUARY not between", value1, value2, "january");
            return (Criteria) this;
        }

        public Criteria andFebruaryIsNull() {
            addCriterion("FEBRUARY is null");
            return (Criteria) this;
        }

        public Criteria andFebruaryIsNotNull() {
            addCriterion("FEBRUARY is not null");
            return (Criteria) this;
        }

        public Criteria andFebruaryEqualTo(BigDecimal value) {
            addCriterion("FEBRUARY =", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotEqualTo(BigDecimal value) {
            addCriterion("FEBRUARY <>", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryGreaterThan(BigDecimal value) {
            addCriterion("FEBRUARY >", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEBRUARY >=", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryLessThan(BigDecimal value) {
            addCriterion("FEBRUARY <", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEBRUARY <=", value, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryIn(List<BigDecimal> values) {
            addCriterion("FEBRUARY in", values, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotIn(List<BigDecimal> values) {
            addCriterion("FEBRUARY not in", values, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEBRUARY between", value1, value2, "february");
            return (Criteria) this;
        }

        public Criteria andFebruaryNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEBRUARY not between", value1, value2, "february");
            return (Criteria) this;
        }

        public Criteria andMarchIsNull() {
            addCriterion("MARCH is null");
            return (Criteria) this;
        }

        public Criteria andMarchIsNotNull() {
            addCriterion("MARCH is not null");
            return (Criteria) this;
        }

        public Criteria andMarchEqualTo(BigDecimal value) {
            addCriterion("MARCH =", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotEqualTo(BigDecimal value) {
            addCriterion("MARCH <>", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchGreaterThan(BigDecimal value) {
            addCriterion("MARCH >", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MARCH >=", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchLessThan(BigDecimal value) {
            addCriterion("MARCH <", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MARCH <=", value, "march");
            return (Criteria) this;
        }

        public Criteria andMarchIn(List<BigDecimal> values) {
            addCriterion("MARCH in", values, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotIn(List<BigDecimal> values) {
            addCriterion("MARCH not in", values, "march");
            return (Criteria) this;
        }

        public Criteria andMarchBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARCH between", value1, value2, "march");
            return (Criteria) this;
        }

        public Criteria andMarchNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MARCH not between", value1, value2, "march");
            return (Criteria) this;
        }

        public Criteria andAprilIsNull() {
            addCriterion("APRIL is null");
            return (Criteria) this;
        }

        public Criteria andAprilIsNotNull() {
            addCriterion("APRIL is not null");
            return (Criteria) this;
        }

        public Criteria andAprilEqualTo(BigDecimal value) {
            addCriterion("APRIL =", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotEqualTo(BigDecimal value) {
            addCriterion("APRIL <>", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilGreaterThan(BigDecimal value) {
            addCriterion("APRIL >", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("APRIL >=", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilLessThan(BigDecimal value) {
            addCriterion("APRIL <", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilLessThanOrEqualTo(BigDecimal value) {
            addCriterion("APRIL <=", value, "april");
            return (Criteria) this;
        }

        public Criteria andAprilIn(List<BigDecimal> values) {
            addCriterion("APRIL in", values, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotIn(List<BigDecimal> values) {
            addCriterion("APRIL not in", values, "april");
            return (Criteria) this;
        }

        public Criteria andAprilBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APRIL between", value1, value2, "april");
            return (Criteria) this;
        }

        public Criteria andAprilNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("APRIL not between", value1, value2, "april");
            return (Criteria) this;
        }

        public Criteria andMayIsNull() {
            addCriterion("MAY is null");
            return (Criteria) this;
        }

        public Criteria andMayIsNotNull() {
            addCriterion("MAY is not null");
            return (Criteria) this;
        }

        public Criteria andMayEqualTo(BigDecimal value) {
            addCriterion("MAY =", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotEqualTo(BigDecimal value) {
            addCriterion("MAY <>", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThan(BigDecimal value) {
            addCriterion("MAY >", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("MAY >=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThan(BigDecimal value) {
            addCriterion("MAY <", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("MAY <=", value, "may");
            return (Criteria) this;
        }

        public Criteria andMayIn(List<BigDecimal> values) {
            addCriterion("MAY in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotIn(List<BigDecimal> values) {
            addCriterion("MAY not in", values, "may");
            return (Criteria) this;
        }

        public Criteria andMayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAY between", value1, value2, "may");
            return (Criteria) this;
        }

        public Criteria andMayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("MAY not between", value1, value2, "may");
            return (Criteria) this;
        }

        public Criteria andJuneIsNull() {
            addCriterion("JUNE is null");
            return (Criteria) this;
        }

        public Criteria andJuneIsNotNull() {
            addCriterion("JUNE is not null");
            return (Criteria) this;
        }

        public Criteria andJuneEqualTo(BigDecimal value) {
            addCriterion("JUNE =", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotEqualTo(BigDecimal value) {
            addCriterion("JUNE <>", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneGreaterThan(BigDecimal value) {
            addCriterion("JUNE >", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JUNE >=", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneLessThan(BigDecimal value) {
            addCriterion("JUNE <", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JUNE <=", value, "june");
            return (Criteria) this;
        }

        public Criteria andJuneIn(List<BigDecimal> values) {
            addCriterion("JUNE in", values, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotIn(List<BigDecimal> values) {
            addCriterion("JUNE not in", values, "june");
            return (Criteria) this;
        }

        public Criteria andJuneBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUNE between", value1, value2, "june");
            return (Criteria) this;
        }

        public Criteria andJuneNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JUNE not between", value1, value2, "june");
            return (Criteria) this;
        }

        public Criteria andJulyIsNull() {
            addCriterion("JULY is null");
            return (Criteria) this;
        }

        public Criteria andJulyIsNotNull() {
            addCriterion("JULY is not null");
            return (Criteria) this;
        }

        public Criteria andJulyEqualTo(BigDecimal value) {
            addCriterion("JULY =", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotEqualTo(BigDecimal value) {
            addCriterion("JULY <>", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyGreaterThan(BigDecimal value) {
            addCriterion("JULY >", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("JULY >=", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyLessThan(BigDecimal value) {
            addCriterion("JULY <", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("JULY <=", value, "july");
            return (Criteria) this;
        }

        public Criteria andJulyIn(List<BigDecimal> values) {
            addCriterion("JULY in", values, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotIn(List<BigDecimal> values) {
            addCriterion("JULY not in", values, "july");
            return (Criteria) this;
        }

        public Criteria andJulyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JULY between", value1, value2, "july");
            return (Criteria) this;
        }

        public Criteria andJulyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("JULY not between", value1, value2, "july");
            return (Criteria) this;
        }

        public Criteria andAugustIsNull() {
            addCriterion("AUGUST is null");
            return (Criteria) this;
        }

        public Criteria andAugustIsNotNull() {
            addCriterion("AUGUST is not null");
            return (Criteria) this;
        }

        public Criteria andAugustEqualTo(BigDecimal value) {
            addCriterion("AUGUST =", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotEqualTo(BigDecimal value) {
            addCriterion("AUGUST <>", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustGreaterThan(BigDecimal value) {
            addCriterion("AUGUST >", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AUGUST >=", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustLessThan(BigDecimal value) {
            addCriterion("AUGUST <", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AUGUST <=", value, "august");
            return (Criteria) this;
        }

        public Criteria andAugustIn(List<BigDecimal> values) {
            addCriterion("AUGUST in", values, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotIn(List<BigDecimal> values) {
            addCriterion("AUGUST not in", values, "august");
            return (Criteria) this;
        }

        public Criteria andAugustBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUGUST between", value1, value2, "august");
            return (Criteria) this;
        }

        public Criteria andAugustNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AUGUST not between", value1, value2, "august");
            return (Criteria) this;
        }

        public Criteria andSeptemberIsNull() {
            addCriterion("SEPTEMBER is null");
            return (Criteria) this;
        }

        public Criteria andSeptemberIsNotNull() {
            addCriterion("SEPTEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSeptemberEqualTo(BigDecimal value) {
            addCriterion("SEPTEMBER =", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotEqualTo(BigDecimal value) {
            addCriterion("SEPTEMBER <>", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberGreaterThan(BigDecimal value) {
            addCriterion("SEPTEMBER >", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SEPTEMBER >=", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberLessThan(BigDecimal value) {
            addCriterion("SEPTEMBER <", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SEPTEMBER <=", value, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberIn(List<BigDecimal> values) {
            addCriterion("SEPTEMBER in", values, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotIn(List<BigDecimal> values) {
            addCriterion("SEPTEMBER not in", values, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEPTEMBER between", value1, value2, "september");
            return (Criteria) this;
        }

        public Criteria andSeptemberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SEPTEMBER not between", value1, value2, "september");
            return (Criteria) this;
        }

        public Criteria andOctoberIsNull() {
            addCriterion("OCTOBER is null");
            return (Criteria) this;
        }

        public Criteria andOctoberIsNotNull() {
            addCriterion("OCTOBER is not null");
            return (Criteria) this;
        }

        public Criteria andOctoberEqualTo(BigDecimal value) {
            addCriterion("OCTOBER =", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotEqualTo(BigDecimal value) {
            addCriterion("OCTOBER <>", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberGreaterThan(BigDecimal value) {
            addCriterion("OCTOBER >", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OCTOBER >=", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberLessThan(BigDecimal value) {
            addCriterion("OCTOBER <", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OCTOBER <=", value, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberIn(List<BigDecimal> values) {
            addCriterion("OCTOBER in", values, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotIn(List<BigDecimal> values) {
            addCriterion("OCTOBER not in", values, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OCTOBER between", value1, value2, "october");
            return (Criteria) this;
        }

        public Criteria andOctoberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OCTOBER not between", value1, value2, "october");
            return (Criteria) this;
        }

        public Criteria andNovemberIsNull() {
            addCriterion("NOVEMBER is null");
            return (Criteria) this;
        }

        public Criteria andNovemberIsNotNull() {
            addCriterion("NOVEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andNovemberEqualTo(BigDecimal value) {
            addCriterion("NOVEMBER =", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotEqualTo(BigDecimal value) {
            addCriterion("NOVEMBER <>", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberGreaterThan(BigDecimal value) {
            addCriterion("NOVEMBER >", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOVEMBER >=", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberLessThan(BigDecimal value) {
            addCriterion("NOVEMBER <", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOVEMBER <=", value, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberIn(List<BigDecimal> values) {
            addCriterion("NOVEMBER in", values, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotIn(List<BigDecimal> values) {
            addCriterion("NOVEMBER not in", values, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOVEMBER between", value1, value2, "november");
            return (Criteria) this;
        }

        public Criteria andNovemberNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOVEMBER not between", value1, value2, "november");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNull() {
            addCriterion("TOTAL_COST is null");
            return (Criteria) this;
        }

        public Criteria andTotalCostIsNotNull() {
            addCriterion("TOTAL_COST is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCostEqualTo(BigDecimal value) {
            addCriterion("TOTAL_COST =", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_COST <>", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_COST >", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_COST >=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThan(BigDecimal value) {
            addCriterion("TOTAL_COST <", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_COST <=", value, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostIn(List<BigDecimal> values) {
            addCriterion("TOTAL_COST in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_COST not in", values, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_COST between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andTotalCostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_COST not between", value1, value2, "totalCost");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeIsNull() {
            addCriterion("SERVER_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeIsNotNull() {
            addCriterion("SERVER_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeEqualTo(Date value) {
            addCriterion("SERVER_START_TIME =", value, "serverStartTime");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeNotEqualTo(Date value) {
            addCriterion("SERVER_START_TIME <>", value, "serverStartTime");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeGreaterThan(Date value) {
            addCriterion("SERVER_START_TIME >", value, "serverStartTime");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SERVER_START_TIME >=", value, "serverStartTime");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeLessThan(Date value) {
            addCriterion("SERVER_START_TIME <", value, "serverStartTime");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("SERVER_START_TIME <=", value, "serverStartTime");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeIn(List<Date> values) {
            addCriterion("SERVER_START_TIME in", values, "serverStartTime");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeNotIn(List<Date> values) {
            addCriterion("SERVER_START_TIME not in", values, "serverStartTime");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeBetween(Date value1, Date value2) {
            addCriterion("SERVER_START_TIME between", value1, value2, "serverStartTime");
            return (Criteria) this;
        }

        public Criteria andServerStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("SERVER_START_TIME not between", value1, value2, "serverStartTime");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeIsNull() {
            addCriterion("SERVER_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeIsNotNull() {
            addCriterion("SERVER_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeEqualTo(Date value) {
            addCriterion("SERVER_END_TIME =", value, "serverEndTime");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeNotEqualTo(Date value) {
            addCriterion("SERVER_END_TIME <>", value, "serverEndTime");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeGreaterThan(Date value) {
            addCriterion("SERVER_END_TIME >", value, "serverEndTime");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("SERVER_END_TIME >=", value, "serverEndTime");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeLessThan(Date value) {
            addCriterion("SERVER_END_TIME <", value, "serverEndTime");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("SERVER_END_TIME <=", value, "serverEndTime");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeIn(List<Date> values) {
            addCriterion("SERVER_END_TIME in", values, "serverEndTime");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeNotIn(List<Date> values) {
            addCriterion("SERVER_END_TIME not in", values, "serverEndTime");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeBetween(Date value1, Date value2) {
            addCriterion("SERVER_END_TIME between", value1, value2, "serverEndTime");
            return (Criteria) this;
        }

        public Criteria andServerEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("SERVER_END_TIME not between", value1, value2, "serverEndTime");
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