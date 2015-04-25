

package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;


public class ThreadPlayer extends Thread {
    
    private MP3Player player;

    public ThreadPlayer(MP3Player player) {
        this.player = player;
    }
    
    @Override
    public  void run(){
        try {
            player.play();
        } catch (JavaLayerException ex) {
            Logger.getLogger(ThreadPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    } 
}
