# Sistema-de-Monitoramento-de-Indicadores
Sistema para coletar, armazenar e analisar indicadores públicos da API do portaldatransparência ao longo do tempo.
# GovInsight

API desenvolvida em Spring Boot para monitoramento de indicadores a partir de dados públicos do Portal da Transparência.
---

## 🚀 Objetivo
**Consumir dados de despesas governamentais, tratá-los e disponibilizá-los via endpoints REST, permitindo análise e persistência em banco relacional.**

---
## 🛠 Tecnologias utilizadas

- Java 17  
- Spring Boot  
- Spring Web MVC  
- Spring Data JPA  
- Gradle  
- H2 Database  
- REST APIs  
---

## ⚙️ Funcionalidades
- Consulta de despesas por parâmetros (ano, função, etc)
- Integração com API do Portal da Transparência
- Geração de resumo analítico de despesas
- Persistência de dados em banco relacional (JPA)
- Tratamento global de exceções
- Endpoint de status da aplicação

## 📸 Evidências do projeto

### 🔹 Teste de integração com API (Postman)
Requisição realizada com sucesso utilizando a API do Portal da Transparência, validando autenticação e retorno dos dados.

<img width="512" height="382" alt="postman" src="https://github.com/user-attachments/assets/31bb7ea8-293f-43b5-9688-b9a5e6b696eb" />

---

### 🔹 Estruturação da aplicação (Controller, Service e Config)
Organização em camadas permitindo o consumo da API externa e conversão dos dados JSON em objetos Java.

<img width="512" height="129" alt="arquitetura" src="https://github.com/user-attachments/assets/bd9b960b-cdb3-4ca7-8110-922438334e80" />

---

### 🔹 Endpoint de resumo analítico
Geração de resumo de despesas a partir dos dados coletados:

<img width="512" height="134" alt="resumo" src="https://github.com/user-attachments/assets/4959a8fc-103d-489a-8785-44614ab781a5" />

---

### 🔹 Endpoint de status da aplicação
Endpoint criado para verificação da saúde e funcionamento da API.

<img width="512" height="115" alt="status" src="https://github.com/user-attachments/assets/e7b92e74-27f9-4d56-933c-cb10b1c4aa42" />

---

### 🔹 Tratamento global de exceções
Implementação de tratamento padronizado de erros utilizando `@ControllerAdvice`.

<img width="512" height="94" alt="exception" src="https://github.com/user-attachments/assets/54324641-76d1-4539-8317-2b855d3e32d1" />

---

### 🔹 Persistência de dados com H2
Dados armazenados em banco relacional utilizando JPA, com visualização via H2 Console.

<img width="512" height="263" alt="h2" src="https://github.com/user-attachments/assets/41e94f01-5d54-4c9b-8384-0c13fd1fabcd" />

---
### Buscar despesas (API externa)

**Método:** GET  
**Endpoint:** `/despesas`

**Parâmetros:**
- `ano` (obrigatório)
- `funcao` (opcional)
- `pagina` (default = 1)

**Exemplo de requisição:**
```http
GET http://localhost:8080/despesas?ano=2023&funcao=12&pagina=1




