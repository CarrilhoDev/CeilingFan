package org.carrilho.ceilingFan;


public class Chords {

    CeilingFan fan = new CeilingFan();

    public Chords() {
    }

    public void pullIncreasingVelocityChord(){
        fan.velocityUp();
        System.out.println(fan.toString());
    }

    public void pullReversingDirectionChord(){
        fan.reverseDirection();
        System.out.println(fan.toString());
    }
}
