# 2019-1-dcc196-trb1-AlineSotte

Ajudar a Ong administrar suas Sedes.

-- Objetivo do Trabalho
  - Criar telas para listar, cadastrar, atualizar e exluir 
   -- Sedes
   -- Atividades
   -- Membros

-- Trabalho realizado
  -- Listar e Cadastrar
    -- Sedes
    -- Atividades
    -- Membros

-- Desenvolvimento:
   
    O primeiro passo do trabalho foi criar as depêndencias, no arquivo pom.xml, necessárias para iniciar o projeto, neste caso foram: Apache.tomcat, Derby e Javax.servelet.
    O desenvolvimento do trabalho consiste em criar modelos, repositório e o 
    controle para cada classe, neste caso, os modelos criados foram: Sedes, Atividades e Membros.

    Para cada modelo foi desenvolvido uma interface extendendo JpaRepository que foi informado a ela a entidade que deve ser persistida e qual tipo do id dessa entidade.

    No controle foi desenvolvido requisição para enviar e receber a resposta do usuário atráves da View.
    As view foram desenvolvidas na pasta webapp e foi repassado ao application.properties os seguintes comandos: spring.mvc.view.prefix=WEB-INF/views/ e spring.mvc.view.suffix=.jsp.
    O banco foi utilizado foi o Derby e no arquivo application.properties as configurações necessárias.

    Para criar as tabelas no banco foi utilizado @Entity em cada modelo e a relação manytoone entre elas, ou seja, atividade e membros recebem a chave estrangeira da tabela Sede. Fazendo assim um relacionamento de muitos para um.

-- Dificuldade 

 -- configurar as dependência projeto erros que impossibilitaram o desenvolvimento do projeto;
 -- o banco utilizado Derby não criava as tabelas;
 -- Quando inseria o dado não persistia;
 -- Devido ao banco não consguia testar o que ja tinha sido implementado como cadastrar e inserir Sede na lista;
 -- Não ocorreu o funcionamento completo de todas as requisições do projeto para data atual.
 
 -- Aprendizado

 -- configurar o ambiente;
 -- entender os problemas encontrados ao trabalhar com o banco Derby;
 -- estudar JPA;
 -- estudar Lombok que foi utilizado no início do projeto para dimuir a quantidade de linhas e deixar o código mais limpo;
 -- estudar mapeamento entre as entedidades;
 -- entender o funcionamento da View e Controller, assim como a necessidade do Repositório; 
 -- Anotações e suas funções dentro do código
