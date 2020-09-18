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

 public class BLOCK_INTERFACE_4 extends JFrame implements ActionListener {
      private Container c;
      private JButton[] jb = new JButton[410];
     private int i,j,k = 0,y = 0,flag,z,x = 0,gg;
     Random rd = new Random();
     private int black = 0,countt = 0,ran,ind;
     private JButton tem;
     private ImageIcon img;
     private Integer[] op = {1, 3, 5, 7};
     private String[] ss = {"YES","NO"};
        BLOCK_INTERFACE_4(){
        img = new ImageIcon(getClass().getResource("smsunflower.jpg"));
        JOptionPane.showMessageDialog(null,"(SUNFLOWER) COLLECT ALL","PHASE FRUIT LEVEL 1",JOptionPane.INFORMATION_MESSAGE,img);
        //JOptionPane.showMessageDialog(null,"EVERY BANANA = 1 POINTS","LEVEL 1",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FLOWER PHASE LEVEL 1");
        this.setBounds(400,100,395,600);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.green);
        for(i = 1;i<=5;i++){
            for(j = 1;j<=2;j++){
                img = new ImageIcon(getClass().getResource("sbluebell.jpg"));
                jb[k] = new JButton(img);
                jb[k].setText("1");
                jb[k].setBackground(Color.WHITE);
                jb[k].setBounds(x,y,190,200);
                c.add(jb[k]);
                jb[k].addActionListener(this);
                k++;
                x = x + 190;
            }
            y = y + 200;
            x = 0;
        }
        for(i = 6;i<=50;i++){
            for(j = 1;j<=2;j++){
            flag = rd.nextInt();
            flag = Math.abs(flag);
            if(flag%2 == 0){
                img = new ImageIcon(getClass().getResource("ssunflower.jpg"));
                jb[k] = new JButton(img);
                jb[k].setText("0");
               // jb[k].setBackground(Color.black);
                black = black + 1;
            }
            else{
                img = new ImageIcon(getClass().getResource("sbluebell.jpg"));
                jb[k] = new JButton(img);
                jb[k].setText("1");
                jb[k].setBackground(Color.white);
            }
            jb[k].setBounds(x,y,190,200);
            c.add(jb[k]);
            jb[k].addActionListener(this);
            k++;
            x = x + 190;
            }
            x = 0;
            y = y + 200;
        } 
        new Thread(new Runnable(){
           @Override
           public void run() {
                int i,j;
                int h,x = 0,y = 0,k = 0;
                for(i = 0;i>=(-100000);i--){
                       if(i == -10000 && countt<black){
                           JOptionPane.showMessageDialog(null,"GAME_OVER FOR NOT COLLECTING ALL THE SUNFLOWERS ","Message",JOptionPane.ERROR_MESSAGE);
                              System.exit(0);
                       }
                       k = 0;
                       y = 0;
                       for(j = 1;j <= 50;j++){
                           jb[k].setBounds(0,y+i,190,200);
                           k++;
                           jb[k].setBounds(190,y+i,190,200);
                           y = y + 200;
                           k++;
                       }
               try {          
                  Thread.sleep(3);
               } catch (InterruptedException e) {
                   
               }
                } 
           }
       }).start();
    }
      @Override
    public void actionPerformed(ActionEvent e) {
        tem = (JButton) e.getSource();
        String s = tem.getText();
        if(s == "1"){
            tem.setIcon(null);
            tem.setText("");
            tem.setBackground(Color.red);
            JOptionPane.showMessageDialog(null,"GAME_OVER","Message",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
        else{
              tem.setIcon(null);
              tem.setText("");
              tem.setBackground(Color.YELLOW);
             countt = countt + 1;
             if(countt == black){
                 ran = rd.nextInt();
                 ran = Math.abs(ran);
                 ran = ran%4;
                 op[ran] = countt;
                 z = countt;
                 for(i = 0;i<4;i++){
                     if(i!=ran){
                         op[i] = ++z;
                     }
                 }
                 gg = JOptionPane.showOptionDialog(null, "GUESS HOW MANY SUNFLOWERS YOU GOT ??","Message",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, op,op[0]);
                if(op[gg] == countt){
                    JOptionPane.showMessageDialog(null,"CONGRATULATIONS !!! ","Message",JOptionPane.INFORMATION_MESSAGE);
                    ind = JOptionPane.showOptionDialog(null,"DO YOU WISH TO PLAY FLOWER PHASE LEVEL 2 ?","Message",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,ss,ss[0]);
                    if(ind == 1){
                        System.exit(0);
                    }
                    else if(ind == 0){
                        dispose();
                        BLOCK_INTERFACE_5 l2 = new BLOCK_INTERFACE_5();
                        Watch_final ob3 = new Watch_final();
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