package com.example.junho.algorithm2;

import android.os.Build;
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
        int i;
        int j;
        Boolean isSmall = false;
        Card TmpCard = new Card(0, 1);

        for(i = 1; i < length; i++){
            j = i - 1;
            isSmall = false;
            while(isSmall == false && j >= 0){
                if(CardCompare(pack[j], pack[j+1])){
                    TmpCard = pack[j+1];
                    pack[j+1] = pack[j];
                    pack[j] = TmpCard;
                    j--;
                } else{
                    isSmall = true;
                }
            }
        }

    }
    void SelectSort(){
        int i;
        int j;
        Card TmpCard = new Card(0, 1);
        int min;

        for(i = 0; i < length; i++){
            min = i;
            j = i + 1;
            for(j = i + 1; j < length; j++){
                if(CardCompare(pack[min], pack[j])){
                    min = j;
                }
            }
            TmpCard = pack[i];
            pack[i] = pack[min];
            pack[min] = TmpCard;
        }
    }
    void MergeSort(){
        DoMergeSort(0, length - 1);
    }

    void DoMergeSort(int start, int end){
        if(start < end){
            int middle = start + (end - start) / 2;
            DoMergeSort(start, middle);
            DoMergeSort(middle + 1, end);
            MergeParts(start, middle, end);
        }
    }
    void MergeParts(int start, int middle, int end){
        PackofCards tmpPackofCards = new PackofCards(length);
        for(int i = 0; i<length; i++){
            tmpPackofCards.pack[i] = pack[i];
        }
        int i = start;
        int j = middle + 1;
        int k = start;
        while(i <= middle && j <= end){
            if(CardCompare(tmpPackofCards.pack[j], tmpPackofCards.pack[i])){
                pack[k] = tmpPackofCards.pack[i];
                i++;
            } else{
                pack[k] = tmpPackofCards.pack[j];
                j++;
            }
            k++;
        }
        while(i <= middle){
            pack[k] = tmpPackofCards.pack[i];
            k++;
            i++;
        }
        while(j <= end){
            pack[k] = tmpPackofCards.pack[j];
            k++;
            j++;
        }

    }


    void HeapSort(){
        Card tmpCard = new Card(0, 1);
        int realLength = length;
        BuildMaxHeap(realLength);
        for(int i = length; i>1; i--){
            tmpCard = pack[i - 1];
            pack[i - 1] = pack[0];
            pack[0] = tmpCard;
            realLength--;
            MaxHeapify(0, realLength);
        }
    }

    void MaxHeapify(int index, int length){
        index++;
        int left = index * 2;
        int right = (index * 2) + 1;
        int largest;

        Card TmpCard = new Card(0, 1);

        if(left <= length && CardCompare(pack[left - 1], pack[index - 1])){
            largest = left;
        } else{
            largest = index;
        }
        if(right <= length && CardCompare(pack[right - 1], pack[largest - 1])){
            largest = right;
        }
        if(largest != index){
            TmpCard = pack[index - 1];
            pack[index-1] = pack[largest - 1];
            pack[largest -1] = TmpCard;
            MaxHeapify(largest - 1, length);
        }

    }

    void BuildMaxHeap(int length){
        for(int i = length/2; i>0; i--){
            MaxHeapify(i - 1, length);
        }
    }





    void QuickSort(){
        DoQuickSort(0, length -1);
    }

    void DoQuickSort(int left, int right){
        int next = left;
        int i = left;
        int j = right;
        Card tmpCard = new Card(0, 1);

        while(i <= j){
            while(CardCompare(pack[next], pack[i])){
                i++;
            }
            while(CardCompare(pack[j], pack[next])) {
                j--;
            }
            if( i <= j){
                tmpCard = pack[i];
                pack[i] = pack[j];
                pack[j] = tmpCard;
                i++;
                j--;
            }
        }
        if(left < j){
            DoQuickSort(left, j);
        }
        if(i < right){
            DoQuickSort(i, right);
        }
    }

}
