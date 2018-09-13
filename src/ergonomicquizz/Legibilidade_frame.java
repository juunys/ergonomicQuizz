/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ergonomicquizz;

import static ergonomicquizz.Prestreza_frame.pnome;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author yamada
 */
public class Legibilidade_frame extends javax.swing.JFrame {

    static String pnome, unome, email;
    
    
    Date date = new Date();
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    String data = formatador.format(date);
    
    
    /**
     * Creates new form Legibilidade_frame
     * @param pnome
     * @param unome
     * @param email
     */
    public Legibilidade_frame(String pnome, String unome, String email) {
        this.pnome = pnome;
        this.unome = unome;
        this.email = email;
        initComponents();
    }
    
    public void close() {
        WindowEvent winclose = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winclose);
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
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextArea2 = new javax.swing.JTextArea();
        jTextArea4 = new javax.swing.JTextArea();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        jRadioButton41 = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        jRadioButton42 = new javax.swing.JRadioButton();
        jRadioButton43 = new javax.swing.JRadioButton();
        jRadioButton44 = new javax.swing.JRadioButton();
        jRadioButton45 = new javax.swing.JRadioButton();
        jRadioButton46 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("1. As áreas livres são usadas para separar grupos lógicos em vez de tê-los todos de um só lado da tela, caixa ou janela? ");

        jLabel2.setText("2. Os grupos de objetos de controle e de apresentação que compõe as caixas de diálogo e outros objetos compostos encontram-se alinhados vertical e horizontalmente?  ");

        jLabel3.setText("3. Os rótulos de campos organizados verticalmente e muito diferentes em tamanho estão justificados à direita?");

