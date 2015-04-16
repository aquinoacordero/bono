package boletin26;

import java.awt.Color;

/**
 *
 * @author aquinoacordero
 */
public class ventana extends javax.swing.JFrame {

    int cont = 1;
    String num1;
    String num2;
    String num3;
    String num4;
    String num5;
    String num6;
    int lim;
    int num_al;
    int correctos = 0;
    String prem;
    String premio[] = new String[7];
    String loto[] = new String[7];

    public ventana() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bot1 = new javax.swing.JButton();
        bot2 = new javax.swing.JButton();
        bot3 = new javax.swing.JButton();
        bot4 = new javax.swing.JButton();
        bot5 = new javax.swing.JButton();
        bot6 = new javax.swing.JButton();
        bot7 = new javax.swing.JButton();
        bot8 = new javax.swing.JButton();
        bot9 = new javax.swing.JButton();
        bot10 = new javax.swing.JButton();
        bot11 = new javax.swing.JButton();
        bot12 = new javax.swing.JButton();
        bot13 = new javax.swing.JButton();
        bot14 = new javax.swing.JButton();
        bot15 = new javax.swing.JButton();
        bot16 = new javax.swing.JButton();
        bot17 = new javax.swing.JButton();
        bot18 = new javax.swing.JButton();
        bot19 = new javax.swing.JButton();
        bot20 = new javax.swing.JButton();
        bot21 = new javax.swing.JButton();
        bot22 = new javax.swing.JButton();
        bot23 = new javax.swing.JButton();
        bot24 = new javax.swing.JButton();
        bot25 = new javax.swing.JButton();
        bot26 = new javax.swing.JButton();
        bot27 = new javax.swing.JButton();
        bot28 = new javax.swing.JButton();
        bot29 = new javax.swing.JButton();
        bot30 = new javax.swing.JButton();
        bot31 = new javax.swing.JButton();
        bot32 = new javax.swing.JButton();
        bot33 = new javax.swing.JButton();
        bot34 = new javax.swing.JButton();
        bot35 = new javax.swing.JButton();
        bot36 = new javax.swing.JButton();
        bot37 = new javax.swing.JButton();
        bot38 = new javax.swing.JButton();
        bot39 = new javax.swing.JButton();
        bot40 = new javax.swing.JButton();
        bot41 = new javax.swing.JButton();
        bot42 = new javax.swing.JButton();
        bot43 = new javax.swing.JButton();
        bot44 = new javax.swing.JButton();
        bot45 = new javax.swing.JButton();
        bot46 = new javax.swing.JButton();
        bot47 = new javax.swing.JButton();
        bot48 = new javax.swing.JButton();
        bot49 = new javax.swing.JButton();
        botonAciertos = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        aciertos = new javax.swing.JLabel();
        mon1 = new javax.swing.JLabel();
        mon2 = new javax.swing.JLabel();
        mon3 = new javax.swing.JLabel();
        mon4 = new javax.swing.JLabel();
        mon5 = new javax.swing.JLabel();
        mon6 = new javax.swing.JLabel();
        random = new javax.swing.JButton();
        monB1 = new javax.swing.JLabel();
        monB2 = new javax.swing.JLabel();
        monB3 = new javax.swing.JLabel();
        monB4 = new javax.swing.JLabel();
        monB5 = new javax.swing.JLabel();
        monB6 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.magenta, java.awt.Color.magenta, java.awt.Color.magenta, java.awt.Color.magenta));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(234, 85, 115));

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel1.setBackground(new java.awt.Color(255, 135, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 127, 255), new java.awt.Color(254, 119, 254), new java.awt.Color(252, 123, 252), new java.awt.Color(254, 124, 254)));

        jLabel1.setBackground(new java.awt.Color(254, 254, 254));
        jLabel1.setFont(new java.awt.Font("URW Gothic L", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("LOTERIAS Y APUESTAS DEL ESTADO");

        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("semanal");

        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("321");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addComponent(jLabel5))
        );

        jLabel2.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(245, 120, 120));
        jLabel2.setText("BONO");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(250, 115, 115));
        jLabel3.setText("LOTO");

        jPanel4.setBackground(new java.awt.Color(254, 254, 254));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(247, 108, 223), new java.awt.Color(255, 123, 232)));
        jPanel4.setForeground(new java.awt.Color(255, 160, 164));

        bot1.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot1.setText("1");
        bot1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot1.setDefaultCapable(false);
        bot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot1ActionPerformed(evt);
            }
        });

        bot2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot2.setText("2");
        bot2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot2.setDefaultCapable(false);
        bot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot2ActionPerformed(evt);
            }
        });

        bot3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot3.setText("3");
        bot3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot3.setDefaultCapable(false);
        bot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot3ActionPerformed(evt);
            }
        });

        bot4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot4.setText("4");
        bot4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot4.setDefaultCapable(false);
        bot4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot4ActionPerformed(evt);
            }
        });

        bot5.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot5.setText("5");
        bot5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot5.setDefaultCapable(false);
        bot5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot5ActionPerformed(evt);
            }
        });

        bot6.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot6.setText("6");
        bot6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot6.setDefaultCapable(false);
        bot6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot6ActionPerformed(evt);
            }
        });

        bot7.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot7.setText("7");
        bot7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot7.setDefaultCapable(false);
        bot7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot7ActionPerformed(evt);
            }
        });

        bot8.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot8.setText("8");
        bot8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot8.setDefaultCapable(false);
        bot8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot8ActionPerformed(evt);
            }
        });

        bot9.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot9.setText("9");
        bot9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot9.setDefaultCapable(false);
        bot9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot9ActionPerformed(evt);
            }
        });

        bot10.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot10.setText("10");
        bot10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot10.setDefaultCapable(false);
        bot10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot10ActionPerformed(evt);
            }
        });

        bot11.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot11.setText("11");
        bot11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot11.setDefaultCapable(false);
        bot11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot11ActionPerformed(evt);
            }
        });

        bot12.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot12.setText("12");
        bot12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot12.setDefaultCapable(false);
        bot12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot12ActionPerformed(evt);
            }
        });

        bot13.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot13.setText("13");
        bot13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot13.setDefaultCapable(false);
        bot13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot13ActionPerformed(evt);
            }
        });

        bot14.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot14.setText("14");
        bot14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot14.setDefaultCapable(false);
        bot14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot14ActionPerformed(evt);
            }
        });

        bot15.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot15.setText("15");
        bot15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot15.setDefaultCapable(false);
        bot15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot15ActionPerformed(evt);
            }
        });

        bot16.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot16.setText("16");
        bot16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot16.setDefaultCapable(false);
        bot16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot16ActionPerformed(evt);
            }
        });

        bot17.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot17.setText("17");
        bot17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot17.setDefaultCapable(false);
        bot17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot17ActionPerformed(evt);
            }
        });

        bot18.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot18.setText("18");
        bot18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot18.setDefaultCapable(false);
        bot18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot18ActionPerformed(evt);
            }
        });

        bot19.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot19.setText("19");
        bot19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot19.setDefaultCapable(false);
        bot19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot19ActionPerformed(evt);
            }
        });

        bot20.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot20.setText("20");
        bot20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot20.setDefaultCapable(false);
        bot20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot20ActionPerformed(evt);
            }
        });

        bot21.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot21.setText("21");
        bot21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot21.setDefaultCapable(false);
        bot21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot21ActionPerformed(evt);
            }
        });

        bot22.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot22.setText("22");
        bot22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot22.setDefaultCapable(false);
        bot22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot22ActionPerformed(evt);
            }
        });

        bot23.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot23.setText("23");
        bot23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot23.setDefaultCapable(false);
        bot23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot23ActionPerformed(evt);
            }
        });

        bot24.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot24.setText("24");
        bot24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot24.setDefaultCapable(false);
        bot24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot24ActionPerformed(evt);
            }
        });

        bot25.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot25.setText("25");
        bot25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot25.setDefaultCapable(false);
        bot25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot25ActionPerformed(evt);
            }
        });

        bot26.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot26.setText("26");
        bot26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot26.setDefaultCapable(false);
        bot26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot26ActionPerformed(evt);
            }
        });

        bot27.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot27.setText("27");
        bot27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot27.setDefaultCapable(false);
        bot27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot27ActionPerformed(evt);
            }
        });

        bot28.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot28.setText("28");
        bot28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot28.setDefaultCapable(false);
        bot28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot28ActionPerformed(evt);
            }
        });

        bot29.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot29.setText("29");
        bot29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot29.setDefaultCapable(false);
        bot29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot29ActionPerformed(evt);
            }
        });

        bot30.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot30.setText("30");
        bot30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot30.setDefaultCapable(false);
        bot30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot30ActionPerformed(evt);
            }
        });

        bot31.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot31.setText("31");
        bot31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot31.setDefaultCapable(false);
        bot31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot31ActionPerformed(evt);
            }
        });

        bot32.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot32.setText("32");
        bot32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot32.setDefaultCapable(false);
        bot32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot32ActionPerformed(evt);
            }
        });

        bot33.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot33.setText("33");
        bot33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot33.setDefaultCapable(false);
        bot33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot33ActionPerformed(evt);
            }
        });

        bot34.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot34.setText("34");
        bot34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot34.setDefaultCapable(false);
        bot34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot34ActionPerformed(evt);
            }
        });

        bot35.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot35.setText("35");
        bot35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot35.setDefaultCapable(false);
        bot35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot35ActionPerformed(evt);
            }
        });

        bot36.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot36.setText("36");
        bot36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot36.setDefaultCapable(false);
        bot36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot36ActionPerformed(evt);
            }
        });

        bot37.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot37.setText("37");
        bot37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot37.setDefaultCapable(false);
        bot37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot37ActionPerformed(evt);
            }
        });

        bot38.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot38.setText("38");
        bot38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot38.setDefaultCapable(false);
        bot38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot38ActionPerformed(evt);
            }
        });

        bot39.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot39.setText("39");
        bot39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot39.setDefaultCapable(false);
        bot39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot39ActionPerformed(evt);
            }
        });

        bot40.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot40.setText("40");
        bot40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot40.setDefaultCapable(false);
        bot40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot40ActionPerformed(evt);
            }
        });

        bot41.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot41.setText("41");
        bot41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot41.setDefaultCapable(false);
        bot41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot41ActionPerformed(evt);
            }
        });

        bot42.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot42.setText("42");
        bot42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot42.setDefaultCapable(false);
        bot42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot42ActionPerformed(evt);
            }
        });

        bot43.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot43.setText("43");
        bot43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot43.setDefaultCapable(false);
        bot43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot43ActionPerformed(evt);
            }
        });

        bot44.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot44.setText("44");
        bot44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot44.setDefaultCapable(false);
        bot44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot44ActionPerformed(evt);
            }
        });

        bot45.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot45.setText("45");
        bot45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot45.setDefaultCapable(false);
        bot45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot45ActionPerformed(evt);
            }
        });

        bot46.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot46.setText("46");
        bot46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot46.setDefaultCapable(false);
        bot46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot46ActionPerformed(evt);
            }
        });

        bot47.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot47.setText("47");
        bot47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot47.setDefaultCapable(false);
        bot47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot47ActionPerformed(evt);
            }
        });

        bot48.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot48.setText("48");
        bot48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot48.setDefaultCapable(false);
        bot48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot48ActionPerformed(evt);
            }
        });

        bot49.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        bot49.setText("49");
        bot49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(211, 130, 253), 2));
        bot49.setDefaultCapable(false);
        bot49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bot49ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bot9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bot29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bot47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bot40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(bot39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bot49, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(bot10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot12, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot17, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(bot20, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot21, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot32, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot42, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot23, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot24, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot25, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot26, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot27, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bot28, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot49, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot39, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot30, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot40, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot31, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot41, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot33, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot43, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot34, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot44, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot35, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot45, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot36, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot46, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot37, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot47, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bot38, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bot48, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        botonAciertos.setText("Aciertos");
        botonAciertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAciertosActionPerformed(evt);
            }
        });

        borrar.setText("Borrar");

        aciertos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        mon1.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        mon1.setText("00");

        mon2.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        mon2.setText("00");

        mon3.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        mon3.setText("00");

        mon4.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        mon4.setText("00");

        mon5.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        mon5.setText("00");

        mon6.setFont(new java.awt.Font("URW Palladio L", 3, 18)); // NOI18N
        mon6.setText("00");

        random.setText("PREMIO");
        random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randomActionPerformed(evt);
            }
        });

        monB1.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        monB1.setText("00");

        monB2.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        monB2.setText("00");

        monB3.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        monB3.setText("00");

        monB4.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        monB4.setText("00");

        monB5.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        monB5.setText("00");

        monB6.setFont(new java.awt.Font("Ubuntu", 3, 18)); // NOI18N
        monB6.setText("00");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_bonoloto_tr.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mon1)
                                    .addComponent(botonAciertos))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(aciertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(mon2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mon3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mon4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mon5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mon6)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(borrar)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(random)
                                .addGap(18, 18, 18)
                                .addComponent(monB1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monB2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monB3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monB4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monB5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(monB6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(121, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel3)))
                                .addGap(57, 57, 57))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAciertos, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(aciertos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(random)
                            .addComponent(monB1)
                            .addComponent(monB2)
                            .addComponent(monB3)
                            .addComponent(monB4)
                            .addComponent(monB5)
                            .addComponent(monB6))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mon1)
                            .addComponent(mon2)
                            .addComponent(mon3)
                            .addComponent(mon4)
                            .addComponent(mon5)
                            .addComponent(mon6))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAciertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAciertosActionPerformed

        loto[1] = num1;
        loto[2] = num2;
        loto[3] = num3;
        loto[4] = num4;
        loto[5] = num5;
        loto[6] = num6;

        for (int x = 1; x < 8; x++) {
            if (premio[x].equalsIgnoreCase(loto[x])) {
                correctos++;
            }
        
    }//GEN-LAST:event_botonAciertosActionPerformed
        prem=Integer.toString(correctos);
        aciertos.setText(prem);
        System.out.println(prem);
    }
    private void bot49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot49ActionPerformed
        if (cont < 7) {
            bot49.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "49";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "49";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "49";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "49";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "49";
                mon5.setText(num5);
            } else {
                num6 = "49";
                mon6.setText(num6);
            }
            cont++;
            bot49.setEnabled(false);
        }
    }//GEN-LAST:event_bot49ActionPerformed

    private void bot48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot48ActionPerformed
        if (cont < 7) {
            bot48.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "48";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "48";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "48";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "48";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "48";
                mon5.setText(num5);
            } else {
                num6 = "48";
                mon6.setText(num6);
            }
            cont++;
            bot48.setEnabled(false);
        }
    }//GEN-LAST:event_bot48ActionPerformed

    private void bot47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot47ActionPerformed
        if (cont < 7) {
            bot47.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "47";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "47";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "47";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "47";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "47";
                mon5.setText(num5);
            } else {
                num6 = "47";
                mon6.setText(num6);
            }
            cont++;
            bot47.setEnabled(false);
        }
    }//GEN-LAST:event_bot47ActionPerformed

    private void bot46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot46ActionPerformed
        if (cont < 7) {
            bot46.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "46";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "46";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "46";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "46";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "46";
                mon5.setText(num5);
            } else {
                num6 = "46";
                mon6.setText(num6);
            }
            cont++;
            bot46.setEnabled(false);
        }
    }//GEN-LAST:event_bot46ActionPerformed

    private void bot45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot45ActionPerformed
        if (cont < 7) {
            bot45.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "45";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "45";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "45";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "45";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "45";
                mon5.setText(num5);
            } else {
                num6 = "45";
                mon6.setText(num6);
            }
            cont++;
            bot45.setEnabled(false);
        }
    }//GEN-LAST:event_bot45ActionPerformed

    private void bot44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot44ActionPerformed
        if (cont < 7) {
            bot44.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "44";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "44";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "44";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "44";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "44";
                mon5.setText(num5);
            } else {
                num6 = "44";
                mon6.setText(num6);
            }
            cont++;
            bot44.setEnabled(false);
        }
    }//GEN-LAST:event_bot44ActionPerformed

    private void bot43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot43ActionPerformed
        if (cont < 7) {
            bot43.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "43";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "43";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "43";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "43";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "43";
                mon5.setText(num5);
            } else {
                num6 = "43";
                mon6.setText(num6);
            }
            cont++;
            bot43.setEnabled(false);
        }
    }//GEN-LAST:event_bot43ActionPerformed

    private void bot42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot42ActionPerformed
        if (cont < 7) {
            bot42.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "42";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "42";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "42";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "42";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "42";
                mon5.setText(num5);
            } else {
                num6 = "42";
                mon6.setText(num6);
            }
            cont++;
            bot42.setEnabled(false);
        }
    }//GEN-LAST:event_bot42ActionPerformed

    private void bot41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot41ActionPerformed
        if (cont < 7) {
            bot41.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "41";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "41";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "41";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "41";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "41";
                mon5.setText(num5);
            } else {
                num6 = "41";
                mon6.setText(num6);
            }
            cont++;
            bot41.setEnabled(false);
        }
    }//GEN-LAST:event_bot41ActionPerformed

    private void bot40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot40ActionPerformed
        if (cont < 7) {
            bot40.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "40";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "40";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "40";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "40";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "40";
                mon5.setText(num5);
            } else {
                num6 = "40";
                mon6.setText(num6);
            }
            cont++;
            bot40.setEnabled(false);
        }
    }//GEN-LAST:event_bot40ActionPerformed

    private void bot39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot39ActionPerformed
        if (cont < 7) {
            bot39.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "39";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "39";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "39";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "39";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "39";
                mon5.setText(num5);
            } else {
                num6 = "39";
                mon6.setText(num6);
            }
            cont++;
            bot39.setEnabled(false);
        }
    }//GEN-LAST:event_bot39ActionPerformed

    private void bot38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot38ActionPerformed
        if (cont < 7) {
            bot38.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "38";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "38";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "38";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "38";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "38";
                mon5.setText(num5);
            } else {
                num6 = "38";
                mon6.setText(num6);
            }
            cont++;
            bot38.setEnabled(false);
        }
    }//GEN-LAST:event_bot38ActionPerformed

    private void bot37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot37ActionPerformed
        if (cont < 7) {
            bot37.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "37";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "37";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "37";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "37";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "37";
                mon5.setText(num5);
            } else {
                num6 = "37";
                mon6.setText(num6);
            }
            cont++;
            bot37.setEnabled(false);
        }
    }//GEN-LAST:event_bot37ActionPerformed

    private void bot36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot36ActionPerformed
        if (cont < 7) {
            bot36.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "36";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "36";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "36";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "36";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "36";
                mon5.setText(num5);
            } else {
                num6 = "36";
                mon6.setText(num6);
            }
            cont++;
            bot36.setEnabled(false);
        }
    }//GEN-LAST:event_bot36ActionPerformed

    private void bot35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot35ActionPerformed
        if (cont < 7) {
            bot35.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "35";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "35";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "35";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "35";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "35";
                mon5.setText(num5);
            } else {
                num6 = "35";
                mon6.setText(num6);
            }
            cont++;
            bot35.setEnabled(false);
        }
    }//GEN-LAST:event_bot35ActionPerformed

    private void bot34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot34ActionPerformed
        if (cont < 7) {
            bot34.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "34";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "34";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "34";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "34";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "34";
                mon5.setText(num5);
            } else {
                num6 = "34";
                mon6.setText(num6);
            }
            cont++;
            bot34.setEnabled(false);
        }
    }//GEN-LAST:event_bot34ActionPerformed

    private void bot33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot33ActionPerformed
        if (cont < 7) {
            bot33.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "33";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "33";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "33";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "33";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "33";
                mon5.setText(num5);
            } else {
                num6 = "33";
                mon6.setText(num6);
            }
            cont++;
            bot33.setEnabled(false);
        }
    }//GEN-LAST:event_bot33ActionPerformed

    private void bot32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot32ActionPerformed
        if (cont < 7) {
            bot32.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "32";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "32";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "32";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "32";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "32";
                mon5.setText(num5);
            } else {
                num6 = "32";
                mon6.setText(num6);
            }
            cont++;
            bot32.setEnabled(false);
        }
    }//GEN-LAST:event_bot32ActionPerformed

    private void bot31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot31ActionPerformed
        if (cont < 7) {
            bot31.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "31";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "31";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "31";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "31";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "31";
                mon5.setText(num5);
            } else {
                num6 = "31";
                mon6.setText(num6);
            }
            cont++;
            bot31.setEnabled(false);
        }
    }//GEN-LAST:event_bot31ActionPerformed

    private void bot30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot30ActionPerformed
        if (cont < 7) {
            bot30.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "30";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "30";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "30";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "30";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "30";
                mon5.setText(num5);
            } else {
                num6 = "30";
                mon6.setText(num6);
            }
            cont++;
            bot30.setEnabled(false);
        }
    }//GEN-LAST:event_bot30ActionPerformed

    private void bot29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot29ActionPerformed
        if (cont < 7) {
            bot29.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "29";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "29";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "29";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "29";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "29";
                mon5.setText(num5);
            } else {
                num6 = "29";
                mon6.setText(num6);
            }
            cont++;
            bot29.setEnabled(false);
        }
    }//GEN-LAST:event_bot29ActionPerformed

    private void bot28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot28ActionPerformed
        if (cont < 7) {
            bot28.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "28";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "28";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "3";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "28";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "28";
                mon5.setText(num5);
            } else {
                num6 = "28";
                mon6.setText(num6);
            }
            cont++;
            bot28.setEnabled(false);
        }
    }//GEN-LAST:event_bot28ActionPerformed

    private void bot27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot27ActionPerformed
        if (cont < 7) {
            bot27.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "27";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "27";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "27";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "27";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "27";
                mon5.setText(num5);
            } else {
                num6 = "27";
                mon6.setText(num6);
            }
            cont++;
            bot27.setEnabled(false);
        }
    }//GEN-LAST:event_bot27ActionPerformed

    private void bot26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot26ActionPerformed
        if (cont < 7) {
            bot26.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "26";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "26";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "26";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "26";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "26";
                mon5.setText(num5);
            } else {
                num6 = "26";
                mon6.setText(num6);
            }
            cont++;
            bot26.setEnabled(false);
        }
    }//GEN-LAST:event_bot26ActionPerformed

    private void bot25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot25ActionPerformed
        if (cont < 7) {
            bot25.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "25";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "25";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "25";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "25";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "25";
                mon5.setText(num5);
            } else {
                num6 = "25";
                mon6.setText(num6);
            }
            cont++;
            bot25.setEnabled(false);
        }
    }//GEN-LAST:event_bot25ActionPerformed

    private void bot24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot24ActionPerformed
        if (cont < 7) {
            bot24.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "24";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "24";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "24";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "24";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "24";
                mon5.setText(num5);
            } else {
                num6 = "24";
                mon6.setText(num6);
            }
            cont++;
            bot24.setEnabled(false);
        }
    }//GEN-LAST:event_bot24ActionPerformed

    private void bot23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot23ActionPerformed
        if (cont < 7) {
            bot23.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "23";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "23";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "23";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "23";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "23";
                mon5.setText(num5);
            } else {
                num6 = "23";
                mon6.setText(num6);
            }
            cont++;
            bot23.setEnabled(false);
        }
    }//GEN-LAST:event_bot23ActionPerformed

    private void bot22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot22ActionPerformed
        if (cont < 7) {
            bot22.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "22";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "22";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "22";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "22";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "22";
                mon5.setText(num5);
            } else {
                num6 = "22";
                mon6.setText(num6);
            }
            cont++;
            bot22.setEnabled(false);
        }
    }//GEN-LAST:event_bot22ActionPerformed

    private void bot21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot21ActionPerformed
        if (cont < 7) {
            bot21.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "21";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "21";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "21";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "21";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "21";
                mon5.setText(num5);
            } else {
                num6 = "21";
                mon6.setText(num6);
            }
            cont++;
            bot21.setEnabled(false);
        }
    }//GEN-LAST:event_bot21ActionPerformed

    private void bot20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot20ActionPerformed
        if (cont < 7) {
            bot20.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "20";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "20";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "20";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "20";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "20";
                mon5.setText(num5);
            } else {
                num6 = "20";
                mon6.setText(num6);
            }
            cont++;
            bot20.setEnabled(false);
        }
    }//GEN-LAST:event_bot20ActionPerformed

    private void bot19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot19ActionPerformed
        if (cont < 7) {
            bot19.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "19";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "19";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "19";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "19";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "19";
                mon5.setText(num5);
            } else {
                num6 = "19";
                mon6.setText(num6);
            }
            cont++;
            bot19.setEnabled(false);
        }
    }//GEN-LAST:event_bot19ActionPerformed

    private void bot18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot18ActionPerformed
        if (cont < 7) {
            bot18.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "18";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "18";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "18";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "18";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "18";
                mon5.setText(num5);
            } else {
                num6 = "18";
                mon6.setText(num6);
            }
            cont++;
            bot18.setEnabled(false);
        }
    }//GEN-LAST:event_bot18ActionPerformed

    private void bot17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot17ActionPerformed
        if (cont < 7) {
            bot17.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "17";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "17";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "17";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "17";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "17";
                mon5.setText(num5);
            } else {
                num6 = "17";
                mon6.setText(num6);
            }
            cont++;
            bot17.setEnabled(false);
        }
    }//GEN-LAST:event_bot17ActionPerformed

    private void bot16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot16ActionPerformed
        if (cont < 7) {
            bot16.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "16";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "16";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "16";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "16";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "16";
                mon5.setText(num5);
            } else {
                num6 = "16";
                mon6.setText(num6);
            }
            cont++;
            bot16.setEnabled(false);
        }
    }//GEN-LAST:event_bot16ActionPerformed

    private void bot15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot15ActionPerformed
        if (cont < 7) {
            bot15.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "15";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "15";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "15";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "15";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "15";
                mon5.setText(num5);
            } else {
                num6 = "15";
                mon6.setText(num6);
            }
            cont++;
            bot15.setEnabled(false);
        }
    }//GEN-LAST:event_bot15ActionPerformed

    private void bot14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot14ActionPerformed
        if (cont < 7) {
            bot14.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "14";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "14";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "14";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "14";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "14";
                mon5.setText(num5);
            } else {
                num6 = "14";
                mon6.setText(num6);
            }
            cont++;
            bot14.setEnabled(false);
        }
    }//GEN-LAST:event_bot14ActionPerformed

    private void bot13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot13ActionPerformed
        if (cont < 7) {
            bot13.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "13";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "13";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "13";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "13";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "13";
                mon5.setText(num5);
            } else {
                num6 = "13";
                mon6.setText(num6);
            }
            cont++;
            bot13.setEnabled(false);
        }
    }//GEN-LAST:event_bot13ActionPerformed

    private void bot12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot12ActionPerformed
        if (cont < 7) {
            bot12.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "12";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "12";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "12";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "12";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "12";
                mon5.setText(num5);
            } else {
                num6 = "12";
                mon6.setText(num6);
            }
            cont++;
            bot12.setEnabled(false);
        }
    }//GEN-LAST:event_bot12ActionPerformed

    private void bot11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot11ActionPerformed
        if (cont < 7) {
            bot11.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "11";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "11";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "11";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "11";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "11";
                mon5.setText(num5);
            } else {
                num6 = "11";
                mon6.setText(num6);
            }
            cont++;
            bot11.setEnabled(false);
        }
    }//GEN-LAST:event_bot11ActionPerformed

    private void bot10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot10ActionPerformed
        if (cont < 7) {
            bot10.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "10";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "10";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "10";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "10";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "10";
                mon5.setText(num5);
            } else {
                num6 = "10";
                mon6.setText(num6);
            }
            cont++;
            bot10.setEnabled(false);
        }
    }//GEN-LAST:event_bot10ActionPerformed

    private void bot9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot9ActionPerformed
        if (cont < 7) {
            bot9.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "9";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "9";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "9";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "9";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "9";
                mon5.setText(num5);
            } else {
                num6 = "9";
                mon6.setText(num6);
            }
            cont++;
            bot9.setEnabled(false);
        }
    }//GEN-LAST:event_bot9ActionPerformed

    private void bot8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot8ActionPerformed
        if (cont < 7) {
            bot8.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "8";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "8";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "8";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "8";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "8";
                mon5.setText(num5);
            } else {
                num6 = "8";
                mon6.setText(num6);
            }
            cont++;
            bot8.setEnabled(false);
        }
    }//GEN-LAST:event_bot8ActionPerformed

    private void bot7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot7ActionPerformed
        if (cont < 7) {
            bot7.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "7";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "7";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "7";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "7";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "7";
                mon5.setText(num5);
            } else {
                num6 = "7";
                mon6.setText(num6);
            }
            cont++;
            bot7.setEnabled(false);
        }
    }//GEN-LAST:event_bot7ActionPerformed

    private void bot6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot6ActionPerformed
        if (cont < 7) {
            bot6.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "6";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "6";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "6";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "6";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "6";
                mon5.setText(num5);
            } else {
                num6 = "6";
                mon6.setText(num6);
            }
            cont++;
            bot6.setEnabled(false);
        }
    }//GEN-LAST:event_bot6ActionPerformed

    private void bot5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot5ActionPerformed
        if (cont < 7) {
            bot5.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "5";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "5";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "5";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "5";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "5";
                mon5.setText(num5);
            } else {
                num6 = "5";
                mon6.setText(num6);
            }
            cont++;
            bot5.setEnabled(false);
        }
    }//GEN-LAST:event_bot5ActionPerformed

    private void bot4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot4ActionPerformed
        if (cont < 7) {
            bot4.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "4";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "4";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "4";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "4";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "4";
                mon5.setText(num5);
            } else {
                num6 = "4";
                mon6.setText(num6);
            }
            cont++;
            bot4.setEnabled(false);
        }
    }//GEN-LAST:event_bot4ActionPerformed

    private void bot3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot3ActionPerformed
        if (cont < 7) {
            bot3.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "3";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "3";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "3";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "3";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "3";
                mon5.setText(num5);
            } else {
                num6 = "3";
                mon6.setText(num6);
            }
            cont++;
            bot3.setEnabled(false);
        }
    }//GEN-LAST:event_bot3ActionPerformed

    private void bot2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot2ActionPerformed
        if (cont < 7) {
            bot2.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "2";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "2";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "2";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "2";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "2";
                mon5.setText(num5);
            } else {
                num6 = "2";
                mon6.setText(num6);
            }
            cont++;
            bot2.setEnabled(false);
        }
    }//GEN-LAST:event_bot2ActionPerformed

    private void bot1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bot1ActionPerformed
        if (cont < 7) {
            bot1.setBackground(Color.red);

            /*num1="1";
             mon1.setText(num1);*/
            if (cont == 1) {
                num1 = "1";
                mon1.setText(num1);
            } else if (cont == 2) {
                num2 = "1";
                mon2.setText(num2);
            } else if (cont == 3) {
                num3 = "1";
                mon3.setText(num3);
            } else if (cont == 4) {
                num4 = "1";
                mon4.setText(num4);
            } else if (cont == 5) {
                num5 = "1";
                mon5.setText(num5);
            } else {
                num6 = "1";
                mon6.setText(num6);
            }
            cont++;
            bot1.setEnabled(false);
        }
    }//GEN-LAST:event_bot1ActionPerformed

    private void randomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randomActionPerformed

        for (lim = 1; lim < 7; lim++) {
            num_al = (int) Math.floor(Math.random() * (1 - (49 + 1)) + (49 + 1));
            premio[lim] = Integer.toString(num_al);

            if (lim == 1) {
                monB1.setText(premio[lim]);
                System.out.println(lim);
            } else if (lim == 2) {
                monB2.setText(premio[lim]);
                System.out.println(lim);
            } else if (lim == 3) {
                monB3.setText(premio[lim]);
            } else if (lim == 4) {
                monB4.setText(premio[lim]);
            } else if (lim == 5) {
                monB5.setText(premio[lim]);
                System.out.println(lim);
            } else if (lim == 6) {
                monB6.setText(premio[lim]);
                System.out.println(lim);
            }

        }
    }//GEN-LAST:event_randomActionPerformed

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aciertos;
    private javax.swing.JButton borrar;
    private javax.swing.JButton bot1;
    private javax.swing.JButton bot10;
    private javax.swing.JButton bot11;
    private javax.swing.JButton bot12;
    private javax.swing.JButton bot13;
    private javax.swing.JButton bot14;
    private javax.swing.JButton bot15;
    private javax.swing.JButton bot16;
    private javax.swing.JButton bot17;
    private javax.swing.JButton bot18;
    private javax.swing.JButton bot19;
    private javax.swing.JButton bot2;
    private javax.swing.JButton bot20;
    private javax.swing.JButton bot21;
    private javax.swing.JButton bot22;
    private javax.swing.JButton bot23;
    private javax.swing.JButton bot24;
    private javax.swing.JButton bot25;
    private javax.swing.JButton bot26;
    private javax.swing.JButton bot27;
    private javax.swing.JButton bot28;
    private javax.swing.JButton bot29;
    private javax.swing.JButton bot3;
    private javax.swing.JButton bot30;
    private javax.swing.JButton bot31;
    private javax.swing.JButton bot32;
    private javax.swing.JButton bot33;
    private javax.swing.JButton bot34;
    private javax.swing.JButton bot35;
    private javax.swing.JButton bot36;
    private javax.swing.JButton bot37;
    private javax.swing.JButton bot38;
    private javax.swing.JButton bot39;
    private javax.swing.JButton bot4;
    private javax.swing.JButton bot40;
    private javax.swing.JButton bot41;
    private javax.swing.JButton bot42;
    private javax.swing.JButton bot43;
    private javax.swing.JButton bot44;
    private javax.swing.JButton bot45;
    private javax.swing.JButton bot46;
    private javax.swing.JButton bot47;
    private javax.swing.JButton bot48;
    private javax.swing.JButton bot49;
    private javax.swing.JButton bot5;
    private javax.swing.JButton bot6;
    private javax.swing.JButton bot7;
    private javax.swing.JButton bot8;
    private javax.swing.JButton bot9;
    private javax.swing.JButton botonAciertos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel mon1;
    private javax.swing.JLabel mon2;
    private javax.swing.JLabel mon3;
    private javax.swing.JLabel mon4;
    private javax.swing.JLabel mon5;
    private javax.swing.JLabel mon6;
    private javax.swing.JLabel monB1;
    private javax.swing.JLabel monB2;
    private javax.swing.JLabel monB3;
    private javax.swing.JLabel monB4;
    private javax.swing.JLabel monB5;
    private javax.swing.JLabel monB6;
    private javax.swing.JButton random;
    // End of variables declaration//GEN-END:variables
}
