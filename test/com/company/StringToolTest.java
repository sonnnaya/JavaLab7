package com.company;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class StringToolTest {

    @ParameterizedTest
    @MethodSource("ToolAndSortedLineProvider")
    void testGetCodeOrderedWords(StringTool stringTool, String sortedLine) {
        var actual = stringTool.getCodeOrderedWords();
        var expected = sortedLine.split(" ");
        Assertions.assertArrayEquals(actual, expected);
    }

    @Test
    void testStringToolWithNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new StringTool(null));
    }

    public static Stream ToolAndSortedLineProvider() {
        return Stream.of(Arguments.of(new StringTool("dhiw[dj ABCDE fkfk jdd wp;w; abcde"), "ABCDE abcde"),
                        Arguments.of(new StringTool("ABCDE"), "ABCDE"),
                        Arguments.of(new StringTool("a b c d e"), "a b c d e"),
                        Arguments.of(new StringTool("dcdc abc edwced efg cnjc"), "abc efg"),
                        Arguments.of(new StringTool("ABcdE abcd ABC abCdE"), "abcd ABC"));
    }
}