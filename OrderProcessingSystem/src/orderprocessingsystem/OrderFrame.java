/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderprocessingsystem;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author student
 */
public class OrderFrame extends javax.swing.JFrame {

    public static ArrayList<String> name=new ArrayList<>();
    public static ArrayList<String> password=new ArrayList<>();
    public static ArrayList<Integer> items=new ArrayList<>();
    public static ArrayList<Integer> quantity=new ArrayList<>();
    public static String username="";
    public static int cp=0;
    int price=0;
    /**
     * Creates new form OrderFrame
     */
    public OrderFrame() {
        initComponents();
        jToggleButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(jToggleButton1.isSelected())
                {
                    login.setVisible(false);
                    register.setVisible(false);
                    jButton1.setVisible(false);
                    jLabel1.setVisible(false);
                    jLabel2.setVisible(false);
                    jToggleButton1.setText("APPEAR");
                }
                else
                {
                    login.setVisible(true);
                    register.setVisible(true);
                    jButton1.setVisible(true);
                    jLabel1.setVisible(true);
                    jLabel2.setVisible(true);
                    jToggleButton1.setText("DISAPPEAR");
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        login = new javax.swing.JButton();
        register = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        login.setText("LOGIN");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel1.setText("NEW USER SHOULD REGISTER FIRST!");

        jLabel2.setText("CHOOSE AN OPTION");

        jButton1.setText("ADMIN LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("DISAPPEAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(register)
                                    .addComponent(jButton1)
                                    .addComponent(login))))
                        .addGap(0, 116, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jToggleButton1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(login)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        //new OrderFrame().dispose();
        //new Login().setVisible(true);
        this.hide();
        JButton submit=new JButton("Submit");
        JTextField name1=new JTextField("");
        JPasswordField password1=new JPasswordField("");
        JLabel label=new JLabel("");
        System.out.println("Hello");
                JFrame.setDefaultLookAndFeelDecorated(true);
                JFrame frame = new JFrame("GridLayout Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(3, 2));
                frame.add(new JLabel("Enter Username"));
                frame.add(name1);
                frame.add(new JLabel("Enter Password"));
                frame.add(password1);
                frame.add(submit);
                frame.add(label);
                frame.pack();
                frame.setVisible(true);
                frame.setSize(600, 150);
                submit.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String n=name1.getText();
                String p=password1.getText();
                    Iterator it1=name.iterator();
                    Iterator it2=password.iterator();
                    int flag=0;
                    while(it1.hasNext() && it2.hasNext())
                    {
                        if(it1.next().equals(n) && it2.next().equals(p))
                        {
                            flag=1;
                            break;
                        }
                        else
                        {
                            it2.next();
                        }
                    }
                    if(flag==1)
                    {
                        username=n;
                        frame.hide();
                        new Login().setVisible(true);
                    }
                    else{
                        label.setText("Username or password invalid!");
                    }
            }
        });
    }//GEN-LAST:event_loginActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        this.hide();
        JButton register=new JButton("Register");
        JTextField name2=new JTextField("");
        JPasswordField password2=new JPasswordField("");
        JLabel label=new JLabel("");
        JRadioButton rb1=new JRadioButton("Mr.");
        JRadioButton rb2=new JRadioButton("Mrs.");
        ButtonGroup bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        JFrame.setDefaultLookAndFeelDecorated(true);
                JFrame frame = new JFrame("GridLayout Test");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new GridLayout(4, 2));
                frame.add(rb1);
                frame.add(rb2);
                frame.add(new JLabel("Enter Name"));
                frame.add(name2);
                frame.add(new JLabel("Enter new Password"));
                frame.add(password2);
                frame.add(register);
                frame.add(label);
                frame.pack();
                frame.setVisible(true);
                frame.setSize(600, 150);
                register.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String n2=(String)name2.getText();
                String p2=password2.getText();
                
                if((!(n2.equals("")))){
                    System.out.println("hello"+n2+"world");
                    name.add(n2);
                    password.add(p2);
                    frame.hide();
                    new OrderFrame().setVisible(true);
                }
                else
                {
                    label.setText("Enter a username!");
                }
            }
        });
    }//GEN-LAST:event_registerActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        JButton submit=new JButton("Submit");
        JTextField name1=new JTextField("");
        JPasswordField password1=new JPasswordField("");
        JLabel label=new JLabel("");
        System.out.println("Hello");
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("GridLayout Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(3, 2));
        frame.add(new JLabel("Admin Name"));
        frame.add(name1);
        frame.add(new JLabel("Password"));
        frame.add(password1);
        frame.add(submit);
        frame.add(label);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 150);
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n=name1.getText();
                String p=password1.getText();
                int flag=0;    
                if(n.equals("rishav") && p.equals("rishav"))
                {
                    flag=1;
                }
                if(flag==1)
                {
                    frame.hide();
                    new Admin().setVisible(true);
                }
                else{
                        label.setText("Username or password invalid!");
                    }
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton login;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
