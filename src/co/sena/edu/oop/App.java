package co.sena.edu.oop;
import java.util.Scanner;
public class App {
 public static void main(String[] args){
     Scanner src = new Scanner(System.in);
     double numero1 = 0;
     double numero2 = 0;
     double numero3 = 0;
     float area, perimetro,lado;

     int opcion;


     Data data =new Data();



     System.out.println("Miselanea de Ejercicios OOP Java");
     System.out.println("----------------------------------");
     System.out.println("Menu Principal");
     System.out.println("1.Operadores");
     System.out.println("2.Condicionales");
     System.out.println("3.Ciclos");
     System.out.println("99. Salir");
     System.out.println("Digite una opcion:");

     opcion = src.nextInt();

     switch (opcion) {
         case 1: {
             // Categorias
             System.out.println("Categoria Operadores");
             System.out.println("1.Calcular área triángulo");
             System.out.println("2.Sumar dos números");
             System.out.println("3.Numero elevado al cuadrado");
             System.out.println("4.Conversion de Euro a Dolar");
             System.out.println("5.Area y Perimetro del Cuadrado");
             System.out.println("6.Area y Volumen de un Cilindro");
             System.out.println("7.Algoritmo de una Circunferencia");
             System.out.println("8.Promedio de tres Numeros");

             System.out.println("Digite una opcion:");
             opcion = src.nextInt();

             // sub categoria area triangulo
             switch (opcion) {
                 case 1: {
                     System.out.println("--------------------");
                     System.out.println("Calcular el área de un triángulo");
                     System.out.println("Ingrese la base");
                     numero1 = src.nextDouble();
                     System.out.println("Ingrese la altura");
                     numero2 = src.nextDouble();
                     System.out.println("El área del triángulo es:" + data.areaTriangulo(numero1, numero2));
                 }
                 ;
                 break;
                 case 2: {
                     // Sub menu Suma
                     System.out.println("--------------------");
                     System.out.println("Sumar dos números");
                     System.out.println("1.Ingrese el primer número");
                     numero1 = src.nextDouble();
                     System.out.println("2.Ingrese el segundo numero");
                     numero2 = src.nextDouble();

                     System.out.println("El resultado de la suma es:" + (numero1 + numero2));

                 }
                 ;
                 break;
                 case 3: {
                     // Sub menu numero elevado al cuadrado

                     System.out.println("--------------------");
                     System.out.println("Numero elevado al cuadrado");
                     System.out.println("Ingrese el número");
                     numero1 = src.nextDouble();
                     System.out.println("El número elevado al cuadrado es:" + Math.pow(numero1, 2));
                 }
                 ;
                 break;
                 case 4: {
                     // Sub menu Conversion de Euro a D

                     System.out.println("--------------------");
                     System.out.println("Conversion de Euro a Dolar");
                     System.out.println("Ingrese el Valor");
                     numero1 = src.nextDouble();
                     System.out.println("El Valor convertido a Dolar es:" + (numero1 * 1.08));
                 }
                 ;
                 break;
                 case 5: {
                     // Sub menu Area y Perimetro del Cuadrado

                     System.out.println("--------------------");
                     System.out.println("Area y Perimetro del Cuadrado");
                     System.out.println("Ingrese el valor del lado");
                     lado = src.nextFloat();
                     System.out.println("El área del cuadrado es:" + (lado * lado));
                     System.out.println("El perímetro del cuadrado es:" + (4 * lado));
                 }
                 ;
                 break;
                 case 6: {
                     // Sub menu Area y Volumen de un Cilindro

                     System.out.println("--------------------");
                     System.out.println("Area y Volumen de un Cilindro");
                     System.out.println("Ingrese el valor del lado");
                     lado = src.nextFloat();
                     System.out.println("El área del cilindro es:" + (lado * lado));
                     System.out.println("El volumen del cilindro es:" + (Math.PI * Math.pow(lado, 2)));
                 }
                 ;
                 break;
                 default: {
                     System.out.println("Opcion no valida");
                 };
             };
         };
         break;
         case 2:{

             System.out.println("Categoria Condicionales");
         };
         break;
         case 3:{
             System.out.println("Categoria Ciclos");
         };
         break;
         case 99:{
             System.out.println("Salir del sistema");
         };
         break;
         default:{
             System.out.println("Opción no valida");
         }

     }



















     // Sub menu Algoritmo de una Circunferencia

     //System.out.println("--------------------");
     //System.out.println("Algoritmo de una Circunferencia");
     //System.out.println("Ingrese el valor del radio");
     //lado = src.nextFloat();












 }



}
