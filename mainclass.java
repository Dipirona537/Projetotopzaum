package com.dipirona;

import java.io.IOException;
import java.util.Scanner;

public class mainclass {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        if (!com.dipirona.existente.existe())
        {
            com.dipirona.existente.nao_existe();
        }
        String arquivo_local = "C:\\Testes\\Doc.txt";
        String dados;
        System.out.println("Digita alguma merda ai q o programa vai ler e vai te contar dps sua PUTA\nEle vai salvar em um arquivinho :)\nUse $ para pular linha e sair pra sair obviamente.");
        do
        {
            dados = sc.nextLine();
            com.dipirona.dados.escrever_dados(dados, arquivo_local, true);
        }while(!dados.equals("sair"));
        System.out.println("O que vc escreveu -> \n");
        com.dipirona.dados.ler_dados(arquivo_local);
        System.out.println("Voce escreveu "+ com.dipirona.dados.linhas(arquivo_local) +" linhas e "+ com.dipirona.dados.caracters(arquivo_local) +" caracteres.");
    }

}
