# Make-an-E-commerce-Website-for-Sporty-Shoes-.
![16](https://user-images.githubusercontent.com/61027679/186437858-ab3fde2c-5487-4d00-89ff-53dc4208d4ac.png)
![11](https://user-images.githubusercontent.com/61027679/186437879-c25df4a0-6ccf-433b-b986-acf592d7bb01.png)
![12](https://user-images.githubusercontent.com/61027679/186437887-ff2db5b2-5541-4607-9c52-880f72b33603.png)
![13](https://user-images.githubusercontent.com/61027679/186437893-5fe68453-a1b2-4003-a011-dc5f82f4e4ce.png)
![14](https://user-images.githubusercontent.com/61027679/186437904-5aa573ef-e4a1-4b90-aaa9-bdd7441d21bf.png)
![15](https://user-images.githubusercontent.com/61027679/186437911-e2740be5-3deb-4bd9-8faf-36bcc4e563a5.png)

Technologies Used
Java	![11](https://user-images.githubusercontent.com/61027679/186437782-0d746a79-ab1c-44e9-bb27-b2a260217a1b.png)
1.8
Spring Boot	2.2.10
Lombok	---
Swagger-ui	2.7.0
H2	---
JPA	---
Spring Security Starter	---
File Structure
src
├── main
│   ├── java
│   │   └── com
│   │       └── api
│   │           └── sportyShoes
│   │               ├── SportyShoes.java
│   │               ├── config
│   │               │   ├── SpringSecurityConfig.java
│   │               │   └── SwaggerConfig.java
│   │               ├── controller
│   │               │   ├── CRUDController.java
│   │               │   └── SearchController.java
│   │               ├── exceptionHandler
│   │               │   └── BusinessException.java
│   │               ├── model
│   │               │   ├── PurchaseReport.java
│   │               │   └── Shoe.java
│   │               ├── repository
│   │               │   ├── PurchaseReportRepository.java
│   │               │   └── ShoesRepository.java
│   │               └── service
│   │                   ├── SportyShoesService.java
│   │                   └── impl
│   │                       └── SportyShoesServiceImpl.java
│   └── resources
│       └── application.properties
└── test
    ├── java
    └── resources

16 directories, 13 files
Project Structure
This project uses Spring Boot for Model and Controller Implementation Availaible apis are -

/shoe (CRUD)
/purchaseReport (CRUD)
/shoe/all
/purchaseReport/(category|all|dop)
Current Implementation relies simply on String for storing order list.

It can be extended to utilize many-to-many relationship b/w Shoe and PurchaseReport Entities.

Also for admin authentication spring-security-starter has been used with credentials saved in application.properties 

