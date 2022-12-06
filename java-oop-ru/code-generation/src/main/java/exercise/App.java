package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class App {
    public static boolean save(Path path, Car car) throws JsonProcessingException {
        String file=car.serialize();
        try( FileWriter fileOutputStream=new FileWriter(path.toFile());
        BufferedWriter bufferedReader=new BufferedWriter(fileOutputStream)){
           bufferedReader.write(file);
           return true;
        }
        catch (IOException e){e.getStackTrace();}
return false;
    }
    public static Car extract(Path path){
        Car car=null;
        try(FileReader fileReader=new FileReader(path.toFile());
        BufferedReader bufferedReader=new BufferedReader(fileReader)){
            String file=bufferedReader.readLine();
            car=Car.unserialize(file);
        }
        catch (IOException e){e.getStackTrace();}
        return car;
    }

    public static void main(String[] args) {
        User user=new User(12,"Egor","Godzun",21);
        Car car=new Car(12,"bmv", "11","red",user);
        Path path=Paths.get("src/test/resources/", "t.txt").toAbsolutePath().normalize();

    }
}
