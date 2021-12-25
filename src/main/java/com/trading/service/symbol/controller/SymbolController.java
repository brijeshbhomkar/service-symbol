package com.trading.service.symbol.controller;

import com.trading.service.symbol.api.SymbolApi;
import com.trading.service.symbol.models.Symbol;
import com.trading.service.symbol.repository.SymbolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class SymbolController implements SymbolApi {

    @Autowired
    private SymbolRepository symbolRepository;

    @Override
    public ResponseEntity<List<Symbol>> findsymbol(@Valid String findSymbol) {
        List<Symbol> symbols = new ArrayList<>();
        com.trading.service.symbol.entity.Symbol symbol = new com.trading.service.symbol.entity.Symbol();
        symbol.setName("SBI.NS");
        symbol.setDatafrom("yahoo.finance");
        symbol.setExchange("NSE");
        //create symbol
        symbolRepository.save(symbol);

        return new ResponseEntity(symbols, HttpStatus.OK);
    }

    @GetMapping("/test")
    public String test() {
        return "Test successful!!..";
    }
}
