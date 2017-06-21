package game.util;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class GameImages {
	private static Image[] nums;
	
	static{
		String path = GameConfig.getSkinPath();
		nums = splitImages("imgs/"+path+"/numbers.png", 10);
	}
	
	public static Image getNumber(int num){
		return nums[num];
	}

	private static Image[] splitImages(String name, int len) {
		Image[] imgs = new Image[len];
		Image src = new ImageIcon(name).getImage();
		int iw = src.getWidth(null) / len;
		int ih = src.getHeight(null);
		for(int i = 0; i < len; i++){
			BufferedImage img = new BufferedImage(iw, ih, 
					BufferedImage.TRANSLUCENT);
			Graphics g = img.getGraphics();
			g.drawImage(src, 0, 0, iw, ih, 
					i*iw, 0, (i+1)*iw, ih, null);
			imgs[i] = img;
			
		}
		return imgs;
	}
}
