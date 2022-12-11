package exercise;

import org.apache.commons.lang3.StringUtils;

public class St {
    public static boolean  isBalanced(String st) {
       int a=0;
       int b=0;
        while (!st.equals("")){
          if (st.startsWith(")") && a==b){
              return false;
          }
          if (st.startsWith("(")){
              a++;
              st= StringUtils.removeStart(st, "(");
          }
          else if (st.startsWith(")")){
              b++;
              st= StringUtils.removeStart(st, ")");
          }
          else return false;
      }
        return a==b;
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("((())"));
    }
    public static int  fib(int  a) {
        if (a==0) {return 0;}
        else if (a==1) {return 1;}
        else {
        return fib(a-1)+fib(a-2);}
    }
}
