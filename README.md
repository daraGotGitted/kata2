# Kata 2 - Entrada, salida y carga de datos

## Objetivo de la entrega
La Kata 2 consiste en un programa que aproveche las clases InputStream y OutputStream de Java para la lectura de un conjunto de datos CSV desde fuentes locales (FileInputStream) y en línea (URLOpenStream).

Seguido de la lectura se ofrecen funciones de manipulación y exportación de los datos extraídos en forma de salida estándar o archivo.

## Cómo compilar y ejecutar
El proyecto está pensado para ser abierto y compilado desde Intellij Idea siguiendo su configuración por defecto.

Para la ejecución, se puede optar igualmente por Intellij Idea o, desde el fichero raíz del proyecto, ejecutar
`java -classpath out/production/k2/ Main`
Respetando la versión JDK

## Dependencias y versión de JDK
JDK Version 27

Sin dependencias externas

## Estructura de la entrega y clases principales
- src
  - software
    - ulpgc
      - Laptop | Define un objeto Laptop con manufactura, modelo y precio.
      - LaptopLoader | Define una interfaz para el manejo de streams sobre objetos Laptop.
      - LaptopLoaderFromFile | Implementación de la interfaz LaptopLoader orientada a archivos.
      - LaptopLoaderFromURL | Implementación de la interfaz LaptopLoader orientada a URL's.
  - Main | Clase principal estándar de un programa Java. ejecuta los métodos de las clases anteriores. 

## Enlace al vídeo explicativo de máximo 7 minutos
## Descripción breve de cómo se repitió la kata y qué variación pequeña se introdujo, si la hubo
Como primera repetición de la Kata, se ha optado por una forma alternativa de tratar errores a la inicialmente propuesta. De esta forma se consigue un código más limpio,

Como segunda repetición de la Kata, se añade el método default rawData que obtiene un ByteArrayOutputStream y devuelve una String con los datos crudos leídos.

## Evidencias de verificación o pruebas realizadas
