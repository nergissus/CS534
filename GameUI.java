import javax.swing.*;

import java.awt.*;

public class GameUI extends JFrame{
	GameUI(){
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        this.setIconImage(new ImageIcon(getClass().getResource("/launcher_icon.png")).getImage()); 
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
        //lblNewLabel.setSize(0, 0);
        Image img = new ImageIcon(this.getClass().getResource("/player.png")).getImage();
        lblNewLabel.setIcon(new ImageIcon(img));
        getContentPane().add(lblNewLabel);
        
        JLabel lblNewLabel2 = new JLabel("");
        lblNewLabel2.setVerticalAlignment(SwingConstants.BOTTOM);
        //lblNewLabel2.setSize(0, 0);
        Image img2 = new ImageIcon(this.getClass().getResource("/monster.png")).getImage();
        lblNewLabel2.setIcon(new ImageIcon(img2));
        getContentPane().add(lblNewLabel2);
        
    }
	
	
   
   /* @Override
    public void paint(Graphics g) 
    {
         g.drawRect(5, 5, 50, 50);
         g.drawRect(100,100,50,50);
         g.drawRect(200, 200, 50, 50);
         g.setColor(Color.GREEN);
         
         
    }*/

}
