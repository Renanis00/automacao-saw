package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GravaArquivo {

    private String caminhoArquivo;

    public GravaArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void escreverDocumento(String s) throws IOException {
        BufferedWriter bufferEscrita = new BufferedWriter(new FileWriter(caminhoArquivo, true));
        PrintWriter arq = new PrintWriter(bufferEscrita);
        try {
            arq.println(s);
        } finally {
            bufferEscrita.close();
            arq.close();
        }
    }


    public String retornaUltimaLinhaArquivo() throws IOException {
        BufferedReader bufferLeitura = new BufferedReader(new FileReader(caminhoArquivo));
        String ultimaLinha = "";
        String linhaAtual;

        try {
            while ((linhaAtual = bufferLeitura.readLine()) != null) {
                ultimaLinha = linhaAtual;
            }
        } finally {
            bufferLeitura.close();
        }
        return ultimaLinha;
    }

    public String retornaParteDaLinhaArquivo() throws IOException {
        BufferedReader bufferLeitura = new BufferedReader(new FileReader(caminhoArquivo));
        String ultimaLinha = "";
        String linhaAtual = "";

        while ((linhaAtual = bufferLeitura.readLine()) != null) {
            Matcher matcher = Pattern.compile(":\\s\\w*").matcher(linhaAtual); // Primeiro Filtro (Pega tudo que tem :, espaço, e tudo que vem depois que seja alfanumerico)
            while (matcher.find()) {

                Pattern pattern = Pattern.compile(":\\s"); // Segundo Filtro (Elimina o ":" e o espaço)
                Scanner scanner = new Scanner(matcher.group()).useDelimiter(pattern);
                Matcher matcher2 = pattern.matcher(ultimaLinha);
                while (scanner.hasNext()) {
                    ultimaLinha = scanner.next();
                    // System.out.println(ultimaLinha); // retorna apenas "912f907d06189a1fd4ef42422332359b"
                }
            }
        }
        return ultimaLinha;
    }


}
