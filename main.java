package hw;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();

        Laptop laptop1 = new Laptop();
        laptop1.setBrand("Asus");
        laptop1.setModel("Vivobook Pro 16 OLED");
        laptop1.setRAM(16);
        laptop1.setSDD(512);
        laptop1.setOS("Windows 10 Home");
        laptop1.setColor("silver");

        Laptop laptop2 = new Laptop();
        laptop2.setBrand("Apple");
        laptop2.setModel("MacBook Air 13");
        laptop2.setRAM(8);
        laptop2.setSDD(256);
        laptop2.setOS("macOS");
        laptop2.setColor("silver");

        Laptop laptop3 = new Laptop();
        laptop3.setBrand("Xiaomi");
        laptop3.setModel("RedmiBook 14 II");
        laptop3.setRAM(16);
        laptop3.setSDD(512);
        laptop3.setOS("Windows 11 Home");
        laptop3.setColor("silver");

        Laptop laptop4 = new Laptop();
        laptop4.setBrand("Xiaomi");
        laptop4.setModel("RedmiBook 14 II");
        laptop4.setRAM(16);
        laptop4.setSDD(512);
        laptop4.setOS("Windows 11 Home");
        laptop4.setColor("silver");

        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);

        // System.out.println(laptops);
        
        System.out.println("1 - ram : 2 - sdd : 3 - os : 4 - color \nEnter the numbers of the selected criterion:");
        
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String color = "";
        String os = "";
        int sdd = 0;
        int ram = 0;
        while (String.valueOf(number).length()>4){
            System.out.println("Incorrect selection");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            if(number % 10 == 4){
                System.out.println("Enter color");
                Scanner col = new Scanner(System.in);
                color = col.nextLine();
                number = number/10;
            }
            if(number % 10 == 3){
                System.out.println("Enter os");
                Scanner opersistem = new Scanner(System.in);
                os = opersistem.nextLine();
                number = number/10;
            }
            if(number % 10 == 2){
                System.out.println("Enter sdd");
                Scanner sDD = new Scanner(System.in);
                sdd = sDD.nextInt();
                number = number/10;
            }
            if(number % 10 == 1){
                System.out.println("Enter ram");
                Scanner rAM = new Scanner(System.in);
                ram = rAM.nextInt();
                number = number/10;
            }
            if(number%10>3){
                number = number/10;
            }
        }    

    Set<Laptop> find = new HashSet<>();
        find.addAll(findLaptop(laptops, ram, sdd, color, os));
    if(find.isEmpty()){
        System.out.println("Sorry, we didn't find it");
    } else {
        printSet(find);
    }
    }
    
    static Set<Laptop> findLaptop(Set<Laptop> laptops, int r, int s, String col, String o){
        Set<Laptop> res = new HashSet<>();
        int count =0;
        for (Laptop laptop: laptops){
            count = 0;
            if (r==0 || laptop.getRAM() >= r){
                count++;
            }
            if (s==0 || laptop.getSDD() >= s ){
                count++;
            }
            if(col=="" || col.equals(laptop.getColor())){
                count++;
            }
            if(o=="" || o.equals(laptop.getOS())){
                count++;
            }
            if(count==4) {
                res.add(laptop);
            }
        }
        return res;
    }

    static void printSet(Set<Laptop> laptops){
        for (Laptop laptop: laptops){
            System.out.println(laptop);
        }
    }
    }      