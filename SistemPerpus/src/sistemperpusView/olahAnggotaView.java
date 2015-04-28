/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemperpusView;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import sistemperpusController.*;
import sistemperpusModel.*;

/**
 *
 * @author Mira
 */
public class olahAnggotaView extends javax.swing.JFrame {
    List<Anggota> repAnggota = new ArrayList();
    Anggota temp;
    SimpleDateFormat dt = new SimpleDateFormat("dd/MM/YYYY");
    olahAnggotaController controller = new olahAnggotaController();
    olahBukuController Bcontroller = new olahBukuController();
    searchController Scontroller = new searchController();
    DefaultTableModel model = new DefaultTableModel();
    /**
     * Creates new form olahAnggotaView
     */
    public olahAnggotaView() {
        repAnggota = controller.initData();
        initComponents();
        this.resultTable.setModel(model);
        model.addColumn("NIP/NIM");
        model.addColumn("Password");
        model.addColumn("Jabatan");
        model.addColumn("Total Pinjaman");
        model.addColumn("Tgl. Expire");
        model.addColumn("Denda");
        resultTable.getColumn("Password").setMaxWidth(0);
        resultTable.getColumn("Password").setMinWidth(0);
        resultTable.getColumn("Password").setPreferredWidth(0);
        ShowResult(repAnggota);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        panelReadDelete = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        panelAdd = new javax.swing.JPanel();
        label_NIPM = new javax.swing.JLabel();
        label_password = new javax.swing.JLabel();
        label_jabatan = new javax.swing.JLabel();
        boxNIPM = new javax.swing.JTextField();
        boxJabatan = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        boxPassword = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuMember = new javax.swing.JMenu();
        menuCari = new javax.swing.JMenuItem();
        menuKembali = new javax.swing.JMenuItem();
        menuDenda = new javax.swing.JMenuItem();
        menuAdmin = new javax.swing.JMenu();
        menuDataAnggota = new javax.swing.JMenuItem();
        menuDataBuku = new javax.swing.JMenuItem();
        menuDataPinjam = new javax.swing.JMenuItem();
        menuDataKembali = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        title.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        title.setText("e-Library Polban");

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resultTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resultTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(resultTable);

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelReadDeleteLayout = new javax.swing.GroupLayout(panelReadDelete);
        panelReadDelete.setLayout(panelReadDeleteLayout);
        panelReadDeleteLayout.setHorizontalGroup(
            panelReadDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelReadDeleteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(deleteButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(updateButton)
                .addContainerGap())
        );
        panelReadDeleteLayout.setVerticalGroup(
            panelReadDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelReadDeleteLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(panelReadDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton)
                    .addComponent(deleteButton))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Data Anggota", panelReadDelete);

        label_NIPM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_NIPM.setText("NIP/NIM");

        label_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_password.setText("Password");

        label_jabatan.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        label_jabatan.setText("Jabatan");

        boxNIPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxNIPMActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submit)
                .addGap(110, 110, 110))
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_NIPM)
                    .addComponent(label_password)
                    .addComponent(label_jabatan))
                .addGap(44, 44, 44)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boxNIPM, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(boxJabatan, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                    .addComponent(boxPassword))
                .addContainerGap(224, Short.MAX_VALUE))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_NIPM)
                    .addComponent(boxNIPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_password)
                    .addComponent(boxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boxJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_jabatan))
                .addGap(44, 44, 44)
                .addComponent(submit)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tambah Anggota", panelAdd);

        menuMember.setText("Anggota");

        menuCari.setText("Cari Buku");
        menuCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCariActionPerformed(evt);
            }
        });
        menuMember.add(menuCari);

        menuKembali.setText("Pengembalian");
        menuMember.add(menuKembali);

        menuDenda.setText("Bayar Denda");
        menuMember.add(menuDenda);

        jMenuBar1.add(menuMember);

        menuAdmin.setText("Admin");

        menuDataAnggota.setText("Data Anggota");
        menuDataAnggota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDataAnggotaActionPerformed(evt);
            }
        });
        menuAdmin.add(menuDataAnggota);

        menuDataBuku.setText("Data Buku");
        menuDataBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDataBukuActionPerformed(evt);
            }
        });
        menuAdmin.add(menuDataBuku);

        menuDataPinjam.setText("Data Peminjaman");
        menuAdmin.add(menuDataPinjam);

        menuDataKembali.setText("Data Pengembalian");
        menuAdmin.add(menuDataKembali);

        jMenuBar1.add(menuAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(title)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boxNIPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxNIPMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxNIPMActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
        repAnggota = controller.addAnggota(boxNIPM.getText(), boxPassword.getText(), boxJabatan.getText(),
                0, getDateAfter(180), 0.0, repAnggota);
        this.jTabbedPane1.setSelectedIndex(0);
        ShowResult(repAnggota);
    }//GEN-LAST:event_submitActionPerformed

    private void menuDataAnggotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDataAnggotaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_menuDataAnggotaActionPerformed

    private void menuDataBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDataBukuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Bcontroller.openBuku();
        dispose();
    }//GEN-LAST:event_menuDataBukuActionPerformed

    private void resultTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resultTableMouseClicked
        // TODO add your handling code here:
        getRowValue();
    }//GEN-LAST:event_resultTableMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
            // TODO add your handling code here:
        repAnggota  = controller.deleteAnggota(temp.getNIPM(), repAnggota);
        ShowResult(repAnggota);
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        // TODO add your handling code here:
        repAnggota = controller.updateAnggota(temp.getNIPM(), temp.getPassword(), temp.getJabatan(),
                temp.getTotalPinjam(), temp.getTglExpire(), temp.getDenda(), repAnggota);
        ShowResult(repAnggota);
    }//GEN-LAST:event_updateButtonActionPerformed

    private void menuCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCariActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Scontroller.startApplication();
        dispose();
    }//GEN-LAST:event_menuCariActionPerformed

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
            java.util.logging.Logger.getLogger(olahAnggotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(olahAnggotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(olahAnggotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(olahAnggotaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new olahAnggotaView().setVisible(true);
            }
        });
    }
    
    private void ShowResult(List<Anggota> resultList){
    
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        for(Object o : resultList){
            Anggota A = (Anggota)o;
            Object[] oneRow = new Object[6];
            oneRow[0] = (A.getNIPM());
            oneRow[1] = (A.getPassword());
            oneRow[2] = (A.getJabatan());
            oneRow[3] = (A.getTotalPinjam());
            oneRow[4] = (A.getTglExpire());
            oneRow[5] = (A.getDenda());
            
            model.addRow(oneRow);
        }
    }
    
    private void getRowValue (){
        int i = this.resultTable.getSelectedRow();
        
        if (i == -1)
            return;
       
        String NIPM = (String)model.getValueAt(i, 0);
        String Passwd = (String)model.getValueAt(i, 1);
        String Jabatan = (String)model.getValueAt(i, 2);
        int Total = (int)model.getValueAt(i, 3);
        Date Expire = (Date)model.getValueAt(i, 4);
        double Denda = (double)model.getValueAt(i, 5);
        temp = new Anggota (NIPM, Passwd, Jabatan, Total, Expire, Denda);
        System.out.println(NIPM+Passwd);    
    }
    
    private Date getDateAfter (int days){
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(new Date());
        c.add(Calendar.DATE, days);
        return c.getTime();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boxJabatan;
    private javax.swing.JTextField boxNIPM;
    private javax.swing.JPasswordField boxPassword;
    private javax.swing.JButton deleteButton;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel label_NIPM;
    private javax.swing.JLabel label_jabatan;
    private javax.swing.JLabel label_password;
    private javax.swing.JMenu menuAdmin;
    private javax.swing.JMenuItem menuCari;
    private javax.swing.JMenuItem menuDataAnggota;
    private javax.swing.JMenuItem menuDataBuku;
    private javax.swing.JMenuItem menuDataKembali;
    private javax.swing.JMenuItem menuDataPinjam;
    private javax.swing.JMenuItem menuDenda;
    private javax.swing.JMenuItem menuKembali;
    private javax.swing.JMenu menuMember;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelReadDelete;
    private javax.swing.JTable resultTable;
    private javax.swing.JButton submit;
    private javax.swing.JLabel title;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
