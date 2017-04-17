
package clases;


public class Preguntas {
    
    String[] preguntas = {
        "¿Define  JDBC?",
        "¿Que es la orientacion a objetos?", 
        "¿Que es el Encapsulamiento?",
        "¿Que es una clase?", 
        "¿Que es el polimorfismo?",
        "¿Que es la herencia?",
        "¿Define JDK?",
        "¿Que es un Thread?",
        "¿Que es DAO en JAVA?",
        "¿Que es un ArrayList?",
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
