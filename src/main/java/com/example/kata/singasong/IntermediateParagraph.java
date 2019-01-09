package com.example.kata.singasong;

import java.util.ArrayList;
import java.util.List;

public class IntermediateParagraph implements Paragraph {
    private final String animal;
    private final String previousAnimal;

    public IntermediateParagraph(String animal, String previousAnimal) {
        this.animal = animal;
        this.previousAnimal = previousAnimal;
    }

    @Override
    public List<String> generateContent() {
        return new ArrayList<String>() {{
                add("There was an old lady who swallowed a " + animal + ";");
                add("That wriggled and wiggled and tickled inside her.");
                add("She swallowed the " + animal + " to catch the " + previousAnimal + ";");
                add("I don't know why she swallowed a " + previousAnimal + " - perhaps she'll die!");
                add("");
            }};
    }
}
