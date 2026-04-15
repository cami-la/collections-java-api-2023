# 🚀 Collections Java API 2026 (Target: Java 25 LTS)

<p align="center">
  <img src="assets/image/java-logo.png" alt="Java Logo" width="100">
  <br>
  <strong>Cápsula de Tiempo Tecnológica: Del Java 8 al Java 25 (LTS)</strong>
</p>

Este repositorio representa una auditoría y modernización profunda del framework de Colecciones en Java. Originalmente diseñado bajo estándares antiguos (Java 8), ha sido refactorizado por un **Senior Java Software Architect** para demostrar el estado del arte en desarrollo backend bajo la plataforma **Java 25 (LTS)** y el entorno **IBM Semeru / OpenJ9**.

---

## ✅ Última Etapa: Estabilización y Refactorización (April 2026)

### 1. Corrección de Inconsistencias Semánticas
- Se resolvió el error de "Símbolo no encontrado" en `CatalogoLivros.java`. 
- **Refactor**: Estandarización del idioma a **Portugués** (`livroList` en lugar de `libroList`), garantizando coherencia absoluta con el dominio de negocio.

### 2. Infraestructura de Pruebas (JUnit 5 + Java 25)
- **Estabilización del Motor**: Se inyectó `junit-platform-launcher` en el `testRuntimeOnly` de Gradle 9.4.1.
- **Resultado**: Ejecución exitosa de tests concurrentes con **Virtual Threads** e **Inmutabilidad**. 
- **Reporte Local**: [Gradle Test Report (Local)](./build/reports/tests/test/index.html).

### 3. Saneamiento de Artefactos
- Eliminación total de paquetes obsoletos (`list/`, `set/`, `map/`) en la raíz de `src/main/java`.
- **Estructura Única**: `me.dio.collections.*` como única fuente de verdad arquitectónica.

---

## 🏛️ Referencias de Autoridad (Must-Read)

| Recurso | Nivel | Propósito Técnico |
| :--- | :--- | :--- |
| **[JDK 25 API Documentation](https://docs.oracle.com/en/java/javase/25/docs/api/)** | API | Uso correcto de métodos en colecciones inmutables. |
| **[Java Language Specification (JLS)](https://docs.oracle.com/javase/specs/)** | Especificación | Entender el compilador tras las **Sealed Classes**. |
| **[Eclipse OpenJ9 Optimization Guide](https://www.eclipse.org/openj9/docs/)** | JVM | Ajustes de **Shared Classes** y **JIT/AOT**. |
| **[RESOURCES.md](./RESOURCES.md)** | Full Path | **Guía Curada de Niveles de Abstracción.** |

---

## 🛠️ Escalabilidad Tecnológica: De Java 8 a Java 25

### 1. Evolución de los Modelos: De Clases a Records
- **Java 8 (Old Style):** Clases verbosas con getters, setters, equals y hashCode manual (boilerplate excesivo).
- **Java 25 (New Style):** Implementación de **Records** para todos los portadores de datos (`Pessoa`, `Livro`, `Produto`, `Aula`). Esto garantiza inmutabilidad nativa y una reducción del 80% en líneas de código.

### 2. Jerarquía Segura: Sealed Classes & Pattern Matching
- **Seguridad de Tipos:** Se implementó una jerarquía cerrada para contenidos educativos mediante `sealed interface`.
- **Pattern Matching for switch:** Eliminamos el uso de `instanceof` y casting manual en el procesamiento de colecciones polimórficas. El compilador ahora garantiza la **Exhaustividad** del procesamiento.

### 3. Java Collections Framework 2.0: Sequenced Collections
- **Determinismo:** Implementación masiva de `SequencedSet` y `SequencedMap` para manejar extremos (`addFirst`, `getLast`) de forma expresiva y determinista, superando las limitaciones de las interfaces originales de Java 1.2.

### 4. Rendimiento de Nivel Producción: Streams & Virtual Threads
- **Filtrado Declarativo:** Sustitución de bucles `for` e `if` anidados por la **Streams API**.
- **Concurrencia Escalamiento Masivo:** El sistema está diseñado para ser compatible con **Virtual Threads**, permitiendo miles de operaciones de ordenación simultáneas con una sobrecarga mínima de memoria.
- **Optimización OpenJ9:** Configuración avanzada de la JVM con **Shared Classes** y **AOT (Ahead-of-Time)** para arranques ultrarrápidos y bajo consumo de RAM.

---

## 🏗️ Estructura del Proyecto (Modernizada)

- `me.dio.collections.list`: Operaciones, Pesquisa y Ordenación de Listas.
- `me.dio.collections.set`: Conjuntos de datos únicos con identidad basada en Records.
- `me.dio.collections.map`: Agendas y diccionarios optimizados con `Optional` y `Functional API`.
- `me.dio.collections.core`: El núcleo del sistema con **Sealed Classes** y **Pattern Matching**.

---

## 🚀 Cómo Ejecutar (Arquitectura 2026)

### Requisitos:
- **JDK:** Java 25 (IBM Semeru / Eclipse OpenJ9 recomendado).
- **Gradle:** 9.4.1+.

### Comandos:
```sh
# Limpieza profunda de residuos antiguos
rm -rf .gradle/ build/ out/ bin/

# Compilar y ejecutar Tests con Optimización OpenJ9
./gradlew test --info

# Ejecutar el núcleo del sistema
./gradlew run --args='me.dio.collections.core.ProcessadorEducacional'
```

---

## 👔 Rol: Senior Java Architect
Este proyecto sirve como referencia para la construcción de sistemas backend robustos, seguros y altamente eficientes, aprovechando cada gramo de innovación que el ecosistema Java ha entregado en la última década.

---
**Desarrollado con maestría técnica para el futuro del desarrollo Java.**
