package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PareNoelASCII {

    public static void main(String[] args) {

        try {
            File file = new File("santako.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            Pattern pareNoelPattern = Pattern.compile("\\*<]:-DOo");
            Pattern renPattern = Pattern.compile(">:o\\)");
            Pattern folletPattern = Pattern.compile("<]:-D");

            int pareNoelCount = 0;
            int renCount = 0;
            int folletCount = 0;

            while ((line = br.readLine()) != null) {
                Matcher pareNoelMatcher = pareNoelPattern.matcher(line);
                Matcher renMatcher = renPattern.matcher(line);
                Matcher folletMatcher = folletPattern.matcher(line);

                while (pareNoelMatcher.find()) {
                    pareNoelCount++;
                }

                while (renMatcher.find()) {
                    renCount++;
                }

                while (folletMatcher.find()) {
                    folletCount++;
                }
            }

            br.close();

            System.out.println("Pare Noel (" + pareNoelCount + ")");
            System.out.println("Ren (" + renCount + ")");
            System.out.println("Follet (" + folletCount + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
