package com.dipirona;

import java.io.File;
import java.io.IOException;

public class existente {
    public static boolean existe() {
        File arquivo = new File("C:\\Testes\\Doc.txt");
        return arquivo.exists();
    }
    public static void nao_existe() throws IOException, InterruptedException {
        System.out.println("---------------------------------------------------------------------------------------------------");
        System.out.println("------------Arquivo não encontrado! criando diretório e arquivo em C:\\Testes\\Doc.txt...------------");
        System.out.println("---------------------------------------------------------------------------------------------------");
        String comando1 = "mkdir C:\\Testes";
        String comando2 = "type nul > C:\\Testes\\Doc.txt";
        com.dipirona.executar_comando.cmd(comando1);
        com.dipirona.executar_comando.cmd(comando2);
    }
}
