# 🎬 MovieConnect

Aplicación desarrollada en Java para la gestión y recomendación de películas mediante estructuras de datos no lineales.

## Descripción

MovieConnect es un sistema que permite organizar películas por categorías utilizando un árbol general y establecer relaciones entre ellas mediante un grafo. El objetivo es simular funcionalidades presentes en plataformas como Netflix o Letterboxd, permitiendo buscar películas, obtener recomendaciones y explorar filmografías de directores.

---

## Funcionalidades

### Gestión de películas

- Buscar películas por nombre.
    
- Mostrar información detallada:
    
    - Título
        
    - Director
        
    - Género
        
    - Sinopsis
        

### Recomendaciones

- Obtener recomendaciones relacionadas mediante BFS.
    
- Explorar películas de un mismo director mediante DFS.
    

### Wishlist

- Agregar películas a una lista de deseos.
    
- Mostrar películas guardadas.
    

### Historial

- Registrar películas vistas mediante una pila (Stack).
    
- Consultar historial de visualización.
    

### Catálogo

- Mostrar categorías y películas mediante recorrido Preorden.
    

---

## Estructuras utilizadas

### Árbol General

Utilizado para organizar películas por categorías.

Operaciones implementadas:

- Inserción de categorías.
    
- Inserción de películas.
    
- Búsqueda de películas.
    
- Recorrido Preorden.
    

### Grafo

Implementado mediante lista de adyacencia.

Representa relaciones entre películas:

- Mismo director.
    
- Mismo género.
    
- Películas similares.
    

Algoritmos implementados:

- BFS para recomendaciones.
    
- DFS para exploración de directores.
    

### Otras estructuras

- Stack para historial de visualización.
    
- LinkedList para wishlist.
    

---

## Clases principales

- Pelicula
    
- NodoArbol
    
- ArbolCategorias
    
- GrafoPeliculas
    
- SistemaPrincipal
    
- Main
    

---

## Flujo del sistema

1. El usuario busca una película.
    
2. El árbol localiza la película.
    
3. Se muestra la información de la película.
    
4. El usuario puede:
    
    - Ver la película.
        
    - Obtener recomendaciones.
        
    - Explorar películas del director.
        
    - Agregar a wishlist.
        

---

## Tecnologías

- Java
    
- Programación Orientada a Objetos
    
- Árboles Generales
    
- Grafos
    
- BFS
    
- DFS
    
- Stack
    
- LinkedList
    

---

## Autor

Ariel David Marín Batista

Proyecto Final Integrador – Estructura de Datos II – Ingeniería Informática – 2026.