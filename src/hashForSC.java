import java.util.Arrays;
import java.util.List;


//-----------------------------------------------------
//Title: Runner
//Author: Abdusselam koç
//ID:
//Section: 1
//Description: hash code implementation for separate chaining
//-----------------------------------------------------


class hashForSC {

    public int SN = 0; //the Number of N
    public int M = 16; //size of the Node array
    private Node[] st = new Node[M]; //Node array to keep chains of Nodes


    private class Node { //Node class to create Node objects

        public Node(word wrd, hashForSC.Node node) { // constructor to create Node
            // TODO Auto-generated constructor stub

            this.key = wrd; //keys
            //value
            this.next = node; // next Node
            SN++;
        }


        private int value;
        private word key;
        private int index = 0;
        private Node next;

        @Override
        public String toString() {
            return "Node [key=" + key + "index=" + index + " next=" + next + "]";
        }
    }

    // --------------------------------------------------------
    // Summary: create hash according to M and hashcode
    // Precondition: a long number that represent hash
    // Postcondition: a short number that represent hash
    // --------------------------------------------------------

    public int hash(word wrd) {

        return (wrd.hashcode & 0x7fffffff) % M;

    }


    // --------------------------------------------------------
    // Summary: checks whether there are an equality between input and stored words
    // Precondition: equality is unknown
    // Postcondition: equality is known
    // --------------------------------------------------------

    public int check(word wrd) {

        int i = hash(wrd);

        if (st[i] == null) {
            return 0;
        }
        Node x = st[i];
        while (x != null) {
            if (x.key.Wordfr.equals(wrd.Wordfr)) {
                x.key.count++;
                return 5;
            }
            x = x.next;
        }


        return 0;
    }

    // --------------------------------------------------------
    // Summary: creates Nodes correctly to and add the chained aacording to their order.
    // Precondition:new Node is not created and not added the chained array.
    // Postcondition: new Node is created and added the chained array.
    // --------------------------------------------------------

    public void createNode(word wrd) {
        int i = hash(wrd);

        if (st[i] == null) {

            st[i] = new Node(wrd, null);
            st[i].index = 0;

        } else {
            int index = 1;
            Node x = st[i];
            while (x.next != null) {
                index++;
                x = x.next;

            }

            x.next = new Node(wrd, null);
            x.next.index = index;
        }

    }


    // --------------------------------------------------------
    // Summary:decides whether create a node or not
    // Precondition:we don't know whether we should create a node or not.
    // Postcondition: we know whether should  create a Node and add the chained array or not.
    // --------------------------------------------------------
    public void put(word wrd) {
        int chek = check(wrd);

        if (chek != 5) {
            createNode(wrd);

        }

        if (SN != 0 && (SN / M) >= 8) {
            expand();

        }


    }


    // --------------------------------------------------------
    // Summary: search all array and notes to return the most used three object that we have.
    // Precondition:the most used three object is unknown.
    // Postcondition:the most used three object is known and returned to user.
    // --------------------------------------------------------


    public List<Object> print() {
        word wordFirst = new word("text"), wordSecond = new word("text"), wordThird = new word("text");
        int index1 = 0, index2 = 0, index3 = 0;

        for (int i = 0; i < M; i++) {

            if (st[i] != null) {
                Node x = st[i];
                while (x.next != null) {
                    if (x.key.count > wordFirst.count) {
                        wordFirst = x.key;
                        index1 = x.index;
                    }
                    x = x.next;

                }
                if (x.key.count > wordFirst.count) {
                    wordFirst = x.key;
                    index1 = x.index;
                }


            }

        }
        for (int i = 0; i < M; i++) {

            if (st[i] != null) {
                Node x = st[i];
                while (x.next != null) {
                    if (x.key.count < wordFirst.count && x.key.count > wordSecond.count) {
                        wordSecond = x.key;
                        index2 = x.index;
                    }
                    x = x.next;
                }
                if (x.key.count < wordFirst.count && x.key.count > wordSecond.count) {
                    wordSecond = x.key;
                    index2 = x.index;
                }
            }

        }
        for (int i = 0; i < M; i++) {
            if (st[i] != null) {
                Node x = st[i];
                while (x.next != null) {
                    if (x.key.count > wordThird.count && x.key.count < wordSecond.count) {
                        wordThird = x.key;
                        index3 = x.index;
                    }
                    x = x.next;
                }
                if (x.key.count > wordThird.count && x.key.count < wordSecond.count) {
                    wordThird = x.key;
                    index3 = x.index;
                }

            }
        }


        return Arrays.asList(wordFirst.Wordfr, index1, wordFirst.count, wordSecond.Wordfr, index2, wordSecond.count, wordThird.Wordfr, index3, wordThird.count);
        // returns a list that keeps the words, indexes and the number of words.
    }


    // --------------------------------------------------------
    // Summary: expands the array in case of needed.
    // Precondition: the array is not expanded
    // Postcondition: array is expanded and objects rehashed.
    // --------------------------------------------------------


    public void expand() {

        M = M * 2;

        Node[] st1 = new Node[M];
        Node[] st2 = new Node[M];

        System.arraycopy(st, 0, st1, 0, st.length); //copy the array to a temporary array to be able put values again to array.
        st = st2; //empty and resize the main array.

        for (int i = 0; i < M && st[i] != null; i++) {
            for (Node x = st[i]; x != null; x = x.next) {
                SN--; //decrease N to keep right N.
                put(x.key); // rehash and put the values into array again.

            }

        }
    }


}