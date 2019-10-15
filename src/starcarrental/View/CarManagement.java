/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package starcarrental.View;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import starcarrental.Controller.ControlCarManagement;
import starcarrental.Controller.LoginManagement;
import starcarrental.Model.*;

/**
 *
 * @author Alejandro
 */
public class CarManagement extends javax.swing.JFrame {
    
    private int storeID;
    /**
     * Creates new form CarManagement
     */
    public CarManagement() {
        initComponents();
        
        // Initializing jComboboxCategory
        List<String> categories = ControlCarManagement.getCategories();
        Iterator iterator = categories.iterator();
        while(iterator.hasNext()) 
        {
            jComboBoxCategory.addItem(iterator.next());
        }
        
        // Initializing jComboboxBrand
        List<String> brands = ControlCarManagement.getBrands();
        iterator = brands.iterator();
        while(iterator.hasNext()) 
        {
            jComboBoxBrand.addItem(iterator.next());
        }
        
        // Initializing jTable
        refreshTable(1,jComboBoxBrand.getSelectedItem().toString(),jComboBoxBrand.getSelectedItem().toString());
        
    }

    public int getStoreID() {
        return storeID;
    }

    public void setStoreID(int storeID) {
        this.storeID = storeID;
    }
    
    private void refreshTable(int storeID,String categoryFilter, String brandFilter)
    {
        
        Vector<String> tableHeaders = new Vector<String>();
        Vector tableData = new Vector();
        
        tableHeaders.add("id");
        tableHeaders.add("brand"); 
        tableHeaders.add("category");
        tableHeaders.add("modelYear");
        tableHeaders.add("color");
        tableHeaders.add("doorsNumber");
        tableHeaders.add("automaticTransmission");
        tableHeaders.add("seatingCapacity");
        tableHeaders.add("luggageCapacity");        
        tableHeaders.add("diesel");
        tableHeaders.add("kmPerLitre");
        /*tableHeaders.add("ageRestrictions");
        tableHeaders.add("generalRestriction");
        tableHeaders.add("insuranceRestriction");*/        
        tableHeaders.add("numberPlate");
        tableHeaders.add("available");
        tableHeaders.add("damaged");

        List<Car> cars = ControlCarManagement.getCarInformation(storeID,categoryFilter, brandFilter);
        for(Object o : cars) {
            Car car = (Car)o;
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(car.getId());
            oneRow.add(car.getBrand());            
            oneRow.add(car.getCarCategory().getName());
            oneRow.add(car.getModelYear());            
            oneRow.add(car.getColor());
            oneRow.add(car.getDoorsNumber());
            oneRow.add(car.isAutomaticTransmission());
            oneRow.add(car.getSeatingCapacity());
            oneRow.add(car.getLuggageCapacity());
            oneRow.add(car.isDiesel());
            oneRow.add(car.getKmPerLitre());            
            /*oneRow.add(car.getAgeRestrictions());
            oneRow.add(car.getGeneralRestriction());
            oneRow.add(car.getInsuranceRestriction());*/            
            oneRow.add(car.getNumberPlate());
            oneRow.add(car.isAvailable());
            oneRow.add(car.isDamaged());
            
            tableData.add(oneRow);
        }
        
        jTableCarManagement.setModel(new DefaultTableModel(tableData, tableHeaders));        
    
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCarManagement = new javax.swing.JTable();
        jButtonBook = new javax.swing.JButton();
        jComboBoxBrand = new javax.swing.JComboBox();
        jLabelBrand = new javax.swing.JLabel();
        jLabelCategory = new javax.swing.JLabel();
        jComboBoxCategory = new javax.swing.JComboBox();
        jButtonDeleteCar = new javax.swing.JButton();
        jButtonNewCar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jTableCarManagement.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableCarManagement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCarManagementMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableCarManagement);

        jButtonBook.setText("Book Car");
        jButtonBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBookActionPerformed(evt);
            }
        });

        jComboBoxBrand.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));
        jComboBoxBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBrandActionPerformed(evt);
            }
        });

        jLabelBrand.setText("Brand");

        jLabelCategory.setText("Category");

        jComboBoxCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All" }));
        jComboBoxCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCategoryActionPerformed(evt);
            }
        });

        jButtonDeleteCar.setLabel("Delete Car");
        jButtonDeleteCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteCarActionPerformed(evt);
            }
        });

        jButtonNewCar.setText("New base Car");
        jButtonNewCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewCarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jLabelBrand)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonNewCar)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeleteCar)
                .addGap(18, 18, 18)
                .addComponent(jButtonBook))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBrand)
                    .addComponent(jLabelCategory)
                    .addComponent(jComboBoxCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonBook)
                    .addComponent(jButtonDeleteCar)
                    .addComponent(jButtonNewCar)))
        );

        jLabel1.setText("Employee:");

        jLabel2.setText("Car Management Administration Panel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCategoryActionPerformed

    private void jTableCarManagementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCarManagementMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCarManagementMouseClicked

    private void jComboBoxBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBrandActionPerformed
        // TODO add your handling code here:
        refreshTable(1,jComboBoxBrand.getSelectedItem().toString(),jComboBoxBrand.getSelectedItem().toString());
    }//GEN-LAST:event_jComboBoxBrandActionPerformed
    
    // Method to uptade information    
    private void jButtonBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBookActionPerformed
        
        int row = jTableCarManagement.getSelectedRow();
        int column = jTableCarManagement.getSelectedColumn();

        String id_car = jTableCarManagement.getValueAt(row, 0).toString();


        ControlCarManagement.updateInformation(id_car);

        refreshTable(1,jComboBoxBrand.getSelectedItem().toString(),jComboBoxBrand.getSelectedItem().toString());
        
    }//GEN-LAST:event_jButtonBookActionPerformed

    private void jButtonNewCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewCarActionPerformed
        // TODO add your handling code here:
        ControlCarManagement.newCar(this.storeID);
        refreshTable(1,jComboBoxBrand.getSelectedItem().toString(),jComboBoxBrand.getSelectedItem().toString());
    }//GEN-LAST:event_jButtonNewCarActionPerformed

    private void jButtonDeleteCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteCarActionPerformed
        // TODO add your handling code here:
        
        int row = jTableCarManagement.getSelectedRow();
        int column = jTableCarManagement.getSelectedColumn();
        String id_car = jTableCarManagement.getValueAt(row, 0).toString();


        ControlCarManagement.deleteInformation(id_car);
        refreshTable(1,jComboBoxBrand.getSelectedItem().toString(),jComboBoxBrand.getSelectedItem().toString());
                
        
        
    }//GEN-LAST:event_jButtonDeleteCarActionPerformed

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
            java.util.logging.Logger.getLogger(CarManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBook;
    private javax.swing.JButton jButtonDeleteCar;
    private javax.swing.JButton jButtonNewCar;
    private javax.swing.JComboBox jComboBoxBrand;
    private javax.swing.JComboBox jComboBoxCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBrand;
    private javax.swing.JLabel jLabelCategory;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCarManagement;
    // End of variables declaration//GEN-END:variables
}
