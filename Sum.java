import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
class Sum extends Frame implements ActionListener
{
    TextField tf1,tf2,tf3;
    Sum()
    {
        Label l1 = new Label("Enter Num1");
        Label l2 = new Label("Enter Num2");
        l1.setBounds(50, 100, 150, 30);
        l2.setBounds(50, 150, 150, 30);
        add(l1);
        add(l2);
        
        tf1 = new TextField();
        tf2 = new TextField();
        tf1.setBounds(200, 100, 100, 30);
        tf2.setBounds(200,150,100,30);
        add(tf1);
        add(tf2);
        
        Button b = new Button("Add");
        b.setBounds(200,250,100,30);
        b.addActionListener(this);
        add(b);

        tf3  = new TextField();
        tf3.setBounds(200, 200, 100, 30);
        add(tf3);
        
        setSize(450,450);
        setTitle("Sum of two Numbers");
        setLayout(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        int num1 = Integer.parseInt(tf1.getText());
        int num2 = Integer.parseInt(tf2.getText());
        int sum = num1+num2;
        tf3.setText("Sum = "+sum);

    }
    
    public static void main(String[] args)
    {
        Sum obj = new Sum();
    }
}