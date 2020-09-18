
package COUNT_IF_YOU_CAN;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class PHASE_1 extends JFrame implements ActionListener{
           
    private Container c;
    private JButton jb;
    private JLabel jl;
    private Font f,f2;
      PHASE_1(){
          this.setVisible(true);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setBounds(300,100,700,540);
          this.setTitle("FRUIT_PHASE");
          c = this.getContentPane();
          c.setLayout(null);
          c.setBackground(Color.yellow);
          jl = new JLabel();
          jl.setText("FRUIT PHASE");
          jl.setBounds(170,50,332,50);
          jl.setForeground(Color.RED);
       //   jl.setBackground(Color.BLACK);
          f = new Font("Arial",Font.BOLD,50);
          jl.setFont(f);
          c.add(jl);
          jb = new JButton("NEXT");
          jb.setBounds(240,200,200,70);
          f2 = new Font("Arial",Font.BOLD,30);
          jb.setFont(f2);
          jb.setBackground(Color.CYAN);
          jb.setForeground(Color.BLUE);
          c.add(jb);
          jb.addActionListener(this);
      }
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Pre_info ob = new Pre_info();
    }
    
}
