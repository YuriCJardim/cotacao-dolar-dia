package br.com.jardim.cotacaodolardia.service;

import br.com.jardim.cotacaodolardia.entity.CotacaoDolar;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CotacaoService {


        private final RestTemplate restTemplate;

        public CotacaoService(RestTemplateBuilder restTemplateBuilder) {
            this.restTemplate = restTemplateBuilder.build();
        }

    public ResponseEntity<CotacaoDolar> consultarCotacaoDolar(String date) {

        String url = "https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/CotacaoDolarDia(dataCotacao=@dataCotacao)?@dataCotacao='12-15-2022'&$top=100&$format=json&$select=cotacaoCompra,cotacaoVenda,dataHoraCotacao";
//            String url = String.format("https://olinda.bcb.gov.br/olinda/servico/PTAX/versao/v1/odata/CotacaoDolarDia(dataCotacao=@dataCotacao)" +
//                "?@dataCotacao='%s'&$top=100&$format=json&$select=cotacaoCompra,cotacaoVenda,dataHoraCotacao", date);
        ResponseEntity <CotacaoDolar> response = restTemplate.getForEntity(url, CotacaoDolar.class);
       return ResponseEntity.ok(response.getBody());

    }
}

