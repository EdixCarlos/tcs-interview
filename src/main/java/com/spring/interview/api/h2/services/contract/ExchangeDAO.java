package com.spring.interview.api.h2.services.contract;

import com.spring.interview.api.h2.model.entity.ExchangeRates;

import java.util.Optional;

public interface ExchangeDAO {
    Optional<ExchangeRates> findById(Integer id);
    ExchangeRates save(ExchangeRates exchangeRate);
    Iterable<ExchangeRates> findAll();
    void deletedById(Integer id);
    Iterable<ExchangeRates> findExchangeRatessByNameRateContainsIgnoreCase(String nameRate);
}
