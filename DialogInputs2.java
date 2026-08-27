package helloworld;

import javax.swing.JOptionPane;

public class DialogInputs2 {

    public static void main(String[] args) {

        String first = JOptionPane.showInputDialog(null, "Enter first integer", "Example 1", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "First integer is " + first,
                "Example 1", JOptionPane.INFORMATION_MESSAGE);

        String second = JOptionPane.showInputDialog(null, "Enter second integer", "Example 2", JOptionPane.QUESTION_MESSAGE);

        JOptionPane.showMessageDialog(null, "Second integer is " + second,
                "Example 2", JOptionPane.INFORMATION_MESSAGE);

        int firstInt = Integer.parseInt(first);
        int secondInt = Integer.parseInt(second);

        JOptionPane.showMessageDialog(null, "Sum of the two integers is " +
                (firstInt + secondInt), "Example 3",
                JOptionPane.INFORMATION_MESSAGE);
    }
}