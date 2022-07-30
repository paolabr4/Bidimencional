public class arregloBidimencional {
    public static void main(String[] args) {
        int[][] numeros= new int [4][5];
        for (int  i = 0; i < numeros.length;i++){
            for (int j=0; j < numeros[i].length;j++){
                numeros[i][j]=(int)Math.floor(Math.random()*(9 - 1));
            }
        }

        for (int i=0; i< numeros.length; i++){
            for (int j=0;j<numeros[i].length;j++){
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println("");
        }
    }

}
