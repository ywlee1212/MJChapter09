package exmaple;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Example09_02 extends JFrame {
	
	Container ct;
	JButton addBtn, subBtn, mulBtn, divBtn, calBtn;
	
	public Example09_02() {
		ct = this.getContentPane();
		ct.setLayout(new BorderLayout());
		ct.setBackground(Color.orange);

		this.setTitle("예제 09-02");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		addBtn = new JButton("ADD");
		ct.add(addBtn, BorderLayout.NORTH);

		subBtn = new JButton("SUB");
		ct.add(subBtn, BorderLayout.SOUTH);

		mulBtn = new JButton("곱하기");
		divBtn = new JButton("나누기");

		calBtn = new JButton("계산결과");

		ct.add(mulBtn,BorderLayout.WEST);
		ct.add(divBtn,BorderLayout.EAST);
		ct.add(calBtn,BorderLayout.CENTER);

		this.setSize(300, 300);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Example09_02();
	}

}
