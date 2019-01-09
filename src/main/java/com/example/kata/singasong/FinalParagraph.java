package com.example.kata.singasong;

import java.util.ArrayList;
import java.util.List;

public class FinalParagraph implements Paragraph {
    private final String animal;

    public FinalParagraph(String animal) {
        this.animal = animal;
    }

    @Override
    public List<String> generateContent() {
        return new ArrayList<String>() {{
            add("There was an old lady who swallowed a " + animal + "...");
            add("...She's dead, of course!");
        }};
    }
}
