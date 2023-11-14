package br.com.jardim.cotacaodolardia.controller;

import br.com.jardim.cotacaodolardia.service.CotacaoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/dolar")
public class CotacaoController {


    private final CotacaoService service;

    public CotacaoController(CotacaoService service) {
        this.service = service;
    }

    @GetMapping(value = "/{date}")
    public ResponseEntity<?> obterCotacaoDia(@PathVariable String date) {
       try {
           return ResponseEntity.ok(service.consultarCotacaoDolar(date));
       }catch (Exception e){
           return ResponseEntity.badRequest().body(e.getMessage());
       }

    }
}
