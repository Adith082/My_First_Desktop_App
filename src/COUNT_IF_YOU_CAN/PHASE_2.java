
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


public class PHASE_2 extends JFrame implements ActionListener{
           
    private Container c;
    private JButton jb;
    private JLabel jl;
    private Font f,f2;
      PHASE_2(){
          this.setVisible(true);
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          this.setBounds(200,100,800,540);
          this.setTitle("FLOWER PHASE");
          c = this.getContentPane();
          c.setLayout(null);
          c.setBackground(Color.red);
          jl = new JLabel();
          jl.setText("FLOWER PHASE");
          jl.setBounds(175,50,410,50);
          jl.setForeground(Color.yellow);
         //jl.setBackground(Color.BLACK);
          f = new Font("Arial",Font.BOLD,50);
          jl.setFont(f);
          c.add(jl);
          jb = new JButton("NEXT");
          jb.setBounds(260,200,200,70);
          f2 = new Font("Arial",Font.BOLD,30);
          jb.setFont(f2);
          jb.setBackground(Color.blue);
          jb.setForeground(Color.cyan);
          c.add(jb);
          jb.addActionListener(this);
      }
    @Override
    public void actionPerformed(ActionEvent e) {
        dispose();
        Pre_info2 ob = new Pre_info2();
    }
    
}
