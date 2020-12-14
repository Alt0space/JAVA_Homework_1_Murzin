package com.company;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Files;
import java.util.List;
import java.io.IOException;


public class IOChamber {
    public static void main(String[] patch) {IOChamber();}
    public static void Echo() {
        Scanner scanner = new Scanner(System.in);
        ArrayList strings = new ArrayList();
        String line = "";
        while ((line = scanner.nextLine()).length() > 0) {
            strings.add(line);
        }
        for (Object echo : strings) {
            if (strings.indexOf(echo) %2 == 0) {
                System.out.println(echo);
            }

        }
    }
    public static void IOChamber(){
        Scanner scanner = new Scanner(System.in);
        try {
            List<String> lines = Files.readAllLines(Paths.get(scanner.nextLine()));
            for (String s: lines) {
                if (lines.indexOf(s) % 2 == 0) {
                    System.out.println(s);
                }
            }
        } catch (IOException e) {
            System.out.println("Файл не распознан. Введите ваши сообщения");
            Echo();
        }
    }
}