Resumo API REST

API do inglês é um acrônimo que significa interface de programação de aplicações, basicamente, ela permite a comunicação de serviços e produtos com outros produtos e serviços sem necessariamente saber como os mesmos foram implementados, simplificando dessa maneira o desenvolvimento de aplicações economizando tempo e recursos. Elas simplificam a adição de novos componentes à uma arquitetura preexistente. É peça fundamental na integração do software, devido a sua praticidade de aplicação.

API REST ou API RESTful é definida por ser uma interface de programação de aplicações que está de acordo com as restrições e conformidades da arquitetura REST, que são:

1. Arquitetura cliente-servidor: A arquitetura REST lida com solicitações via HTTP

2. Sem monitorações com o estado: nenhum conteúdo do cliente é armazenado entre as solicitações, todas as informações a cerca do estado da sessão ficam com o cliente.

3. Capacidade de cache: esse armazenamento pode eliminar algumas interações cliente-servidor

4. Sistemas em camadas: camadas que oferecem recursos extras na interação cliente-servidor, como por exemplo segurança.

5. Código sob demanda (facultativo): funcionalidades de um cliente podem ser expandidas pela transferência de códigos executáveis

6. Interface uniforme: Restrição de arquitetura essencial para o design de APIs RESTful que possui quatro pontos:

1° Identificação de recursos nas solicitações: recursos identificados no momento da solicitação e separados das representações retornadas para o cliente.

2° Manipulação de recursos: os recursos recebidos pelo cliente precisam possuir informações o suficiente para permitir a alteração ou exclusão, atualmente nas pesquisas realizadas JSON é a ferramenta mais adotada por poder ser lida por máquinas e humanos e não depender de outra linguagem de programação, a tornando extremamente versátil.

3° Mensagens auto-descritivas: Cada mensagem deve incluir informações suficientes para descrever como processar a mensagem.

4° HATEOAS: Transições de estado realizadas pelo cliente devem ocorrer apenas através de ações identificadas de maneira dinâmica na hipermídia do servidor.

Apesar de que a API REST precise estar em conformidade com todos esses itens citados e os cabeçalhos e parâmetros HTTP, ela é mais simples de aplicar do que por exemplo um protocolo prescrito como o SOAP, visto que esse tipo de protocolo tem requisitos específicos como o sistema de mensageria XML, além de necessitar cumprir exigências de segurança e transações, tornando-o mais lento e pesado. a arquitetura REST por possuir um conjunto de diretrizes que podem ser implementadas conforme a demanda, tornam as APIs RESTful mais versáteis, leves e rápidas, sendo ideal para IoT e desenvolvimento mobile.
