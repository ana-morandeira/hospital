# Hospital Management System - POO & SOLID 🏥

Este proyecto es una simulación de la gestión de un hospital desarrollada en Java, diseñada siguiendo estrictamente el diagrama de clases de Draw.io. El objetivo es aplicar los pilares de la Programación Orientada a Objetos y los principios SOLID.

## 🚀 Requisitos y Arquitectura

* **Superclase Abstracta (`Characters`):** Actúa como la raíz de la jerarquía. Contiene los atributos protegidos/privados `id`, `firstName` y `lastName`.
* **Encapsulamiento:** Todos los atributos de las clases están definidos como `private` con sus respectivos `getters` y `setters`.
* **Herencia Directa:** Siguiendo el esquema técnico, las cuatro clases principales heredan directamente de `Characters`:
    * `SpecialistDoctor`
    * `StudentDoctor`
    * `ConsultationPatient`
    * `AmbulancePatient`
* **Interfaces (SOLID - Segregación de Interfaces):**
    * `IWorkable`: Implementada por los Doctores.
    * `IStandardCare`: Implementada por `ConsultationPatient`.
    * `IEmergencyCare`: Implementada por `AmbulancePatient`.
       
        <img width="616" height="412" alt="image" src="https://github.com/user-attachments/assets/fcd0df9f-d783-4260-bbb2-cee1d364b059" />
 

## 🛠️ Detalle de Clases

* **SpecialistDoctor:** Gestiona médicos especialistas con el atributo `specialty`.
* **StudentDoctor:** Gestiona médicos en formación con atributos de `studyHours` y `currentCourse`.
* **Pacientes:** Divididos según el tipo de atención (estándar o emergencias), cada uno implementando solo los métodos que le corresponden según el principio de SOLID.

## 💻 Ejecución y Pruebas
La clase `Main` instancia 8 objetos (2 de cada tipo) para demostrar el **Polimorfismo**, almacenándolos en una lista de tipo `Characters` y ejecutando sus métodos específicos.
