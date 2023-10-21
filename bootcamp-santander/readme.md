# Santander Bootcamp 2023 Java API

RESTful API do Bootcamp Santander 2023 - trilha backend Java. Construída em Java 17 e Spring Boot 3.

## Principais Tecnologias
- **Java 17**: versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
- **Spring Boot 3**: a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
- **Spring Data JPA**: ferramenta para simplificar a camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
- **OpenAPI (Swagger)**: documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
- **Railway**: facilita o deploy e monitoramento de soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.

## Diagrama de Classes (Domínio da API)

```mermaid
classDiagram
  class User {
    -Long id
    -String name
    -Account account
    -Card card
    -Feature[] features
    -News[] news
  }

  class Account {
    -Long id
    -String number
    -String agency
    -BigDecimal balance
    -BigDecimal limit
  }

  class Card {
    -Long id
    -BigDecimal number
    -BigDecimal limit
  }

  
  class BaseItem {
    <<abstract>>
    -Long id    
    -String icon
    -String description
  }


  User "1" *-- "1" Account
  User "1" *-- "1" Card
  User "1" *-- "N" Feature
  User "1" *-- "N" News
  BaseItem <|-- Feature
  BaseItem <|-- News
```

## Documentação da API (Swagger)

### [https://foo.bar]()

### Exemplo de usuário em JSON

## Recursos adicionais
<details>
<summary>Exemplo de usuário em JSON</summary>
<br>
<code>{
  "name": "Fulanito Chaves",
  "account": {
    "number": "01.097954-4",
    "agency": "2030",
    "balance": 624.12,
    "limit": 1000.00
  },
  "card": {
    "number": "xxxx xxxx xxxx 1111",
    "limit": 2000.00
  },
  "features": [
    {
      "icon": "https://digitalinnovationone.github.io/santander-dev-week-2023-api/icons/pix.svg",
      "description": "PIX"
    },
    {
      "icon": "https://digitalinnovationone.github.io/santander-dev-week-2023-api/icons/pay.svg",
      "description": "Pagar"
    },
    {
      "icon": "https://digitalinnovationone.github.io/santander-dev-week-2023-api/icons/transfer.svg",
      "description": "Transferir"
    },
    {
      "icon": "https://digitalinnovationone.github.io/santander-dev-week-2023-api/icons/account.svg",
      "description": "Conta Corrente"
    },
    {
      "icon": "https://digitalinnovationone.github.io/santander-dev-week-2023-api/icons/cards.svg",
      "description": "Cartões"
    }
  ],
  "news": [
    {
      "icon": "https://digitalinnovationone.github.io/santander-dev-week-2023-api/icons/insurance.svg",
      "description": "Santander Seguro Casa, seu faz-tudo. Mais de 50 serviços pra você. Confira!"
    },
    {
      "icon": "https://digitalinnovationone.github.io/santander-dev-week-2023-api/icons/credit.svg",
      "description": "O Santander tem soluções de crédito sob medida pra você. Confira!"
    }
  ]
}</code>
</details>
