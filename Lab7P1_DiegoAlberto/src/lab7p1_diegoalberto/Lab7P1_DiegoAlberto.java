package lab7p1_diegoalberto;

import java.util.Scanner;
import java.util.Random;

public class Lab7P1_DiegoAlberto {

    static Scanner sc = new Scanner(System.in);
    static Random ran = new Random();

    public static void main(String[] args) {
        System.out.println("IINgrese una opcion");
       
        menu();
         int opcion = sc.nextInt();
        while (opcion != 3) {
            switch (opcion) {

                case 1: {
                    System.out.println("Ingrse el numero de filas");
                    int filas = sc.nextInt();
                    System.out.println("Ingrese el numero de columnas");
                    int colum = sc.nextInt();

                    int mult = filas * colum;

                    while (mult >= 87) {
                        System.out.println("Numero matrix invalida");
                        System.out.println("Ingrese valores validos");
                        System.out.println("Ingrse el numero de filas");
                        filas = sc.nextInt();
                        System.out.println("Ingrese el numero de columnas");
                        colum = sc.nextInt();

                        mult = filas * colum;

                    }

                    int n = filas;
                    int m = colum;
                    int[][] matrix = new int[n][m];

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[0].length; j++) {
                            int rgn = 1 + ran.nextInt(filas * colum);

                            System.out.print("[" + rgn + "]");

                        }
                        System.out.println();

                    }

                }
                break;
                case 2: {
                    int filas = 5;
                    int colum = 5;
                    int n = filas;
                    int m = colum;
                    int[][] matrix = new int[n][m];

                    for (int i = 0; i < matrix.length; i++) {
                        for (int j = 0; j < matrix[0].length; j++) {
                            

                            System.out.print("[" + n +""+ m + "]");

                        }

                        System.out.println();

                    }
                    break;
                }
                case 3: {
                    System.out.println("Gacias :v");
                    break;
                }
                default:
                    break;
            }

        }

    }

    static void menu() {
       // int opcion = 0;
        System.out.println("1.She shoot, she scores");
        System.out.println("2.Pierda, papel o ...");
        System.out.println("3.Salir");
       // opcion = sc.nextInt();

    }

    static boolean verificar(int[][] mat, int num) {
        boolean esta = false;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (num == mat[i][j]) {
                    esta = false;

                }

            }

        }
        return esta;

    }

}
