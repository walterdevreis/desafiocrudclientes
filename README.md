# DESAFIO CRUD DE CLIENTES

Desafio crud de clientes é um projeto Spring Boot contendo um CRUD completo de web services REST para
acessar um recurso de clientes, contendo as cinco operações básicas:
- Busca paginada de recursos
- Busca de recurso por id
- Inserir novo recurso
- Atualizar recurso
- Deletar recurso

## Modelo conceitual de entidade

Um cliente possui nome, CPF, renda, data de nascimento, e quantidade de filhos. A especificação da
entidade Client é mostrada a seguir.

|          Client          |           
|--------------------------|
| - << pk >> id : Long     |
| - name : String          |
| - cpf : String           |
| - income  :Double        |
| - birthDate : LocalDate  |
| - children : Integer     |
|                          |

## Tecnologias utilizadas

- Java
- Spring Boot
- Maven
- Banco de dados H2

# Autor

Walter Mariano Reis

- Linkedin: https://www.linkedin.com/in/walter-r-1b606880/
- GitHub: https://github.com/walterdevreis?tab=repositories
