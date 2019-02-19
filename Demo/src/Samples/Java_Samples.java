package Samples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Java_Samples {
    public static void main(String[] args) {
//        ArrayList<String> wordDulicate = new ArrayList<String>();
//
//        wordDulicate.add("w");
//        wordDulicate.add("z");
//        wordDulicate.add("e");
//        wordDulicate.add("f");
//        wordDulicate.add("fd");
//        wordDulicate.add("a");

//        ArrayList<String> nonDupList = new ArrayList<String>();

//        Iterator<String> dupIter = wordDulicate.iterator();
//        while(dupIter.hasNext())
//        {
//            String dupWord = dupIter.next();
//            if(nonDupList))
//            {
//                System.out.println("A"+nonDupList);
//                nonDupList.clear();
////                dupIter.remove();
//            }else
//            {
//                nonDupList.add(dupWord);
//            }
//        }
//        System.out.println(nonDupList);
//        Collections.max(wordDulicate);
//            Iterator itr = wordDulicate.iterator();
//            while (itr.hasNext()) {
//                itr.next();
//                System.out.println(wordDulicate);
//
//            }
                ArrayList<Integer> arrlist = new ArrayList<Integer>();

                arrlist.add(12);
                arrlist.add(20);
                arrlist.add(45);

                System.out.println("Printing list1:");
                for (Integer number : arrlist)
                    System.out.println("Number = " + number);

                ArrayList<Integer> arrlist2 = new ArrayList<Integer>();


                arrlist2.add(25);
                arrlist2.add(30);
                arrlist2.add(31);
                arrlist2.add(35);

                System.out.println("Printing list2:");
                for (Integer number : arrlist2)
                    System.out.println("Number = " + number);

                arrlist.addAll(arrlist2);

                System.out.println("Printing all the elements");

                for (Integer number : arrlist)
                    System.out.println("Number = " + number);

    }
}
