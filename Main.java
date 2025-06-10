package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int resp = 0;

        do{
            System.out.println("¿Qué area deseas saber?");
            System.out.println("------------------------");
            System.out.println("1.- Cuadrado");
            System.out.println("2.- Triangulo ");
            System.out.println("3.- Circulo");
            System.out.println("4.- Rectangulo");
            System.out.println("5.- salir");
            resp = leer.nextInt();
            switch(resp){
                case 1:
                    System.out.println("Ingresa el lado del cuadrado");
                    int lado_cuadrado = 0 ;
                    lado_cuadrado = leer.nextInt();
                    int total_cuadrado = lado_cuadrado * lado_cuadrado;
                    System.out.println("El area total es: " + total_cuadrado);
                    break;
                case 2:
                    System.out.println("Ingrese la base del triángulo");
                    int base_triangulo = 0;
                    base_triangulo = leer.nextInt();
                    System.out.println("Ingrese la altura del triángulo");
                    int altura_triangulo = 0;
                    altura_triangulo = leer.nextInt();
                    int total_triangulo = base_triangulo * altura_triangulo / 2;
                    System.out.println("El area total es: " + total_triangulo);
                    break;
                case 3:
                    System.out.println("Ingrese el radio del círculo");
                    int radio_circulo = 0;
                    radio_circulo = leer.nextInt();
                    double total_circulo = Math.PI * Math.pow(radio_circulo, 2);
                    System.out.println("El area total es: " + total_circulo);
                    break;
                case 4:
                    System.out.println("Ingrese el primer lado del rectangulo");
                    int lado1 = 0;
                    lado1 = leer.nextInt();
                    System.out.println("Ingrese el segundo lado del rectangulo");
                    int lado2 = 0;
                    lado2 = leer.nextInt();
                    int total = lado1 * lado2;
                    System.out.println("El area total es:" + total);

                    break;

                case 5:
                    System.out.println("Saliendo....");
                    break;

                default:
                    System.out.println("Numero no valido");
                    break;

            }
        }while(resp != 5);

    }
}
