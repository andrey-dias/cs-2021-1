# Tarefa 012
**1.5** 6 dicas fundamentais para um código de Qualidade

**2.1**

Basicamente a principal ideia do vídeo é uma análise realizada sobre um
artigo chamado de "Things That You Can Do To Improve Code Quality", ou seja,
coisas que você pode fazer para melhorar seu código. É listado 6 coisas no escopo
principal do tema, o princípio dos 4 olhos, integração contínua, convenções no código,
testes, analisar bugs e métricas de código. No intuito de instruir algumas normas
para obter um nível coerente de qualidade de software.

**2.2**

Dos 6 conceitos abordados o que eu nunca havia ouvido falar antes seria o 2°, de
integração contínua, que serve para integrar as alterações para o código principal
sempre antes passando por um local de testes automatizado, existindo em um local
afastado do ambiente de desenvolvimento e necessitando ser construído do 0 toda
vez que o mesmo for utilizado visando evitar qualquer tipo de vício no ambiente.
No artigo é comentado duas dicas importantes para o sucesso da integração contínua,
por exemplo, 1 teste não depender do estado de outro teste para a execução e se a
master estiver "quebrada", priorizar a solução do problema relacionado.

**2.3**

Dentre os 6 conceitos abordados com exceção do listado no item 2.2 todos eu já havia
ouvido falar pelo menos uma vez, porém o que mais me interessou fora o 6°, métricas
de código, em específico abordado no vídeo seria a complexidade ciclomática, que
mede quantos caminhos e condicionais existem no código, e existe uma relação visível
entre a quantidade de erros e o tamanho da complexidade ciclomática, segundo um trecho
do wikipédia retirado de uma pesquisa, "Funções e métodos com uma alta complexidade
também tendem a conter o maior número de defeitos", portanto, quanto mais "caminhos"/
condicionais existirem no código, mais suscetível à erros ele estará.

**3**

O artigo começa tratando de forma divertida uma maneria de mensurar a Qualidade
do código como a quantidade de "Que p*rra e essa" por minuto, satirizando o fato
de que muitas vezes nos deparamos com algumas gambiarras feitas por outro membro
da equipe ou até nós mesmos. O artigo trabalha sobre a ótica de 6 boas práticas
que clareiam o entendimento e produção do código, como:

- princípio dos 4 olhos, que trás a ideia de que 2 outros membros da equipe além
de quem programou o código deve fazer a revisão do código, utilizando como por
exemplo o pull request do git, buscando margens para refatoração do código por
exemplo.

- integração contínua, que integra as alterações ao código passando por um ambiente
de testes com a ausência de vícios, passando por uma série de rotinas.

- convenções no código, o artigo enfatiza a importância da equipe estar em
concordância com essas convenções para não gerar uma eventual perda de tempo em
discussões que não levam à lugar algum, e sempre manter bem documentado todas
essas convenções desde a maneira que será declarada uma variável até a nomeclatura
de alguns itens.

- Testes, logicamente quanto menos bugs o código tiver, maior será a qualidade dele,
com isso em vista adaptar para o processo de desenvolvimento uma abordagem sólida
para o tratamento de bugs com uma vasta quantidade de testes aumentaria significativamente
a qualidade do software.

- analisar bugs, priorizar bugs pode ser um diferencial no quesito qualidade de Código
pois aprender com os erros é essencial no processo de aprendizagem, logo, esses erros
devem parar de surgir com o tempo, ao analisar bugs perguntas como "o que foi que deu errado"
surgem e essa caça ao problema é sempre produtiva para o desenvolvedor aprender
com os bugs, e durante essa análise, classificar a prioridade do respectivo bug,
se for algo crítico, consertar na hora.

- Métrica de código, existem diversas métricas de código porém a que vale enfatizar
seria a métrica de complexidade ciclomática, que mede a complexidade de acordo com
a quantidade de caminhos condicionais que o código pode seguir, quanto mais condicionais
maior a possibilidade e suscetibilidade para erros no código, deteriorando a qualidade
do mesmo.

De modo geral, nem todos os métodos são simples de se implementar, contudo, todos eles
são válidos de analisar para, com o devido estudo, colocar em prática na equipe,
pois de fato, são passos que melhoram muito a qualidade do software.
