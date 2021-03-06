package com.company;

import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        try {
            var sequency = "dhiw[dj ABCDE fkfk jdd wp;w; abcde";
//            var sequency = getString("Enter line:");

            var program = new StringTool(sequency);
            var answer = program.getCodeOrderedWords();
            Arrays.stream(answer).forEach(System.out::println);
        }
        catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static String getString(String message) {
        var in = new Scanner(System.in);
        System.out.print(message + "\n");
        return in.nextLine();
    }
}