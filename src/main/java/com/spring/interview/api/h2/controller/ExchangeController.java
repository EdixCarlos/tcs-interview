package com.spring.interview.api.h2.controller;

import com.spring.interview.api.h2.exception.BadRequestException;
import com.spring.interview.api.h2.model.entity.ConversionResponse;
import com.spring.interview.api.h2.model.entity.ExchangeRates;
import com.spring.interview.api.h2.services.contract.ExchangeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/")
public class ExchangeController {
    private final ExchangeDAO exchangeDAO;
    @Autowired
    public ExchangeController(ExchangeDAO exchangeDAO){
        this.exchangeDAO = exchangeDAO;
    }
    @GetMapping
    public List<ExchangeRates> getAll(){
        List<ExchangeRates> exchange = (List<ExchangeRates>) exchangeDAO.findAll();
        if(exchange.isEmpty()){
            throw new BadRequestException("no existen datos");
        }
        return  exchange;
    }
    @GetMapping("/{id}")
    public ExchangeRates getById(@PathVariable(value="id",required = false) Integer id){
        Optional<ExchangeRates> oExchanges = exchangeDAO.findById(id);
        if(!oExchanges.isPresent()){
            throw new BadRequestException(String.format("el exchange no existe",id));
        }
        return oExchanges.get();
    }
    @GetMapping("/from/{from}/to/{to}/amount/{amount}")
    public ConversionResponse getByNameRate(@PathVariable(value="from")String from,@PathVariable(value="to")String to, @PathVariable(value="amount")BigDecimal amount){
        List<ExchangeRates> exchangeRates = (List<ExchangeRates>) exchangeDAO.findExchangeRatessByNameRateContainsIgnoreCase(from+to);
        if(exchangeRates.isEmpty()){
            throw new BadRequestException("No sorportamos este tipo de cambio");
        }
        ConversionResponse data = new ConversionResponse(amount,amount.multiply(exchangeRates.get(0).getRates()),exchangeRates.get(0).getNameRate().substring(0,3),exchangeRates.get(0).getNameRate().substring(3,6),exchangeRates.get(0).getRates(),"EDIXCARLOS");
        return data;
    }
    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @PostMapping
    public ExchangeRates newExchange(@RequestBody ExchangeRates exchange){
        return exchangeDAO.save(exchange);
    }
}
