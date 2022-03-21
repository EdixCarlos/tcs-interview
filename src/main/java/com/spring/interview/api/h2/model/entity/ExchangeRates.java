package com.spring.interview.api.h2.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;
@Entity
@Table(name="exchangerate")
public class ExchangeRates implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="name_rate",nullable = false,unique = true)
    private String nameRate;
    @Column(name="date")
    private Date date;
    @Column(name="rates")
    private BigDecimal rates;
    @Column(name="hight_date")
    private LocalDateTime hightDate;
    @Column(name="update_date")
    private LocalDateTime updateDate;

    public ExchangeRates() {
    }
    public ExchangeRates(Integer id, String nameRate, Date date, BigDecimal rates, LocalDateTime hightDate, LocalDateTime updateDate) {
        this.id = id;
        this.nameRate = nameRate;
        this.date = date;
        this.rates = rates;
        this.hightDate = hightDate;
        this.updateDate = updateDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameRate() {
        return nameRate;
    }

    public void setNameRate(String nameRate) {
        this.nameRate = nameRate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public BigDecimal getRates() {
        return rates;
    }

    public void setRates(BigDecimal rates) {
        this.rates = rates;
    }

    public LocalDateTime getHightDate() {
        return hightDate;
    }

    public void setHightDate(LocalDateTime hightDate) {
        this.hightDate = hightDate;
    }

    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    @PrePersist
    private void beforePersist(){
        this.hightDate=LocalDateTime.now();
    }
    @PreUpdate
    private void beforeUpdate(){
        this.updateDate=LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "ExchangeRates{" +
                "id=" + id +
                ", nameRate='" + nameRate + '\'' +
                ", date=" + date +
                ", rates=" + rates +
                ", hightDate=" + hightDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
