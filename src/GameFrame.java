import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame(){
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.add(new GamePanel());
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);


    }
    public static void main(String[] args) {
        new GameFrame();
    }
}
