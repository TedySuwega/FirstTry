/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multithreading;

import javazoom.jl.decoder.JavaLayerException;

/**
 *
 * @author asus pc
 */
public class Multithreading {

    /**
     * @param args the command line arguments
     * @throws javazoom.jl.decoder.JavaLayerException
     */
    public static void main(String[] args) throws JavaLayerException {
        // TODO code application logic here
        MP3Player p1 = new MP3Player("lagu 01.mp3");
        MP3Player p2 = new MP3Player("lagu 02.mp3");
        MP3Player p3 = new MP3Player("lagu 03.mp3");
        
        ThreadPlayer t1 = new ThreadPlayer(p1);
        ThreadPlayer t2 = new ThreadPlayer(p2); 
        ThreadPlayer t3 = new ThreadPlayer(p3);
        
        /*t1.start(); // task 1
        t2.start();
        t3.start();*/
        
       // p1.play();  // task 2
        p2.play();
        p3.play();
        
        /*try{          // task 3
            t1.start();
            Thread.sleep(4000);
            t2.start();
            Thread.sleep(1000);
            t3.start();
        }catch(Exception e){
            
        }*/
        
        
        
    }
    
}
