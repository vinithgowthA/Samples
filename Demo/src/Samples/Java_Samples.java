package Samples;

import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Java_Samples {


//        public static String reverseRecursively(String str) {
//
//            if (str.length() < 2) {
//                return str;
//            }
//
//            return reverseRecursively(str.substring(1)) + str.charAt(0);
//        }
//    public String number() {
//        String number = "wde";
//
//        return number;
//    }
//
    public static void main(String args[]) {
//            Java_Samples jv = new Java_Samples();
//            String str = "I am batman";
//            System.out.println(reverseRecursively(str));
//        }
//        ArrayList<String> wordDuplicate = new ArrayList<>();
//        wordDuplicate.
//        wordDuplicate.add("qwe");
//        wordDuplicate.add("qwe");

//        List<Integer> nonDupList = wordDulicate.stream().distinct().collect(Collectors.toList());

//        System.out.println("Highest Nuber in list: " + Collections.max(wordDulicate));
//        int high = 0;
//        for (int i = 0; i <=wordDulicate.size(); i++) {
//
//            for (int j = i + 1; j < wordDulicate.size(); j++) {
//
//                if (wordDulicate.get(i).equals(wordDulicate.get(j))) {
//                    wordDulicate.remove(i);
////                    if (high < wordDulicate.get(i)) {
//                        high = wordDulicate.get(i);
////                    }
//                }
//            }
//        }
//        System.out.println("Repeated Highest Number: " + high);
//
//        System.out.println("Printing Non Duplicate list: " + wordDulicate);
//        Iterator<String> itr = wordDulicate.iterator();
//        while (itr.hasNext()) {
//            String dupword = itr.next();
//            if(wordDulicate.contains(dupword)) {
//                wordDulicate.remove(itr);
//            }
//            System.out.println(dupword);
//        }

//        List<String> nonDupList  = wordDulicate.stream().distinct().collect(Collectors.toList() );
        ArrayList<String> wordDuplicate = new ArrayList<>();
        wordDuplicate.add("fdghfdh");
        wordDuplicate.add("qwe");
        wordDuplicate.add("qwe");

       ArrayList<String> nonDupList = new ArrayList<String>();
        Iterator<String> dupIter = wordDuplicate.iterator();
        while(dupIter.hasNext()) {
            String dupWord = dupIter.next();
            if(nonDupList.contains(dupWord))
            {
                dupIter.remove();

            }else
            {
                nonDupList.add(dupWord);
            }
        }
        System.out.println(nonDupList);
//        Collections.max(wordDulicate);
//            Iterator itr = wordDulicate.iterator();
//            while (itr.hasNext()) {
//                itr.next();
//                System.out.println(wordDulicate);
//   }

//        public static void main(String[] args) {
//
//            long s = System.currentTimeMillis();
//
//            List<Integer> list1 = new ArrayList<Integer>(Collections.nCopies(4000, 1));
//            List<Integer> list2 = new ArrayList<Integer>(Collections.nCopies(5, 5));
//
//            for (Integer a: list2) {
//
//                for (Integer r: list1) {
//                    System.out.println(r);
//                }
//            }
//            long e = System.currentTimeMillis();
//            long z = e-s;
//            System.out.println("END time is:" + z);
//
        }
}




