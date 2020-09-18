//BISMILLAH
//Here in level 2 we have widen the display and added new colors to make the game more fun to play.

package COUNT_IF_YOU_CAN;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class BLOCK_INTERFACE_2 extends JFrame implements ActionListener {
     private Container c2;
     private JButton[] jb2 = new JButton[1009];
    Random r2 = new Random();
    private int i,j,k = 0,x = -10,y = 0,flag2,ran,z,gg,ind;
    private JButton tem2;
    private int blue = 0,count2 = 0;
    private Integer[] op2 = {1, 3, 5, 7};
    private String[] ss = {"YES","NO"};
    private ImageIcon img;
    BLOCK_INTERFACE_2(){
        //Given some pre information before starting this level.
        img = new ImageIcon(getClass().getResource("apple.jpg"));
        JOptionPane.showMessageDialog(null,"(APPLE) COLLECT ALL","PHASE FRUIT LEVEL 2",JOptionPane.INFORMATION_MESSAGE,img);
        //JOptionPane.showMessageDialog(null,"EVERY BLUE_BOX = 17 POINTS","LEVEL 2",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FRUIT PHASE LEVEL 2");
        this.setBounds(10,100,1345,620);
        c2 = this.getContentPane();
        c2.setLayout(null);
        c2.setBackground(Color.YELLOW);
        for(i = 1;i<=8;i++){
            for(j = 1;j<=14;j++){
                 img = new ImageIcon(getClass().getResource("sorange.jpg"));
                 jb2[k] = new JButton(img);
                 jb2[k].setText(" ");
                jb2[k].setBounds(x,y,95,100);
                jb2[k].setBackground(Color.white);
                c2.add(jb2[k]);
                jb2[k].addActionListener(this);
                k++;
                x = x + 95;
            }
            y = y + 100;
            x = 0;
        }
        for(i = 9;i<=50;i++){
            for(j = 1;j<=14;j++){
            flag2 = r2.nextInt();
            flag2 = Math.abs(flag2);
            if(flag2%2 == 0){
                img = new ImageIcon(getClass().getResource("apple.jpg"));
                 jb2[k] = new JButton(img);
               // jb2[k].setBackground(Color.BLUE);
                blue = blue + 1;
            }
            else{
                 img = new ImageIcon(getClass().getResource("sorange.jpg"));
                 jb2[k] = new JButton(img);
                 jb2[k].setText(" ");
                jb2[k].setBackground(Color.white);
            }
            jb2[k].setBounds(x,y,95,100);
            c2.add(jb2[k]);
            jb2[k].addActionListener(this);
            k++;
            x = x + 95;
            }
            x = 0;
            y = y + 100;
        }
        new Thread(new Runnable(){
           @Override
           public void run() {
                int i,j,p;
                int h,x = 0,y = 0,k = 0;
                for(i = 0;i>=(-100000);i--){
                       if(i == -5130 && count2<blue){
                           JOptionPane.showMessageDialog(null,"GAME_OVER FOR NOT COLLECTING EVERY APPLE ","Message",JOptionPane.ERROR_MESSAGE);
                             System.exit(0);
                       }
                       k = 0;
                       y = 0;
                       x = 0;
                       for(p = 1;p<=50;p++){
                           for(j = 1;j<=14;j++){
                               jb2[k].setBounds(x,y+i,95,100);
                               x = x + 95;
                               k++;
                           }
                           x = 0;
                           y = y + 100;
                       }
               try {          
                  Thread.sleep(40);
                  //Here the running interface speed is slower than the previous level.
                  //It is because the display is much wider than the previous level.
                  //So we tried to balance everything as much as we could.
               } catch (InterruptedException e) {
                   
               }
                } 
           }
       }).start();
        
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        tem2 = (JButton) e.getSource();
        String s = tem2.getText();
        if(" ".equals(s)){
            tem2.setIcon(null);
            tem2.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"GAME_OVER","Message",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        else{
            tem2.setIcon(null);
             tem2.setBackground(Color.ORANGE);
             count2 = count2 + 1;
             if(count2 == blue){
                 ran = r2.nextInt();
                 ran = Math.abs(ran);
                 ran = ran%4;
                 op2[ran] = count2;
                 z = count2;
                 for(i = 0;i<4;i++){
                     if(i!=ran){
                         op2[i] = ++z;
                     }
                 }
                 gg = JOptionPane.showOptionDialog(null, "GUESS HOW MANY APPLES YOU GOT ??","Message",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, op2,op2[0]);
                if(op2[gg] == count2){
                    JOptionPane.showMessageDialog(null,"CONGRATULATIONS AGAIN!!! ","Message",JOptionPane.INFORMATION_MESSAGE);
                    ind = JOptionPane.showOptionDialog(null,"DO YOU WISH TO PLAY FRUIT PHASE LEVEL 3 ?","Message",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,ss,ss[0]);
                    if(ind == 1){
                        System.exit(0);
                    }
                    else if(ind == 0){
                        dispose();
                        FINAL_BLOCK l3 = new FINAL_BLOCK();
                        Watch_final ob = new Watch_final();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME_OVER","Message",JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
             }
        }
        
    }
}
