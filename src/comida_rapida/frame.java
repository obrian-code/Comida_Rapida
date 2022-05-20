package comida_rapida;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.util.Arrays;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class frame extends javax.swing.JFrame {

    DefaultTableModel modelo;
    Object [] objects=new Object[4] ;
    String comida="",codigo="";double precio = 0;  
    double ban;
    long time_start, time_end;    
    AudioClip audio;
    
    public frame() {
        
        time_start = System.currentTimeMillis();
        audio=java.applet.Applet.newAudioClip(getClass().getResource("../listen/audio.wav"));
        audio.play();
        initComponents();
        setSize(840, 610);
        setResizable(false);
        setLocationRelativeTo(null);
        jRadioButton15.setEnabled(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn6 = new javax.swing.JRadioButton();
        btn7 = new javax.swing.JRadioButton();
        btn3 = new javax.swing.JRadioButton();
        btn4 = new javax.swing.JRadioButton();
        btn5 = new javax.swing.JRadioButton();
        btn11 = new javax.swing.JRadioButton();
        btn8 = new javax.swing.JRadioButton();
        btn12 = new javax.swing.JRadioButton();
        btn9 = new javax.swing.JRadioButton();
        btn10 = new javax.swing.JRadioButton();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();
        btn14 = new javax.swing.JRadioButton();
        btn13 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        monto = new javax.swing.JLabel();
        cerrar = new javax.swing.JLabel();
        cerrar1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        ingresar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        eliminar = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        modificar = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        buscar = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        ayuda = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        reporte = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(247, 247, 247));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(1, 109, 254));
        jPanel6.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jPanel1.setBackground(new java.awt.Color(1, 109, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(248, 241, 241)));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        buttonGroup1.add(btn6);
        btn6.setForeground(new java.awt.Color(254, 254, 254));
        btn6.setText("CHORI PAN");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn6.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn7);
        btn7.setForeground(new java.awt.Color(254, 254, 254));
        btn7.setText("BATIDO");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn7.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn3);
        btn3.setForeground(new java.awt.Color(253, 251, 251));
        btn3.setText("FISH  AND CHIPS");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn4);
        btn4.setForeground(new java.awt.Color(254, 254, 254));
        btn4.setText("BOCADILLOS");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn5);
        btn5.setForeground(new java.awt.Color(254, 254, 254));
        btn5.setText("TACOS");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn11);
        btn11.setForeground(new java.awt.Color(250, 250, 250));
        btn11.setText("HAMBURGUEZA");
        btn11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn11.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn8);
        btn8.setForeground(new java.awt.Color(255, 250, 250));
        btn8.setText("POLLITO FRITO");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn8.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn12);
        btn12.setForeground(new java.awt.Color(245, 243, 243));
        btn12.setText("PERRITO CALIEN");
        btn12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn12.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn9);
        btn9.setForeground(new java.awt.Color(254, 254, 254));
        btn9.setText("SNACKS");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn9.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn10);
        btn10.setForeground(new java.awt.Color(254, 254, 254));
        btn10.setText("PIZZA");
        btn10.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn10.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn1);
        btn1.setForeground(new java.awt.Color(254, 254, 254));
        btn1.setText("SALCHIPAPAS");
        btn1.setAutoscrolls(true);
        btn1.setBorder(null);
        btn1.setContentAreaFilled(false);
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn1.setFocusPainted(false);
        btn1.setFocusable(false);
        btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn1.setName(""); // NOI18N
        btn1.setRequestFocusEnabled(false);
        btn1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(btn2);
        btn2.setForeground(new java.awt.Color(254, 254, 254));
        btn2.setText("SANDWICH");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N
        btn2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn14);
        btn14.setForeground(new java.awt.Color(254, 247, 247));
        btn14.setText("BUTIFARA");
        btn14.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn14.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        buttonGroup1.add(btn13);
        btn13.setForeground(new java.awt.Color(244, 232, 232));
        btn13.setText("PAPAS FRITAS");
        btn13.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N
        btn13.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio1.png"))); // NOI18N

        jRadioButton15.setForeground(new java.awt.Color(250, 250, 250));
        jRadioButton15.setText("NO DISPONIBLE");
        jRadioButton15.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jRadioButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/radio.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn3)
                    .addComponent(btn4)
                    .addComponent(btn5)
                    .addComponent(btn1)
                    .addComponent(btn2))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn9)
                    .addComponent(btn8)
                    .addComponent(btn10)
                    .addComponent(btn7)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn11)
                            .addComponent(btn12)
                            .addComponent(btn13)
                            .addComponent(btn14))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton15)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn6)
                    .addComponent(btn11)
                    .addComponent(btn1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn7)
                            .addComponent(btn12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn13)
                            .addComponent(btn8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn9)
                            .addComponent(btn14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5)
                            .addComponent(btn10))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(254, 254, 254));
        jLabel8.setText("Food category");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(jLabel8))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(0, 32, 586, 240);

        jScrollPane1.setBackground(new java.awt.Color(254, 254, 254));
        jScrollPane1.setBorder(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        datos.setAutoCreateRowSorter(true);
        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CODIGO", "PRODUCTO", "PRECIO "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        datos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        datos.setGridColor(new java.awt.Color(254, 247, 247));
        datos.setOpaque(false);
        datos.setRequestFocusEnabled(false);
        datos.setSelectionBackground(new java.awt.Color(6, 126, 249));
        datos.setSelectionForeground(new java.awt.Color(254, 254, 254));
        datos.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        datos.getTableHeader().setResizingAllowed(false);
        datos.getTableHeader().setReorderingAllowed(false);
        datos.setUpdateSelectionOnSort(false);
        datos.setVerifyInputWhenFocusTarget(false);
        jScrollPane1.setViewportView(datos);
        datos.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (datos.getColumnModel().getColumnCount() > 0) {
            datos.getColumnModel().getColumn(0).setResizable(false);
            datos.getColumnModel().getColumn(0).setHeaderValue("ID");
            datos.getColumnModel().getColumn(1).setResizable(false);
            datos.getColumnModel().getColumn(1).setHeaderValue("CODIGO");
            datos.getColumnModel().getColumn(2).setResizable(false);
            datos.getColumnModel().getColumn(2).setHeaderValue("PRODUCTO");
            datos.getColumnModel().getColumn(3).setResizable(false);
            datos.getColumnModel().getColumn(3).setHeaderValue("PRECIO ");
        }

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(28, 293, 530, 230);

        jPanel3.setBackground(new java.awt.Color(0, 93, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254)));

        jLabel1.setForeground(new java.awt.Color(253, 248, 248));
        jLabel1.setText("TOTAL:");

        monto.setForeground(new java.awt.Color(255, 250, 250));
        monto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(monto, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(monto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(-30, 541, 630, 40);

        cerrar.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        cerrar.setText("X");
        cerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarMouseClicked(evt);
            }
        });
        jPanel2.add(cerrar);
        cerrar.setBounds(564, 0, 36, 26);

        cerrar1.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        cerrar1.setText("__");
        cerrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar1MouseClicked(evt);
            }
        });
        jPanel2.add(cerrar1);
        cerrar1.setBounds(540, 0, 18, 20);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(250, 0, 600, 710);

        jPanel4.setBackground(new java.awt.Color(0, 88, 255));
        jPanel4.setToolTipText("PRECIONE AQUI PARA MOVER LA VENTANA");
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel4MouseReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(253, 251, 251));
        jLabel2.setText("keep too");

        jPanel5.setBackground(new java.awt.Color(254, 254, 254));
        jPanel5.setPreferredSize(new java.awt.Dimension(195, 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(0, 88, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254)));
        jPanel7.setPreferredSize(new java.awt.Dimension(111, 50));
        jPanel7.setLayout(null);

        ingresar.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        ingresar.setForeground(new java.awt.Color(253, 251, 251));
        ingresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingresar.png"))); // NOI18N
        ingresar.setText("INGRESAR");
        ingresar.setBorder(null);
        ingresar.setBorderPainted(false);
        ingresar.setContentAreaFilled(false);
        ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ingresar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ingresar1.png"))); // NOI18N
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ingresarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ingresarMouseEntered(evt);
            }
        });
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        jPanel7.add(ingresar);
        ingresar.setBounds(26, 0, 140, 50);

        jPanel8.setBackground(new java.awt.Color(0, 88, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 243, 243)));
        jPanel8.setPreferredSize(new java.awt.Dimension(111, 50));
        jPanel8.setLayout(null);

        eliminar.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        eliminar.setForeground(new java.awt.Color(249, 247, 247));
        eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eliminar.png"))); // NOI18N
        eliminar.setText("ELIMINAR");
        eliminar.setBorder(null);
        eliminar.setBorderPainted(false);
        eliminar.setContentAreaFilled(false);
        eliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eliminar1.png"))); // NOI18N
        eliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarMouseEntered(evt);
            }
        });
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });
        jPanel8.add(eliminar);
        eliminar.setBounds(30, 0, 126, 50);

        jPanel9.setBackground(new java.awt.Color(0, 88, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(253, 248, 248)));
        jPanel9.setPreferredSize(new java.awt.Dimension(111, 50));
        jPanel9.setLayout(null);

        modificar.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        modificar.setForeground(new java.awt.Color(254, 247, 247));
        modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/modifcar.png"))); // NOI18N
        modificar.setText("MODIFICAR");
        modificar.setBorder(null);
        modificar.setBorderPainted(false);
        modificar.setContentAreaFilled(false);
        modificar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        modificar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/modificar1.png"))); // NOI18N
        modificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modificarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modificarMouseEntered(evt);
            }
        });
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });
        jPanel9.add(modificar);
        modificar.setBounds(30, 0, 142, 50);

        jPanel10.setBackground(new java.awt.Color(0, 88, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(254, 254, 254)));
        jPanel10.setPreferredSize(new java.awt.Dimension(111, 50));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
        });
        jPanel10.setLayout(null);

        buscar.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        buscar.setForeground(new java.awt.Color(253, 248, 248));
        buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/buscar.png"))); // NOI18N
        buscar.setText("BUSCAR");
        buscar.setBorder(null);
        buscar.setBorderPainted(false);
        buscar.setContentAreaFilled(false);
        buscar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        buscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/buscar1.png"))); // NOI18N
        buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buscarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buscarMouseEntered(evt);
            }
        });
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel10.add(buscar);
        buscar.setBounds(30, 0, 131, 50);

        jPanel13.setBackground(new java.awt.Color(0, 88, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(252, 245, 245)));
        jPanel13.setPreferredSize(new java.awt.Dimension(111, 50));
        jPanel13.setLayout(null);

        ayuda.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        ayuda.setForeground(new java.awt.Color(253, 248, 248));
        ayuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info.png"))); // NOI18N
        ayuda.setText(" AYUDA");
        ayuda.setBorder(null);
        ayuda.setBorderPainted(false);
        ayuda.setContentAreaFilled(false);
        ayuda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ayuda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/info1.png"))); // NOI18N
        ayuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ayudaMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ayudaMouseEntered(evt);
            }
        });
        ayuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaActionPerformed(evt);
            }
        });
        jPanel13.add(ayuda);
        ayuda.setBounds(30, 0, 131, 50);

        jPanel12.setBackground(new java.awt.Color(0, 88, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));
        jPanel12.setPreferredSize(new java.awt.Dimension(111, 50));
        jPanel12.setLayout(null);

        reporte.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        reporte.setForeground(new java.awt.Color(253, 248, 248));
        reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reporte.png"))); // NOI18N
        reporte.setText("REPORTE");
        reporte.setBorder(null);
        reporte.setBorderPainted(false);
        reporte.setContentAreaFilled(false);
        reporte.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reporte.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reporte1.png"))); // NOI18N
        reporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                reporteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                reporteMouseExited(evt);
            }
        });
        reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporteActionPerformed(evt);
            }
        });
        jPanel12.add(reporte);
        reporte.setBounds(30, 0, 131, 50);

        jLabel9.setBackground(new java.awt.Color(94, 92, 92));
        jLabel9.setForeground(new java.awt.Color(253, 251, 251));
        jLabel9.setText("<html> Copyright © 2019 Interactive  <br>Programmers Community  </html>");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 0, 250, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
  public void verficar(){
      
     if (btn1.isSelected()) {
            comida="SALCHIPAPAS";codigo="802950";precio=2.50;
        } if (btn2.isSelected()) {
            comida="SANDICH";codigo="802951";precio=5.0;
        } if (btn3.isSelected()) {
            comida="FISH AND CHIPS";codigo="802952";precio=7.0;
        } if (btn4.isSelected()) {
            comida="BOCADILLOS";codigo="802953";precio=1.50;
        } if (btn5.isSelected()) {
            comida="TACOS";codigo="802954";precio=3.00;
        } if (btn6.isSelected()) {
            comida="CHORI PAN";codigo="802955";precio=4.70;
        } if (btn7.isSelected()) {
            comida="BATIDO";codigo="802956";precio=5.30;
        } if (btn8.isSelected()) {
            comida="POLLITO FRITO";codigo="802957";precio=10.00;
        } if (btn9.isSelected()) {
            comida="SNACKS";codigo="802958";precio=2.50;
        } if (btn10.isSelected()) {
            comida="PIZZA";codigo="802959";precio=7.00;
        } if (btn11.isSelected()) {
            comida="HAMBURGUEZA";codigo="802960";precio=8.50;
        } if (btn12.isSelected()) {
            comida="PERRITO CALIENTE";codigo="802961";precio=6.00;
        } if (btn13.isSelected()) {
            comida="PAPAS FRITAS";codigo="802962";precio=2.50;
        } if (btn14.isSelected()) {
            comida="BUTIFARA";codigo="802963";precio=8.00;
        }
        
  }
     
    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
       
        verficar();
        if (comida.equals("")) {
            JOptionPane.showMessageDialog(null,"DEBE SELCCIONAR COMIDA PORFAVOR");
        }else{
           
        modelo=(DefaultTableModel)datos.getModel();
            objects[0]=(datos.getRowCount()+1);
            objects[1]=codigo;
            objects[2]=comida;
            objects[3]="S/. "+(precio);
            ban+=precio;
               
         monto.setText(" S/. "+Math.round(ban*100.0)/100.0);
         modelo.addRow(objects); 
         
        }
     
    }//GEN-LAST:event_ingresarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
   
           if(0<=datos.getSelectedRow()) {
           int [] rows = datos.getSelectedRows(); 
           Arrays.sort(rows);
           for (int i=rows.length-1; i>=0; i--) {  
        String num=(String) datos.getValueAt(datos.getSelectedRow(), 3);
        num=num.substring(3);
        ban-=Double.parseDouble(num);
        monto.setText(" S/. "+Math.round(ban*100.0)/100.0);
        modelo.removeRow(rows[i]); 
             }
        }else{
             JOptionPane.showMessageDialog(null,"DEBE SELCCIONAR FILA PARA ELIMINAR POR FAVOR");
         }
         datos.clearSelection ();
         
    }//GEN-LAST:event_eliminarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        
        try {
            verficar();
            datos.clearSelection ();
            String op="";
     
            op=JOptionPane.showInputDialog("1.-BUSCAR DATO DENTRO DE LA TABLA\n2.-BUSCAR DATO FUERA DE LA TABLA\n3.-Salir.");
            switch(op){
            case "1":
            for (int i = 0; i < datos.getRowCount(); i++) {
            if (datos.getValueAt(i, 2).equals(comida)) {                                           
                  datos.changeSelection(i,2, false, false);
                  break;
                        }
                }
            break;
             
            case "2":   
            JOptionPane.showMessageDialog(null,"CODIGO:"+codigo+"\nCOMIDA:"
            +comida+"\nPRECIO: $/ "+(precio));
            break;
            
            case "3":
            break;
            
            default:
            JOptionPane.showMessageDialog(null, "INGRESO UNA OPCION INVALIDA");
            break;
          } 
        } catch (Exception e) {
        }
            
    }//GEN-LAST:event_buscarActionPerformed

    private void reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporteActionPerformed
         
           try {
         
               File ficher=new File("archivo.xls");
           FileWriter fil=new FileWriter(ficher);
           for (int i = 0; i < modelo.getColumnCount(); i++) {
               fil.write(modelo.getColumnName(i)+"\t");
           }
           fil.write("\n");
           for (int i = 0; i < modelo.getRowCount(); i++) {
               for (int j = 0; j< modelo.getColumnCount(); j++) {
               fil.write(modelo.getValueAt(i, j).toString()+"\t");
           }fil.write("\n");
           }fil.write("\n TOTAL \t"+monto.getText());
           fil.close();
           
          JOptionPane.showMessageDialog(null,"REPORTE SE CREO CON EXITO");
           Desktop.getDesktop().open(ficher);
            //busca_archiv(ficher);
                } catch (Exception e) {
           JOptionPane.showMessageDialog(null,"ERROR EL ARCHIVO NO SE CREO");
       }
           
    }//GEN-LAST:event_reporteActionPerformed
  
    public void busca_archiv(File file) throws IOException{

                 String request = JOptionPane.showInputDialog("Introduce texto a buscar dentro del archivo:");
                                  try {
	 BufferedReader reader = new BufferedReader(new FileReader(file));
		String line = "";
        
		while((line = reader.readLine())!= null){
                    System.out.println(line);
			if(line.indexOf(request)!= -1){
		JOptionPane.showMessageDialog(null,line. split("\t"));
                        
				}
                       
			}reader.close();
                                    System.out.println(file.toURI());
	 	} catch (FileNotFoundException e) {e.printStackTrace();
		} catch (IOException   e) {e.printStackTrace();
		}
    
           }
    
    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
    
        try {
        int ax = JOptionPane.showConfirmDialog(null, "SELECCIONASTES CELDA PARA MODIFICAR");
        String op="",id ="",codigo1 = "",comida1 ="";
        double precio1=0;
        
        if(ax == JOptionPane.YES_NO_OPTION) {
        int selc=datos.getSelectedRow();
      
             op=JOptionPane.showInputDialog("1.-CAMBIAR ID\n2.-CAMBIAR CODIGO\n3.-CAMBIAR COMIDA"
                + "\n4.-CAMBIAR PRECIO\n5.-CAMBIAR TODO\n6.-SALIR");
            switch(op){
                case "1":
                    id=JOptionPane.showInputDialog( null,"INGRESE SE ID");
                    codigo1=codigo;
                    comida1=comida;
                    precio1=precio;
                    break;
                case "2":
                    codigo1=JOptionPane.showInputDialog( null ,"INGRESE SE CODIGO");
                    id=(String) datos.getValueAt(datos.getSelectedRow(), 0);
                    comida1=comida;
                    precio1=precio;
                    break;
                case "3":
                    comida1=JOptionPane.showInputDialog( null ,"INGRESE SE COMIDA");
                    id=(String) datos.getValueAt(datos.getSelectedRow(), 0);
                    codigo1=codigo;
                    precio1=precio;
                    break;
                case "4":
                    precio1=Double.parseDouble(JOptionPane.showInputDialog( null ,"INGRESE SE PRECIO"));
                    codigo1=codigo;
                    comida1=comida;
                    id=(String) datos.getValueAt(datos.getSelectedRow(), 0);
                    break;
                case "5":
                     id=JOptionPane.showInputDialog( null,"INGRESE SE ID");
                     codigo1=JOptionPane.showInputDialog( null ,"INGRESE SE CODIGO");
                     comida1=JOptionPane.showInputDialog( null ,"INGRESE SE COMIDA");
                     precio1=Double.parseDouble(JOptionPane.showInputDialog( null ,"INGRESE SE PRECIO"));
                    break;
                case "6":
                     break;
                default:
                    JOptionPane.showMessageDialog(null, "INGRESO UNA OPCION INVALIDA");
                    break;

            }
            
          String [] contenido=new String[4];
          contenido[0]=id;
          contenido[1]=codigo1;
          contenido[2]=comida1;
          contenido[3]="S/."+(precio1);
     
             for(int i = 0; i <datos.getColumnCount(); i++) {
                 modelo.setValueAt(contenido[i], selc,i);
             }
                }else{
                JOptionPane.showMessageDialog(null, "SELECCIONE CELDA PORFAVOR");           
             }
        } catch (Exception e) {
        }

    }//GEN-LAST:event_modificarActionPerformed

    private void ayudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaActionPerformed
      
        JOptionPane.showMessageDialog(null, "<html><b>• INGRESAR: </b>seleccione la categoria de comida entre las opciones"
               + "\n<html>automaticamente se mostraran el codigo y  monto del producto  en la tabla."
               + "\n<html><b>• ELIMINAR:</b> debe seleccionar la celda para  eliminar los datos."
               + "\n<html><b>• MODIFICAR:</b>se mostrara un sub_menu puedes elejir el dato que deceses"
               + "\n<html>modificar."
               + "\n<html><b>• BUSCAR:</b> se mostrara un sub_menu podras buscar datos fuera y dentro"
               + "\n<html>de la tabla."
               + "\n<html><b>• REPORTE:</b> se guarda los datos del reporte y se abrira"
               + "<html>el archivo del reporte.");
 
    }//GEN-LAST:event_ayudaActionPerformed

    int xy;
    int xx;
    
    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        xx = evt.getX();
        xy = evt.getY();
        jPanel4.setCursor(new Cursor(Cursor.MOVE_CURSOR));
    }//GEN-LAST:event_jPanel4MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
     
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
       
    }//GEN-LAST:event_jPanel2MouseDragged

    private void cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarMouseClicked

        int op=JOptionPane.showConfirmDialog(null,"DESEAS SALIR DE FOOD SYSTEM","ADVERTENCIA",JOptionPane.OK_OPTION);
        if (op==JOptionPane.YES_OPTION) {
        time_end = System.currentTimeMillis();
        System.out.println("total time "+ (( time_end - time_start )/1000) +" seconds"); 
        System.exit(0);
        }
        
        
    }//GEN-LAST:event_cerrarMouseClicked

    private void ingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseEntered
       
       jPanel7.setBorder(BorderFactory.createLineBorder(Color.black));
       jPanel7.setBackground(new Color(0,38,255));
       ingresar.setForeground(Color.black);
     
    }//GEN-LAST:event_ingresarMouseEntered

    private void ingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseExited
       
       jPanel7.setBorder(BorderFactory.createLineBorder(Color.white));
       jPanel7.setBackground(new Color(0,88,255));
       ingresar.setForeground(Color.white);
       
    }//GEN-LAST:event_ingresarMouseExited

    private void jPanel4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseReleased
       jPanel4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jPanel4MouseReleased

    private void eliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseEntered
       jPanel8.setBorder(BorderFactory.createLineBorder(Color.black));
       jPanel8.setBackground(new Color(0,38,255));
       eliminar.setForeground(Color.black);
    }//GEN-LAST:event_eliminarMouseEntered

    private void modificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseEntered
       jPanel9.setBorder(BorderFactory.createLineBorder(Color.black));
       jPanel9.setBackground(new Color(0,38,255));
       modificar.setForeground(Color.black);
    }//GEN-LAST:event_modificarMouseEntered

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
       
    }//GEN-LAST:event_jPanel10MouseEntered

    private void buscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseEntered
        jPanel10.setBorder(BorderFactory.createLineBorder(Color.black));
        jPanel10.setBackground(new Color(0,38,255));
        buscar.setForeground(Color.black);
    }//GEN-LAST:event_buscarMouseEntered

    private void reporteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteMouseEntered
       jPanel12.setBorder(BorderFactory.createLineBorder(Color.black));
       jPanel12.setBackground(new Color(0,38,255));
       reporte.setForeground(Color.black);
    }//GEN-LAST:event_reporteMouseEntered

    private void ayudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudaMouseEntered
       jPanel13.setBorder(BorderFactory.createLineBorder(Color.black));
       jPanel13.setBackground(new Color(0,38,255));
       ayuda.setForeground(Color.black);
    }//GEN-LAST:event_ayudaMouseEntered

    private void eliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarMouseExited
       jPanel8.setBorder(BorderFactory.createLineBorder(Color.white));
       jPanel8.setBackground(new Color(0,88,255));
       eliminar.setForeground(Color.white);
    }//GEN-LAST:event_eliminarMouseExited

    private void modificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarMouseExited
       jPanel9.setBorder(BorderFactory.createLineBorder(Color.white));
       jPanel9.setBackground(new Color(0,88,255));
       modificar.setForeground(Color.white);
    }//GEN-LAST:event_modificarMouseExited

    private void buscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscarMouseExited
       jPanel10.setBorder(BorderFactory.createLineBorder(Color.white));
       jPanel10.setBackground(new Color(0,88,255));
       buscar.setForeground(Color.white);
    }//GEN-LAST:event_buscarMouseExited

    private void reporteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reporteMouseExited
       jPanel12.setBorder(BorderFactory.createLineBorder(Color.white));
       jPanel12.setBackground(new Color(0,88,255));
       reporte.setForeground(Color.white);
    }//GEN-LAST:event_reporteMouseExited

    private void ayudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ayudaMouseExited
       jPanel13.setBorder(BorderFactory.createLineBorder(Color.white));
       jPanel13.setBackground(new Color(0,88,255));
       ayuda.setForeground(Color.white);
    }//GEN-LAST:event_ayudaMouseExited

    private void cerrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar1MouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_cerrar1MouseClicked

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1ActionPerformed

   
    public static void main(String args[]) {
      
        try {

            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
           
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame().setVisible(true);
        
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ayuda;
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn10;
    private javax.swing.JRadioButton btn11;
    private javax.swing.JRadioButton btn12;
    private javax.swing.JRadioButton btn13;
    private javax.swing.JRadioButton btn14;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JRadioButton btn3;
    private javax.swing.JRadioButton btn4;
    private javax.swing.JRadioButton btn5;
    private javax.swing.JRadioButton btn6;
    private javax.swing.JRadioButton btn7;
    private javax.swing.JRadioButton btn8;
    private javax.swing.JRadioButton btn9;
    private javax.swing.JButton buscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cerrar;
    private javax.swing.JLabel cerrar1;
    private javax.swing.JTable datos;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JLabel monto;
    private javax.swing.JButton reporte;
    // End of variables declaration//GEN-END:variables

}
