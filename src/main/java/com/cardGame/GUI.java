package com.cardGame;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Path;


public class GUI extends JFrame implements ActionListener, MouseListener, MouseMotionListener{

	private Solitaire game;
	public static String IMG_PATH = System.getProperty("user.dir")+"/src/main/java/com/cardGame/resources/";
   public GUI(Solitaire game){
	   this.game= game;
        //Create and set up the window.
       setTitle("Solitaire");
       setSize(900,700);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       // this supplies the background
       try {
		Image blackImg = ImageIO.read(new File(IMG_PATH+"background.jpg"));
		
		setContentPane(new ImagePanel(blackImg));

       }catch(IOException e) {
    	   e.printStackTrace();
       }

	   JPanel mainPanel = new JPanel();
	   mainPanel.setOpaque(false);
	   mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
	   mainPanel.setSize(new Dimension(900,700));
	   mainPanel.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));


	   JPanel panel = new JPanel();
	   panel.setOpaque(false);
	   panel.setLocation(0,0);
	   panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
	   panel.setSize(new Dimension(900,150));
	   panel.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
	   mainPanel.add(panel);

	   JPanel panel2 = new JPanel();
	   panel2.setLocation(0, 150);
	   panel2.setOpaque(false);
	   panel2.setSize(new Dimension(900,550));
	   panel2.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLUE));
	   mainPanel.add(panel2);

	   add(mainPanel);
       
       /*******
        * This is just a test to make sure images are being read correctly on your machine. Please replace
        * once you have confirmed that the card shows up properly. The code below should allow you to play the solitare
        * game once it's fully created.
        */
        Card card = new Card(2, Card.Suit.Diamonds);
        System.out.println(card);
        this.add(card);


        this.setVisible(true);
    }


	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
