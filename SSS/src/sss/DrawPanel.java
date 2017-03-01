/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sss;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author S525893
 */
public class DrawPanel extends JPanel {

    private BufferedImage image, track, track1, track3, track4, boston, alewife, melrose, medford, stoneham, reading;
    private BufferedImage trackg, track1g, track3g, track4g;

    public DrawPanel() {

        try {
            image = ImageIO.read(new File("train.jpg"));
            track = ImageIO.read(new File("track.png"));
            track1 = ImageIO.read(new File("track1.png"));
            track3 = ImageIO.read(new File("track3.png"));
            track4 = ImageIO.read(new File("track4.png"));
            trackg = ImageIO.read(new File("trackg.png"));
            track1g = ImageIO.read(new File("track1g.png"));
            track3g = ImageIO.read(new File("track3g.png"));
            track4g = ImageIO.read(new File("track4g.png"));
            boston = ImageIO.read(new File("boston.png"));
            alewife = ImageIO.read(new File("alewife.png"));
            melrose = ImageIO.read(new File("melrose.png"));
            medford = ImageIO.read(new File("medford.png"));
            stoneham = ImageIO.read(new File("stoneham.png"));
            reading = ImageIO.read(new File("reading.png"));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("here");
        }
    }

    public void paintComponent(Graphics g) {

        /*
			 * g.setColor(Color.BLUE); g.fillRect(0, 0, this.getWidth(),
			 * this.getHeight()); g.setColor(Color.RED); g.fillRect(3, 3,
			 * this.getWidth()-6, this.getHeight()-6);
         */
        g.setColor(Color.WHITE);
        g.fillRect(6, 6, this.getWidth() - 12, this.getHeight() - 12);
        /*
			 * g.setColor(Color.BLACK); g.fillRect(oneX, oneY, 6, 6);
         */
        // draw lines
        g.setColor(Color.BLACK);
        // ok
        g.drawImage(track, 40, 40, 80, 20, this);	// 1-1
        g.drawImage(track, 120, 40, 80, 20, this);	// 1-1
        g.drawImage(track, 200, 40, 80, 20, this);	// 2-1
        g.drawImage(track, 280, 40, 80, 20, this);	// 3-1
        g.drawImage(track, 360, 40, 80, 20, this);	// 3-1
        g.drawImage(track, 440, 40, 80, 20, this);	// 4-1
        g.drawImage(track, 520, 40, 80, 20, this);	// 5-1
        g.drawImage(track, 600, 40, 60, 20, this);	// 6-1
        // ok
        g.drawImage(track, 40, 90, 80, 20, this);	// 1-2
        g.drawImage(track, 120, 90, 80, 20, this);	// 1-2

        g.drawImage(track, 40, 680, 80, 20, this);
        g.drawImage(track, 120, 680, 80, 20, this);
        g.drawImage(track, 200, 680, 80, 20, this);
        g.drawImage(track, 280, 680, 80, 20, this);
        g.drawImage(track, 360, 680, 80, 20, this);
        g.drawImage(track, 440, 680, 80, 20, this);
        g.drawImage(track, 520, 680, 80, 20, this);
        g.drawImage(track, 600, 680, 60, 20, this);

        // ok
        g.drawImage(track, 40, 145, 80, 20, this);	// 1-3
        g.drawImage(track, 120, 145, 80, 20, this);
        g.drawImage(track, 200, 145, 80, 20, this);
        g.drawImage(track, 280, 145, 20, 20, this);
        // ok
        g.drawImage(track, 350, 90, 80, 20, this);
        g.drawImage(track, 430, 90, 80, 20, this);
        g.drawImage(track, 510, 90, 80, 20, this);
        g.drawImage(track, 580, 90, 50, 20, this);
        // ok
        g.drawImage(track, 395, 290, 80, 20, this);
        g.drawImage(track, 475, 290, 80, 20, this);
        g.drawImage(track, 555, 290, 95, 20, this);
        // ok
        g.drawImage(track, 40, 200, 80, 20, this);
        g.drawImage(track, 120, 200, 80, 20, this);

        // ok
        g.drawImage(track, 40, 240, 80, 20, this);	// 250
        g.drawImage(track, 120, 240, 80, 20, this);
        g.drawImage(track, 200, 240, 80, 20, this);
        g.drawImage(track, 280, 240, 80, 20, this);
        g.drawImage(track, 360, 240, 80, 20, this);
        g.drawImage(track, 440, 240, 80, 20, this);
        g.drawImage(track, 520, 240, 80, 20, this);
        g.drawImage(track, 600, 240, 60, 20, this);
        // ok
        g.drawImage(track, 40, 345, 80, 20, this);
        g.drawImage(track, 120, 345, 80, 20, this);
        g.drawImage(track, 200, 345, 80, 20, this);
        g.drawImage(track, 280, 345, 80, 20, this);
        g.drawImage(track, 360, 345, 80, 20, this);
        g.drawImage(track, 440, 345, 80, 20, this);
        g.drawImage(track, 520, 345, 100, 20, this);

        // ok
        g.drawImage(track, 400, 190, 75, 20, this);	// 8-1
        g.drawImage(track, 475, 190, 75, 20, this);	// 8-1

        // ok
        g.drawImage(track, 100, 290, 75, 20, this);
        g.drawImage(track, 175, 290, 75, 20, this);
        // 
        g.drawImage(track, 400, 395, 80, 20, this);
        g.drawImage(track, 480, 395, 70, 20, this);
        // ok
        g.drawImage(track, 30, 395, 70, 20, this);
        g.drawImage(track, 100, 395, 70, 20, this);
        g.drawImage(track, 170, 395, 70, 20, this);
        g.drawImage(track, 240, 395, 60, 20, this);
        // ok
        g.drawImage(track, 80, 495, 80, 20, this);
        g.drawImage(track, 160, 495, 80, 20, this);
        g.drawImage(track, 240, 495, 80, 20, this);
        g.drawImage(track, 320, 495, 80, 20, this);
        g.drawImage(track, 400, 495, 80, 20, this);
        g.drawImage(track, 480, 495, 60, 20, this);
        g.drawImage(track, 540, 495, 95, 20, this);
        // ok
        g.drawImage(track, 450, 440, 100, 20, this);
        // ok
        g.drawImage(track, 50, 540, 80, 20, this);
        g.drawImage(track, 130, 540, 80, 20, this);
        g.drawImage(track, 210, 540, 90, 20, this);
        // ok
        g.drawImage(track, 50, 630, 80, 20, this);
        g.drawImage(track, 130, 630, 80, 20, this);
        g.drawImage(track, 210, 630, 80, 20, this);
        g.drawImage(track, 280, 630, 80, 20, this);
        g.drawImage(track, 350, 630, 80, 20, this);
        g.drawImage(track, 430, 630, 80, 20, this);
        g.drawImage(track, 510, 630, 90, 20, this);
        // ok
        g.drawImage(track, 100, 585, 75, 20, this);
        g.drawImage(track, 175, 585, 75, 20, this);
        // ok
        g.drawImage(track, 500, 660, 100, 20, this);
        // ok
        g.drawImage(track1, 615, 105, 20, 80, this);	// 6-2
        // ok
        g.drawImage(track1, 645, 55, 20, 80, this);		// 6-1
        g.drawImage(track1, 645, 120, 20, 80, this);	// 6-1
        g.drawImage(track1, 645, 200, 20, 50, this);	// 7-1
        // ok
        g.drawImage(track1, 35, 250, 20, 100, this);	// 11-1
        // ok
        g.drawImage(track1, 645, 295, 20, 80, this);
        g.drawImage(track1, 645, 375, 20, 80, this);
        g.drawImage(track1, 645, 455, 20, 80, this);
        g.drawImage(track1, 645, 535, 20, 80, this);
        g.drawImage(track1, 645, 615, 20, 70, this);
        // ok
        g.drawImage(track1, 30, 400, 20, 80, this);
        g.drawImage(track1, 30, 480, 20, 80, this);
        g.drawImage(track1, 30, 540, 20, 80, this);
        g.drawImage(track1, 30, 620, 20, 70, this);
        // ok
        g.drawImage(track1, 620, 350, 20, 80, this);
        g.drawImage(track1, 620, 430, 20, 80, this);
        // ok
        g.drawImage(track1, 45, 550, 20, 90, this);

        // ok
        g.drawImage(track3, 200, 85, 10, 20, this);
        g.drawImage(track3, 205, 80, 10, 20, this);
        g.drawImage(track3, 210, 75, 10, 20, this);
        g.drawImage(track3, 215, 70, 10, 20, this);
        g.drawImage(track3, 220, 65, 10, 20, this);
        g.drawImage(track3, 225, 60, 10, 20, this);
        g.drawImage(track3, 230, 55, 10, 20, this);
        g.drawImage(track3, 235, 50, 10, 20, this);
        // ok
        g.drawImage(track3, 200, 195, 10, 20, this);
        g.drawImage(track3, 205, 190, 10, 20, this);
        g.drawImage(track3, 210, 185, 10, 20, this);
        g.drawImage(track3, 215, 180, 10, 20, this);
        g.drawImage(track3, 220, 175, 10, 20, this);
        g.drawImage(track3, 225, 170, 10, 20, this);
        g.drawImage(track3, 230, 165, 10, 20, this);
        g.drawImage(track3, 235, 160, 10, 20, this);
        g.drawImage(track3, 240, 155, 10, 20, this);
        g.drawImage(track3, 245, 150, 10, 20, this);
        // ok
        g.drawImage(track3, 300, 140, 10, 20, this);
        g.drawImage(track3, 305, 135, 10, 20, this);
        g.drawImage(track3, 310, 130, 10, 20, this);
        g.drawImage(track3, 315, 125, 10, 20, this);
        g.drawImage(track3, 320, 120, 10, 20, this);
        g.drawImage(track3, 325, 115, 10, 20, this);
        g.drawImage(track3, 330, 110, 10, 20, this);
        g.drawImage(track3, 335, 105, 10, 20, this);
        g.drawImage(track3, 340, 100, 10, 20, this);
        // ok
        g.drawImage(track3, 355, 235, 10, 20, this);	// 8-1
        g.drawImage(track3, 360, 230, 10, 20, this);
        g.drawImage(track3, 365, 225, 10, 20, this);
        g.drawImage(track3, 370, 220, 10, 20, this);
        g.drawImage(track3, 375, 215, 10, 20, this);
        g.drawImage(track3, 380, 210, 10, 20, this);
        g.drawImage(track3, 385, 205, 10, 20, this);
        g.drawImage(track3, 390, 200, 10, 20, this);
        // ok
        g.drawImage(track3, 250, 285, 10, 20, this);	// 10-2
        g.drawImage(track3, 255, 280, 10, 20, this);
        g.drawImage(track3, 260, 275, 10, 20, this);
        g.drawImage(track3, 265, 270, 10, 20, this);
        g.drawImage(track3, 270, 265, 10, 20, this);
        g.drawImage(track3, 275, 260, 10, 20, this);
        g.drawImage(track3, 280, 255, 10, 20, this);
        g.drawImage(track3, 285, 250, 10, 20, this);
        // ok
        g.drawImage(track3, 350, 340, 10, 20, this);
        g.drawImage(track3, 355, 335, 10, 20, this);
        g.drawImage(track3, 360, 330, 10, 20, this);
        g.drawImage(track3, 365, 325, 10, 20, this);
        g.drawImage(track3, 370, 320, 10, 20, this);
        g.drawImage(track3, 375, 315, 10, 20, this);
        g.drawImage(track3, 380, 310, 10, 20, this);
        g.drawImage(track3, 385, 305, 10, 20, this);
        g.drawImage(track3, 390, 300, 10, 20, this);
        g.drawImage(track3, 395, 295, 10, 20, this);
        // ok
        g.drawImage(track3, 553, 390, 10, 20, this);	// 19-2
        g.drawImage(track3, 556, 385, 10, 20, this);
        g.drawImage(track3, 559, 380, 10, 20, this);
        g.drawImage(track3, 562, 375, 10, 20, this);
        g.drawImage(track3, 565, 370, 10, 20, this);
        g.drawImage(track3, 568, 365, 10, 20, this);
        g.drawImage(track3, 571, 360, 10, 20, this);
        g.drawImage(track3, 574, 355, 10, 20, this);
        g.drawImage(track3, 577, 350, 10, 20, this);
        // ok
        g.drawImage(track3, 300, 390, 10, 20, this);
        g.drawImage(track3, 305, 385, 10, 20, this);
        g.drawImage(track3, 310, 380, 10, 20, this);
        g.drawImage(track3, 315, 375, 10, 20, this);
        g.drawImage(track3, 320, 370, 10, 20, this);
        g.drawImage(track3, 325, 365, 10, 20, this);
        g.drawImage(track3, 330, 360, 10, 20, this);
        g.drawImage(track3, 335, 355, 10, 20, this);
        g.drawImage(track3, 340, 350, 10, 20, this);
        // ok
        g.drawImage(track3, 400, 490, 10, 20, this);	// 22-1
        g.drawImage(track3, 405, 485, 10, 20, this);
        g.drawImage(track3, 410, 480, 10, 20, this);
        g.drawImage(track3, 415, 475, 10, 20, this);
        g.drawImage(track3, 420, 470, 10, 20, this);
        g.drawImage(track3, 425, 465, 10, 20, this);
        g.drawImage(track3, 430, 460, 10, 20, this);
        g.drawImage(track3, 435, 455, 10, 20, this);
        g.drawImage(track3, 440, 450, 10, 20, this);
        // ok
        g.drawImage(track3, 300, 540, 10, 20, this);	// 24-1
        g.drawImage(track3, 305, 535, 10, 20, this);
        g.drawImage(track3, 310, 530, 10, 20, this);
        g.drawImage(track3, 315, 525, 10, 20, this);
        g.drawImage(track3, 320, 520, 10, 20, this);
        g.drawImage(track3, 325, 515, 10, 20, this);
        g.drawImage(track3, 330, 510, 10, 20, this);
        g.drawImage(track3, 335, 505, 10, 20, this);
        g.drawImage(track3, 340, 500, 10, 20, this);
        // ok
        g.drawImage(track3, 250, 580, 10, 20, this);	// 25-3
        g.drawImage(track3, 255, 575, 10, 20, this);
        g.drawImage(track3, 260, 570, 10, 20, this);
        g.drawImage(track3, 265, 565, 10, 20, this);
        g.drawImage(track3, 270, 560, 10, 20, this);
        g.drawImage(track3, 275, 555, 10, 20, this);
        g.drawImage(track3, 280, 550, 10, 20, this);
        // ok
        g.drawImage(track3, 405, 85, 10, 20, this);
        g.drawImage(track3, 410, 80, 10, 20, this);
        g.drawImage(track3, 415, 75, 10, 20, this);
        g.drawImage(track3, 420, 70, 10, 20, this);
        g.drawImage(track3, 425, 65, 10, 20, this);
        g.drawImage(track3, 430, 60, 10, 20, this);
        g.drawImage(track3, 435, 55, 10, 20, this);
        g.drawImage(track3, 440, 50, 10, 20, this);
        // ok
        g.drawImage(track3, 505, 85, 10, 20, this);
        g.drawImage(track3, 510, 80, 10, 20, this);
        g.drawImage(track3, 515, 75, 10, 20, this);
        g.drawImage(track3, 520, 70, 10, 20, this);
        g.drawImage(track3, 525, 65, 10, 20, this);
        g.drawImage(track3, 530, 60, 10, 20, this);
        g.drawImage(track3, 535, 55, 10, 20, this);
        g.drawImage(track3, 540, 50, 10, 20, this);

        // ok
        g.drawImage(track4, 625, 175, 10, 20, this);	// 6-2
        g.drawImage(track4, 630, 180, 10, 20, this);
        g.drawImage(track4, 635, 185, 10, 20, this);
        g.drawImage(track4, 640, 190, 10, 20, this);
        g.drawImage(track4, 645, 195, 10, 20, this);
        // ok
        g.drawImage(track4, 405, 50, 10, 20, this);
        g.drawImage(track4, 410, 55, 10, 20, this);
        g.drawImage(track4, 415, 60, 10, 20, this);
        g.drawImage(track4, 420, 65, 10, 20, this);
        g.drawImage(track4, 425, 70, 10, 20, this);
        g.drawImage(track4, 430, 75, 10, 20, this);
        g.drawImage(track4, 435, 80, 10, 20, this);
        g.drawImage(track4, 440, 85, 10, 20, this);
        // ok
        g.drawImage(track4, 505, 50, 10, 20, this);
        g.drawImage(track4, 510, 55, 10, 20, this);
        g.drawImage(track4, 515, 60, 10, 20, this);
        g.drawImage(track4, 520, 65, 10, 20, this);
        g.drawImage(track4, 525, 70, 10, 20, this);
        g.drawImage(track4, 530, 75, 10, 20, this);
        g.drawImage(track4, 535, 80, 10, 20, this);
        g.drawImage(track4, 540, 85, 10, 20, this);
        // ok
        g.drawImage(track4, 550, 195, 10, 20, this);	// 8-1
        g.drawImage(track4, 555, 200, 10, 20, this);
        g.drawImage(track4, 560, 205, 10, 20, this);
        g.drawImage(track4, 565, 210, 10, 20, this);
        g.drawImage(track4, 570, 215, 10, 20, this);
        g.drawImage(track4, 575, 220, 10, 20, this);
        g.drawImage(track4, 580, 225, 10, 20, this);
        g.drawImage(track4, 585, 230, 10, 20, this);
        g.drawImage(track4, 590, 235, 10, 20, this);
        // ok
        g.drawImage(track4, 550, 445, 10, 20, this);	// 22-1
        g.drawImage(track4, 555, 450, 10, 20, this);
        g.drawImage(track4, 560, 455, 10, 20, this);
        g.drawImage(track4, 565, 460, 10, 20, this);
        g.drawImage(track4, 570, 465, 10, 20, this);
        g.drawImage(track4, 575, 470, 10, 20, this);
        g.drawImage(track4, 580, 475, 10, 20, this);
        g.drawImage(track4, 585, 480, 10, 20, this);
        g.drawImage(track4, 590, 485, 10, 20, this);
        // ok
        g.drawImage(track4, 480, 640, 10, 20, this);	// 29-2
        g.drawImage(track4, 485, 645, 10, 20, this);
        g.drawImage(track4, 490, 650, 10, 20, this);
        g.drawImage(track4, 495, 655, 10, 20, this);
        // ok
        g.drawImage(track4, 60, 250, 10, 20, this);	// 10-2
        g.drawImage(track4, 65, 255, 10, 20, this);
        g.drawImage(track4, 70, 260, 10, 20, this);
        g.drawImage(track4, 75, 265, 10, 20, this);
        g.drawImage(track4, 80, 270, 10, 20, this);
        g.drawImage(track4, 85, 275, 10, 20, this);
        g.drawImage(track4, 90, 280, 10, 20, this);
        g.drawImage(track4, 95, 285, 10, 20, this);
        // ok
        g.drawImage(track4, 370, 350, 10, 20, this);	// 19-2
        g.drawImage(track4, 373, 355, 10, 20, this);
        g.drawImage(track4, 376, 360, 10, 20, this);
        g.drawImage(track4, 379, 365, 10, 20, this);
        g.drawImage(track4, 382, 370, 10, 20, this);
        g.drawImage(track4, 385, 375, 10, 20, this);
        g.drawImage(track4, 388, 380, 10, 20, this);
        g.drawImage(track4, 391, 385, 10, 20, this);
        // ok
        g.drawImage(track4, 80, 550, 10, 20, this);	// 25-3
        g.drawImage(track4, 83, 555, 10, 20, this);
        g.drawImage(track4, 86, 560, 10, 20, this);
        g.drawImage(track4, 89, 565, 10, 20, this);
        g.drawImage(track4, 92, 570, 10, 20, this);
        g.drawImage(track4, 95, 575, 10, 20, this);
        // ok

        //code to color track
        
        g.setColor(Color.RED);
        

        g.drawImage(image, Main.freightX, Main.freightY, this);

        g.drawImage(image, (int) Main.posX, (int) Main.posY, this);

        g.drawImage(boston, 40, 70, this);
        g.drawImage(boston, 40, 170, this);

        g.drawImage(alewife, 570, 70, this);
        g.drawImage(medford, 130, 260, this);
        g.drawImage(melrose, 440, 370, this);
        g.drawImage(stoneham, 130, 510, this);
        g.drawImage(stoneham, 130, 560, this);
        g.drawImage(reading, 510, 648, this);
        /*
			 * if (fright || fleft) g.fillRect(freightX, freightY, 30, 30); else
			 * if (fup || fdown) g.fillRect(freightX, freightY, 30, 30);
         */

    }

}
