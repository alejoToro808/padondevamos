package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarando los datos de entrada

        String ubicacionUsuario;
        String destino;
        String nombreUsuario;
        String telefonoUsuario;

        //Declarar un dato especial para recibir, capturar informacion desde el teclado

        Scanner teclado = new Scanner(System.in);


        //Inicializar las variables
        System.out.println("\u001B[36m Pa donde vamos  \u001B[0m");

        System.out.print("Digite su ubicacion: ");
        ubicacionUsuario=teclado.nextLine();

        System.out.print("Digite su destino: ");
        destino=teclado.nextLine();

        System.out.print("Digite su nombre: ");
        nombreUsuario=teclado.nextLine();

        System.out.print("Digite su telefono: ");
        telefonoUsuario=teclado.nextLine();

        //Proceso del problema

        String distancia="20";//Esto es un texto
        //Debo hacer parseo de la variable distancia
        //PARSEO= CAMBIAR O MODIFICAR EL TIPO DE DATO DE UNA VARIABLE
        Integer distanciaEnEntero=Integer.parseInt(distancia);

        Integer costoPorKilometro=6800;
        Integer cobroTotal=distanciaEnEntero*costoPorKilometro;

        //Salidas del problema
        System.out.println("\u001B[35m Señor usuario:"+nombreUsuario+"\u001B[0m");

        System.out.println("\u001B[35m El costo de su viaje es: $"+cobroTotal+" Pesos\u001B[0m");
        


    }
}