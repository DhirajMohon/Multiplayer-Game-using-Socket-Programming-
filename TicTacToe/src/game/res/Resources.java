package game.res;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Resources {
	
	public static BufferedImage[] letters;
	
	static {
		letters =new BufferedImage[2];
		letters[0] = loadImage("/pic/x.png");
		letters[1] = loadImage("/pic/o.png");
	}
	
	private static BufferedImage loadImage(String path) {
	    try {
	        var resource = Resources.class.getResource(path);
	        if (resource == null) {
	            throw new IllegalArgumentException("Image not found: " + path);
	        }
	        return ImageIO.read(resource);
	    } catch (IOException e) {
	        e.printStackTrace();
	        System.exit(-1);
	    }
	    return null;
	}
	
}
