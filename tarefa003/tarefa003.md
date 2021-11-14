<p style="text-align: center;"><font size="5"><b>Git Exercícios</b></font></p1></p>
<DIV align="justify">

Responda as questões abaixo (exercite os comandos do git correspondentes). Lembre-se de que o “interessante” não é exatamente o conjunto de respostas, mas o processo de obtê-las e a experiência obtida com a execução dos comandos.


1. Qual o comando para obter a versão instalada do Git? R: git version
2. Qual o efeito da execução de cada um dos comandos abaixo?
  a. git help R: exibe uma lista de comandos com a funcionalidade de cada um
  b. git help checkout R: exibe uma página com as possíveis ações realizáveis atráves do checkout como mudar de branches ou restaurar as working trees files.
  c. git help merge R: exibe uma página contendo a sinopse o nome e a descrição da ação, de "juntar" dois ou mais hitóricos de desenvolvimento
  d. git init R: inicia um repositório na pasta atual local.
  e. git add --all R: adiciona todos os arquivos do diretório para um eventual commit.
  f. git add -u R: todos os arquivos que estão observados pelo git na working tree são adicionados na staging area.
  g. git config -l R: mostra as configurações do usuário.
  h. git mv a.txt b.txt R: renomeia o arquivo de a para b
  i. git reset --hard R: reseta os commits, e mostra o último commit realizado
  j. git log -27 R: exibe a quantidade de commits requisitadas, no caso em questão, os últimos 27.

3. O fluxo “clássico” de interação com o Git é algo como “alterar um ou mais arquivos”, “acrescentar essas mudanças para serem contemplados no próximo commit” e, finalmente, executar um “commit”. Quais os comandos necessários para realizar os dois últimos “passos” desse fluxo?
R: git add. (adiciona os arquivos), git commit -m "mensagem" (commita os arquivos com alguma mensagem de especificação sobre o commit).

4. Qual o comando deve ser executado para identificar o que foi alterado desde o último “commit”?
R: git show
5. Em um dado repositório, arquivos simplesmente copiados para lá, ou seja, _untracked_, podem ser exibidos/identificados com que comando?
R: git status.
6. Qual o comando para efetuar um _commit_?
git commit -m "mensagem" entre aspas o texto para descrever a alteração.
7. Qual o comando que devemos empregar para descartar mudanças ocorridas no arquivo teste.txt, por exemplo?
git checkout -- ...
8. O que deve ser feito para que um determinado diretório do seu repositório seja ignorado pelo Git? Faça uma busca por **.gitignore**.
criar um arquivo com o nome gitignore.
9. O que acontece se o seu repositório local for acidentalmente removido?
ocorrerá perda dos dados locais, porém é possível pegar os dados no repositório remoto através do git clone.
10. Como clonar um repositório remoto?
git clone.
11. Em alguns cenários **git log** pode produzir extensos resultados. Se houver interesse em visualizar o histórico de um repositório, onde cada mudança é fornecida exatamente em uma única linha, qual o comando que deve ser empregado?
R: git log --pretty=oneline
12. Em qual arquivo o Git armazena informações de configuração empregadas por usuário?
R: gitcongig
13. Qual o comando para criar um repositório local?
git init
14. Qual o nome do diretório criado pelo Git quando se executa o comando **git init**?
o mesmo nome do eventual repositório em que o git foi inicializado.
15. Qual o comando para adicionar todos os arquivos modificados? (Aqueles para os quais **git status** identificam como **modified**?)
git add --all
16. O Git faz uso do valor de hash conhecido por SHA1. O que isto significa? Qual o propósito? O que é SHA1?
SHA1 é uma função hash criptográfica utilizada pelo git no tratamento das ações no intuito de não ocorrer alterações sem o git saber, é composta por uma string de 40 caracteres hexadecimais.
17. Qual a palavra para indicar o último _commit_ em vez do valor de hash SHA1 correspondente?
-abbrev-commit
18. Quando se cria dois arquivos usando um editor de texto qualquer e, na sequência, executamos o comando **git add -u**, os dois arquivos criados passam de _untracked_ para _new file_?
não, visto que o comando git add -u adiciona apenas os arquivos que já existiam e sofreram apenas uma edição.
19. Qual o efeito da execução dos dois comandos abaixo, nesta ordem, em um dado repositório?
**git reset --soft HEAD~1** R: retorna o último commit e mantém os últimos arquivos na stage area
**git reset --hard** R: retorna o último commit realizado.

20. Após o emprego de um ambiente integrado de desenvolvimento (IDE), é comum a criação de arquivos e diretórios. Qual o comando que podemos empregar para remover arquivos e diretórios _untracked_?
git clean -f
21. Qual o nome do arquivo no qual podemos inserir a indicação para o Git de arquivos e diretórios a serem ignorados?
.gitignore
22. Quando se cria o arquivo _MinhaClasse.class_ em um dado diretório e desejamos que arquivos com a extensão .class, como neste caso, sejam ignorados por todos os membros de uma equipe que estão contribuindo com um dado projeto, como devemos proceder?
*.class
23. jQuery é uma famosa biblioteca em JavaScript. Consulte detalhes em [jQuery](http://jquery.com). O repositório correspondente encontra-se em [gitRep](https://github.com/jquery/jquery.git). Faça o clone deste repositório.

24. No repositório **jqueryrepo**, criado no passo anterior, qual o efeito do comando
**git shortlog -sne**?
nome e email dos integrantes.
25. No repositório **jqueryrepo**, qual o efeito de **git remote -v**?
retorna a url remota do diretório da jqueryrepo
26. Um repositório Git pode ser etiquetado ao longo do tempo. Ou seja, _commits_ específicos podem ser “marcados” ou “etiquetados” para facilitar referências posteriores. Para listar todas as “etiquetas” (_tags_) estabelecidas para um dado repositório, qual comando deve ser executado?
git tag
27. Caso um dato repositório retorne muitas “marcas” ou “etiquetas” para o comando **git tag**, como retornar apenas aquelas que atendem a determinado padrão, por exemplo, iniciadas por 2.0?
git tag -a e a eventual tag exigida
28. Qual o efeito do comando **git tag -a 3.4-gold -m “minha versão ouro”**?
cria e armazena uma tag com a mensagem em anexo
29. Após executado o comando acima, qual o efeito de **git show 3.4-gold**?
exibe os dados do commit da tag anexada
30. O que o comando **git push origin 3.4-gold** teria como efeito?
informações a cerca de quem criou a tag a mensagem e a data que o commit fora etiquetado
31. Após executar um commit, qual o efeito de **git commit --amend**?
edita apenas a mensagem do commit anterior
32. Após executar **git add x.txt**, qual o efeito de **git reset HEAD x.txt**?
retira o x.txt da stage area do git
33. Após alterar o conteúdo de um arquivo committed em passo anterior, qual o efeito do comando **git checkout -- a.txt**?
descarta as alterações realizadas no respectivo arquivo
34. Qual a diferença entre os comandos **git reset HEAD a.txt** e **git checkout -- a.txt**?
o comando git reset HEAD a.txt retira o respectivo arquivo da stage area, por outro lado o comando git checkout -- a.txt descarta as alterações realizadas no eventual arquivo.
35. Veja como interpretar o resultado de git diff [aqui](https://medium.com/therobinkim/how-to-read-a-git-diff-6c87a9dc47c5). Execute, em um dos seus projetos, o comando **git diff HEAD~1 HEAD** e certifique-se de que entende o resultado apresentado.















</DIV/>
