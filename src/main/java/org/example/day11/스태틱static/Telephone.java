package org.example.day11.스태틱static;

public class Telephone {
    int size;
    String speaker;

    public Telephone(int size, String speaker) {
        this.size = size;
        this.speaker = speaker;
    }

    //@Override
    public String toString() {
        return "Telephone{" +
                "size=" + size +
                ", speaker='" + speaker + '\'' +
                '}';
    }
}
