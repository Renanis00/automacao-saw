package util;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.openqa.selenium.Keys;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import static selenium.MetodosUteis.*;

public class ModificarArquivoXML {


    public void modificaXML() {

        try {

            GravaArquivo arquivo = new GravaArquivo(caminhoProjeto + "/src/test/java/arquivosGerados/novoXmlGerado.txt");
            String retornoUltimaLinha = arquivo.retornaUltimaLinhaArquivo();

            String filepath = "src/test/java/arquivosGerados/".concat(retornoUltimaLinha);
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);

            // Obtenha o elemento raiz
            Node company = doc.getFirstChild();

            // Obtenha o elemento, ele pode não funcionar se a tag tiver espaços, ou
            // quaisquer personagens estranhos na frente ... é melhor usar
            //getElementsByTagName () para obtê-lo diretamente.
            // Node staff = company.getFirstChild();

            Random gerador = new Random();
            int numeroGerado = gerador.nextInt(900000000) + 100000000;

            //Obtenha o elemento por nome de tag diretamente
            Node numeroLote = doc.getElementsByTagName("ans:numeroLote").item(0);
            numeroLote.setTextContent(String.valueOf(gerador.nextInt(9000000) + 1000000));
            Node numeroGuiaPrestador = doc.getElementsByTagName("ans:numeroGuiaPrestador").item(0);
            numeroGuiaPrestador.setTextContent(String.valueOf(numeroGerado));
            // numeroGuiaPrestador.setTextContent("");
            Node numeroGuiaSolicitacaoInternacao = doc.getElementsByTagName("ans:numeroGuiaSolicitacaoInternacao").item(0);
            numeroGuiaSolicitacaoInternacao.setTextContent(String.valueOf(numeroGerado));
            Node numeroGuiaOperadora = doc.getElementsByTagName("ans:numeroGuiaOperadora").item(0);
            numeroGuiaOperadora.setTextContent(String.valueOf(numeroGerado));

            Node senha = doc.getElementsByTagName("ans:senha").item(0);
            senha.setTextContent(String.valueOf(numeroGerado));
            // escrever o conteúdo em arquivo xml
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);
            //System.out.println("xml - Done");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }

    }

    public void modificaHashDoXML() {

        try {


            GravaArquivo arquivo1 = new GravaArquivo(caminhoProjeto + "/src/test/java/arquivosGerados/novoXmlGerado.txt");
            String retornoUltimaLinha = arquivo1.retornaUltimaLinhaArquivo();

            String filepath = "src/test/java/arquivosGerados/".concat(retornoUltimaLinha);





            //String filepath = "src/test/java/arquivosGerados/resumoInternacao3.xml";
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            Document doc = docBuilder.parse(filepath);
            // Obtenha o elemento raiz
            Node company = doc.getFirstChild();
            GravaArquivo arquivo = new GravaArquivo(caminhoProjeto + "/src/test/java/arquivosGerados/hashCorreto.txt");
            // Merodo que retorna parte exata da linha com o numero do hash

            String retornaParteDalinha = arquivo.retornaParteDaLinhaArquivo();
            //Obtenha o elemento por nome de tag diretamente
            Node hash = doc.getElementsByTagName("ans:hash").item(0);
            hash.setTextContent(retornaParteDalinha);

            // escrever o conteúdo em arquivo xml
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File(filepath));
            transformer.transform(source, result);
            //renomearArquivo();

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }


    }




    public void renomearArquivo() throws IOException, SAXException, ParserConfigurationException {

        Random gerador = new Random();
        int numeroGerado = gerador.nextInt(9000) + 1000;



        GravaArquivo arquivo3 = new GravaArquivo(caminhoProjeto + "/src/test/java/arquivosGerados/novoXmlGerado.txt");
        String retornoUltimaLinha = arquivo3.retornaUltimaLinhaArquivo();

        String filepath = "src/test/java/arquivosGerados/".concat(retornoUltimaLinha);



       // String filepath = "src/test/java/arquivosGerados/resumoInternacao3.xml";
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.parse(filepath);

        File newFile = new File(filepath = "src/test/java/arquivosGerados/".concat(retornoUltimaLinha));
        File renFile = new File(filepath = "src/test/java/arquivosGerados/resumoInternacao".concat(String.valueOf(numeroGerado) + ".xml"));

        //gravar novo nome do xml em um arquivo txt
        String aux = renFile.getName();
        GravaArquivo arquivo = new GravaArquivo(
                caminhoProjeto + "/src/test//java/arquivosGerados/novoXmlGerado.txt");
        arquivo.escreverDocumento(aux);

        if (newFile.renameTo(renFile)) {
            System.out.println(newFile.getName() + " renamed to " + renFile.getName());


        } else {
            System.out.println("Fahou");
        }


    }

}


