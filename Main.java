// write a method for when to revalidate the frame?
// make more efficient when erasing label...?

import java.awt.Color;
import java.awt.event.*;  // actions for buttons
import javax.swing.*; // import swing package
public class Main{
    public static void main(String[] args){
        JFrame main_frame = new JFrame("Integer Verifier"); // make window
        main_frame.setSize(1000, 500); // set default size of window

        JLabel correct_input = new JLabel("It is an integer!");
        correct_input.setBounds(450, 250, 100, 25);
        correct_input.setBackground(Color.GREEN);
        correct_input.setOpaque(true);
        main_frame.add(correct_input);
        correct_input.setVisible(false);

        JLabel invalid_input = new JLabel("Not an integer.");
        invalid_input.setBounds(450, 250, 100, 25);
        invalid_input.setBackground(Color.RED);
        invalid_input.setOpaque(true);
        main_frame.add(invalid_input);
        invalid_input.setVisible(false);

        JLabel prompt = new JLabel("Enter an integer: ");
        prompt.setBounds(450, 50, 200, 25);
        main_frame.add(prompt);

        JTextField user_input = new JTextField();
        user_input.setBounds(400, 100, 200, 25);

        JButton verify_button = new JButton("Verify"); // make button
        verify_button.setBounds(300, 150, 100, 60); // x-coord, y-coord, width, height
        verify_button.addActionListener(new ActionListener(){ // what occurs if a button is pressed/an action is performed
            public void actionPerformed(ActionEvent e){
                String user_num_string = user_input.getText(); // whatever user typed in field becomes a string
                try{
                    int user_num_int = Integer.parseInt(user_num_string); // is user input an int?
                    invalid_input.setVisible(false);
                    correct_input.setVisible(true);
                    main_frame.revalidate();
                    main_frame.repaint();
                }
                catch(NumberFormatException err){
                    correct_input.setVisible(false);
                    invalid_input.setVisible(true);
                    main_frame.revalidate();
                    main_frame.repaint();
                }
            }
        });
        JButton exit_button = new JButton("Exit");
        exit_button.setBounds(600, 150, 100, 60);
        exit_button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                main_frame.dispose();
            }
        });

        main_frame.add(user_input);
        main_frame.add(verify_button); // add button to frame
        main_frame.add(exit_button);
        main_frame.setLayout(null); // without this the button takes up the entire window xD
        main_frame.setResizable(false);
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        main_frame.setVisible(true); // make window visible
    }
}