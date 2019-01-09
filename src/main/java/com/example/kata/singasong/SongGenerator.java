package com.example.kata.singasong;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SongGenerator {

    private final List<Paragraph> paragraphs;

    public SongGenerator(List<Paragraph> paragraphs) {
        this.paragraphs = paragraphs;
    }

    public static void main(String[] args) {
        Song song = new SongGenerator(buildParagraphs(args)).execute();
        song.printOn(System.out);
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

    private Song execute() {
        List<String> verses = new ArrayList<>();
        for (Paragraph paragraph : this.paragraphs) {
            verses.addAll(paragraph.generateContent());
        }
        return new Song(verses);
    }

    public class Song {
        private final List<String> verses;

        public Song(List<String> verses) {
            this.verses = verses;
        }

        public void printOn(PrintStream printStream) {
            printStream.println(String.join("\n", verses));
        }

        @Override
        public String toString() {
            return "Song{" +
                    "verses=" + verses +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Song song = (Song) o;
            return Objects.equals(verses, song.verses);
        }

        @Override
        public int hashCode() {
            return Objects.hash(verses);
        }
    }
}