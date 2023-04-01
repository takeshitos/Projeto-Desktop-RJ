package Controller;

import Model.ClienteModel;

/**
 *
 * @author ricar
 */
public class ControllerCliente {
    
    public void cadastrarCliente(String nome, String sobrenome, String email, String endereco, String cidade, String estado, String pais, String codigoPostal, String numeroIdentificacao, String dataNascimento, String dataRegistro){
        ClienteModel novoCliente = new ClienteModel();
        novoCliente.setNome(nome);
        novoCliente.setSobrenome(sobrenome);
        novoCliente.setEmail(email);
        novoCliente.setEndereco(endereco);
        novoCliente.setCidade(cidade);
        novoCliente.setEstado(estado);
        novoCliente.setPais(pais);
        novoCliente.setCodigoPostal(codigoPostal);
        novoCliente.setNumeroIdentificacao(numeroIdentificacao);
        novoCliente.setDataNascimento(dataNascimento);
        novoCliente.setDataRegistro(dataRegistro);
    }   
}
