package model;

import java.util.Date;

public class Autor {

    private int idautor;
    private String nome;
    private Date dataCadastro;
    private String municipio;
    private String localidade;
    private String produtos;
    private int status;
    private String telefone;
    

    public int getidautor() {
        return idautor;
    }

    public void setidautor(int idautor) {
        this.idautor = idautor;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }
     public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
     public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
     public String getProdutos() {
        return produtos;
    }

    public void setProdutos(String produtos) {
        this.produtos = produtos;
    }
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
