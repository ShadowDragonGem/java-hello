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

import java.io.IOException;
import java.util.*;
import static kiss.API.*;
public class helloworld {

    /**
     * @param args the command line arguments
     */
        void testRun() {
            outExpect("Hello!");
            run();
            outClose();
        }
            
         void run(){
            println("Hello!"); 
        }
         
        void testBoxing(){
            Integer x = new Integer(3);
            Integer y =x;
            ++x;
            assert x.intValue() == 4;
            assert y.intValue() == 3;
            assert y != new Integer(3);
            assert y.equals(new Integer(3));
            assert y.compareTo(new Integer(3)) == 0;
            
        }
        public class Reverse implements Comparator<Integer>{
            @Override
            public int compare(Integer a, Integer b){
                return -a.compareTo(b);
               }
}
        
        void testArrayListInt(){
            ArrayList<Integer> ages = new ArrayList<Integer>();
            ages.add(3);
            ages.add(17);
            ages.add(100);
            
            
            ages.sort(new IntegerReverse());
            ages.sort(new Reverse());
            ages.sort(new Comparator<Integer>(){
                @Override
                public int compare(Integer a, Integer b){
                    return -a.compareTo(b);
                }
            });
            
            ages.sort((a,b)-> -a.compareTo(b));
                        
            for(int age : ages){
                println(age);
            }
        }
        
        void testSet(){
            Set<String> pets = new TreeSet<String>();
            
            pets.add("fluffy");
            pets.add("pookie");
            pets.add("pupper");
            pets.add("doge");
            pets.add("pepe");
            
            for(String pet: pets){
                println(pet);
            }
        }
        
        void testHashMap(){
            Map<String, Integer> petAges = new HashMap<String,Integer>();
            petAges.put("fluffy", 7);
            petAges.put("pookie",2);
            petAges.put("pupper", 100);
            petAges.put("doge", 3);
            petAges.put("pepe", 83);
            
            for (String key: petAges.keySet()){
                println("petAges[" + key + "]="+petAges.get(key));
            }
            
            for(String key : petAges.keySet()){
                petAges.put(key, petAges.get(key)+1);
            }
            
            for(String key:petAges.keySet()){
                println("petAges["+key+"]="+petAges.get(key));
            }
        }
        
        void testTreeMap(){
            Map<String, Integer> petAges = new HashMap<String,Integer>();
            petAges.put("fluffy", 7);
            petAges.put("pookie",2);
            petAges.put("pupper", 100);
            petAges.put("doge", 3);
            petAges.put("pepe", 83);
            
            for (String key: petAges.keySet()){
                println("petAges[" + key + "]="+petAges.get(key));
            }
            
            for(String key : petAges.keySet()){
                petAges.put(key, petAges.get(key)+1);
            }
            
            for(String key:petAges.keySet()){
                println("petAges["+key+"]="+petAges.get(key));
            }
        }
        void doStuff() throws IOException{};
        void doOtherStuff(){};
        void testException(){
            try{
                doStuff();
            } catch (IOException ex){
                doOtherStuff();
            }
        }
        
        void testException2() throws IOException{
            doStuff();
        }
        
        void testLinkedList(){
            List<String> names = new LinkedList<String>();
            
            names.add("doge");
            names.add("fluffy");
            names.add("pepe");
            assert names.get(names.size()-1).equals("pepe");
            
            String[] a = new String[3];
            a[0] = "doge";
            
            assert (a[0]=="doge");
            assert(a[1] == null);
            assert (a[2] == null);
        }
        
        void testCollection(){
            Collection<Integer> c = new LinkedList<Integer>();
            c.add(3);
            c.add(1);
            c.add(7);
            
            assert c.contains(3) == true;
            
            c.remove(3);
            
            assert c.contains(3) == false;
            Iterator<Integer> i  = c.iterator();
            while(i.hasNext()){
                Integer value = i.next();
                println(value);
            }
            
            for(Integer value:c){
                println(value);
            }
        }
}
