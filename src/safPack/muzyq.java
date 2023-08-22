/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package safPack;

/**
 *
 * @author G50
 */
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
public class muzyq {
    
    FileInputStream FIS;
    BufferedInputStream BIS;
    
    public Player player;
    
    public void play(String path){
    try{
    FIS=new FileInputStream(path);
    BIS=new BufferedInputStream(FIS);
    
    player=new Player(BIS);
    }catch(FileNotFoundException | JavaLayerException ex){
    
    }
    new Thread(){
        @Override
        public void run(){
            try {
                player.play();
            } catch (JavaLayerException ex) {
               
            }
        }
    }.start();
        }
    }
    

