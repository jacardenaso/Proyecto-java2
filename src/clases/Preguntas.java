
package clases;


public class Preguntas {
    
    String[] preguntas = {
        "¿Define  JDBC?",
        "¿Pregunta 2?", "¿Pregunta 3?",
        "¿Pregunta 4?", "¿Pregunta 5?"
    };
    
   public String getPregunta(int posicion){
        return preguntas[posicion];
    }
    
}
