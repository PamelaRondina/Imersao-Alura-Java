package aula03.src;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.InputStream;
import java.net.URL;

import javax.imageio.ImageIO;
import java.awt.Color;
import java.awt.Font;

public class GeradoradFigurinhas {

    
        // leitura da imagem
         //InputStream inputStream = new FileInputStream(new File("entrada/filme.jpg"));
       
       public void cria(InputStream inputStream, String nomeArquivo) throws Exception {
        //InputStream inputStream = new URL("https://imersao-java-apis.s3.amazonaws.com/TopMovies_2.jpg").openStream();
         BufferedImage imagemOriginal = ImageIO.read(inputStream); 
         
         //BufferedImage imagemOriginal = ImageIO.read(new File("entrada/filme.jpg"));
       
     

        // cria nova imagem em memória com transparência e com tamanho novo
        int largura = imagemOriginal.getWidth();
        int altura = imagemOriginal.getHeight();
        int novaAltura = altura + 170;
        BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

        // copiar a imagem original para nova imagem (em memória)
        Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
        graphics.drawImage(imagemOriginal, 0, 200, null);

        // configurar a fonte
        var fonte = new Font(Font.SANS_SERIF, Font.ITALIC, 100);
        graphics.setColor(Color.YELLOW);
        graphics.setFont(fonte);

        // escrever uma frase na nova imagem
        graphics.drawString("**Um Clássico Perfeito**", 150, novaAltura - 150);

    
        // escrever a nova imagem em um arquivo
        ImageIO.write(novaImagem, "png", new File(nomeArquivo));
         
}

//public static void main(String[] args) throws Exception {
  //  var geradora = new GeradoradFigurinhas();
  //  geradora.cria(null, null);
    
//}
}
