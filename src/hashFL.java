


//-----------------------------------------------------
//Title: hashFL
//Author: Abdusselam koç
//ID:
//Section: 1
//Description: hash code implementation for linear probing
//-----------------------------------------------------

import java.util.Arrays;
import java.util.List;


import static java.lang.System.arraycopy;
import static java.lang.System.out;

class hashFL {

    private int N = 0; // number of the object in the array
    public int M = 16;// size of the array.

    private word[] keys = new word[M]; // word array to keep the word objects.


    // --------------------------------------------------------
    // Summary: create hash according to M and hashcode
    // Precondition: a long number that represent hash
    // Postcondition: a short number that represent hash
    // --------------------------------------------------------

    public int hash(word wrd) {

        return (wrd.hashcode & 0x7fffffff) % M;

    }


    // --------------------------------------------------------
    // Summary: checks and put the new word objects to array.
    // Precondition:the object is waiting to be evaluated.
    // Postcondition: object is evaluated and joined to array or not joined.
    // --------------------------------------------------------


    public void put(word wrd) {

        check(); // checks for need to expand.
        int tmp = hash(wrd);

        int i = tmp;

        // Do-while loop
        // Do part for performing actions
        do {

            if (keys[i] == null) {
                keys[i] = wrd;

                N = N + 1; // increase N to keep count Number of N when added a new object to array.

                return;
            }
            if (keys[i].Wordfr.equals(wrd.Wordfr)) {

                keys[i].count++; // increase the count number of the object that we already have in the array and passes the word.

                return;
            }

            i = (i + 1) % M;

        }

        // Do-while loop
        // while part for condition check
        while (i != tmp);

    }

    // --------------------------------------------------------
    // Summary: checks whether there is need for expand or not.
    // Precondition: not checked.
    // Postcondition: checked and if there is need ordered to expand and rehash the array..
    // --------------------------------------------------------


    public void check() {

        if (N != 0 && M >= 16 && (M / N) < 2) {
            expand();

        }

    }


    // --------------------------------------------------------
    // Summary:rehashes the all array according to new M.
    // Precondition:array is not rehashed
    // Postcondition:array is truly rehashed.
    // --------------------------------------------------------


    public void rehash(word[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {


            } else {
                N--; // decrease N because otherwise N will always go up and blow our array.
                put(arr[i]);

            }

        }


    }

    // --------------------------------------------------------
    // Summary: expands the array in case of needed.
    // Precondition: the array is not expanded
    // Postcondition: array is expanded and objects are rehashed.
    // --------------------------------------------------------


    public void expand() {
        M *= 2;

        word[] arr;
        arr = new word[M];
        arraycopy(keys, 0, arr, 0, keys.length); // copy the main array to a temporary array.
        keys = new word[M]; // empty and resize the main array.

        rehash(arr);// rehashes the array.

    }

    // --------------------------------------------------------
    // Summary: search main array to return the most used three object that we have.
    // Precondition:the most used three object is unknown.
    // Postcondition:the most used three object is known and returned to user.
    // --------------------------------------------------------


    public List<Object> print() {
       
        word wordFirst = new word("text"), wordSecond = new word("text"), wordThird = new word("text");
        int index1 = 0, index2 = 0, index3 = 0;


        for (int i = 0; i < keys.length; i++) {
            if (keys[i] == null) {

            } else {

                if (keys[i].count > wordFirst.count) {
                    wordFirst = keys[i];
                    index1 = i;
                }
            }
        }
        for (int i = 0; i < keys.length; i++) {
            if (keys[i] == null) {

            } else {
                if (keys[i].count < wordFirst.count && keys[i].count > wordSecond.count) {
                    wordSecond = keys[i];
                    index2 = i;
                }

            }
        }

        for (int i = 0; i < keys.length; i++) {
            if (keys[i] == null) {

            } else {
                if (keys[i].count > wordThird.count && keys[i].count < wordSecond.count) {
                    wordThird = keys[i];
                    index3 = i;
                }

            }
        }


        return Arrays.asList(wordFirst.Wordfr, index1, wordFirst.count, wordSecond.Wordfr, index2, wordSecond.count, wordThird.Wordfr, index3, wordThird.count);
        // returns a list that keeps the words, indexes and the number of words.

    }

}