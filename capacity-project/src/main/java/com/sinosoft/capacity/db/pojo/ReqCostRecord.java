package com.sinosoft.capacity.db.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class ReqCostRecord extends ReqCostRecordKey {
    private String year;

    private BigDecimal december;

    private BigDecimal january;

    private BigDecimal february;

    private BigDecimal march;

    private BigDecimal april;

    private BigDecimal may;

    private BigDecimal june;

    private BigDecimal july;

    private BigDecimal august;

    private BigDecimal september;

    private BigDecimal october;

    private BigDecimal november;

    private BigDecimal totalCost;

    private Date serverStartTime;

    private Date serverEndTime;

    private String dpartName;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    public BigDecimal getDecember() {
        return december;
    }

    public void setDecember(BigDecimal december) {
        this.december = december;
    }

    public BigDecimal getJanuary() {
        return january;
    }

    public void setJanuary(BigDecimal january) {
        this.january = january;
    }

    public BigDecimal getFebruary() {
        return february;
    }

    public void setFebruary(BigDecimal february) {
        this.february = february;
    }

    public BigDecimal getMarch() {
        return march;
    }

    public void setMarch(BigDecimal march) {
        this.march = march;
    }

    public BigDecimal getApril() {
        return april;
    }

    public void setApril(BigDecimal april) {
        this.april = april;
    }

    public BigDecimal getMay() {
        return may;
    }

    public void setMay(BigDecimal may) {
        this.may = may;
    }

    public BigDecimal getJune() {
        return june;
    }

    public void setJune(BigDecimal june) {
        this.june = june;
    }

    public BigDecimal getJuly() {
        return july;
    }

    public void setJuly(BigDecimal july) {
        this.july = july;
    }

    public BigDecimal getAugust() {
        return august;
    }

    public void setAugust(BigDecimal august) {
        this.august = august;
    }

    public BigDecimal getSeptember() {
        return september;
    }

    public void setSeptember(BigDecimal september) {
        this.september = september;
    }

    public BigDecimal getOctober() {
        return october;
    }

    public void setOctober(BigDecimal october) {
        this.october = october;
    }

    public BigDecimal getNovember() {
        return november;
    }

    public void setNovember(BigDecimal november) {
        this.november = november;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public Date getServerStartTime() {
        return serverStartTime;
    }

    public void setServerStartTime(Date serverStartTime) {
        this.serverStartTime = serverStartTime;
    }

    public Date getServerEndTime() {
        return serverEndTime;
    }

    public void setServerEndTime(Date serverEndTime) {
        this.serverEndTime = serverEndTime;
    }

    public String getDpartName() {
        return dpartName;
    }

    public void setDpartName(String dpartName) {
        this.dpartName = dpartName == null ? null : dpartName.trim();
    }
}