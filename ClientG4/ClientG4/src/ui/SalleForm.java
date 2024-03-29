/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dao.IDao;
import entities.Machine;

import entities.Salle;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import util.Utils;

/**
 *
 * @author Snof_Bo
 */
public class SalleForm extends javax.swing.JInternalFrame {

    /**
     * Creates new form SalleForm
     */
    DefaultTableModel model = null;
    IDao<Salle> dao = null;
     DefaultTableModel model2 = null;
    public javax.swing.JDesktopPane desktopPane;
    public SalleForm() {
        initComponents();
        model = (DefaultTableModel) SalleTable.getModel();
        model2 = (DefaultTableModel) SalleTable1.getModel();

        
        try {
            dao = (IDao<Salle>) Naming.lookup(Utils.getUrl()+"/ISalle");
        } catch (NotBoundException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        load();
        //openOtherForm();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        AddSalle = new javax.swing.JButton();
        UpdateSalle = new javax.swing.JButton();
        DeleteSalle = new javax.swing.JButton();
        listSalle = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalleTable = new javax.swing.JTable();
        listSalle1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        SalleTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Salle Information"));

        jLabel1.setText("Code");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Actions"));

        AddSalle.setText("Ajouter");
        AddSalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSalleActionPerformed(evt);
            }
        });

        UpdateSalle.setText("Modifier");
        UpdateSalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSalleActionPerformed(evt);
            }
        });

        DeleteSalle.setText("Supprimer");
        DeleteSalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteSalleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AddSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdateSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DeleteSalle, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddSalle)
                    .addComponent(UpdateSalle)
                    .addComponent(DeleteSalle))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        listSalle.setBackground(new java.awt.Color(255, 255, 255));
        listSalle.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des salles"));

        SalleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Code"
            }
        ));
        SalleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalleTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalleTableMousePressed(evt);
            }
        });
        SalleTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SalleTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(SalleTable);

        javax.swing.GroupLayout listSalleLayout = new javax.swing.GroupLayout(listSalle);
        listSalle.setLayout(listSalleLayout);
        listSalleLayout.setHorizontalGroup(
            listSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        listSalleLayout.setVerticalGroup(
            listSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listSalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        listSalle1.setBackground(new java.awt.Color(255, 255, 255));
        listSalle1.setBorder(javax.swing.BorderFactory.createTitledBorder("Liste des MachineSalle"));

        SalleTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Reference", "Marque", "Prix"
            }
        ));
        SalleTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalleTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SalleTable1MousePressed(evt);
            }
        });
        SalleTable1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SalleTable1KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(SalleTable1);

        jButton1.setText("Seach Machine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout listSalle1Layout = new javax.swing.GroupLayout(listSalle1);
        listSalle1.setLayout(listSalle1Layout);
        listSalle1Layout.setHorizontalGroup(
            listSalle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(listSalle1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        listSalle1Layout.setVerticalGroup(
            listSalle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listSalle1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(listSalle1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(listSalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listSalle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listSalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listSalle1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddSalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSalleActionPerformed
        try {
            // TODO add your handling code here:
            String code = txtCode.getText().toString();
            dao.create(new Salle(code));
            load();
            this.Clear();
        } catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_AddSalleActionPerformed
   public void load(){
        try {
            model.setRowCount(0);
          
            for(Salle salle : dao.findAll())
                model.addRow(new Object[]{
                    salle.getId(),
                    salle.getCode()
                });
        } catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        LoadComboBox();
    }
    
     public void LoadComboBox(){
        try{
            for(Salle salle : dao.findAll()){
                this.jComboBox1.addItem(salle.getId());
            }
        }catch (RemoteException ex){
            Logger.getLogger(MachineForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    private void UpdateSalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSalleActionPerformed
        // TODO add your handling code here:
        if(txtCode.getText()!=""){
            try {
                int selectedRow = SalleTable.getSelectedRow();
                if (selectedRow != -1) {
                    String code = txtCode.getText();
                    int id = Integer.parseInt(SalleTable.getModel().getValueAt(selectedRow, 0).toString());
                    Salle salle=new Salle(code);
                    salle.setId(id);
                    dao.update(salle);
                    load();
                    Clear();
                }
            } catch (RemoteException ex) {
                Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            System.err.println("Data is null");
        }

    }//GEN-LAST:event_UpdateSalleActionPerformed
    public void Clear(){
        this.txtCode.setText("");
    }
    private void DeleteSalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteSalleActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRow = SalleTable.getSelectedRow();
            if (selectedRow != -1) {
                int id = Integer.parseInt(SalleTable.getModel().getValueAt(selectedRow, 0).toString());
                Salle salle=new Salle();
                salle.setId(id);
                dao.delete(salle);
                load();
            }
        } catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DeleteSalleActionPerformed

    private void SalleTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalleTableMousePressed
        // TODO add your handling code here:
        int selectedRow = SalleTable.getSelectedRow();
        if (selectedRow != -1) {
            Object code = SalleTable.getModel().getValueAt(selectedRow, 1);
            txtCode.setText(code.toString());
        }
    }//GEN-LAST:event_SalleTableMousePressed

    private void SalleTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalleTableKeyPressed
        // TODO add your handling code here:
        System.out.println("1");
        int selectedRow = SalleTable.getSelectedRow();
        if (evt.getKeyCode() == evt.VK_ENTER) {
            System.out.println("2");
            try {
                if (selectedRow != -1) {
                    System.out.println("3");
                    int id = Integer.parseInt(SalleTable.getModel().getValueAt(selectedRow, 0).toString());
                    Salle salle = new Salle(SalleTable.getModel().getValueAt(selectedRow, 1).toString());
                    salle.setId(id);
                    System.out.println("4");
                    dao.update(salle);
                    load();
                }
            } catch (RemoteException ex) {
                Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.err.println("Data is null");
        }
        // Stop cell editing
        SalleTable.getCellEditor().stopCellEditing();
    }//GEN-LAST:event_SalleTableKeyPressed

    private void SalleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalleTableMouseClicked
      
    }//GEN-LAST:event_SalleTableMouseClicked

    private void SalleTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalleTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SalleTable1MouseClicked

    private void SalleTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalleTable1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalleTable1MousePressed

    private void SalleTable1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalleTable1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalleTable1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:*
        int SalleID = Integer.parseInt(this.jComboBox1.getSelectedItem().toString());
        try {
            Salle salle = dao.findById(SalleID);
            for(Machine m : salle.getMachines()){
                model2.addRow(new Object[]{
                    m.getId(),
                    m.getRef(),
                    m.getMarque(),
                    m.getPrix()
                });
            }
        } catch (RemoteException ex) {
            Logger.getLogger(SalleForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddSalle;
    private javax.swing.JButton DeleteSalle;
    private javax.swing.JTable SalleTable;
    private javax.swing.JTable SalleTable1;
    private javax.swing.JButton UpdateSalle;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel listSalle;
    private javax.swing.JPanel listSalle1;
    private javax.swing.JTextField txtCode;
    // End of variables declaration//GEN-END:variables
}
