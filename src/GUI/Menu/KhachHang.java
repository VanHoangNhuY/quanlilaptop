/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.Menu;

import DTO.KhachHangDTO;
import GUI.Component.PanelBorderRadius;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KIET
 */
public class KhachHang extends JPanel implements ActionListener, ItemListener{
    PanelBorderRadius main, functionBar;
    JPanel pnlBorder1, pnlBorder2, pnlBorder3, pnlBorder4, contentCenter;
    JTable tableKhachHang;
    JScrollPane scrollTableKhachHang;
//    MainFunction mainFunction;
    JFrame owner = (JFrame) SwingUtilities.getWindowAncestor(this);
//    IntegratedSearch search;
    DefaultTableModel tblModel;
//    public KhachHangBUS khachhangBUS = new KhachHangBUS();
//    public ArrayList<KhachHangDTO> listkh = khachhangBUS.getAll();
//    Main m;
    Color BackgroundColor = new Color(240, 247, 250);
    
     private void initComponent() {
        this.setBackground(BackgroundColor);
        this.setLayout(new BorderLayout(0, 0));
        this.setOpaque(true);

        tableKhachHang = new JTable();
        scrollTableKhachHang = new JScrollPane();
        tblModel = new DefaultTableModel();
        String[] header = new String[]{"Mã khách hàng ascadfcasdfs", "Tên khách hàng asdfasdfdasf", "Địa chỉ", "Số điện thoại", "Ngày tham gia"};
        //  JOptionPane.showMessageDialog(this, "The number entheaderered is: " + header, "Message", JOptionPane.INFORMATION_MESSAGE);

        tblModel.setColumnIdentifiers(header);
        tableKhachHang.setModel(tblModel);
        tableKhachHang.setFocusable(false);
        scrollTableKhachHang.setViewportView(tableKhachHang);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tableKhachHang.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tableKhachHang.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tableKhachHang.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tableKhachHang.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tableKhachHang.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);

        tableKhachHang.setAutoCreateRowSorter(true);
//        TableSorter.configureTableColumnSorter(tableKhachHang, 0, TableSorter.INTEGER_COMPARATOR);

        // pnlBorder1, pnlBorder2, pnlBorder3, pnlBorder4 chỉ để thêm contentCenter ở giữa mà contentCenter không bị dính sát vào các thành phần khác
        pnlBorder1 = new JPanel();
        pnlBorder1.setPreferredSize(new Dimension(0, 10));
        pnlBorder1.setBackground(BackgroundColor);
        this.add(pnlBorder1, BorderLayout.NORTH);

        pnlBorder2 = new JPanel();
        pnlBorder2.setPreferredSize(new Dimension(0, 10));
        pnlBorder2.setBackground(BackgroundColor);
        this.add(pnlBorder2, BorderLayout.SOUTH);

        pnlBorder3 = new JPanel();
        pnlBorder3.setPreferredSize(new Dimension(10, 0));
        pnlBorder3.setBackground(BackgroundColor);
        this.add(pnlBorder3, BorderLayout.EAST);

        pnlBorder4 = new JPanel();
        pnlBorder4.setPreferredSize(new Dimension(10, 0));
        pnlBorder4.setBackground(BackgroundColor);
        this.add(pnlBorder4, BorderLayout.WEST);

        contentCenter = new JPanel();
        contentCenter.setPreferredSize(new Dimension(1100, 600));
        contentCenter.setBackground(BackgroundColor);
        contentCenter.setLayout(new BorderLayout(10, 10));
        this.add(contentCenter, BorderLayout.CENTER);

        // functionBar là thanh bên trên chứa các nút chức năng như thêm xóa sửa, và tìm kiếm
        functionBar = new PanelBorderRadius();
        functionBar.setPreferredSize(new Dimension(0, 100));
        functionBar.setLayout(new GridLayout(1, 2, 50, 0));
        functionBar.setBorder(new EmptyBorder(10, 10, 10, 10));

        String[] action = {"create", "update", "delete", "detail", "import", "export"};
//        mainFunction = new MainFunction(m.user.getManhomquyen(), "khachhang", action);
//        for (String ac : action) {
//            mainFunction.btn.get(ac).addActionListener(this);
//        }
//        functionBar.add(mainFunction);
//
//        search = new IntegratedSearch(new String[]{"Tất cả", "Mã khách hàng", "Tên khách hàng", "Địa chỉ", "Số điện thoại"});
//        search.cbxChoose.addItemListener(this);
//        search.txtSearchForm.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyReleased(KeyEvent e) {
//                String type = (String) search.cbxChoose.getSelectedItem();
//                String txt = search.txtSearchForm.getText();
//                listkh = khachhangBUS.search(txt, type);
//                loadDataTable(listkh);
//            }
//        });
//
//        search.btnReset.addActionListener((ActionEvent e) -> {
//            search.txtSearchForm.setText("");
//            listkh = khachhangBUS.getAll();
//            loadDataTable(listkh);
//        });
//        
//        
//        functionBar.add(search);

        contentCenter.add(functionBar, BorderLayout.NORTH);

        // main là phần ở dưới để thống kê bảng biểu
        main = new PanelBorderRadius();
        BoxLayout boxly = new BoxLayout(main, BoxLayout.Y_AXIS);
        main.setLayout(boxly);
//        main.setBorder(new EmptyBorder(20, 20, 20, 20));
        contentCenter.add(main, BorderLayout.CENTER);

        main.add(scrollTableKhachHang);
    }

    

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
