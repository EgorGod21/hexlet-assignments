package exercise;

import java.util.Arrays;

public class App {
    public static String[][] enlargeArrayImage(String[][] enlargedImage){
        int length=enlargedImage.length;

        String[][] result=new String[2*length][2*length];
        if (enlargedImage[0].length==0){return result;}
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
              result[2*i][2*j]=enlargedImage[i][j];
                result[2*i][2*j+1]=enlargedImage[i][j];
                result[2*i+1][2*j]=enlargedImage[i][j];
                result[2*i+1][2*j+1]=enlargedImage[i][j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[][] image = {
                {},
                {},
                {},
                {},
        };
        Arrays.stream(enlargeArrayImage(image))
                .forEach(x-> System.out.println(Arrays.deepToString(x)));
    }
}