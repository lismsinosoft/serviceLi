package com.sinosoft.capacity.db.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ReqRequirementRecord {
    private String seqNo;

    private String startDocument;

    private String onlineDocument;

    private String disbursementNo;

    private BigDecimal workloadTatal;

    private BigDecimal workloadOrder;

    private BigDecimal workloadPos;

    private BigDecimal workloadRsp;

    private BigDecimal workloadRsp2;

    private BigDecimal workloadClaim;

    private BigDecimal workloadLip;

    private BigDecimal workloadCcp;

    private BigDecimal workloadData;

    private BigDecimal workloadFrame;

    private BigDecimal workloadProduct;

    private BigDecimal unitPrice;

    private String dateTime;

    private String item;

    private String seqName;

    private String department;

    private String provider;

    private String itResponsible;

    private String urlSeq;

    private String urlItem;

    private String operatorName;

    private String modifyName;

    private Date createDate;

    private String remark;

    private Short isDelete;

    private String status;

    private String isOnline;

    private String isFinish;

    public String getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
    }

    public String getStartDocument() {
        return startDocument;
    }

    public void setStartDocument(String startDocument) {
        this.startDocument = startDocument == null ? null : startDocument.trim();
    }

    public String getOnlineDocument() {
        return onlineDocument;
    }

    public void setOnlineDocument(String onlineDocument) {
        this.onlineDocument = onlineDocument == null ? null : onlineDocument.trim();
    }

    public String getDisbursementNo() {
        return disbursementNo;
    }

    public void setDisbursementNo(String disbursementNo) {
        this.disbursementNo = disbursementNo == null ? null : disbursementNo.trim();
    }

    public BigDecimal getWorkloadTatal() {
        return workloadTatal;
    }

    public void setWorkloadTatal(BigDecimal workloadTatal) {
        this.workloadTatal = workloadTatal;
    }

    public BigDecimal getWorkloadOrder() {
        return workloadOrder;
    }

    public void setWorkloadOrder(BigDecimal workloadOrder) {
        this.workloadOrder = workloadOrder;
    }

    public BigDecimal getWorkloadPos() {
        return workloadPos;
    }

    public void setWorkloadPos(BigDecimal workloadPos) {
        this.workloadPos = workloadPos;
    }

    public BigDecimal getWorkloadRsp() {
        return workloadRsp;
    }

    public void setWorkloadRsp(BigDecimal workloadRsp) {
        this.workloadRsp = workloadRsp;
    }

    public BigDecimal getWorkloadRsp2() {
        return workloadRsp2;
    }

    public void setWorkloadRsp2(BigDecimal workloadRsp2) {
        this.workloadRsp2 = workloadRsp2;
    }

    public BigDecimal getWorkloadClaim() {
        return workloadClaim;
    }

    public void setWorkloadClaim(BigDecimal workloadClaim) {
        this.workloadClaim = workloadClaim;
    }

    public BigDecimal getWorkloadLip() {
        return workloadLip;
    }

    public void setWorkloadLip(BigDecimal workloadLip) {
        this.workloadLip = workloadLip;
    }

    public BigDecimal getWorkloadCcp() {
        return workloadCcp;
    }

    public void setWorkloadCcp(BigDecimal workloadCcp) {
        this.workloadCcp = workloadCcp;
    }

    public BigDecimal getWorkloadData() {
        return workloadData;
    }

    public void setWorkloadData(BigDecimal workloadData) {
        this.workloadData = workloadData;
    }

    public BigDecimal getWorkloadFrame() {
        return workloadFrame;
    }

    public void setWorkloadFrame(BigDecimal workloadFrame) {
        this.workloadFrame = workloadFrame;
    }

    public BigDecimal getWorkloadProduct() {
        return workloadProduct;
    }

    public void setWorkloadProduct(BigDecimal workloadProduct) {
        this.workloadProduct = workloadProduct;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime == null ? null : dateTime.trim();
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item == null ? null : item.trim();
    }

    public String getSeqName() {
        return seqName;
    }

    public void setSeqName(String seqName) {
        this.seqName = seqName == null ? null : seqName.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider == null ? null : provider.trim();
    }

    public String getItResponsible() {
        return itResponsible;
    }

    public void setItResponsible(String itResponsible) {
        this.itResponsible = itResponsible == null ? null : itResponsible.trim();
    }

    public String getUrlSeq() {
        return urlSeq;
    }

    public void setUrlSeq(String urlSeq) {
        this.urlSeq = urlSeq == null ? null : urlSeq.trim();
    }

    public String getUrlItem() {
        return urlItem;
    }

    public void setUrlItem(String urlItem) {
        this.urlItem = urlItem == null ? null : urlItem.trim();
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName == null ? null : operatorName.trim();
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName == null ? null : modifyName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Short getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(String isOnline) {
        this.isOnline = isOnline == null ? null : isOnline.trim();
    }

    public String getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(String isFinish) {
        this.isFinish = isFinish == null ? null : isFinish.trim();
    }
}