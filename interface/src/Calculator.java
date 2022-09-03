import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculator implements ActionListener{
	JTextField tf;
	JFrame jf;
	JButton one;
	JButton two;
	JButton three;
	JButton four;
	JButton five;
	JButton six;
	JButton seven;
	JButton eight;
	JButton nine;
	JButton zero;
	JButton add;
	JButton sub;
	JButton multiply;
	JButton divide;
	JButton equal;
	JButton cancel;
	Calculator()
	{
		jf=new JFrame("Calculator");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setBounds(100,200,300,400);
		tf=new JTextField();
        tf.setBounds(30,40,200,60);
        one=new JButton("1");
        one.setBounds(30,100,50,40);
        two=new JButton("2");
        two.setBounds(80,100,50,40);
        three=new JButton("3");
        three.setBounds(130,100,50,40);
        add=new JButton("+");
        add.setBounds(180,100,50,40);
        four=new JButton("4");
        four.setBounds(30,140,50,40);
        five=new JButton("5");
        five.setBounds(80,140,50,40);
        six=new JButton("6");
        six.setBounds(130,140,50,40);
        sub=new JButton("-");
        sub.setBounds(180,140,50,40);
        seven=new JButton("7");
        seven.setBounds(30,180,50,40);
        eight=new JButton("8");
        eight.setBounds(80,180,50,40);
        nine=new JButton("9");
        nine.setBounds(130,180,50,40);
        multiply=new JButton("*");
        multiply.setBounds(180,180,50,40);
        cancel=new JButton("C");
        cancel.setBounds(30,220,50,40);
        zero=new JButton("0");
        zero.setBounds(80,220,50,40);
        equal=new JButton("=");
        equal.setBounds(130,220,50,40);
        divide=new JButton("/");
        divide.setBounds(180,220,50,40);
        jf.add(tf);
        jf.add(one);
        jf.add(two);
        jf.add(three); 
        jf.add(add);
        jf.add(four);
        jf.add(five);
        jf.add(six);
        jf.add(sub);
        jf.add(seven);
        jf.add(eight);
        jf.add(nine);;
        jf.add(multiply);
        jf.add(cancel);
        jf.add(zero);
        jf.add(equal);
        jf.add(divide);
        zero.addActionListener(this);
       one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        equal.addActionListener(this);
        cancel.addActionListener(this);
        jf.setLayout(null);  
        jf.setVisible(true); 
	}
	 public void actionPerformed(ActionEvent e)
	 { 
		 String display = tf.getText();
         if(e.getSource()==zero)
         {
             String Zero = display + zero.getText();
             tf.setText(Zero);
         }
         else if(e.getSource()==one)
         {
             String One = display + one.getText();
             tf.setText(One);
         }
         else if(e.getSource()==two)
         {
             String Two = display + two.getText();
             tf.setText(Two);
         }
         else if(e.getSource()==three)
         {
             String Three = display + three.getText();
             tf.setText(Three);
         }
         else if(e.getSource()==four)
         {
             String Four = display + four.getText();
             tf.setText(Four);
         }
         else if(e.getSource()==five)
         {
             String Five = display + five.getText();
             tf.setText(Five);
         }
         else if(e.getSource()==six)
         {
             String Six= display + six.getText();
             tf.setText(Six);
         }
         else if(e.getSource()==seven)
         {
             String Seven = display + seven.getText();
             tf.setText(Seven);
         }
         else if(e.getSource()==eight)
         {
             String Eight = display + eight.getText();
             tf.setText(Eight);
         }
         else if(e.getSource()==nine)
         {
             String Nine = display+ nine.getText();
             tf.setText(Nine);
         }
         else if(e.getSource()==add)
         {
             String Add= display + add.getText();
             tf.setText(Add);
         }
         else if(e.getSource()==equal)
         {
             String Equal = equal.getText();
             tf.setText(Equal);
         }
         else if(e.getSource()==sub)
         {
             String Sub = display + sub.getText();
             tf.setText(Sub);
         }
         else if(e.getSource()==multiply)
         {
             String Multiply = display + multiply.getText();
             tf.setText(Multiply);
         }
         else if(e.getSource()==divide)
         {
             String Divide = display + divide.getText();
             tf.setText(Divide);
         }
         else if(e.getSource()==cancel)
         {
             String Cancel = "";
             tf.setText(Cancel);
         }
         double result=0.0;
         for(int i=0; i<display.length();i++)
         {
             if(e.getSource()==equal)
             {
                 if(display.charAt(i)=='+')
                 {
                	 result = Double.parseDouble(display.substring(0,i)) + Double.parseDouble(display.substring(i+1,display.length()));
                     tf.setText(String.valueOf(result));
                 }
                 else if(display.charAt(i)=='-')
                 {
                     result = Double.parseDouble(display.substring(0,i)) - Double.parseDouble(display.substring(i+1,display.length()));
                     tf.setText(String.valueOf(result));
                 }
                 else if(display.charAt(i)=='/')
                 {
                     result = Double.parseDouble(display.substring(0,i)) / Double.parseDouble(display.substring(i+1,display.length()));
                     tf.setText(String.valueOf(result));
                 }
                 else if(display.charAt(i)=='*')
                 {
                     result = Double.parseDouble(display.substring(0,i)) * Double.parseDouble(display.substring(i+1,display.length()));
                     tf.setText(String.valueOf(result));
                 }
             }
         }

     }
	 public static String evaluate(String expression)
	 {
		 char[] arr = expression.toCharArray();
	      String operand1 = "";
	      String operand2 = "";
	      String operator = "";
	      double result = 0;

	      for (int i = 0; i < arr.length; i++)
	      {
	         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') 
	         {
	            if(operator.isEmpty())
	            {
	               operand1 += arr[i];
	            }
	            else
	            {
	               operand2 += arr[i];
	            }
	         }
	         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') {
	             operator += arr[i];
	          }
	       }

	       if (operator.equals("+"))
	          result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
	       else if (operator.equals("-"))
	          result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
	       else if (operator.equals("/"))
	          result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
	       else
	          result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
	       return operand1 + operator + operand2 + "=" +result;
	    }
	
	 public static void main(String[] args) {  
	        new Calculator();  
	    } 
}
