/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.hekuan;

import java.awt.Dimension;
import java.awt.Image;
//import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *这个里面包含了设置窗体的图标和窗体位置功能
 * @author oscar
 */
public class UI {
    private UI(){}
    
    /**
     * 设置窗体的图标
     * @param jf
     */
    public static void setJFrameImage(JFrame jf){
    	Toolkit toolkit = Toolkit.getDefaultToolkit();
    	String ImagePath = "start.png";
		Image image = toolkit.getImage(ImagePath);
//    	jf.setIconImage(image);
    	try {
    		jf.setIconImage(image);
		} catch (Exception e) {
			// TODO: handle exception
		}
    }
    
    /**
     * 设置窗体位置为居中
     * @param jf
     */
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
