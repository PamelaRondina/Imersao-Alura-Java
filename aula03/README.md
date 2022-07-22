# Imersão Alura Java
 
 **Aula 03 - Aula com foco em Orientação a Objetos, Refatoração e Encapsulamento**

> Refatorar: melhorar o código sem alterar o que ele faz!

Nesta aula, que está S.E.N.S.A.C.I.O.N.A.L, vamos mesclar o conhecimento adquirido da Aula01 e Aula02:
 
- Consumo de API do site da IMBd, ou os demais links que os instrutores criaram;
- Criação de figurinhas para o WhatsApp.

__________________________

## E o que faremos nesta aula?

A ideia é ter um código que consuma com facilidade uma nova API, e a API escolhida foi da *NASA*!!

### S.E.N.S.A.C.I.O.N.A.L! Bora gerar figurinhas desse e dos demais universos?! 🪐🚀👽

API da NASA, com imagens incríveis do James Webb:
https://api.mocki.io/v2/549a5d8b/NASA-APOD-JamesWebbSpaceTelescope

![image](https://user-images.githubusercontent.com/108991648/180332914-ad21a623-a023-4c1c-ac32-8fa57512b65c.png)
______________________


## Bora codar!

Seguiremos a atividade no arquivo *GeradoradFigurinhas.java* e *App.java* com o código que faz leitura da uma url [LINK DO CODIGO]

:warning: Porém, de início fizemos algumas alterações no código :warning:
1. Leitura das 10 primeiras imagens (para não gerarmos erros nas APIs, pois essa imersão derrubou algumas APIs 😮
2. Excluir os caracteres após o @ para gerarmos imagens grandes, para as url's da IMDb;
3. Arquivo salvos no diretório de saida. No anterior, os arquivos estavam salvos no início, gerando diversos documentos na raiz do projeto. 


![image](https://user-images.githubusercontent.com/108991648/180333451-c76ce99b-fd2f-4eba-bb1b-647551ca35e2.png)

4 listaDeFilmes alterado para ListaDeConteudos

![image](https://user-images.githubusercontent.com/108991648/180285845-d7434174-a0b0-4fd7-b681-064bdd3206c0.png)

5. filme alterado para conteúdo

![image](https://user-images.githubusercontent.com/108991648/180334280-3c9363d2-cb74-4d3f-84b4-fbcf8dfa2f7f.png)

6. Manipulação de dados não será a partir de uma imagem, e sim de uma url

![image](https://user-images.githubusercontent.com/108991648/180334301-e8dcadba-f378-4984-822e-e5cc8b225215.png)






 
