
package multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MP3Player {
    
    private String filePath;
    
    public MP3Player(String filePath) {
        this.filePath = filePath;
    }
    
    public synchronized void play() throws JavaLayerException{
        try{
            FileInputStream fis = new FileInputStream(filePath);
            Player p = new Player(fis);
            p.play();
        }catch(FileNotFoundException exc){
            System.out.println(" !!!!!FILE "+filePath+" TIDAK DITEMUKAN!!!!!! ");  
        }catch(JavaLayerException exc){
            System.out.println(" ERROR while playing file "+filePath);
        }        
    }
    
   
}
