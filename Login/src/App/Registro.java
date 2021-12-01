package App;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Raymond De La Rosa
 */
public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();

        //Para que la interfaz este en centro
        this.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        Minimiza = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre_Usario = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNumero_Telefeno = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        txtPass_Config = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnvolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Registro");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/verificar.png"))); // NOI18N

        Minimiza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_MINIMIZAR.png"))); // NOI18N
        Minimiza.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizaMouseClicked(evt);
            }
        });

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_X.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Minimiza, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Cerrar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Minimiza, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Cerrar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Apellido");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 157, 65, 27));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Número de teléfono");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 259, -1, 27));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Nombre de usuario");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 68, -1, 27));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Correo electrónico");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 202, -1, 27));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Nombre");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 106, 66, 27));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Contraseña");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 304, -1, 27));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("Confirmar contraseña");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 349, -1, 27));

        txtNombre_Usario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtNombre_Usario, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 68, 180, -1));

        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 161, 180, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 110, 180, -1));

        txtCorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 206, 180, -1));

        txtNumero_Telefeno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtNumero_Telefeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 259, 180, -1));

        txtPass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 308, 180, -1));

        txtPass_Config.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(txtPass_Config, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 353, 180, -1));

        btnRegistrar.setText("Registro");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, -1, -1));

        btnvolver.setText("Volver");
        btnvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnvolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:

        //para salir
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿DESEA SALIR?", "SALIR", a);
        if (resultado == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_CerrarMouseClicked

    private void MinimizaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizaMouseClicked
        // TODO add your handling code here:

        //para minimizar la ventana
        this.setState(Login.ICONIFIED);
    }//GEN-LAST:event_MinimizaMouseClicked

    private void btnvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvolverActionPerformed

        //Funcion para volver login 
        Login prueba = new Login();
        prueba.setVisible(true);
        hide();

    }//GEN-LAST:event_btnvolverActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // Logica del boton de registro

        String Nombre_usuario = txtNombre_Usario.getText();
        String Nombre = txtNombre.getText();
        String Apellido = txtApellido.getText();
        String Correo = txtCorreo.getText();
        String Numero_telefono = txtNumero_Telefeno.getText();
        String Pass_congi = txtPass_Config.getText();
        String Pass = txtPass.getText();

        String codigo = "insert into Clientes (nombre_Usuario, nombre, apellido, Correo, Numero_telefono, pass, pass_Conf) values ('" + Nombre_usuario + "', '" + Nombre + "', '" + Apellido + "', '" + Correo + "', '" + Numero_telefono + "', '" + Pass + "', '" + Pass_congi + "')";

        if (Nombre_usuario.isEmpty() || Nombre.isEmpty() || Apellido.isEmpty() || Correo.isEmpty() || Numero_telefono.isEmpty() || Pass.isEmpty() || Pass_congi.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");

        } else {
            if (txtPass_Config.getText().equals(txtPass.getText())) {

                Conexion conexion = new Conexion();
                Statement st = conexion.conectar();

                try {

                    ResultSet rs = st.executeQuery(codigo);

                } catch (SQLException EX) {

                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    inicio ir = new inicio();
                    ir.setVisible(true);
                    hide();

                }

            } else {
                JOptionPane.showMessageDialog(null, "Contraseña diferente");

            }

        }


    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Minimiza;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnvolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre_Usario;
    private javax.swing.JTextField txtNumero_Telefeno;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtPass_Config;
    // End of variables declaration//GEN-END:variables
}
