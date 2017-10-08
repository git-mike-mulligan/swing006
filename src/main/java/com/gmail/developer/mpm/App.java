package com.gmail.developer.mpm;

import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MultipleSelectionFrame msf = new MultipleSelectionFrame();
        msf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        msf.setSize(350,150);
        msf.setVisible(true);
    }
}
