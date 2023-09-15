
## Consulta de Dados Cadastrais por CNPJ em Java

Projeto para consultar os dados cadastrais de uma empresa na Receita através do CNPJ.

- A API está integrada com a API da Receita para consulta de dados;
- É possível cadastrar, deletar e consultar(forma geral ou por Id) os dados;
- Geração de ID automático;
- Foi utilizado o Swagger UI como interface gráfica para realização dos testes;

## Informações adicionais
- A API da Receita permite 3 consultas por minuto. No caso do limite ser excedido, o código HTTP retornado é o 429.

- Na API Pública da Receita não há resolução de consultas que precisam dados em tempo real. Os dados são retornados apenas para consultas realizadas no banco de dados. Outras consultas retornam o código HTTP 504 indicando timeout.

- Para realizar a consulta com sucesso através do Swagger UI realize os seguintes passos:

    1 - No método Post exclua o Id para que ele possa gerar um ID automático;

    2 - Substitua o String("cnpj": "String")  
        pelo CNPJ desejado sem pontos("cnpj": "00000000000000") ;

    3 - Execute para gerar os dados;

## Técnologias 

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)




## Fim

- Projeto para entrega do desafio DIO, passível de melhorias.

- Ainda tenho muito que aprender com relação ao Spring então estou aberto a sugestões.

## Referência

[Desafio da Digital Innovation One](https://web.dio.me/project/explorando-padroes-de-projetos-na-pratica-com-java/learning/153606ac-4b80-42e6-a8a1-8bf117b60617?back=/track/santander-bootcamp-2023-backend-java&tab=undefined&moduleId=undefined)

