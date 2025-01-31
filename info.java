import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.*;

public class info {

    public static void main(String[] args) {
        JFrame frame = new JFrame("info");
        frame.setContentPane(new info().mypanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

private JTextField textField1;
private JTextField textField2;
private JTextField textField3;
private JButton button1;
private JButton button2;
private JPanel mypanel;
private JTextField textField4;
    private JButton exitButton;
    Connection con;
    PreparedStatement pst;

    public info() {
connect();


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String name;
            String email;
            String age;
            String gender;

            name= textField1.getText();
            email=textField2.getText();
            age=textField3.getText();
            gender=textField4.getText();


            try{
                pst= con.prepareStatement("insert into register(Name,Email,Age,Gender)values(?,?,?,?)");
                pst.setString(1,name);
                pst.setString(2,email);
                pst.setString(3,age);
                pst.setString(4,gender);

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Thanks for registration");

                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");

                textField1.requestFocus();
                textField2.requestFocus();


            }
            catch (SQLException ex){
                ex.printStackTrace();
                
            }


            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");

            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
    }
    public void connect(){

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/form","root", "");
            System.out.println("success");
        }catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }catch (SQLException ex){
            ex.printStackTrace();
        }










    }
}