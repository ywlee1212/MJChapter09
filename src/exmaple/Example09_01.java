package exmaple;

import java.awt.Color;
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
		ct.setBackground(Color.orange);

		this.setTitle("예제 09-01");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		addBtn = new JButton("ADD");
		ct.add(addBtn);

		subBtn = new JButton("SUB");
		ct.add(subBtn);

		mulBtn = new JButton("곱하기");
		divBtn = new JButton("나누기");

		calBtn = new JButton("계산하기");

		ct.add(mulBtn);
		ct.add(divBtn);
		ct.add(calBtn);

		this.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example09_01();
	}

}
