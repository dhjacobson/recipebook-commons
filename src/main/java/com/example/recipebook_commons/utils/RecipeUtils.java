package com.example.recipebook_commons.utils;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class RecipeUtils {

    public static String durationToText(Duration d) {
        long totalMinutes = d.toMinutes();

        long hours = totalMinutes / 60;
        long leftoverMinutes =  (totalMinutes % 60);

        List<String> stringParts = new ArrayList<>();
        if (hours > 0) {stringParts.add(String.format("%d hrs", hours));}
        if (leftoverMinutes > 0) {stringParts.add(String.format("%d mins", leftoverMinutes));}
        return String.join(", ", stringParts);
    }

    public static String doubleToShortText(double d) {
        {
            if(d == (long) d)
                return Long.toString((long) d);
            else
                return String.format("%s", d);
        }
    }

}