package exercise;

public class NegativeRadiusException extends Exception{

   private String massage;
    public NegativeRadiusException( String massage) {
        super(massage);

    }
}
