package com.example.kata.singasong;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Song {

    private final List<Paragraph> paragraphs;
    private final String[] args;

    public Song(List<Paragraph> paragraphs, String[] args) {
        this.paragraphs = paragraphs;
        this.args = args;
    }

    public static void main(String[] args) {
        new Song(buildParagraphs(args), args).printOn(System.out);
    }

    private static List<Paragraph> buildParagraphs(String[] args) {
        List<Paragraph> paragraphs = new ArrayList<>();
        paragraphs.add(new InitialParagraph(args[0]));
        for (int i = 1; i < args.length - 1; i++) {
            paragraphs.add(new IntermediateParagraph(args[i]));
        }
        paragraphs.add(new FinalParagraph(args[args.length - 1]));
        return paragraphs;
    }

    private void printOn(PrintStream printStream) {
        String song = "There was an old lady who swallowed a " + args[0] + ".\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[1] + ";\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[2] + ";\n" +
                "How absurd to swallow a " + args[2] + ".\n" +
                "She swallowed the " + args[2] + " to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[3] + ";\n" +
                "Fancy that to swallow a " + args[3] + "!\n" +
                "She swallowed the " + args[3] + " to catch the " + args[2] + ",\n" +
                "She swallowed the " + args[2] + " to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[4] + ";\n" +
                "What a hog, to swallow a " + args[4] + "!\n" +
                "She swallowed the " + args[4] + " to catch the " + args[3] + ",\n" +
                "She swallowed the " + args[3] + " to catch the " + args[2] + ",\n" +
                "She swallowed the " + args[2] + " to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[5] + ";\n" +
                "I don't know how she swallowed a " + args[5] + "!\n" +
                "She swallowed the " + args[5] + " to catch the " + args[4] + ",\n" +
                "She swallowed the " + args[4] + " to catch the " + args[3] + ",\n" +
                "She swallowed the " + args[3] + " to catch the " + args[2] + ",\n" +
                "She swallowed the " + args[2] + " to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[6] + "...\n" +
                "...She's dead, of course!";

        printStream.println(song);
    }
}