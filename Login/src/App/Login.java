package App;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Ray
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Prueba
     */
    public Login() {
        initComponents();

        //Para que la interfaz este en centro
        this.setLocationRelativeTo(null);
        // Para Ocultar icono de ocultar
        this.Ocultar.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_User = new javax.swing.JTextField();
        Iniciar_sesion = new javax.swing.JLabel();
        txt_Pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        Ver = new javax.swing.JLabel();
        Ocultar = new javax.swing.JLabel();
        btnRegistros = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Minimizar = new javax.swing.JLabel();
        Cerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_User.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txt_User.setBorder(null);
        txt_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_UserActionPerformed(evt);
            }
        });
        jPanel1.add(txt_User, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 250, 20));

        Iniciar_sesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Ingresar.png"))); // NOI18N
        Iniciar_sesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Iniciar_sesionMouseClicked(evt);
            }
        });
        jPanel1.add(Iniciar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 120, -1));

        txt_Pass.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_Pass.setBorder(null);
        txt_Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PassActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 250, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/LOGIN.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        Ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ver_32px.png"))); // NOI18N
        Ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerMouseClicked(evt);
            }
        });
        jPanel1.add(Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        Ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ocultar_32px.png"))); // NOI18N
        Ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OcultarMouseClicked(evt);
            }
        });
        jPanel1.add(Ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));

        btnRegistros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRegistros.setText("Registro");
        btnRegistros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrosMouseClicked(evt);
            }
        });
        jPanel1.add(btnRegistros, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_MINIMIZAR.png"))); // NOI18N
        Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizarMouseClicked(evt);
            }
        });
        jPanel1.add(Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 60, 40));

        Cerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_X.png"))); // NOI18N
        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        jPanel1.add(Cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 70, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_UserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_UserActionPerformed

    private void VerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerMouseClicked

        //Funcion de ver clave
        Ver.setVisible(false);
        Ocultar.setVisible(true);
        txt_Pass.setEchoChar((char) 0);

    }//GEN-LAST:event_VerMouseClicked

    private void OcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarMouseClicked

        //Funcion de ocultar clave
        Ver.setVisible(true);
        Ocultar.setVisible(false);
        txt_Pass.setEchoChar('●');

    }//GEN-LAST:event_OcultarMouseClicked

    private void Iniciar_sesionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Iniciar_sesionMouseClicked

        // Logica del login con ealgonus if anidados
        String usuario = txt_User.getText();
        String pass = txt_Pass.getText();

        if (usuario.isEmpty() || pass.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes ingresar su usuario y contraseña, si no está registrado debe registrarse");
        } else {

            Conexion conexion = new Conexion();
            Statement st = conexion.conectar();

            try {
                ResultSet rs = st.executeQuery("select * from Clientes where nombre_Usuario='" + usuario + "' and pass='" + pass + "'");
                rs.last();
                int encontrado = rs.getRow();

                if (encontrado == 1) {
                    JOptionPane.showMessageDialog(null, "Login Exitoso");

                    inicio ir = new inicio();
                    ir.setVisible(true);
                    hide();

                } else {
                    txt_User.setText("");
                    txt_Pass.setText("");
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña Incorrecta");

                }
            } catch (SQLException EX) {
                JOptionPane.showMessageDialog(null, EX);

            }

        }

    }//GEN-LAST:event_Iniciar_sesionMouseClicked

    private void txt_PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PassActionPerformed

    private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
        // TODO add your handling code here:

        //Funcion para salir
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this, "¿DESEA SALIR?", "SALIR", a);
        if (resultado == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_CerrarMouseClicked

    private void MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizarMouseClicked

        //Funcion minimizar el Login
        this.setState(Login.ICONIFIED);

    }//GEN-LAST:event_MinimizarMouseClicked

    private void btnRegistrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrosMouseClicked

        //funcion del boton de registro 
        Registro registro = new Registro();
        registro.setVisible(true);
        hide();


    }//GEN-LAST:event_btnRegistrosMouseClicked

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cerrar;
    private javax.swing.JLabel Iniciar_sesion;
    private javax.swing.JLabel Minimizar;
    private javax.swing.JLabel Ocultar;
    private javax.swing.JLabel Ver;
    private javax.swing.JLabel btnRegistros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_Pass;
    private javax.swing.JTextField txt_User;
    // End of variables declaration//GEN-END:variables
}
