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
