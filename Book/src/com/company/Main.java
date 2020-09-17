package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProgrammingBook programmingBook1 = new ProgrammingBook("11", "Harry Potter 1", 500000, "J.K.Rowling", "Java", "Spring");
        ProgrammingBook programmingBook2 = new ProgrammingBook("22", "Harry Potter 2", 600000, "J.K.Rowling", "C++", "Spring");
        ProgrammingBook programmingBook3 = new ProgrammingBook("33", "Harry Potter 3", 700000, "J.K.Rowling", "Java", "Spring");
        ProgrammingBook programmingBook4 = new ProgrammingBook("44", "Harry Potter 4", 500000, "J.K.Rowling", "Python", "Spring");
        ProgrammingBook programmingBook5 = new ProgrammingBook("55", "Harry Potter 5", 600000, "J.K.Rowling", "C++", "Spring");

        FictionBook fictionBook1 = new FictionBook("fiction1", "101", 500000, "Andersen", "fairy tail");
        FictionBook fictionBook2 = new FictionBook("fiction2", "102", 600000, "Andersen", "novelty");
        FictionBook fictionBook3 = new FictionBook("fiction3", "103", 700000, "Andersen", "fairy tail");
        FictionBook fictionBook4 = new FictionBook("fiction4", "104", 500000, "Andersen", "romantic");
        FictionBook fictionBook5 = new FictionBook("fiction5", "105", 500000, "Andersen", "horror");

        ArrayList<Book> listBook = new ArrayList<Book>();

        listBook.add(programmingBook1);
        listBook.add(programmingBook2);
        listBook.add(programmingBook3);
        listBook.add(programmingBook4);
        listBook.add(programmingBook5);
        listBook.add(fictionBook1);
        listBook.add(fictionBook2);
        listBook.add(fictionBook3);
        listBook.add(fictionBook4);
        listBook.add(fictionBook5);

        int sum = 0;
        int count = 0;
        for (int i = 0; i < listBook.size(); i++) {
            sum += listBook.get(i).getPrice();
            if (listBook.get(i) instanceof ProgrammingBook) {
                if (((ProgrammingBook) listBook.get(i)).getLanguage().equals("Java")) {
                    count++;
                }
            }
        }
        System.out.println("Tong so tien cua 10 quyen sach la: " + sum);
        System.out.println("So quyen sach co language Java la: " + count);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao ten cua cuon sach ban muon xem gia: ");
        String name = sc.nextLine();
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getName().equals(name)) {
                System.out.println("Gia cua cuon sach " + name + " la: " + listBook.get(i).getPrice());
                break;
            }
            if (i == 9) {
                System.out.println("Khong co cuon sach nay");
            }
        }

        System.out.println("Sap xep gia theo thuat toan noi bot: ");
        for (int i = 0; i < listBook.size(); i++) {
            for (int j = 0; j < listBook.size() - 1; j++)
                if (listBook.get(j).getPrice() > listBook.get(j + 1).getPrice()) {
                    Book temp = listBook.get(j);
                    listBook.set(j, listBook.get(j + 1));
                    listBook.set(j + 1, temp);
                }
        }
        for (Book book : listBook) {
            System.out.print(book.getName() + ", ");
        }

        System.out.println("");
        System.out.println("Sap xep gia theo thuat toan chen: ");
        for (int i = 1; i < listBook.size(); i++) {
            Book valueToInsert = listBook.get(i);
            int index = i;
            while (index > 0 && (listBook.get(index - 1).getPrice() > valueToInsert.getPrice())) {
                listBook.set(index, listBook.get(index - 1));
                index = index - 1;
            }
        }
        for (Book book : listBook) {
            System.out.print(book.getName() + ", ");
        }

        System.out.println("");
        System.out.println("Sap xep theo thuat toan chon: ");
        for (int i=0;i<listBook.size();i++){
            Book min=listBook.get(i);
            int index=i;
            for (int j=i+1;j<listBook.size();j++){
                if (listBook.get(j).getPrice()<min.getPrice()){
                    min=listBook.get(j);
                    index=j;
                }
            }
            if (index!=i){
                Book temp= listBook.get(i);
                listBook.set(i,min);
                listBook.set(index,listBook.get(i));
            }


        }
        for (Book book : listBook) {
            System.out.print(book.getName() + ", ");
        }

//        System.out.println("Nhap vao gia cuon sach can tim ten ");
//        double price1=sc.nextDouble();
//        boolean check=false;
//        int start=0;
//        int end=listBook.size();
//        while (!check){
//            if (start>end){
//                System.out.println("Khong tim thay cuon sach nay");
//                break;
//            }
//            int mid=start+(int) Math.floor((end-start)/2);
//            if (listBook.get(mid).getPrice()<)
//
//        }
    }
}
