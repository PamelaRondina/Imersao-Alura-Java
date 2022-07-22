Olá, 😉

Sou iniciante no mundo da programação e esse é o meu primeiro projeto realizado em Java. 🌟🚀

# Imersão Alura Java
 
**Aula 01 - Consumindo uma API de Filmes com Java**
 
Consumir uma API do site IMDb e separar em conteúdos:
- [x] Título do Filme;
- [x] Link da Imagem;
- [x] Notas dos Usuários.

**Aula 02 - Gerando Figurinhas para o WhatsApp**

Gerar figurinhas a partir de uma imagem do diretório local ou de uma url;

- [x] Criar uma imagem com leitura no terminal;
- [x] Enviar imagem no WhatsApp;
- [x] Conseguir centralizar o texto criado.

**Aula 03 - Aula com foco em Orientação a Objetos, Refatoração e Encapsulamento**   

Gerar figurinhas a partir de uma imagem de uma url, do site da NASA e do IMDb;

- [x] Consumir API do site da IMBd e da Nasa ou os demais links que os instrutores criaram;
- [x] Criação de figurinhas para o WhatsApp com imagens incríveis da Nasa

**Aula 04 - Em construção**   🔨 👩‍💻 🖱 ⌨
   
   Em breve estará finalizado! 🥰

## Instrutores
- Jacqueline Oliveira
- Alexandre Aquiles
- Paulo Silveira
_____________
 
 # Aula 01 - Consumindo uma API de Filmes com Java

Os 250 melhores filmes de acordo com a classificação do IMDB https://www.imdb.com/chart/top/

Para início, nos cadastramos no site https://imdb-api.com/api , para em seguida, termos a chave de acesso.

Para achar sua API Key:

- [x] Após se registrar e confirmer o registro pelo recebimento do e-mail
- [x] Clicar no nome do usuário
- [x] Abrir o Profile
- [x] Abrir API Tester
- [x] Pronto, sua API Key estará visível 

Porém, no primeiro dia da imersão, o site da IMDB ficou instável e os intrutores criaram outros meios para se-guirmos com a aula.

Escolhi o link de API criado pela instrutora Jacqueline: https://alura-filmes.herokuapp.com/conteudos

_____________________________________

Tarefa realizada em conjunto com os intrutores da Alura: 

![image](https://user-images.githubusercontent.com/108991648/179908015-aa870a82-cd22-440e-b172-394006b2fd36.png)

________________________________________

Tarefas extras: decorar o terminal.

- Terminal - título do filme sublinhado: System.out.println("\u001b[4m" + filme.get("title") + "\u001b[0m")
- Terminal - link do filme na cor Ciano: System.out.println("\u001b[36m" + filme.get("image") + "\u001b[37m");
- Terminal - nota do usuário na cor Amarela: System.out.println("\u001b[33m" + filme.get("imDbRating") + "\u001b[37m");

![image](https://user-images.githubusercontent.com/108991648/179807403-5086eaa5-39ee-4e98-8d55-6a34ba1e75b0.png)

Resultado no terminal: 🥰

![image](https://user-images.githubusercontent.com/108991648/179807535-08688854-d6f0-4811-85bd-6bacec3369f7.png)

________________________________________

## Decorando o terminal

Base: \u001b[**nº**m

### Realce de texto

Realce | Código SGR
---|---
Negrito | 1
Itálico | 3
Sublinhado | 4
Piscando | 5
Invertido | 7
Riscado | 9

### Cores

Cor | Código SGR cor do texto | Código SGR cor de fundo
---|---|---
Preta | 30 | 40
Vermelha	| 31 |	41
Verde	| 32	|	42
Amarelo	|	33	|	43
Azul	|	34	|	44
Magenta	|	35	|	45
Ciano	|	36	|	46
Branca	|	37	|	47


https://www.alura.com.br/artigos/decorando-terminal-cores-emojis

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
   
   # Aula 04 - Ligando as pontas, refatoração e orientação a objetos
   
   ## Em construção 🔨 👩‍💻 🖱 ⌨
   
   Em breve estará finalizado! 🥰
