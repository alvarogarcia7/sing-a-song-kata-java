package com.example.kata.singasong;

import java.util.ArrayList;
import java.util.List;

public class InitialParagraph implements Paragraph {
    private final String animal;

    public InitialParagraph(String animal) {
        this.animal = animal;
    }

    @Override
    public List<String> generateContent() {
        ArrayList<String> result = new ArrayList<String>() {{
            add("There was an old lady who swallowed a " + animal + ".");
            add("I don't know why she swallowed a " + animal + " - perhaps she'll die!");
            add("");
        }};
        return result;
    }
}
