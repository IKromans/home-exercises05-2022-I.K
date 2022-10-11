package io.codelex.polymorphism.practice.exercise2;

class Firework extends MakeSounds implements Sound {
    public void playSound() {
        System.out.println("whoosh-bang");
    }
}
