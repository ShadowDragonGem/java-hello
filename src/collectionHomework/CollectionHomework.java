/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionHomework;
import java.util.*;
import static kiss.API.*;

/**
 *
 * @author Sarah Harvey
 */
public class CollectionHomework {
    /*
    Problem on hakerRank
    https://www.hackerrank.com/challenges/java-hashset
    plus some more things to make it more interesting
    */
    
    void testPairsUnique(){
        String test_left1 = "rachel";
        String test_right1 = "tim";
        String test_left2 = "sam";
        String test_right2 = "dee";
        
        HashSet<String> pairs = new HashSet<String>();
        try(Close out = outExpect( "[(sam, dee),(rachel, tim)]")){
            pairs.add("(" + test_left1 + ", " + test_right1 + ")");
            pairs.add("(" + test_left2 + ", " + test_right2 + ")");
            println(pairs);
        }
    }
    
    void testPairsDuplicate(){
        String test_left1 = "lily";
        String test_right1 = "alex";
        String test_left2 = "drake";
        String test_right2 = "frank";
        
        HashSet<String> pairs = new HashSet<String>();
        try(Close out = outExpect( "[(lily, alex),(drake, frank)]")){
            pairs.add("(" + test_left1 + ", " + test_right1 + ")");
            pairs.add("(" + test_left2 + ", " + test_right2 + ")");
            pairs.add("(" + test_left2 + ", " + test_right2 + ")");
            println(pairs);
        }
    }
    
    void testRemovePair(){
        String test_left1 = "cleo";
        String test_right1 = "peter";
        String test_left2 = "pat";
        String test_right2 = "fire";
        
        HashSet<String> pairs = new HashSet<String>();
        try(Close out = outExpect( "[(cleo, peter),(pat, fire)]")){
            pairs.add("(" + test_left1 + ", " + test_right1 + ")");
            pairs.add("(" + test_left2 + ", " + test_right2 + ")");
            pairs.add("(" + test_left2 + ", " + test_right2 + ")");
            println(pairs);
        }
        String newPair = "(sherlock, john)";
        pairs.add(newPair);
        try(Close out = outExpect("[(cleo, peter),(sherlock, john),(pat, fire)]")){
                println(pairs);
        }
        pairs.remove("(pat, fire)");
        try (Close out = outExpect("[(cleo, peter),(sherlock, john)]")){
            println(pairs);
        }
    }
    
    void run() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for(int i = 0; i<t; i++){
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        HashSet<String> pairs = new HashSet<String>();
        
        for(int i = 0; i<t; i++){
            pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")");
            println(pairs.size());
        }
        println(pairs);
    }
}
