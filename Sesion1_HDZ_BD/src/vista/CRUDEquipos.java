
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

public class CRUDEquipos extends javax.swing.JFrame {
      //objetos de conexion
        public  Connection cn;//conexion a BD
        public  Statement stmt;//Instrucciones SQL querys de BD
        public  ResultSet rs;//Resultado final de datos  
    
    
    public CRUDEquipos() {
        initComponents();
        this.setTitle("Software CRUD Hernandez Equipos");
        this.setLocationRelativeTo(this);//Centrar
    }//Termina constructor
    
    //metodo para conectar a base  de datos
    public void conectarBase() {//inicia metodo conectar
        try {//inicia try
            //puente de conexion
            Class.forName("com.mysql.jdbc.Driver");//puente de conexion
            cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_is_hernandez", "root", "");
            stmt = cn.createStatement();//genera sentencias sql
            JOptionPane.showMessageDialog(null, "CONEXION BD ESTABLECIDA EQUIPOS \nhernandez");
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
        panAltaEquipo = new javax.swing.JPanel();
        lblIdEquipo = new javax.swing.JLabel();
        lblMarca = new javax.swing.JLabel();
        lblModelo = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        txtIdEquipo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnRegistrarEquipo = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        panEditar = new javax.swing.JPanel();
        lblIdEquipo1 = new javax.swing.JLabel();
        txtIdEquipo1 = new javax.swing.JTextField();
        lblMarca1 = new javax.swing.JLabel();
        txtMarca1 = new javax.swing.JTextField();
        lblModelo1 = new javax.swing.JLabel();
        txtModelo1 = new javax.swing.JTextField();
        lblPrecio1 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnPrueba = new javax.swing.JButton();
        panBorrarEquipo = new javax.swing.JPanel();
        lblCapturaIDBorrar = new javax.swing.JLabel();
        txtIdEquipoEliminar = new javax.swing.JTextField();
        btnEliminarEquipo = new javax.swing.JButton();
        btnLimpirarE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Software IS CRUD HERNANDEZ ALTA EQUIPOS");

        panAltaEquipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Alta Equipos"));

        lblIdEquipo.setText("Id Equipo");

        lblMarca.setText("Marca");

        lblModelo.setText("Modelo");

        lblPrecio.setText("Precio");

        btnRegistrarEquipo.setText("Registrar Equipo");
        btnRegistrarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEquipoActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpirar Datos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAltaEquipoLayout = new javax.swing.GroupLayout(panAltaEquipo);
        panAltaEquipo.setLayout(panAltaEquipoLayout);
        panAltaEquipoLayout.setHorizontalGroup(
            panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaEquipoLayout.createSequentialGroup()
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAltaEquipoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblIdEquipo))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAltaEquipoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMarca, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblModelo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAltaEquipoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarEquipo))
        );
        panAltaEquipoLayout.setVerticalGroup(
            panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaEquipoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEquipo)
                    .addComponent(txtIdEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panAltaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnRegistrarEquipo))
                .addGap(219, 219, 219))
        );

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Equipo", "Marca", "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        btnActualizar.setText("Actualizar Datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        panEditar.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda-Editar Equipo"));

        lblIdEquipo1.setText("Id Equipo Editar");

        txtIdEquipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEquipo1ActionPerformed(evt);
            }
        });

        lblMarca1.setText("Marca Editar");

        lblModelo1.setText("Modelo Editar");

        lblPrecio1.setText("Precio Editar");

        btnBuscar.setText("Buscar equipo por ID");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar Equipo");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panEditarLayout = new javax.swing.GroupLayout(panEditar);
        panEditar.setLayout(panEditarLayout);
        panEditarLayout.setHorizontalGroup(
            panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblModelo1)
                            .addComponent(lblMarca1))
                        .addGap(30, 30, 30)
                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMarca1)
                            .addComponent(txtModelo1)
                            .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addComponent(lblIdEquipo1)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblPrecio1))
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panEditarLayout.setVerticalGroup(
            panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdEquipo1)
                    .addComponent(txtIdEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMarca1)
                    .addComponent(txtMarca1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblModelo1)
                    .addComponent(txtModelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio1)
                    .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        btnPrueba.setText("Prueba de conexion");
        btnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaActionPerformed(evt);
            }
        });

        panBorrarEquipo.setBorder(javax.swing.BorderFactory.createTitledBorder("Borrar Equipo"));

        lblCapturaIDBorrar.setText("Captura el ID del equipo");

        btnEliminarEquipo.setText("Eliminar Equipo");
        btnEliminarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarEquipoActionPerformed(evt);
            }
        });

        btnLimpirarE.setText("Limpirar");
        btnLimpirarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpirarEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBorrarEquipoLayout = new javax.swing.GroupLayout(panBorrarEquipo);
        panBorrarEquipo.setLayout(panBorrarEquipoLayout);
        panBorrarEquipoLayout.setHorizontalGroup(
            panBorrarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorrarEquipoLayout.createSequentialGroup()
                .addGroup(panBorrarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBorrarEquipoLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(panBorrarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdEquipoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCapturaIDBorrar)
                            .addComponent(btnEliminarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panBorrarEquipoLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnLimpirarE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panBorrarEquipoLayout.setVerticalGroup(
            panBorrarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorrarEquipoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCapturaIDBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(txtIdEquipoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimpirarE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminarEquipo)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 43, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btnPrueba)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(panAltaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panBorrarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(436, 436, 436)
                        .addComponent(btnActualizar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(lblTitulo)
                        .addGap(46, 46, 46))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPrueba)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panEditar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(panAltaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panBorrarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnActualizar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEquipoActionPerformed
        
        conectarBase(); //llamada a la conexion de BD
        //declaracion de variables de entrada
        int idequipo=Integer.parseInt(txtIdEquipo.getText());
        String marca=txtMarca.getText();
        String modelo=txtModelo.getText();
        float precio=Float.parseFloat(txtPrecio.getText());
       
        //proceso guardar en la base de datos
  String altaProductoLibro="INSERT INTO bdexahernandezis248 VALUES ('"+idequipo+"','"+marca+"','"+modelo+"','"+precio+"')";
        try {//estructura de control de tratamiento de errores
            //Ejecutar instruccion de alta
            stmt.executeUpdate(altaProductoLibro);
            JOptionPane.showMessageDialog(null, "Se agrego el equipo de forma correcta\n"+marca);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD de Alta :\n"+ e);
        }//termina catch

    }//GEN-LAST:event_btnRegistrarEquipoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtIdEquipo.setText(null);
        this.txtMarca.setText(null);
        this.txtModelo.setText(null);
        this.txtPrecio.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        try{//inicia try    Estructura de control para trataminento de errores
                 conectarBase();//llamada  a la conexion a BD
                 //Objeto Model es para almacenar  y guardar los valores de la tabla
                 DefaultTableModel modeloDatos = new DefaultTableModel();
                 jtConsulta.setModel(modeloDatos);
                 rs=stmt.executeQuery("Select * from bdexahernandezis248");
                 ResultSetMetaData rsmd=rs.getMetaData();
                 int cantidadColumnas=rsmd.getColumnCount();
                 modeloDatos.addColumn("idequipo ");
                 modeloDatos.addColumn("marca");
                 modeloDatos.addColumn("modelo");
                 modeloDatos.addColumn("precio");
                 while (rs.next()) { //inicia                    
                     //arreglo objetos para imprimir filas
                     Object [] fila = new Object[cantidadColumnas];
                     for (int i = 0; i < cantidadColumnas; i++) {//inicia for
                         fila[i]=rs.getObject(i+1);
                     }//termina for
                     modeloDatos.addRow(fila);
                 }//termina while
             }catch(SQLException ex){
                 JOptionPane.showMessageDialog(null,"Error de BD en consulta verifica\n"+ ex);
             }//terrmina catch
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarEquipoActionPerformed
    
        conectarBase();
        int confirmaBaja;//varibale bandera 1 si elimino y 0 no elimino
        try {
           
            int productoBajaEquipo=Integer.parseInt(txtIdEquipoEliminar.getText());
            confirmaBaja=stmt.executeUpdate("DELETE FROM bdexahernandezis248 WHERE idequipo  = '"+productoBajaEquipo+"'");
            if (confirmaBaja==1) {//si elimino
                JOptionPane.showMessageDialog(null,"Se dio de baja el Id del EQUIPO : \n"+productoBajaEquipo);
            } else {
                JOptionPane.showMessageDialog(null,"Error no existe ese ID del EQUIPO  : \nVerifica  codigo");
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error de BD de baja o eliminar verifica\n"+ e);
        }
    }//GEN-LAST:event_btnEliminarEquipoActionPerformed

    private void btnLimpirarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpirarEActionPerformed
        this.txtIdEquipoEliminar.setText(null);
    }//GEN-LAST:event_btnLimpirarEActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        try { //estrucutra de control de tratamiento de errores
            conectarBase(); //llamada a la base de datos
            int idEquipoMod=Integer.parseInt(this.txtIdEquipo1.getText());
            //instruccion para buscar usuario
            rs=stmt.executeQuery("SELECT * FROM bdexahernandezis248 where idequipo ='"+idEquipoMod+"'");
            JOptionPane.showMessageDialog(null, "Buscando Producto...");
            if (rs.next()==true) {
                this.txtMarca1.setText(rs.getString("marca"));
                this.txtModelo1.setText(rs.getString("modelo"));
                this.txtPrecio1.setText(rs.getString("precio"));
            } else {
                 JOptionPane.showMessageDialog(null, "Error no existe ese ID de Equipo\nVerifica");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en busqueda de Equipo"+ e);
        }
      
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
    
        String editarSQL="";  // variable de tipo STRING inicializada en vacio
        try { //Estrucutra de control de tratamiento de errores
            conectarBase();
            int idEquipoMod=Integer.parseInt(this.txtIdEquipo1.getText());
            String marca = this.txtMarca1.getText(); 
            String modelo = this.txtModelo1.getText();
            float precio = Float.parseFloat(this.txtPrecio1.getText());
           
editarSQL="UPDATE bdexahernandezis248 SET marca = '"+marca+"',modelo = '"+modelo+"', precio='"+precio+"' where idequipo  = '"+idEquipoMod+"'";
                 stmt.executeUpdate(editarSQL);
           
                 JOptionPane.showMessageDialog(null, "Producto actualizado\nVerifica tu consulta");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error de BD Al actualizar producto/n"+ e);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void txtIdEquipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEquipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEquipo1ActionPerformed

    private void btnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaActionPerformed
        conectarBase();
    }//GEN-LAST:event_btnPruebaActionPerformed

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
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CRUDEquipos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDEquipos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarEquipo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpirarE;
    private javax.swing.JButton btnPrueba;
    private javax.swing.JButton btnRegistrarEquipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblCapturaIDBorrar;
    private javax.swing.JLabel lblIdEquipo;
    private javax.swing.JLabel lblIdEquipo1;
    private javax.swing.JLabel lblMarca;
    private javax.swing.JLabel lblMarca1;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblModelo1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panAltaEquipo;
    private javax.swing.JPanel panBorrarEquipo;
    private javax.swing.JPanel panEditar;
    private javax.swing.JTextField txtIdEquipo;
    private javax.swing.JTextField txtIdEquipo1;
    private javax.swing.JTextField txtIdEquipoEliminar;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMarca1;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtModelo1;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio1;
    // End of variables declaration//GEN-END:variables
}
