/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Car;
import model.CarList;

/**
 *
 * @author murali
 */
public class mainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainJFrame
     */
    
    CarList carList;
    public mainJFrame() {
        initComponents();
        
        carList = new CarList();
        prePopulate();
        prePopulate1();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane = new javax.swing.JSplitPane();
        mainPanel = new javax.swing.JPanel();
        controlPanel = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jSplitPane.setRightComponent(mainPanel);

        controlPanel.setBackground(new java.awt.Color(153, 153, 255));

        btnCreate.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnCreate.setText("ADD VEHICLE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnSearch.setText("CUSTOMER PORTAL");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btnView.setText("VIEW VEHICLE");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnSearch, btnView});

        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlPanelLayout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(btnCreate)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addGap(53, 53, 53)
                .addComponent(btnSearch)
                .addContainerGap(155, Short.MAX_VALUE))
        );

        controlPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnSearch, btnView});

        jSplitPane.setLeftComponent(controlPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        CreateJPanel panel = new CreateJPanel(carList);
        jSplitPane.setRightComponent(panel); 
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
        ViewJPanel panel = new ViewJPanel(carList);
        jSplitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        SearchJPanel panel = new SearchJPanel(carList);
        jSplitPane.setRightComponent(panel);
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnView;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JSplitPane jSplitPane;
    private javax.swing.JPanel mainPanel;
    // End of variables declaration//GEN-END:variables

    private void prePopulate() {
        // data 1
        String manufacturerName="Tesla";
        String manufacturerYear="2000";
        int seats=3;
        String serialNumber="12AZ24";
        String modelNumber="Model Y";
        String city="Boston";
        String expiryDate="2024";
        String avail="yes";
       
        Car c = carList.addNewCars();

        c.setAvailability(avail);
        c.setCarNumber(serialNumber);
        c.setCity(city);
        c.setExpiryCertificate(expiryDate);
        c.setManufacturedYear(Integer.parseInt(manufacturerYear));
        c.setLastUpdate(expiryDate);
        c.setManufacturer(manufacturerName);
        c.setModelNumber(modelNumber);
        c.setSeats(seats);
        
    }
     private void prePopulate1() {
        // data
        
        String manufacturerName;
        String manufacturerYear;
        int seats;
        String serialNumber;
        String modelNumber;
        String city;
        String expiryDate;
        String avail;
       
        Car c = carList.addNewCars(manufacturerName="Honda",manufacturerYear="2021",seats=3,serialNumber="PLMQTY1",modelNumber="CRV",city="Chicago",expiryDate="2060",avail="yes");
        c.setAvailability(avail);
        c.setCarNumber(serialNumber);
        c.setCity(city);
        c.setExpiryCertificate(expiryDate);
        c.setManufacturedYear(Integer.parseInt(manufacturerYear));
        c.setLastUpdate(expiryDate);
        c.setManufacturer(manufacturerName);
        c.setModelNumber(modelNumber);
        c.setSeats(seats);
        
        Car b = carList.addNewCars(manufacturerName="Honda",manufacturerYear="2016",seats=3,serialNumber="UC3TY1",modelNumber="Civic",city="Chicago",expiryDate="2044",avail="yes");
        b.setAvailability(avail);
        b.setCarNumber(serialNumber);
        b.setCity(city);
        b.setExpiryCertificate(expiryDate);
        b.setManufacturedYear(Integer.parseInt(manufacturerYear));
        b.setLastUpdate(expiryDate);
        b.setManufacturer(manufacturerName);
        b.setModelNumber(modelNumber);
        b.setSeats(seats);
        
        Car a = carList.addNewCars(manufacturerName="BMW",manufacturerYear="2017",seats=5,serialNumber="KNML23",modelNumber="5 Series",city="Boston",expiryDate="2060",avail="no");
        a.setAvailability(avail);
        a.setCarNumber(serialNumber);
        a.setCity(city);
        a.setExpiryCertificate(expiryDate);
        a.setManufacturedYear(Integer.parseInt(manufacturerYear));
        a.setLastUpdate(expiryDate);
        a.setManufacturer(manufacturerName);
        a.setModelNumber(modelNumber);
        a.setSeats(seats);
        
        Car d = carList.addNewCars(manufacturerName="Tesla",manufacturerYear="2018",seats=1,serialNumber="QWERTY",modelNumber="Model Y",city="San Jose",expiryDate="2033",avail="no");
        d.setAvailability(avail);
        d.setCarNumber(serialNumber);
        d.setCity(city);
        d.setExpiryCertificate(expiryDate);
        d.setManufacturedYear(Integer.parseInt(manufacturerYear));
        d.setLastUpdate(expiryDate);
        d.setManufacturer(manufacturerName);
        d.setModelNumber(modelNumber);
        d.setSeats(seats);
        
        Car e = carList.addNewCars(manufacturerName="Honda",manufacturerYear="2001",seats=6,serialNumber="PNMUI1",modelNumber="Accord",city="Dallas",expiryDate="2022",avail="no");
        e.setAvailability(avail);
        e.setCarNumber(serialNumber);
        e.setCity(city);
        e.setExpiryCertificate(expiryDate);
        e.setManufacturedYear(Integer.parseInt(manufacturerYear));
        e.setLastUpdate(expiryDate);
        e.setManufacturer(manufacturerName);
        e.setModelNumber(modelNumber);
        e.setSeats(seats);
        
        Car f = carList.addNewCars(manufacturerName="Hyundai",manufacturerYear="2000",seats=3,serialNumber="HYU412",modelNumber="Accent",city="Chicago",expiryDate="2029",avail="no");
        f.setAvailability(avail);
        f.setCarNumber(serialNumber);
        f.setCity(city);
        f.setExpiryCertificate(expiryDate);
        f.setManufacturedYear(Integer.parseInt(manufacturerYear));
        f.setLastUpdate(expiryDate);
        f.setManufacturer(manufacturerName);
        f.setModelNumber(modelNumber);
        f.setSeats(seats);
        
        Car g = carList.addNewCars(manufacturerName="Hyundai",manufacturerYear="2008",seats=7,serialNumber="MKU12U",modelNumber="Elantra",city="San Jose",expiryDate="2038",avail="no");
        g.setAvailability(avail);
        g.setCarNumber(serialNumber);
        g.setCity(city);
        g.setExpiryCertificate(expiryDate);
        g.setManufacturedYear(Integer.parseInt(manufacturerYear));
        g.setLastUpdate(expiryDate);
        g.setManufacturer(manufacturerName);
        g.setModelNumber(modelNumber);
        g.setSeats(seats);
        
        Car h = carList.addNewCars(manufacturerName="Hyundai",manufacturerYear="2021",seats=3,serialNumber="KP12UI",modelNumber="Equus",city="San Diego",expiryDate="2060",avail="yes");
        h.setAvailability(avail);
        h.setCarNumber(serialNumber);
        h.setCity(city);
        h.setExpiryCertificate(expiryDate);
        h.setManufacturedYear(Integer.parseInt(manufacturerYear));
        h.setLastUpdate(expiryDate);
        h.setManufacturer(manufacturerName);
        h.setModelNumber(modelNumber);
        h.setSeats(seats);
        
        Car i = carList.addNewCars(manufacturerName="Jaguar",manufacturerYear="1997",seats=4,serialNumber="PLM987",modelNumber="XJR",city="Chicago",expiryDate="2030",avail="yes");
        i.setAvailability(avail);
        i.setCarNumber(serialNumber);
        i.setCity(city);
        i.setExpiryCertificate(expiryDate);
        i.setManufacturedYear(Integer.parseInt(manufacturerYear));
        i.setLastUpdate(expiryDate);
        i.setManufacturer(manufacturerName);
        i.setModelNumber(modelNumber);
        i.setSeats(seats);
        
        Car j = carList.addNewCars(manufacturerName="Lexus",manufacturerYear="2004",seats=5,serialNumber="123OUN",modelNumber="RX",city="Chicago",expiryDate="2032",avail="yes");
        j.setAvailability(avail);
        j.setCarNumber(serialNumber);
        j.setCity(city);
        j.setExpiryCertificate(expiryDate);
        j.setManufacturedYear(Integer.parseInt(manufacturerYear));
        j.setLastUpdate(expiryDate);
        j.setManufacturer(manufacturerName);
        j.setModelNumber(modelNumber);
        j.setSeats(seats);
        
        Car k = carList.addNewCars(manufacturerName="Honda",manufacturerYear="2019",seats=4,serialNumber="TRWE12",modelNumber="Accord",city="San Jose",expiryDate="2028",avail="no");
        k.setAvailability(avail);
        k.setCarNumber(serialNumber);
        k.setCity(city);
        k.setExpiryCertificate(expiryDate);
        k.setManufacturedYear(Integer.parseInt(manufacturerYear));
        k.setLastUpdate(expiryDate);
        k.setManufacturer(manufacturerName);
        k.setModelNumber(modelNumber);
        k.setSeats(seats);
        
        Car l = carList.addNewCars(manufacturerName="BMW",manufacturerYear="2019",seats=2,serialNumber="B76YT1",modelNumber="M3",city="LA",expiryDate="2031",avail="no");
        l.setAvailability(avail);
        l.setCarNumber(serialNumber);
        l.setCity(city);
        l.setExpiryCertificate(expiryDate);
        l.setManufacturedYear(Integer.parseInt(manufacturerYear));
        l.setLastUpdate(expiryDate);
        l.setManufacturer(manufacturerName);
        l.setModelNumber(modelNumber);
        l.setSeats(seats);
        
        Car m = carList.addNewCars(manufacturerName="Tesla",manufacturerYear="2000",seats=1,serialNumber="TES091",modelNumber="Model Y",city="Chicago",expiryDate="2025",avail="yes");
        m.setAvailability(avail);
        m.setCarNumber(serialNumber);
        m.setCity(city);
        m.setExpiryCertificate(expiryDate);
        m.setManufacturedYear(Integer.parseInt(manufacturerYear));
        m.setLastUpdate(expiryDate);
        m.setManufacturer(manufacturerName);
        m.setModelNumber(modelNumber);
        m.setSeats(seats);
        
        Car n = carList.addNewCars(manufacturerName="Dodge",manufacturerYear="2021",seats=7,serialNumber="XZTR12",modelNumber="Avenger",city="Boston",expiryDate="2060",avail="yes");
        n.setAvailability(avail);
        n.setCarNumber(serialNumber);
        n.setCity(city);
        n.setExpiryCertificate(expiryDate);
        n.setManufacturedYear(Integer.parseInt(manufacturerYear));
        n.setLastUpdate(expiryDate);
        n.setManufacturer(manufacturerName);
        n.setModelNumber(modelNumber);
        n.setSeats(seats);
        
        Car o = carList.addNewCars(manufacturerName="Chevrolet",manufacturerYear="2011",seats=6,serialNumber="UI2319",modelNumber="Astra",city="Boston",expiryDate="2050",avail="no");
        o.setAvailability(avail);
        o.setCarNumber(serialNumber);
        o.setCity(city);
        o.setExpiryCertificate(expiryDate);
        o.setManufacturedYear(Integer.parseInt(manufacturerYear));
        o.setLastUpdate(expiryDate);
        o.setManufacturer(manufacturerName);
        o.setModelNumber(modelNumber);
        o.setSeats(seats);
        
        Car p = carList.addNewCars(manufacturerName="BMW",manufacturerYear="2014",seats=4,serialNumber="PO12QW",modelNumber="3-series",city="Dallas",expiryDate="2040",avail="no");
        p.setAvailability(avail);
        p.setCarNumber(serialNumber);
        p.setCity(city);
        p.setExpiryCertificate(expiryDate);
        p.setManufacturedYear(Integer.parseInt(manufacturerYear));
        p.setLastUpdate(expiryDate);
        p.setManufacturer(manufacturerName);
        p.setModelNumber(modelNumber);
        p.setSeats(seats);
        
        Car q = carList.addNewCars(manufacturerName="Honda",manufacturerYear="2019",seats=2,serialNumber="CB12IO",modelNumber="CRV",city="Dallas",expiryDate="2040",avail="no");
        q.setAvailability(avail);
        q.setCarNumber(serialNumber);
        q.setCity(city);
        q.setExpiryCertificate(expiryDate);
        q.setManufacturedYear(Integer.parseInt(manufacturerYear));
        q.setLastUpdate(expiryDate);
        q.setManufacturer(manufacturerName);
        q.setModelNumber(modelNumber);
        q.setSeats(seats);
        
        Car r = carList.addNewCars(manufacturerName="Honda",manufacturerYear="1990",seats=7,serialNumber="CAL123",modelNumber="Civic",city="San Jose",expiryDate="2015",avail="yes");
        r.setAvailability(avail);
        r.setCarNumber(serialNumber);
        r.setCity(city);
        r.setExpiryCertificate(expiryDate);
        r.setManufacturedYear(Integer.parseInt(manufacturerYear));
        r.setLastUpdate(expiryDate);
        r.setManufacturer(manufacturerName);
        r.setModelNumber(modelNumber);
        r.setSeats(seats);
        
        Car s = carList.addNewCars(manufacturerName="Tesla",manufacturerYear="2010",seats=5,serialNumber="AAAA12",modelNumber="Model 3",city="New York",expiryDate="2030",avail="no");
        s.setAvailability(avail);
        s.setCarNumber(serialNumber);
        s.setCity(city);
        s.setExpiryCertificate(expiryDate);
        s.setManufacturedYear(Integer.parseInt(manufacturerYear));
        s.setLastUpdate(expiryDate);
        s.setManufacturer(manufacturerName);
        s.setModelNumber(modelNumber);
        s.setSeats(seats);
        
        
    }
}
