
import java.awt.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Vibha V Joshi
 */
public class TICTACTOE extends javax.swing.JFrame {

    /**
     * Creates new form TICTACTOE
     */
    public TICTACTOE() {
        initComponents();
    }
    private String startGame="X";
    private int XCount=0;
    private int OCount=0;
    private void gameScore()
    {
        jLabel4.setText(String.valueOf(XCount));
        jLabel5.setText(String.valueOf(OCount));
    }
    private void choosePlayer()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame="O";
        }
        else
        {
            startGame="X";
        }
    }
    private void winningGame()
    {
        String b1=Button1.getText();
        String b2=Button2.getText();
        String b3=Button3.getText();
        String b4=Button4.getText();
        String b5=Button5.getText();
        String b6=Button6.getText();
        String b7=Button7.getText();
        String b8=Button8.getText();
        String b9=Button9.getText();
        
        if(b1=="X"&&b2=="X"&&b3=="X")
        {
            /*JOptionPane.showConfirmDialog(this,"Player X Win the Game");*/
            
            jLabel7.setText("Player X Won The Game");
            
            Button1.setBackground(Color.red);
            Button2.setBackground(Color.red);
            Button3.setBackground(Color.red);
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
            Button7.setEnabled(false);
            Button8.setEnabled(false);
            Button9.setEnabled(false);
            XCount++;
            gameScore();
        }
        if(b4=="X"&&b5=="X"&&b6=="X")
        {
            //JOptionPane.showConfirmDialog(this,"Player X Win the Game");
            jLabel7.setText("Player X Won The Game");
            
            Button4.setBackground(Color.red);
            Button5.setBackground(Color.red);
            Button6.setBackground(Color.red);
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
            Button7.setEnabled(false);
            Button8.setEnabled(false);
            Button9.setEnabled(false);
            XCount++;
            gameScore();
        }
        if(b7=="X"&&b8=="X"&&b9=="X")
        {
            //JOptionPane.showConfirmDialog(this,"Player X Win the Game");
            jLabel7.setText("Player X Won The Game");
            
            Button7.setBackground(Color.red);
            Button8.setBackground(Color.red);
            Button9.setBackground(Color.red);
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
            XCount++;
            gameScore();
        }
        if(b1=="X"&&b4=="X"&&b7=="X")
        {
            //JOptionPane.showConfirmDialog(this,"Player X Win the Game");
            jLabel7.setText("Player X Won The Game");
            
            Button1.setBackground(Color.red);
            Button4.setBackground(Color.red);
            Button7.setBackground(Color.red);
            Button2.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
            Button3.setEnabled(false);
            Button8.setEnabled(false);
            Button9.setEnabled(false);
            XCount++;
            gameScore();
        }
        if(b2=="X"&&b5=="X"&&b8=="X")
        {
            //JOptionPane.showConfirmDialog(this,"Player X Win the Game");
            jLabel7.setText("Player X Won The Game");
            
            Button2.setBackground(Color.red);
            Button5.setBackground(Color.red);
            Button8.setBackground(Color.red);
            Button1.setEnabled(false);
            Button3.setEnabled(false);
            Button6.setEnabled(false);
            Button7.setEnabled(false);
            Button4.setEnabled(false);
            Button9.setEnabled(false);
            XCount++;
            gameScore();
        }
        if(b3=="X"&&b6=="X"&&b9=="X")
        {
            //JOptionPane.showConfirmDialog(this,"Player X Win the Game");
            jLabel7.setText("Player X Won The Game");
            Button3.setBackground(Color.red);
            Button6.setBackground(Color.red);
            Button9.setBackground(Color.red);
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button2.setEnabled(false);
            Button7.setEnabled(false);
            Button8.setEnabled(false);
            Button1.setEnabled(false);
            XCount++;
            gameScore();
        }
        if(b1=="X"&&b5=="X"&&b9=="X")
        {
            //JOptionPane.showConfirmDialog(this,"Player X Win the Game");
            jLabel7.setText("Player X Won The Game");
            
            Button1.setBackground(Color.red);
            Button5.setBackground(Color.red);
            Button9.setBackground(Color.red);
            Button4.setEnabled(false);
            Button2.setEnabled(false);
            Button6.setEnabled(false);
            Button7.setEnabled(false);
            Button8.setEnabled(false);
            Button3.setEnabled(false);
            XCount++;
            gameScore();
        }
        if(b3=="X"&&b5=="X"&&b7=="X")
        {
            //JOptionPane.showConfirmDialog(this,"Player X Win the Game");
            jLabel7.setText("Player X Won The Game");
            Button3.setBackground(Color.red);
            Button5.setBackground(Color.red);
            Button7.setBackground(Color.red);
            Button4.setEnabled(false);
            Button2.setEnabled(false);
            Button6.setEnabled(false);
            Button1.setEnabled(false);
            Button8.setEnabled(false);
            Button9.setEnabled(false);
            XCount++;
            gameScore();
        }
        // O winning condition
        if(b1=="O"&&b2=="O"&&b3=="O")
        {
            //JOptionPane.showConfirmDialog(this,"Player O Win the Game");
            jLabel7.setText("Player Y Won The Game");
            
            Button1.setBackground(Color.red);
            Button2.setBackground(Color.red);
            Button3.setBackground(Color.red);
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
            Button7.setEnabled(false);
            Button8.setEnabled(false);
            Button9.setEnabled(false);
            OCount++;
            gameScore();
            
        }
        if(b4=="O"&&b5=="O"&&b6=="O")
        {
            //JOptionPane.showConfirmDialog(this,"Player O Win the Game");
            jLabel7.setText("Player Y Won The Game");
            
            Button4.setBackground(Color.red);
            Button5.setBackground(Color.red);
            Button6.setBackground(Color.red);
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
            Button7.setEnabled(false);
            Button8.setEnabled(false);
            Button9.setEnabled(false);
            OCount++;
            gameScore();
            
        }
        if(b7=="O"&&b8=="O"&&b9=="O")
        {
            //JOptionPane.showConfirmDialog(this,"Player O Win the Game");
            jLabel7.setText("Player Y won The Game");
            
            Button7.setBackground(Color.red);
            Button8.setBackground(Color.red);
            Button9.setBackground(Color.red);
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
            Button1.setEnabled(false);
            Button2.setEnabled(false);
            Button3.setEnabled(false);
            OCount++;
            gameScore();
            
        }
        if(b1=="O"&&b4=="O"&&b7=="O")
        {
            //JOptionPane.showConfirmDialog(this,"Player O Win the Game");
            jLabel7.setText("Player Y won The Game");
            
            Button1.setBackground(Color.red);
            Button4.setBackground(Color.red);
            Button7.setBackground(Color.red);
            Button2.setEnabled(false);
            Button5.setEnabled(false);
            Button6.setEnabled(false);
            Button3.setEnabled(false);
            Button8.setEnabled(false);
            Button9.setEnabled(false);
            OCount++;
            gameScore();
            
        }
        if(b2=="O"&&b5=="O"&&b8=="O")
        {
            //JOptionPane.showConfirmDialog(this,"Player O Win the Game");
            jLabel7.setText("Player Y Won The Game");
            
            Button2.setBackground(Color.red);
            Button5.setBackground(Color.red);
            Button8.setBackground(Color.red);
            Button4.setEnabled(false);
            Button1.setEnabled(false);
            Button6.setEnabled(false);
            Button7.setEnabled(false);
            Button3.setEnabled(false);
            Button9.setEnabled(false);
            OCount++;
            gameScore();
            
        }
        if(b3=="O"&&b6=="O"&&b9=="O")
        {
            //JOptionPane.showConfirmDialog(this,"Player O Win the Game");
            jLabel7.setText("Player Y Won The Game");
            
            Button3.setBackground(Color.red);
            Button6.setBackground(Color.red);
            Button9.setBackground(Color.red);
            Button4.setEnabled(false);
            Button5.setEnabled(false);
            Button2.setEnabled(false);
            Button7.setEnabled(false);
            Button8.setEnabled(false);
            Button1.setEnabled(false);
            OCount++;
            gameScore();
            
        }
        if(b1=="O"&&b5=="O"&&b9=="O")
        {
            //JOptionPane.showConfirmDialog(this,"Player O Win the Game");
            jLabel7.setText("Player Y Won The Game");
            
            Button1.setBackground(Color.red);
            Button5.setBackground(Color.red);
            Button9.setBackground(Color.red);
            Button4.setEnabled(false);
            Button2.setEnabled(false);
            Button6.setEnabled(false);
            Button7.setEnabled(false);
            Button8.setEnabled(false);
            Button3.setEnabled(false);
            OCount++;
            gameScore();
            
        }
        if(b3=="O"&&b5=="O"&&b7=="O")
        {
            //JOptionPane.showConfirmDialog(this,"Player O Win the Game");
            jLabel7.setText("Player Y Won The Game");
            
            Button3.setBackground(Color.red);
            Button5.setBackground(Color.red);
            Button7.setBackground(Color.red);
            Button4.setEnabled(false);
            Button2.setEnabled(false);
            Button6.setEnabled(false);
            Button1.setEnabled(false);
            Button8.setEnabled(false);
            Button9.setEnabled(false);
            OCount++;
            gameScore();
            
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button1 = new javax.swing.JButton();
        Button2 = new javax.swing.JButton();
        Button3 = new javax.swing.JButton();
        Button4 = new javax.swing.JButton();
        Button5 = new javax.swing.JButton();
        Button6 = new javax.swing.JButton();
        Button7 = new javax.swing.JButton();
        Button8 = new javax.swing.JButton();
        Button9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("TIC TAC TOE GAME");

        Button1.setBackground(new java.awt.Color(255, 255, 0));
        Button1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button1.setForeground(new java.awt.Color(51, 0, 153));
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setBackground(new java.awt.Color(255, 255, 0));
        Button2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button2.setForeground(new java.awt.Color(51, 0, 153));
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        Button3.setBackground(new java.awt.Color(255, 255, 0));
        Button3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button3.setForeground(new java.awt.Color(51, 0, 153));
        Button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button3ActionPerformed(evt);
            }
        });

        Button4.setBackground(new java.awt.Color(255, 255, 0));
        Button4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button4.setForeground(new java.awt.Color(51, 0, 153));
        Button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button4ActionPerformed(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(255, 255, 0));
        Button5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button5.setForeground(new java.awt.Color(51, 0, 153));
        Button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button5ActionPerformed(evt);
            }
        });

        Button6.setBackground(new java.awt.Color(255, 255, 0));
        Button6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button6.setForeground(new java.awt.Color(51, 0, 153));
        Button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button6ActionPerformed(evt);
            }
        });

        Button7.setBackground(new java.awt.Color(255, 255, 0));
        Button7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button7.setForeground(new java.awt.Color(51, 0, 153));
        Button7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button7ActionPerformed(evt);
            }
        });

        Button8.setBackground(new java.awt.Color(255, 255, 0));
        Button8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button8.setForeground(new java.awt.Color(51, 0, 153));
        Button8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button8ActionPerformed(evt);
            }
        });

        Button9.setBackground(new java.awt.Color(255, 255, 0));
        Button9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        Button9.setForeground(new java.awt.Color(51, 0, 153));
        Button9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button9ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("PLAYER X :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("PLAYER Y :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("0");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("0");

        jButton10.setBackground(new java.awt.Color(255, 204, 204));
        jButton10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton10.setText("NEW GAME");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(255, 204, 204));
        jButton11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton11.setText("RESET");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(255, 204, 204));
        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setText("EXIT");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(Button4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(Button1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(Button8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Button3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Button6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton12))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton10)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Button4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Button6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Button7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Button9, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
                    .addComponent(jButton11)
                    .addComponent(jButton12))
                .addGap(18, 18, 18)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        jLabel7.setText(null);
        System.exit(0);
    }                                         

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        Button1.setEnabled(true);
        Button2.setEnabled(true);
        Button3.setEnabled(true);
        Button4.setEnabled(true);
        Button5.setEnabled(true);
        Button6.setEnabled(true);
        Button7.setEnabled(true);
        Button8.setEnabled(true);
        Button9.setEnabled(true);
        Button1.setText(null);
        Button2.setText(null);
        Button3.setText(null);
        Button4.setText(null);
        Button5.setText(null);
        Button6.setText(null);
        Button7.setText(null);
        Button8.setText(null);
        Button9.setText(null);
        Button1.setBackground(Color.yellow);
        Button2.setBackground(Color.yellow);
        Button3.setBackground(Color.yellow);
        Button4.setBackground(Color.yellow);
        Button5.setBackground(Color.yellow);
        Button6.setBackground(Color.yellow);
        Button7.setBackground(Color.yellow);
        Button8.setBackground(Color.yellow);
        Button9.setBackground(Color.yellow);
        
        jLabel7.setText(null);
        
    }                                         

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        Button1.setEnabled(true);
        Button2.setEnabled(true);
        Button3.setEnabled(true);
        Button4.setEnabled(true);
        Button5.setEnabled(true);
        Button6.setEnabled(true);
        Button7.setEnabled(true);
        Button8.setEnabled(true);
        Button9.setEnabled(true);
        Button1.setText(null);
        Button2.setText(null);
        Button3.setText(null);
        Button4.setText(null);
        Button5.setText(null);
        Button6.setText(null);
        Button7.setText(null);
        Button8.setText(null);
        Button9.setText(null);
        jLabel4.setText("0");
        jLabel5.setText("0");
        XCount=0;
        OCount=0;
        Button1.setBackground(Color.yellow);
        Button2.setBackground(Color.yellow);
        Button3.setBackground(Color.yellow);
        Button4.setBackground(Color.yellow);
        Button5.setBackground(Color.yellow);
        Button6.setBackground(Color.yellow);
        Button7.setBackground(Color.yellow);
        Button8.setBackground(Color.yellow);
        Button9.setBackground(Color.yellow);
        
        jLabel7.setText(null);
    }                                         

    private void Button9ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Button9.setText(startGame);
        choosePlayer();
        winningGame();
    }                                       

    private void Button8ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Button8.setText(startGame);
        choosePlayer();
        winningGame();

    }                                       

    private void Button7ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Button7.setText(startGame);
        choosePlayer();
        winningGame();
    }                                       

    private void Button6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Button6.setText(startGame);
        choosePlayer();
        winningGame();

    }                                       

    private void Button5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Button5.setText(startGame);
        choosePlayer();
        winningGame();
    }                                       

    private void Button4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Button4.setText(startGame);
        choosePlayer();
        winningGame();
    }                                       

    private void Button3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Button3.setText(startGame);
        choosePlayer();
        winningGame();
    }                                       

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Button2.setText(startGame);
        choosePlayer();
        winningGame();
    }                                       

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        Button1.setText(startGame);
        choosePlayer();
        winningGame();

    }                                       

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
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TICTACTOE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TICTACTOE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Button1;
    private javax.swing.JButton Button2;
    private javax.swing.JButton Button3;
    private javax.swing.JButton Button4;
    private javax.swing.JButton Button5;
    private javax.swing.JButton Button6;
    private javax.swing.JButton Button7;
    private javax.swing.JButton Button8;
    private javax.swing.JButton Button9;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}
