package io.github.RafaZol.produtosapi.controller;

import io.github.RafaZol.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Classe que recebe requisiçoes
@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @PostMapping   // criar o recurso
    public Produto save(@RequestBody  Produto p){ //@RequestBody captura os dados do body da requisiçao JSON
        System.out.println("Produto salvo: " +  p.toString());
        return p;
    }
}
