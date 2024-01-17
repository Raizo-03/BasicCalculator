package main;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculator {
	private JTextField txtResult;
	private JFrame frame;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnEquals, btnAdd, btnSub, btnMul, btnDiv, btnClear;
	public double one, two, three, four, five, six, seven, eight, nine, zero;
	public int sum, difference, product, qoutient, firstVal, secondVal;
	char operation;
	public int firstNum, secondNum;
	String firstValue, secondValue;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.setBounds(100, 100, 400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		ImageIcon icon = new ImageIcon("C://Users//USER//eclipse-workspace//BasicCalculator//images//icon.png");
		frame.setIconImage(icon.getImage());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.yellow);
		Border borderPanel = BorderFactory.createLineBorder(Color.black);
		panel.setBorder(borderPanel);
		panel.setVisible(true);
		frame.getContentPane().add(panel);
	    panel.setLayout(new BorderLayout());
		panel.setLayout(null);
		

	    // add the panel to the content pane of the frame
	    frame.getContentPane().add(panel);	
	    
	    Border borderText = BorderFactory.createLineBorder(Color.DARK_GRAY, 2); 
		txtResult = new JTextField();
		txtResult.setBounds(10, 30, 360, 80);
		txtResult.setColumns(10);
		panel.add(txtResult);
		txtResult.setFont(new Font("Tahoma", Font.BOLD, 40));
		txtResult.setBorder(borderText);
		txtResult.setHorizontalAlignment(JTextField.RIGHT);
		
		//BUTTONS
		
		btn1 = new JButton("7");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        txtResult.setText(txtResult.getText() + "7");
		        
		        
			}
		});
		
		btn1.setFont(new Font("Xenara", Font.BOLD, 40));
		btn1.setBounds(20, 150, 75, 60);
		panel.add(btn1);
		

		btn2 = new JButton("8");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        txtResult.setText(txtResult.getText() + "8");

			}
		});
		btn2.setFont(new Font("Xenara", Font.BOLD, 40));
		btn2.setBounds(110, 150, 75, 60);
		panel.add(btn2);
		
		btn3 = new JButton("9");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        txtResult.setText(txtResult.getText() + "9");

			}
		});
		btn3.setFont(new Font("Xenara", Font.BOLD, 40));
		btn3.setBounds(200, 150, 75, 60);
		panel.add(btn3);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        txtResult.setText(txtResult.getText() + "4");

			}
		});
		btn4.setFont(new Font("Xenara", Font.BOLD, 40));
		btn4.setBounds(20, 220, 75, 60);
		panel.add(btn4);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        txtResult.setText(txtResult.getText() + "5");

			}
		});
		btn5.setFont(new Font("Xenara", Font.BOLD, 40));
		btn5.setBounds(110, 220, 75, 60);
		panel.add(btn5);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        txtResult.setText(txtResult.getText() + "6");

			}
		});
		btn6.setFont(new Font("Xenara", Font.BOLD, 40));
		btn6.setBounds(200, 220, 75, 60);
		panel.add(btn6);
		
		btn7 = new JButton("1");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        txtResult.setText(txtResult.getText() + "1");

			}
		});
		btn7.setFont(new Font("Xenara", Font.BOLD, 40));
		btn7.setBounds(20, 290, 75, 60);
		panel.add(btn7);
		
		btn8 = new JButton("2");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        txtResult.setText(txtResult.getText() + "2");

			}
		});
		btn8.setFont(new Font("Xenara", Font.BOLD, 40));
		btn8.setBounds(110, 290, 75, 60);
		panel.add(btn8);
		
		btn9 = new JButton("3");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        txtResult.setText(txtResult.getText() + "3");

			}
		});
		btn9.setFont(new Font("Xenara", Font.BOLD, 40));
		btn9.setBounds(200, 290, 75, 60);
		panel.add(btn9);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		        txtResult.setText(txtResult.getText() + "0");

			}
		});
		

		btn0.setFont(new Font("Xenara", Font.BOLD, 40));
		btn0.setBounds(110, 360, 75, 60);
		panel.add(btn0);
		
		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstValue = txtResult.getText();
				txtResult.setText("");
				operation = '+';
				
			}

			
		});
		
		
		
		
		btnAdd.setFont(new Font("Xenara", Font.BOLD, 40));
		btnAdd.setBounds(300, 150, 60, 60);
		panel.add(btnAdd);
		
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstValue = txtResult.getText();
				txtResult.setText("");
				operation = '-';
			}
		});
		btnSub.setFont(new Font("Xenara", Font.BOLD, 40));
		btnSub.setBounds(300, 220, 60, 60);
		panel.add(btnSub);
		
		btnMul = new JButton("x");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstValue = txtResult.getText();
				txtResult.setText("");
				operation = '*';
			}
		});
		btnMul.setFont(new Font("Xenara", Font.BOLD, 40));
		btnMul.setBounds(300, 290, 60, 60);
		panel.add(btnMul);
		

		btnDiv = new JButton("÷");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstValue = txtResult.getText();
				txtResult.setText("");
				operation = '/';
			}
		});
		btnDiv.setFont(new Font("Xenara", Font.BOLD, 40));
		btnDiv.setBounds(300, 360, 60, 60);
		panel.add(btnDiv);
		

		btnEquals = new JButton("=");
		btnEquals.setBounds(200, 360, 75, 60);
		btnEquals.setFont(new Font("Xenara", Font.BOLD, 40));
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondValue = txtResult.getText();
				
				firstNum = Integer.parseInt(firstValue);
				secondNum = Integer.parseInt(secondValue);
				calculate(firstNum, secondNum); 
			}
			
			public void calculate(int num1, int num2) {
				switch(operation) {
				case '+':
				sum = num1 + num2;
				String summ = Integer.toString(sum);
				txtResult.setText(summ);
				break;
				
				case '-':
				difference = num1 - num2;
				String diff = Integer.toString(difference);
				txtResult.setText(diff);
				break;
				
				case '*':
				product = num1 * num2;
				String prod = Integer.toString(product);
				txtResult.setText(prod);
				break;
				
				case '/':
				qoutient = num1 / num2;
				String qou = Integer.toString(qoutient);
				txtResult.setText(qou);
				break;			
				}
				
			}
		});
		panel.add(btnEquals);
		
		btnClear = new JButton("CLEAR");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText(" ");
			}
		});
		btnClear.setFont(new Font("Xenara", Font.BOLD, 15));
		btnClear.setBounds(10, 360, 90, 80);
		panel.add(btnClear);

}
}