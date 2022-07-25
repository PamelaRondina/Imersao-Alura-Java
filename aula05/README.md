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

 
