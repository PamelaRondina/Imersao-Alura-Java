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


 ## Título

 Abrir o projeto *Linguagens-API*, ir em *mvnw*

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

## Rodar a aplicação pelo GIT

> Utilizo o **Git Bash**, com comandos Linux

Pelo Git Bash, vamos descobrir quais são as versões:

* Versão: Git
```bash
pamela@teste MINGW64 ~/desktop/linguagens-api
$ git --version
git version 2.37.1.windows.1
```
* Versão: Heroku

```bash
pamela@teste MINGW64 ~/desktop/linguagens-api
$ heroku --version
 »   https://dashboard.heroku.com/terms-of-service
heroku/7.53.0 win32-x64 node-v12.21.0
```
Pelo Git Bash, vamos entrar no diretório onde está o código.

```bash
pamela@test MINGW64 /
$ cd ~

pamela@teste MINGW64 ~
$ cd desktop/

pamela@teste MINGW64 ~/desktop
$ ls
'Pessoa 1 - Chrome.lnk'*   desktop.ini
 Postman.lnk*              linguagens-api/
'Project Zomboid.url'      linguagens-api-0.0.1-SNAPSHOT.jar

pamela@teste MINGW64 ~/desktop
$ cd linguagens-api

pamela@teste MINGW64 ~/desktop/linguagens-api
$ ls
HELP.md  mvnw*  mvnw.cmd  pom.xml  src/  target/
```

Conforme instruções do site do [Heroku CLI](https://dashboard.heroku.com/apps/pamela-linguagens-api/deploy/heroku-git):

![image](https://user-images.githubusercontent.com/108991648/180833487-ab3159c6-9d2d-4ac6-af9a-46cb12115091.png)



- [x] Rodar `$ heroku login`
- [x] Pressionar qualquer tecla
- [x] O navegador será aberto
- [x] Será gerado uma senha

OPS! Esse modo não deu certo! :disappointed:

Conforme outra intrução do site [Heroku](https://devcenter.heroku.com/articles/heroku-cli), vamos seguir de outra maneira.

![image](https://user-images.githubusercontent.com/108991648/180833826-2fa2e61f-a058-415e-b36f-72920dfae7d5.png)

Vamos tentar!







### Retornando ao Heroku












## Instalações e Registros Necessários


### Heroku

[x](https://www.heroku.com/)

### Aplicação MongoDB

### Aplicação PostMan

## :alarm_clock: Hora de Codar! :alarm_clock:

_________________

###### Dica Boa da Alura! 
[Documentação Sobre Clouud](https://docs.oracle.com/pt-br/iaas/Content/home.htm)
[Como escrever um README incrível no seu Github](https://www.alura.com.br/artigos/escrever-bom-readme)

 
