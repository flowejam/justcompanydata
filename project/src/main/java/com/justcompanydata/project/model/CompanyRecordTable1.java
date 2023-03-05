package com.justcompanydata.project.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.math.BigDecimal;

import javax.persistence.Column;


@Entity
@Table(name = "data_for_table_1")
public class CompanyRecordTable1 {
    /*"select ticker, company_name, ebit, total_debt, " +
            "preferred_stock_value, noncontrolling_interest_value, " +
            "cash_and_cashequivalents_value from company_data" + */
    @Id
    @Column(name = "ticker")
    private String ticker;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "ebit")
    private BigDecimal ebit;

    @Column(name = "total_debt")
    private BigDecimal totalDebt;

    @Column(name = "preferred_stock_value")
    private BigDecimal preferredStockValue;
    
    @Column(name = "noncontrolling_interest_value")
    private BigDecimal noncontrollingInterestValue;

    @Column(name = "cash_and_cashequivalents_value")
    private BigDecimal cashAndCashEquivalentsValue;

    @Column(name = "fiscal_year")
    private int fiscalYear;


    public int getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(int fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public CompanyRecordTable1(String ticker, String companyName, BigDecimal ebit, BigDecimal totalDebt,
            BigDecimal preferredStockValue, BigDecimal noncontrollingInterestValue,
            BigDecimal cashAndCashEquivalentsValue, int fiscalYear) {
        this.ticker = ticker;
        this.companyName = companyName;
        this.ebit = ebit;
        this.totalDebt = totalDebt;
        this.preferredStockValue = preferredStockValue;
        this.noncontrollingInterestValue = noncontrollingInterestValue;
        this.cashAndCashEquivalentsValue = cashAndCashEquivalentsValue;
        this.fiscalYear = fiscalYear;
    }

    public CompanyRecordTable1() {
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public BigDecimal getEbit() {
        return ebit;
    }

    public void setEbit(BigDecimal ebit) {
        this.ebit = ebit;
    }

    public BigDecimal getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(BigDecimal totalDebt) {
        this.totalDebt = totalDebt;
    }

    public BigDecimal getPreferredStockValue() {
        return preferredStockValue;
    }

    public void setPreferredStockValue(BigDecimal preferredStockValue) {
        this.preferredStockValue = preferredStockValue;
    }

    public BigDecimal getNoncontrollingInterestValue() {
        return noncontrollingInterestValue;
    }

    public void setNoncontrollingInterestValue(BigDecimal noncontrollingInterestValue) {
        this.noncontrollingInterestValue = noncontrollingInterestValue;
    }

    public BigDecimal getCashAndCashEquivalentsValue() {
        return cashAndCashEquivalentsValue;
    }

    public void setCashAndCashEquivalentsValue(BigDecimal cashAndCashEquivalentsValue) {
        this.cashAndCashEquivalentsValue = cashAndCashEquivalentsValue;
    }

    @Override
    public String toString() {
        return "CompanyRecordTable1 [ticker=" + ticker + ", companyName=" + companyName + ", ebit=" + ebit
                + ", totalDebt=" + totalDebt + ", preferredStockValue=" + preferredStockValue
                + ", noncontrollingInterestValue=" + noncontrollingInterestValue + ", cashAndCashEquivalentsValue="
                + cashAndCashEquivalentsValue + "]";
    }
}
