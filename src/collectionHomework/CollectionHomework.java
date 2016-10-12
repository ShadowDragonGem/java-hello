/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionHomework;
import java.util.Scanner;
import static kiss.API.*;

/**
 *
 * @author deser
 */
public class CollectionHomework {
    
    
    void run() {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for(int i = 0; i<t; i++){
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
    }
}
