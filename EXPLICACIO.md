En este archivo vamos a exponer los arreglos, de cada uno de los principios SOLID -> 
En la D -> La class MySql -> esta mal escrita y deberia ser MySQL. En ServicePerson lo mismo hay que cambiar todo lo que pone como MySql -> MySQL.
La clase ServicePerson depende directamente de la implementación concreta MySql, 
en lugar de depender de una abstracción, lo que genera un alto acoplamiento y dificulta la extensibilidad del sistema.
Aunque el sistema utiliza MySQL como base de datos, la clase ServicePerson no debería depender directamente de esta implementación concreta. En su lugar, 
debería depender de una abstracción que permita cambiar la tecnología de persistencia sin modificar la lógica de negocio.
