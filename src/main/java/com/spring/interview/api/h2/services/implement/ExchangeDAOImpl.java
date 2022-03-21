package com.spring.interview.api.h2.services.implement;

import com.spring.interview.api.h2.model.entity.ExchangeRates;
import com.spring.interview.api.h2.model.repository.ExchangeRepository;
import com.spring.interview.api.h2.services.contract.ExchangeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
public class ExchangeDAOImpl implements ExchangeDAO {
    @Autowired
    private ExchangeRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Optional<ExchangeRates> findById(Integer id) {
        return repository.findById(id);
    }

    @Transactional
    @Override
    public ExchangeRates save(ExchangeRates exchangeRate) {
        return repository.save(exchangeRate);
    }

    @Transactional(readOnly = true)
    @Override
    public Iterable<ExchangeRates> findAll() {
        return repository.findAll();
    }

    @Transactional
    @Override
    public void deletedById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Iterable<ExchangeRates> findExchangeRatessByNameRateContainsIgnoreCase(String nameRate) {
        return repository.findExchangeRatessByNameRateContainsIgnoreCase(nameRate);
    }
}
