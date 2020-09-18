package COUNT_IF_YOU_CAN;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class COUNT_IF_YOU_CAN extends JFrame  {
       private Container c;
       private JButton jj,exit,tips;
       private JLabel jl,imglabel;
       private ImageIcon img;
       private Font f;
       COUNT_IF_YOU_CAN(){
            this.setVisible(true);
            this.setBounds(400,100,415,539);
            this.setTitle("COUNT_IF_YOU_CAN");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            c = this.getContentPane();
            c.setLayout(null);
            
            img = new ImageIcon(getClass().getResource("Back_grnd.jpg"));
            imglabel = new JLabel(img);
            imglabel.setBounds(0,0,img.getIconWidth(),img.getIconHeight());
            c.add(imglabel);
            f = new Font("Arial",Font.BOLD,20);
            jj = new JButton("PLAY");
            jj.setFont(f);
            jj.setBounds(150,190,90,50);
            jj.setForeground(Color.blue);
            jj.setBackground(Color.yellow);
            c.add(jj);
            tips = new JButton("TIPS");
            tips.setFont(f);
            tips.setBounds(150,260,90,50);
            tips.setForeground(Color.blue);
            tips.setBackground(Color.white);
            c.add(tips);
            exit = new JButton("EXIT");
            exit.setFont(f);
            exit.setBounds(150,330,90,50);
            exit.setBackground(Color.blue);
            exit.setForeground(Color.white);
            c.add(exit);
            Hand h = new Hand();
            exit.addActionListener(h);
            jj.addActionListener(h);
            tips.addActionListener(h);
            
       }
       class Hand implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == exit){
                System.exit(0);
        }
            else if(e.getSource() == tips){
                   TIPS ob = new TIPS();
            }
            else{
                dispose();
                PHASE_1 ob = new PHASE_1();
            }
       }
       }
    public static void main(String[] args) {
        COUNT_IF_YOU_CAN ob = new COUNT_IF_YOU_CAN();
    }
}

