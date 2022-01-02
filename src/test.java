
import java.util.List;


//-----------------------------------------------------
//Title: Runner
//Author: Abdusselam koç
//ID:
//Section: 1
//Description: test class to test the program
//-----------------------------------------------------


public class test {

    // --------------------------------------------------------
    // Summary:this method read the string array splits it and puts it into both algorithms.
    // then it returns the results for both algorithms
    // Precondition:there aren't any word in the algorithms to test the codes.
    // Postcondition: there are many words in the algorithms to test the code
    // --------------------------------------------------------
    public void test1print() {
        hashForSC hsc = new hashForSC(); // new hash for separate chain object.
        hashFL hfl = new hashFL(); // new hash for linear probing object.
        String text = "paragraph paragraph paragraph paragraph paragraph shake shake shake shake shake shake shake shake " +
                "wrist wrist wrist wrist wrist wrist technology technology technology technology technology technology" +
                " gem gem gem gem gem gem gem gem gem gem gem gem gem gem reaction reaction reaction reaction reaction" +
                "nationalist nationalist nationalist nationalist nationalist nationalist impact impact impact impact";

        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            hsc.put(new word(arr[i]));
            hfl.put(new word(arr[i]));

        }

        System.out.println("results for test 1:");
        System.out.println("results for linear probing");

        List<Object> list1 = hfl.print();


        System.out.println("word :     count:      index:");

        System.out.println(list1.get(0) + " " + list1.get(1) + " " + " " + (list1.get(2)));
        System.out.println(list1.get(3) + " " + list1.get(4) + " " + " " + list1.get(5));
        System.out.println(list1.get(6) + " " + list1.get(7) + " " + " " + list1.get(8));


        System.out.println("results for seperate chain");
        List<Object> list = hsc.print(); // list that separate chain returned for the most used three words and their count and their indexes.


        //this is test to see the both algoritms are  working correctly.

