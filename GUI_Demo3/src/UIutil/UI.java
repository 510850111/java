/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UIutil;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Oscar
 */
public class UI {
    private UI(){}
    
    public static void setJFrameImage(JFrame jf){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Image i = tk.getImage("src\\UIUtil\\1.jpg");
//       Image i = tk.getImage("1.jpg");
        jf.setIconImage(i);
    }
    
    public static void setJFrameLocateCenter(JFrame jf) {
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d =  tk.getScreenSize();
        double screenHeight = d.getHeight();
        double screenWidth = d.getWidth();
        
        int frameWidth = jf.getWidth();
        int frameHeight = jf.getHeight();
        
        int height = (int)(screenHeight-frameHeight)/2;
        int width = (int)(screenWidth-frameWidth)/2;
        
        jf.setLocation(width, height);
        
    }
    
}
