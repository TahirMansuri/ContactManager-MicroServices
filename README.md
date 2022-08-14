# Welcome to Contact Manager App using MicroServices developed by Tahir Mansuri

1. User Service MicroService -
  - URL : http://localhost:8999/user/{userId}
  - Access User Data with Contact Details.
 
2. Contact Service MicroService -
  - URL : http://localhost:8999/contact/{userId}
  - Contains Contact Data for Different Users.
  
3. Eureka Server -
  - URL : http://localhost:8761/ 
  - Manage All MicroServices and API Gateway.

4. API Gateway (MicroService) -
  - URL : http://localhost:8999/user/102          (User-Service Call)
          http://localhost:8999/contact/user/102  (Contact-Service Call)
  - Manage API Call for User and Contact Service by Gateway Routing.
