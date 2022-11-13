package exercise;

import java.util.Arrays;


public class ArrayExample {
    public static void main(String[] args) {
        Integer[][] matrix = {
                {11, 12, 13, 14},
                {21, 22, 23, 24},
                {31, 32, 33, 34},
                {41, 42, 43, 44},
        };
        System.out.println(Arrays.deepToString(getMirrorMatrix(matrix)));


    }

    public static <T> T [][] getMirrorMatrix(T [] [] ar){
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar[i].length/2; j++) {
                T value=ar[i][j];
                ar[i][ar[i].length-1-j]=value;
            }
        }

        return ar;
    }
    public static int [] boubleSort(int [] ar){
        boolean sort;

        do {
            sort=false;
            for (int i = 0; i < ar.length-1; i++) {
               if (ar[i+1]<ar[i]){
                   int sw=ar[i];
                   ar[i]=ar[i+1];
                   ar[i+1]=sw;
                   sort=true;
               }

            }
        } while (sort);

        return ar;
    }


}
