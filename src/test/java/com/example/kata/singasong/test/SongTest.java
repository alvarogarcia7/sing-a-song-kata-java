package com.example.kata.singasong.test;

import com.example.kata.singasong.SongGenerator;
import org.approvaltests.Approvals;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SongTest {
    @Test
    public void should_sing_with_the_standard_animals() {
        ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(resultStream));

        SongGenerator.main(new String[]{"fly", "spider", "bird", "cat", "dog", "cow", "horse"});

        Approvals.verify(resultStream.toString());
    }
}
