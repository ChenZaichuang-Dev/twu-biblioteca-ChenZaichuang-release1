package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleIOFunc {
    static void showInfoToConsole(String info){
        System.out.print(info);
    }
    static String showInfoAndReadDataFromConsole(String prompt) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            showInfoToConsole(prompt);
            str = br.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
    static void clearTheConsoleContent() throws IOException {
    }
}
