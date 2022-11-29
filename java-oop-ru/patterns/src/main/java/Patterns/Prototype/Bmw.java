package Patterns.Prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Bmw implements Car{
    private int maxSpeed;
    private String name;
    private boolean isTurboModeOn;

    @Override
    public Car clone() {
        Bmw bmw = new Bmw();
        bmw.setMaxSpeed(this.getMaxSpeed());
        bmw.setTurboModeOn(this.isTurboModeOn());
        bmw.setName(this.getName());

        return bmw;
    }
}
