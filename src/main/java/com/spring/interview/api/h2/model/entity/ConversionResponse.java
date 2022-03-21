package com.spring.interview.api.h2.model.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class ConversionResponse implements Serializable {
    private BigDecimal amount;
    private BigDecimal converted;
    private String from;
    private String to;
    private String typeConversion;

    public ConversionResponse() {
    }

    public ConversionResponse(BigDecimal amount, BigDecimal converted, String from, String to, String typeConversion) {
        this.amount = amount;
        this.converted = converted;
        this.from = from;
        this.to = to;
        this.typeConversion = typeConversion;
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

    public String getTypeConversion() {
        return typeConversion;
    }

    public void setTypeConversion(String typeConversion) {
        this.typeConversion = typeConversion;
    }
    @Override
    public String toString() {
        return "ConversionResponse{" +
                "amount=" + amount +
                ", converted=" + converted +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", typeConversion='" + typeConversion + '\'' +
                '}';
    }
}
