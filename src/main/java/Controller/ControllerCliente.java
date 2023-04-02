package Controller;

import Model.ClienteModel;
import javax.swing.JOptionPane;

/**
 *
 * @author ricar
 */
public class ControllerCliente {
    
    public static boolean cadastrarCliente(String nome, String sobrenome, String email,String telefone, String endereco, String cidade, String estado, String pais, String codigoPostal, String numeroIdentificacao, String dataNascimento, String dataRegistro){
        ClienteModel novoCliente = new ClienteModel();
        novoCliente.setNome(nome);
        novoCliente.setSobrenome(sobrenome);
        novoCliente.setEmail(email);
        novoCliente.setTelefone(telefone);
        novoCliente.setEndereco(endereco);
        novoCliente.setCidade(cidade);
        novoCliente.setEstado(estado);
        novoCliente.setPais(pais);
        novoCliente.setCodigoPostal(codigoPostal);
        novoCliente.setNumeroIdentificacao(numeroIdentificacao);
        novoCliente.setDataNascimento(dataNascimento);
        novoCliente.setDataRegistro(dataRegistro);
        
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ");
        sb.append(novoCliente.getNumeroIdentificacao());
        sb.append("\nNOME: ");
        sb.append(novoCliente.getNome());
        sb.append("\nSOBRENOME: ");
        sb.append(novoCliente.getSobrenome());
        sb.append("\nE-MAIL: ");
        sb.append(novoCliente.getEmail());
        sb.append("\nTELEFONE: ");
        sb.append(novoCliente.getTelefone());
        sb.append("\nENDEREÇO: ");
        sb.append(novoCliente.getEndereco());
        sb.append("\nCIDADE: ");
        sb.append(novoCliente.getCidade());
        sb.append("\nESTADO: ");
        sb.append(novoCliente.getEstado());
        sb.append("\nPAÍS: ");
        sb.append(novoCliente.getPais());
        sb.append("\nCEP: ");
        sb.append(novoCliente.getCodigoPostal());
        sb.append("\nDATA NASCIMENTO: ");
        sb.append(novoCliente.getDataNascimento());
        sb.append("\nDATA REGISTRO: ");
        sb.append(novoCliente.getDataRegistro());
        
        ControllerClienteArquivoTexto arquivo = new ControllerClienteArquivoTexto();
        arquivo.setArquivo("Salvar Como");
        arquivo.setTexto(sb.toString());
        
        if(arquivo.escrever(false)){
            return true;
        }else{
            return false;
        }
       
    }  
}
