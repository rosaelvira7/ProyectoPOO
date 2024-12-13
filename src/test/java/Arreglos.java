import java.util.Arrays;

public class Arreglos {
    public static void main(String[] args) {

    //alt 125 } alt 123 {
        // alt 91 [ alt 93 ]

        //longitud tiene 5 valores.
        //pero posición empienza en 0, es decir su ultimo valor del arreglo es [4]
        int arreglo[]= {1,2,3,4,5};
        int arreglo2[]= new int [5];
        //con el arreglo new int[5] la posicion colocacada devuelve 0 hasta su max posicion[4];
    System.out.println("valor del new int POSICION :" + arreglo2[4]);
    System.out.println("valor del new int LENGTH :" + arreglo2.length);
        System.out.println("valor del arreglo común POSICION:" +  arreglo[4]);
        System.out.println("valor del arreglo común LENGTH:" +  arreglo.length);
        //los dos arreglos son lo mismo
        for (int i =0;i<arreglo.length;i++){
            System.out.println(arreglo[i]);

        }

           }
}
