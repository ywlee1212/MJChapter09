package exmaple;

import java.awt.Container;

import javax.swing.JFrame;

public class Example09_01 extends JFrame {
	
	Container ct;
	
	public Example09_01() {

		ct=this.getContentPane();
		
		this.setTitle("예제 09-01");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example09_01();
	}

}
