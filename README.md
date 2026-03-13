# Gerenciador de Tarefas

Projeto desenvolvido em **Java utilizando Spring Boot e Thymeleaf** para gerenciamento de tarefas.

A aplicação permite criar, editar, excluir e acompanhar o status de tarefas.

---

# Funcionalidades

* Criar novas tarefas
* Editar tarefas existentes
* Excluir tarefas
* Alternar status entre **pendente** e **concluída**
* Filtrar tarefas por:

  * Todas
  * Pendentes
  * Concluídas
* Exibir estatísticas de tarefas:

  * Total de tarefas
  * Quantidade de pendentes
  * Quantidade de concluídas

---

# Tecnologias Utilizadas

* Java
* Spring Boot
* Spring MVC
* Thymeleaf
* Maven
* CSS

---

# Requisitos

Para executar o projeto é necessário ter instalado:

* **Java 17** ou superior
* **Git**

O projeto utiliza **Maven Wrapper**, portanto **não é necessário instalar Maven separadamente**.

---

# Como Executar o Projeto

## 1 - Clonar o repositório

```bash
git clone https://github.com/dev-igordaniel/Lista-de-Tarefas.git
```

---

## 2 - Acessar a pasta do projeto

```bash
cd Lista-de-Tarefas
```

---

## 3 - Executar a aplicação

### Windows

```bash
mvnw.cmd spring-boot:run
```

### Linux / Mac

```bash
./mvnw spring-boot:run
```

---

## 4 - Acessar no navegador

Após iniciar a aplicação, abra o navegador e acesse:

```
http://localhost:8080/tarefas
```

---

# Autor

Projeto desenvolvido por **Igor Daniel** como atividade acadêmica.
