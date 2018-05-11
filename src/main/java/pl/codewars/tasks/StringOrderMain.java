package pl.codewars.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StringOrderMain {

    public static String stringOrder(String string){

        String[] splitStrings = new String[]{};
        if(string.length()>0){
            splitStrings = string.split(" ");
        }
        String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] result = new String[splitStrings.length];

        for(int i=0; i<splitStrings.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (splitStrings[i].contains(number[j])) {
                    result[j] = splitStrings[i];
                    break;
                }

            }
        }
        /*StringBuilder stringBuilder = new StringBuilder();
        for(String value : result){
            if (stringBuilder.length()>0){
                stringBuilder.append(" ");
            }
            stringBuilder.append(value);
        }
        String wordsOrdered = stringBuilder.toString();
        return wordsOrdered;*/
        return Arrays.stream(result).collect(Collectors.joining(" "));
    }

    public static void main(String[] args){
        /*
        Your task is to sort a given string. Each word in the String will contain a single number. This number is the position the word should have in the result.

        Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

        If the input String is empty, return an empty String. The words in the input String will only contain valid consecutive numbers.

        For an input: "is2 Thi1s T4est 3a" the function should return "Thi1s is2 3a T4est"

        input: string
        output: sorted string
        */
        String string = "is2 Thi1s T4est 3a";

        System.out.print(stringOrder(string));
    }
}
