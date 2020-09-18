/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package COUNT_IF_YOU_CAN;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class Watch4 extends JFrame{
    private Container c;
    private TextArea ta;
    private Font f;
    private int num = 37;
    Watch4(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400,10,395,100);
        this.setTitle("TIME");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        ta = new TextArea();
        ta.setBounds(0,0,400,100);
        ta.setBackground(Color.YELLOW);
        ta.setForeground(Color.BLUE);
        f = new Font("Arial",Font.BOLD,40);
        ta.setFont(f);
        c.add(ta);
        new Thread(new Runnable(){
            @Override
            public void run() {
                    for(int i = 0;i>=(-100000);i--){
                        
                    
                ta.setText("TIME LEFT : " + Integer.toString(num) + " sec");
                num--;
                if(num == -1) {dispose();}
                for(int j = 1;j <= 50;j++){  
                }
                
                try {          
                  Thread.sleep(1000);
               } catch (InterruptedException e) {
               }
                
            }
            }
        
         }).start();
}
}