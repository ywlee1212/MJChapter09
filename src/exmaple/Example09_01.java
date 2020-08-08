package exmaple;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example09_01 extends JFrame {

	Container ct;
	JButton addBtn, subBtn, mulBtn, divBtn, calBtn;

	public Example09_01() {

		ct = this.getContentPane();
		ct.setLayout(new FlowLayout());

		this.setTitle("예제 09-01");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		addBtn = new JButton("ADD");
		ct.add(addBtn);

		subBtn = new JButton("SUB");
		ct.add(subBtn);

		this.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example09_01();
	}

}
