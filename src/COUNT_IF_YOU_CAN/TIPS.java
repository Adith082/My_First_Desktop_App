
package COUNT_IF_YOU_CAN;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TIPS extends JFrame {
    private Container c;
    private JLabel jl;
    private Font f;
    TIPS(){
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setTitle("INITIAL MESSAGE");
        this.setBounds(100,10,1200,700);
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        f = new Font("Arial",Font.BOLD,30);
        jl = new JLabel("<html><strong>" + "1. !!! WELCOME !!! <br>2. THE GAME WILL BE DIVIDED INTO SEVERAL PHASES."
                + "<br>3. IN EACH PHASE YOU WILL LEARN ABOUT A GROUP OF OBJECTS BY SEEING THEIR PICTURE AND KNOWING THEIR NAMES."
                + "<br><br>4. AFTER THAT THE REAL DEAL STARTS."
                + "<br>5. YOU HAVE TO COLLECT AS WELL AS COUNT SPECIFIC OBJECT(WILL BE INFORMED BEFORE STARTING THE LEVEL) WHICH YOU ALREADY LEARNED PREVIOUSLY."
                + "<br><br>6. HERE IS THE FUN PART : THERE WILL BE VARIATIONS WHICH MIGHT BLOW YOUR MIND !!!"
                + "<br>7. REMEMBER COLLECTING THE WRONG OBJECT MEANS GAME_OVER."
                + "<br>8. IF YOU SOMEHOW PASS THE COLLECTION TASK YOU HAVE TO ANSWER CORRECTLY HOW MANY OBJECTS YOU HAVE COLLECTED OTHER WISE GAME_OVER."
                + "<br><br>9. SO ARE YOU UP FOR THE CHALLENGE ???"
                + "<br>10. IF SO THEN WITNESS THE EXCITEMENT AHEAD. GOODLUCK !!!</strong></html>",JLabel.LEFT);
        jl.setBounds(0,-20,1200,700);
        jl.setFont(f);
        jl.setForeground(Color.black);
       c.add(jl);
    }
}
