package application;
import entities.Room;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Room[] rooms = new Room[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("How many rooms will be rented?");
        int numberOfRents = sc.nextInt();
        int numberRoom;
        String name;
        String email;
        for(int i = 0; i < numberOfRents; i++){
            sc.nextLine();
            System.out.println("Name: ");
            name = sc.nextLine();
            System.out.println("Email: ");
            email = sc.nextLine();
            System.out.println("Room: ");
            numberRoom = sc.nextInt();
            rooms[numberRoom] = new Room(name, email);
        }
        System.out.println("Busy rooms: ");
        for(int i = 0; i < rooms.length; i++){
            if (rooms[i] != null){
                System.out.println(i + ": " + rooms[i]);
            }
        }
    }
}