        System.out.println("word :     count:      index:");
        System.out.println(list.get(0) + " " + " " + list.get(1) + " " + (list.get(2)));
        System.out.println(list.get(3) + " " + " " + list.get(4) + " " + list.get(5));
        System.out.println(list.get(6) + " " + " " + list.get(7) + " " + list.get(8));


    }

    // --------------------------------------------------------
    // Summary:this method read the string array splits it and puts it into both algorithms.
    // then it returns the results for both algorithms
    // Precondition:there aren't any word in the algorithms to test the codes.
    // Postcondition: there are many words in the algorithms to test the code
    // --------------------------------------------------------
    public void test2print() {
        hashForSC hsc1 = new hashForSC(); // new hash for separate chain object.
        hashFL hfl1 = new hashFL(); // new hash for linear probing object.


        String text = "deadly deadly deadly deadly deadly int int int int int deadly deadly  nec nec nec nec nec nec deadly deadly deadly  deadly deadly deadly speech speech speech speech speech speech speech speech speech speech chair chair chair chair chair nike nike";


        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            hsc1.put(new word(arr[i]));
            hfl1.put(new word(arr[i]));

        }


        System.out.println("results for test 2:");


        System.out.println("results for linear probing");

        List<Object> list1 = hfl1.print();


        System.out.println("word :     count:      index:");

        System.out.println(list1.get(0) + " " + list1.get(1) + " " + " " + (list1.get(2)));
        System.out.println(list1.get(3) + " " + list1.get(4) + " " + " " + list1.get(5));
        System.out.println(list1.get(6) + " " + list1.get(7) + " " + " " + list1.get(8));


        System.out.println("results for seperate chain");
        List<Object> list = hsc1.print(); // list that separate chain returned for the most used three words and their count and their indexes.


        //this is test to see the both algoritms are  working correctly.

        System.out.println("word :     count:      index:");
        System.out.println(list.get(0) + " " + " " + list.get(1) + " " + (list.get(2)));
        System.out.println(list.get(3) + " " + " " + list.get(4) + " " + list.get(5));
        System.out.println(list.get(6) + " " + " " + list.get(7) + " " + list.get(8));


    }
    // --------------------------------------------------------
    // Summary:this method read the string array splits it and puts it into both algorithms.
    // then it returns the results for both algorithms
    // Precondition:there aren't any word in the algorithms to test the codes.
    // Postcondition: there are many words in the algorithms to test the code
    // --------------------------------------------------------

    public void test3print() {

        hashForSC hsc = new hashForSC(); // new hash for separate chain object.
        hashFL hfl = new hashFL(); // new hash for linear probing object.


        String text = "123 123 123 123 345 345 345 345 564 56345 3423 3423 234 3424 3242 2342 12 12 12 12 12 12 12 8989 89 89 89 98 554 54 5435 345 345 345";


        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            hsc.put(new word(arr[i].trim()));
            hfl.put(new word(arr[i].trim()));

        }


        System.out.println("results for test 3:");


        System.out.println("results for linear probing");

        List<Object> list1 = hfl.print();


        System.out.println("word :     count:      index:");

        System.out.println(list1.get(0) + " " + list1.get(1) + " " + " " + (list1.get(2)));
        System.out.println(list1.get(3) + " " + list1.get(4) + " " + " " + list1.get(5));
        System.out.println(list1.get(6) + " " + list1.get(7) + " " + " " + list1.get(8));


        System.out.println("results for seperate chain");
        List<Object> list = hsc.print(); // list that separate chain returned for the most used three words and their count and their indexes.


        //this is test to see the both algoritms are  working correctly.

        System.out.println("word :     count:      index:");
        System.out.println(list.get(0) + " " + " " + list.get(1) + " " + (list.get(2)));
        System.out.println(list.get(3) + " " + " " + list.get(4) + " " + list.get(5));
        System.out.println(list.get(6) + " " + " " + list.get(7) + " " + list.get(8));


    }

    // --------------------------------------------------------
    // Summary:this method read the string array splits it and puts it into both algorithms.
    // then it returns the results for both algorithms
    // Precondition:there aren't any word in the algorithms to test the codes.
    // Postcondition: there are many words in the algorithms to test the code
    // --------------------------------------------------------
    public void test4print() {
        hashForSC hsc = new hashForSC(); // new hash for separate chain object.
        hashFL hfl = new hashFL(); // new hash for linear probing object.
        String text = "beton beton beton necmi necmi beton cigarette cigarette book " +
                "book glass glass glass glass glasses computer computer computer computer computer" +
                " computer computer youtube youtube videos videos videos videos videos videos" +
                "movie movie movie movie movie movie movie movie movie pen pen pen pen pen pen " +
                "rubber rubber rubber rubber rubber cable cable cable cable cable cable cable cable";

        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            hsc.put(new word(arr[i]));
            hfl.put(new word(arr[i]));

        }


        System.out.println("results for test 4:");


        System.out.println("results for linear probing");

        List<Object> list1 = hfl.print();


        System.out.println("word :     count:      index:");

        System.out.println(list1.get(0) + " " + list1.get(1) + " " + " " + (list1.get(2)));
        System.out.println(list1.get(3) + " " + list1.get(4) + " " + " " + list1.get(5));
        System.out.println(list1.get(6) + " " + list1.get(7) + " " + " " + list1.get(8));


        System.out.println("results for seperate chain");
        List<Object> list = hsc.print(); // list that separate chain returned for the most used three words and their count and their indexes.


        //this is test to see the both algoritms are  working correctly.

        System.out.println("word :     count:      index:");
        System.out.println(list.get(0) + " " + " " + list.get(1) + " " + (list.get(2)));
        System.out.println(list.get(3) + " " + " " + list.get(4) + " " + list.get(5));
        System.out.println(list.get(6) + " " + " " + list.get(7) + " " + list.get(8));


    }

    // --------------------------------------------------------
    // Summary:this method read the string array splits it and puts it into both algorithms.
    // then it returns the results for both algorithms
    // Precondition:there aren't any word in the algorithms to test the codes.
    // Postcondition: there are many words in the algorithms to test the code
    // --------------------------------------------------------
    public void test5print() {
        hashForSC hsc = new hashForSC(); // new hash for separate chain object.
        hashFL hfl = new hashFL(); // new hash for linear probing object.

        String text = "book glass glass glass glass glasses computer computer computer computer computer" +
                "ear year year year year year year year year beat beat beat beat word" +
                " capture capture capture capture capture capture capture surgeon surgeon surgeon surgeon" +
                "deadly deadly deadly deadly deadly deadly deadly speech speech speech speech";


        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            hsc.put(new word(arr[i]));
            hfl.put(new word(arr[i]));

        }


        System.out.println("results for test 5:");


        System.out.println("results for linear probing");

        List<Object> list1 = hfl.print();


        System.out.println("word :     count:      index:");

        System.out.println(list1.get(0) + " " + list1.get(1) + " " + " " + (list1.get(2)));
        System.out.println(list1.get(3) + " " + list1.get(4) + " " + " " + list1.get(5));
        System.out.println(list1.get(6) + " " + list1.get(7) + " " + " " + list1.get(8));


        System.out.println("results for seperate chain");
        List<Object> list = hsc.print(); // list that separate chain returned for the most used three words and their count and their indexes.


        //this is test to see the both algoritms are  working correctly.

        System.out.println("word :     count:      index:");
        System.out.println(list.get(0) + " " + " " + list.get(1) + " " + (list.get(2)));
        System.out.println(list.get(3) + " " + " " + list.get(4) + " " + list.get(5));
        System.out.println(list.get(6) + " " + " " + list.get(7) + " " + list.get(8));


    }


    public static void main(String[] args) {

        // --------------------------------------------------------
        // Summary: this is class is written for test the codes.
        // it runs five test with various inputs and returns correct results for both algorithm.
        // --------------------------------------------------------


        test Test = new test();
        Test.test1print();
        System.gc();
        System.out.println();
        System.out.println();
        Test.test2print();
        System.gc();
        System.out.println();
        System.out.println();
        Test.test3print();
        System.gc();
        System.out.println();
        System.out.println();
        Test.test4print();
        System.gc();
        System.out.println();
        System.out.println();
        Test.test5print();


    }
}


