package aula05.src;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        // fazer uma conexão HTTP e buscar os top 250 filmes
        //String url = "https://alura-filmes.herokuapp.com/conteudos";
        //ExtratorDeConteudo extrator = new ExtratorDeConteudoDoIMDB();

        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD-JamesWebbSpaceTelescope.json";
        //ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();

        String url = "http://localhost:8080/linguagens";
        ExtratorDeConteudo extrator = new ExtratorDeConteudoDoIMDB();

        var http = new ClienteHttp();
        String json = http.buscaDados(url);
        
        // exibir e manipular os dados
        List<Conteudo> conteudos = extrator.extraiConteudos(json);

        var geradora = new GeradoradFigurinhas();
        
        for (int i = 0; i < 4; i++) {

            Conteudo conteudo = conteudos.get(i);
                       
                      InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
           String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

           geradora.cria(inputStream, nomeArquivo);

           System.out.println(conteudo.getTitulo());
           System.out.println(conteudo);

        }                       
           
        }

    }

