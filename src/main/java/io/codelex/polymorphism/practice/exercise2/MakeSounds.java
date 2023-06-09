package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        Parrot parrot = new Parrot();
        Radio radio = new Radio();
        Firework firework = new Firework();
        List<Sound> sounds = new ArrayList<>();
        Collections.addAll(sounds, parrot, radio, firework);
        sounds.forEach(Sound::playSound);
    }
}
