package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List lines = new ArrayList();
        String line;
        while (true) {
            line = scanner.nextLine();
            if (line.equals("")) {
                break;
            }
            lines.add(line);
        }
        for(int i = 0; i < lines.size(); i++){
            System.out.println(lines.get(i));
        }
    }
}
