package com.company;

import java.io.*;

public class PareNoelASCIISinStringMatches {
    public static void main(String[] args) {
        try {
            File file = new File("santako.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            char pareNoelChar = '*';
            char renChar = '>';
            char folletChar = '<';

            int pareNoelCount = 0;
            int renCount = 0;
            int folletCount = 0;

            while ((line = br.readLine()) != null) {
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c == pareNoelChar) {
                        pareNoelCount++;
                    } else if (c == renChar) {
                        renCount++;
                    } else if (c == folletChar) {
                        folletCount++;
                    }
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
