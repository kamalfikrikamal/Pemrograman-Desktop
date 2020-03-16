/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karyawan;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Karyawan extends javax.swing.JFrame {

    /**
     * Creates new form Karyawan
     */
    public Karyawan() {
        initComponents();
        selectALL();
        loadTabelKaryawan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnBaru = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnBatal = new javax.swing.JButton();
        cbJabatan = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbKaryawan = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCari = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtNama.setEditable(false);

        jLabel1.setText("Nama");

        jLabel2.setText("Jabatan");

        btnBaru.setText("Baru");
        btnBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.setEnabled(false);
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.setEnabled(false);
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.setEnabled(false);
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnBatal.setText("Batal");
        btnBatal.setEnabled(false);
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        cbJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Staf", "Direktur" }));
        cbJabatan.setEnabled(false);
        cbJabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbJabatanActionPerformed(evt);
            }
        });

        tbKaryawan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tbKaryawan.setVerifyInputWhenFocusTarget(false);
        tbKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKaryawanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbKaryawan);

        jLabel3.setText("Cari");

        txtCari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCariKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnHapus))
                            .addComponent(cbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 158, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBaru)
                            .addComponent(btnUbah)
                            .addComponent(btnHapus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSimpan)
                            .addComponent(btnBatal)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbJabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbJabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbJabatanActionPerformed
    boolean disableTable = false;
    int selectedID;
    private void tbKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKaryawanMouseClicked
        if(disableTable == false) {
            btnUbah.setEnabled(true);
            btnHapus.setEnabled(true);
            selectedID = (int) tbKaryawan.getValueAt(tbKaryawan.getSelectedRow(),0);
            txtNama.setText(tbKaryawan.getValueAt(tbKaryawan.getSelectedRow(),1).toString());
            cbJabatan.setSelectedItem(tbKaryawan.getValueAt(tbKaryawan.getSelectedRow(),2).toString());
        }
    }//GEN-LAST:event_tbKaryawanMouseClicked
    boolean modeInsert = true;
    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
       btnSimpan.setEnabled(true);
       btnBatal.setEnabled(true);
       txtNama.setEditable(true);
       cbJabatan.setEnabled(true);
       btnBaru.setEnabled(false);
       btnUbah.setEnabled(false);
       btnHapus.setEnabled(false);
       tbKaryawan.setEnabled(false);
       disableTable = true;
       modeInsert = false;
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
       btnSimpan.setEnabled(true);
       btnBatal.setEnabled(true);
       txtNama.setEditable(true);
       cbJabatan.setEnabled(true);
       btnBaru.setEnabled(false);
       btnUbah.setEnabled(false);
       btnHapus.setEnabled(false);
       tbKaryawan.setEnabled(false);
       disableTable = true;
       
       txtNama.setText("");
       cbJabatan.setSelectedIndex(0);
       modeInsert = true;
    }//GEN-LAST:event_btnBaruActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String[] options = {"Ya", "Tidak"};
        int response = JOptionPane.showOptionDialog(
            this, "anda akan menghapus data " + txtNama.getText(), "Peringatan!",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            options,
            options[0]
            );
        if(response == JOptionPane.YES_OPTION){
            try{
                Statement stmt = conn.createStatement();
                stmt.executeUpdate("DELETE FROM karyawan where id_karyawan='"+ selectedID + "'");
                txtNama.setText("");
                cbJabatan.setSelectedIndex(0);
                loadTabelKaryawan();
            } catch (SQLException e) {
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
       btnSimpan.setEnabled(false);
       btnBatal.setEnabled(false);
       txtNama.setEditable(false);
       cbJabatan.setEnabled(false);
       btnBaru.setEnabled(true);
       btnUbah.setEnabled(true);
       btnHapus.setEnabled(true);
       tbKaryawan.setEnabled(true);
       disableTable = false;
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        disableTable = false;
        try{
            Statement stmt = conn.createStatement();
            if(modeInsert == false) {
                stmt.executeUpdate("UPDATE karyawan set "
                + "nm_karyawan='" + txtNama.getText() + "', "
                + "jab_karyawan='" + cbJabatan.getSelectedItem() + "' "
                + "WHERE id_karyawan='" + selectedID + "'");
                
                JOptionPane.showMessageDialog(null, "Update Berhasil");
                modeInsert = true;
            } else {
                stmt.executeUpdate("INSERT INTO karyawan('nm_karyawan','jab_karyawan') VALUES(" 
                + "'" + txtNama.getText() + "', "
                + "'" + cbJabatan.getSelectedItem() + "') ");
                
                JOptionPane.showMessageDialog(null, "Insert Berhasil");
            }
            
            loadTabelKaryawan();
            btnSimpan.setEnabled(false);
            btnBatal.setEnabled(false);
            txtNama.setEditable(false);
            cbJabatan.setEnabled(false);
            btnBaru.setEnabled(true);
            btnUbah.setEnabled(true);
            btnHapus.setEnabled(true);
            tbKaryawan.setEnabled(true);
        }catch (HeadlessException | SQLException e){
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtCariKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCariKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String teks = txtCari.getText();
            loadTabelKaryawan(teks);
        }
    }//GEN-LAST:event_txtCariKeyPressed

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
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Karyawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Karyawan().setVisible(true);
        });
    }
    private Connection connectDB() {
        String url = "jdbc:sqlite:src/karyawan/karyawan.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
   
    public void selectALL() {
        String sql = "SELECT * FROM karyawan";
        
        try (Connection con = this.connectDB();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                System.out.println(rs.getInt("id_karyawan") + "\t" +
                        rs.getString("nm_karyawan") + "\t" +
                        rs.getString("jab_karyawan"));
            }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    Connection conn = this.connectDB();
    public void loadTabelKaryawan(){
        String sql = "SELECT * FROM karyawan";
        Object[] kolom = { "ID", "Nama", "Jabatan" };
        DefaultTableModel dataModel = new DefaultTableModel(null, kolom);
        tbKaryawan.setModel(dataModel);
        tbKaryawan.getColumnModel().getColumn(0).setMaxWidth(30);
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("id_karyawan");
                String nama = rs.getString("nm_karyawan");
                String jabatan = rs.getString("jab_karyawan");
                
                Object[] data={id, nama, jabatan};
                dataModel.addRow(data);
            }
            
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void loadTabelKaryawan(String teks){
        String sql = "SELECT * FROM karyawan WHERE nm_karyawan like '%" + teks + "%'";
        Object[] kolom = { "ID", "Nama", "Jabatan" };
        DefaultTableModel dataModel = new DefaultTableModel(null, kolom);
        tbKaryawan.setModel(dataModel);
        tbKaryawan.getColumnModel().getColumn(0).setMaxWidth(30);
        
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                int id = rs.getInt("id_karyawan");
                String nama = rs.getString("nm_karyawan");
                String jabatan = rs.getString("jab_karyawan");
                
                Object[] data={id, nama, jabatan};
                dataModel.addRow(data);
            }
            
        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaru;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cbJabatan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbKaryawan;
    private javax.swing.JTextField txtCari;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
