# Teste de estágio

Esse projeto tem uma estrutura semelhante com a dos serviços utilizados no nosso dia a dia, porém bastante simplificada. A intenção é disponibilizar uma API que serve dados de um dispositivo para o frontend.

## Explicações básicas

Utilizamos diferentes módulos (api, app, document e service) para diferentes concerns:

#### App 
Lida com a configuração da aplicação. É onde está localizado o Application.java.

#### Api
Lida com requisições http em si (controller)

#### Document
Contém as classes/DTOs

#### Service
Contém toda a lógica

## Pré-requisitos para rodar

- Intellij Community
- JDK 19