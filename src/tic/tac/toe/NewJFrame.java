/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tic.tac.toe;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class NewJFrame extends javax.swing.JFrame {
    private String game = "O";
    private int x = 0;
    private int o = 0;
    

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        setSize(800,800);
        setLocationRelativeTo(null);
    }
    
    private void score()
    {
        label.setText(String.valueOf(o));
        labelX.setText(String.valueOf(x));
    }
    
    private void changeSign()
    {
        if(game.equalsIgnoreCase("O"))
        {
            game = "X";
        }
        else
        {
            game = "O";
        }
    }
    
    public void restart()
    {
        box1.setText("");
        box2.setText("");
        box3.setText("");
        box4.setText("");
        box5.setText("");
        box6.setText("");
        box7.setText("");
        box8.setText("");
        box9.setText("");
        
        box1.setBackground(Color.BLACK);
        box2.setBackground(Color.BLACK);
        box3.setBackground(Color.BLACK);
        box4.setBackground(Color.BLACK);
        box5.setBackground(Color.BLACK);
        box6.setBackground(Color.BLACK);
        box7.setBackground(Color.BLACK);
        box8.setBackground(Color.BLACK);
        box9.setBackground(Color.BLACK);  
    }
    
    private void win()
    {
        String b1 = box1.getText();
        String b2 = box2.getText();
        String b3 = box3.getText();
        String b4 = box4.getText();
        String b5 = box5.getText();
        String b6 = box6.getText();
        String b7 = box7.getText();
        String b8 = box8.getText();
        String b9 = box9.getText();
        
        if(b1 != "" && b2 != "" &&  b3 != "" &&  b4 != "" &&  b5 != "" && b6 != "" && b7 != "" && b8 != "" && b9 != "")
        {
           String[] options = {"OK"};
           int option1 = JOptionPane.showOptionDialog(null, "Nobody Won", "DRAW!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
           if(option1 == JOptionPane.OK_OPTION)
           {
               restart();
           }
        }
        
        if(b1 == ("O") && b2 == ("O") && b3 == ("O"))
        {
            
            box1.setBackground(Color.ORANGE);
            box2.setBackground(Color.ORANGE);
            box3.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player O wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                o++;
                score();
                restart();
            }
            
        }
        
        if(b4 == ("O") && b5 == ("O") && b6 == ("O"))
        {
            
            box4.setBackground(Color.ORANGE);
            box5.setBackground(Color.ORANGE);
            box6.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player O wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                o++;
                score();
                restart();
            }

        }
        
        if(b7 == ("O") && b8 == ("O") && b9 == ("O"))
        {
            
            box7.setBackground(Color.ORANGE);
            box8.setBackground(Color.ORANGE);
            box9.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player O wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                o++;
                score();
                restart();
            }

        }
        
        if(b1 == ("O") && b4 == ("O") && b7 == ("O"))
        {
            
            box1.setBackground(Color.ORANGE);
            box4.setBackground(Color.ORANGE);
            box7.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player O wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                o++;
                score();
                restart();
            }

        }
        
        if(b2 == ("O") && b5 == ("O") && b8 == ("O"))
        {
            
            box2.setBackground(Color.ORANGE);
            box5.setBackground(Color.ORANGE);
            box8.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player O wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                o++;
                score();
                restart();
            }

        }
        
        if(b3 == ("O") && b6 == ("O") && b9 == ("O"))
        {
            
            box3.setBackground(Color.ORANGE);
            box6.setBackground(Color.ORANGE);
            box9.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player O wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                o++;
                score();
                restart();
            }


        }
        
        if(b1 == ("O") && b5 == ("O") && b9 == ("O"))
        {
            
            box1.setBackground(Color.ORANGE);
            box5.setBackground(Color.ORANGE);
            box9.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player O wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                o++;
                score();
                restart();
            }
        }
        
        if(b3 == ("O") && b5 == ("O") && b7 == ("O"))
        {
            
            box3.setBackground(Color.ORANGE);
            box5.setBackground(Color.ORANGE);
            box7.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player O wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                o++;
                score();
                restart();
            }
        }
        
        
        
        
        if(b1 == ("X") && b2 == ("X") && b3 == ("X"))
        {
            
            box1.setBackground(Color.ORANGE);
            box2.setBackground(Color.ORANGE);
            box3.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player X wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                x++;
                score();
                restart();
            }
            
        }
        
        if(b4 == ("X") && b5 == ("X") && b6 == ("X"))
        {
            
            box4.setBackground(Color.ORANGE);
            box5.setBackground(Color.ORANGE);
            box6.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player X wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                x++;
                score();
                restart();
            }

        }
        
        if(b7 == ("X") && b8 == ("X") && b9 == ("X"))
        {
            
            box7.setBackground(Color.ORANGE);
            box8.setBackground(Color.ORANGE);
            box9.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player X wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                x++;
                score();
                restart();
            }

        }
        
        if(b1 == ("X") && b4 == ("X") && b7 == ("X"))
        {
            
            box1.setBackground(Color.ORANGE);
            box4.setBackground(Color.ORANGE);
            box7.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player X wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                x++;
                score();
                restart();
            }

        }
        
        if(b2 == ("X") && b5 == ("X") && b8 == ("X"))
        {
            
            box2.setBackground(Color.ORANGE);
            box5.setBackground(Color.ORANGE);
            box8.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player X wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                x++;
                score();
                restart();
            }

        }
        
        if(b3 == ("X") && b6 == ("X") && b9 == ("X"))
        {
            
            box3.setBackground(Color.ORANGE);
            box6.setBackground(Color.ORANGE);
            box9.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player X wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                x++;
                score();
                restart();
            }


        }
        
        if(b1 == ("X") && b5 == ("X") && b9 == ("X"))
        {
            
            box1.setBackground(Color.ORANGE);
            box5.setBackground(Color.ORANGE);
            box9.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player X wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                x++;
                score();
                restart();
            }
        }
        
        if(b3 == ("X") && b5 == ("X") && b7 == ("X"))
        {
            
            box3.setBackground(Color.ORANGE);
            box5.setBackground(Color.ORANGE);
            box7.setBackground(Color.ORANGE);
            String[] options = {"OK"};
            int option1 = JOptionPane.showOptionDialog(null, "Player X wins", "Winner!!!", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(option1 == JOptionPane.OK_OPTION)
            {
                x++;
                score();
                restart();
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelX = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        box1 = new javax.swing.JButton();
        box2 = new javax.swing.JButton();
        box3 = new javax.swing.JButton();
        box4 = new javax.swing.JButton();
        box5 = new javax.swing.JButton();
        box6 = new javax.swing.JButton();
        box7 = new javax.swing.JButton();
        box8 = new javax.swing.JButton();
        box9 = new javax.swing.JButton();

        jButton3.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setText("Player O :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");
        setBounds(new java.awt.Rectangle(800, 400, 400, 400));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 15));

        resetButton.setBackground(new java.awt.Color(0, 0, 0));
        resetButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        resetButton.setForeground(new java.awt.Color(255, 255, 255));
        resetButton.setText("New Game");
        resetButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        exitButton.setBackground(new java.awt.Color(0, 0, 0));
        exitButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Exit");
        exitButton.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        labelX.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        labelX.setText("0");
        labelX.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel3.setText("Player O :");

        label.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        label.setText("0");
        label.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel6.setText("Player X :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelX, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(122, 122, 122))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(238, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jLabel6)
                    .addContainerGap(250, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelX)
                .addGap(18, 18, 18))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(54, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(21, 21, 21)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.GridLayout(3, 3, -20, -20));

        box1.setBackground(new java.awt.Color(0, 0, 0));
        box1.setFont(new java.awt.Font("Arial Black", 1, 120)); // NOI18N
        box1.setForeground(new java.awt.Color(255, 255, 255));
        box1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 51), 10, true));
        box1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box1ActionPerformed(evt);
            }
        });
        jPanel5.add(box1);

        box2.setBackground(new java.awt.Color(0, 0, 0));
        box2.setFont(new java.awt.Font("Arial Black", 1, 120)); // NOI18N
        box2.setForeground(new java.awt.Color(255, 255, 255));
        box2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 51), 10, true));
        box2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box2ActionPerformed(evt);
            }
        });
        jPanel5.add(box2);

        box3.setBackground(new java.awt.Color(0, 0, 0));
        box3.setFont(new java.awt.Font("Arial Black", 1, 120)); // NOI18N
        box3.setForeground(new java.awt.Color(255, 255, 255));
        box3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 51), 10, true));
        box3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box3ActionPerformed(evt);
            }
        });
        jPanel5.add(box3);

        box4.setBackground(new java.awt.Color(0, 0, 0));
        box4.setFont(new java.awt.Font("Arial Black", 1, 120)); // NOI18N
        box4.setForeground(new java.awt.Color(255, 255, 255));
        box4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 51), 10, true));
        box4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box4ActionPerformed(evt);
            }
        });
        jPanel5.add(box4);

        box5.setBackground(new java.awt.Color(0, 0, 0));
        box5.setFont(new java.awt.Font("Arial Black", 1, 120)); // NOI18N
        box5.setForeground(new java.awt.Color(255, 255, 255));
        box5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 51), 10, true));
        box5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box5ActionPerformed(evt);
            }
        });
        jPanel5.add(box5);

        box6.setBackground(new java.awt.Color(0, 0, 0));
        box6.setFont(new java.awt.Font("Arial Black", 1, 120)); // NOI18N
        box6.setForeground(new java.awt.Color(255, 255, 255));
        box6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 51), 10, true));
        box6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box6ActionPerformed(evt);
            }
        });
        jPanel5.add(box6);

        box7.setBackground(new java.awt.Color(0, 0, 0));
        box7.setFont(new java.awt.Font("Arial Black", 1, 120)); // NOI18N
        box7.setForeground(new java.awt.Color(255, 255, 255));
        box7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 51), 10, true));
        box7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box7ActionPerformed(evt);
            }
        });
        jPanel5.add(box7);

        box8.setBackground(new java.awt.Color(0, 0, 0));
        box8.setFont(new java.awt.Font("Arial Black", 1, 120)); // NOI18N
        box8.setForeground(new java.awt.Color(255, 255, 255));
        box8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 51), 10, true));
        box8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box8ActionPerformed(evt);
            }
        });
        jPanel5.add(box8);

        box9.setBackground(new java.awt.Color(0, 0, 0));
        box9.setFont(new java.awt.Font("Arial Black", 1, 120)); // NOI18N
        box9.setForeground(new java.awt.Color(255, 255, 255));
        box9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 255, 51), 10, true));
        box9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                box9ActionPerformed(evt);
            }
        });
        jPanel5.add(box9);

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitButtonActionPerformed

    private void box2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box2ActionPerformed
        if(box2.getText() == "")
        {
            box2.setText(game);
            changeSign();
        }
        win();
    }//GEN-LAST:event_box2ActionPerformed

    private void box3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box3ActionPerformed
        if(box3.getText() == "")
        {
            box3.setText(game);
            changeSign();
        }
        win();
    }//GEN-LAST:event_box3ActionPerformed

    private void box4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box4ActionPerformed
        
        if(box4.getText() == "")
        {
            box4.setText(game);
            changeSign();
        }
        win();
    }//GEN-LAST:event_box4ActionPerformed

    private void box5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box5ActionPerformed
        if(box5.getText() == "")
        {
            box5.setText(game);
            changeSign();
        }
        win();
    }//GEN-LAST:event_box5ActionPerformed

    private void box6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box6ActionPerformed
        if(box6.getText() == "")
        {
            box6.setText(game);
            changeSign();
        }
        win();
    }//GEN-LAST:event_box6ActionPerformed

    private void box7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box7ActionPerformed
        if(box7.getText() == "")
        {
            box7.setText(game);
            changeSign();
        }
        win();
    }//GEN-LAST:event_box7ActionPerformed

    private void box8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box8ActionPerformed
        if(box8.getText() == "")
        {
            box8.setText(game);
            changeSign();
        }
        win();
    }//GEN-LAST:event_box8ActionPerformed

    private void box9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box9ActionPerformed
        if(box9.getText() == "")
        {
            box9.setText(game);
            changeSign();
        }
        win();
    }//GEN-LAST:event_box9ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to restart?", "Confirm", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION)
        {
            x = 0;
            o = 0;
            restart();
            label.setText("0");
            labelX.setText("0");
        }
    }//GEN-LAST:event_resetButtonActionPerformed

    private void box1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_box1ActionPerformed
        if(box1.getText() == "")
        {
            box1.setText(game);
            changeSign();
        }
        win();
    }//GEN-LAST:event_box1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton box1;
    private javax.swing.JButton box2;
    private javax.swing.JButton box3;
    private javax.swing.JButton box4;
    private javax.swing.JButton box5;
    private javax.swing.JButton box6;
    private javax.swing.JButton box7;
    private javax.swing.JButton box8;
    private javax.swing.JButton box9;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label;
    private javax.swing.JLabel labelX;
    private javax.swing.JButton resetButton;
    // End of variables declaration//GEN-END:variables
}
