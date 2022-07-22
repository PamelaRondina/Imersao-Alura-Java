# Aula 03 - Aula com foco em Orientação a Objetos, Refatoração e Encapsulamento
 
 Vamos iniciar com essa dica da *Alura* - APIs públicas: https://github.com/public-apis/public-apis
 
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

Seguiremos a atividade no arquivo *GeradoradFigurinhas.java* e *App.java* com o código que faz leitura da uma url [https://github.com/PamelaRondina/Imersao-Alura-Java/tree/main/aula02/src]

:warning: Porém, de início fizemos algumas alterações no código :warning:
1. Leitura das 10 primeiras imagens (para não gerarmos erros nas APIs; (Pois essa imersão derrubou algumas APIs 😮).
2. Excluir os caracteres após o @ para gerarmos imagens grandes, para as url's da IMDb;
3. Arquivo salvos no diretório de saida. No anterior, os arquivos estavam salvos no início, gerando diversos documentos na raiz do projeto. 


![image](https://user-images.githubusercontent.com/108991648/180333451-c76ce99b-fd2f-4eba-bb1b-647551ca35e2.png)

4. listaDeFilmes alterado para ListaDeConteudos.

![image](https://user-images.githubusercontent.com/108991648/180285845-d7434174-a0b0-4fd7-b681-064bdd3206c0.png)

5. filme alterado para conteúdo.

![image](https://user-images.githubusercontent.com/108991648/180334280-3c9363d2-cb74-4d3f-84b4-fbcf8dfa2f7f.png)

6. Manipulação de dados não será a partir de uma imagem, e sim de uma url.

![image](https://user-images.githubusercontent.com/108991648/180334301-e8dcadba-f378-4984-822e-e5cc8b225215.png)
_________________________

## Criação de Classes

### Classe: Conteudo

Necessária para gerarmos os atributos *titulo* e a *urlImagem*, deixaremos em **private**, pois quando incluímos apenas **public** todos os outros arquivos podem chamar.

![image](https://user-images.githubusercontent.com/108991648/180335077-3a89a3f8-9e4d-4191-9097-28c3ff4ef101.png)

> Private: restringir o acesso para que só o código desta classe acesse diretamente o atributo.

#### Atalhos

Necessário para expor os atributos para os outros arquivos.

- [x] Botão direito do mouse;
- [x] Source Action;
- [x] Generate Getters;
- [x] Selecionar as lacunas apresentadas.

![image](https://user-images.githubusercontent.com/108991648/180335265-30e646f5-f30e-4c0d-ac6a-51d822a99a08.png)
![image](https://user-images.githubusercontent.com/108991648/180335275-64bd03c1-0550-4120-bb8d-ba82dd5c3daa.png)

Código com atalho para expor os arquivos:

![image](https://user-images.githubusercontent.com/108991648/180335316-5a988c47-9145-4f71-a5d8-f68495ba1b88.png)

#### Construtor

Criar um construtor, junto com o *final* para representar estes conteudos.
- [x] Botão direito do mouse;
- [x] Source Action;
- [x] Generate Constructors;
- [x] Selecionar as lacunas apresentadas.

![image](https://user-images.githubusercontent.com/108991648/180335392-98e9c19b-c84c-4715-9a51-4beac0daff1e.png)
![image](https://user-images.githubusercontent.com/108991648/180335405-14a2012d-e86f-4a52-84a0-e4f4a940f3cb.png)

![image](https://user-images.githubusercontent.com/108991648/180335413-e4631ef1-1160-4d96-bc7b-8ea5dea536ef.png)

### Classe: ClienteHttp

Receberá uma url. No arquivo *App.java* o conteúdo abaixo foi removido, e incluso na *Classe ClienteHttp*.

![image](https://user-images.githubusercontent.com/108991648/180335517-11d236ed-1765-4060-b0ee-a8ea27d4b9c2.png)

> Nota: para realizar todos os imports utilizar o atalho **Alt+Shift+O**

E também, teremos que tratar as possíveis exceções geradas para que sejam embrulhadas, criando um *try* e *catch*, e, incluir um *return body*, conforme abaixo:

![image](https://user-images.githubusercontent.com/108991648/180335585-f3bd6ada-5aac-456d-9d66-f8be3ac112b4.png)

No arquivo *App.java*, onde removemos parte do código, vamos criar (como demostrado abaixo) e alterar o *buscaDAdos* para *json*:

![image](https://user-images.githubusercontent.com/108991648/180335612-5c7b30ab-50f8-4dff-a733-5942c62aa8b4.png)

### Classe: ExtratorDeConteudoDaNasa

A lista de Maps será transformada em Lista de Conteudos. 
No arquivo *App.java* o conteúdo abaixo foi removido, e incluso na *Classe ExtratorDeConteudosDaNasa*, onde a *listaDeConteudos* foi alterada para *listadeAtributos*.

![image](https://user-images.githubusercontent.com/108991648/180335830-5e702a70-6586-44c6-ad1c-a1c994d7e11f.png)

Criamos um *foreach* em **// popular lista de conteúdos**.

![image](https://user-images.githubusercontent.com/108991648/180335903-74bb43fc-4a3e-43e4-942b-99c907503abf.png)

### Classe: ExtratorDeConteudoDoIMDB

Serão quase os mesmos dados da classe da Nasa, com pequenas alterações:

- Em *url* --> será *image*;
- E do *App.java* será adicionado *.replaceAll("(@+)(.*).jpg$","$1.jpg")*.

![image](https://user-images.githubusercontent.com/108991648/180336022-509835e0-1c1c-43d6-9490-34f34f365a23.png)

Continuando as alterações, seguiremos para o *App.java*, na seção **// exibir e manipular os dados**, para incluir e excluir informações, conforme abaixo:

![image](https://user-images.githubusercontent.com/108991648/180336156-9b62a039-131f-462b-9210-4ee965c4c6cd.png)

_____________

## E agora, temos 02 formas de analisar?!

E é isso mesmo!! Podemos optar pela análise da API da NASA ou do IMDb. Vamos compreender como será feito:

Para selecionar qual API devemos analisar, basta incluir // nas linhas de *String* e *ExtratorDeConteudos* no qual NÃO for utilizar:

![image](https://user-images.githubusercontent.com/108991648/180336426-3b8e7549-26c3-4f10-a041-e3d18419968d.png)

Fizemos o RUN em ambas as API's e o resultado foi positivo! 🤩🤩

![image](https://user-images.githubusercontent.com/108991648/180336562-092c7f5a-1308-49d5-9556-5155979593b1.png)

______________

## Para encerrar, criação da Interface

Por último, criamos uma interface, para dizer o que um objeto deve fazer.

>  Interface: o que um objeto deve fazer sem dizer como ele deve ser feito. 
>  Quem vai dizer o que deve ser feito são as várias implementações da interface. 
>  Na interface, tudo é público.

No Extrator de cada conteúdo devemos incluir: **implements ExtratorDeConteudo**.

![image](https://user-images.githubusercontent.com/108991648/180338668-3cee8458-b65a-442c-b6d3-4910c8cc62e9.png)

Novamente no *App.java*, alterar de:

![image](https://user-images.githubusercontent.com/108991648/180336856-6db47b3d-a4dd-4050-b90b-fe1568cb2729.png)

Para:

![image](https://user-images.githubusercontent.com/108991648/180336874-51ef6d41-ed8e-4124-8c04-7ac36f702fc0.png)

voilà! Finalizamos nossa aula! 😍😍

____________




 
