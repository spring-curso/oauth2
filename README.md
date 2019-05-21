Backend byStaffing
===
Essa API foi desenvolvida de forma bem simples com as seguintes tecnologias:
  * Spring Boot 2.1.3 (conforme o desafio)
  * Spring Data Repository (Simplificar as consultas)
  * Lombok 1.16.10(Para facilitar o uso dos Setters e Getters)
  * Spring Security(Autenticação segura utilizando OAuth2 e bcrypt como encode de senhas)
  * Base de dados H2(conforme o desafio)
  
  Para rodar a API basta executar o seguinte comando(conforme o desafio):
  
  
  ~~~
    mvn clean spring-boot:run
  ~~~
  
  Para testar as requisições da API, deixei alguns exemplos no Postman(poderia ser utilizado o Swagger também), segue o link:
  
  ~~~
  https://www.getpostman.com/collections/6dde170d269b1e1ad0e6
  ~~~
  
  Também deixei a API em um ambiente na Amazon AWS(utilizando o Elastic Beanstalk) funcionando com o CI do Gitlab.
  Sempre que houver atualização do git na branch master o mesmo faz uma build e sobe para a AWS automaticamente. Segue o link da api na AWS:
  

  [API do desafio funcionando](http://bystaffingapi.us-east-2.elasticbeanstalk.com/)

 
