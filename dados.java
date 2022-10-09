package com.dipirona;

import java.io.*;
import java.util.Scanner;
public class dados {
    public static void escrever_dados(String dados, String arquivo_local, boolean append) throws IOException {
        if (!dados.equals("sair"))
        {
            FileOutputStream outputStream = new FileOutputStream(arquivo_local, append);
            byte[] dados_b = (dados.getBytes());
            outputStream.write(dados_b);
        }
    }

    public static void ler_dados(String arquivo_local) throws IOException {
        File arquivo = new File(arquivo_local);
        Scanner sc = new Scanner(arquivo);
        String linha;
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            for (int i = 0;i<linha.length();i++)
            {
                if (linha.charAt(i) != '$')
                {
                    System.out.print(linha.charAt(i));
                }else{
                    System.out.print("\n");
                }
            }
            }
    }
        //System.out.println("Linhas = "+linhas);

    public static int linhas(String arquivo_local) throws FileNotFoundException {
        File arquivo = new File(arquivo_local);
        Scanner sc = new Scanner(arquivo);
        String linha;
        int linhas = 0;
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            for (int i = 0; i < linha.length(); i++) {
                if (linha.charAt(i) == '$') {
                    linhas++;
                }
            }
        }
        return linhas;
    }

    public static int caracters(String arquivo_local) throws FileNotFoundException {
        File arquivo = new File(arquivo_local);
        Scanner sc = new Scanner(arquivo);
        String linha;
        int caracters = 0;
        while (sc.hasNextLine()) {
            linha = sc.nextLine();
            for (int i = 0; i < linha.length(); i++) {
                if (linha.charAt(i) != '$') {
                    caracters++;
                }
            }
        }
        return caracters;
    }
}
