
package COUNT_IF_YOU_CAN;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Watch_final extends JFrame{
    private Container c;
    private TextArea ta;
    private Font f;
    private int num = 250;
    Watch_final(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(500,0,315,100);
        this.setTitle("TIME");
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        ta = new TextArea();
        ta.setBounds(0,0,320,100);
        ta.setBackground(Color.blue);
        ta.setForeground(Color.WHITE);
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