
public class Esercizio {
    
    public static void esercizio1() {
        public static void esercizio1() {
    int [][] M = new int[3][5];
    M[1][0] = 7;
    M[1][1] = 7;
    M[1][2] = 7;
    M[1][3] = 7;
    M[1][4] = 7;

    UtilsMatrice.visualizza(Matrice);
}
    }
   public static void riempiPerRighe(/* scrivere qui i parametri formali */) {
        // SCRIVERE QUI IL CODICE DELL'ESERCIZIO
    }
    public static void riempiRighe(int [][] M, int righe,int  colonne) {
		int i,c,j;
		c=1;
		i=0;
		while(i<=righe-1) {
			j=0;
			while(j<colonne-1) {
				M[i][j]=c;
				++c;
				++j;
			}
			++i;
		}
	}

    public static void riempiPerColonne(/* scrivere qui i parametri formali */) {
        // SCRIVERE QUI IL CODICE DELL'ESERCIZIO
    }
  	public static void riempiColonne(int [][] M, int righe,int  colonne) {
		int i,c,j;
		c=1;
		j=0;
		while(j<=colonne-1) {
			i=0;
			while(i<righe-1) {
				M[i][j]=c;
				++c;
				++i;
			}
			++j;
		}
	}
    
    public static void main(String[] args) {

        System.out.println();
        System.out.println("ESERCIZIO 1 davide: ");
        System.out.println("----- ----- -----");
        esercizio1();
        
        System.out.println();
        System.out.println("ESERCIZIO 2: ");
        System.out.println("----- ----- -----");
        esercizio2();
        
        System.out.println();
        System.out.println("ESERCIZIO 3: ");
        System.out.println("----- ----- -----");
        esercizio3();
    }
}