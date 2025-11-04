
public class Esercizio {
    
    public static void esercizio1() {
        public static void esercizio1() {
    int [][] M = new int[3][5];
    M[1][0] = 7;
    M[1][1] = 7;
    M[1][2] = 7;
    M[1][3] = 7;
    M[1][4] = 7;

    UtilsMatrice.visualizza(M);
}
     public static void esercizio2() {
   
    int j;
    int [][] M = new int[3][5];
    for (j=0; j<=4; j=j+1 ) {
        M[1][j] = 7;
    }

    UtilsMatrice.visualizza(M);


}

public static void esercizio3() {
   
    int i;
    int [][] M = new int[3][5];
    for (i=0; i<=4; i=i+1 ) {
        M[i][3] = 7;
    }

    UtilsMatrice.visualizza(M);

}
}