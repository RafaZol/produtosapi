package io.github.RafaZol.produtosapi.model;

import lombok.Data;

//POJO -> Plain OLd Object
@Data
public class Produto {

    private String id;
    private String nome;
    private String descricao;
    private Double preco;


}
