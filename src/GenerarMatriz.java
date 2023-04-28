import java.util.Scanner;

public class GenerarMatriz implements Determinantes{

    public void resolverEcuacion(){
        Scanner scanner =new Scanner(System.in);
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
        sacaX(matriz,C1,C2);
        sacaY(matriz,C1,C2);
    }
    @Override
    public void sacaX(double[][] matriz, double C1, double C2) {
        double mult1,mult2,div,resta1,resta2,mult11,mult22;
        mult1= C1 * matriz[1][1];
        mult2= C2 * matriz[0][1];
        resta1= mult1 -mult2;

        mult11 = matriz[0][0]*matriz[1][1];
        mult22 = matriz[1][0]*matriz[0][1];
        resta2= mult11 -mult22;

        div= resta1/resta2;
        System.out.println("El resultado es X :"+div);
    }

    @Override
    public void sacaY(double[][] matriz, double C1, double C2) {
        double mult1,mult2,div,resta1,resta2,mult11,mult22;

        mult1 = C2 * matriz[0][0];
        mult2 = C1 * matriz[1][0];
        resta1 = mult1 - mult2;

        mult11 = matriz[0][0] * matriz[1][1];
        mult22 = matriz[1][0] * matriz[0][1];
        resta2=mult11 - mult22;

        div =  resta1/resta2;
        System.out.println("El resultado de Y :"+div);
    }
}