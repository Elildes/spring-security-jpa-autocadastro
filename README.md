# A Spring Security Example.

## Estrutura de uma Aplicação RESTfull MVC com Spring Boot

Tem 4 pacotes: Web Request --> @RestController --> @Service --> @Repository --> @Entity  

### Padrão MVC:  

- @RestController: manipular requisições de APIs REST  
- @Service: lógica de negócio  
- @Entity: entidade salva no banco  
- @Repository: camada de acesso aos dados  

Obs.: pode ter mais de uma instância de serviços rodando.  

### Dependências mais usadas:  

- Config Client  
- Config Server (configuração salva no servidor/git)  
- Cloud LoadBalancer  
- Eureka Discovery Client  
- Eureka Server  
- OpenFeign  
- Spring Boot DevTools  
- Spring Boot Actuator (Ops)  
- Spring Cloud (Configuration Server)  
- Spring Discovery Service  
