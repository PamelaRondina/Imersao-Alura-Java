# EM CONSTRUÇÃO 🔨👩‍💻🖱

Olá, em breve estará atualizado! 

# Imersão Alura Java
 
 **Aula 02 - Criar Figurinhas para o WhatsApp**
 
 Aula para gerarmos figurinhas a partir de uma imagem do diretório local ou de uma url.
 
 Link utilizado: https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json

 A imagem no terminal não foi gerada como no exemplo do instrutor e também não gerava erro no código após o RUN.
 
 😱😱😱
 
 **imagem da tela do instrutor Alexandre Aquiles.
 ![image](https://user-images.githubusercontent.com/108991648/180019681-17a97773-414c-4968-9c68-0c5cc8e343fd.png)
 
 Fiquei por algum tempo tentando localizar este "erro", sem sucesso 😥
 
 Continuei acompanhando a aula e codando junto com o professor e chagamos a um resultado positivo! 😁😀
 
 ![image](https://user-images.githubusercontent.com/108991648/180098860-5ed8e6f8-93d7-4c02-949d-43aad211cea6.png)
 
 Imagem sendo utilizada no WhatsApp: 😍
  
 ![image](https://user-images.githubusercontent.com/108991648/180099970-58f76db9-5f62-4037-9276-eb8ef313bd44.png)
 
 _________________________
 **Diretório ou URL, de onde devo buscar meu arquivo?**
 
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

**A forma que encontrei para editar a imagem e o texto 🤩**

Complicado sim, mas tudo bem rsrs... É o primeiro projeto!

Este vai controlar onde a imagem vai permanecer acima da parede em transparência.
![image](https://user-images.githubusercontent.com/108991648/180101509-c1d715d3-dad2-430d-9093-2c9cba1ee18e.png)
![image](https://user-images.githubusercontent.com/108991648/180101678-e33445ce-2d8f-45b6-af3f-819dc506074e.png)



![image](https://user-images.githubusercontent.com/108991648/180033895-b4ab4b37-a3a0-47cb-bd00-889b994e2aa0.png)

Nome da Fonte | Negrito | Tamanho | Cor
---|---|---|---
Font.SANS-SERIF | Font.BOLD | size:32 | graphics.setColor(Color.CYAN)



![image](https://user-images.githubusercontent.com/108991648/180035045-71b75082-c32a-460d-8d75-214a08fc41fa.png)

Texto | largura | altura
---|---|---
str: TOPZERA | x:0 | novaAltura-100


0 a esquerda

Após o RUN para verificar o resultado, clicar no diretório 
