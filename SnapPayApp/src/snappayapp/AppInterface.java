
package snappayapp;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class AppInterface extends javax.swing.JFrame {
        
         private double accountBalanceValue = 12000.00;

        public AppInterface() {
                initComponents();
                listHistoryTable.getColumnModel().getColumn(0).setPreferredWidth(270);


                 updateAccountBalanceLabel();

        }

         private void updateAccountBalanceLabel() {
        accountBalance.setText(String.format("%,.2f", accountBalanceValue));
        }

        class JPanelGradient extends JPanel {
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        Color color1 = new Color(52, 143, 80);
        Color color2 = new Color(86, 180, 211);
        GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
         }
        }
        
        class JPanelGradient1 extends JPanel {
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        Color color1 = new Color(58, 150, 105);
        Color color2 = new Color(86, 160, 140);
        GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
         }
        }

        class JPanelGradient2 extends JPanel {
        protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();
        Color color1 = new Color(64, 156, 128);
        Color color2 = new Color(86, 180, 211);
        GradientPaint gp = new GradientPaint(0, 0, color1, 180, height, color2);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, width, height);
         }
        }

        public void switchToTab(int tabIndex) {
        snapTabs.setSelectedIndex(tabIndex);
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new JPanelGradient();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jPanel4 = new JPanelGradient();
                snapTabs = new javax.swing.JTabbedPane();
                billTab0 = new javax.swing.JPanel();
                internetTab6 = new javax.swing.JLabel();
                electricityTab4 = new javax.swing.JLabel();
                waterTab5 = new javax.swing.JLabel();
                schoolTab7 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                sendTab1 = new javax.swing.JPanel();
                sendAmount = new javax.swing.JTextField();
                jLabel15 = new javax.swing.JLabel();
                jLabel16 = new javax.swing.JLabel();
                sendMobileNumber = new javax.swing.JTextField();
                jLabel41 = new javax.swing.JLabel();
                jLabel7 = new javax.swing.JLabel();
                sendMoneyBtn = new javax.swing.JButton();
                saveTab2 = new javax.swing.JPanel();
                jLabel26 = new javax.swing.JLabel();
                jLabel27 = new javax.swing.JLabel();
                shopingTab3 = new javax.swing.JPanel();
                jLabel46 = new javax.swing.JLabel();
                jLabel47 = new javax.swing.JLabel();
                billElectricityTab4 = new javax.swing.JPanel();
                jLabel17 = new javax.swing.JLabel();
                electricityFullAddress = new javax.swing.JTextField();
                jLabel18 = new javax.swing.JLabel();
                electricityAmount = new javax.swing.JTextField();
                jLabel19 = new javax.swing.JLabel();
                electricityCompanyName = new javax.swing.JTextField();
                address = new javax.swing.JLabel();
                electricityEmailAddress = new javax.swing.JTextField();
                jLabel8 = new javax.swing.JLabel();
                payElectricityBtn = new javax.swing.JButton();
                jLabel23 = new javax.swing.JLabel();
                electricityCustomerName = new javax.swing.JTextField();
                electricityHouseNumber = new javax.swing.JTextField();
                address5 = new javax.swing.JLabel();
                address6 = new javax.swing.JLabel();
                billWaterTab5 = new javax.swing.JPanel();
                jLabel20 = new javax.swing.JLabel();
                waterCompanyName = new javax.swing.JTextField();
                jLabel30 = new javax.swing.JLabel();
                waterCustomerName = new javax.swing.JTextField();
                address1 = new javax.swing.JLabel();
                jLabel31 = new javax.swing.JLabel();
                waterAmount = new javax.swing.JTextField();
                waterFullAddress = new javax.swing.JTextField();
                payWaterBtn = new javax.swing.JButton();
                jLabel32 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                billInternetTab6 = new javax.swing.JPanel();
                jLabel33 = new javax.swing.JLabel();
                internetCompanyName = new javax.swing.JTextField();
                jLabel34 = new javax.swing.JLabel();
                jLabel35 = new javax.swing.JLabel();
                internetCustomerName = new javax.swing.JTextField();
                address2 = new javax.swing.JLabel();
                internetEmailAddress = new javax.swing.JTextField();
                jLabel36 = new javax.swing.JLabel();
                internetAmount = new javax.swing.JTextField();
                payInternetBtn = new javax.swing.JButton();
                jLabel9 = new javax.swing.JLabel();
                internetFullAddress = new javax.swing.JTextField();
                jLabel45 = new javax.swing.JLabel();
                billSchoolTab7 = new javax.swing.JPanel();
                jLabel37 = new javax.swing.JLabel();
                schoolName = new javax.swing.JTextField();
                jLabel38 = new javax.swing.JLabel();
                jLabel39 = new javax.swing.JLabel();
                studentName = new javax.swing.JTextField();
                address3 = new javax.swing.JLabel();
                studentEmailAddress = new javax.swing.JTextField();
                jLabel40 = new javax.swing.JLabel();
                schoolAmount = new javax.swing.JTextField();
                paySchoolBtn = new javax.swing.JButton();
                jLabel42 = new javax.swing.JLabel();
                types = new javax.swing.JComboBox<>();
                jLabel43 = new javax.swing.JLabel();
                jLabel44 = new javax.swing.JLabel();
                studentNumber = new javax.swing.JTextField();
                studentMobileNumber = new javax.swing.JTextField();
                address4 = new javax.swing.JLabel();
                jPanel5 = new JPanelGradient1();
                jPanel8 = new javax.swing.JPanel();
                saveMoney = new javax.swing.JLabel();
                sendMoney = new javax.swing.JLabel();
                eShoping = new javax.swing.JLabel();
                payBills = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jPanel6 = new JPanelGradient2();
                jPanel7 = new javax.swing.JPanel();
                jPanel2 = new javax.swing.JPanel();
                jPanel3 = new javax.swing.JPanel();
                jPanel9 = new javax.swing.JPanel();
                jPanel10 = new javax.swing.JPanel();
                jLabel22 = new javax.swing.JLabel();
                jLabel24 = new javax.swing.JLabel();
                accountBalance = new javax.swing.JLabel();
                jLabel21 = new javax.swing.JLabel();
                jLabel25 = new javax.swing.JLabel();
                jPanel11 = new javax.swing.JPanel();
                listHistoryScroll = new javax.swing.JScrollPane();
                listHistoryTable = new javax.swing.JTable();
                jLabel29 = new javax.swing.JLabel();
                jLabel28 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);
                setResizable(false);
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel1.setBackground(new java.awt.Color(240, 239, 239));
                jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setText("Snap Pay");
                jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

                jLabel2.setFont(new java.awt.Font("Eras Bold ITC", 1, 48)); // NOI18N
                jLabel2.setForeground(new java.awt.Color(62, 153, 229));
                jLabel2.setText("Snap Pay");
                jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, -1, -1));

                jPanel4.setBackground(new java.awt.Color(240, 239, 239));
                jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
                jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                billTab0.setBackground(new java.awt.Color(255, 255, 255));

                internetTab6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/wifi (1).png"))); // NOI18N
                internetTab6.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                internetTab6MouseClicked(evt);
                        }
                });

                electricityTab4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/flash (1).png"))); // NOI18N
                electricityTab4.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                electricityTab4MouseClicked(evt);
                        }
                });

                waterTab5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/drop (1).png"))); // NOI18N
                waterTab5.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                waterTab5MouseClicked(evt);
                        }
                });

                schoolTab7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/school (1).png"))); // NOI18N
                schoolTab7.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                schoolTab7MouseClicked(evt);
                        }
                });

                jLabel11.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel11.setForeground(new java.awt.Color(44, 44, 44));
                jLabel11.setText("School");

                jLabel12.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel12.setForeground(new java.awt.Color(44, 44, 44));
                jLabel12.setText("Electricity");

                jLabel13.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel13.setForeground(new java.awt.Color(44, 44, 44));
                jLabel13.setText("Water");

                jLabel14.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(44, 44, 44));
                jLabel14.setText("Internet");

                javax.swing.GroupLayout billTab0Layout = new javax.swing.GroupLayout(billTab0);
                billTab0.setLayout(billTab0Layout);
                billTab0Layout.setHorizontalGroup(
                        billTab0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(billTab0Layout.createSequentialGroup()
                                .addGroup(billTab0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(billTab0Layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(electricityTab4)
                                                .addGap(60, 60, 60)
                                                .addComponent(waterTab5)
                                                .addGap(60, 60, 60)
                                                .addComponent(internetTab6)
                                                .addGap(50, 50, 50)
                                                .addComponent(schoolTab7))
                                        .addGroup(billTab0Layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addComponent(jLabel12)
                                                .addGap(121, 121, 121)
                                                .addComponent(jLabel13)
                                                .addGap(121, 121, 121)
                                                .addComponent(jLabel14)
                                                .addGap(107, 107, 107)
                                                .addComponent(jLabel11)))
                                .addGap(30, 30, 30))
                );
                billTab0Layout.setVerticalGroup(
                        billTab0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(billTab0Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(billTab0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(electricityTab4)
                                        .addComponent(waterTab5)
                                        .addComponent(internetTab6)
                                        .addComponent(schoolTab7))
                                .addGap(20, 20, 20)
                                .addGroup(billTab0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel11))
                                .addGap(360, 360, 360))
                );

                snapTabs.addTab("payBillsTab", billTab0);

                sendTab1.setBackground(new java.awt.Color(255, 255, 255));
                sendTab1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                sendAmount.setBackground(new java.awt.Color(255, 255, 255));
                sendAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                sendAmount.setForeground(new java.awt.Color(0, 0, 0));
                sendAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                sendTab1.add(sendAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 120, -1));

                jLabel15.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(44, 44, 44));
                jLabel15.setText("Amount");
                sendTab1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

                jLabel16.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel16.setForeground(new java.awt.Color(44, 44, 44));
                jLabel16.setText("Mobile Number");
                sendTab1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

                sendMobileNumber.setBackground(new java.awt.Color(255, 255, 255));
                sendMobileNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                sendMobileNumber.setForeground(new java.awt.Color(0, 0, 0));
                sendMobileNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                sendTab1.add(sendMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 240, -1));

                jLabel41.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
                jLabel41.setForeground(new java.awt.Color(30, 127, 205));
                jLabel41.setText("Send Money");
                sendTab1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 220, 40));

                jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/23590410-1.jpg"))); // NOI18N
                jLabel7.setText("jLabel7");
                sendTab1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 300, 110));

                sendMoneyBtn.setBackground(new java.awt.Color(62, 153, 229));
                sendMoneyBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
                sendMoneyBtn.setForeground(new java.awt.Color(255, 255, 255));
                sendMoneyBtn.setText("Send");
                sendMoneyBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
                sendMoneyBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                sendMoneyBtnActionPerformed(evt);
                        }
                });
                sendTab1.add(sendMoneyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 100, 40));

                snapTabs.addTab("send MoneyTab", sendTab1);

                saveTab2.setBackground(new java.awt.Color(255, 255, 255));
                saveTab2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel26.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
                jLabel26.setForeground(new java.awt.Color(158, 158, 158));
                jLabel26.setText("This Page is Not Ready Yet. Please visit again soon.");
                saveTab2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

                jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/Picsart-24-06-12-01-20-24-350.png"))); // NOI18N
                saveTab2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 50, 50));

                snapTabs.addTab("saveMoneyTab", saveTab2);

                shopingTab3.setBackground(new java.awt.Color(255, 255, 255));
                shopingTab3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/Picsart-24-06-12-01-20-24-350.png"))); // NOI18N
                shopingTab3.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 50, 50));

                jLabel47.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
                jLabel47.setForeground(new java.awt.Color(158, 158, 158));
                jLabel47.setText("This Page is Not Ready Yet. Please visit again soon.");
                shopingTab3.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, -1));

                snapTabs.addTab("eShopingTab", shopingTab3);

                billElectricityTab4.setBackground(new java.awt.Color(255, 255, 255));
                billElectricityTab4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel17.setForeground(new java.awt.Color(44, 44, 44));
                jLabel17.setText("Customer Name");
                billElectricityTab4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

                electricityFullAddress.setBackground(new java.awt.Color(255, 255, 255));
                electricityFullAddress.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                electricityFullAddress.setForeground(new java.awt.Color(0, 0, 0));
                electricityFullAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billElectricityTab4.add(electricityFullAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 320, -1));

                jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel18.setForeground(new java.awt.Color(44, 44, 44));
                jLabel18.setText("Amount");
                billElectricityTab4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

                electricityAmount.setBackground(new java.awt.Color(255, 255, 255));
                electricityAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                electricityAmount.setForeground(new java.awt.Color(0, 0, 0));
                electricityAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billElectricityTab4.add(electricityAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 120, -1));

                jLabel19.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel19.setForeground(new java.awt.Color(44, 44, 44));
                jLabel19.setText("Company Name");
                billElectricityTab4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

                electricityCompanyName.setBackground(new java.awt.Color(255, 255, 255));
                electricityCompanyName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                electricityCompanyName.setForeground(new java.awt.Color(0, 0, 0));
                electricityCompanyName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billElectricityTab4.add(electricityCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 320, -1));

                address.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                address.setForeground(new java.awt.Color(44, 44, 44));
                address.setText("House Number");
                billElectricityTab4.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

                electricityEmailAddress.setBackground(new java.awt.Color(255, 255, 255));
                electricityEmailAddress.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                electricityEmailAddress.setForeground(new java.awt.Color(0, 0, 0));
                electricityEmailAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billElectricityTab4.add(electricityEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 320, -1));

                jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/electricity-bill-summer-1 (1).jpg"))); // NOI18N
                billElectricityTab4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, 110));

                payElectricityBtn.setBackground(new java.awt.Color(62, 153, 229));
                payElectricityBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
                payElectricityBtn.setForeground(new java.awt.Color(255, 255, 255));
                payElectricityBtn.setText("Pay Now");
                payElectricityBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
                payElectricityBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                payElectricityBtnActionPerformed(evt);
                        }
                });
                billElectricityTab4.add(payElectricityBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 100, 40));

                jLabel23.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
                jLabel23.setForeground(new java.awt.Color(30, 127, 205));
                jLabel23.setText("Electricity Bill");
                billElectricityTab4.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 250, 30));

                electricityCustomerName.setBackground(new java.awt.Color(255, 255, 255));
                electricityCustomerName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                electricityCustomerName.setForeground(new java.awt.Color(0, 0, 0));
                electricityCustomerName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billElectricityTab4.add(electricityCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 320, -1));

                electricityHouseNumber.setBackground(new java.awt.Color(255, 255, 255));
                electricityHouseNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                electricityHouseNumber.setForeground(new java.awt.Color(0, 0, 0));
                electricityHouseNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billElectricityTab4.add(electricityHouseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 320, -1));

                address5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                address5.setForeground(new java.awt.Color(44, 44, 44));
                address5.setText("Email Address");
                billElectricityTab4.add(address5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

                address6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                address6.setForeground(new java.awt.Color(44, 44, 44));
                address6.setText("Full Address");
                billElectricityTab4.add(address6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

                snapTabs.addTab("billTab", billElectricityTab4);

                billWaterTab5.setBackground(new java.awt.Color(255, 255, 255));
                billWaterTab5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel20.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel20.setForeground(new java.awt.Color(44, 44, 44));
                jLabel20.setText("Company Name");
                billWaterTab5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

                waterCompanyName.setBackground(new java.awt.Color(255, 255, 255));
                waterCompanyName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                waterCompanyName.setForeground(new java.awt.Color(0, 0, 0));
                waterCompanyName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billWaterTab5.add(waterCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 320, -1));

                jLabel30.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel30.setForeground(new java.awt.Color(44, 44, 44));
                jLabel30.setText("Customer Name");
                billWaterTab5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

                waterCustomerName.setBackground(new java.awt.Color(255, 255, 255));
                waterCustomerName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                waterCustomerName.setForeground(new java.awt.Color(0, 0, 0));
                waterCustomerName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billWaterTab5.add(waterCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 320, -1));

                address1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                address1.setForeground(new java.awt.Color(44, 44, 44));
                address1.setText("Full Address");
                billWaterTab5.add(address1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

                jLabel31.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel31.setForeground(new java.awt.Color(44, 44, 44));
                jLabel31.setText("Amount");
                billWaterTab5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

                waterAmount.setBackground(new java.awt.Color(255, 255, 255));
                waterAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                waterAmount.setForeground(new java.awt.Color(0, 0, 0));
                waterAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billWaterTab5.add(waterAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 120, -1));

                waterFullAddress.setBackground(new java.awt.Color(255, 255, 255));
                waterFullAddress.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                waterFullAddress.setForeground(new java.awt.Color(0, 0, 0));
                waterFullAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billWaterTab5.add(waterFullAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 320, -1));

                payWaterBtn.setBackground(new java.awt.Color(62, 153, 229));
                payWaterBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
                payWaterBtn.setForeground(new java.awt.Color(255, 255, 255));
                payWaterBtn.setText("Pay Now");
                payWaterBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
                payWaterBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                payWaterBtnActionPerformed(evt);
                        }
                });
                billWaterTab5.add(payWaterBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 100, 40));

                jLabel32.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
                jLabel32.setForeground(new java.awt.Color(30, 127, 205));
                jLabel32.setText("Water Bill");
                billWaterTab5.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 180, 30));

                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/save-money-your-water-bills-save.jpg"))); // NOI18N
                billWaterTab5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 220, 110));

                snapTabs.addTab("tab6", billWaterTab5);

                billInternetTab6.setBackground(new java.awt.Color(255, 255, 255));
                billInternetTab6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel33.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
                jLabel33.setForeground(new java.awt.Color(30, 127, 205));
                jLabel33.setText("Internet Bill");
                billInternetTab6.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, 30));

                internetCompanyName.setBackground(new java.awt.Color(255, 255, 255));
                internetCompanyName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                internetCompanyName.setForeground(new java.awt.Color(0, 0, 0));
                internetCompanyName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billInternetTab6.add(internetCompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 320, -1));

                jLabel34.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel34.setForeground(new java.awt.Color(44, 44, 44));
                jLabel34.setText("Company Name");
                billInternetTab6.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

                jLabel35.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel35.setForeground(new java.awt.Color(44, 44, 44));
                jLabel35.setText("Full Address");
                billInternetTab6.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

                internetCustomerName.setBackground(new java.awt.Color(255, 255, 255));
                internetCustomerName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                internetCustomerName.setForeground(new java.awt.Color(0, 0, 0));
                internetCustomerName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billInternetTab6.add(internetCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 320, -1));

                address2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                address2.setForeground(new java.awt.Color(44, 44, 44));
                address2.setText("Email Address");
                billInternetTab6.add(address2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

                internetEmailAddress.setBackground(new java.awt.Color(255, 255, 255));
                internetEmailAddress.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                internetEmailAddress.setForeground(new java.awt.Color(0, 0, 0));
                internetEmailAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billInternetTab6.add(internetEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 320, -1));

                jLabel36.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel36.setForeground(new java.awt.Color(44, 44, 44));
                jLabel36.setText("Amount");
                billInternetTab6.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

                internetAmount.setBackground(new java.awt.Color(255, 255, 255));
                internetAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                internetAmount.setForeground(new java.awt.Color(0, 0, 0));
                internetAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billInternetTab6.add(internetAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 120, -1));

                payInternetBtn.setBackground(new java.awt.Color(62, 153, 229));
                payInternetBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
                payInternetBtn.setForeground(new java.awt.Color(255, 255, 255));
                payInternetBtn.setText("Pay Now");
                payInternetBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
                payInternetBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                payInternetBtnActionPerformed(evt);
                        }
                });
                billInternetTab6.add(payInternetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 100, 40));

                jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/save-money-your-internet-bills-s.jpg"))); // NOI18N
                billInternetTab6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 220, 110));

                internetFullAddress.setBackground(new java.awt.Color(255, 255, 255));
                internetFullAddress.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                internetFullAddress.setForeground(new java.awt.Color(0, 0, 0));
                internetFullAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billInternetTab6.add(internetFullAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 320, -1));

                jLabel45.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel45.setForeground(new java.awt.Color(44, 44, 44));
                jLabel45.setText("Customer Name");
                billInternetTab6.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

                snapTabs.addTab("tab7", billInternetTab6);

                billSchoolTab7.setBackground(new java.awt.Color(255, 255, 255));
                billSchoolTab7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel37.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
                jLabel37.setForeground(new java.awt.Color(30, 127, 205));
                jLabel37.setText("School Bill");
                billSchoolTab7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 190, 30));

                schoolName.setBackground(new java.awt.Color(255, 255, 255));
                schoolName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                schoolName.setForeground(new java.awt.Color(0, 0, 0));
                schoolName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billSchoolTab7.add(schoolName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 320, -1));

                jLabel38.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel38.setForeground(new java.awt.Color(44, 44, 44));
                jLabel38.setText("Student Number");
                billSchoolTab7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

                jLabel39.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel39.setForeground(new java.awt.Color(44, 44, 44));
                jLabel39.setText("Student Name");
                billSchoolTab7.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

                studentName.setBackground(new java.awt.Color(255, 255, 255));
                studentName.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                studentName.setForeground(new java.awt.Color(0, 0, 0));
                studentName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billSchoolTab7.add(studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 320, -1));

                address3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                address3.setForeground(new java.awt.Color(44, 44, 44));
                address3.setText("Email Address");
                billSchoolTab7.add(address3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, -1, -1));

                studentEmailAddress.setBackground(new java.awt.Color(255, 255, 255));
                studentEmailAddress.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                studentEmailAddress.setForeground(new java.awt.Color(0, 0, 0));
                studentEmailAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billSchoolTab7.add(studentEmailAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 380, 320, -1));

                jLabel40.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel40.setForeground(new java.awt.Color(44, 44, 44));
                jLabel40.setText("Amount");
                billSchoolTab7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

                schoolAmount.setBackground(new java.awt.Color(255, 255, 255));
                schoolAmount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                schoolAmount.setForeground(new java.awt.Color(0, 0, 0));
                schoolAmount.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billSchoolTab7.add(schoolAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 120, -1));

                paySchoolBtn.setBackground(new java.awt.Color(62, 153, 229));
                paySchoolBtn.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 18)); // NOI18N
                paySchoolBtn.setForeground(new java.awt.Color(255, 255, 255));
                paySchoolBtn.setText("Pay Now");
                paySchoolBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 204, 255), new java.awt.Color(153, 204, 255), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
                paySchoolBtn.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                paySchoolBtnActionPerformed(evt);
                        }
                });
                billSchoolTab7.add(paySchoolBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 100, 40));

                jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/893-generated.jpg"))); // NOI18N
                billSchoolTab7.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 300, 100));

                types.setBackground(new java.awt.Color(255, 255, 255));
                types.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                types.setForeground(new java.awt.Color(44, 44, 44));
                types.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tuition Feee", "Applicaiton Fee", "Graduation Fee" }));
                types.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billSchoolTab7.add(types, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 320, 34));

                jLabel43.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel43.setForeground(new java.awt.Color(44, 44, 44));
                jLabel43.setText("School Name");
                billSchoolTab7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

                jLabel44.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                jLabel44.setForeground(new java.awt.Color(44, 44, 44));
                jLabel44.setText("Type");
                billSchoolTab7.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

                studentNumber.setBackground(new java.awt.Color(255, 255, 255));
                studentNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                studentNumber.setForeground(new java.awt.Color(0, 0, 0));
                studentNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billSchoolTab7.add(studentNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, 320, -1));

                studentMobileNumber.setBackground(new java.awt.Color(255, 255, 255));
                studentMobileNumber.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                studentMobileNumber.setForeground(new java.awt.Color(0, 0, 0));
                studentMobileNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(122, 138, 153)));
                billSchoolTab7.add(studentMobileNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 320, -1));

                address4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
                address4.setForeground(new java.awt.Color(44, 44, 44));
                address4.setText("Mobile Number");
                billSchoolTab7.add(address4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

                snapTabs.addTab("tab8", billSchoolTab7);

                jPanel4.add(snapTabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -30, 720, 580));

                jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 690, 540));

                jPanel5.setBackground(new java.awt.Color(240, 239, 239));
                jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
                jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel8.setBackground(new java.awt.Color(255, 255, 255));

                saveMoney.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/save-time-1.png"))); // NOI18N
                saveMoney.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                saveMoneyMouseClicked(evt);
                        }
                });

                sendMoney.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/money-transfer-1.png"))); // NOI18N
                sendMoney.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                sendMoneyMouseClicked(evt);
                        }
                });

                eShoping.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/shopping (1).png"))); // NOI18N
                eShoping.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                eShopingMouseClicked(evt);
                        }
                });

                payBills.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/bill (1).png"))); // NOI18N
                payBills.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                payBillsMouseClicked(evt);
                        }
                });

                jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(30, 127, 205));
                jLabel4.setText("Pay Bills");

                jLabel5.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(30, 127, 205));
                jLabel5.setText("Send");

                jLabel6.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(30, 127, 205));
                jLabel6.setText("Save");

                jLabel3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
                jLabel3.setForeground(new java.awt.Color(30, 127, 205));
                jLabel3.setText("Shoping");

                javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
                jPanel8.setLayout(jPanel8Layout);
                jPanel8Layout.setHorizontalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(payBills, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addGap(127, 127, 127)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sendMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel5)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(saveMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel6)))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(eShoping, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel3)))
                                .addGap(49, 49, 49))
                );
                jPanel8Layout.setVerticalGroup(
                        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(sendMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel5))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addComponent(payBills, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4))
                                        .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(saveMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eShoping, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel3))))
                                .addContainerGap(9, Short.MAX_VALUE))
                );

                jPanel5.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 670, 100));

                jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 690, 100));

                jPanel6.setBackground(new java.awt.Color(240, 239, 239));
                jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 20, true));
                jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel7.setBackground(new java.awt.Color(255, 255, 255));
                jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel2.setBackground(new java.awt.Color(255, 255, 255));
                jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(62, 153, 229), 20, true));
                jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel3.setBackground(new java.awt.Color(62, 153, 229));
                jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel9.setBackground(new java.awt.Color(62, 153, 229));
                jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
                jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel10.setBackground(new java.awt.Color(255, 255, 255));
                jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel22.setFont(new java.awt.Font("Eras Demi ITC", 1, 24)); // NOI18N
                jLabel22.setForeground(new java.awt.Color(30, 127, 205));
                jLabel22.setText("PHP");
                jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 50, 30));

                jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 70, 30));

                jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 50));

                jLabel24.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
                jLabel24.setForeground(new java.awt.Color(255, 255, 255));
                jLabel24.setText("₱.");
                jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 56, -1, 90));

                accountBalance.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 48)); // NOI18N
                accountBalance.setForeground(new java.awt.Color(255, 255, 255));
                jPanel3.add(accountBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 76, 210, 50));

                jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 390, 180));

                jPanel7.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 390, 200));

                jLabel21.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
                jLabel21.setForeground(new java.awt.Color(30, 127, 205));
                jLabel21.setText("Shoping");
                jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, -1, -1));

                jLabel25.setFont(new java.awt.Font("Myanmar Text", 1, 18)); // NOI18N
                jLabel25.setForeground(new java.awt.Color(30, 127, 205));
                jLabel25.setText("History");
                jPanel7.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, 30));

                jPanel11.setBackground(new java.awt.Color(255, 255, 255));

                javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 440, Short.MAX_VALUE)
                );
                jPanel11Layout.setVerticalGroup(
                        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 15, Short.MAX_VALUE)
                );

                jPanel7.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 440, 15));

                listHistoryScroll.setBackground(new java.awt.Color(255, 255, 255));
                listHistoryScroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 0));
                listHistoryScroll.setForeground(new java.awt.Color(255, 255, 255));
                listHistoryScroll.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

                listHistoryTable.setBackground(new java.awt.Color(255, 255, 255));
                listHistoryTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 255), 0));
                listHistoryTable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                listHistoryTable.setForeground(new java.awt.Color(62, 153, 229));
                listHistoryTable.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "", ""
                        }
                ) {
                        boolean[] canEdit = new boolean [] {
                                false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                listHistoryTable.setFocusable(false);
                listHistoryTable.setGridColor(new java.awt.Color(255, 255, 255));
                listHistoryTable.setRowHeight(30);
                listHistoryTable.setSelectionBackground(new java.awt.Color(212, 232, 254));
                listHistoryTable.setSelectionForeground(new java.awt.Color(62, 153, 229));
                listHistoryTable.setShowGrid(false);
                listHistoryScroll.setViewportView(listHistoryTable);

                jPanel7.add(listHistoryScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 390, 330));

                jLabel29.setFont(new java.awt.Font("Eras Demi ITC", 1, 36)); // NOI18N
                jLabel29.setForeground(new java.awt.Color(30, 127, 205));
                jLabel29.setText("Balance");
                jPanel7.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 150, 30));

                jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 470, 640));

                jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 470, 660));

                jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snapassets/Picsart-24-06-12-02-06-23-792.png"))); // NOI18N
                jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 60));

                getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1215, 797));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void payBillsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_payBillsMouseClicked
              snapTabs.setSelectedIndex(0);

        }//GEN-LAST:event_payBillsMouseClicked

        private void sendMoneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sendMoneyMouseClicked
              snapTabs.setSelectedIndex(1);

        }//GEN-LAST:event_sendMoneyMouseClicked

        private void saveMoneyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMoneyMouseClicked
              snapTabs.setSelectedIndex(2);

        }//GEN-LAST:event_saveMoneyMouseClicked

        private void eShopingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eShopingMouseClicked
              snapTabs.setSelectedIndex(3);

        }//GEN-LAST:event_eShopingMouseClicked

        private void electricityTab4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_electricityTab4MouseClicked
               snapTabs.setSelectedIndex(4);

        }//GEN-LAST:event_electricityTab4MouseClicked

        private void waterTab5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_waterTab5MouseClicked
               snapTabs.setSelectedIndex(5); 

        }//GEN-LAST:event_waterTab5MouseClicked

        private void internetTab6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_internetTab6MouseClicked
               snapTabs.setSelectedIndex(6); 

        }//GEN-LAST:event_internetTab6MouseClicked

        private void schoolTab7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_schoolTab7MouseClicked
               snapTabs.setSelectedIndex(7);  

        }//GEN-LAST:event_schoolTab7MouseClicked

        private void payElectricityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payElectricityBtnActionPerformed
         // Retrieve and parse the electricity amount
        double electricityAmountValue = Double.parseDouble(electricityAmount.getText());

        // Deduct the electricity amount from the account balance
        accountBalanceValue -= electricityAmountValue;

        // Update the account balance JLabel
        updateAccountBalanceLabel();

        // Add the transaction to the history table
        DefaultTableModel model = (DefaultTableModel) listHistoryTable.getModel();
        model.addRow(new Object[]{"Electricity Bill", String.format("- %.2f", electricityAmountValue)});

        // Clear the text fields
        electricityCompanyName.setText("");
        electricityCustomerName.setText("");
        electricityHouseNumber.setText("");
        electricityEmailAddress.setText("");
        electricityFullAddress.setText("");
        electricityAmount.setText("");
        }//GEN-LAST:event_payElectricityBtnActionPerformed

        private void payWaterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payWaterBtnActionPerformed
         // Retrieve and parse the electricity amount
        double waterAmountValue = Double.parseDouble(waterAmount.getText());

        // Deduct the electricity amount from the account balance
        accountBalanceValue -= waterAmountValue;

        // Update the account balance JLabel
        updateAccountBalanceLabel();

        // Add the transaction to the history table
        DefaultTableModel model = (DefaultTableModel) listHistoryTable.getModel();
        model.addRow(new Object[]{"Water Bill", String.format("- %.2f", waterAmountValue)});

        // Clear the text fields
        waterCompanyName.setText("");
        waterCustomerName.setText("");
        waterFullAddress.setText("");
        waterAmount.setText("");

        }//GEN-LAST:event_payWaterBtnActionPerformed

        private void payInternetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payInternetBtnActionPerformed
         // Retrieve and parse the electricity amount
        double internetAmountValue = Double.parseDouble(internetAmount.getText());

        // Deduct the electricity amount from the account balance
        accountBalanceValue -= internetAmountValue;

        // Update the account balance JLabel
        updateAccountBalanceLabel();

        // Add the transaction to the history table
        DefaultTableModel model = (DefaultTableModel) listHistoryTable.getModel();
        model.addRow(new Object[]{"Internet Bill", String.format("- %.2f", internetAmountValue)});

        // Clear the text fields
        internetCompanyName.setText("");
        internetCustomerName.setText("");
        internetEmailAddress.setText("");
        internetFullAddress.setText("");
        internetAmount.setText("");       
        }//GEN-LAST:event_payInternetBtnActionPerformed

        private void paySchoolBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paySchoolBtnActionPerformed
         // Retrieve and parse the electricity amount
        double schoolAmountValue = Double.parseDouble(schoolAmount.getText());

        // Deduct the electricity amount from the account balance
        accountBalanceValue -= schoolAmountValue;

        // Update the account balance JLabel
        updateAccountBalanceLabel();

        // Add the transaction to the history table
        DefaultTableModel model = (DefaultTableModel) listHistoryTable.getModel();
        model.addRow(new Object[]{"School Bill", String.format("- %.2f", schoolAmountValue)});

        // Clear the text fields
        schoolName.setText("");
        types.setSelectedItem(null);
        studentName.setText("");
        studentNumber.setText("");
        studentMobileNumber.setText("");
        studentEmailAddress.setText("");
        schoolAmount.setText("");

        }//GEN-LAST:event_paySchoolBtnActionPerformed

        private void sendMoneyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMoneyBtnActionPerformed
                // Retrieve and parse the send amount
        double sendAmountValue = Double.parseDouble(sendAmount.getText());
        
        // Retrieve the mobile number
        String mobileNumber = sendMobileNumber.getText();
        
        // Deduct the send amount from the account balance
        accountBalanceValue -= sendAmountValue;
        
        // Update the account balance JLabel
        updateAccountBalanceLabel();
        
        // Add the transaction to the history table
        DefaultTableModel model = (DefaultTableModel) listHistoryTable.getModel();
        model.addRow(new Object[]{mobileNumber, String.format("- %.2f", sendAmountValue)});
        
        // Clear the text fields
        sendMobileNumber.setText("");
        sendAmount.setText("");
        }//GEN-LAST:event_sendMoneyBtnActionPerformed

       
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
                        java.util.logging.Logger.getLogger(AppInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(AppInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(AppInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(AppInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new AppInterface().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel accountBalance;
        private javax.swing.JLabel address;
        private javax.swing.JLabel address1;
        private javax.swing.JLabel address2;
        private javax.swing.JLabel address3;
        private javax.swing.JLabel address4;
        private javax.swing.JLabel address5;
        private javax.swing.JLabel address6;
        private javax.swing.JPanel billElectricityTab4;
        private javax.swing.JPanel billInternetTab6;
        private javax.swing.JPanel billSchoolTab7;
        private javax.swing.JPanel billTab0;
        private javax.swing.JPanel billWaterTab5;
        private javax.swing.JLabel eShoping;
        private javax.swing.JTextField electricityAmount;
        private javax.swing.JTextField electricityCompanyName;
        private javax.swing.JTextField electricityCustomerName;
        private javax.swing.JTextField electricityEmailAddress;
        private javax.swing.JTextField electricityFullAddress;
        private javax.swing.JTextField electricityHouseNumber;
        private javax.swing.JLabel electricityTab4;
        private javax.swing.JTextField internetAmount;
        private javax.swing.JTextField internetCompanyName;
        private javax.swing.JTextField internetCustomerName;
        private javax.swing.JTextField internetEmailAddress;
        private javax.swing.JTextField internetFullAddress;
        private javax.swing.JLabel internetTab6;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel16;
        private javax.swing.JLabel jLabel17;
        private javax.swing.JLabel jLabel18;
        private javax.swing.JLabel jLabel19;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel20;
        private javax.swing.JLabel jLabel21;
        private javax.swing.JLabel jLabel22;
        private javax.swing.JLabel jLabel23;
        private javax.swing.JLabel jLabel24;
        private javax.swing.JLabel jLabel25;
        private javax.swing.JLabel jLabel26;
        private javax.swing.JLabel jLabel27;
        private javax.swing.JLabel jLabel28;
        private javax.swing.JLabel jLabel29;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel30;
        private javax.swing.JLabel jLabel31;
        private javax.swing.JLabel jLabel32;
        private javax.swing.JLabel jLabel33;
        private javax.swing.JLabel jLabel34;
        private javax.swing.JLabel jLabel35;
        private javax.swing.JLabel jLabel36;
        private javax.swing.JLabel jLabel37;
        private javax.swing.JLabel jLabel38;
        private javax.swing.JLabel jLabel39;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel40;
        private javax.swing.JLabel jLabel41;
        private javax.swing.JLabel jLabel42;
        private javax.swing.JLabel jLabel43;
        private javax.swing.JLabel jLabel44;
        private javax.swing.JLabel jLabel45;
        private javax.swing.JLabel jLabel46;
        private javax.swing.JLabel jLabel47;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JScrollPane listHistoryScroll;
        public javax.swing.JTable listHistoryTable;
        private javax.swing.JLabel payBills;
        private javax.swing.JButton payElectricityBtn;
        private javax.swing.JButton payInternetBtn;
        private javax.swing.JButton paySchoolBtn;
        private javax.swing.JButton payWaterBtn;
        private javax.swing.JLabel saveMoney;
        private javax.swing.JPanel saveTab2;
        private javax.swing.JTextField schoolAmount;
        private javax.swing.JTextField schoolName;
        private javax.swing.JLabel schoolTab7;
        private javax.swing.JTextField sendAmount;
        private javax.swing.JTextField sendMobileNumber;
        private javax.swing.JLabel sendMoney;
        private javax.swing.JButton sendMoneyBtn;
        private javax.swing.JPanel sendTab1;
        private javax.swing.JPanel shopingTab3;
        private javax.swing.JTabbedPane snapTabs;
        private javax.swing.JTextField studentEmailAddress;
        private javax.swing.JTextField studentMobileNumber;
        private javax.swing.JTextField studentName;
        private javax.swing.JTextField studentNumber;
        private javax.swing.JComboBox<String> types;
        private javax.swing.JTextField waterAmount;
        private javax.swing.JTextField waterCompanyName;
        private javax.swing.JTextField waterCustomerName;
        private javax.swing.JTextField waterFullAddress;
        private javax.swing.JLabel waterTab5;
        // End of variables declaration//GEN-END:variables
}
