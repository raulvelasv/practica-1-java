package ejercicios_de_clase;

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){
        //creo un scaner para poder introducir datos
        Scanner dato = new Scanner(System.in);
        int opcion;
        boolean salir = false;
        //Elaboro el menu con un while
        while (salir == false){
            System.out.println("1. Leer 5 números y mostrarlos en el mismo orden introducido.");
            System.out.println("2. Leer 5 números y mostrarlos en orden inverso.");
            System.out.println("3. Leer 5 números por teclado y a continuación realizar la media de los números positivos, la media de los negativos y contar el número de ceros que se han introducido por teclado.");
            System.out.println("4. Reciba como parámetro un texto y devuelva la cantidad de caracteres que incorpora el texto.");
            System.out.println("5. Escriba un texto y le devolveré el texto invertido.");
            System.out.println("6. Escriba un texto y lo devolveré sin espacios en blancos.");
            System.out.println("7. Introduzca dos cadena y las devolveré concatenadas.");
            System.out.println("8. Introduzca una cadena y una vocal y sustituiré todas las vocales del la cadena por la vocal introducida.");
            System.out.println("9. Introduzca una cadena y le mostraré el código ASCII de cada uno de los caracteres de la cadena.");
            System.out.println("0. Salir.");
            System.out.print("Inserte un número para elegir una opción: ");
            //pido que escriba un entero por teclado
            opcion = dato.nextInt();
            //Utilizo un switch para meterse en las opciones
            switch(opcion){
                case 1:
                    System.out.println("Opción 1");
                    opcion1();
                    break;
                case 2:
                    System.out.println("Opción 2");
                    opcion2();
                    break;
                case 3:
                    System.out.println("Opción 3");
                    opcion3();
                    break;
                case 4:
                    System.out.println("Opción 4");
                    dato.nextLine();
                    System.out.print("Introduce un texto: ");
                    String textousuario1 = dato.nextLine();
                    System.out.print("Este texto contiene "+contadorDeCaracter(textousuario1) + " caracteres.");
                    break;                
                case 5:
                    System.out.println("Opción 5");
                    dato.nextLine();
                    System.out.print("Introduce un texto: ");
                    String textousuario2 = dato.nextLine();
                    System.out.print(textoInvertido(textousuario2));
                    break;
                case 6:
                    System.out.println("Opción6");
                    dato.nextLine();
                    System.out.print("Introduce un texto: ");
                    String textousuario3 = dato.nextLine();
                    System.out.println("Este es el texto sin espacios: "+quitaEspacios(textousuario3));
                    break;
                case 7:
                    System.out.println("Opción 7");
                    System.out.print("Escribe la primera cadena: ");
                    Scanner scancadena0= new Scanner(System.in);
                    String cadenausuario1 = scancadena0.nextLine();
                    System.out.print("Escribe la segunda cadena: ");
                    Scanner scancadena1 = new Scanner(System.in);
                    String cadenausuario2 = scancadena1.nextLine();
                    System.out.print("Está son las dos cadenas concatenadas: " + concatenarCad(cadenausuario1,cadenausuario2));
                    break;
                case 8:
                    System.out.println("Opción 8");
                    System.out.print("Introduzca una cadena: ");
                    Scanner scancadena2= new Scanner(System.in);
                    String cadenaUsuario = scancadena2.nextLine();
                    System.out.print("Introduce una vocal: ");
                    Scanner scanVocal= new Scanner(System.in);
                    String vocalUsuario = scanVocal.nextLine();
                    cambioVocal(cadenaUsuario,vocalUsuario);
                    break;
                case 9:
                    System.out.println("Opción 9");
                    System.out.print("Escribe un texto: ");
                    dato.nextLine();
                    String textoASCII = dato.nextLine();
                    codigoASCII(textoASCII);
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.print("Inserte un número del 1 al 8.");
                    break;
            }
            System.out.println("\n");
        System.out.print("");
        }
        System.out.print("Has salido del programa. Gracias");
    }
    public static void opcion1() {
        //creo un nuevo scanner para la opcion1
        Scanner scan = new Scanner(System.in);
        //creo un array de tamaño de 5 elementos
        int[] numeros = new int[5];
        //Utilizo un for para ir pidiendo los los numeros del array
        for(int i = 0;i<5;i++){
            System.out.print("Introduce el "+(i+1)+"º número: ");
            numeros[i] = scan.nextInt();
        }
        //Utilizo un for para imprimir todos lo elementos de la lista
        System.out.println("Los números introducidos son:");
        for(int i = 0;i<5;i++){
            System.out.print(numeros[i]+" ");
        }
        
    

    } 
    public static void opcion2(){
        //Creo un nuevo scanner para la opcion2
        Scanner scan =  new Scanner(System.in);
        //creo un array de tamaño de 5 elementos
        int[] numeros = new int[5];
        //Utilizo un for para ir pidiendo los los numeros del array
        for(int i = 0; i<5;i++){
            System.out.print("Introduce el "+(i+1)+"º número: ");
            numeros[i]=scan.nextInt();
        }   
        //Utilizo un for para imprimir todos lo elementos de la lista por orden inverso
        System.out.print("Los números introducidos por orden inverso son: ");
        for (int i = 4;i>=0;i--){
            System.out.print(numeros[i]+" ");
        }
    }
    //creo un método
    public static void opcion3(){
        //creo un nuevo scanner para la opcion3
        Scanner scan = new Scanner(System.in);
        //creo un array de tamaño de 5 elementos
        float [] numeros = new float[5];
        //creo las variables suma_positivos, suma_negativos, contador_de_ceros, contador_de_positivos y contador_de_negativos
        float suma_positivos = 0;
        float suma_negativos = 0;
        int contador_de_ceros = 0;
        int contador_de_positivos = 0;
        int contador_de_negativos = 0; 
        //Utilizo un for para ir pidiendo los los numeros del array
        //y vaya sumando los contadores en caso de que sean positivos, negativos o zeros
        
        for(int i=0;i<5;i++){
            System.out.print("Introduce el "+(i+1)+"º número: ");
            numeros[i] = scan.nextFloat();
            if(numeros[i]>0){
                suma_positivos+=numeros[i];
                contador_de_positivos++;
            }    
            else if(numeros[i]<0){
                suma_negativos+=numeros[i];
                contador_de_negativos++;
            }
            else{
                contador_de_ceros++;
            }
        }
        //imprimo las medias de los números positivos , negativos y los ceros en caso de que sus contadores sea mayor que 0 excepto el contador de 0
        if(contador_de_positivos>0){
        System.out.println("La media de los números positivos es: "+(suma_positivos/contador_de_positivos));
        }
        if(contador_de_negativos>0){
            System.out.println("La media de los números negativos es: "+(suma_negativos/contador_de_negativos));
        }
        System.out.println("El número de ceros introducidos es: "+ contador_de_ceros);
    }
    //Paso de parámetros
    public static int contadorDeCaracter(String texto){
        return texto.length();
    }
    
    //Paso de parámetros
    public static String textoInvertido(String texto){
        String textoi = "";
        for(int i=texto.length()-1;i >=0;i--){
            textoi += texto.charAt(i); 
        }
        return textoi;
    }
    //Paso de parámetros
    public static String quitaEspacios(String texto){
        //declaro el textoSinEspacios
        String textoSinEspacios = "";
        //Utilizo un for para recorrer el texto y en caso de que los caracteres 
        //sean diferentes de un espacio lo concateno al textoSinEspacio
        for(int i = 0;i<texto.length(); i++){
            
            if(texto.charAt(i) != ' '){
                textoSinEspacios+=texto.charAt(i);
            } 
        }

        return textoSinEspacios;
    }
    //Paso de parámetros
    public static String concatenarCad(String cadena1,String cadena2){
        //concateno las cadena con la suma
        return cadena1+cadena2;
    }
    public static void cambioVocal(String cadena,String vocal){

        String textoVocalCambiada="";
        for(int i = 0;i < cadena.length();i++){
            if (cadena.charAt(i)=='a' || cadena.charAt(i)=='e'|| cadena.charAt(i)=='i' || cadena.charAt(i)=='o'||
            cadena.charAt(i)=='u'|| cadena.charAt(i)=='A'|| cadena.charAt(i)=='E'|| cadena.charAt(i)=='I'||
            cadena.charAt(i)=='O'|| cadena.charAt(i)=='U'){
                textoVocalCambiada+=vocal;
            }
            else{
                textoVocalCambiada+=cadena.charAt(i);
            }
        
        }
        System.out.println("Esta es la cadena con las vocales remplazada por la vocal que has introducido: \n"+textoVocalCambiada);
    }
    public static void codigoASCII(String texto) {
        String cadenaASCII = "";
        //Utilizo un for para rocorrer toda la cadena y cambiar cada carácter por su ASCII
        for (int i = 0; i < texto.length(); i++) {
            int valorASCII = texto.charAt(i);
            cadenaASCII += valorASCII + " ";
        }
        System.out.println("El texto en ASCII es: " + cadenaASCII);
    }
}