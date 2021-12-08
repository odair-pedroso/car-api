# car-api
Aplicação para cadastro de carros a ser utilizada na disciplina de Apis Rest com Java e Spring da UNIFACEF.

Criação de serviços que permitam cadastro de Carro/Preço/Clientes em microsserviços apartados, cada qual com suas respectivas validações. Também será criado um microsserviço de agregação onde os payloads oriundos dos microsserviços especialistas devem ser agregados.


# A solução


![image](https://user-images.githubusercontent.com/64381101/145072685-910cfbd6-2e5e-4855-a475-95f5a1b7bce5.png)


# Car-API: 

Microsserviço responsável pelo CRUD de carros via HTTP, por persistir no mongo e enviar para a Location-API.

# Price-API:

Microsserviço responsável pelo CRUD de preços via HTTP, por persistir no mongo e enviar para a Location-API.

# Client-API:

Microsserviço responsável pelo CRUD de clientes via HTTP, por persistir no mongo e enviar para a Location-API.

# Location-API:

Microsserviço responsável por agregar os dados oriundos dos microsserviços de entrada.

# Contratos da api de carro:

POST/api/V1/cars

{
"id":"String",
"brand":"String",
"model": "String",
"color": "String",
"year": "String",
"board": "String",
"typeCar":"String",
"tankStatus": "String",
"availability": "String",
"createdDate":"LocalDateTime",
"lastModifieldDate":"LocalDateTime"
}

PUT/api/v1/cars/{id}

{
  "brand":"String",
  "model": "String",
  "color": "String",
  "year": "String",
  "board": "String",
  "typeCar":"String",
  "tankStatus": "String",
  "availability": "String",
  "createdDate":"LocalDateTime",
  "lastModifieldDate":"LocalDateTime"
}

GET/api/v1/cars/{id}

{
  "id":"String",
  "brand":"String",
  "model": "String",
  "color": "String",
  "year": "String",
  "board": "String",
  "typeCar":"String",
  "tankStatus": "String",
  "availability": "String",
  "createdDate":"LocalDateTime",
  "lastModifieldDate":"LocalDateTime"
}

GET/api/v1/cars

{
  "items" : [
  {
   "id":"String",
  "brand":"String",
  "model": "String",
  "color": "String",
  "year": "String",
  "board": "String",
  "typeCar":"String",
  "tankStatus": "String",
  "availability": "String",
  "createdDate":"LocalDateTime",
  "lastModifieldDate":"LocalDateTime"  
  }
],
"page": "Integer",
"size": "Integer",
"totalElements" : "Integer",
"totalPages" : "Integer"
}

# Tecnologias utilizadas

Java8
MongoDB
Lombok
Spring Boot
Spring Data
Open Feign
FF4J

# Para subir a APP

Criar um banco de dados mongo local chamado car-api, ou alterar o arquivo application.yml atualizando-o para o endereço mongo correto.
Após subir essa aplicação ficará disponível em http:/localhost:8081
Swagger disponível em : http://localhost:8081/swagger-ui.html
FF4J disponível em : http://localhost:8081/ff4j-console/


