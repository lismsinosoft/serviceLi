package com.sinosoft.capacity.db.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DzswRequirementTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DzswRequirementTaskExample() {
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

        public Criteria andSeqNoIsNull() {
            addCriterion("SEQ_NO is null");
            return (Criteria) this;
        }

        public Criteria andSeqNoIsNotNull() {
            addCriterion("SEQ_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNoEqualTo(String value) {
            addCriterion("SEQ_NO =", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotEqualTo(String value) {
            addCriterion("SEQ_NO <>", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThan(String value) {
            addCriterion("SEQ_NO >", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoGreaterThanOrEqualTo(String value) {
            addCriterion("SEQ_NO >=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThan(String value) {
            addCriterion("SEQ_NO <", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLessThanOrEqualTo(String value) {
            addCriterion("SEQ_NO <=", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoLike(String value) {
            addCriterion("SEQ_NO like", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotLike(String value) {
            addCriterion("SEQ_NO not like", value, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoIn(List<String> values) {
            addCriterion("SEQ_NO in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotIn(List<String> values) {
            addCriterion("SEQ_NO not in", values, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoBetween(String value1, String value2) {
            addCriterion("SEQ_NO between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andSeqNoNotBetween(String value1, String value2) {
            addCriterion("SEQ_NO not between", value1, value2, "seqNo");
            return (Criteria) this;
        }

        public Criteria andStartDocumentIsNull() {
            addCriterion("START_DOCUMENT is null");
            return (Criteria) this;
        }

        public Criteria andStartDocumentIsNotNull() {
            addCriterion("START_DOCUMENT is not null");
            return (Criteria) this;
        }

        public Criteria andStartDocumentEqualTo(String value) {
            addCriterion("START_DOCUMENT =", value, "startDocument");
            return (Criteria) this;
        }

        public Criteria andStartDocumentNotEqualTo(String value) {
            addCriterion("START_DOCUMENT <>", value, "startDocument");
            return (Criteria) this;
        }

        public Criteria andStartDocumentGreaterThan(String value) {
            addCriterion("START_DOCUMENT >", value, "startDocument");
            return (Criteria) this;
        }

        public Criteria andStartDocumentGreaterThanOrEqualTo(String value) {
            addCriterion("START_DOCUMENT >=", value, "startDocument");
            return (Criteria) this;
        }

        public Criteria andStartDocumentLessThan(String value) {
            addCriterion("START_DOCUMENT <", value, "startDocument");
            return (Criteria) this;
        }

        public Criteria andStartDocumentLessThanOrEqualTo(String value) {
            addCriterion("START_DOCUMENT <=", value, "startDocument");
            return (Criteria) this;
        }

        public Criteria andStartDocumentLike(String value) {
            addCriterion("START_DOCUMENT like", value, "startDocument");
            return (Criteria) this;
        }

        public Criteria andStartDocumentNotLike(String value) {
            addCriterion("START_DOCUMENT not like", value, "startDocument");
            return (Criteria) this;
        }

        public Criteria andStartDocumentIn(List<String> values) {
            addCriterion("START_DOCUMENT in", values, "startDocument");
            return (Criteria) this;
        }

        public Criteria andStartDocumentNotIn(List<String> values) {
            addCriterion("START_DOCUMENT not in", values, "startDocument");
            return (Criteria) this;
        }

        public Criteria andStartDocumentBetween(String value1, String value2) {
            addCriterion("START_DOCUMENT between", value1, value2, "startDocument");
            return (Criteria) this;
        }

        public Criteria andStartDocumentNotBetween(String value1, String value2) {
            addCriterion("START_DOCUMENT not between", value1, value2, "startDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentIsNull() {
            addCriterion("ONLINE_DOCUMENT is null");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentIsNotNull() {
            addCriterion("ONLINE_DOCUMENT is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentEqualTo(String value) {
            addCriterion("ONLINE_DOCUMENT =", value, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentNotEqualTo(String value) {
            addCriterion("ONLINE_DOCUMENT <>", value, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentGreaterThan(String value) {
            addCriterion("ONLINE_DOCUMENT >", value, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentGreaterThanOrEqualTo(String value) {
            addCriterion("ONLINE_DOCUMENT >=", value, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentLessThan(String value) {
            addCriterion("ONLINE_DOCUMENT <", value, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentLessThanOrEqualTo(String value) {
            addCriterion("ONLINE_DOCUMENT <=", value, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentLike(String value) {
            addCriterion("ONLINE_DOCUMENT like", value, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentNotLike(String value) {
            addCriterion("ONLINE_DOCUMENT not like", value, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentIn(List<String> values) {
            addCriterion("ONLINE_DOCUMENT in", values, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentNotIn(List<String> values) {
            addCriterion("ONLINE_DOCUMENT not in", values, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentBetween(String value1, String value2) {
            addCriterion("ONLINE_DOCUMENT between", value1, value2, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andOnlineDocumentNotBetween(String value1, String value2) {
            addCriterion("ONLINE_DOCUMENT not between", value1, value2, "onlineDocument");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoIsNull() {
            addCriterion("DISBURSEMENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoIsNotNull() {
            addCriterion("DISBURSEMENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoEqualTo(String value) {
            addCriterion("DISBURSEMENT_NO =", value, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoNotEqualTo(String value) {
            addCriterion("DISBURSEMENT_NO <>", value, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoGreaterThan(String value) {
            addCriterion("DISBURSEMENT_NO >", value, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoGreaterThanOrEqualTo(String value) {
            addCriterion("DISBURSEMENT_NO >=", value, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoLessThan(String value) {
            addCriterion("DISBURSEMENT_NO <", value, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoLessThanOrEqualTo(String value) {
            addCriterion("DISBURSEMENT_NO <=", value, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoLike(String value) {
            addCriterion("DISBURSEMENT_NO like", value, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoNotLike(String value) {
            addCriterion("DISBURSEMENT_NO not like", value, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoIn(List<String> values) {
            addCriterion("DISBURSEMENT_NO in", values, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoNotIn(List<String> values) {
            addCriterion("DISBURSEMENT_NO not in", values, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoBetween(String value1, String value2) {
            addCriterion("DISBURSEMENT_NO between", value1, value2, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andDisbursementNoNotBetween(String value1, String value2) {
            addCriterion("DISBURSEMENT_NO not between", value1, value2, "disbursementNo");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalIsNull() {
            addCriterion("WORKLOAD_TATAL is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalIsNotNull() {
            addCriterion("WORKLOAD_TATAL is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_TATAL =", value, "workloadTatal");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalNotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_TATAL <>", value, "workloadTatal");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalGreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD_TATAL >", value, "workloadTatal");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_TATAL >=", value, "workloadTatal");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalLessThan(BigDecimal value) {
            addCriterion("WORKLOAD_TATAL <", value, "workloadTatal");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_TATAL <=", value, "workloadTatal");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_TATAL in", values, "workloadTatal");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalNotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_TATAL not in", values, "workloadTatal");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_TATAL between", value1, value2, "workloadTatal");
            return (Criteria) this;
        }

        public Criteria andWorkloadTatalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_TATAL not between", value1, value2, "workloadTatal");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderIsNull() {
            addCriterion("WORKLOAD_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderIsNotNull() {
            addCriterion("WORKLOAD_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_ORDER =", value, "workloadOrder");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderNotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_ORDER <>", value, "workloadOrder");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderGreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD_ORDER >", value, "workloadOrder");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_ORDER >=", value, "workloadOrder");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderLessThan(BigDecimal value) {
            addCriterion("WORKLOAD_ORDER <", value, "workloadOrder");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_ORDER <=", value, "workloadOrder");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_ORDER in", values, "workloadOrder");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderNotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_ORDER not in", values, "workloadOrder");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_ORDER between", value1, value2, "workloadOrder");
            return (Criteria) this;
        }

        public Criteria andWorkloadOrderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_ORDER not between", value1, value2, "workloadOrder");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosIsNull() {
            addCriterion("WORKLOAD_POS is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosIsNotNull() {
            addCriterion("WORKLOAD_POS is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_POS =", value, "workloadPos");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosNotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_POS <>", value, "workloadPos");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosGreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD_POS >", value, "workloadPos");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_POS >=", value, "workloadPos");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosLessThan(BigDecimal value) {
            addCriterion("WORKLOAD_POS <", value, "workloadPos");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_POS <=", value, "workloadPos");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_POS in", values, "workloadPos");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosNotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_POS not in", values, "workloadPos");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_POS between", value1, value2, "workloadPos");
            return (Criteria) this;
        }

        public Criteria andWorkloadPosNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_POS not between", value1, value2, "workloadPos");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspIsNull() {
            addCriterion("WORKLOAD_RSP is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspIsNotNull() {
            addCriterion("WORKLOAD_RSP is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_RSP =", value, "workloadRsp");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspNotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_RSP <>", value, "workloadRsp");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspGreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD_RSP >", value, "workloadRsp");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_RSP >=", value, "workloadRsp");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspLessThan(BigDecimal value) {
            addCriterion("WORKLOAD_RSP <", value, "workloadRsp");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_RSP <=", value, "workloadRsp");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_RSP in", values, "workloadRsp");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspNotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_RSP not in", values, "workloadRsp");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_RSP between", value1, value2, "workloadRsp");
            return (Criteria) this;
        }

        public Criteria andWorkloadRspNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_RSP not between", value1, value2, "workloadRsp");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2IsNull() {
            addCriterion("WORKLOAD_RSP2 is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2IsNotNull() {
            addCriterion("WORKLOAD_RSP2 is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2EqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_RSP2 =", value, "workloadRsp2");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2NotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_RSP2 <>", value, "workloadRsp2");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2GreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD_RSP2 >", value, "workloadRsp2");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_RSP2 >=", value, "workloadRsp2");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2LessThan(BigDecimal value) {
            addCriterion("WORKLOAD_RSP2 <", value, "workloadRsp2");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_RSP2 <=", value, "workloadRsp2");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2In(List<BigDecimal> values) {
            addCriterion("WORKLOAD_RSP2 in", values, "workloadRsp2");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2NotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_RSP2 not in", values, "workloadRsp2");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_RSP2 between", value1, value2, "workloadRsp2");
            return (Criteria) this;
        }

        public Criteria andWorkloadRsp2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_RSP2 not between", value1, value2, "workloadRsp2");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimIsNull() {
            addCriterion("WORKLOAD_CLAIM is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimIsNotNull() {
            addCriterion("WORKLOAD_CLAIM is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_CLAIM =", value, "workloadClaim");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimNotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_CLAIM <>", value, "workloadClaim");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimGreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD_CLAIM >", value, "workloadClaim");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_CLAIM >=", value, "workloadClaim");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimLessThan(BigDecimal value) {
            addCriterion("WORKLOAD_CLAIM <", value, "workloadClaim");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_CLAIM <=", value, "workloadClaim");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_CLAIM in", values, "workloadClaim");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimNotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_CLAIM not in", values, "workloadClaim");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_CLAIM between", value1, value2, "workloadClaim");
            return (Criteria) this;
        }

        public Criteria andWorkloadClaimNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_CLAIM not between", value1, value2, "workloadClaim");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipIsNull() {
            addCriterion("WORKLOAD_LIP is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipIsNotNull() {
            addCriterion("WORKLOAD_LIP is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_LIP =", value, "workloadLip");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipNotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_LIP <>", value, "workloadLip");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipGreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD_LIP >", value, "workloadLip");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_LIP >=", value, "workloadLip");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipLessThan(BigDecimal value) {
            addCriterion("WORKLOAD_LIP <", value, "workloadLip");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_LIP <=", value, "workloadLip");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_LIP in", values, "workloadLip");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipNotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_LIP not in", values, "workloadLip");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_LIP between", value1, value2, "workloadLip");
            return (Criteria) this;
        }

        public Criteria andWorkloadLipNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_LIP not between", value1, value2, "workloadLip");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpIsNull() {
            addCriterion("WORKLOAD_CCP is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpIsNotNull() {
            addCriterion("WORKLOAD_CCP is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_CCP =", value, "workloadCcp");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpNotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_CCP <>", value, "workloadCcp");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpGreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD_CCP >", value, "workloadCcp");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_CCP >=", value, "workloadCcp");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpLessThan(BigDecimal value) {
            addCriterion("WORKLOAD_CCP <", value, "workloadCcp");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_CCP <=", value, "workloadCcp");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_CCP in", values, "workloadCcp");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpNotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_CCP not in", values, "workloadCcp");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_CCP between", value1, value2, "workloadCcp");
            return (Criteria) this;
        }

        public Criteria andWorkloadCcpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_CCP not between", value1, value2, "workloadCcp");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataIsNull() {
            addCriterion("WORKLOAD_DATA is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataIsNotNull() {
            addCriterion("WORKLOAD_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_DATA =", value, "workloadData");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataNotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_DATA <>", value, "workloadData");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataGreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD_DATA >", value, "workloadData");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_DATA >=", value, "workloadData");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataLessThan(BigDecimal value) {
            addCriterion("WORKLOAD_DATA <", value, "workloadData");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_DATA <=", value, "workloadData");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_DATA in", values, "workloadData");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataNotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_DATA not in", values, "workloadData");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_DATA between", value1, value2, "workloadData");
            return (Criteria) this;
        }

        public Criteria andWorkloadDataNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_DATA not between", value1, value2, "workloadData");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameIsNull() {
            addCriterion("WORKLOAD_FRAME is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameIsNotNull() {
            addCriterion("WORKLOAD_FRAME is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_FRAME =", value, "workloadFrame");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameNotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_FRAME <>", value, "workloadFrame");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameGreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD_FRAME >", value, "workloadFrame");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_FRAME >=", value, "workloadFrame");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameLessThan(BigDecimal value) {
            addCriterion("WORKLOAD_FRAME <", value, "workloadFrame");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_FRAME <=", value, "workloadFrame");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_FRAME in", values, "workloadFrame");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameNotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_FRAME not in", values, "workloadFrame");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_FRAME between", value1, value2, "workloadFrame");
            return (Criteria) this;
        }

        public Criteria andWorkloadFrameNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_FRAME not between", value1, value2, "workloadFrame");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductIsNull() {
            addCriterion("WORKLOAD_PRODUCT is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductIsNotNull() {
            addCriterion("WORKLOAD_PRODUCT is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_PRODUCT =", value, "workloadProduct");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductNotEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_PRODUCT <>", value, "workloadProduct");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductGreaterThan(BigDecimal value) {
            addCriterion("WORKLOAD_PRODUCT >", value, "workloadProduct");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_PRODUCT >=", value, "workloadProduct");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductLessThan(BigDecimal value) {
            addCriterion("WORKLOAD_PRODUCT <", value, "workloadProduct");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductLessThanOrEqualTo(BigDecimal value) {
            addCriterion("WORKLOAD_PRODUCT <=", value, "workloadProduct");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_PRODUCT in", values, "workloadProduct");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductNotIn(List<BigDecimal> values) {
            addCriterion("WORKLOAD_PRODUCT not in", values, "workloadProduct");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_PRODUCT between", value1, value2, "workloadProduct");
            return (Criteria) this;
        }

        public Criteria andWorkloadProductNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("WORKLOAD_PRODUCT not between", value1, value2, "workloadProduct");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNull() {
            addCriterion("UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIsNotNull() {
            addCriterion("UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andUnitPriceEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE =", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE <>", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("UNIT_PRICE >", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE >=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThan(BigDecimal value) {
            addCriterion("UNIT_PRICE <", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNIT_PRICE <=", value, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceIn(List<BigDecimal> values) {
            addCriterion("UNIT_PRICE in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("UNIT_PRICE not in", values, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_PRICE between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNIT_PRICE not between", value1, value2, "unitPrice");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNull() {
            addCriterion("DATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDateTimeIsNotNull() {
            addCriterion("DATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDateTimeEqualTo(String value) {
            addCriterion("DATE_TIME =", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotEqualTo(String value) {
            addCriterion("DATE_TIME <>", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThan(String value) {
            addCriterion("DATE_TIME >", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("DATE_TIME >=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThan(String value) {
            addCriterion("DATE_TIME <", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLessThanOrEqualTo(String value) {
            addCriterion("DATE_TIME <=", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeLike(String value) {
            addCriterion("DATE_TIME like", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotLike(String value) {
            addCriterion("DATE_TIME not like", value, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeIn(List<String> values) {
            addCriterion("DATE_TIME in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotIn(List<String> values) {
            addCriterion("DATE_TIME not in", values, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeBetween(String value1, String value2) {
            addCriterion("DATE_TIME between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andDateTimeNotBetween(String value1, String value2) {
            addCriterion("DATE_TIME not between", value1, value2, "dateTime");
            return (Criteria) this;
        }

        public Criteria andItemIsNull() {
            addCriterion("ITEM is null");
            return (Criteria) this;
        }

        public Criteria andItemIsNotNull() {
            addCriterion("ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andItemEqualTo(String value) {
            addCriterion("ITEM =", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotEqualTo(String value) {
            addCriterion("ITEM <>", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThan(String value) {
            addCriterion("ITEM >", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemGreaterThanOrEqualTo(String value) {
            addCriterion("ITEM >=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThan(String value) {
            addCriterion("ITEM <", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLessThanOrEqualTo(String value) {
            addCriterion("ITEM <=", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemLike(String value) {
            addCriterion("ITEM like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotLike(String value) {
            addCriterion("ITEM not like", value, "item");
            return (Criteria) this;
        }

        public Criteria andItemIn(List<String> values) {
            addCriterion("ITEM in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotIn(List<String> values) {
            addCriterion("ITEM not in", values, "item");
            return (Criteria) this;
        }

        public Criteria andItemBetween(String value1, String value2) {
            addCriterion("ITEM between", value1, value2, "item");
            return (Criteria) this;
        }

        public Criteria andItemNotBetween(String value1, String value2) {
            addCriterion("ITEM not between", value1, value2, "item");
            return (Criteria) this;
        }

        public Criteria andSeqNameIsNull() {
            addCriterion("SEQ_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSeqNameIsNotNull() {
            addCriterion("SEQ_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSeqNameEqualTo(String value) {
            addCriterion("SEQ_NAME =", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotEqualTo(String value) {
            addCriterion("SEQ_NAME <>", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameGreaterThan(String value) {
            addCriterion("SEQ_NAME >", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameGreaterThanOrEqualTo(String value) {
            addCriterion("SEQ_NAME >=", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameLessThan(String value) {
            addCriterion("SEQ_NAME <", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameLessThanOrEqualTo(String value) {
            addCriterion("SEQ_NAME <=", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameLike(String value) {
            addCriterion("SEQ_NAME like", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotLike(String value) {
            addCriterion("SEQ_NAME not like", value, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameIn(List<String> values) {
            addCriterion("SEQ_NAME in", values, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotIn(List<String> values) {
            addCriterion("SEQ_NAME not in", values, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameBetween(String value1, String value2) {
            addCriterion("SEQ_NAME between", value1, value2, "seqName");
            return (Criteria) this;
        }

        public Criteria andSeqNameNotBetween(String value1, String value2) {
            addCriterion("SEQ_NAME not between", value1, value2, "seqName");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andProviderIsNull() {
            addCriterion("PROVIDER is null");
            return (Criteria) this;
        }

        public Criteria andProviderIsNotNull() {
            addCriterion("PROVIDER is not null");
            return (Criteria) this;
        }

        public Criteria andProviderEqualTo(String value) {
            addCriterion("PROVIDER =", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotEqualTo(String value) {
            addCriterion("PROVIDER <>", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThan(String value) {
            addCriterion("PROVIDER >", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderGreaterThanOrEqualTo(String value) {
            addCriterion("PROVIDER >=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThan(String value) {
            addCriterion("PROVIDER <", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLessThanOrEqualTo(String value) {
            addCriterion("PROVIDER <=", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderLike(String value) {
            addCriterion("PROVIDER like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotLike(String value) {
            addCriterion("PROVIDER not like", value, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderIn(List<String> values) {
            addCriterion("PROVIDER in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotIn(List<String> values) {
            addCriterion("PROVIDER not in", values, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderBetween(String value1, String value2) {
            addCriterion("PROVIDER between", value1, value2, "provider");
            return (Criteria) this;
        }

        public Criteria andProviderNotBetween(String value1, String value2) {
            addCriterion("PROVIDER not between", value1, value2, "provider");
            return (Criteria) this;
        }

        public Criteria andItResponsibleIsNull() {
            addCriterion("IT_RESPONSIBLE is null");
            return (Criteria) this;
        }

        public Criteria andItResponsibleIsNotNull() {
            addCriterion("IT_RESPONSIBLE is not null");
            return (Criteria) this;
        }

        public Criteria andItResponsibleEqualTo(String value) {
            addCriterion("IT_RESPONSIBLE =", value, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andItResponsibleNotEqualTo(String value) {
            addCriterion("IT_RESPONSIBLE <>", value, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andItResponsibleGreaterThan(String value) {
            addCriterion("IT_RESPONSIBLE >", value, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andItResponsibleGreaterThanOrEqualTo(String value) {
            addCriterion("IT_RESPONSIBLE >=", value, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andItResponsibleLessThan(String value) {
            addCriterion("IT_RESPONSIBLE <", value, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andItResponsibleLessThanOrEqualTo(String value) {
            addCriterion("IT_RESPONSIBLE <=", value, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andItResponsibleLike(String value) {
            addCriterion("IT_RESPONSIBLE like", value, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andItResponsibleNotLike(String value) {
            addCriterion("IT_RESPONSIBLE not like", value, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andItResponsibleIn(List<String> values) {
            addCriterion("IT_RESPONSIBLE in", values, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andItResponsibleNotIn(List<String> values) {
            addCriterion("IT_RESPONSIBLE not in", values, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andItResponsibleBetween(String value1, String value2) {
            addCriterion("IT_RESPONSIBLE between", value1, value2, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andItResponsibleNotBetween(String value1, String value2) {
            addCriterion("IT_RESPONSIBLE not between", value1, value2, "itResponsible");
            return (Criteria) this;
        }

        public Criteria andUrlSeqIsNull() {
            addCriterion("URL_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andUrlSeqIsNotNull() {
            addCriterion("URL_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andUrlSeqEqualTo(String value) {
            addCriterion("URL_SEQ =", value, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlSeqNotEqualTo(String value) {
            addCriterion("URL_SEQ <>", value, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlSeqGreaterThan(String value) {
            addCriterion("URL_SEQ >", value, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlSeqGreaterThanOrEqualTo(String value) {
            addCriterion("URL_SEQ >=", value, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlSeqLessThan(String value) {
            addCriterion("URL_SEQ <", value, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlSeqLessThanOrEqualTo(String value) {
            addCriterion("URL_SEQ <=", value, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlSeqLike(String value) {
            addCriterion("URL_SEQ like", value, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlSeqNotLike(String value) {
            addCriterion("URL_SEQ not like", value, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlSeqIn(List<String> values) {
            addCriterion("URL_SEQ in", values, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlSeqNotIn(List<String> values) {
            addCriterion("URL_SEQ not in", values, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlSeqBetween(String value1, String value2) {
            addCriterion("URL_SEQ between", value1, value2, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlSeqNotBetween(String value1, String value2) {
            addCriterion("URL_SEQ not between", value1, value2, "urlSeq");
            return (Criteria) this;
        }

        public Criteria andUrlItemIsNull() {
            addCriterion("URL_ITEM is null");
            return (Criteria) this;
        }

        public Criteria andUrlItemIsNotNull() {
            addCriterion("URL_ITEM is not null");
            return (Criteria) this;
        }

        public Criteria andUrlItemEqualTo(String value) {
            addCriterion("URL_ITEM =", value, "urlItem");
            return (Criteria) this;
        }

        public Criteria andUrlItemNotEqualTo(String value) {
            addCriterion("URL_ITEM <>", value, "urlItem");
            return (Criteria) this;
        }

        public Criteria andUrlItemGreaterThan(String value) {
            addCriterion("URL_ITEM >", value, "urlItem");
            return (Criteria) this;
        }

        public Criteria andUrlItemGreaterThanOrEqualTo(String value) {
            addCriterion("URL_ITEM >=", value, "urlItem");
            return (Criteria) this;
        }

        public Criteria andUrlItemLessThan(String value) {
            addCriterion("URL_ITEM <", value, "urlItem");
            return (Criteria) this;
        }

        public Criteria andUrlItemLessThanOrEqualTo(String value) {
            addCriterion("URL_ITEM <=", value, "urlItem");
            return (Criteria) this;
        }

        public Criteria andUrlItemLike(String value) {
            addCriterion("URL_ITEM like", value, "urlItem");
            return (Criteria) this;
        }

        public Criteria andUrlItemNotLike(String value) {
            addCriterion("URL_ITEM not like", value, "urlItem");
            return (Criteria) this;
        }

        public Criteria andUrlItemIn(List<String> values) {
            addCriterion("URL_ITEM in", values, "urlItem");
            return (Criteria) this;
        }

        public Criteria andUrlItemNotIn(List<String> values) {
            addCriterion("URL_ITEM not in", values, "urlItem");
            return (Criteria) this;
        }

        public Criteria andUrlItemBetween(String value1, String value2) {
            addCriterion("URL_ITEM between", value1, value2, "urlItem");
            return (Criteria) this;
        }

        public Criteria andUrlItemNotBetween(String value1, String value2) {
            addCriterion("URL_ITEM not between", value1, value2, "urlItem");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("OPERATOR_NAME is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("OPERATOR_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("OPERATOR_NAME =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("OPERATOR_NAME <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("OPERATOR_NAME >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("OPERATOR_NAME >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("OPERATOR_NAME <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("OPERATOR_NAME <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("OPERATOR_NAME like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("OPERATOR_NAME not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("OPERATOR_NAME in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("OPERATOR_NAME not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("OPERATOR_NAME between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("OPERATOR_NAME not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andModifyNameIsNull() {
            addCriterion("MODIFY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andModifyNameIsNotNull() {
            addCriterion("MODIFY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyNameEqualTo(String value) {
            addCriterion("MODIFY_NAME =", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotEqualTo(String value) {
            addCriterion("MODIFY_NAME <>", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameGreaterThan(String value) {
            addCriterion("MODIFY_NAME >", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("MODIFY_NAME >=", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLessThan(String value) {
            addCriterion("MODIFY_NAME <", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLessThanOrEqualTo(String value) {
            addCriterion("MODIFY_NAME <=", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLike(String value) {
            addCriterion("MODIFY_NAME like", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotLike(String value) {
            addCriterion("MODIFY_NAME not like", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameIn(List<String> values) {
            addCriterion("MODIFY_NAME in", values, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotIn(List<String> values) {
            addCriterion("MODIFY_NAME not in", values, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameBetween(String value1, String value2) {
            addCriterion("MODIFY_NAME between", value1, value2, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotBetween(String value1, String value2) {
            addCriterion("MODIFY_NAME not between", value1, value2, "modifyName");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("IS_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("IS_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Short value) {
            addCriterion("IS_DELETE =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Short value) {
            addCriterion("IS_DELETE <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Short value) {
            addCriterion("IS_DELETE >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_DELETE >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Short value) {
            addCriterion("IS_DELETE <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Short value) {
            addCriterion("IS_DELETE <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Short> values) {
            addCriterion("IS_DELETE in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Short> values) {
            addCriterion("IS_DELETE not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Short value1, Short value2) {
            addCriterion("IS_DELETE between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Short value1, Short value2) {
            addCriterion("IS_DELETE not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNull() {
            addCriterion("IS_ONLINE is null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIsNotNull() {
            addCriterion("IS_ONLINE is not null");
            return (Criteria) this;
        }

        public Criteria andIsOnlineEqualTo(String value) {
            addCriterion("IS_ONLINE =", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotEqualTo(String value) {
            addCriterion("IS_ONLINE <>", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThan(String value) {
            addCriterion("IS_ONLINE >", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("IS_ONLINE >=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThan(String value) {
            addCriterion("IS_ONLINE <", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLessThanOrEqualTo(String value) {
            addCriterion("IS_ONLINE <=", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineLike(String value) {
            addCriterion("IS_ONLINE like", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotLike(String value) {
            addCriterion("IS_ONLINE not like", value, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineIn(List<String> values) {
            addCriterion("IS_ONLINE in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotIn(List<String> values) {
            addCriterion("IS_ONLINE not in", values, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineBetween(String value1, String value2) {
            addCriterion("IS_ONLINE between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsOnlineNotBetween(String value1, String value2) {
            addCriterion("IS_ONLINE not between", value1, value2, "isOnline");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNull() {
            addCriterion("IS_FINISH is null");
            return (Criteria) this;
        }

        public Criteria andIsFinishIsNotNull() {
            addCriterion("IS_FINISH is not null");
            return (Criteria) this;
        }

        public Criteria andIsFinishEqualTo(String value) {
            addCriterion("IS_FINISH =", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotEqualTo(String value) {
            addCriterion("IS_FINISH <>", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThan(String value) {
            addCriterion("IS_FINISH >", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishGreaterThanOrEqualTo(String value) {
            addCriterion("IS_FINISH >=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThan(String value) {
            addCriterion("IS_FINISH <", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLessThanOrEqualTo(String value) {
            addCriterion("IS_FINISH <=", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishLike(String value) {
            addCriterion("IS_FINISH like", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotLike(String value) {
            addCriterion("IS_FINISH not like", value, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishIn(List<String> values) {
            addCriterion("IS_FINISH in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotIn(List<String> values) {
            addCriterion("IS_FINISH not in", values, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishBetween(String value1, String value2) {
            addCriterion("IS_FINISH between", value1, value2, "isFinish");
            return (Criteria) this;
        }

        public Criteria andIsFinishNotBetween(String value1, String value2) {
            addCriterion("IS_FINISH not between", value1, value2, "isFinish");
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