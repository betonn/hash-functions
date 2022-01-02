


//-----------------------------------------------------
//Title: Word
//Author: Abdusselam koç
//ID:
//Section: 1
//Description: class to create word objects
//-----------------------------------------------------

public class word  {


    public word(String wrd) { // constructor to create a new word object.
        // TODO Auto-generated constructor stub
        this.Wordfr= wrd;
        hashCode(wrd); // calls hashcode to create and assign the hashcode to the word objects.


    }

    String Wordfr; // word that we are going work on it.
    int count=1; // counter to count number of times that word is used.
    int hashcode=0; // hashcode that represent the word.



    // --------------------------------------------------------
    // Summary: methods that calculates hashcode of words and assign that code to their objects
    // Precondition: hashcode is not calculated.
    // Postcondition: hashcode is calculated.
    // --------------------------------------------------------

    private void hashCode(String wrd) {

        int h =0;
        for (int i = 0; i < wrd.length(); i++)
            h = wrd.charAt(i) + (31 * h);

        hashcode=h;


    }
 // to string method to return object as a string.
    @Override
    public String toString() {
        return "word [Word=" + Wordfr + ", count=" + count + "]";
    }
}
