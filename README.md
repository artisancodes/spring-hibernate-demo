# spring-hibernate-demo
 
## Service Layer  - Best Practice

- Best practice is to apply transactional boundaries at the service level.
- It is the service layers responsibility to manage transaction boundaries.
- For implementation code:
  - Apply @Transactional on service methods.
  - Remove @Transactional on DAO methods if they exist.