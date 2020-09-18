
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


public class BLOCK_INTERFACE_7 extends JFrame implements ActionListener {
    
     private Container c3;
     private JButton[] jb3 = new JButton[1009];
     Random r3 = new Random();
     private int i,j,k = 0,x = 0,y = 0,flag3,ran,z,gg;
     private JButton tem3;
     private int hibi = 0,gra = 0,eag = 0,hibi2 = 0,gra2 = 0,eag2 = 0;
     private Integer[] gra3 = {1, 3, 5, 7};
     private Integer[] eag3 = {1,3,5,7};
     private Integer[] hibi3 = {1,3,5,7};
     private ImageIcon img,img2,img3;
      BLOCK_INTERFACE_7(){
          img = new ImageIcon("src/small_animal/smeagle.jpg");
          img2 = new ImageIcon("src/small_flower/smhibiscus.jpg");
          img3 = new ImageIcon("src/COUNT_IF_YOU_CAN/grapes.jpg");
       JOptionPane.showMessageDialog(null,"WELCOME TO THE FINAL LEVEL","SPECIAL LEVEL",JOptionPane.INFORMATION_MESSAGE);
         JOptionPane.showMessageDialog(null," COLLECT ALL (EAGLE)" ,"SPECIAL LEVEL",JOptionPane.INFORMATION_MESSAGE ,img);
         JOptionPane.showMessageDialog(null," AS WELL AS(HIBISCUS)" ,"SPECIAL LEVEL",JOptionPane.INFORMATION_MESSAGE ,img2);
         JOptionPane.showMessageDialog(null," AS WELL AS(GRAPES)" ,"SPECIAL LEVEL",JOptionPane.INFORMATION_MESSAGE ,img3);
         //JOptionPane.showMessageDialog(null,"CYAN = 17 points, GREEN = 7 points");
        // JOptionPane.showMessageDialog(null,"THERE ARE ALSO SOME VARIATIONS LEFT TO TELL", "LEVEL 3", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"YOU ARE GONNA HAVE TO DEAL WITH THAT VARIATIONS ON YOUR OWN","LEVEL 3",JOptionPane.INFORMATION_MESSAGE);
         JOptionPane.showMessageDialog(null,"GOOD LUCK !!","SPECIAL LEVEL",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SPECIAL LEVEL");
        this.setBounds(50,100,1275,620);
        c3 = this.getContentPane();
        c3.setLayout(null);
        c3.setBackground(Color.WHITE);
        for(i = 1;i<=8;i++){
            for(j = 1;j<=14;j++){
                 img = new ImageIcon(getClass().getResource("mango.jpg"));
                jb3[k] = new JButton(img);
                jb3[k].setText("2");
               // jb3[k].setBackground(Color.yellow);
               jb3[k].setBounds(x,y,90,100);
                c3.add(jb3[k]);
                jb3[k].addActionListener(this);
                k++;
                x = x + 90;
            }
            x = 0;
            y = y + 100;
        }
        for(i = 9;i<=50;i++){
            for(j = 1;j<=14;j++){
                flag3 = r3.nextInt();
                flag3 = Math.abs(flag3);
                flag3 = flag3%10;
                if(flag3 == 0){
                 img = new ImageIcon(getClass().getResource("banana.jpg"));
                 jb3[k] = new JButton(img);
                 jb3[k].setText("2");
              //   jb3[k].setBackground(Color.BLACK);
                }
                else if(flag3 == 1){
                  img = new ImageIcon("src/small_flower/smmarigold.jpg");
                  jb3[k] = new JButton(img);
                  jb3[k].setText("2");
                // jb3[k].setBackground(Color.white);
                }
                else if(flag3 == 2){
                  img = new ImageIcon(getClass().getResource("grapes.jpg"));
                  jb3[k] = new JButton(img);
                  jb3[k].setText("1");
                 jb3[k].setBackground(Color.white);
                  gra++;
                }
                else if(flag3 == 3){
                 img = new ImageIcon("src/small_animal/smeagle.jpg");
                 jb3[k] = new JButton(img);
                 jb3[k].setText("3");
                 eag++;
               //  jb3[k].setBackground(Color.GRAY);
                }
                else if(flag3 == 4){
                  img = new ImageIcon("src/small_flower/smhibiscus.jpg");
                  jb3[k] = new JButton(img);
                  jb3[k].setText("0");
                 jb3[k].setBackground(Color.white);
                 hibi++;
                }
                else if(flag3 == 5){
                   img = new ImageIcon("src/small_animal/smdeer.jpg");
                  jb3[k] = new JButton(img);
                  jb3[k].setText("2");
                // jb3[k].setBackground(Color.MAGENTA);
                }
                else if(flag3 == 6){
                     img = new ImageIcon(getClass().getResource("watermelon.jpg"));
                  jb3[k] = new JButton(img);
                  jb3[k].setText("2");
                // jb3[k].setBackground(Color.ORANGE);
                }
                else if(flag3 == 7){
                  img = new ImageIcon("src/small_flower/smwaterlily.jpg");
                  jb3[k] = new JButton(img);
                  jb3[k].setText("2");
                // jb3[k].setBackground(Color.PINK);
                }
                else if(flag3 == 8){
                     img = new ImageIcon("src/small_animal/smzebra.jpg");
                     jb3[k] = new JButton(img);
                     jb3[k].setText("2");
                // jb3[k].setBackground(Color.WHITE);
                }
                else if(flag3 == 9){
                   img = new ImageIcon("src/small_animal/smrabbit.jpg");
                   jb3[k] = new JButton(img);
                   jb3[k].setText("2");
                  // jb3[k].setBackground(Color.YELLOW);
                }
                jb3[k].setBounds(x,y,90,100);
                c3.add(jb3[k]);
                jb3[k].addActionListener(this);
                k++;
                x = x + 90;
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
                       if(i == -5030 && (gra2+hibi2+eag2)<(gra+hibi+eag)){
                           JOptionPane.showMessageDialog(null,"GAME_OVER FOR NOT COLLECTING ALL (EAGLES,GRAPES,HIBISCUS)  ","Message",JOptionPane.ERROR_MESSAGE);
                             System.exit(0);
                       }
                       k = 0;
                       y = 0;
                       x = 0;
                       for(p = 1;p<=50;p++){
                           for(j = 1;j<=14;j++){
                               jb3[k].setBounds(x,y+i,90,100);
                               x = x + 90;
                               k++;
                           }
                           x = 0;
                           y = y + 100;
                       }
               try {          
                  Thread.sleep(40);
                 
               } catch (InterruptedException e) {
               }
                } 
           }
       }).start();
     }

    
   @Override
    public void actionPerformed(ActionEvent e) {
        tem3 = (JButton) e.getSource();
        
        String s = tem3.getText();
        if("0".equals(s)){
            tem3.setIcon(null);
            tem3.setText("");
            tem3.setBackground(Color.PINK);
            hibi2++;
        }
        else if("1".equals(s)){
            tem3.setIcon(null);
            tem3.setText("");
            tem3.setBackground(Color.green);
            gra2++;
        }
        else if("3".equals(s)){
            tem3.setIcon(null);
            tem3.setText("");
            tem3.setBackground(Color.blue);
            eag2++;
        }
        else{
             tem3.setIcon(null);
             tem3.setText("");
             tem3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"GAME_OVER","Message",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
       if("0".equals(s) || "1".equals(s) || "3".equals(s)){
           if((gra+eag+hibi) == (gra2+hibi2+eag2)){
                 ran = r3.nextInt();
                 ran = Math.abs(ran);
                 ran = ran%4;
                 gra3[ran] = gra;
                 z = gra;
                 for(i = 0;i<4;i++){
                     if(i!=ran){
                         
                         gra3[i] = ++z;
                     }
                 }
                 gg = JOptionPane.showOptionDialog(null, "GUESS HOW MANY GRAPES YOU HAVE COLLECTED ??","Message",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, gra3,gra3[0]);
                if(gra3[gg] == gra){
                 ran = r3.nextInt();
                 ran = Math.abs(ran);
                 ran = ran%4;
                 eag3[ran] = gra;
                 z = eag;
                 for(i = 0;i<4;i++){
                     if(i!=ran){
                         
                         eag3[i] = ++z;
                     }
                 }
                 gg = JOptionPane.showOptionDialog(null, "GUESS HOW MANY EAGLES YOU HAVE COLLECTED ??","Message",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, eag3,eag3[0]);
                 if(eag3[gg] == eag){
                     ran = r3.nextInt();
                 ran = Math.abs(ran);
                 ran = ran%4;
                 hibi3[ran] = hibi;
                 z = hibi;
                 for(i = 0;i<4;i++){
                     if(i!=ran){
                         hibi3[i] = ++z;
                     }
                 }
                 gg = JOptionPane.showOptionDialog(null, "GUESS HOW MANY HIBISCUS YOU HAVE COLLECTED ??","Message",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, hibi3,hibi3[0]);
                 if(hibi3[gg] == hibi){
                     JOptionPane.showMessageDialog(null,"CONGRATULATIONS ON YOUR SUCCESS !!!","Message",JOptionPane.INFORMATION_MESSAGE);
                    System.exit(0);
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"GAME_OVER","Message",JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                 }
                 }
                 else{
                     JOptionPane.showMessageDialog(null,"GAME_OVER","Message",JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
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
