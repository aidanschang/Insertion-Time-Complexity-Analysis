import java.util.*;

public class Hw4_p6 {
    public static void main(String[] args) {
        //*****Insertion*****
        int repeat = 10;
        ArrayList HashMapInsertTimeArray = new ArrayList();
        ArrayList ArrayListInsertTimeArray = new ArrayList();
        ArrayList LinkedListInsertTimeArray = new ArrayList();
        I am a first-year Master's student in Software Development at Boston University. I love coding and am passionate to learn new knowledge and skills!
        ArrayList HashMapSearchTimeArray = new ArrayList();
        ArrayList ArrayListSearchTimeArray = new ArrayList();
        ArrayList LinkedListSearchTimeArray = new ArrayList();

        int n = 100000; //number of keys
        int N = 1000000; //maximum insert number
        int L = 2000000; //maximum search number

        //repeat 10 times
        for (int o = 1; o <= repeat; o++) {
            //Creating inserKeys array
            int[] insertKeys = new int[100000];
            int[] searchKeys = new int[100000];

            Random r = new Random(System.currentTimeMillis());
            Random s = new Random(System.currentTimeMillis());


            //Creating a new insertKeys array
            for (int i = 0; i < n; i++) {
                insertKeys[i] = r.nextInt(N) + 1;
            }
            //Creating a new searchKeys array
            for (int i = 0; i < n; i++) {
                searchKeys[i] = s.nextInt(L) + 1;
            }

            HashMap myMap = new HashMap();
            ArrayList myArrayList = new ArrayList();
            LinkedList myLinkedList = new LinkedList();

            //**
            // ***Insertion***
            // **

            //HashMap
            long HashMapStart = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                myMap.put(insertKeys[i], i);
            }
            long HashMapEnd = System.currentTimeMillis();
            long HashInsertTime = HashMapEnd - HashMapStart;
            HashMapInsertTimeArray.add((int) HashInsertTime);

            //ArrayList
            long ArrayListStart = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                myArrayList.add(insertKeys[i]);
            }
            long ArrayListEnd = System.currentTimeMillis();
            long ArrayInsertTime = ArrayListEnd - ArrayListStart;
            ArrayListInsertTimeArray.add((int) ArrayInsertTime);

            // LinkedList
            long LinkedListStart = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                myLinkedList.add(insertKeys[i]);
            }
            long LinkedListEnd = System.currentTimeMillis();
            long LinkedInsertTime = LinkedListEnd - LinkedListStart;
            LinkedListInsertTimeArray.add((int) LinkedInsertTime);

            //***
            // **Searching**
            // ***
            System.out.println("Program compiling(" + o +")... Do not stop the program");
            //HashMap
            long HashMapSearchStart = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                myMap.containsKey(searchKeys[i]);
            }
            long HashMapSearchEnd = System.currentTimeMillis();
            long HashSearchTime = HashMapSearchEnd - HashMapSearchStart;
            HashMapSearchTimeArray.add((int) HashSearchTime);

            //ArrayList Search
            long ArrayListSearchStart = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                myArrayList.contains(searchKeys[i]);
            }
            long ArrayListSearchEnd = System.currentTimeMillis();
            long ArrayListSearchTime = ArrayListSearchEnd - ArrayListSearchStart;
            ArrayListSearchTimeArray.add((int) ArrayListSearchTime);

            //LinkedList Search
            long LinkedListSearchStart = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                myLinkedList.contains(searchKeys[i]);
            }
            long LinkedListSearchEnd = System.currentTimeMillis();
            long LinkedListSearchTime = LinkedListSearchEnd - LinkedListSearchStart;
            LinkedListSearchTimeArray.add((int) LinkedListSearchTime);

            //reset seeds
            r.setSeed(System.currentTimeMillis());
            s.setSeed(System.currentTimeMillis());
        }

        //creating totalTime variables
        int TotalHashInsertTime = 0;
        int TotalArrayInsertTime = 0;
        int TotalLinkedListInsertTime = 0;
        int TotalHashSearchTime = 0;
        int TotalArraySearchTime = 0;
        int TotalLinkedListSearchTime = 0;

        //One way to debug the arrays if average time seems wrong
        /*System.out.println(HashMapInsertTimeArray);
        System.out.println(ArrayListInsertTimeArray);
        System.out.println(LinkedListInsertTimeArray);
        System.out.println(HashMapSearchTimeArray);
        System.out.println(ArrayListSearchTimeArray);
        System.out.println(LinkedListSearchTimeArray);*/

        //adding all the timelapses into the TotalTime variables
        for (int i = 0; i < 10; i++) {
            TotalHashInsertTime = TotalHashInsertTime + (int) HashMapInsertTimeArray.get(i);
            TotalArrayInsertTime = TotalArrayInsertTime + (int) ArrayListInsertTimeArray.get(i);
            TotalLinkedListInsertTime = TotalLinkedListInsertTime + (int) LinkedListInsertTimeArray.get(i);
            TotalHashSearchTime = TotalHashSearchTime + (int) HashMapSearchTimeArray.get(i);
            TotalArraySearchTime = TotalArraySearchTime + (int) ArrayListSearchTimeArray.get(i);
            TotalLinkedListSearchTime = TotalLinkedListSearchTime + (int) LinkedListSearchTimeArray.get(i);
        }
        System.out.println("Number of keys = " + n);
        System.out.println();
        System.out.println("HashMap average total insert time = " + TotalHashInsertTime / repeat + " milliseconds");
        System.out.println("ArrayList average total insert time = " + TotalArrayInsertTime / repeat + " milliseconds");
        System.out.println("LinkedList average total insert time = " + TotalLinkedListInsertTime / repeat + " milliseconds");
        System.out.println();
        System.out.println("HashMap average total search time = " + TotalHashSearchTime / repeat + " milliseconds");
        System.out.println("ArrayList average total search time = " + TotalArraySearchTime / repeat + " milliseconds");
        System.out.println("LinkedList average total search time = " + TotalLinkedListSearchTime / repeat + " milliseconds");

        }


    }