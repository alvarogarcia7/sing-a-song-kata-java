package com.example.kata.singasong;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Song {

    private final List<Paragraph> paragraphs;

    public Song(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public static void main(String[] args) {
        new Song(buildParagraphs(args)).printOn(System.out);
    }

    private static List<Paragraph> buildParagraphs(String[] args) {
        List<Paragraph> paragraphs = new ArrayList<>();
        paragraphs.add(new InitialParagraph(args[0]));
        paragraphs.add(new IntermediateParagraph(args[1], "That wriggled and wiggled and tickled inside her.", selectAnimalsUpTo(args, 1)));
        paragraphs.add(new IntermediateParagraph(args[2], "How absurd to swallow a " + args[2] + ".", selectAnimalsUpTo(args, 2)));
        paragraphs.add(new IntermediateParagraph(args[3], "Fancy that to swallow a " + args[3] + "!", selectAnimalsUpTo(args, 3)));
        paragraphs.add(new IntermediateParagraph(args[4], "What a hog, to swallow a " + args[4] + "!", selectAnimalsUpTo(args, 4)));
        paragraphs.add(new IntermediateParagraph(args[5], "I don't know how she swallowed a " + args[5] + "!", selectAnimalsUpTo(args, 5)));
        paragraphs.add(new FinalParagraph(args[args.length - 1]));
        return paragraphs;
    }

    private static String[] selectAnimalsUpTo(String[] args, int includedUpperBound) {
        return Arrays.copyOfRange(args, 0, includedUpperBound + 1);
    }

    private void printOn(PrintStream printStream) {
        List<String> verses = new ArrayList<>();
        for (Paragraph paragraph : this.paragraphs) {
            verses.addAll(paragraph.generateContent());
        }
        String song = String.join("\n", verses);

        printStream.println(song);
    }
}