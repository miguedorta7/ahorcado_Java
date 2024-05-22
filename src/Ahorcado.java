import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabraSecreta = "espacio";
        int intentosMaximos = 5;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //arreglos:
        char[] letraAdivinadas = new char[palabraSecreta.length()];

        for (int i = 0; i < letraAdivinadas.length; i++) {
            letraAdivinadas[i] = '_';
            System.out.println(letraAdivinadas[i]);

        }

        while (!palabraAdivinada && intentos < intentosMaximos){
            //Esto se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letraAdivinadas));
            System.out.println("Introduce una letra, por favor");
            //usamos la clase scanner para pedir una letra y el metodo charAr(0) que me devuelve la primera letra que escribe.
            char letra = Character.toLowerCase(scanner.next().charAt(0)) ;

            boolean letraCorrecta = false;
            for (int i = 0; i <palabraSecreta.length() ; i++) {
                if(palabraSecreta.charAt(i) == letra){
                    letraAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if(!letraCorrecta){
                intentos++;
                System.out.println("Incorrecto! te quedan " + (intentosMaximos-intentos)+" intentos.");
            }

            if (String.valueOf(letraAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta: " + palabraSecreta);
            }
        }
        if (!palabraAdivinada){
            System.out.println("Que pena te has quedado sin intentos GAME OVER");
        }

        scanner.close();
    }
}
