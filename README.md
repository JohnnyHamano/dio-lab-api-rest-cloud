# Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway
Repositório do lab "Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway" da Digital Innovation One.

## Projeto
Implementação de um sistema de webstore para compras online.<br>
Armazenamento de dados de usuário, produtos disponíveis e log de compras/transações.

```mermaid
classDiagram
    class User {
        +Long id
        +Account account
        +PersonalData personal_data
        +Contact contact
    }

    class Account {
        +String user
        +String password
    }

    class PersonalData {
        +String name
        +Date birthdate
    }

    class Contact {
        +String email
        +List~String~ phone_number
    }

    User --> Account
    User --> PersonalData
    User --> Contact
```

```mermaid
classDiagram
    class Product {
        +Long id
        +String name
        +String description
        +String thumbnail
        +String category
        +float price
        +int discount_percentage
        +int stock
    }
```

```mermaid
classDiagram
    class Transaction {
        +Long id
        +Long id_client
        +List~Long~ id_products
        +float total_price
        +Date purchase_date
    }
```
