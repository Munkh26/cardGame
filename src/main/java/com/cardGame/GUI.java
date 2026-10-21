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
import java.util.Stack;

public class GUI extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

	private Solitaire game;
	public static String IMG_PATH = System.getProperty("user.dir") + "/src/main/java/com/cardGame/resources/";

	public GUI(Solitaire game) {
		this.game = game;
		// Create and set up the window.
		setTitle("Solitaire");
		setSize(900, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// this supplies the background
		try {
			Image blackImg = ImageIO.read(new File(IMG_PATH + "background.jpg"));

			setContentPane(new ImagePanel(blackImg));

		} catch (IOException e) {
			e.printStackTrace();
		}

		JPanel mainPanel = new JPanel(new GridLayout(2, 1));
		mainPanel.setOpaque(false);
		mainPanel.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.RED));
		mainPanel.setSize(900, 600);

		JPanel top = new JPanel();
		top.setOpaque(false);
		top.setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.BLUE));
		mainPanel.add(top);
		
		JPanel bottom = new JPanel();
		bottom.setOpaque(false);
		bottom.setBorder(BorderFactory.createMatteBorder(4,4,4,4, Color.YELLOW));
		mainPanel.add(bottom);


		this.add(mainPanel);

		/*******
		 * This is just a test to make sure images are being read correctly on your
		 * machine. Please replace
		 * once you have confirmed that the card shows up properly. The code below
		 * should allow you to play the solitare
		 * game once it's fully created.
		 */
		Stack<Card> stackIn = new Stack<Card>(); 
		stackIn.push(new Card(2, Card.Suit.Diamonds));
		stackIn.push(new Card(4, Card.Suit.Spades));
				
		//Card card = new Card(2, Card.Suit.Diamonds);
		//System.out.println(card);
		//top.add(card);

		JLayeredPane layerPane = drawPile(stackIn);
		layerPane.setPreferredSize(new Dimension(200, 300));
        layerPane.setBounds(0, 0, 200, 300);
		top.add(layerPane);


		this.setVisible(true);

	}

	public JLayeredPane drawPile(Stack<Card> stackIn) {
		JLayeredPane pane = new JLayeredPane();
		Object cards[];
		cards = stackIn.toArray(); //please note we convert this stack to an array so that we can iterate through it backwards while drawing. You’ll need to cast each element inside cards to a <Card> in order to use the methods to adjust their position
		for (int i = cards.length - 1; i >= 0; i--) {
			pane.add((Card) cards[i]);
		}
		return pane;
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
