/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author deser
 */

import static kiss.API.*;
public class helloworld {

    /**
     * @param args the command line arguments
     */
        void testRun() {
            try(Close out = outExpect("Hello!"))
            {run();}
        }
            
         void run(){
            println("Hello!"); 
        }
         
         void testBooleans()
         {
             assert true !=false;
             assert true == true;
             assert false == false;
             try(Close out = outExpect("true")) {println(true);}
             try(Close out = outExpect("false")) {println(false);}

             assert !true== false;
             assert !false == true;
             
             assert (true && true) == true;
             assert (true && false) == false;
             assert (false && true) == false;
             assert (false && false) == false;
             
             assert (true || true) == true;
             assert (true || false) == true;
             assert (false || true) == true;
             assert (false || false) == false;
         }
         
         void testInts(){
             assert Integer.MAX_VALUE ==Math.pow(2, 31)-1;
             assert Integer.MIN_VALUE ==-Math.pow(2, 31);
             assert Integer.MIN_VALUE - 1 == Integer.MAX_VALUE;
             assert Integer.MAX_VALUE +1 == Integer.MIN_VALUE;
             
             int x = 3;
             int y = 0xffff;
             int z = 0b10_01;
             
             assert x==3;
             assert y ==65_535;
             assert z == 9;
             
             assert Integer.toString(x, 10).equals("3");
             assert Integer.toString(y, 16).equals("ffff");
             assert Integer.toString(z, 2).equals("1001");
         }
}
