# BrandProductAPI

API REST construida con Spring Boot que permite gestionar marcas y sus productos mediante operaciones CRUD. Proyecto de arquitectura por capas.

## Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven
- H2 (Base de datos en memoria)
- Postman (para pruebas de endpoints)

## Características principales

- Gestión de **marcas** (`Maker`)
- Gestión de **productos** (`Product`)
- Operaciones CRUD completas para ambos recursos
- Separación en capas:
    - Controller
    - Service
    - Persistence (DAO)
    - Repository
    - DTO
    - Entities
- Uso de `@Repository`, `@Service`, `@RestController`, etc.
- Validación de datos
- Manejo de excepciones
- Arquitectura limpia y mantenible
- Consulta personalizada con JPA Query y Query Method
- Base de datos en memoria (H2) para pruebas rápidas

## Endpoints principales

### Marcas (`/api/makers`)
- `GET /` - Listar todas las marcas
- `POST /` - Crear nueva marca
- `PUT /{id}` - Actualizar marca por ID
- `DELETE /{id}` - Eliminar marca por ID

### Productos (`/api/products`)
- `GET /` - Listar todos los productos
- `POST /` - Crear nuevo producto
- `PUT /{id}` - Actualizar producto por ID
- `DELETE /{id}` - Eliminar producto por ID
- `GET /range?min=10&max=100` - Buscar productos por rango de precio
