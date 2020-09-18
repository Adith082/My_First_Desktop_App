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
public class Watch1 extends JFrame{
    private Container c;
    private TextArea ta;
    private Font f;
    private int num = 41;
    Watch1(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(400,60,315,100);
        this.setTitle("TIME");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        ta = new TextArea();
        ta.setBounds(0,0,320,100);
        ta.setBackground(Color.CYAN);
        ta.setForeground(Color.RED);
        f = new Font("Arial",Font.BOLD,30);
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