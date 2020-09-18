
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


public class BLOCK_INTERFACE_6 extends JFrame implements ActionListener {
    
     private Container c3;
     private JButton[] jb3 = new JButton[1009];
     Random r3 = new Random();
     private int i,j,k = 0,x = 0,y = 0,flag3,ran,z,gg;
     private JButton tem3;
     private int green = 0,cyan = 0,count3 = 0;
     private Integer[] op3 = {1, 3, 5, 7};
     private ImageIcon img,tt;
      BLOCK_INTERFACE_6(){
          img = new ImageIcon("src/small_animal/smtiger.jpg");
          tt = new ImageIcon("src/small_animal/smpanda.jpg");
        // JOptionPane.showMessageDialog(null,"WELCOME TO THE FINAL LEVEL","PHASE FLOWER LEVEL 3",JOptionPane.INFORMATION_MESSAGE);
         JOptionPane.showMessageDialog(null," COLLECT ALL (ROYAL BENGAL TIGER)" ,"PHASE ANIMAL LEVEL 1",JOptionPane.INFORMATION_MESSAGE ,img);
         JOptionPane.showMessageDialog(null," AS WELL AS(PANDA)" ,"PHASE ANIMAL LEVEL 1",JOptionPane.INFORMATION_MESSAGE ,tt);
         //JOptionPane.showMessageDialog(null,"CYAN = 17 points, GREEN = 7 points");
        // JOptionPane.showMessageDialog(null,"THERE ARE ALSO SOME VARIATIONS LEFT TO TELL", "LEVEL 3", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"YOU ARE GONNA HAVE TO DEAL WITH THAT VARIATIONS ON YOUR OWN","LEVEL 3",JOptionPane.INFORMATION_MESSAGE);
         JOptionPane.showMessageDialog(null,"GOOD LUCK !!","PHASE ANIMAL LEVEL 1",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("PHASE ANIMAL LEVEL 1");
        this.setBounds(50,100,1275,620);
        c3 = this.getContentPane();
        c3.setLayout(null);
        c3.setBackground(Color.WHITE);
        for(i = 1;i<=8;i++){
            for(j = 1;j<=14;j++){
                 img = new ImageIcon("src/small_animal/smdeer.jpg");
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
                 img = new ImageIcon("src/small_animal/smeagle.jpg");
                 jb3[k] = new JButton(img);
                 jb3[k].setText("3");
              //   jb3[k].setBackground(Color.BLACK);
                }
                else if(flag3 == 1){
                    
                  img = new ImageIcon("src/small_animal/smrabbit.jpg");               
                  jb3[k] = new JButton(img);
                  jb3[k].setText("4");
                // jb3[k].setBackground(Color.white);
                }
                else if(flag3 == 2){
                  img = new ImageIcon("src/small_animal/smtiger.jpg");  
               //  jb3[k].setBackground(Color.orange);
                 jb3[k] = new JButton(img);
                 jb3[k].setText("1");
                 cyan = cyan + 1;
                }
                else if(flag3 == 3){
                 img = new ImageIcon("src/small_animal/smlion.jpg");
                 jb3[k] = new JButton(img);
                 jb3[k].setText("4");
               //  jb3[k].setBackground(Color.GRAY);
                }
                else if(flag3 == 4){
                  img = new ImageIcon("src/small_animal/smpanda.jpg");
                // jb3[k].setBackground(Color.BLUE); 
                 jb3[k] = new JButton(img);
                 jb3[k].setText("0");
                 green = green + 1;
                }
                else if(flag3 == 5){
                   img = new ImageIcon("src/small_animal/smgirrafe.jpg");
                  jb3[k] = new JButton(img);
                  jb3[k].setText("4");
                // jb3[k].setBackground(Color.MAGENTA);
                }
                else if(flag3 == 6){
                     img = new ImageIcon("src/small_animal/smdeer.jpg");
                  jb3[k] = new JButton(img);
                  jb3[k].setText("4");
                // jb3[k].setBackground(Color.ORANGE);
                }
                else if(flag3 == 7){
                  img = new ImageIcon("src/small_animal/smelephant.jpg");
                  jb3[k] = new JButton(img);
                  jb3[k].setText("4");
                // jb3[k].setBackground(Color.PINK);
                }
                else if(flag3 == 8){
                     img = new ImageIcon("src/small_animal/smowl.jpg");
                     jb3[k] = new JButton(img);
                     jb3[k].setText("4");
                // jb3[k].setBackground(Color.WHITE);
                }
                else if(flag3 == 9){
                   img = new ImageIcon("src/small_animal/smzebra.jpg");
                   jb3[k] = new JButton(img);
                   jb3[k].setText("4");
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
                       if(i == -5030 && count3<(green+cyan)){
                           JOptionPane.showMessageDialog(null,"GAME_OVER FOR NOT COLLECTING ALL THE PANDAS AND ROYAL BENGAL TIGERS  ","Message",JOptionPane.ERROR_MESSAGE);
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
        if(s == "0"){
            tem3.setIcon(null);
            tem3.setText("");
            tem3.setBackground(Color.BLUE);
            count3 = count3 + 1;
        }
        else if(s == "1"){
            tem3.setIcon(null);
            tem3.setText("");
            tem3.setBackground(Color.ORANGE);
            count3 = count3 + 1;
        }
        else{
             tem3.setIcon(null);
              tem3.setText("");
             tem3.setBackground(Color.RED);
            JOptionPane.showMessageDialog(null,"GAME_OVER","Message",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
       if(s == "1" || s == "0"){
           if(count3 == (green+cyan)){
                 ran = r3.nextInt();
                 ran = Math.abs(ran);
                 ran = ran%4;
                 op3[ran] = count3;
                 z = count3;
                 for(i = 0;i<4;i++){
                     if(i!=ran){
                         op3[i] = ++z;
                     }
                 }
                 gg = JOptionPane.showOptionDialog(null, "GUESS HOW MANY PANDAS AND ROYAL BENGAL TIGERS YOU HAVE COLLECTED ??","Message",JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, op3,op3[0]);
                if(op3[gg] == count3){
                    dispose();
                    BLOCK_INTERFACE_7 ob = new BLOCK_INTERFACE_7();
                    Watch_final ob2 = new Watch_final();
                }
                else{
                    JOptionPane.showMessageDialog(null,"GAME_OVER","Message",JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
                 
             }
       }
    }
}
