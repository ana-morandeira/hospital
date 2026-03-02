# 🏥 Hospital Management System - POO & SOLID

Este proyecto es una simulación avanzada de la gestión de un hospital desarrollada en Java, diseñada para aplicar los pilares de la Programación Orientada a Objetos y los principios SOLID.

## 📐 Arquitectura del Sistema

El sistema sigue una estructura jerárquica de **tres niveles**, garantizando una abstracción clara y una herencia eficiente:

### 1. Jerarquía de Clases
* **Nivel 1: `Characters` (Superclase Abstracta):** Contiene los atributos privados comunes `id`, `firstName` y `lastName` con sus respectivos Getters y Setters.
* **Nivel 2: Especialización por Rol:** * `Doctor`: Clase abstracta que agrupa a los profesionales médicos.
    * `Patient`: Clase abstracta que sirve de base para todos los pacientes.
* **Nivel 3: Clases Finales:** * **Médicos:** `SpecialistDoctor` (con especialidad) y `StudentDoctor` (con horas de estudio y curso).
    * **Pacientes:** `ConsultationPatient` (atención estándar) y `AmbulancePatient` (atención de emergencias).

### 2. Principios SOLID e Interfaces
Se ha aplicado la **Segregación de Interfaces (ISP)** para asegurar que cada clase implemente solo los métodos que le corresponden:

| Interfaz | Métodos Principales | Aplicada a |
| :--- | :--- | :--- |
| **`IWorkable`** | `workHoursPerWeek`, `eat`, `vacations` | Doctores |
| **`IStandardCare`** | `admission`, `nurseControl`, `room`, `treatment`, `nextAppointment`, `discharge` | Pacientes de Consulta |
| **`IEmergencyCare`** | `admission`, `operation`, `room`, `treatment`, `rehabilitation`, `discharge` | Pacientes de Emergencia |

## 📊 Diagrama de Clases (UML)

La estructura visual del proyecto se basa en el siguiente diseño realizado en Draw.io:

<img width="550" height="425" alt="DiagramaHospital" src="https://github.com/user-attachments/assets/f5a04783-a090-4cd0-bd4e-457b64736bb7" />


---

## 🚀 Ejecución y Demostración de Polimorfismo

La clase `Main` del proyecto ha sido diseñada para validar la robustez de la arquitectura mediante las siguientes acciones técnicas:

### 1. Gestión de Colecciones
* Se utiliza una `List<Characters>` para almacenar todos los objetos del hospital.
* Esto demuestra el principio de **Sustitución de Liskov**, permitiendo que cualquier subclase de nivel 3 (médicos o pacientes) sea tratada como la superclase `Characters`.

### 2. Validación de Objetos (8 Instancias)
Para cumplir con los requisitos del hospital, se instancian:
* **2 SpecialistDoctor:** Validando métodos de `IWorkable` y su especialidad.
* **2 StudentDoctor:** Validando sus horas de estudio y curso actual.
* **2 ConsultationPatient:** Recorriendo el flujo de `IStandardCare` (admisión y próxima cita).
* **2 AmbulancePatient:** Ejecutando el flujo de `IEmergencyCare` (operación y rehabilitación).

### 3. Salida de Datos y Encapsulamiento
* Toda la impresión en pantalla se realiza accediendo a los atributos a través de **Getters** públicos, respetando el modificador `private` definido en el diagrama.
* Se aplican bucles para iterar sobre la lista, ejecutando los comportamientos específicos mediante la sobreescritura de métodos (Override).
