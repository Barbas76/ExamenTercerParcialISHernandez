
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

public class CRUDLibros extends javax.swing.JFrame {
        //objetos de conexion
        public  Connection cn;//conexion a BD
        public  Statement stmt;//Instrucciones SQL querys de BD
        public  ResultSet rs;//Resultado final de datos
    

    public CRUDLibros() { //Inicia constructor
        initComponents();
        this.setTitle("Software CRUD Hernandez Libros");
        this.setLocationRelativeTo(this);//Centrar
    }//Termina constructor

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

        btnPrueba = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtConsulta = new javax.swing.JTable();
        btnActualizar = new javax.swing.JButton();
        panAltaLibro = new javax.swing.JPanel();
        lblIdLibro = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblAutor = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtIdLibro = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnRegistrarLibro = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        panBorrarLibro = new javax.swing.JPanel();
        lblCapturaIDBorrar = new javax.swing.JLabel();
        txtIdLibroEliminar = new javax.swing.JTextField();
        btnEliminarLibro = new javax.swing.JButton();
        btnLimpirarL = new javax.swing.JButton();
        panEditar = new javax.swing.JPanel();
        lblIdLibro1 = new javax.swing.JLabel();
        txtIdLibro1 = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        lblPrecio1 = new javax.swing.JLabel();
        txtPrecio1 = new javax.swing.JTextField();
        lblAutor1 = new javax.swing.JLabel();
        txtAutor1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnPrueba.setText("Prueba de conexion");
        btnPrueba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPruebaActionPerformed(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setText("Software IS CRUD HERNANDEZ ALTA LIBROS");

        jtConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id Libro", "Nombre", "Precio", "Autor"
            }
        ));
        jScrollPane1.setViewportView(jtConsulta);

        btnActualizar.setText("Actualizar Datos");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        panAltaLibro.setBorder(javax.swing.BorderFactory.createTitledBorder("Alta Libros"));

        lblIdLibro.setText("Id Libro");

        lblNombre.setText("Nombre");

        lblPrecio.setText("Precio");

        lblAutor.setText("Autor");

        btnRegistrarLibro.setText("Registrar Libro");
        btnRegistrarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarLibroActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpirar Datos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAltaLibroLayout = new javax.swing.GroupLayout(panAltaLibro);
        panAltaLibro.setLayout(panAltaLibroLayout);
        panAltaLibroLayout.setHorizontalGroup(
            panAltaLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLibroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistrarLibro))
            .addGroup(panAltaLibroLayout.createSequentialGroup()
                .addGroup(panAltaLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAltaLibroLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblIdLibro))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAltaLibroLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panAltaLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAutor, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18)
                .addGroup(panAltaLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panAltaLibroLayout.setVerticalGroup(
            panAltaLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAltaLibroLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panAltaLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdLibro)
                    .addComponent(txtIdLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panAltaLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panAltaLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panAltaLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(panAltaLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnRegistrarLibro))
                .addContainerGap())
        );

        panBorrarLibro.setBorder(javax.swing.BorderFactory.createTitledBorder("Borrar Libro"));

        lblCapturaIDBorrar.setText("Captura el ID del equipo");

        btnEliminarLibro.setText("Eliminar Equipo");
        btnEliminarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarLibroActionPerformed(evt);
            }
        });

        btnLimpirarL.setText("Limpirar");
        btnLimpirarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpirarLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panBorrarLibroLayout = new javax.swing.GroupLayout(panBorrarLibro);
        panBorrarLibro.setLayout(panBorrarLibroLayout);
        panBorrarLibroLayout.setHorizontalGroup(
            panBorrarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorrarLibroLayout.createSequentialGroup()
                .addGroup(panBorrarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panBorrarLibroLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCapturaIDBorrar))
                    .addGroup(panBorrarLibroLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(panBorrarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEliminarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdLibroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panBorrarLibroLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpirarL)
                .addGap(52, 52, 52))
        );
        panBorrarLibroLayout.setVerticalGroup(
            panBorrarLibroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panBorrarLibroLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblCapturaIDBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(txtIdLibroEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpirarL)
                .addGap(11, 11, 11)
                .addComponent(btnEliminarLibro)
                .addGap(25, 25, 25))
        );

        panEditar.setBorder(javax.swing.BorderFactory.createTitledBorder("Busqueda-Editar Libro"));

        lblIdLibro1.setText("Id Libro Editar");

        lblNombre1.setText("Nombre Editar");

        lblPrecio1.setText("Precio Editar");

        lblAutor1.setText("Autor Editar");

        btnBuscar.setText("Buscar libro por ID");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar Libro");
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
                            .addComponent(lblPrecio1)
                            .addComponent(lblNombre1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addComponent(lblIdLibro1)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblAutor1)
                        .addGap(18, 18, 18)
                        .addComponent(txtAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panEditarLayout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditar)))
                .addGap(38, 38, Short.MAX_VALUE))
        );
        panEditarLayout.setVerticalGroup(
            panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panEditarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdLibro1)
                    .addComponent(txtIdLibro1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre1)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio1)
                    .addComponent(txtPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor1)
                    .addComponent(txtAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panEditarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnEditar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(btnActualizar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnPrueba))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(panAltaLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panBorrarLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(panEditar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(210, 210, 210))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(btnPrueba)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panBorrarLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panAltaLibro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(panEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnActualizar)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPruebaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPruebaActionPerformed
        //Llamada a la conexion de BD
        conectarBase();
    }//GEN-LAST:event_btnPruebaActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        try{//inicia try    Estructura de control para trataminento de errores
                 conectarBase();//llamada  a la conexion a BD
                 //Objeto Model es para almacenar  y guardar los valores de la tabla
                 DefaultTableModel modeloDatos = new DefaultTableModel();
                 jtConsulta.setModel(modeloDatos);
                 rs=stmt.executeQuery("Select * from t_libros");
                 ResultSetMetaData rsmd=rs.getMetaData();
                 int cantidadColumnas=rsmd.getColumnCount();
                 modeloDatos.addColumn("Id Libro ");
                 modeloDatos.addColumn("Nombre");
                 modeloDatos.addColumn("Precio");
                 modeloDatos.addColumn("Autor");
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

    private void btnRegistrarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarLibroActionPerformed
        conectarBase(); //llamada a la conexion de BD
        //declaracion de variables de entrada
        int idLibro=Integer.parseInt(txtIdLibro.getText());
        String nombre=txtNombre.getText();
        float precio=Float.parseFloat(txtPrecio.getText());
        String autor=txtAutor.getText();
       
        //proceso guardar en la base de datos
  String altaProductoLibro="INSERT INTO t_libros VALUES ('"+idLibro+"','"+nombre+"','"+precio+"','"+autor+"')";
        try {//estructura de control de tratamiento de errores
            //Ejecutar instruccion de alta
            stmt.executeUpdate(altaProductoLibro);
            JOptionPane.showMessageDialog(null, "Se agrego libro de forma correcta\n"+nombre);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD de Alta :\n"+ e);
        }//termina catch
        
    }//GEN-LAST:event_btnRegistrarLibroActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.txtIdLibro.setText(null);
        this.txtAutor.setText(null);
        this.txtNombre.setText(null);
        this.txtPrecio.setText(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarLibroActionPerformed
        conectarBase();
        int confirmaBaja;//varibale bandera 1 si elimino y 0 no elimino
        try {
           
            int productoBajaLibro=Integer.parseInt(txtIdLibroEliminar.getText());
            confirmaBaja=stmt.executeUpdate("DELETE FROM t_libros WHERE IDLIBRO = '"+productoBajaLibro+"'");
            if (confirmaBaja==1) {//si elimino
                JOptionPane.showMessageDialog(null,"Se dio de baja el Id de LIBRO : \n"+productoBajaLibro);
            } else {
                JOptionPane.showMessageDialog(null,"Error no existe ese ID de LIBRO  : \nVerifica  codigo");
            }
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null,"Error de BD de baja o eliminar verifica\n"+ e);
        }
    }//GEN-LAST:event_btnEliminarLibroActionPerformed

    private void btnLimpirarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpirarLActionPerformed
        this.txtIdLibroEliminar.setText(null);
    }//GEN-LAST:event_btnLimpirarLActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
  
        try { //estrucutra de control de tratamiento de errores
            conectarBase(); //llamada a la base de datos
            int idLibroMod=Integer.parseInt(this.txtIdLibro1.getText());
            //instruccion para buscar usuario
            rs=stmt.executeQuery("SELECT * FROM t_libros where idlibro='"+idLibroMod+"'");
            JOptionPane.showMessageDialog(null, "Buscando Producto...");
            if (rs.next()==true) {
                this.txtNombre1.setText(rs.getString("nombre"));
                this.txtPrecio1.setText(rs.getString("precio"));
                this.txtAutor1.setText(rs.getString("autor"));
            } else {
                 JOptionPane.showMessageDialog(null, "Error no existe ese ID de Libro\nVerifica");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error de BD en busqueda de Libro"+ e);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String editarSQL="";  // variable de tipo STRING inicializada en vacio
        try { //Estrucutra de control de tratamiento de errores
            conectarBase();
            int idLibroMod=Integer.parseInt(this.txtIdLibro1.getText());
            String nombre = this.txtNombre1.getText();
            float precio = Float.parseFloat(this.txtPrecio1.getText()); 
            String autor = this.txtAutor1.getText();
           
editarSQL="UPDATE t_libros SET nombre = '"+nombre+"',precio = '"+precio+"', autor='"+autor+"' where idlibro = '"+idLibroMod+"'";
                 stmt.executeUpdate(editarSQL);
           
                 JOptionPane.showMessageDialog(null, "Producto actualizado\nVerifica tu consulta");
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,"Error de BD Al actualizar producto/n"+ e);
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CRUDLibros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarLibro;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpirarL;
    private javax.swing.JButton btnPrueba;
    private javax.swing.JButton btnRegistrarLibro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtConsulta;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JLabel lblAutor1;
    private javax.swing.JLabel lblCapturaIDBorrar;
    private javax.swing.JLabel lblIdLibro;
    private javax.swing.JLabel lblIdLibro1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblPrecio1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panAltaLibro;
    private javax.swing.JPanel panBorrarLibro;
    private javax.swing.JPanel panEditar;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAutor1;
    private javax.swing.JTextField txtIdLibro;
    private javax.swing.JTextField txtIdLibro1;
    private javax.swing.JTextField txtIdLibroEliminar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtPrecio1;
    // End of variables declaration//GEN-END:variables
}
