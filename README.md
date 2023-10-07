# spring-hibernate-demo

## REST Endpoints
- By default, Spring Data REST will create endpoints based on entity type.
- Simple pluralized form
  - First character of entity type is lowercase
  - Then just adds an 's' to the entity
 
## HATEOAS
- Spring Data REST endpoints are HATEOAS compliant
  - **HATEOAS:** Hypermedia as the Engine of Application State
- Hypermedia-driven sites provide information to access REST interfaces
  - Think of it as meta-data for REST data
- Spring Data REST response using HATEOAS.
- For a collection, meta-data includes page size, total elements, pages, etc.