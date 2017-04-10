package com.example.junho.algorithm2;

import android.renderscript.Sampler;

import java.util.Random;

/**
 * Created by junho on 2017. 4. 10..
 */

public class PackofCards {
    static int seed1 = 928734203;
    static int seed2 = 150968031;
    static int seed3 = 857928329;
    static String[] Suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static String[] Values = {
            "",
            "Ace",
            "Two",
            "Three",
            "Four",
            "Five",
            "Six",
            "Seven",
            "Eight",
            "Nine",
            "Ten",
            "Jack",
            "Queen",
            "King"
    };
    static Random rand = new Random();
    Card[] pack;
    int length;
    /*inner class of PackofCards*/
    public class Card{
        int Suit;
        int Value;

        Card(){
            Suit = 0;
            Value = 1;
        }
        Card(int a, int b) {
            Suit = a;
            Value = b + 1;
        }
    }

    PackofCards(int size){
        rand.setSeed(seed1);
        pack = new Card[size];
        for(int i = 0; i <size; i++){
            pack[i] = new Card(rand.nextInt(4), rand.nextInt(13));
        }
        length = size;
    }

    PackofCards(int size, long seed){
        rand.setSeed(seed);
        pack = new Card[size];
        for(int i = 0; i < size; i++){
            pack[i] = new Card(rand.nextInt(4), rand.nextInt(13));
        }
        length = size;
    }

    boolean CardCompare(Card card1, Card card2){
        if(card1.Value != card2.Value){
            return (card1.Value > card2.Value);
        }
        else{
            return (card1.Suit > card2.Suit);
        }
    }

    String PrintCards(){
        String print = "";
        for(int i = 0; i<length; i++){
            print = print.concat((i+1)+"."+ Values[pack[i].Value]+"of"+Suits[pack[i].Suit]+"\n");
        }
        return print;
    }

    /*Sorting Operation*/
    void BubbleSort(){
        int i, j;
        Card TmpCard = new Card(0, 1);

        for(i = length -1; i > 0; i--){
            for(j = 0; j <i; j++){
                if(CardCompare(pack[j], pack[j+1])){
                    TmpCard = pack[j];
                    pack[j] = pack[j+1];
                    pack[j+1] = TmpCard;
                }
            }
        }
    }
    void InsertSort(){

    }
    void SelectSort(){

    }
    void MergeSort(){

    }
    void HeapSort(){

    }
    void QuickSort(){

    }



}
