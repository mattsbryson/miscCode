import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class JFrameWriter {
    
    public static void main(String[] args) {
        
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    	double width = screenSize.getWidth();
    	double height = screenSize.getHeight();
    	
        try {
            
            Robot robot = new Robot();
            // Capture the screen shot of the area of the screen defined by the rectangle
            BufferedImage bi=robot.createScreenCapture(new Rectangle((int)width,(int)height));
            ImageIO.write(bi, "jpg", new File("C:/Users/mbryson/Desktop/imageTest.jpg"));
            
        } catch (AWTException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}