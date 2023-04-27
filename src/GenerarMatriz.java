import java.util.Scanner;

public class GenerarMatriz{

    public void resolverEcuacion(){

        Scanner scanner =new Scanner(System.in);

        SacarXY sacarXY = new SacarXY();
        double C1,C2;

        System.out.println("Ingrese los valores de C1 : ");
        C1 = scanner.nextInt();
        System.out.println("Ingrese los valores de C2: ");
        C2 = scanner.nextInt();
        double[][] matriz = new double[2][2];
        for (int i=0;i<2;i++){
            for (int j=0; j<2;j++){
                System.out.println("Ingrese los valores de x : ");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        sacarXY.sacaX(matriz,C1,C2);
        sacarXY.sacaY(matriz,C1,C2);
    }
}
