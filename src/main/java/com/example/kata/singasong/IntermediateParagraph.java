package com.example.kata.singasong;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntermediateParagraph implements Paragraph {
    private final String animal;
    private final String introductoryVerse;
    private final String[] previousAnimals;

    public IntermediateParagraph(String animal, String introductoryVerse, String... previousAnimals) {
        this.animal = animal;
        this.introductoryVerse = introductoryVerse;
        this.previousAnimals = previousAnimals;
    }

    @Override
    public List<String> generateContent() {
        List<String> result = new ArrayList<String>() {{
            add("There was an old lady who swallowed a " + animal + ";");
            add(introductoryVerse);
        }};

        result = addPreviousAnimals(result);

        result.add("I don't know why she swallowed a " + previousAnimals[0] + " - perhaps she'll die!");
        result.add("");
        return result;
    }

    private List<String> addPreviousAnimals(List<String> input) {
        for (int i = previousAnimals.length - 1; i >= 2; i--) {
            input.add("She swallowed the " + previousAnimals[i] + " to catch the " + previousAnimals[i - 1] + ",");
        }
        input.add("She swallowed the " + previousAnimals[1] + " to catch the " + previousAnimals[0] + ";");
        return input;
    }
}
