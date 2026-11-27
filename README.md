# Generador de Enemigos por Bioma – Pharloom (Hollow Knight: Silksong)

**Evaluación Global Integradora (EGI) – Diseño de Software**  
* **Carrera:** Tecnicatura Universitaria en Desarrollo de Software (ITU)
* **Alumno:** Gabriel Martinez
* **Patrón de diseño aplicado:** Factory Method
* **Lenguaje:** Java (OpenJDK 21.0.5 – Temurin)

---

## Descripción del problema

En el desarrollo de un videojuego *Metroidvania* ambientado en el reino de Pharloom (*Hollow Knight: Silksong*), el jugador recorre distintos biomas (**Valle Musgoso**, **Espesura Fatua** y **Abismo**). Cada zona posee sus propias criaturas con estadísticas y ataques específicos, pero el flujo general del motor para iniciar un encuentro y gestionar el combate es siempre el mismo.

Para evitar un acoplamiento fuerte entre el motor del juego y las clases concretas de cada enemigo —así como condicionales extensos que dificultan agregar nuevos biomas o expansiones—, se implementó el patrón **Factory Method**. La clase abstracta `GeneradorZona` centraliza la lógica del encuentro y delega en cada bioma concreto la instanciación de sus criaturas mediante el método fábrica `crearEnemigo(tipo)`, trabajando siempre contra la interfaz común `Enemigo`.

---

## Estructura del proyecto

```text
src/
├── enemigos/
│   ├── Enemigo.java
│   └── ... (clases concretas de enemigos por bioma)
├── zonas/
│   ├── GeneradorZona.java
│   ├── ZonaValleMusgoso.java
│   ├── ZonaEspesuraFatua.java
│   └── ZonaAbismo.java
└── Main.java
```

---

## Diagrama de Clases UML

<img width="895" height="1030" alt="ALAAAA drawio" src="https://github.com/user-attachments/assets/7f4e28cc-d958-43fa-a00c-0f0c35ff7360" />

---

## Requisitos y ejecución

* **Versión del lenguaje:** Java 21 (`OpenJDK 21.0.5 LTS – Temurin`)
* **IDE recomendado:** IntelliJ IDEA

### Ejecutar desde IntelliJ IDEA
1. Clonar el repositorio:
   ```bash
   git clone [https://github.com/gav0id/egi-diseno-software.git](https://github.com/gav0id/egi-diseno-software.git)
   ```
2. Abrir la carpeta del proyecto en **IntelliJ IDEA**.
3. Verificar que el SDK configurado sea **Java 21**.
4. Abrir `src/Main.java` y ejecutar con el botón **Run** (`Shift + F10`).

### Ejecutar desde consola
1. Situarse en la raíz del proyecto y compilar los archivos fuente:
   ```bash
   javac -d out src/enemigos/*.java src/zonas/*.java src/Main.java
   ```
2. Ejecutar la clase principal:
   ```bash
   java -cp out Main
   ```

---

## Evidencia de ejecución
<img width="917" height="579" alt="{F3BFAC64-DAC3-41B9-880F-72CA5E78DC5D}" src="https://github.com/user-attachments/assets/553d74fb-5308-42fe-b91e-52d2af4b25e9" />

