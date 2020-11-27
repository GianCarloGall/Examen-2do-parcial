
import java.util.*;
public class Principal{
    public static void main(String[] args){
        int e = 1, j = 1;
        do{ 
            Random Alt = new Random();
            Scanner in = new Scanner(System.in);
            String palabra = "";
            System.out.println("Vamos a jugar Ahorcados espero que te guste el juego:3");
            System.out.println("REGLAS");
            System.out.println("No puedes repetir la mis letra");
            System.out.println("Pasartela bien es una beta c:");
            int n = Alt.nextInt(19) + 1, opcion = 2, vidas = 6, adivinadas = 0, cont = 0, z = 0, x = 0;
            char letra = ' ';
            boolean yep = true;      
            if(n==1){
                palabra = "mundo";
            }
            if(n==2){
                palabra = "jimmy";
            }
            if(n==3){
                palabra = "java";
            }
            if(n==4){
                palabra = "hola";
            }
            if(n==5){
                palabra = "cadenas";
            }
            if(n==6){
                palabra = "clases";
            }
            if(n==7){
                palabra = "programa";
            }
            if(n==8){
                palabra = "batiz";
            }
            if(n==9){
                palabra = "programacion";
            }
            if(n==10){
                palabra = "documentacion";
            }
            if(n==11){
                palabra = "pseint";
            }
            if(n==12){
                palabra = "variables";
            }
            if(n==13){
                palabra = "condicion";
            }
            if(n==14){
                palabra = "herencia";
            }
            if(n==15){
                palabra = "encapsulamiento";
            }
            if(n==16){
                palabra = "calificacion";
            }
            if(n==17){
                palabra = "competencias";
            }
            if(n==18){
                palabra = "github";
            }
            if(n==19){
                palabra = "operaciones";
            }
            if(n==20){
                palabra = "logica";
            }
            System.out.println("La palabra secreta tiene "+palabra.length()+ " letras");
            for( x = 0; x < palabra.length(); x++){
                System.out.print("- ");
            }
            do{
                adivinadas += cont;
                System.out.println("\n_______________________________________________________________________________________________________________________________________________");
                System.out.println("\nTienes "+vidas+" vidas");
                System.out.println("Tu palabra que tienes que adivinar tiene " +palabra.length()+ " letras");
                z = palabra.length();
                z -= adivinadas;
                System.out.println("Y ya adivinaste " +adivinadas+" letras, te faltan "+z+" letras");
                System.out.println("\nEscribe una letra que creas que esta en la palabra secreta");
                for( x = 0; x < palabra.length(); x++){
                    System.out.print("- ");
                }
                System.out.println("\nSi te equivocas perderas una vida Suerte!");
                letra = in.next().charAt(0);
                cont = contarcaracteres(palabra , letra );
                yep = cont != 0;
                if(yep == true){
                    System.out.println("Esa letra esta "+cont+" veces en la palabra secreta");
                }else{
                    System.out.println("Pierdes 1 vida :c");
                    vidas -= 1;
                }
                if(z == 1){
                    System.out.println("Ya adivinaste todas las letras wow " +palabra);
                    vidas = 0;
                    j = 2;
                }
            }while(vidas > 0 );
            if(j == 1){
                System.out.println("Has perdido todas tus vidas la palabra era: " +palabra);
            }
            System.out.println("Quieres jugar de nuevo 1 = si o 2 = no");
            e = in.nextInt();
        }while(e == 1);
        System.out.println("Espero que te hayas divertido :3");
    }
    public static int contarcaracteres(String palabra, char letra){
        int pos = 0, contador = 0;
        pos = palabra.indexOf(letra);
        while(pos != -1){
            contador++;
            pos = palabra.indexOf(letra , pos + 1);
        }
        return contador;
    }
}