        jLabel4.setText("4. A largura mínima dos mostradores de texto é de 50 caracteres? ");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea2.setLineWrap(true);
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);

        jTextArea4.setLineWrap(true);
        jTextArea4.setWrapStyleWord(true);
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setText("Péssimo");

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setText("Ruim");

        buttonGroup1.add(jRadioButton8);
        jRadioButton8.setText("Razoável");

        buttonGroup1.add(jRadioButton9);
        jRadioButton9.setText("Bom");

        buttonGroup1.add(jRadioButton10);
        jRadioButton10.setText("Excelente");

        buttonGroup2.add(jRadioButton11);
        jRadioButton11.setText("Sim");

        buttonGroup2.add(jRadioButton12);
        jRadioButton12.setText("Não");
        jRadioButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton12ActionPerformed(evt);
            }
        });

        jLabel5.setText("5. A altura mínima dos mostradores é de 4 linhas");

        buttonGroup3.add(jRadioButton13);
        jRadioButton13.setText("Sim");

        buttonGroup3.add(jRadioButton14);
        jRadioButton14.setText("Não");
        jRadioButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton14ActionPerformed(evt);
            }
        });

        jLabel6.setText("6. Os parágrafos de texto são separados por, pelo menos, uma linha em branco?  ");

        buttonGroup4.add(jRadioButton15);
        jRadioButton15.setText("Péssimo");

        buttonGroup4.add(jRadioButton16);
        jRadioButton16.setText("Ruim");

        buttonGroup4.add(jRadioButton17);
        jRadioButton17.setText("Razoável");

        buttonGroup4.add(jRadioButton18);
        jRadioButton18.setText("Bom");

        buttonGroup4.add(jRadioButton19);
        jRadioButton19.setText("Excelente");

        jLabel7.setText("7. O uso exclusivo de maiúsculas nos textos é evitado?");

        jLabel8.setText("9. O uso do sublinhado é minimizado?");

        buttonGroup5.add(jRadioButton20);
        jRadioButton20.setText("Péssimo");

        buttonGroup5.add(jRadioButton21);
        jRadioButton21.setText("Ruim");

        buttonGroup5.add(jRadioButton22);
        jRadioButton22.setText("Razoável");

        buttonGroup5.add(jRadioButton23);
        jRadioButton23.setText("Bom");

        buttonGroup5.add(jRadioButton24);
        jRadioButton24.setText("Excelente");

        buttonGroup6.add(jRadioButton25);
        jRadioButton25.setText("Péssimo");

        buttonGroup6.add(jRadioButton26);
        jRadioButton26.setText("Ruim");

        buttonGroup6.add(jRadioButton27);
        jRadioButton27.setText("Razoável");

        buttonGroup6.add(jRadioButton28);
        jRadioButton28.setText("Bom");

        buttonGroup6.add(jRadioButton29);
        jRadioButton29.setText("Excelente");

        jLabel9.setText("8. O uso do negrito é minimizado?");

        buttonGroup7.add(jRadioButton30);
        jRadioButton30.setText("Péssimo");

        buttonGroup7.add(jRadioButton31);
        jRadioButton31.setText("Ruim");

        buttonGroup7.add(jRadioButton32);
        jRadioButton32.setText("Razoável");

        buttonGroup7.add(jRadioButton33);
        jRadioButton33.setText("Bom");

        buttonGroup7.add(jRadioButton34);
        jRadioButton34.setText("Excelente");

        jLabel10.setText("10. Nas tabelas, linhas em branco são empregadas para separar grupos? ");

        buttonGroup8.add(jRadioButton35);
        jRadioButton35.setText("Não");

        buttonGroup8.add(jRadioButton36);
        jRadioButton36.setText("Sim");

        jLabel11.setText("11. As listas de dados alfabéticos são justificadas à esquerda?");

        buttonGroup9.add(jRadioButton37);
        jRadioButton37.setText("Péssimo");

        buttonGroup9.add(jRadioButton38);
        jRadioButton38.setText("Ruim");

        buttonGroup9.add(jRadioButton39);
        jRadioButton39.setText("Razoável");

        buttonGroup9.add(jRadioButton40);
        jRadioButton40.setText("Bom");

        buttonGroup9.add(jRadioButton41);
        jRadioButton41.setText("Excelente");

        jLabel12.setText("12. As listas contendo números decimais apresentam alinhamento pela vírgula? ");

        buttonGroup10.add(jRadioButton42);
        jRadioButton42.setText("Péssimo");

        buttonGroup10.add(jRadioButton43);
        jRadioButton43.setText("Ruim");

        buttonGroup10.add(jRadioButton44);
        jRadioButton44.setText("Razoável");

        buttonGroup10.add(jRadioButton45);
        jRadioButton45.setText("Bom");

        buttonGroup10.add(jRadioButton46);
        jRadioButton46.setText("Excelente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton10))
                            .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton11)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton12))
                            .addComponent(jLabel5)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton13)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton14))
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton15)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton16)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton17)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton18)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton19))
                            .addComponent(jLabel7)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton20)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton21)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton22)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton23)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton24))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton25)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton26)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton27)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton28)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton29))
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton30)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton31)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton32)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton33)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton34))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton36)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton35))
                            .addComponent(jLabel11)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton37)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton38)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton39)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton40)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton41))
                            .addComponent(jLabel12)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButton42)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton43)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton44)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton45)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton46))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton6)
                    .addComponent(jRadioButton7)
                    .addComponent(jRadioButton8)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton10))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jTextArea4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton11)
                    .addComponent(jRadioButton12))
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton14))
                .addGap(28, 28, 28)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton15)
                    .addComponent(jRadioButton16)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton18)
                    .addComponent(jRadioButton19))
                .addGap(31, 31, 31)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton20)
                    .addComponent(jRadioButton21)
                    .addComponent(jRadioButton22)
                    .addComponent(jRadioButton23)
                    .addComponent(jRadioButton24))
                .addGap(27, 27, 27)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton25)
                    .addComponent(jRadioButton26)
                    .addComponent(jRadioButton27)
                    .addComponent(jRadioButton28)
                    .addComponent(jRadioButton29))
                .addGap(26, 26, 26)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton30)
                    .addComponent(jRadioButton31)
                    .addComponent(jRadioButton32)
                    .addComponent(jRadioButton33)
                    .addComponent(jRadioButton34))
                .addGap(18, 18, 18)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton36)
                    .addComponent(jRadioButton35))
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton37)
                    .addComponent(jRadioButton38)
                    .addComponent(jRadioButton39)
                    .addComponent(jRadioButton40)
                    .addComponent(jRadioButton41))
                .addGap(30, 30, 30)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton42)
                    .addComponent(jRadioButton43)
                    .addComponent(jRadioButton44)
                    .addComponent(jRadioButton45)
                    .addComponent(jRadioButton46))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton14ActionPerformed

    private void jRadioButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton12ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String resp1 = jTextArea2.getText();
        String resp2 = getSelectedButtonText(buttonGroup1);
        String resp3 = jTextArea4.getText();
        String resp4 = getSelectedButtonText(buttonGroup2);
        String resp5 = getSelectedButtonText(buttonGroup3);
        String resp6 = getSelectedButtonText(buttonGroup4);
        String resp7 = getSelectedButtonText(buttonGroup5);
        String resp8 = getSelectedButtonText(buttonGroup6);
        String resp9 = getSelectedButtonText(buttonGroup7);
        String resp10 = getSelectedButtonText(buttonGroup8);
        String resp11 = getSelectedButtonText(buttonGroup9);
        String resp12 = getSelectedButtonText(buttonGroup10);

        BufferedWriter buffWrite = null;

        try {
            buffWrite = new BufferedWriter(new FileWriter("/home/yamada/Área de Trabalho/legibilidade_"+pnome+unome+".txt"));
            buffWrite.append("Nome: "+ pnome + " " + unome +"\n");
            buffWrite.append("Email: "+ email + "\n");
            buffWrite.append("Data: "+ data + "\n\n");
            buffWrite.append(jLabel1.getText() + "\n");
            buffWrite.append("Resposta: "+ resp1 + "\n\n");
            buffWrite.append(jLabel2.getText() + "\n");
            buffWrite.append("Resposta: "+ resp2 + "\n\n");
            buffWrite.append(jLabel3.getText() + "\n");
            buffWrite.append("Resposta: "+ resp3 + "\n\n");
            buffWrite.append(jLabel4.getText() + "\n");
            buffWrite.append("Resposta: "+ resp4 + "\n");
            buffWrite.append(jLabel5.getText() + "\n");
            buffWrite.append("Resposta: "+ resp5 + "\n\n");
            buffWrite.append(jLabel7.getText() + "\n");
            buffWrite.append("Resposta: "+ resp6 + "\n\n");
            buffWrite.append(jLabel8.getText() + "\n");
            buffWrite.append("Resposta: "+ resp7 + "\n\n");
            buffWrite.append(jLabel9.getText() + "\n");
            buffWrite.append("Resposta: "+ resp8 + "\n\n");
            buffWrite.append(jLabel10.getText() + "\n");
            buffWrite.append("Resposta: "+ resp9 + "\n\n");
            buffWrite.append(jLabel11.getText() + "\n");
            buffWrite.append("Resposta: "+ resp10 + "\n\n");
            buffWrite.append(jLabel12.getText() + "\n");
            buffWrite.append("Resposta: "+ resp11 + "\n");
            buffWrite.close();

            String query = "insert into quizz.Legibilidade (nome, email, data, p1, p2, p3, p4, p5, p6, p7, p8, p9 ,p10, p11, p12)"+"values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizz", "root", "")) {
                PreparedStatement pst = con.prepareStatement(query);
                pst.setString(1, pnome+" "+unome);
                pst.setString(2, email);
                pst.setString(3, data);

                pst.setString(4, resp1);
                pst.setString(5, resp2);
                pst.setString(6, resp3);
                pst.setString(7, resp4);
                pst.setString(8, resp5);
                pst.setString(9, resp6);
                pst.setString(10, resp7);
                pst.setString(11, resp8);
                pst.setString(12, resp9);
                pst.setString(13, resp10);
                pst.setString(14, resp11);
                pst.setString(15, resp12);

                pst.executeUpdate();
                con.close();

            } catch (SQLException ex) {
                Logger.getLogger(Legibilidade_frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (IOException ex) {
            Logger.getLogger(Prestreza_frame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Legibilidade_frame.class.getName()).log(Level.SEVERE, null, ex);
        }

        JOptionPane.showMessageDialog(null, "Pronto!");

        close();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Legibilidade_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Legibilidade_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Legibilidade_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Legibilidade_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Legibilidade_frame(pnome, unome, email).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton41;
    private javax.swing.JRadioButton jRadioButton42;
    private javax.swing.JRadioButton jRadioButton43;
    private javax.swing.JRadioButton jRadioButton44;
    private javax.swing.JRadioButton jRadioButton45;
    private javax.swing.JRadioButton jRadioButton46;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea4;
    // End of variables declaration//GEN-END:variables

    public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
}
