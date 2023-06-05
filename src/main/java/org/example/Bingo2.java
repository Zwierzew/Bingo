package org.example;

import java.util.Random;
import java.util.Scanner;

/*
Napisz program w klasie, który będzie z Tobą grał w „za dużo, za mało".

Na początku komputer losuje liczbę z zakresu od 0 do 100 (podpowiedź: skorzystaj z metody Random.nextInt())
a następnie czeka na podanie liczby przez użytkownika:
 -->Jeśli użytkownik poda liczbę większą, niż wylosowana przez komputer,
    program powinien wypisać „za dużo" i czekać na podanie kolejnej liczby.

 -->Jeśli użytkownik poda liczbę mniejszą, program powinien wypisać „za mało"
    i analogicznie czekać na następną liczbę.

 -->Jeśli użytkownik poda odpowiednią wartość, to program powinien wypisać słowo „Bingo!" i zakończyć się.
 */
public class Bingo2 {
    public static void main(String[] args){

        System.out.println("Welcome to Bingo game! The winning number is between 0 and 100 - do you get lucky today?");

        Random random = new Random();
        int bingoNumber = random.nextInt(101);

        Scanner scan = new Scanner(System.in);
        int playerNumber;
        do {
            playerNumber = scan.nextInt();
            if(playerNumber > bingoNumber) {
                System.out.println("too much");
            }
            else if(playerNumber < bingoNumber){
                System.out.println("too little");
            }
            else {
                System.out.println("Bingo!");
            }
        } while (playerNumber != bingoNumber);
        System.out.println("Thanks for the game!");
    }
}
