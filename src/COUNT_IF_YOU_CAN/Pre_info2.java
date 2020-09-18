
package COUNT_IF_YOU_CAN;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Pre_info2 extends JFrame implements ActionListener  {
       private CardLayout card;
       private Container c;
       private JButton prev,nxt;
       private JPanel jp;
       private ImageIcon icon;
       private JLabel jl;
       private int i = 1;
       public void showImage(){
           String[] imgname = {"WATERLILY.jpg","SUNFLOWER.jpg","ROSE.jpg","ORCHID.jpg","MARIGOLD.jpg","HIBISCUS.jpg","DAISY.jpg","DAHLIA.jpg","CARNATION.jpg","BLUEBELL.jpg"};
           for(String n : imgname){
               icon = new ImageIcon("src/FLOWERS/"+n);
               jl = new JLabel(icon);
               jp.add(jl);
           }
                   }
       Pre_info2(){
          this.setVisible(true);
          this.setBounds(400,10,610,700);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setTitle("FLOWER PHASE");
          c = this.getContentPane();
          c.setLayout(null);
          c.setBackground(Color.orange);
          card = new CardLayout();
          jp = new JPanel(card);
          jp.setBounds(5,10,585,600);
          c.add(jp);
          prev = new JButton("PREVIOUS");
          nxt = new JButton("NEXT");
          prev.setBounds(5,615,100,40);
          nxt.setBounds(490,615,100,40);
          c.add(prev);
          c.add(nxt);
          prev.addActionListener(this);
          nxt.addActionListener(this);
          showImage();
       }
       
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == nxt){
            if(i == 10) {
               dispose();
               BLOCK_INTERFACE_4 ob = new BLOCK_INTERFACE_4();
               Watch4 ob2 = new Watch4();
            }
            card.next(jp);
            i++;
        }
        else if(e.getSource() == prev){
            card.previous(jp);
            i--;
            if(i == 0){
                i = 9;
            }
        }
    }
}
