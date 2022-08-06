Olá, 😉

Sou iniciante no mundo da programação e esse é o meu primeiro projeto realizado em Java. 🌟🚀

🌟⭐ Este projeto ganhou uma [Menção Honrosa Alura](https://www.alura.com.br/imersao-java/projetos)🌟⭐
___________

# [Imersão Alura Java](https://www.alura.com.br/imersao-java?version=java2)

 
**[Aula 01 - Consumindo uma API de Filmes com Java](https://github.com/PamelaRondina/Imersao-Alura-Java#aula-01---consumindo-uma-api-de-filmes-com-java)**
 
Consumir uma API do site IMDb e separar em conteúdos:
- [x] Título do Filme;
- [x] Link da Imagem;
- [x] Notas dos Usuários.

**[Aula 02 - Gerando Figurinhas para o WhatsApp](https://github.com/PamelaRondina/Imersao-Alura-Java#aula-02---criar-figurinhas-para-o-whatsapp)**

Gerar figurinhas a partir de uma imagem do diretório local ou de uma url;

- [x] Criar uma imagem com leitura no terminal;
- [x] Enviar imagem no WhatsApp;
- [x] Conseguir centralizar o texto criado.

**[Aula 03 - Aula com foco em Orientação a Objetos, Refatoração e Encapsulamento](https://github.com/PamelaRondina/Imersao-Alura-Java#aula-03---aula-com-foco-em-orienta%C3%A7%C3%A3o-a-objetos-refatora%C3%A7%C3%A3o-e-encapsulamento)**   

Gerar figurinhas a partir de uma imagem de uma url, do site da NASA e do IMDb;

- [x] Consumir API do site da IMBd e da Nasa ou os demais links que os instrutores criaram;
- [x] Criação de figurinhas para o WhatsApp com imagens incríveis da Nasa

**[Aula 04 - Criando nossa própria API com Spring](https://github.com/PamelaRondina/Imersao-Alura-Java#aula-04---criando-nossa-pr%C3%B3pria-api-com-spring)**

Criar nossa própria API e Web Service, podendo ser consumida com todo o código que já escrevemos e gerar mais figurinhas baseado neste novo Web Service.

- [x] Criação de própria API e WEB Service
- [x] Acesso ao Spring 
- [x] Acesso ao MongoDB
- [x] Acesso ao PostMan


**[Aula 05 - Publicando nossa API no Cloud](https://github.com/PamelaRondina/Imersao-Alura-Java#aula-05---publicando-nossa-api-no-cloud)**

Colocar nossa aplicação no ar, fazer um Deploy

- [x] Acesso ao Heroku
- [x] Aplicação na nuvem
- [x] gerar figurinhas a partir do conteúdo desta API.

_____________________

## Instrutores
- Jacqueline Oliveira
- Alexandre Aquiles
- Paulo Silveira
_____________
 
# Aula 01 - Consumindo uma API de Filmes com Java

[Os 250 melhores filmes de acordo com a classificação do IMDB](https://www.imdb.com/chart/top/)

Para início, nos cadastramos no site do [IMDb API](https://imdb-api.com/api) , para em seguida, termos a chave de acesso.

Para achar sua API Key:

- [x] Após se registrar e confirmar o registro pelo recebimento do e-mail
- [x] Clicar no nome do usuário
- [x] Abrir o Profile
- [x] Abrir API Tester
- [x] Pronto, sua API Key estará visível 

Porém, no primeiro dia da imersão, o site da IMDB ficou instável e os intrutores criaram outros meios para seguirmos com a aula.

Escolhi o link de API criado pela instrutora Jacqueline: <https://alura-filmes.herokuapp.com/conteudos>

_____________________________________

Tarefa realizada em conjunto com os instrutores da [Alura](https://www.alura.com.br/): 

![image](https://user-images.githubusercontent.com/108991648/179908015-aa870a82-cd22-440e-b172-394006b2fd36.png)

________________________________________

Tarefas extras: decorar o terminal.

- Terminal - título do filme sublinhado: 
```java
System.out.println("\u001b[4m" + filme.get("title") + "\u001b[0m")
```
- Terminal - link do filme na cor Ciano: 
```java
System.out.println("\u001b[36m" + filme.get("image") + "\u001b[37m");
```
- Terminal - nota do usuário na cor Amarela: 
```java
System.out.println("\u001b[33m" + filme.get("imDbRating") + "\u001b[37m");
```
<br />

```java
for (Map<String, String> filme : listaDeFilmes) {
    System.out.println(filme.get("title"));
    System.out.println(filme.get("image"));
    System.out.println(filme.get("imDbRating"));
    System.out.println();
```

Resultado no terminal: 🥰

![image](https://user-images.githubusercontent.com/108991648/179807535-08688854-d6f0-4811-85bd-6bacec3369f7.png)

________________________________________

## Decorando o terminal

Base: \u001b[**nº**m

### Realce de texto

Realce | Código SGR
:-:|:-:
Negrito | 1
Itálico | 3
Sublinhado | 4
Piscando | 5
Invertido | 7
Riscado | 9

### Cores

Cor | Código SGR cor do texto | Código SGR cor de fundo
:-:|:-:|:-:
Preta | 30 | 40
Vermelha | 31 |	41
Verde | 32|42
Amarelo | 33 | 43
Azul	|	34	|	44
Magenta	|	35	|	45
Ciano	|	36	|	46
Branca	|	37	|	47

<br />

###### Dica Boa da Alura!
[Decorando o terminal](https://www.alura.com.br/artigos/decorando-terminal-cores-emojis)


____________

# Aula 02 - Criar Figurinhas para o WhatsApp
 
 Aula para gerarmos figurinhas a partir de uma imagem do diretório local ou de uma url.
 
 Link utilizado: https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json

 A imagem no terminal não foi gerada como no exemplo do instrutor e também não gerava erro no código após o RUN.
 
 😱😱😱
 
 **imagem da tela do instrutor Alexandre Aquiles.
 ![image](https://user-images.githubusercontent.com/108991648/180019681-17a97773-414c-4968-9c68-0c5cc8e343fd.png)
 
 Fiquei por algum tempo tentando localizar este "erro", sem sucesso 😥
 
 Continuei acompanhando a aula e codando junto com o professor e chegamos a um resultado positivo! 😁😀
 
 ![image](https://user-images.githubusercontent.com/108991648/180098860-5ed8e6f8-93d7-4c02-949d-43aad211cea6.png)
 
 Imagem sendo utilizada no WhatsApp: 😍
 
 ![image](https://user-images.githubusercontent.com/108991648/180099970-58f76db9-5f62-4037-9276-eb8ef313bd44.png)
 
 _________________________
 ## Diretório ou URL, de onde devo buscar meu arquivo?
 
1. Criada uma classe para gerarmos as figurinhas: GeradoradFigurinhas.java

2. Na url das informações dos filmes, localizei o link da imagem e salvei em formato **filme.jpg**, criando no repositório:
- [x] Um diretório de **entrada**: para salvar arquivos - formato filme.*jpg*
- [x] Um diretório de **saida**: para obter o resultado após o RUN no código - formato figurinha.*png*

![image](https://user-images.githubusercontent.com/108991648/180031491-469046eb-5871-44fd-a7ba-7c94053b3a0a.png)

Ler imagem a partir de um diretório, dois formatos:

- ![image](https://user-images.githubusercontent.com/108991648/180036305-585c229e-f7b9-4168-b208-fbfad3d8492b.png)

- ![image](https://user-images.githubusercontent.com/108991648/180037371-61b7228a-529b-4214-9c95-7d2b498c4b41.png)

Ler imagem a partir de uma url, neste caso, não é necessário criar os diretórios de entrada e saída.
- ![image](https://user-images.githubusercontent.com/108991648/180038772-b2f26800-5681-4d23-bff7-e9741209c43b.png)

Na atividade, para gerar várias imagens a partir da url, utilizei o arquivo App.Java com as seguintes modificações:

![image](https://user-images.githubusercontent.com/108991648/180046057-3193f691-59d0-43f7-a34e-8d9d81a2c82d.png)

___________________________________

## A forma que encontrei para editar a imagem e o texto 🤩

*Complicado sim, mas tudo bem rsrs... É o primeiro projeto!*

A partir de um diretório da rede local, com o arquivo salvo em formato .png

1. Este vai controlar onde a imagem vai permanecer acima da parede em transparência.
![image](https://user-images.githubusercontent.com/108991648/180101509-c1d715d3-dad2-430d-9093-2c9cba1ee18e.png)
![image](https://user-images.githubusercontent.com/108991648/180101678-e33445ce-2d8f-45b6-af3f-819dc506074e.png)

2. Este vai controlar a largura (x) e altura (y) acima da parede em transparência.
![image](https://user-images.githubusercontent.com/108991648/180102019-355b286d-5542-4d78-8657-5bcec980fc53.png)

   - Exemplo com (x:500) e (y: 0)

![image](https://user-images.githubusercontent.com/108991648/180102211-a67999cb-ab95-4eee-8e6d-d81d0cd583b4.png)


3. Este vai controlar: fonte, formato, tamanho e cor.

![image](https://user-images.githubusercontent.com/108991648/180102839-2629de2d-a36d-498a-8a5a-69b9e77d5082.png)

Fonte | Formato | Tamanho | Cor
---|---|---|---
Font.SANS-SERIF | (Negrito) Font.ITALIC | size:100 | graphics.setColor(Color.YELLOW)


4. Este vai controlar: texto e redirecionamento do texto, sendo (x: esquerda, centro ou direita) e (-150: altura desejada)

![image](https://user-images.githubusercontent.com/108991648/180104272-1b7cc9c6-d31f-402e-a19a-2781b0d35e76.png)

  Texto | direção | altura
---|---|---
"**Um Clássico Perfeito**" | x:150 | novaAltura -150

   - Exemplo com (x:-50 esquerda) e (y:-500 cima)
   
   ![image](https://user-images.githubusercontent.com/108991648/180103594-96227148-1504-4457-a372-e94d0b60834e.png)

   - Exemplo com (x:300 direita) e (-10: baixo)
   
   ![image](https://user-images.githubusercontent.com/108991648/180103853-2b31c603-a605-4af5-b22e-f6da7ce6ccba.png)
   
   ______________
   # Aula 03 - Aula com foco em Orientação a Objetos, Refatoração e Encapsulamento
 
 Vamos iniciar com essa dica da *Alura* - APIs públicas: https://github.com/public-apis/public-apis
 
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
_________________________

# Aula 04 - Criando Nossa Própria API Com Spring 


Nesta aula, criaremos nossa própria API e Web Service, podendo ser consumida com todo o código que já escrevemos, além disso, vamos gerar mais figurinhas baseado neste novo Web Service! Que maneiro não?! :grin:

Vamos misturar diversos Frameworks e bibliotecas, como Spring, Spring Boot, Maven, PostMan e MongoDB.

## Instalações e Registros Necessários

:warning: Antes do *#partiucodar* temos que fazer algumas instalações e registros :warning:

- Spring
- MongoDB (Banco de Dados)
- PostMan


### Spring

> Afinal, o que são Springs? 
São Frameworks Open Source, utilizados para agilizar o processo de codificação.

Acessar [Star.Spring](https://start.spring.io/) e seguir os passos abaixo:
- [x] Project: Mavem Project
- [x] Language: Java
- [x] Spring Boot: 3.0.0 (M4)
- [x] Group: br.com.alura 
- [x] Artifact: nome-do-projeto
- [x] Description: descrição-do-projeto
- [x] Packaging: Jar
- [x] Java: 17
- [x] Em *ADD DEPENDENCIES* adicionar *Spring Web*
- [x] Clicar em Generate

![image](https://user-images.githubusercontent.com/108991648/180626042-94c12c69-580d-452a-a95e-84e32020f6a0.png)

Na pasta de Downloads teremos o arquivo relacionado em .zip, em seguida, devemos extrair o conteúdo do diretório e iniciá-lo no Visual Studio Code [VSC] (abrir com botão direito do mouse!), charemos de Projeto: Linguagens-API.

![image](https://user-images.githubusercontent.com/108991648/180658378-fd7e1057-bd0d-4c34-a6a4-e18e3606e491.png)

> Iniciaremos um novo projeto e mais tarde vamos mesclar com os códigos das aulas anteriores.

### Aplicação MongoDB
De início, precisamos realizar o registro no [MongoDB Atlas](https://www.mongodb.com/cloud/atlas/register), após clicar em Create.

1.	Escolher a forma de autenticação: senha ou certificado. 

![image](https://user-images.githubusercontent.com/108991648/180658555-59ca9e32-e090-4848-b834-5f07f68e2c4d.png)

2.	Escolher a origem de onde você gostaria de se conectar:
- My Local Environment: conectar do computador pessoal;
- Cloud Environment: conectar de um data center ou de Cloud pública, por exemplo, AWS.

Optando pelo *My Local Environment*:
- [x] Descobrir o nº do [IP](https://meuip.com.br/);
- [x] Incluir a descrição, opcional
- [x] Clicar em *Add Entry* e *Finish and Close*


![image](https://user-images.githubusercontent.com/108991648/180658759-55b279f5-dcf4-4bd5-b5f8-e64ff7ea5996.png)


### Aplicação PostMan

> PostMan: algumas das possibilidades desta aplicação são navegar e explorar diversas API’s

Realizar o registro em [PostMan](), e baixar o [PostMan Desktop]() (pois nossa aplicação está no localhost) 

Após baixar o PostMan Desktop:
- [x] Clicar *My Workspace*
- [x] Clicar **+**

![image](https://user-images.githubusercontent.com/108991648/180624805-07b34232-bef3-4c38-8fcf-76967b2a5d07.png)

**Não faremos um GET e sim um POST, mas no final desta aula**
- [x] Apenas para visualizar o resultado! Em *GET* adicionar o link do localhost: <http://localhost:8080/linguagens>
- [x] Clicar *Send* 

![image](https://user-images.githubusercontent.com/108991648/180624914-f359fbb6-8d20-4634-ac87-babd30aa7094.png)

E PostMan retorna exatamente o que estava no navegador

![image](https://user-images.githubusercontent.com/108991648/180625003-92f7e435-2289-41be-af5d-5dd228ddbb8d.png)

## :alarm_clock: Hora de Codar! :alarm_clock:

Faremos uma API das linguagens mais populares das empresas que contratam a Alura. Vamos ranquear por uso, incluir imagem e popularidade.

Voltar ao VSC, abrir o projeto *Linguagens-API*:

- [x] Criar uma classe *LinguagemController*
- [x] Incluir a anotação `@RestController` e `@GetMapping`
- [x] Incluir `return “Oi, Java!”` 
- [x] Atentar-se aos `import`

![image](https://user-images.githubusercontent.com/108991648/180659211-33ba4c3c-7299-4b31-8897-6850214335df.png)

- [x] Alterar `“path”` para `“/linguagem-preferida”`
- [x] Alterar `SomeData` para `String` 
- [x] Alterar `getMethodName` para `processaLinguagemPreferida` 
- [x] Deletar `*@RequestParam String param*`
- [x] Deletar `import org.springframework.web.bind.annotation.RequestParam`;

```Java
@GetMapping(value="/linguagem-preferida")
public String processaLinguagemPreferida() {
    return "Oi, Java!";
}
```

Após o RUN, no navegador escrever: <localhot:8080/linguagem-prefereida> e o resultado será *Oi, Java!* :smile:

![image](https://user-images.githubusercontent.com/108991648/180659399-2a4fcf00-58e8-4f5a-a32b-2adb014455da.png)

- [x] Criar um nova Classe *Linguagem*
- [x] Criar atributos privados `String title` e `String image`
- [x] Criar `private int ranking`

![image](https://user-images.githubusercontent.com/108991648/180659480-800fa0ab-1700-41e4-b8d5-a1005e2a4bd4.png)

Conforme a aula03 [criar os atalhos](https://github.com/PamelaRondina/Imersao-Alura-Java#atalhos.)

- [x] Criar atalho: *Generate Getters* 
- [x] Criar atalho: *Generate Contructors*

Teremos o resultado:
![image](https://user-images.githubusercontent.com/108991648/180659559-ce37c98d-abfd-4c13-a87a-949cd7752c0c.png)

Voltaremos no arquivo *LinguagemController.java* para adicionar as linhas: 10, 11, 12 e 13.
> Fazer o `import java.util.List;`

![image](https://user-images.githubusercontent.com/108991648/180659601-01cb7932-dd27-43ff-b9d8-49731bf6cde1.png)

#### Repositório de Imagens
Vamos para o [repositório no GitHub](https://github.com/abrahamcalf/programming-languages-logos/tree/master/src) com imagens das linguagens de programação. 

- [x] Escolher uma linguagem
- [x] Selecionar o arquivo *256x256.png* 
- [x] Abrir a imagem 
- [x] Clicar na imagem para gerar a url em outra janela
- [x] Copiar nova url

Retornando ao código em *LinguagemController.java* colar a url na `lista/image`. Incluímos uma nova linha e repetimos os passos anteriores, neste exemplo, fiz a cópia da url da imagem de **Java** e **Python**

![image](https://user-images.githubusercontent.com/108991648/180659858-16a186f3-d6bd-4903-a398-cdef56468b75.png)

Voltando para o arquivo *LinguagemController*
- [x] Comentar ou deletar as linhas 16, 17, 18 ou 19, 

> Não serão mais úteis, utilizamos apenas para compreender o primeiro RUN da atividade.

- [x] Adicionar as linhas 21 até 24.

![image](https://user-images.githubusercontent.com/108991648/180660144-c7198778-3f3e-4562-b158-4aad7759dab5.png)

Após o RUN, no navegador escrever: <localhot:8080/linguagens> e o resultado será um **json**

![image](https://user-images.githubusercontent.com/108991648/180660076-ac917f0d-fcd5-49f9-9ad9-f53967daedbb.png)

### Uhull!  Agora vamos mesclar o código atual com os anteriores :clap::clap::clap:

Vamos abrir no terminal o projeto anterior, no arquivo *App.java* vamos adicionar as linhas 17 e 18  para analisarmos uma nova API.

![image](https://user-images.githubusercontent.com/108991648/180660309-3a823550-0b0c-42a1-ae45-64d270c5df08.png)

Após o RUN, os arquivos estarão na pasta de saída, conforme na aula anterior e o resultado será:

![image](https://user-images.githubusercontent.com/108991648/180660349-464c061f-5e99-4b3c-86c1-285e729e1883.png)

![image](https://user-images.githubusercontent.com/108991648/180660377-21da8935-7936-4d45-b039-39550cfbeec7.png)

### Retornado ao MondoDB

No repositório a partir do MongoDB (Banco de Dados):

- Clicar em **Project: 0**

![image](https://user-images.githubusercontent.com/108991648/180660555-fec2c8f6-d3cb-44db-8a4e-f25135d15399.png)

* Clicar em **View All Projects**

![image](https://user-images.githubusercontent.com/108991648/180660575-08e3fdd5-4e71-4961-9ef6-45a344d81a98.png)

- Clicar em **Project0**

![image](https://user-images.githubusercontent.com/108991648/180660602-3fd4b4aa-1d9c-49e0-ba53-9192f3adf689.png)

- Clicar em **Browse Collections**

![image](https://user-images.githubusercontent.com/108991648/180660614-67b3f71c-e6f4-4cbb-9eef-1c0ddd68b46d.png)

- Clicar em **Add My Own Data** e na próxima janela adicionar os nomes que preferir, e clicar **Create**

![image](https://user-images.githubusercontent.com/108991648/180660648-6471db2c-41c3-47fd-a3fb-e5d606880b9b.png)

> Dentro de uma coleção temos documentos e o MongoDB é um banco que armazena documentos

- Clicar em **Insert Document**

![image](https://user-images.githubusercontent.com/108991648/180660732-776a0672-d38c-4af7-a17b-9afde9010345.png)

Em Insert to Collection, vamos uadicionar a url de uma imagens das linguagens de programação [Repositório GitHub](https://github.com/abrahamcalf/programming-languages-logos/tree/master/src)

- [x] Clicar nas {} (chaves)
- [x] Adicionar atributos: title, image e ranking
    - Na imagem, em formato **256x256.png**, incluir a url
- [x] Clicar em Insert

![image](https://user-images.githubusercontent.com/108991648/180660913-b3cc1869-6404-41f1-b117-283f3f1c8d89.png)

> Note que temos 01 (um) documento criado

![image](https://user-images.githubusercontent.com/108991648/180660958-b2d37007-f4f3-4af6-83c0-cdd71ad06225.png)

Vamos criar mais 2 (dois) documentos, passaremos as informações criadas no início desta aula para o MongoDB

> Atenção no momento de copiar o código não incluir as {}.

![image](https://user-images.githubusercontent.com/108991648/180661057-48b4be8c-3b2b-4235-8107-8a89ab465f41.png)
![image](https://user-images.githubusercontent.com/108991648/180661070-dd335f6b-0136-4d85-8884-11629069f7f3.png)

Com isso, teremos 3 (três) documentos dentro deste banco de dados, note que em cada item possui um **id**.

![image](https://user-images.githubusercontent.com/108991648/180661088-7d1166f2-2ed4-4444-bceb-65d9b962796f.png)

Vamos criar a String de conexão, clicar em:
- [x] *Overview*
- [x] *Connect*
- [x] *Connect your application*  

![image](https://user-images.githubusercontent.com/108991648/180661138-51f665dd-3200-44f6-a068-bf9269bf120f.png)

![image](https://user-images.githubusercontent.com/108991648/180661149-ec2a0a3a-a904-47d4-822b-86f1a7341dde.png)

Precisaremos adicionar uma dependência no projeto.

- [x] No VSC
- [x] No projeto *Linguagens-api*
- [x] Arquivo *pom.xml* 
- [x] Adicionar as linhas 25 até 28 
- [x] Clicar em *Always* (no canto inferior direito da tela)

![image](https://user-images.githubusercontent.com/108991648/180661262-7e2defb3-caf9-43bc-8e15-cc684ddf1e75.png)

No arquivo *application.properties* dentro do *main/resources* vamos colar nosso *link bem legal*, que é o valor da propriedade!

> Resources são os demais arquivos estáticos, e outros, que não são Java

- [x] Incluir: `spring.data.mongodb.uri`
- [x] Incluir o **Link bem legal**
- [x] Senha (criado no site do MongoDb), deletar as **<>**
- [x] aluraDb (que é o banco de dados)

![image](https://user-images.githubusercontent.com/108991648/180661325-f26922a2-3d20-4e32-8128-43183402f8ed.png)

No arquivo *Linguagem.java* incluir as linhas 6, 9, 10, 15, 16 e 17.

![image](https://user-images.githubusercontent.com/108991648/180661350-837703f6-95fb-485a-90cb-fdbb34063c5b.png)

> Fazer o `import org.springframework.data.annotation.Id;`
> Fazer o `import org.springframework.data.mongodb.core.mapping.Document;`

- [x] Criar uma classe *LinguagemRepository* para buscar os dados
- [x] Alterar para interface 

Apenas para visualizar o código! em *MongoRepository*, clicar com `Ctrl+Clique` (botão esquerdo do mouse)

![image](https://user-images.githubusercontent.com/108991648/180661368-662fb21b-7611-4b64-82e0-c6f2ed0f009b.png)

No arquivo *LinguagemController.java*
- [x] Deletar ou comentar as linhas 11 até 15
- [x] Adicionar as linhas 22 até 30

> lembrete: as linhas 17 até 20 foram desconsideradas em um momento anterior desta aula

![image](https://user-images.githubusercontent.com/108991648/180661395-44c5b7c2-b400-4994-b4e8-485d02fec003.png)

Após o RUN, o resultado será 😊 

![image](https://user-images.githubusercontent.com/108991648/180661410-5ea9fe73-0134-4170-b29c-6a4c6691f1b2.png)

### Retornando ao PostMan

Faremos um **POST**

- [x] Clicar **+**
- [x] Em *GET* alterar para *POST*
- [x] Em *POST* adicionar o link do localhost [http://localhost:8080/linguagens]
- [X] Em *Body* selecionar *raw*, e em *Text* alterar para *JSON*

Faremos o mesmo que no início da atividade, incluir: title, image e ranking. [Repositório do GitHub com imagens das linguagens de programação](https://github.com/abrahamcalf/programming-languages-logos)

![image](https://user-images.githubusercontent.com/108991648/180625317-c00ae0a8-e5d7-484a-8f06-e0ab3057817e.png)

Voltaremos no VSC, no arquivo *LinguagemController.java* para adicionar as linhas 32 até 35, criando uma variável para `save` = `LinguagemSalva`

![image](https://user-images.githubusercontent.com/108991648/180625497-b367e57a-b7aa-4241-b5ae-18d0885227bf.png)

> Fazer o `import org.springframework.web.bind.annotation.PostMapping;`

Após a variável adicionar `return LinguagemSalva` na linha 35

![image](https://user-images.githubusercontent.com/108991648/180625556-c04ae360-d3e8-4477-b2e6-9f958117cffe.png)

Após o RUN, voltaremos no PostMan, clicar em **Send**. Tendo a resposta **200 OK** o resultado foi positivo :smile:

![image](https://user-images.githubusercontent.com/108991648/180625663-db566b00-64ec-4ecf-8677-34c2096989e8.png)

Voltaremos no MongoDB, clicar em *Refresh* e teremos 04 resultados! :smile:

![image](https://user-images.githubusercontent.com/108991648/180625744-f6ee22d2-e910-4b64-8e08-54f7e5a84582.png)

E, por último, um detalhe sobre o MongoDB para conseguirmos acessar de qualquer lugar:

- [x] Em *Network Acces*
- [x] Em *Edit*
- [x] Editar para o IP Geral: o acesso para o Ip Geral 0.0.0.0/0

![image](https://user-images.githubusercontent.com/108991648/180625842-0b05f9bb-575f-4019-85f3-804cd65588d0.png)

Isso é tudo pessoal! :blush:

<br>

###### Dica Boa da Alura! 
[Stickers Dev: Aluraverso no WhatsApp e Telegram](https://www.alura.com.br/artigos/stickers-dev-aluraverso-whatsapp-telegram)
___________________
# Aula 05 - Publicando Nossa API no Cloud

E chegou nossa última aula desta incrível jornada da **Imersão Java da Alura!**

Nesta aula, vamos colocar nossa aplicação no ar, ou melhor dizendo, fazer o famoso Deploy na nuvem. :cloud::partly_sunny::cloud:

Vamos incluir a aplicação na nuvem por um mecanismo chamado Heroku.

## Instalações e Registros Necessários

**:construction: Momento do Registro :construction:**

* Heroku
  * Pré-requisitos do Heruko, baixar o [Git](https://git-scm.com/download/win)

### Heroku

Acessar [Heroku](https://www.heroku.com/) e realizar o registro na plataforma.

Criar uma nova aplicação **Create New App**

![image](https://user-images.githubusercontent.com/108991648/180806337-026498da-0434-401d-a779-307ef8e5b607.png)

Incluir um nome, seja criativo! O site não gera nomes duplicados e clicar em **Create**

![image](https://user-images.githubusercontent.com/108991648/180808308-355bd0a5-aaa3-4fce-8d01-46b8de55887c.png)

Vamos clicar em [Heroku CLI](https://devcenter.heroku.com/articles/heroku-cli) para poder conectá-lo com o VSC.

![image](https://user-images.githubusercontent.com/108991648/180809653-c1de9d75-a235-42ce-9901-447ccc446ef7.png)

No final da janela aberta, teremos as informações de instalação:

![image](https://user-images.githubusercontent.com/108991648/180814120-28397343-d674-4233-87d6-a17e99a22fa9.png)


 ## Chegando ao final do projeto 	:clap:	:clap:	

 Abrir o projeto *Linguagens-API*, ir no arquivo *mvnw*

![image](https://user-images.githubusercontent.com/108991648/180672559-c45a33fb-16ca-4da8-9d7a-06c5271e3fb6.png)

No terminal, rodar o comando `./mvnw package`

![image](https://user-images.githubusercontent.com/108991648/180678133-aa10fe62-d0f1-4dc8-8df2-ec04c0d97da2.png)

Algumas possibilidades que este comando possui: 
- [x] Se tiver dependência,baixará os JAR'S
- [x] Copilar testes (rodar testes se existirem)

Este comando vai gerar um arquivo dentro do diretório: `linguagens-api/target/`

> Lembrando que `linguagens-api` é o nome do projeto

![image](https://user-images.githubusercontent.com/108991648/180679723-48cd1328-59d2-438c-9583-b45a3eca4f67.png)

> Um JAR é um arquivo em ZIP

Iremos subir a aplicação a partir do JAR, para isso:
- [x] Extraia o `linguagens-api-0.0.1-SNAPSHOT` para o Desktop
- [x] No terminal digite, solicitado pelo instrutor: `Desktop java -jar linguagens-api-0.0.1-SNAPSHOT.jar`

### Erro no meu terminal :fearful:

Em meu terminal, executei o seguinte `java -jar..\linguagens-api-0.0.1-SNAPSHOT.jar`
-	`java` - chamar o programa
- `-jar` - tipo de arquivo que o programa vai ler
- `..`  - a pasta criada estava um local anterior

E a resposta foi o erro:
```    
Error: A JNI error has occurred, please check your installation and try again
Exception in thread "main" java.lang.UnsupportedClassVersionError: org/springframework/boot/loader/JarLauncher has been compiled by a more rec        
at java.lang.ClassLoader.defineClass1(Native Method)
```
Este erro ocorreu, pois a versão que estava tentando executar era abaixo da qual foi compilado o programa.

Vamos entender o motivo...

Abaixo temos qual o JAVA usado para compilar o programa:
```bash
C:\Users\pamela>echo %JAVA_HOME%
C:\Program Files\Java\jdk-18.0.1.1
```

Já aqui mostra qual o JAVA foi usado para execução:
```bash
C:\Users\pamela\Desktop\linguagens-api> java -version
java version "1.8.0_341"
Java(TM) SE Runtime Environment (build 1.8.0_341-b10)
Java HotSpot(TM) 64-Bit Server VM (build 25.341-b10, mixed mode)
```

Note que o Java usado para compilar é mais atual do que o da execução:

* Para compilar: 18.0.1.1
* Para Execução: 1.8.0_341

Por isso, especificamos o Java para que seja idêntico ou superior a versão de compilação:

```bash
 C:\Program Files\Java\jdk-18.0.1.1\bin\java.exe' -jar ..\linguagens-api-0.0.1-SNAPSHOT.jar
```

Após executado, o retorno foi positivo :smile:

### Erro no terminal do instrutor

O mesmo erro ocorreu no terminal do instrutor, porém, ele solucionou o problema de uma outra forma:

No projeto *Linguagens-api*, incluir na raiz do projeto um aqruivo **system.properties**

![image](https://user-images.githubusercontent.com/108991648/180844095-04ef7cd0-f3da-4e7c-96cf-9819727db596.png)


## Rodar a aplicação pelo GIT

> Utilizei o **Git CMD**

Pelo Git, vamos descobrir quais são as versões:

* Versão: Git
```bash
C:\Users\pamela>git --version
git version 2.37.1.windows.1
```
* Versão: Heroku

```bash
C:\Users\pamela>heroku --version
 »   Warning: heroku update available from 7.53.0 to 7.60.2.
heroku/7.53.0 win32-x64 node-v12.21.0
```
Pelo Git, vamos entrar no diretório onde está o código.

```bash

C:\Users\pamela> cd Desktop

C:\Users\pamela\Desktop> cd linguagens-api
```
Conforme instruções do site do [Heroku CLI](https://dashboard.heroku.com/apps/pamela-linguagens-api/deploy/heroku-git), primeira parte:

![image](https://user-images.githubusercontent.com/108991648/180851281-2475496c-ae57-42c3-bd4d-912bc8bb062a.png)

- [x] Rodar `$ heroku login`
- [x] Pressionar qualquer tecla
- [x] O navegador será aberto
- [x] Clicar Será gerado uma senha

```bash
C:\Users\pamela\Desktop\linguagens-api>heroku login
 »   Warning: heroku update available from 7.53.0 to 7.60.2.
heroku: Press any key to open up the browser to login or q to exit:
Opening browser to https://cli-auth.heroku.com/auth/cli/browser/31c7ac6a-4009-4b7d-9692-4997b1b81219?requestor=SFMyNTY.g2gDbQAAAAwxNzcuNzYuMjguMTduBgDoMqg2ggFiAAFRgA.t3g_Kd5ml5BnsyoYWY1RYUP2xmVJ9pif-3LUInFMC0k
heroku: Waiting for login... -
```

![image](https://user-images.githubusercontent.com/108991648/180850939-eecd28dd-b1d5-47b9-9b76-db88ba2be412.png)

Conforme instruções do site do [Heroku CLI](https://dashboard.heroku.com/apps/pamela-linguagens-api/deploy/heroku-git), segunda parte:

![image](https://user-images.githubusercontent.com/108991648/180851436-4d828091-7006-4942-91c6-081c8e4f8411.png)

Além de seguir as instruções acima, rodaremos outros comandos também:

- [x] Rodar `git init `
- [x] Rodar `git add .`
- [x] Rodar `git commit -m "mensagem opcional"` 

Acima vamos incluir todos os diretórios no Heroku, abaixo vamos configurar o repositório remoto

- [x] `$ heroku git:remote -a pamela-linguagens-api` nome do projeto

```bash
C:\Users\pamela\Desktop\linguagens-api> heroku git:remote -a pamela-linguagens-api
 »   Warning: heroku update available from 7.53.0 to 7.60.2.
set git remote heroku to https://git.heroku.com/pamela-linguagens-api.git
```

O último comando vai gerar um código, temos que jogar este código para o Heroku.

- [x] Rodar `git push heroku master`

As instalações necessárias foram feitas no Heroku.

Em seguida, vamos rodar a url que colocamos no ar,  abrir o arquivo *App.java*:

- [x] alterar `"http://localhost:8080/linguagens"` para ` https://pamela-linguagens-api.herokuapp.com/linguagens`


E pronto, a aplicação deve gerar uma figurinha!

#### PostMan adiciona pelo Heroku uma nova liguagem

Em PostMan, vamos incluir uma nova linguagem

- [x] [Repositório no GitHUb](https://github.com/abrahamcalf/programming-languages-logos/tree/master/src) de imagens de programação
 - [x] Selecionar o arquivo 256x256.png
 - [x] Abrir a imagem
 - [x] Clicar na imagem para gerar a url em outra janela
 - [x] Copiar nova url

 No PostMan, ir em *POST* e alterar a url para: ` https://pamela-linguagens-api.herokuapp.com/linguagens`

 Status 200 OK :smile:

![image](https://user-images.githubusercontent.com/108991648/180867925-3699dde3-4447-44cd-9524-bc7768ab2638.png)


Ir em GET e alterar o link para `https://pamela-linguagens-api.herokuapp.com/linguagens`

Status 200 ok :smile:
![image](https://user-images.githubusercontent.com/108991648/180867777-3284bfd0-d244-4ab0-85fa-2a3deb444699.png)



_________________

###### Dica Boa da Alura! 
[Documentação Sobre Cloud](https://docs.oracle.com/pt-br/iaas/Content/home.htm)
[Como escrever um README incrível no seu Github](https://www.alura.com.br/artigos/escrever-bom-readme)
