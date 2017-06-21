package game.util;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

//管理图片加载
public class GameImages {
	private static Image logo;
	private static Image[] numbers;
	
	static{ //静态初始化块
		String path = GameConfig.getSkinPathString();
		logo = new ImageIcon("imgs/"+path+"/logo.jpg").getImage();
		numbers = splitImages("imgs/"+path+"/numbers.png",10);
	}

	public static Image getLogo() {
		return logo;
	}

	public static Image getNumber(int num){
		return  numbers[num];
	}
	
	private static Image[] splitImages(String name, int len) {
		Image src = new ImageIcon(name).getImage();
		int iw = src.getWidth(null) / len;
		int ih = src.getHeight(null);
		Image[] imgs = new Image[len];
		for(int i = 0;i < 10;i++){
			BufferedImage img = new BufferedImage(iw, ih, BufferedImage.TRANSLUCENT);
			Graphics g = img.getGraphics();
			g.drawImage(src, 0, 0, iw, ih,
					i*iw, 0, (i+1)*iw, ih, null);
			imgs[i] = img; 
		}
		return imgs;
	}

}
