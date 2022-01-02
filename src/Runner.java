import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//-----------------------------------------------------
//Title: Runner
//Author: Abdusselam koç
//Description: main class to run the program
//you may need to change directories for different test results, I also put my test data as zip file to test the program for different sized data.
//-----------------------------------------------------


public class Runner {


    final long Megabayte = 1024L * 1024l;


    // --------------------------------------------------------
    // Summary:this method calculates length of test data
    // Precondition:unknown length of data.
    // Postcondition:clearly known length of data.
    // --------------------------------------------------------


    public void lengthOfData(String path) {
        long length = 0;

        try {
            File myObj = new File(path);// directory
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = (myReader.nextLine());
                String[] arr = data.split(" ");

                for (int i = 0; i < arr.length; i++) {
                    length += 1;

                }


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        System.out.println("length of the test data:" + length);

    }


    // --------------------------------------------------------
    // Summary:this method reads sentences from test file and splits it to words and puts in linear probing alghoritm.
    // Precondition:there is no word in algorithm
    // Postcondition:there is test data in the algorithm.
    //this method used for calculation of time.
    // --------------------------------------------------------


    public void hflput(String path) {
        hashFL hfl = new hashFL(); // new hash for linear probing object.

        try {
            File myObj = new File(path);// directory
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = (myReader.nextLine());
                String[] arr = data.split(" ");

                for (int i = 0; i < arr.length; i++) {
                    hfl.put(new word(arr[i])); // create a new object and puts it into linear probing.

                }


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        List<Object> list1 = hfl.print();


         System.out.println("word :     count:      index:" );

        System.out.println(list1.get(0) + " " + list1.get(1) + " " + " " + (list1.get(2)));
        System.out.println(list1.get(3) + " " + list1.get(4) + " " + " " + list1.get(5));
        System.out.println(list1.get(6) + " " + list1.get(7) + " " + " " + list1.get(8));




    }
    // --------------------------------------------------------
    // Summary:this method reads sentences from test file and splits it to words and puts in linear probing alghoritm.
    // Precondition:there is no word in algorithm
    // Postcondition:there is test data in the algorithm.
    // this method is used for calculation of memory.
    // --------------------------------------------------------
    public void hflput2(String path) {
        hashFL hfl = new hashFL(); // new hash for linear probing object.

        try {
            File myObj = new File(path);// directory
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = (myReader.nextLine());
                String[] arr = data.split(" ");

                for (int i = 0; i < arr.length; i++) {
                    hfl.put(new word(arr[i])); // create a new object and puts it into linear probing.

                }


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        List<Object> list1 = hfl.print();


        System.out.println("word :     count:      index:" );

        System.out.println(list1.get(0) + " " + list1.get(1) + " " + " " + (list1.get(2)));
        System.out.println(list1.get(3) + " " + list1.get(4) + " " + " " + list1.get(5));
        System.out.println(list1.get(6) + " " + list1.get(7) + " " + " " + list1.get(8));




    }


    // --------------------------------------------------------
    // Summary:this method reads sentences from test file and splits it to words and puts in separate chain algorithm.
    // Precondition:there is no word in algorithm
    // Postcondition:there is test data in the algorithm.
    //this method used for calculation of time.
    // --------------------------------------------------------
    public void hscput(String path) {
        hashForSC hsc = new hashForSC(); // new hash for separate chain object.

        try {
            File myObj = new File(path);// directory
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = (myReader.nextLine());
                String[] arr = data.split(" ");

                for (int i = 0; i < arr.length; i++) {
                    hsc.put(new word(arr[i])); // create a new object and puts it into seperate chaining.

                }


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        List<Object> list = hsc.print(); // list that separate chain returned for the most used three words and their count and their indexes.


        //this is test to see the both algoritms are  working correctly.

         System.out.println("word :     count:      index:" );
        System.out.println(list.get(0) + " " + " " + list.get(1) + " " + (list.get(2)));
        System.out.println(list.get(3) + " " + " " + list.get(4) + " " + list.get(5));
        System.out.println(list.get(6) + " " + " " + list.get(7) + " " + list.get(8));



    }


    // --------------------------------------------------------
    // Summary:this method reads sentences from test file and splits it to words and puts in separate chain algorithm.
    // Precondition:there is no word in algorithm
    // Postcondition:there is test data in the algorithm.
    // this method is used for calculation of memory.
    // --------------------------------------------------------







    public void hscput2(String path) {
        hashForSC hsc = new hashForSC(); // new hash for separate chain object.

        try {
            File myObj = new File(path);// directory
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = (myReader.nextLine());
                String[] arr = data.split(" ");

                for (int i = 0; i < arr.length; i++) {
                    hsc.put(new word(arr[i])); // create a new object and puts it into seperate chaining.

                }


            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        List<Object> list = hsc.print(); // list that separate chain returned for the most used three words and their count and their indexes.


        //this is test to see the both algoritms are  working correctly.

        System.out.println("word :     count:      index:" );
        System.out.println(list.get(0) + " " + " " + list.get(1) + " " + (list.get(2)));
        System.out.println(list.get(3) + " " + " " + list.get(4) + " " + list.get(5));
        System.out.println(list.get(6) + " " + " " + list.get(7) + " " + list.get(8));



    }
// --------------------------------------------------------
    // Summary: this method calculates the time during test.
    // Precondition:time is not calculated.
    // Postcondition: time is calculated.
    // --------------------------------------------------------

    public void hflTime(String path) {
        long startTime1 = System.currentTimeMillis();
        hflput(path);
        long stopTime1 = System.currentTimeMillis();
        long elapsedTime1 = stopTime1 - startTime1;

        System.out.println("hfl run time: " + elapsedTime1);
    }


    // --------------------------------------------------------
    // Summary: this method calculates the time during test.
    // Precondition:time is not calculated.
    // Postcondition: time is calculated.
    // --------------------------------------------------------


    public void hscTime(String path) {
        long startTime = System.currentTimeMillis();
        hscput(path);
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;

        System.out.println("hsc run time: " + elapsedTime);
    }


    // --------------------------------------------------------
    // Summary:this method calculates memory usage during test.
    // Precondition:memory usage is not calculated.
    // Postcondition:memory usage is calculated.
    // --------------------------------------------------------


    public void hflMemory(String path) {
        hflput2(path);
        Runtime runtime = Runtime.getRuntime(); //system.runtime.
        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("hfl memory:" + memory / 1024 + " kb");


    }
    // --------------------------------------------------------
    // Summary:this method calculates memory usage during test.
    // Precondition:memory usage is not calculated.
    // Postcondition:memory usage is calculated.
    // --------------------------------------------------------

    public void hscMemory(String path) {
        hscput2(path);
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();
        long memory = runtime.totalMemory() - runtime.freeMemory();


        System.out.println("hsc memory:" + memory / 1024 + " kb");

    }


    // --------------------------------------------------------
    // Summary: main method to call other classes and their methods
    // Precondition: the other classes and methods not called.
    // Postcondition: the other classes and methods are called.
    // --------------------------------------------------------
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        String path = "src/test.txt";
        Runner runner = new Runner();// new runner object to call methods.
        runner.lengthOfData(path); // calculate length of data.

        System.out.println("time and memory calculator for separate chain implementation");
        runner.hscTime(path);
        runner.hscMemory(path);


        System.out.println("time and memory calculation for linear probing implementation");
        runner.hflTime(path);
        runner.hflMemory(path);

    }

}