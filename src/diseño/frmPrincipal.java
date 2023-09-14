package diseño;

import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import negocio.EventosMause;
import negocio.ValorMoneda;
/**
 *
 * @author Yeison
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }
    
    private final EventosMause objDivisas = new EventosMause(); 
    
    private JLabel[] getMonedaOrigen(){
        return new JLabel[]{lblDeYen, lblDeWon,
                lblDeLibraEsterlina, lblDeEuro, lblDeDolar, lblDePesos};
    }

    private JLabel[] getMonedaDestino(){
        return new JLabel[]{lblAyen, lblAwon,
                lblAlibraEsterlina, lblAeuro, lblAdolar, lblApesos};
    }
    
    private void calcularDivisa(){
        String divisa = "";
        ValorMoneda objMoneda = new ValorMoneda();
        
        JLabel monedaActual[] = {lblDeYen, lblDeWon,
                lblDeLibraEsterlina, lblDeEuro, lblDeDolar, lblDePesos};
        JLabel monedaDestino[] = {lblAyen, lblAwon,
                lblAlibraEsterlina, lblAeuro, lblAdolar, lblApesos};
        
        if (!txtValor.getText().equals("")) {
            for (JLabel monedaUno : monedaActual) {
                if (monedaUno.getForeground().equals(Color.RED)) {
                    divisa = monedaUno.getText();
                    break;
                }
            }
            for (JLabel monedaDos : monedaDestino) {
                if (monedaDos.getForeground().equals(Color.RED)) {
                    divisa += monedaDos.getText();
                    break;
                }
            }
            txtNuevoValor.setText(String.format("%.2f", objMoneda.getNuevoValor(divisa, txtValor.getText())));
        }
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        txtNuevoValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblDePesos = new javax.swing.JLabel();
        lblDeDolar = new javax.swing.JLabel();
        lblDeEuro = new javax.swing.JLabel();
        lblDeLibraEsterlina = new javax.swing.JLabel();
        lblDeYen = new javax.swing.JLabel();
        lblDeWon = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblApesos = new javax.swing.JLabel();
        lblAdolar = new javax.swing.JLabel();
        lblAeuro = new javax.swing.JLabel();
        lblAlibraEsterlina = new javax.swing.JLabel();
        lblAyen = new javax.swing.JLabel();
        lblAwon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 300));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(java.awt.Color.black);

        lblCerrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblCerrar.setForeground(java.awt.Color.red);
        lblCerrar.setText("X");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Conversor de divisas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(83, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(62, 62, 62)
                .addComponent(lblCerrar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCerrar)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 325, -1));

        jPanel3.setBackground(java.awt.Color.white);
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtValor.setText("0");
        txtValor.setBorder(null);
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtValorKeyReleased(evt);
            }
        });

        txtNuevoValor.setEditable(false);
        txtNuevoValor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtNuevoValor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNuevoValor.setText("0");
        txtNuevoValor.setBorder(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("<ENTER>");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtValor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap())
            .addComponent(txtNuevoValor, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNuevoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 79, -1, -1));

        lblDePesos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDePesos.setText("COP");
        lblDePesos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDePesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDePesosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDePesosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDePesosMouseExited(evt);
            }
        });

        lblDeDolar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDeDolar.setText("USD");
        lblDeDolar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeDolar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeDolarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDeDolarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDeDolarMouseExited(evt);
            }
        });

        lblDeEuro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDeEuro.setText("EUR");
        lblDeEuro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeEuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeEuroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDeEuroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDeEuroMouseExited(evt);
            }
        });

        lblDeLibraEsterlina.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDeLibraEsterlina.setText("GBP");
        lblDeLibraEsterlina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeLibraEsterlina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeLibraEsterlinaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDeLibraEsterlinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDeLibraEsterlinaMouseExited(evt);
            }
        });

        lblDeYen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDeYen.setText("JPY");
        lblDeYen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeYen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeYenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDeYenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDeYenMouseExited(evt);
            }
        });

        lblDeWon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDeWon.setText("KRW");
        lblDeWon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDeWon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDeWonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblDeWonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblDeWonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblDePesos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeDolar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeEuro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeLibraEsterlina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeYen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeWon)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDePesos)
                    .addComponent(lblDeDolar)
                    .addComponent(lblDeEuro)
                    .addComponent(lblDeLibraEsterlina)
                    .addComponent(lblDeYen)
                    .addComponent(lblDeWon))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 30));

        lblApesos.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblApesos.setText("COP");
        lblApesos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblApesos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblApesosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblApesosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblApesosMouseExited(evt);
            }
        });

        lblAdolar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAdolar.setText("USD");
        lblAdolar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAdolar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdolarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdolarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdolarMouseExited(evt);
            }
        });

        lblAeuro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAeuro.setText("EUR");
        lblAeuro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAeuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAeuroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAeuroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAeuroMouseExited(evt);
            }
        });

        lblAlibraEsterlina.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAlibraEsterlina.setText("GBP");
        lblAlibraEsterlina.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAlibraEsterlina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAlibraEsterlinaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAlibraEsterlinaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAlibraEsterlinaMouseExited(evt);
            }
        });

        lblAyen.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAyen.setText("JPY");
        lblAyen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAyen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAyenMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAyenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAyenMouseExited(evt);
            }
        });

        lblAwon.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAwon.setText("KRW");
        lblAwon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblAwon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAwonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAwonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAwonMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(lblApesos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdolar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAeuro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAlibraEsterlina)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAyen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAwon)
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApesos)
                    .addComponent(lblAdolar)
                    .addComponent(lblAeuro)
                    .addComponent(lblAlibraEsterlina)
                    .addComponent(lblAyen)
                    .addComponent(lblAwon))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void lblDePesosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDePesosMouseEntered
        objDivisas.cambiarColor(evt, lblDePesos);
    }//GEN-LAST:event_lblDePesosMouseEntered

    private void lblDePesosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDePesosMouseExited
        objDivisas.cambiarColor(evt, lblDePesos);
    }//GEN-LAST:event_lblDePesosMouseExited

    private void lblDeDolarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeDolarMouseEntered
        objDivisas.cambiarColor(evt, lblDeDolar);
    }//GEN-LAST:event_lblDeDolarMouseEntered

    private void lblDeDolarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeDolarMouseExited
        objDivisas.cambiarColor(evt, lblDeDolar);
    }//GEN-LAST:event_lblDeDolarMouseExited

    private void lblDeEuroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeEuroMouseEntered
        objDivisas.cambiarColor(evt, lblDeEuro);
    }//GEN-LAST:event_lblDeEuroMouseEntered

    private void lblDeEuroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeEuroMouseExited
        objDivisas.cambiarColor(evt, lblDeEuro);
    }//GEN-LAST:event_lblDeEuroMouseExited

    private void lblDeLibraEsterlinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeLibraEsterlinaMouseEntered
        objDivisas.cambiarColor(evt, lblDeLibraEsterlina);
    }//GEN-LAST:event_lblDeLibraEsterlinaMouseEntered

    private void lblDeLibraEsterlinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeLibraEsterlinaMouseExited
        objDivisas.cambiarColor(evt, lblDeLibraEsterlina);
    }//GEN-LAST:event_lblDeLibraEsterlinaMouseExited

    private void lblDeYenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeYenMouseEntered
        objDivisas.cambiarColor(evt, lblDeYen);
    }//GEN-LAST:event_lblDeYenMouseEntered

    private void lblDeYenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeYenMouseExited
        objDivisas.cambiarColor(evt, lblDeYen);
    }//GEN-LAST:event_lblDeYenMouseExited

    private void lblDeWonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeWonMouseEntered
        objDivisas.cambiarColor(evt, lblDeWon);
    }//GEN-LAST:event_lblDeWonMouseEntered

    private void lblDeWonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeWonMouseExited
        objDivisas.cambiarColor(evt, lblDeWon);
    }//GEN-LAST:event_lblDeWonMouseExited

    private void lblApesosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApesosMouseEntered
        objDivisas.cambiarColor(evt, lblApesos);
    }//GEN-LAST:event_lblApesosMouseEntered

    private void lblApesosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApesosMouseExited
        objDivisas.cambiarColor(evt, lblApesos);
    }//GEN-LAST:event_lblApesosMouseExited

    private void lblAdolarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdolarMouseEntered
        objDivisas.cambiarColor(evt, lblAdolar);
    }//GEN-LAST:event_lblAdolarMouseEntered

    private void lblAdolarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdolarMouseExited
        objDivisas.cambiarColor(evt, lblAdolar);
    }//GEN-LAST:event_lblAdolarMouseExited

    private void lblAeuroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAeuroMouseEntered
        objDivisas.cambiarColor(evt, lblAeuro);
    }//GEN-LAST:event_lblAeuroMouseEntered

    private void lblAeuroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAeuroMouseExited
        objDivisas.cambiarColor(evt, lblAeuro);
    }//GEN-LAST:event_lblAeuroMouseExited

    private void lblAlibraEsterlinaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlibraEsterlinaMouseEntered
        objDivisas.cambiarColor(evt, lblAlibraEsterlina);
    }//GEN-LAST:event_lblAlibraEsterlinaMouseEntered

    private void lblAlibraEsterlinaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlibraEsterlinaMouseExited
        objDivisas.cambiarColor(evt, lblAlibraEsterlina);
    }//GEN-LAST:event_lblAlibraEsterlinaMouseExited

    private void lblAyenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyenMouseEntered
        objDivisas.cambiarColor(evt, lblAyen);
    }//GEN-LAST:event_lblAyenMouseEntered

    private void lblAyenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyenMouseExited
        objDivisas.cambiarColor(evt, lblAyen);
    }//GEN-LAST:event_lblAyenMouseExited

    private void lblAwonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAwonMouseEntered
       objDivisas.cambiarColor(evt, lblAwon);
    }//GEN-LAST:event_lblAwonMouseEntered

    private void lblAwonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAwonMouseExited
        objDivisas.cambiarColor(evt, lblAwon);
    }//GEN-LAST:event_lblAwonMouseExited
  
    private void lblDePesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDePesosMouseClicked
        objDivisas.seleccionarDivisa(evt, lblDePesos, getMonedaOrigen());
    }//GEN-LAST:event_lblDePesosMouseClicked

    private void lblDeDolarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeDolarMouseClicked
        objDivisas.seleccionarDivisa(evt, lblDeDolar,getMonedaOrigen());
    }//GEN-LAST:event_lblDeDolarMouseClicked

    private void lblDeEuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeEuroMouseClicked
        objDivisas.seleccionarDivisa(evt, lblDeEuro,getMonedaOrigen());
    }//GEN-LAST:event_lblDeEuroMouseClicked

    private void lblDeLibraEsterlinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeLibraEsterlinaMouseClicked
        objDivisas.seleccionarDivisa(evt, lblDeLibraEsterlina,getMonedaOrigen());
    }//GEN-LAST:event_lblDeLibraEsterlinaMouseClicked

    private void lblDeYenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeYenMouseClicked
        objDivisas.seleccionarDivisa(evt, lblDeYen,getMonedaOrigen());
    }//GEN-LAST:event_lblDeYenMouseClicked

    private void lblDeWonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDeWonMouseClicked
        objDivisas.seleccionarDivisa(evt, lblDeWon,getMonedaOrigen());
    }//GEN-LAST:event_lblDeWonMouseClicked

    private void lblApesosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblApesosMouseClicked
        objDivisas.seleccionarDivisa(evt, lblApesos, getMonedaDestino());
    }//GEN-LAST:event_lblApesosMouseClicked

    private void lblAdolarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdolarMouseClicked
        objDivisas.seleccionarDivisa(evt, lblAdolar, getMonedaDestino());
    }//GEN-LAST:event_lblAdolarMouseClicked

    private void lblAeuroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAeuroMouseClicked
        objDivisas.seleccionarDivisa(evt, lblAeuro, getMonedaDestino());
    }//GEN-LAST:event_lblAeuroMouseClicked

    private void lblAlibraEsterlinaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAlibraEsterlinaMouseClicked
        objDivisas.seleccionarDivisa(evt, lblAlibraEsterlina, getMonedaDestino());
    }//GEN-LAST:event_lblAlibraEsterlinaMouseClicked

    private void lblAyenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAyenMouseClicked
        objDivisas.seleccionarDivisa(evt, lblAyen, getMonedaDestino());
    }//GEN-LAST:event_lblAyenMouseClicked

    private void lblAwonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAwonMouseClicked
        objDivisas.seleccionarDivisa(evt, lblAwon, getMonedaDestino());
    }//GEN-LAST:event_lblAwonMouseClicked

    private void txtValorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            calcularDivisa();
        }
    }//GEN-LAST:event_txtValorKeyReleased

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblAdolar;
    private javax.swing.JLabel lblAeuro;
    private javax.swing.JLabel lblAlibraEsterlina;
    private javax.swing.JLabel lblApesos;
    private javax.swing.JLabel lblAwon;
    private javax.swing.JLabel lblAyen;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblDeDolar;
    private javax.swing.JLabel lblDeEuro;
    private javax.swing.JLabel lblDeLibraEsterlina;
    private javax.swing.JLabel lblDePesos;
    private javax.swing.JLabel lblDeWon;
    private javax.swing.JLabel lblDeYen;
    private javax.swing.JTextField txtNuevoValor;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
