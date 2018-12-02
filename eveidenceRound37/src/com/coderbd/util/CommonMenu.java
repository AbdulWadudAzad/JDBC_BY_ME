package com.coderbd.util;

import com.coderbd.view.Login;
import com.coderbd.view.PurchaseView;
import com.coderbd.view.SalesView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class CommonMenu {

    public static JMenuBar commonMenu(JFrame f) {
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("File");
      
        
        JMenuItem purchase = new JMenuItem("Purchase");
        purchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new PurchaseView().setVisible(true);
            }
        });
        JMenuItem sales = new JMenuItem("Sales");
        sales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new SalesView().setVisible(true);
            }
        });
       
        JMenuItem signOut = new JMenuItem("Sign Out");
        signOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.setVisible(false);
                new Login().setVisible(true);
            }
        });
      
     
        file.add(purchase);
        file.addSeparator();
        file.add(sales);
        file.addSeparator();     
        file.add(signOut);   
    


        menuBar.add(file);  
        f.setJMenuBar(menuBar);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        return menuBar;
    }
}
