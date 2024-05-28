package ahorcado;

import java.util.Scanner;
public class ahorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones 
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos : 
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        
        //Estructura de control iterativa (BUCLE) 
        for(int i =0 ; i<letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
            System.out.print(" "+letrasAdivinadas[i]);
        }

        //Estructura de control : Iterativa (BUCLE)

        while(!palabraAdivinada && intentos < intentosMaximos){
    
                                //valueOF esto es cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas)+ " ()" + palabraSecreta.length() + " letras)");
            System.out.println("Introduce una letra por favor");
            
            //Usamos la clase scanner para pedir una letra
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            
            //Estructura de control : Iterativa (BUCLE)
            for (int i = 0; i < palabraSecreta.length(); i++) {
                //Estructura de control condicional .-
                if(palabraSecreta.charAt(i) ==letra){ //CharAt para recorrer letra por letra 
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true; 

                } 
            }


            if(!letraCorrecta){
                intentos++;
                System.out.println("¡Incorrecto! te quedan : "+ (intentosMaximos - intentos) + " Intentos.");
            }

            //Si la letra adivina es igual (EQUALS) a la palabra secreta
            if(String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta " + palabraSecreta );
            }
        }

        if(!palabraAdivinada){
            System.out.println("Que pena te has quedado sin intentos GAME OVER");
        }

        scanner.close();
    }
}