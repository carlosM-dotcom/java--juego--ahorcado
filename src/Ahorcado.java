import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner Scanner = new Scanner(System.in);

        String palabraSercreta = "arepa";
        int intentosMaximos = 10 ;
        int intentos = 0 ;
        boolean PalabrasAdivinadas = false ;

        char[] letrasAdivinadas = new char[palabraSercreta.length()];

        for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i] = '_';
    }
        
        while (!PalabrasAdivinadas && intentos < intentosMaximos) {

            System.out.println(" Palabras a advinar : "+ String.valueOf(letrasAdivinadas)+ " ("+ palabraSercreta.length()+ " letras)");

            System.out.println("Introduce una letra , Por favor");

        char letra = Character.toLowerCase(Scanner.next().charAt(0));

        boolean letrasCorrecta = false;

        for (int i = 0; i < palabraSercreta.length(); i++) {
            if (palabraSercreta.charAt(i)== letra) {
                letrasAdivinadas [i] = letra;
                letrasCorrecta = true ;

                
            }
        }
            if (!letrasCorrecta) {
            intentos++;
            System.out.println("¡Incorrecto! Te quedan " + ( intentosMaximos - intentos ) + "intentos.") ;

            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSercreta)) {
                PalabrasAdivinadas = true;
                System.out.println("¡Felicidades , has adivinado la palabra sercreta: + palabraSercreta");


                
            }


        }
            if (!PalabrasAdivinadas) 
                System.out.println("¡Que pena te has quedado sin Intentos! GAME OVER");

                Scanner.close();
        }

    }
