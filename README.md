# spring-hibernate-demo
 
## API Design Process

### 1) Review API requirements:
REST clients should be able to:
- Get a list of employees
- Get a single employee by id
- Add a new employee
- Update an employee
- Delete an employee

### 2) Identify main resource/entity
- To identify main resource/entity, look for the most prominent "noun".
- For our project, it is "employee"
- Convention is to use plural form of resource/entity: employees

### 3) Use HTTP methods to assign action on resources
HTTP Method | CRUD Action
----------- |-------------
**POST:**   | Create a new entity
**GET:**    | Read a list of entities or single entity
**PUT:**    | Update and existing entity
**DELETE:** | Delete and existing entity

## Employee Real-Time Project
HTTP Method | Endpoint                     | CRUD Action
----------- |------------------------------| -----------
**POST:**   | /api/employees               | Create a new entity
**GET:**    | /api/employees/{employeeId}  | Read a list of entities or single entity
**PUT:**    | /api/employees               | Update and existing entity
**DELETE:** | /api/employees/{employeeId}  | Delete and existing entity

## Anti-Patterns
Do not do this... these are REST anti-patterns, bad practice:
- /api/employeesList
- /api/deleteEmployee
- /api/addEmployee
- api/updateEmployee

**DON'T INCLUDE ACTIONS IN THE ENDPOINT. INSTEAD, USE HTTP METHODS TO ASSIGN ACTIONS.**