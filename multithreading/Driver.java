/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multithreading;

/**
 *
 * @author asus pc
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        COBA c1 = new COBA("Salim ","Imaduddiyan\n");
        COBA c2 = new COBA("Tedy ","Suwega\n");
        c1.start();
        c2.start();
    }
    
}
