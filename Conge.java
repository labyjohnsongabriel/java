/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.awt.Image;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Conge extends javax.swing.JFrame {

    
    public Conge() {
        initComponents();
        listage();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_Conge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_Emp1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Conge = new javax.swing.JTable();
        btn_Ajouter1 = new javax.swing.JButton();
        btn_Supprimer1 = new javax.swing.JButton();
        btn_Modifier1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_NbrJours = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btn_recuperer1 = new javax.swing.JButton();
        date_retours = new com.toedter.calendar.JDateChooser();
        date_fin = new com.toedter.calendar.JDateChooser();
        txt_motif = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(69, 14, 103));

        txt_Conge.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_Conge.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N° Congé");

        txt_Emp1.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_Emp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("N° Employe");

        jLabel4.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Motif");

        jLabel5.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText(" Nombre de jours");

        jLabel6.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Date Démande");

        jLabel7.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date Retour");

        table_Conge.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        table_Conge.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "N° Conge", "N° Employe", "Motif", "Nombre de Jours", "Date Démande", "Date Retour"
            }
        ));
        table_Conge.setEditingRow(25);
        table_Conge.setRowHeight(25);
        jScrollPane1.setViewportView(table_Conge);

        btn_Ajouter1.setBackground(new java.awt.Color(0, 153, 204));
        btn_Ajouter1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btn_Ajouter1.setText("Ajouter");
        btn_Ajouter1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Ajouter1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Ajouter1MouseClicked(evt);
            }
        });
        btn_Ajouter1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Ajouter1ActionPerformed(evt);
            }
        });

        btn_Supprimer1.setBackground(new java.awt.Color(255, 0, 0));
        btn_Supprimer1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btn_Supprimer1.setText("Supprimer");
        btn_Supprimer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Supprimer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Supprimer1MouseClicked(evt);
            }
        });
        btn_Supprimer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Supprimer1ActionPerformed(evt);
            }
        });

        btn_Modifier1.setBackground(new java.awt.Color(0, 204, 0));
        btn_Modifier1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btn_Modifier1.setText("Modifier");
        btn_Modifier1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Modifier1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Modifier1MouseClicked(evt);
            }
        });
        btn_Modifier1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Modifier1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(250, 241, 176));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("X");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 7, 255));
        jLabel1.setText("Gestion de pointage et Congé de personnel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 760, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        txt_NbrJours.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_NbrJours.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel10.setBackground(new java.awt.Color(255, 0, 51));
        jLabel10.setFont(new java.awt.Font("Impact", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Liste Des Congés");

        btn_recuperer1.setBackground(new java.awt.Color(204, 204, 255));
        btn_recuperer1.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        btn_recuperer1.setText("Récuperer");
        btn_recuperer1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_recuperer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_recuperer1MouseClicked(evt);
            }
        });
        btn_recuperer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recuperer1ActionPerformed(evt);
            }
        });

        date_retours.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        date_fin.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N

        txt_motif.setFont(new java.awt.Font("Cambria", 0, 14)); // NOI18N
        txt_motif.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vacance Annuel", "Maladie", "Congé Matérnité", "Congé Patérnité", "Congés parentaux", "Formation Professionnel", "Déménage", "Décés Familial", "Mariage", "Voyage", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel2)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txt_Conge, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Emp1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel4)
                                .addGap(150, 150, 150))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(txt_motif, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_NbrJours, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel6)
                        .addGap(154, 154, 154)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(btn_Ajouter1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(date_fin, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_Supprimer1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_Modifier1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_recuperer1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(date_retours, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_Conge)
                    .addComponent(txt_Emp1)
                    .addComponent(txt_NbrJours, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_motif))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(date_retours, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(date_fin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Ajouter1)
                    .addComponent(btn_Supprimer1)
                    .addComponent(btn_Modifier1)
                    .addComponent(btn_recuperer1))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(890, 651));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void listage(){
      try {
            table_Conge.setDefaultEditor(Object.class, null);
            Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_pointage", "root", "");
            String sql = "SELECT * FROM conge";
            PreparedStatement statement = connexion.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) table_Conge.getModel();
            model.setRowCount(0);
            while (result.next()) {
                Object[] row = {
                    result.getString("NumConge"),
                    result.getString("NumEmp"),
                    result.getString("Motif"),
                    result.getString("NbrJours"),
                    result.getDate("DateDemande"),
                    result.getDate("DateRetour")
                };
                model.addRow(row);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Erreur lors du chargement des données : " + ex.getMessage());
        }  
   
    }private void modifierConge(String Conge, String NumEmp, String Motif, int Nbrjours , java.sql.Date date , java.sql.Date dateretou) {
    try {
    Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_pointage", "root", "");
    
    
    java.util.Date dateDebut = date_fin.getDate();
    java.util.Date dateFin = date_retours.getDate();
    
    
    long differenceEnMillis = dateFin.getTime() - dateDebut.getTime();
    long differenceEnJours = differenceEnMillis / (1000 * 60 * 60 * 24);
    
    if (differenceEnJours <= 30) {
        String sql = "UPDATE conge SET NumConge = ?, NumEmp = ?, Motif = ?, NbrJours = ?, dateDemande = ?, dateRetour = ? WHERE NumConge = ?";
        PreparedStatement statement = connexion.prepareStatement(sql);
        statement.setString(1, Conge);
        statement.setString(2, NumEmp);
        statement.setString(3, Motif);
        statement.setInt(4, Nbrjours);
        statement.setDate(5, date);
        statement.setDate(6, dateretou);
        statement.setString(7, Conge); 

        int rowsUpdated = statement.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Congé modifié avec succès !");
            txt_Conge.setText("");
            txt_Emp1.setText("");
            txt_motif.setSelectedIndex(0);
            txt_NbrJours.setText("");
            date_fin.setDate(null); 
            date_retours.setDate(null);
            listage();
        } else {
            JOptionPane.showMessageDialog(this, "Aucune modification effectuée !");
        }
    } else {
        JOptionPane.showMessageDialog(this, "La période de congé ne peut pas dépasser 30 jours !");
    }

    connexion.close();
} catch (SQLException ex) {
    JOptionPane.showMessageDialog(this, "Erreur lors de la modification du Congé : " + ex.getMessage());
}

}


    private void btn_Ajouter1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Ajouter1MouseClicked
     if (txt_Conge.getText().isEmpty() || txt_Emp1.getText().isEmpty() ||txt_motif.getSelectedItem()== null || txt_NbrJours.getText().isEmpty()) {
    JOptionPane.showMessageDialog(this, "Vous devez remplir tous les champs !");
} else {
    try {
        
        int nombreJoursConge = Integer.parseInt(txt_NbrJours.getText());
        
        
        if (nombreJoursConge > 30) {
            JOptionPane.showMessageDialog(this, "Notification : Le nombre de congé des employés par an est de 30 jours. Le nombre de jours de congé pris dépasse cette limite.");
        } else {
         
            Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_pointage", "root", "");
            
           
            java.util.Date dateDebut = date_fin.getDate();
            java.util.Date dateFin = date_retours.getDate();
            
            
            long differenceEnMillis = dateFin.getTime() - dateDebut.getTime();
            long differenceEnJours = differenceEnMillis / (1000 * 60 * 60 * 24);
            
           
            if (differenceEnJours <= 30) {
                String sql = "INSERT INTO conge (NumConge, NumEmp, Motif, NbrJours, DateDemande, DateRetour) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement statement = connexion.prepareStatement(sql);
                statement.setString(1, txt_Conge.getText());
                statement.setString(2, txt_Emp1.getText());
                statement.setString(3, (String) txt_motif.getSelectedItem());
                statement.setString(4, txt_NbrJours.getText());
            
                java.sql.Timestamp dateFinTimestamp = new java.sql.Timestamp(date_fin.getDate().getTime());
                statement.setTimestamp(5, dateFinTimestamp);

                java.sql.Timestamp dateRetourTimestamp = new java.sql.Timestamp(date_retours.getDate().getTime());
                statement.setTimestamp(6, dateRetourTimestamp);

                int row = statement.executeUpdate();

                if (row > 0) {
                    JOptionPane.showMessageDialog(this, "Congé ajouté avec succès !");
                    txt_Conge.setText("");
                    txt_Emp1.setText("");
                    txt_motif.setSelectedIndex(0);
                    txt_NbrJours.setText("");
                    date_fin.setDate(null); 
                    date_retours.setDate(null); 
                    listage();
                } else {
                    JOptionPane.showMessageDialog(this, "Échec de l'ajout du congé !");
                }
            } else {
                JOptionPane.showMessageDialog(this, "La période de congé ne peut pas dépasser 30 jours !");
            }
            connexion.close();
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Le nombre de jours de congé doit être un nombre valide !");
    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Une erreur s'est produite lors de l'ajout du congé : " + ex.getMessage());
    }
}



  
    }//GEN-LAST:event_btn_Ajouter1MouseClicked

    private void btn_Ajouter1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Ajouter1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Ajouter1ActionPerformed

    private void btn_Supprimer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Supprimer1MouseClicked
        int selectedRow = table_Conge.getSelectedRow();
        if (selectedRow != -1) {
            String numConge = (String) table_Conge.getValueAt(selectedRow, 0);
            try {
                Connection connexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_pointage", "root", "");
                String sql = "DELETE FROM conge WHERE NumConge = ?";
                PreparedStatement statement = connexion.prepareStatement(sql);
                statement.setString(1,numConge);
                int rowsDeleted = statement.executeUpdate();
                if (rowsDeleted > 0) {
                    JOptionPane.showMessageDialog(this, "Congé supprimé avec succès !");
                 
                    listage();
                }
                connexion.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erreur lors de la suppression de l'employé : " + ex.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Veuillez sélectionner un employé à supprimer.");
        }
    }//GEN-LAST:event_btn_Supprimer1MouseClicked

    private void btn_Supprimer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Supprimer1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Supprimer1ActionPerformed

    private void btn_Modifier1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Modifier1MouseClicked
                 int Nbrjours = 0;
            try {
                Nbrjours = Integer.parseInt(txt_NbrJours.getText());
            } catch (NumberFormatException ex) {
                System.out.println("Erreur de conversion : " + ex.getMessage());
            }

            String Conge = txt_Conge.getText();
            String NumEmp = txt_Emp1.getText();
            String Motif = (String) txt_motif.getSelectedItem(); 
            String nbrJours = txt_NbrJours.getText();

            java.sql.Date date = null;
            java.sql.Date dateRetour = null;
            try {
                date = new java.sql.Date(date_fin.getDate().getTime());
                dateRetour = new java.sql.Date(date_retours.getDate().getTime());
            } catch (NullPointerException ex) {
                System.out.println("Erreur lors de la récupération de la date : " + ex.getMessage());
            }

            modifierConge(Conge, NumEmp, Motif, Nbrjours, date, dateRetour);




    }//GEN-LAST:event_btn_Modifier1MouseClicked

    private void btn_Modifier1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Modifier1ActionPerformed
          // TODO add your handling code here:
    }//GEN-LAST:event_btn_Modifier1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void btn_recuperer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_recuperer1MouseClicked
          // TODO add your handling code here:
    }//GEN-LAST:event_btn_recuperer1MouseClicked

    private void btn_recuperer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recuperer1ActionPerformed
     int selectedRow = table_Conge.getSelectedRow();
