package com.example.kata.singasong;

import java.util.ArrayList;
import java.util.List;

public class IntermediateParagraph implements Paragraph {
    private final String animal;
    private final String[] previousAnimal;

    public IntermediateParagraph(String animal, String... previousAnimals) {
        this.animal = animal;
        this.previousAnimal = previousAnimals;
    }

    @Override
    public List<String> generateContent() {
        return new ArrayList<String>() {{
                add("There was an old lady who swallowed a " + animal + ";");
                add("That wriggled and wiggled and tickled inside her.");
                add("She swallowed the " + animal + " to catch the " + previousAnimal[0] + ";");
                add("I don't know why she swallowed a " + previousAnimal[0] + " - perhaps she'll die!");
                add("");
            }};
    }
}
