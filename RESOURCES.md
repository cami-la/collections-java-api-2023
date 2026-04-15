# 📚 Guía de Autoridad y Recursos Técnicos: Java 25 (LTS)

Como **Senior Java Architect**, he curado esta selección de fuentes de verdad para transformar un perfil junior en un desarrollador de alto nivel, basándome en los pilares de la especificación, la implementación y la optimización.

---

## 🏛️ Niveles de Abstracción: Ruta de Maestría

### 1. Nivel Sintaxis y Semántica (El "Qué" y "Cómo")
*Para entender las reglas del lenguaje, desde Records hasta Pattern Matching.*

| Recurso | Tipo | Por qué leer esto |
| :--- | :--- | :--- |
| **[Java Language Specification (JLS) - Java 25](https://docs.oracle.com/javase/specs/)** | Especificación | Resuelve dudas sobre el comportamiento exacto del compilador (ej. Exhaustividad en Sealed Classes). |
| **[Dev.java: The Destination for Java Developers](https://dev.java/)** | Portal Oficial | Tutoriales autoritativos de Oracle que cubren desde sintaxis básica hasta Project Loom (Virtual Threads). |
| **[Java Almanac](https://javaalmanac.io/)** | Comparativa | Indispensable para visualizar la evolución de la API de Colecciones desde Java 8 hasta la versión 25. |

### 2. Nivel JVM e Infraestructura (El "Dónde" y "Eficiencia")
*Enfoque específico en el Runtime de alto rendimiento: Eclipse OpenJ9 / IBM Semeru.*

*   **[Eclipse OpenJ9 Documentation](https://www.eclipse.org/openj9/docs/)**: **Indispensable** para entender cómo configurar `-Xshareclasses` y `-Xquickstart`. Resuelve problemas de consumo de memoria en contenedores.
*   **[IBM Semeru Runtimes Guide](https://www.ibm.com/docs/en/semeru-runtimes/21)**: Guías de optimización para despliegues de grado empresarial. Explica la ventaja del JIT/AOT sobre HotSpot.
*   **[Project Loom (Virtual Threads) JEP 444](https://openjdk.org/jeps/444)**: La fuente original para entender la concurrencia ligera que implementamos en este proyecto.

### 3. Nivel Arquitectura y Patrones (El "Diseño")
*Cómo estructurar sistemas robustos y escalables.*

*   **[Baeldung: Java Collections Guide](https://www.baeldung.com/java-collections)**: Ejemplos prácticos de alta calidad para dominar `SequencedCollections` y `Stream API`.
*   **[Refactoring.Guru: Design Patterns in Java](https://refactoring.guru/design-patterns/java)**: Para aprender a aplicar patrones como *Strategy* o *Factory* usando la elegancia de Java moderno.

### 4. Nivel Testing y Calidad (La "Confianza")
*Garantizando que el código de producción sea infalible.*

*   **[JUnit 5 User Guide](https://junit.org/junit5/docs/current/user-guide/)**: Documentación oficial para dominar el motor de pruebas `@Test` y extensiones.
*   **[AssertJ Official Site](https://assertj.github.io/doc/)**: Guía para escribir aserciones fluídas que parecen lenguaje natural.

---

## 🚀 Ruta de Aprendizaje Gratuita (Free Tier)

Si estás iniciando tu viaje hacia Java 25, sigue este orden:

1.  **[Oracle University: Java Explorer](https://education.oracle.com/learning-path/java-explorer/lp_501)**: Curso gratuito para establecer las bases fundamentales.
2.  **[JetBrains Academy (Java Track)](https://www.jetbrains.com/academy/)**: Plataforma interactiva (con nivel gratuito) para practicar con proyectos reales.
3.  **[Exercism: Java Track](https://exercism.org/tracks/java)**: Mentoría gratuita y desafíos de código para pulir tu lógica de programación.

---

## 🔍 Diferencia Crítica: API vs. Especificación

| Característica | API Documentation (JavaDocs) | Language Specification (JLS) |
| :--- | :--- | :--- |
| **Enfoque** | ¿Cómo uso este método/clase? | ¿Cuáles son las reglas de la gramática? |
| **Audiencia** | Desarrolladores de aplicaciones. | Arquitectos y creadores de herramientas. |
| **Ejemplo** | `List.addFirst()` añade al inicio. | Las clases `sealed` requieren `permits`. |

> **Nota del Arquitecto:** "Un desarrollador senior no solo sabe cómo escribir el código, sino que entiende por qué la JVM decidió ejecutarlo de esa manera. Lee la especificación una vez, y entenderás el lenguaje para siempre."
