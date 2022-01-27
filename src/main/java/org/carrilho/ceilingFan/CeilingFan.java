package org.carrilho.ceilingFan;

import org.carrilho.ceilingFan.enums.DirectionEnum;

import static org.carrilho.ceilingFan.enums.DirectionEnum.BACKWARD;
import static org.carrilho.ceilingFan.enums.DirectionEnum.FORWARD;

public class CeilingFan {

    public DirectionEnum direction = FORWARD;
    public static final int OFF = 0;
    private int velocity = OFF;

    public int getVelocity() {
        return velocity;
    }

    public DirectionEnum getDirection() {
        return direction;
    }

    public void velocityUp() {
        if (velocity == 3) {
            velocity = OFF;

        } else {
            velocity++;
        }
    }

    public void reverseDirection() {
        if(direction.equals(FORWARD)){
            direction = BACKWARD;
        }else{
            direction = FORWARD;
        }
    }

    @Override
    public String toString() {
        if(velocity == OFF){
            return "The fan has stopped";
        }else{
            return String.format("The fan is working on velocity %d in %s direction", getVelocity(), getDirection());
        }
    }
}
