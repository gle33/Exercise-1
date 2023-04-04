import javax.swing.*; // import swing package
public class Main{
    public static void main(String[] args){
        JFrame main_frame = new JFrame(); // make window
        main_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main_frame.setSize(400,400); // set default size of window
        JButton exit_button = new JButton("Exit"); // make button
        JButton verify_button = new JButton("Verify");
        exit_button.setSize(10,10);
        verify_button.setSize(10,10);
        main_frame.getContentPane().add(exit_button); // add button to frame
        main_frame.getContentPane().add(verify_button);
        main_frame.setVisible(true); // make window visible
    }
}