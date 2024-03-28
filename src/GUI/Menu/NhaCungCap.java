/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.Menu;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import BUS.BUS_Brand;
import BUS.BUS_NhaCungCap;
import BUS.BUS_Product;
import DTO.DTO_NhaCungCap;
import DTO.DTO_Product;
import GUI.CRUD.SuaNhaCungCap;
import GUI.CRUD.ThemNhaCungCapCURD;
import GUI.CRUD.XemNhaCungCap;

/**
 *
 * @author KIET
 */
public class NhaCungCap extends javax.swing.JPanel {
    
    public BUS_NhaCungCap busncc = new BUS_NhaCungCap();
    public ArrayList<DTO_NhaCungCap> listncc = busncc.getAllData();
    private DTO_NhaCungCap nccDTO;
    DefaultTableModel model;
    /**
     * Creates new form NhaCungCap
     */
    public NhaCungCap() {
        initComponents();
        loadTable(listncc);
    }

    public int getRowSelected() {
        int index = jTable1.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhà cung cấp");
        }
        return index;
    }

    public void loadTable(ArrayList<DTO_NhaCungCap> list) {
    model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear the table
    
        for (DTO_NhaCungCap ncc : list) {
            Object[] row = new Object[] {
                ncc.getMancc(),
                ncc.getTenncc(),
                ncc.getDiachi(),
                ncc.getEmail(),
                ncc.getsodienthoai(),
                // Add more fields as necessary
            };
    
            model.addRow(row);
        }
    
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);
        for (int i = 0; i < model.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
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

        jPanel2 = new javax.swing.JPanel();
        txtSearchNCC = new com.raven.suportSwing.TextField();
        myButton1NCC = new com.raven.suportSwing.MyButton();
        lblSearch = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1NCC = new javax.swing.JLabel();
        jLabel2NCC = new javax.swing.JLabel();
        jLabel3NCC = new javax.swing.JLabel();
        jLabel4NCC = new javax.swing.JLabel();
        jLabel5NCC = new javax.swing.JLabel();
        jLabel6NCC = new javax.swing.JLabel();
        jLabel7NCC = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        myButton2NCC = new com.raven.suportSwing.MyButton();
        jComboBoxNCC = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txtSearchNCC.setLabelText("Tìm theo tên or mã");
        txtSearchNCC.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSearchNCCFocusGained(evt);
            }
        });
        txtSearchNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchNCCActionPerformed(evt);
            }
        });
        txtSearchNCC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchNCCKeyReleased(evt);
            }
        });

        myButton1NCC.setBackground(new java.awt.Color(204, 255, 255));
        myButton1NCC.setText("Tìm cơ bản");
        myButton1NCC.setBorderColor(new java.awt.Color(153, 255, 255));
        myButton1NCC.setRadius(20);
        myButton1NCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1NCCActionPerformed(evt);
            }
        });

        lblSearch.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(255, 51, 0));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1NCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-75.png"))); // NOI18N
        jLabel1NCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1NCCMousePressed(evt);
            }
        });

        jLabel2NCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-edit-75.png"))); // NOI18N
        jLabel2NCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2NCCMousePressed(evt);
            }
        });

        jLabel3NCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-delete-85.png"))); // NOI18N
        jLabel3NCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3NCCMousePressed(evt);
            }
        });

        jLabel4NCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-view-75.png"))); // NOI18N

        jLabel5NCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-excel-75.png"))); // NOI18N

        jLabel6NCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-export-excel-75.png"))); // NOI18N

        jLabel7NCC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-config-75.png"))); // NOI18N
        jLabel7NCC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel7NCCMousePressed(evt);
            }
        });

        jButton2.setText("Sua");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xoa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Them");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Xem Chi Tiet");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Them");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Xuat");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1NCC)
                    .addComponent(jButton4))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3NCC)
                    .addComponent(jButton3))
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jLabel4NCC))
                .addGap(20, 20, 20)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jButton6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel6NCC)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7NCC))
                    .addComponent(jButton7))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1NCC)
                    .addComponent(jLabel2NCC)
                    .addComponent(jLabel3NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5NCC)
                    .addComponent(jLabel6NCC)
                    .addComponent(jLabel7NCC)
                    .addComponent(jLabel4NCC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton4)
                        .addComponent(jButton5)
                        .addComponent(jButton6)
                        .addComponent(jButton7)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        myButton2NCC.setBackground(new java.awt.Color(204, 255, 255));
        myButton2NCC.setText("Tìm nâng cao");
        myButton2NCC.setBorderColor(new java.awt.Color(153, 255, 255));
        myButton2NCC.setColorOver(new java.awt.Color(204, 255, 255));
        myButton2NCC.setRadius(20);
        myButton2NCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton2NCCActionPerformed(evt);
            }
        });

        jComboBoxNCC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lọc theo hãng" }));
        jComboBoxNCC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jComboBoxNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxNCCActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã ncc", "Tên ncc", "Dia chi", "Email", "So Dien Thoai"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtSearchNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(myButton1NCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(myButton2NCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1253, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSearchNCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboBoxNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(myButton1NCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(myButton2NCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchNCCFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSearchNCCFocusGained

    }//GEN-LAST:event_txtSearchNCCFocusGained

    private void txtSearchNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchNCCActionPerformed
                // TODO add your handling code here:
                
        
    }//GEN-LAST:event_txtSearchNCCActionPerformed

    private void txtSearchNCCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchNCCKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchNCCKeyReleased

    private void myButton1NCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1NCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton1NCCActionPerformed

    private void jLabel1NCCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1NCCMousePressed
        // TODO add your handling code here:
        //        AddProducts add = new AddProducts(parent, true, this);
        //        add.setLocationRelativeTo(null);
        //        add.setVisible(true);
    }//GEN-LAST:event_jLabel1NCCMousePressed

    private void jLabel2NCCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2NCCMousePressed
        // Thêm sự kiện lắng nghe sự kiện chọn hàng của JTable
        //        if (currentIDselected == -1) {
            //            JOptionPane.showMessageDialog(parent, "Vui lòng chọn sản phẩm để chỉnh sửa", "Cảnh báo!", JOptionPane.WARNING_MESSAGE);
            //            return;
            //        }
        //        EditProduct add = new EditProduct(parent, true, currentIDselected);
        //        add.setLocationRelativeTo(null);
        //        add.setVisible(true);
    }//GEN-LAST:event_jLabel2NCCMousePressed

    private void jLabel3NCCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3NCCMousePressed
        // this func to delete product
        //        if (currentIDselected == -1) {
            //            JOptionPane.showMessageDialog(parent, "Vui lòng chọn sản phẩm để xóa", "Cảnh báo!", JOptionPane.WARNING_MESSAGE);
            //            return;
            //        }
        //        productBUS.delete(currentIDselected);
        //        JOptionPane.showMessageDialog(parent, "Xóa sản phẩm thành công", "Thông báo!", JOptionPane.INFORMATION_MESSAGE);
        //        FillTable(productBUS.getAllData());
    }//GEN-LAST:event_jLabel3NCCMousePressed

    private void jLabel7NCCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7NCCMousePressed
        //        ViewCauHinh vch = new ViewCauHinh(parent, true, currentIDselected);
        //        vch.setLocationRelativeTo(null);
        //        vch.setVisible(true);
        //        vch.setResizable(false);
    }//GEN-LAST:event_jLabel7NCCMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int index = getRowSelected();
        if (index == -1) {
            return;
        }
        // JOptionPane.showMessageDialog(this, "Ban da chon nha cung cap nay: " + index);
        int maNCC = jTable1.getValueAt(index, 0).hashCode();
        String tenNCC = jTable1.getValueAt(index, 1).toString();
        String diaChi = jTable1.getValueAt(index, 2).toString();
        String email = jTable1.getValueAt(index, 3).toString();
        String sdt = jTable1.getValueAt(index, 4).toString();
        DTO_NhaCungCap nccDTO = new DTO_NhaCungCap(maNCC, tenNCC, diaChi, email, sdt, 1);
        SuaNhaCungCap suancc = new SuaNhaCungCap();
        suancc.setNccDTO(nccDTO);
        suancc.setTextField();
        suancc.setLocationRelativeTo(null);
        suancc.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: Xoa
        int index = jTable1.getSelectedRow();
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn nhà cung cấp cần xóa");
        } else {
            int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa nhà cung cấp này không?", "Xác nhận", JOptionPane.YES_NO_OPTION);
          if (confirm == JOptionPane.YES_OPTION) {
            int id = (int) jTable1.getValueAt(index, 0);
            busncc.delete(id);
            JOptionPane.showMessageDialog(null, "Xóa nhà cung cấp thành công");
            loadTable(busncc.getAllData());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        System.out.println("Button 4 được nhấn!");
        ThemNhaCungCapCURD themNhaCungCapFrame = new ThemNhaCungCapCURD();
        themNhaCungCapFrame.setLocationRelativeTo(null);
        themNhaCungCapFrame.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int index = getRowSelected();
        if (index == -1) {
            return;
        }
        // JOptionPane.showMessageDialog(this, "Ban da chon nha cung cap nay: " + index);
        int maNCC = jTable1.getValueAt(index, 0).hashCode();
        String tenNCC = jTable1.getValueAt(index, 1).toString();
        String diaChi = jTable1.getValueAt(index, 2).toString();
        String email = jTable1.getValueAt(index, 3).toString();
        String sdt = jTable1.getValueAt(index, 4).toString();
        DTO_NhaCungCap nccDTO = new DTO_NhaCungCap(maNCC, tenNCC, diaChi, email, sdt, 1);
        XemNhaCungCap xemncc = new XemNhaCungCap();
        xemncc.setNccDTO(nccDTO);
        xemncc.setTextField();
        xemncc.setLocationRelativeTo(null);
        xemncc.setVisible(true);
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void myButton2NCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton2NCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_myButton2NCCActionPerformed

    private void jComboBoxNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxNCCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxNCCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBoxNCC;
    private javax.swing.JLabel jLabel1NCC;
    private javax.swing.JLabel jLabel2NCC;
    private javax.swing.JLabel jLabel3NCC;
    private javax.swing.JLabel jLabel4NCC;
    private javax.swing.JLabel jLabel5NCC;
    private javax.swing.JLabel jLabel6NCC;
    private javax.swing.JLabel jLabel7NCC;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JLabel lblSearch;
    private com.raven.suportSwing.MyButton myButton1NCC;
    private com.raven.suportSwing.MyButton myButton2NCC;
    private com.raven.suportSwing.TextField txtSearchNCC;
    // End of variables declaration//GEN-END:variables
}
