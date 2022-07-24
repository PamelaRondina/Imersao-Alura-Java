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

PostMan retorna exatamente o que estava no navegador

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

- [X] Criar atalho: *Generate Getters* 
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
_________________


###### Dica Boa da Alura! 
[Stickers Dev: Aluraverso no WhatsApp e Telegram](https://www.alura.com.br/artigos/stickers-dev-aluraverso-whatsapp-telegram)

 
