package Patterns.Prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Kia implements Car{
    private int maxSpeed;
    private boolean isBlindZoneControl;

    @Override
    public Kia clone() {
        Kia kia = new Kia();
        kia.setBlindZoneControl(this.isBlindZoneControl);
        kia.setMaxSpeed(this.getMaxSpeed());

        return kia;
    }
}
