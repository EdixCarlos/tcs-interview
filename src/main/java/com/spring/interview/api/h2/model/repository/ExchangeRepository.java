package com.spring.interview.api.h2.model.repository;

import com.spring.interview.api.h2.model.entity.ExchangeRates;
import org.springframework.data.repository.CrudRepository;

public interface ExchangeRepository extends CrudRepository<ExchangeRates,Integer> {
    Iterable<ExchangeRates> findExchangeRatessByNameRateContainsIgnoreCase(String nameRate);
}
