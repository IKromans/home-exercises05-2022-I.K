package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds implements Sound {
    public static void main(String[] arg) {

        List<MakeSounds> list = new ArrayList<>();

        Firework firework = new Firework();
        Parrot parrot = new Parrot();
        Radio radio = new Radio();

        list.add(firework);
        list.add(parrot);
        list.add(radio);

        for (MakeSounds object : list) {
            object.playSound();
        }
    }

    @Override
    public void playSound() {
    }
}
