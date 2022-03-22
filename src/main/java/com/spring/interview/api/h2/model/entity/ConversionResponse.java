package com.spring.interview.api.h2.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class ConversionResponse implements Serializable {
    private BigDecimal amount;
    private BigDecimal converted;
    private String from;
    private String to;
    private BigDecimal rates;
    private String developer;

    public ConversionResponse() {
    }

    public ConversionResponse(BigDecimal amount, BigDecimal converted, String from, String to, BigDecimal rates, String developer) {
        this.amount = amount;
        this.converted = converted;
        this.from = from;
        this.to = to;
        this.rates = rates;
        this.developer = developer;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getConverted() {
        return converted;
    }

    public void setConverted(BigDecimal converted) {
        this.converted = converted;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getRates() {
        return rates;
    }

    public void setRates(BigDecimal rates) {
        this.rates = rates;
    }

    public String getDeveloper() {
        return developer;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    @Override
    public String toString() {
        return "ConversionResponse{" +
                "amount=" + amount +
                ", converted=" + converted +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", rates=" + rates +
                ", developer='" + developer + '\'' +
                '}';
    }
}
