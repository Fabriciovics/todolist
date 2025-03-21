# ToDo List API com Docker Compose

Este projeto é uma API REST simples para gerenciar uma lista de tarefas (ToDo List). Ele utiliza as seguintes tecnologias:

* **Linguagem:** Java
* **Framework/Biblioteca:** SpringBoot
* **Banco de Dados:** Mysql
* **Docker:** Para conteinerização da aplicação e do banco de dados
* **Docker Compose:** Para orquestração dos containers
* **Arquitetura:** Controller, Service, Repository

## Pré-requisitos

* Docker e Docker Compose instalados em sua máquina.
* Mysql Driver

## Como executar

1.  **Clone o repositório:**

    ```bash
    git clone https://github.com/Fabriciovics/todolist.git
    cd todolist
    ```

2.  **Execute o Docker Compose:**

    ```bash
    docker-compose up --build
    ```

    Isso irá construir as imagens Docker e iniciar os containers da aplicação e do banco de dados.

3.  **Acesse a API:**

    A API estará disponível em `http://localhost:8080`.

## Endpoints da API

* `GET /todos`: Lista todas as tarefas.
* `GET /todos`: Busca uma tarefa pelo ID.
* `POST /todos`: Cria uma nova tarefa.
* `PUT /todos`: Atualiza uma tarefa existente.
* `DELETE /todos/{id}`: Remove uma tarefa.

## Estrutura do projeto

├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── todolist/
│   │   │   │   │   ├── controller/
│   │   │   │   │   │   └── TodoController.java
│   │   │   │   │   ├── service/
│   │   │   │   │   │   └── TodoService.java
│   │   │   │   │   ├── repository/
│   │   │   │   │   │   └── TodoRepository.java
│   │   │   │   │   ├── model/
│   │   │   │   │   │   └── Todo.java
│   │   │   │   │   └── ToDoListApiApplication.java
│   │   └── resources/
│   │       └── application.properties
├── Dockerfile
├── docker-compose.yml
└── README.md
