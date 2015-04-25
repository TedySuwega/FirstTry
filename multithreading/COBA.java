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
public class COBA extends Thread {
    private String a;
    private String b;

    public COBA(String a, String b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public synchronized void run(){
        try{
            System.out.println(a);
            Thread.sleep(2000);
            System.out.println(b);
        }catch (Exception e){
            
        }
    }
}
