En este archivo vamos a exponer los arreglos, de cada uno de los principios SOLID -> 

## 🧩 EXPLICACIÓ - Dependency Inversion Principle

### ❌ Què estava malament?

La classe `ServicePerson` depenia directament de la classe concreta `MySqlPersonRepository`, ja que creava la seva instància amb `new`. Això generava un alt acoblament entre la lògica de negoci i la capa de persistència.

---

### ⚠️ Per què incomplia el principi?

Incomplia el principi d’Inversió de Dependències (D), ja que una classe d’alt nivell (`ServicePerson`) depenia d’una classe concreta en lloc d’una abstracció. Això fa que el codi sigui poc flexible i difícil d’extendre, ja que qualsevol canvi en la forma d’emmagatzemar dades obliga a modificar aquesta classe.

---

### ✅ Quina solució has aplicat i per què?

S’ha creat una interfície `PersonRepository` que defineix el mètode per guardar persones. La classe `MySqlPersonRepository` implementa aquesta interfície.

La classe `ServicePerson` ara rep un objecte de tipus `PersonRepository` mitjançant el constructor (injecció de dependències) i el guarda com a atribut. D’aquesta manera, `ServicePerson` depèn d’una abstracció i no d’una implementació concreta.

Això permet canviar fàcilment la tecnologia de persistència (per exemple, MySQL, MongoDB, etc.) sense modificar la lògica de negoci, fent el codi més flexible, escalable i mantenible.

La clase ServicePerson depende directamente de la implementación concreta MySql, 
en lugar de depender de una abstracción, lo que genera un alto acoplamiento y dificulta la extensibilidad del sistema.
Aunque el sistema utiliza MySQL como base de datos, la clase ServicePerson no debería depender directamente de esta implementación concreta. En su lugar, 
debería depender de una abstracción que permita cambiar la tecnología de persistencia sin modificar la lógica de negocio.
En el método main se crea la implementación concreta (MySqlPersonRepository) y se asigna a una variable de tipo PersonRepository. Esta se pasa al constructor de ServicePerson, permitiendo desacoplar la lógica de negocio de la implementación concreta.

## 🧩 EXPLICACIÓ - SRP -> Single Responsibility Principle

# ❌ Antes: User hacía demasiadas cosas
# 🔍 Problema: múltiples responsabilidades → múltiples motivos de cambio
# ✅ Solución: separar en UserValidator y UserConfirmationService
# 🎯 Resultado: código más claro, modular y mantenible