if (selectedRow != -1) {
    String numConge = (String) table_Conge.getValueAt(selectedRow, 0);
    String numEmp = (String) table_Conge.getValueAt(selectedRow, 1);
    String motif = (String) table_Conge.getValueAt(selectedRow, 2);
    int nbrJours = 0;
    try {
        nbrJours = Integer.parseInt(table_Conge.getValueAt(selectedRow, 3).toString());
    } catch (NumberFormatException ex) {
        
    }
    Date dateDebut = (Date) table_Conge.getValueAt(selectedRow, 4);
    Date dateRetour = (Date) table_Conge.getValueAt(selectedRow, 5);

 
    txt_Conge.setText(numConge);
    txt_Emp1.setText(numEmp);
    txt_motif.setSelectedIndex(0);
    txt_NbrJours.setText(String.valueOf(nbrJours));
    date_fin.setDate(dateDebut);
    date_retours.setDate(dateRetour);
} else {
    JOptionPane.showMessageDialog(this, "Veuillez sélectionner un Congé à modifier.");
    return;
}

                    // TODO add your handling code here:
    }//GEN-LAST:event_btn_recuperer1ActionPerformed

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
            java.util.logging.Logger.getLogger(Conge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conge.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conge().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Ajouter1;
    private javax.swing.JButton btn_Modifier1;
    private javax.swing.JButton btn_Supprimer1;
    private javax.swing.JButton btn_recuperer1;
    private com.toedter.calendar.JDateChooser date_fin;
    private com.toedter.calendar.JDateChooser date_retours;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_Conge;
    private javax.swing.JTextField txt_Conge;
    private javax.swing.JTextField txt_Emp1;
    private javax.swing.JTextField txt_NbrJours;
    private javax.swing.JComboBox<String> txt_motif;
    // End of variables declaration//GEN-END:variables

    private void modifierConge(String Conge, String NumEmp, String Motif, int Nbrjours, String dateDem, String dateretou) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
