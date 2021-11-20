package com.trading.service.symbol.controller;

import com.trading.service.symbol.api.SymbolApi;
import com.trading.service.symbol.models.Symbol;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class SymbolController implements SymbolApi {

    @Override
    public ResponseEntity<List<Symbol>> findsymbol(@Valid String findSymbol) {
        List<Symbol> symbols = new ArrayList<>();
        Symbol symbol = new Symbol();
        symbol.setId(UUID.randomUUID());
        symbol.setSymbolid(123);
        symbol.setSymbol("SBI");
        symbol.exchange("NSE");
        symbols.add(symbol);
        return new ResponseEntity(symbols, HttpStatus.OK);
    }
}
