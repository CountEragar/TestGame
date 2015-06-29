package testgame;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class TestGame {
    
    public TestGame() {
            JFrame frame = new JFrame("Super Awesome Adventure!");
            
            Image image = null;
            try {
                image = ImageIO.read(TestGame.class.getResource("/res/logo.png"));
            } catch (Exception e) {
                e.printStackTrace();
            }
            JButton logo;
            
            if (image == null) {
                logo = new JButton("Could not load.");
            }
            else {
                logo = new JButton(new ImageIcon(image));
            }
            
            logo.setBorder(BorderFactory.createEmptyBorder());
            logo.setContentAreaFilled(false);
            logo.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Hey, nice."); //To change body of generated methods, choose Tools | Templates.
                }
            });
            
            frame.add(logo);
            
            frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
            frame.setSize(1280, 1024);
            frame.setLocationRelativeTo(null);
            frame.setResizable(true);
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.getContentPane().setBackground(Color.BLACK);
            frame.setVisible(true);        
    }
    public static void main(String[] args) {
        
        new TestGame();
        
    }
    
}
