public class SacarXY {
        public void sacaX(double matriz[][],double C1,double C2){
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

        public void sacaY(double matriz[][],double C1,double C2){
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

