package com.example.kata.singasong;

public class Song {

    public static void main(String[] args) {

        String song = "There was an old lady who swallowed a " + args[0] + ".\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a " + args[1] + ";\n" +
                "That wriggled and wiggled and tickled inside her.\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a bird;\n" +
                "How absurd to swallow a bird.\n" +
                "She swallowed the bird to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a cat;\n" +
                "Fancy that to swallow a cat!\n" +
                "She swallowed the cat to catch the bird,\n" +
                "She swallowed the bird to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a dog;\n" +
                "What a hog, to swallow a dog!\n" +
                "She swallowed the dog to catch the cat,\n" +
                "She swallowed the cat to catch the bird,\n" +
                "She swallowed the bird to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a cow;\n" +
                "I don't know how she swallowed a cow!\n" +
                "She swallowed the cow to catch the dog,\n" +
                "She swallowed the dog to catch the cat,\n" +
                "She swallowed the cat to catch the bird,\n" +
                "She swallowed the bird to catch the " + args[1] + ",\n" +
                "She swallowed the " + args[1] + " to catch the " + args[0] + ";\n" +
                "I don't know why she swallowed a " + args[0] + " - perhaps she'll die!\n" +
                "\n" +
                "There was an old lady who swallowed a horse...\n" +
                "...She's dead, of course!";

        System.out.println(song);
    }
}