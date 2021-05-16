package utils;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private String name;
    private ArrayList listMenu = new ArrayList();
    Scanner sc = new Scanner(System.in);

    public Menu(String name) {
        this.name = name;
    }

    public ArrayList getListMenu() {
        return listMenu;
    }

    public void add(String msg) {
        listMenu.add(msg);
    }

    public int getChoice() {
        int choice;
        if (listMenu.isEmpty()) {
            System.out.println("The menu is empty!\n");
            return -1;
        }

        System.out.println("\n---------" + name + "---------");
        for (int i = 0; i < listMenu.size(); i++) {
            System.out.println((i + 1) + ". " + listMenu.get(i));
        }

        do {
            System.out.println("Choose the option from " + 1 + " to " + listMenu.size());
            do {
                try {
                    System.out.print("Option: ");
                    choice = Integer.parseInt(sc.nextLine().trim());
                    if (choice > 0 && choice <= listMenu.size()) {
                        return choice;
                    }

                    else if (choice > listMenu.size()) {
                        System.out.println("You must choose option from " + 1 + " to " + listMenu.size());
                    }

                    else {
                        System.out.println("Option must be greater than 0");
                    }
                } catch (Exception e) {
                    System.out.println("Input an integer to choose options...");
                }
            } while (true);
        } while (choice < 1 || choice > listMenu.size());
    }
}
