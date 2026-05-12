/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumarhilospool;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class Core {
    public interface Kernel32 extends Library{          
            Kernel32 INSTANCE = Native.load("kernel32", Kernel32.class);        
            int GetCurrentProcessorNumber();    
    };
    
    public static int getCurrentProcessorNumber(){
        return Kernel32.INSTANCE.GetCurrentProcessorNumber();
    }        
}
