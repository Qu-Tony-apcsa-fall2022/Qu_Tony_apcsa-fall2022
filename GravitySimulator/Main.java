import javax.swing.JFrame;
import java.awt.Component;

class Main extends JFrame{
  private static final int WIDTH = 800;
	private static final int HEIGHT = 600;
  public Main() {
    super("Gravity Simulator");
		setSize(WIDTH,HEIGHT);

		SimulatorRunner theGame = new SimulatorRunner();
		((Component)theGame).setFocusable(true);

		getContentPane().add(theGame);

		setVisible(true);
  }
  public static void main(String[] args){
    Main run = new Main();
  }
}