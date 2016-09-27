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
   
    void testClock() {
        Clock clock = test(new Clock());
    }
    
    void testTimezoneClock()
    {
        TimezoneClock tzClock = test(new TimezoneClock());
    }
}
