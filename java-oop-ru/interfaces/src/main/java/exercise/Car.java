package exercise;

public interface Car {
    String TYPE="car";
    void go ();
    void stop();
    String getName();
    int getMaxSpeed();
    default void printCar(){
        System.out.printf("%s is a %s. It as ability to go with max speed of %d",getName(),TYPE,getMaxSpeed());
    }

}
