package exercise;

public class Test {
    public static void main(String[] args) {
//    int x=1;
//    int y=2;
//    if (3!=sum(x,y)){
//       throw new AssertionError("oy");
//    }
//        System.out.println("good");
      assert sum(-1,9) ==-7:"otstoy";
    }
    public static int sum(int x, int y){
        return x+y;
    }
    public static String getHelloWorldMsg(){
        return "Hello, world!";
    }
}
