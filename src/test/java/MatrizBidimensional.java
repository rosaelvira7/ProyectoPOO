public class MatrizBidimensional {
    public static void main(String[] args) {

        //arreglo declarado vacio, posicion hasta 3
        int[][] matrizBidimensional = new int[3][3];


        //solo para asignar valores
        for (int i = 0; i < matrizBidimensional.length; i++) {
            for (int j = 0; j < matrizBidimensional[i].length; j++) {
                matrizBidimensional[i][j] = i + j;
            }
        }


        // se recorre el arreglo bidimensional y se imprime
        for (int i = 0; i < matrizBidimensional.length; i++) {
            for (int j = 0; j < matrizBidimensional[i].length; j++) {
                System.out.print(matrizBidimensional[i][j] + " ");
            }
            //hace el salto
            System.out.println();
        }

    }
}

