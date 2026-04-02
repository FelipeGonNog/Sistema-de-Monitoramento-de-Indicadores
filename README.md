# Sistema-de-Monitoramento-de-Indicadores
Sistema para coletar, armazenar e analisar indicadores públicos da API do portaldatransparência ao longo do tempo.
# GovInsight

API desenvolvida em Spring Boot para monitoramento de indicadores a partir de dados públicos do Portal da Transparência.

---

## 🚀 Objetivo

Consumir dados de despesas governamentais, tratá-los e disponibilizá-los via endpoints REST, permitindo análise e persistência em banco relacional.

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

---

## 🔗 Endpoints

### Buscar despesas (API externa)
```http
GET /despesas?ano=2023&funcao=12&pagina=1
