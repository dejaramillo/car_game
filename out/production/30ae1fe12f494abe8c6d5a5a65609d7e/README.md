# CHALLENGE - JUEGO DE CARROS POR CONSOLA - GRUPO A #

## Summary ##

En este reto vamos a modelar un concurso de carros, donde vamos a tener ciertas reglas del juego. Para este reto es necesario tener los conocimientos básicos de Java/C\# usando el paradigma de programación orientada a objetos. Esto implica conocer de modelamiento de objetos, ademas se deberá guarda en base de datos los resultados del juego.

Dentro del reto se debe considera lo siguiente:

 *   Manejo de clases u objetos
 *   Persistencia de datos
 *   Manejos de listas o colecciones
 *   Conocimiento de Java o C\#
 *   Manejo de Git (versión de control)

  


Solo aplique al reto si te siente capaz de hacerlo.

¡Buena suerte!

## Use Case/Problem ##

Lo que se busca en este **juego** es crear unos **carros** y posicionarlo en una **pista** (cada carro tiene un **conductor**), puede existir tantos **carros** como **carriles**, cada pista deberá tener el mismo **limite de distancia** (kilómetros) para el recorrido del **carro**, los carros **avanzan de forma aleatoria** aumentado su **distancia** por medio de **metros** (los kilómetros de debe convertir a metros para que el avance sea en metros)

  


Cada avance debe existir un **dado** (de 1 a 6) que permita mover el **carro** y se debe multiplicar por 100, donde si se tira el dado y sacas 5 entonces debería ser 5\*100 = 500 metros de recorrido.

  


Al final debe existir un **podio** donde se clasifique **primer**, **segundo** y **tercer ganador**.

  


## Funcionalidades ##

  


 *  **Configurar Juego**\: Crear juego con jugadores, el juego debe tener los limites de kilómetros por cada pista (un jugador puede ser un conductor y un conductor debe tener un carro asociado y un carro debe estar asociado a un carril que a su vez debe estar en una pista)
 *  **Iniciar el jueg**o: iniciar con un identificado del juego, se debe tener la lista de carros en donde se pueda iterar y avanzar según la posición de la pista o carril, esto debe ser de forma aleatoria (por medio del dado).
 *  **Asignar podio (fin del juego)**\: Se debe seleccionar primer, segundo y tercer lugar en la medida que los carros llegan a la meta (asignar al podio).
 *  **Guardar datos**\: Se debe persistir los resultados con los nombres de los conductores en la posición del podio y agregar un contador de las veces que ha ganado.

## Evaluation criteria ##

| Criteria                                                                                 | Percentage |
| ---------------------------------------------------------------------------------------- | ---------- |
| Aplica los principios de programación orientada a objetos                                | 31.0 %     |
| Realiza la persistencia de los resultados obtenidos de los ganadores                     | 31.0 %     |
| Creación de objetos de entidades; pista, juego, carril, carro, conductor, jugador, podio | 30.0 %     |
| Métodos con menos de 6 lineas de código                                                  | 8.0 %      |