
package vista;
//Librerias de conexion
import javax.swing.JOptionPane;//ventanas emergentes
import java.sql.Connection;//conexion a BD
import java.sql.DriverManager;//Controlador de java a MySQL
import java.sql.Statement;//Instrucciones SQL querys de BD
import java.sql.ResultSet;//Resultado final de datos
import java.sql.SQLException;//Trabajar errors de base de datos
import java.sql.*;//Libreria general de base de datos
import java.io.*;//Entrada y salidad de datos
import javax.swing.table.DefaultTableModel;//Modelo de datos

public class Acceso extends javax.swing.JFrame {

    //objetos de conexion
        public  Connection cn;//conexion a BD
        public  Statement stmt;//Instrucciones SQL querys de BD
        public  ResultSet rs;//Resultado final de datos
        
    public Acceso() { //inicia constructor 
        initComponents();
    } //termina consturctor

    //metodo para conectar a base  de datos
    public void conectarBase() {//inicia metodo conectar
        try {//inicia try
            //puente de conexion
            Class.forName("com.mysql.jdbc.Driver");//puente de conexion
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_is_hernandez", "root", "");
            stmt = cn.createStatement();//genera sentencias sql
            JOptionPane.showMessageDialog(null, "CONEXION BD ESTABLECIDA \nhernandez");
        } catch (SQLException ex) {//inicia exeption
            JOptionPane.showMessageDialog(null, ex);
        } catch (Exception e) {//inica exception errores generales
            JOptionPane.showMessageDialog(null, e);
        }
    }//Termino metodo conectar a base de datos 
    
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        panEntrada = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblPasswordAcceso = new javax.swing.JLabel();
        txtUsuarioAcceso = new javax.swing.JTextField();
        txtPasswordAccesoo = new javax.swing.JPasswordField();
        btnEntrarSistema = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Hernandez");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("Acceso al sistema Hernandez");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(322, 6, -1, -1));

        panEntrada.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        panEntrada.setForeground(new java.awt.Color(255, 255, 255));

        lblUsuario.setText("Usuario");

        lblPasswordAcceso.setText("Password");

        txtUsuarioAcceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioAccesoActionPerformed(evt);
            }
        });

        txtPasswordAccesoo.setText("jPa");

        btnEntrarSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario3.png"))); // NOI18N
        btnEntrarSistema.setText("Entrar a sistema");
        btnEntrarSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarSistemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEntradaLayout = new javax.swing.GroupLayout(panEntrada);
        panEntrada.setLayout(panEntradaLayout);
        panEntradaLayout.setHorizontalGroup(
            panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntradaLayout.createSequentialGroup()
                .addGroup(panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEntradaLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPasswordAcceso)
                            .addComponent(lblUsuario))
                        .addGap(56, 56, 56)
                        .addGroup(panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuarioAcceso)
                            .addComponent(txtPasswordAccesoo, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
                    .addGroup(panEntradaLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(btnEntrarSistema)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        panEntradaLayout.setVerticalGroup(
            panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEntradaLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario)
                    .addComponent(txtUsuarioAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panEntradaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPasswordAcceso)
                    .addComponent(txtPasswordAccesoo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnEntrarSistema)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        getContentPane().add(panEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logosyscati.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 68, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo - copia.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarSistemaActionPerformed

        try{
              String usuario = txtUsuarioAcceso.getText();
              String pass = txtPasswordAccesoo.getText();
                   boolean error = true;
                      conectarBase();
                   rs = stmt.executeQuery("select * from t_usuarios");
        while (rs.next() == true){
            if (usuario.equals(rs.getString("usuario")) && pass.equals(rs.getString("password"))){
                        error = false;
                CRUDLibros accesoSistema = new CRUDLibros();//llamada a interface
               
     JOptionPane.showMessageDialog(null, "Bienvenido a Sistema\n Usuario Administrador :\n\n" + usuario );
                accesoSistema.setVisible(true);//muestra ventana
                this.hide();//oculta ventana anterior
            }      
        }
        if (error == true){
            JOptionPane.showMessageDialog(null, "Error al ingresar datos.\n Verifique");
            this.txtUsuarioAcceso.setText(null);
            this.txtPasswordAccesoo.setText(null);
            this.txtUsuarioAcceso.requestFocus();//pocisiona cursor a caja usuario
        }
      } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Error de BD Validacion: \n\n"+ ex);
      }
    }//GEN-LAST:event_btnEntrarSistemaActionPerformed

    private void txtUsuarioAccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioAccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioAccesoActionPerformed

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
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarSistema;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblPasswordAcceso;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panEntrada;
    private javax.swing.JPasswordField txtPasswordAccesoo;
    private javax.swing.JTextField txtUsuarioAcceso;
    // End of variables declaration//GEN-END:variables
}
