
package clases;

import java.util.StringTokenizer;

public class Respuestas {

    String[] respuestas = {
      "Es una API que permite la ejecución de operaciones sobre bases de datos desde el lenguaje de programación Java",
        "Es una forma de pensar y resolver problemas",
        "Mecanismo que consiste en organizar datos y métodos de una estructura",
        "Son declaraciones de objetos",
        "Indica la posibilidad de definir varias operaciones con el mismo nombre",
        "Propagacion de los atributos y las operaciones a traves de distintas sub-clases definidas apartir de una clase en comun",
        "Java Development Kit software que provee herramientas de desarrollo para la creación de programas en Java.",
        "Es una tarea que se ejecuta paralelamente con todos los sistemas",
        "Data Access Object  componente de software que suministra una interfaz común entre la aplicación y uno o más dispositivos de almacenamiento de datos",
        "Construye una lista vacia con una capacidad inicial de diez"
    };
    
    String[] radioR = {
               
                       // "¿Define  JDBC?",
                    //Es una API que permite la ejecución de operaciones sobre bases de datos desde el lenguaje de programación Java",
               "Es una API que permite la ejecución de operaciones sobre bases de datos desde el lenguaje de programación Java,"
            + "Controlador rutina o programa que enlaza un dispositivo periférico al sistema operativo,"
            + "Base de datos no SQL,"
            + "Conjunto de elementos físicos o materiales que constituyen una computadora o un sistema informático",
                     // "¿Que es la orientacion a objetos?", 
                    //"Es una forma de pensar y resolver problemas",
               "Es una forma de pensar y resolver problemas,"
            + "Es un paradigma de programación en el que tanto la estructura como la ejecución de los programas ,"
            + "Estrategia de comunicación desarrollo personal y psicoterapia creada por Richard Bandler y John Grinder en California,"
            + "Unidad dentro de un programa de computadora que consta de un estado y de un comportamiento",
                //"¿Que es el Encapsulamiento?",
                // Mecanismo que consiste en organizar datos y métodos de una estructura
                " Mecanismo que consiste en organizar datos y métodos de una estructura,"
            + "Contiene caracteristicas definidas de un objeto y no contiene operaciones logicas,"
            + "Lenguaje de programacion para computadoras,"
            + "Aplicacion especial que se ejecuta dentro de un navegador",
                     //"¿Que es una clase?", 
                   // "Son declaraciones de objetos"
                "Son declaraciones de objetos"
            + ",Todo objeto puede tener cierto numero de propiedades,"
            + "Operacion que realiza acceso a los datos,"
            + "Se encarga de mantener ocultos los procesos internos que necesita para hacer lo que sea",
                  //"¿Que es el polimorfismo?",
                 //"Indica la posibilidad de definir varias operaciones con el mismo nombre,"
               "Indica la posibilidad de definir varias operaciones con el mismo nombre,"
            + "Se encarga de mantener ocultos los procesos internos,"
            + "Cada vez que creamos una nueva instancia,"
            + "Nos permite crear estructuras jerarquicas de clases",
                 //"¿Que es la herencia?",
                //"Propagacion de los atributos y las operaciones a traves de distintas sub-clases definidas apartir de una clase en comun"
               "Propagacion de los atributos y las operaciones a traves de distintas sub-clases definidas apartir de una clase en comun"
            + ",Se encarga  de mantener ocultos  los procesos internos"
            + ",Se encarga de mantener ocultos los procesos internos"
            + ",Unidad dentro de un programa de computadora que consta de un estado y de un comportamiento",
                    //"¿Define JDK?",
                    //"Java Development Kit software que provee herramientas de desarrollo para la creación de programas en Java."
               "Java Development Kit software que provee herramientas de desarrollo para la creación de programas en Java."
            + ",Es una API que permite la ejecución de operaciones sobre bases de datos desde el lenguaje de programación Java,"
            + "Propagacion de los atributos y las operaciones a traves de distintas sub-clases definidas apartir de una clase en comun,"
            + "Plataforma para el desarrollo de aplicaciones de escritorio usando JAVA y a un entorno de desarrollo integral(IDE)",
               
               //"Que es un Thread",
               //  "Es una tarea que se ejecuta paralelamente con todos los sistemas ,"
               "Es una tarea que se ejecuta paralelamente con todos los sistemas ,"
            + "Conjunto de procesos de concurrentemente trabajan,"
            + "Incompatibilidad de tipos de datos ,"
            + "Se tiene referencia a una instancia de un objeto",
               
               
               //  "Que es DAO en JAVA",
               //Data Access Object  componente de software que suministra una interfaz común entre la aplicación y uno o más dispositivos de almacenamiento de datos
               "Data Access Object  componente de software que suministra una interfaz común entre la aplicación y uno o más dispositivos de almacenamiento de datos,"
            + "Evalua una condicion,"
            + "Es un atributo  de una parte de los datos  que indica al ordenador algo sobre la clase de datos sobre los que se va a procesar ,"
            + "Es una tarea que se ejecuta paralelamente con todos los sistemas",
               
               //Que es un ArrayList
               //      "Construye una lista vacia con una capacidad inicial de diez,"
               "Construye una lista vacia con una capacidad inicial de diez,"
            + "Conjunto de procesos de concurrentemente trabajan,"
            + "Se tiene una referencia a una instancia de un objeto ,"
            + "Es una tarea que se ejecuta paralelamente con todos los sistemas"
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
        
        String[] a = new String[4];
        int i = 0;
        
        while(token.hasMoreTokens()){
            a[i] = token.nextToken(); // obtenido el token
            i++;
        }
        
        return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = radioR[posicion];
        String[] s2 = separar(s1,",");
        return s2;
    }
    
}
