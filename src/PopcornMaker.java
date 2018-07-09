import javax.swing.JOptionPane;

public class PopcornMaker { public static void main(String[] args) {
	String q = JOptionPane.showInputDialog("What flavor do you want your popcorn");
	String qq = JOptionPane.showInputDialog("How long do you want to put in your popcorn for");
	int qq2 = Integer.parseInt(qq);
 Popcorn p = new Popcorn(q);
 Microwave m = new Microwave();
 m.setTime(qq2);
 m.putInMicrowave(p);
 m.startMicrowave();
}

}
