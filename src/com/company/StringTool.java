package com.company;

import java.util.Arrays;

public class StringTool
{
    private String buffer;

    public StringTool(String buffer) {
        if (buffer == null)
            throw new IllegalArgumentException("Line should be not null.");
        this.buffer = buffer;
    }

    public String[] getCodeOrderedWords() {
        var words = buffer.split(" ");
        var result = Arrays.stream(words)
                                        .filter(this::isWordOfOrderedChars)
                                        .toArray(String[]::new);
        return result;
    }

    private boolean isWordOfOrderedChars(String word) {
        var sorted = word.chars().sorted().toArray();
        var input = word.chars().toArray();
        return Arrays.equals(sorted, input);
    }
}
