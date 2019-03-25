package by.bntu.fitr.povt.kostylev.task1.tool;

import by.bntu.fitr.povt.kostylev.task1.view.Printer;

import java.util.Scanner;

public class Input {
    public static int inputInteger(String str){
        Printer.outputString(str);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
