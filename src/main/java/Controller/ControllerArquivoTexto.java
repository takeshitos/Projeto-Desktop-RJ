/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jonas
 */
public class ControllerArquivoTexto extends ControllerArquivo{
    private String texto = null;
    private BufferedReader leitura = null;
    private BufferedWriter escrita = null;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    /**
     * @return retorna se a leitura der certo, senao retorna falso
     */
    
    public boolean ler() {
        StringBuilder line = new StringBuilder();
        try {
            leitura = new BufferedReader(new FileReader(arquivo));
            while (leitura.ready()) {
                line.append(leitura.readLine()).append("\n");
            }
            leitura.close();
            setTexto(line.toString());
            return true;
        } catch (FileNotFoundException erro) {
            //erro.printStackTrace(); //usado para debug
            System.err.println(erro.getMessage() + "Arquivo não encontrado.");
            return false;
        } catch (IOException erro) {
            System.err.println(erro.getMessage() + "Erro ao ler arquivo.");
            return false;
        }
    }

    /**
     * @param append se o texto será continuado a partir do seu
     * final (append = false) ou se o arquivo será sobrescrito (append = false)
     * @return true caso a operação de escrita seja bem sucedida ou false
     * caso contrário.
     */
    
    public boolean escrever(boolean append) {
        if (arquivo != null) {
            try {
                escrita = new BufferedWriter(new FileWriter(arquivo, append));
                escrita.write(getTexto());
                escrita.close();
                return true;
            } catch (IOException erro) {
                System.err.println(erro.getMessage() + "Erro ao ler arquivo.");
                return false;
            }
        } else {
            return false;
        }
    }

}
