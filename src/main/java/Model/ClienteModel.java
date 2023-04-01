/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author jonas
 */
public class ClienteModel {
    protected String nome;
    private String sobrenome;
    private String email;
    private String telefone;
    private String endereco;
    private String cidade;
    private String estado;
    private String pais;
    private String codigoPostal;
    private String numeroIdentificacao;
    private String dataNascimento;
    private String dataRegistro;
    
    public ClienteModel(){
        
    }
    
    public ClienteModel(String nome, String sobrenome, String email, String endereco, String cidade, String estado, String pais, String codigoPostal, String numeroIdentificacao, String dataNascimento, String dataRegistro){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.codigoPostal = codigoPostal;
        this.numeroIdentificacao = numeroIdentificacao;
        this.dataNascimento = dataNascimento;
        this.dataRegistro = dataRegistro;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCodigoPostal(String codigoPostal) {
        this.codigoPostal = codigoPostal;
    }

    public void setNumeroIdentificacao(String numeroIdentificacao) {
        this.numeroIdentificacao = numeroIdentificacao;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getPais() {
        return pais;
    }

    public String getCodigoPostal() {
        return codigoPostal;
    }

    public String getNumeroIdentificacao() {
        return numeroIdentificacao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }
    
    
}
