package com.udemy.gvendas.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "item_venda")
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private Long codigo;

    @Column(name = "quantidade")
    private Integer quantidade;

    @Column(name = "preco_vendido")
    private BigDecimal precoVendido;

    @ManyToOne
    @JoinColumn(name = "codigo_produto", referencedColumnName = "codigo")
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "codigo_venda", referencedColumnName = "codigo")
    private Venda venda;

    public ItemVenda(Long codigo, Integer quantidade, BigDecimal precoVendido, Produto produto, Venda venda) {
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoVendido = precoVendido;
        this.produto = produto;
        this.venda = venda;
    }

    public ItemVenda(Integer quantidade, BigDecimal precoVendido, Produto produto, Venda venda) {
        this.quantidade = quantidade;
        this.precoVendido = precoVendido;
        this.produto = produto;
        this.venda = venda;
    }

    public ItemVenda() {
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPrecoVendido() {
        return precoVendido;
    }

    public void setPrecoVendido(BigDecimal precoVendido) {
        this.precoVendido = precoVendido;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}
