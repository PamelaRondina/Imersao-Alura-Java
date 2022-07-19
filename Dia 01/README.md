# Imersão Alura Java
 
 **Aula 01 - Consumindo uma API de Filmes com Java**

Os 250 melhores filmes de acordo com a classificação do IMDB https://www.imdb.com/chart/top/

Para início, nos cadastramos no site https://imdb-api.com/api , para em seguida, termos a chave de acesso.

Para achar sua API Key:

- [x] Após se registrar e confirmer o registro pelo recebimento do e-mail
- [x] Clicar no nome do usuário
- [x] Abrir o Profile
- [x] Abrir API Tester
- [x] Pronto, sua API Key estará visível 

Porém, no primeiro dia da imersão, o site da IMDB ficou instável e os instrutores criaram outros meios para seguirmos com a aula.

Escolhi o link de API criado pela instrutora Jacqueline: https://alura-filmes.herokuapp.com/conteudos

_____________________________________

Tarefa realizada em conjunto com os instrutores da Alura: 

![image](https://user-images.githubusercontent.com/108991648/179788056-38cace2a-a9ff-4c3d-af96-2a8daac0844b.png)

________________________________________

Tarefas extras: decorar o terminal.

- Terminal - título do filme sublinhado: System.out.println("\u001b[4m" + filme.get("title") + "\u001b[0m");
- Terminal - link da imagem do filme na cor Ciano: System.out.println("\u001b[36m" + filme.get("image") + "\u001b[37m");
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
