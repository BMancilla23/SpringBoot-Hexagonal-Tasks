## Arquitectura Hexagonal con Spring Boot para Gestión de Tareas

Este proyecto tiene como objetivo proporcionar una implementación de muestra de un sistema de gestión de tareas utilizando Spring Boot y siguiendo el patrón de arquitectura hexagonal. La arquitectura hexagonal, también conocida como arquitectura de puertos y adaptadores, enfatiza la separación de responsabilidades dividiendo la aplicación en capas basadas en sus responsabilidades.

### Características

- **Creación de Tareas**: Crea tareas con título, descripción, fecha de vencimiento y prioridad.
- **Gestión de Tareas**: Actualiza, elimina y visualiza tareas.
- **Priorización de Tareas**: Prioriza tareas en función de la urgencia.
- **API REST**: Expone puntos finales REST para realizar operaciones CRUD en tareas.
- **Persistencia**: Almacena tareas en una base de datos MySQL.

### Prerrequisitos

Antes de ejecutar esta aplicación, asegúrate de tener lo siguiente instalado:

- Java 11 o superior
- Maven
- Git (para clonar el repositorio)
- MySQL

### Instalación y Uso

1. Clona el repositorio:

   ```bash
   git clone https://github.com/bmancilla23/springboot-hexagonal-tasks.git
