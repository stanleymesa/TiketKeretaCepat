package View;

import Controller.cKeretaCepat;
import DAO.DAOKeretaCepat;
import DAOInterface.IDAOKeretaCepat;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class vFormPenumpang extends javax.swing.JFrame {

    public vFormPenumpang(int roleDatabase) {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        cKrtCpt = new Controller.cKeretaCepat(this,roleDatabase);
        cKrtCpt.startApp();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupJenisKelamin = new javax.swing.ButtonGroup();
        btnGroupJamBerangkat = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        lblNamaLengkap = new javax.swing.JLabel();
        lblAlamat = new javax.swing.JLabel();
        rbLakiLaki = new javax.swing.JRadioButton();
        rbPerempuan = new javax.swing.JRadioButton();
        lblJenisKelamin = new javax.swing.JLabel();
        tfId = new javax.swing.JTextField();
        tfNik = new javax.swing.JTextField();
        lblJamBerangkat = new javax.swing.JLabel();
        rbJam10 = new javax.swing.JRadioButton();
        rbJam12 = new javax.swing.JRadioButton();
        rbJam14 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        taAlamat = new javax.swing.JTextArea();
        lblNik = new javax.swing.JLabel();
        tfNamaLengkap = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPenumpang = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        cbSearch = new javax.swing.JComboBox<>();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tfStatus = new javax.swing.JTextField();
        lblHurufSisaJam10 = new javax.swing.JLabel();
        lblHurufSisaJam14 = new javax.swing.JLabel();
        lblHurufSisaJam12 = new javax.swing.JLabel();
        lblSisaJam10 = new javax.swing.JLabel();
        lblSisaJam14 = new javax.swing.JLabel();
        lblSisaJam12 = new javax.swing.JLabel();
        cbSearchJam = new javax.swing.JComboBox<>();
        lblStatusSlot10 = new javax.swing.JLabel();
        lblStatusSlot14 = new javax.swing.JLabel();
        lblStatusSlot12 = new javax.swing.JLabel();
        btnUpdateSlot = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("PT. KERETA CEPAT STAINC");

        lblId.setText("ID");

        lblNamaLengkap.setText("Nama Lengkap");

        lblAlamat.setText("Alamat");

        btnGroupJenisKelamin.add(rbLakiLaki);
        rbLakiLaki.setText("Laki - Laki");

        btnGroupJenisKelamin.add(rbPerempuan);
        rbPerempuan.setText("Perempuan");

        lblJenisKelamin.setText("Jenis Kelamin");

        tfId.setEnabled(false);

        tfNik.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNikMouseClicked(evt);
            }
        });

        lblJamBerangkat.setText("Jam Berangkat");

        btnGroupJamBerangkat.add(rbJam10);
        rbJam10.setText("10 : 00  WIB");

        btnGroupJamBerangkat.add(rbJam12);
        rbJam12.setText("12 : 00  WIB");

        btnGroupJamBerangkat.add(rbJam14);
        rbJam14.setText("14 : 00  WIB");

        taAlamat.setColumns(20);
        taAlamat.setLineWrap(true);
        taAlamat.setRows(5);
        taAlamat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                taAlamatMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(taAlamat);

        lblNik.setText("NIK");

        tfNamaLengkap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tfNamaLengkapMouseClicked(evt);
            }
        });

        tblPenumpang.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPenumpang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPenumpangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPenumpang);

        jLabel9.setText("Cari Berdasarkan");

        cbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "ID", "NIK", "Nama Lengkap" }));

        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchKeyPressed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel10.setText("Status");

        tfStatus.setEditable(false);
        tfStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lblHurufSisaJam10.setText("Sisa");

        lblHurufSisaJam14.setText("Sisa");

        lblHurufSisaJam12.setText("Sisa");

        lblSisaJam10.setText("40");

        lblSisaJam14.setText("40");

        lblSisaJam12.setText("40");

        cbSearchJam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semua Jam Keberangkatan", "Jam 10 : 00 WIB", "Jam 12 : 00 WIB", "Jam 14 : 00 WIB" }));

        lblStatusSlot10.setText("lblStatusSlot10");

        lblStatusSlot14.setText("lblStatusSlot14");

        lblStatusSlot12.setText("lblStatusSlot12");

        btnUpdateSlot.setText("Update Slot");
        btnUpdateSlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSlotActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(255, 0, 0));
        btnLogout.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Logout");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNik)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblId)
                                    .addComponent(lblJenisKelamin)
                                    .addComponent(lblJamBerangkat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblNamaLengkap)
                                    .addComponent(lblAlamat)
                                    .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbJam12)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblHurufSisaJam12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblSisaJam12)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblStatusSlot12))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbJam10)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblHurufSisaJam10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblSisaJam10)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblStatusSlot10))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbLakiLaki)
                                                .addGap(18, 18, 18)
                                                .addComponent(rbPerempuan))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rbJam14)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblHurufSisaJam14)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lblSisaJam14)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblStatusSlot14))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfNik, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfNamaLengkap, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfId, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(btnUpdate)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(tfStatus, javax.swing.GroupLayout.Alignment.LEADING))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(138, 138, 138)
                                        .addComponent(jLabel10)))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbSearchJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSearch)))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel3)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnUpdateSlot, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblId)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(cbSearchJam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNik)
                            .addComponent(tfNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNamaLengkap)
                            .addComponent(tfNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblJenisKelamin)
                            .addComponent(rbLakiLaki)
                            .addComponent(rbPerempuan))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAlamat)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbJam10)
                            .addComponent(lblHurufSisaJam10)
                            .addComponent(lblSisaJam10)
                            .addComponent(lblJamBerangkat)
                            .addComponent(lblStatusSlot10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbJam12)
                            .addComponent(lblHurufSisaJam12)
                            .addComponent(lblSisaJam12)
                            .addComponent(lblStatusSlot12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbJam14)
                            .addComponent(lblHurufSisaJam14)
                            .addComponent(lblSisaJam14)
                            .addComponent(lblStatusSlot14))
                        .addGap(18, 18, 18)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate)
                            .addComponent(btnDelete)
                            .addComponent(btnReset))
                        .addGap(28, 28, 28)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        cKrtCpt.searchData();
        cKrtCpt.resizeTable();
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        cKrtCpt.resetData();
        cKrtCpt.resetBorder();
        cKrtCpt.readData();
        tfStatus.setText("");
        cKrtCpt.resizeTable();
        tfStatus.setBackground(Color.WHITE);        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        cKrtCpt.insertData();
        cKrtCpt.readData();
        cKrtCpt.updateSlot();
        cKrtCpt.resizeTable();

    }//GEN-LAST:event_btnInsertActionPerformed

    private void tblPenumpangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPenumpangMouseClicked
        int row = tblPenumpang.getSelectedRow();
        cKrtCpt.isiField(row);
        cKrtCpt.resetBorder();
    }//GEN-LAST:event_tblPenumpangMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int option = JOptionPane.showConfirmDialog(null, "Apakah yakin ingin menghapus data?", "Delete", JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        
        if(option == 0)
        {
            cKrtCpt.deleteData();
            cKrtCpt.readData();
            cKrtCpt.resetData();
            cKrtCpt.updateSlot();
            cKrtCpt.resizeTable();
        }
            
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        
        cKrtCpt.updateData();
        cKrtCpt.readData();
        cKrtCpt.updateSlot();
        cKrtCpt.resizeTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
         // TODO add your handling code here:
        dispose();
        new vAdminLogin().setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnUpdateSlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSlotActionPerformed
        // TODO add your handling code here:
        dispose();
        new vUpdateSlot().setVisible(true);
    }//GEN-LAST:event_btnUpdateSlotActionPerformed

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        // TODO add your handling code here:
        btnLogout.setForeground(Color.BLACK);
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        // TODO add your handling code here:
        btnLogout.setForeground(Color.WHITE);

    }//GEN-LAST:event_btnLogoutMouseExited

    private void tfNikMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNikMouseClicked
        
        getTfNik().setBorder(new JTextField().getBorder());
    }//GEN-LAST:event_tfNikMouseClicked

    private void tfNamaLengkapMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfNamaLengkapMouseClicked
        getTfNamaLengkap().setBorder(new JTextField().getBorder());
    }//GEN-LAST:event_tfNamaLengkapMouseClicked

    private void taAlamatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_taAlamatMouseClicked
        getTaAlamat().setBorder(new JTextField().getBorder());
    }//GEN-LAST:event_taAlamatMouseClicked

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            cKrtCpt.searchData();
            cKrtCpt.resizeTable();
        }
    }//GEN-LAST:event_tfSearchKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.ButtonGroup btnGroupJamBerangkat;
    private javax.swing.ButtonGroup btnGroupJenisKelamin;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdateSlot;
    private javax.swing.JComboBox<String> cbSearch;
    private javax.swing.JComboBox<String> cbSearchJam;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAlamat;
    private javax.swing.JLabel lblHurufSisaJam10;
    private javax.swing.JLabel lblHurufSisaJam12;
    private javax.swing.JLabel lblHurufSisaJam14;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblJamBerangkat;
    private javax.swing.JLabel lblJenisKelamin;
    private javax.swing.JLabel lblNamaLengkap;
    private javax.swing.JLabel lblNik;
    private javax.swing.JLabel lblSisaJam10;
    private javax.swing.JLabel lblSisaJam12;
    private javax.swing.JLabel lblSisaJam14;
    private javax.swing.JLabel lblStatusSlot10;
    private javax.swing.JLabel lblStatusSlot12;
    private javax.swing.JLabel lblStatusSlot14;
    private javax.swing.JRadioButton rbJam10;
    private javax.swing.JRadioButton rbJam12;
    private javax.swing.JRadioButton rbJam14;
    private javax.swing.JRadioButton rbLakiLaki;
    private javax.swing.JRadioButton rbPerempuan;
    private javax.swing.JTextArea taAlamat;
    private javax.swing.JTable tblPenumpang;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfNamaLengkap;
    private javax.swing.JTextField tfNik;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfStatus;
    // End of variables declaration//GEN-END:variables
    
    cKeretaCepat cKrtCpt;
    
    public JTable getTblPenumpang()
    {
        return tblPenumpang;
    }
    
    public JTextField getTfId()
    {
        return tfId;
    }
    
    public JTextField getTfNik()
    {
        return tfNik;
    }
    
    public JTextField getTfNamaLengkap()
    {
        return tfNamaLengkap;
    }
    
    public JRadioButton getRbLakiLaki()
    {
        return rbLakiLaki;
    }
    
    public JRadioButton getRbPerempuan()
    {
        return rbPerempuan;
    }
    
    public JTextArea getTaAlamat()
    {
        return taAlamat;
    }
    
    public JRadioButton getRbJam10()
    {
        return rbJam10;
    } 
    
    public JRadioButton getRbJam12()
    {
        return rbJam12;
    }
        
    public JRadioButton getRbJam14()
    {
        return rbJam14;
    }
    
    public ButtonGroup getBtnGroupJenisKelamin(){
        return btnGroupJenisKelamin;
    }    
    
    public ButtonGroup getBtnGroupJamBerangkat()
    {
        return btnGroupJamBerangkat;
    }
    
    public JTextField getTfStatus()
    {
        return tfStatus;
    }
    
    public JLabel getLblSisaJam10()
    {
        return lblSisaJam10;
    }
    
    public JLabel getLblSisaJam12()
    {
        return lblSisaJam12;
    }
    
    public JLabel getLblSisaJam14()
    {
        return lblSisaJam14;
    }
    
    public JLabel getLbLHurufSisaJam10()
    {
        return lblHurufSisaJam10;
    }
    
    public JLabel getLbLHurufSisaJam12()
    {
        return lblHurufSisaJam12;
    }
    
    public JLabel getLbLHurufSisaJam14()
    {
        return lblHurufSisaJam14;
    }
    
    public JLabel getLblStatusSlot10()
    {
        return lblStatusSlot10;
    }
    
    public JLabel getLblStatusSlot12()
    {
        return lblStatusSlot12;
    }
        
    public JLabel getLblStatusSlot14()
    {
        return lblStatusSlot14;
    }
    
    public JButton getBtnInsert()
    {
        return btnInsert;
    }
    
    public JButton getBtnUpdate()
    {
        return btnUpdate;
    }
    
    public JButton getBtnDelete()
    {
        return btnDelete;
    }
    
    public JComboBox getCbSearchJam()
    {
        return cbSearchJam;
    }
    
    public JComboBox getCbSearch()    
    {
        return cbSearch;
    }
    
    public JTextField getTfSearch()
    {
        return tfSearch;
    }
    
    public JButton getBtnUpdateSlot()
    {
        return btnUpdateSlot;
    }
    
    

}