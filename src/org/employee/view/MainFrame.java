package org.employee.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.employee.db.DBConnection;
/**
 *
 * @author loti ibrahimi
 * Student Number: 20015453
 * Course: Internet of Things (Year 4)
 */
public class MainFrame extends javax.swing.JFrame {
    private Connection conn;
    private int employeeID;
    public MainFrame() {
        initComponents();
        DBConnection dbc = DBConnection.getDBConnection();
        conn = dbc.getConnection();
        setEmployeeTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputPanel = new javax.swing.JPanel();
        ssnLabel = new javax.swing.JLabel();
        ssnInput = new javax.swing.JTextField();
        dobLabel = new javax.swing.JLabel();
        dobInput = new javax.swing.JTextField();
        firstNameLabel = new javax.swing.JLabel();
        firstNameInput = new javax.swing.JTextField();
        lastNameLabel = new javax.swing.JLabel();
        lastNameInput = new javax.swing.JTextField();
        salaryLabel = new javax.swing.JLabel();
        salaryInput = new javax.swing.JTextField();
        genderLabel = new javax.swing.JLabel();
        genderInput = new javax.swing.JTextField();
        btnPanel = new javax.swing.JPanel();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        tablePanel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Hub");
        setBackground(new java.awt.Color(0, 0, 0));

        inputPanel.setBackground(new java.awt.Color(51, 51, 51));
        inputPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Employee Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Chalkboard", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        inputPanel.setLayout(new java.awt.GridLayout(6, 2, 10, 15));

        ssnLabel.setBackground(new java.awt.Color(255, 255, 255));
        ssnLabel.setForeground(new java.awt.Color(255, 255, 255));
        ssnLabel.setText("SSN");
        inputPanel.add(ssnLabel);

        ssnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnInputActionPerformed(evt);
            }
        });
        inputPanel.add(ssnInput);

        dobLabel.setForeground(new java.awt.Color(255, 255, 255));
        dobLabel.setText("Date of Birth");
        inputPanel.add(dobLabel);
        inputPanel.add(dobInput);

        firstNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstNameLabel.setText("First Name");
        inputPanel.add(firstNameLabel);

        firstNameInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameInputActionPerformed(evt);
            }
        });
        inputPanel.add(firstNameInput);

        lastNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastNameLabel.setText("Last Name");
        inputPanel.add(lastNameLabel);
        inputPanel.add(lastNameInput);

        salaryLabel.setForeground(new java.awt.Color(255, 255, 255));
        salaryLabel.setText("Salary");
        inputPanel.add(salaryLabel);
        inputPanel.add(salaryInput);

        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("Gender");
        inputPanel.add(genderLabel);
        inputPanel.add(genderInput);

        btnPanel.setBackground(new java.awt.Color(51, 51, 51));
        btnPanel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnPanel.setLayout(new java.awt.GridLayout(1, 4, 5, 0));

        addBtn.setBackground(new java.awt.Color(0, 0, 0));
        addBtn.setText("Add");
        addBtn.setToolTipText("");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        btnPanel.add(addBtn);

        updateBtn.setBackground(new java.awt.Color(255, 255, 255));
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        btnPanel.add(updateBtn);

        deleteBtn.setBackground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Delete");
        btnPanel.add(deleteBtn);

        clearBtn.setBackground(new java.awt.Color(255, 255, 255));
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        btnPanel.add(clearBtn);

        tablePanel.setBackground(new java.awt.Color(51, 51, 51));
        tablePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Employee View", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Chalkboard SE", 0, 13), new java.awt.Color(255, 255, 255))); // NOI18N
        tablePanel.setForeground(new java.awt.Color(255, 255, 255));

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
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
        employeeTable.setGridColor(new java.awt.Color(153, 153, 153));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(employeeTable);

        javax.swing.GroupLayout tablePanelLayout = new javax.swing.GroupLayout(tablePanel);
        tablePanel.setLayout(tablePanelLayout);
        tablePanelLayout.setHorizontalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
        );
        tablePanelLayout.setVerticalGroup(
            tablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(tablePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(478, 559));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameInputActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        int ssn=Integer.parseInt(ssnInput.getText());
        String dob=dobInput.getText();
        String firstName=firstNameInput.getText();
        String lastName=lastNameInput.getText();
        String salary=salaryInput.getText();
        String gender=genderInput.getText();
        
        try {
            Statement smt = conn.createStatement();
            smt.execute("INSERT INTO table_employees(ssn, dob, firstName, lastName, salary, gender) "
                    + "VALUES('"+ssn+"', '"+dob+"', '"+firstName+"', '"+lastName+"', '"+salary+"', '"+gender+"')");
            JOptionPane.showMessageDialog(this, "Record Submitted");
            smt.close();
            ssnInput.setText("");
            dobInput.setText("");
            firstNameInput.setText("");
            lastNameInput.setText("");
            salaryInput.setText("");
            genderInput.setText("");
        } catch(Exception ex){
           JOptionPane.showMessageDialog(this, ex);
        }  
    }//GEN-LAST:event_addBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if(employeeID!=0){
            int ssn=Integer.parseInt(ssnInput.getText());
            String dob=dobInput.getText();
            String firstName=firstNameInput.getText();
            String lastName=lastNameInput.getText();
            String salary=salaryInput.getText();
            String gender=genderInput.getText();
            try {
                Statement stm = conn.createStatement();
                stm.execute("UPDATE table_employees SET ssn='"+ssn+"', dob='"+dob+"', firstName='"+firstName+"', "
                        + "lastName='"+lastName+"', salary='"+salary+"', gender='"+gender+"' WHERE id="+employeeID);
                JOptionPane.showMessageDialog(this, "Details Updated");
                setEmployeeTableData();
                resetData();
                employeeID=0;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Unable to Update Record");
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void ssnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnInputActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        resetData();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        try {
            employeeID=Integer.parseInt(employeeTable.getValueAt(employeeTable.getSelectedRow(), 0).toString());
            // System.out.println(employeeId);
            Statement smt = conn.createStatement(); 
            ResultSet rs = smt.executeQuery("SELECT * FROM table_employees WHERE id="+employeeID);
            if(rs.next()){
                ssnInput.setText(rs.getInt(2)+"");
                dobInput.setText(rs.getString(3));
                firstNameInput.setText(rs.getString(4));
                lastNameInput.setText(rs.getString(5));
                salaryInput.setText(rs.getString(6));
                genderInput.setText(rs.getString(7));
            }
            rs.close();
            smt.close();
            
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
        }

                
    }//GEN-LAST:event_employeeTableMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JPanel btnPanel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextField dobInput;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JTable employeeTable;
    private javax.swing.JTextField firstNameInput;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField genderInput;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameInput;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField salaryInput;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField ssnInput;
    private javax.swing.JLabel ssnLabel;
    private javax.swing.JPanel tablePanel;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void resetData() {
        ssnInput.setText("");
        dobInput.setText("");
        firstNameInput.setText("");
        lastNameInput.setText("");
        salaryInput.setText("");
        genderInput.setText("");
    }
    
    private void setEmployeeTableData(){
        try {
            int rows=0;
            int rowIndex=0;
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM table_employees ORDER by id desc");
            if(rs.next()) {
                rs.last();
                rows=rs.getRow();
                rs.beforeFirst();
            }
            // Show number of rows in table.
            // System.out.println(rows);
            String[][] data=new String[rows][7];
            while(rs.next()) {
                // Defining Columns
                data[rowIndex][0]=rs.getInt(1)+"";
                data[rowIndex][1]=rs.getInt(2)+"";
                data[rowIndex][2]=rs.getString(3);
                data[rowIndex][3]=rs.getString(4);
                data[rowIndex][4]=rs.getString(5);
                data[rowIndex][5]=rs.getString(6);
                data[rowIndex][6]=rs.getString(7);
                rowIndex++;
            }
            // System.out.println(rowIndex);
            String[] cols={"ID","SSN","DOB","First Name","Last Name","Salary","Gender"};
            DefaultTableModel model = new DefaultTableModel(data, cols);
            employeeTable.setModel(model);
                       
            rs.close();
            smt.close();
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(this, "Unable to Retrieve Data");
        }
    }
}


