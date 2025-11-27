package JTable;
import base.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Jtable extends javax.swing.JFrame {
    // Crea un objeto de la clase Conexion (supongo que es una clase personalizada)
Conexion con1 = new Conexion();
// Crea una variable para almacenar la conexión a la base de datos
   Connection conet;
   // Crea un modelo de tabla predeterminado
   DefaultTableModel modelo;
   // Crea un objeto de tipo Statement para ejecutar instrucciones SQL
   Statement st;
   // Crea un objeto de tipo ResultSet para almacenar los resultados de las consultas SQL
   ResultSet rs;
  // Crea una variable de tipo entero para almacenar el ID del registro actualmente seleccionado en la tabla 
   int idc;
    public Jtable() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Producto = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        Descripcion = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ID:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Producto");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Cantidad:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Descripcion: ");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 159, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel6))))
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel5))
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 87, Short.MAX_VALUE))))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Inventario de anime shop");

        Agregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Modificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Nuevo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Nuevo.setText("Limpiar");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        Tabla.setBackground(new java.awt.Color(204, 255, 204));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Producto", "Cantidad", "Descripcion"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(87, 87, 87))
            .addGroup(layout.createSequentialGroup()
                .addComponent(Agregar)
                .addGap(26, 26, 26)
                .addComponent(Modificar)
                .addGap(26, 26, 26)
                .addComponent(Eliminar)
                .addGap(30, 30, 30)
                .addComponent(Nuevo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Agregar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Nuevo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        //se obtiene la fila seleccionada por el usuario en la tabla
        int fila = Tabla.getSelectedRow();
        //si no se ha seleccionado ninguna fila, se muestra un mensaje de error
        if (fila == -1) {
           JOptionPane.showMessageDialog(null, "No selecciono fila");
           //si se ha seleccionado una fila, se obtienen los valores de las celdas de la fila seleccionada y se asignan a las variables idc, nom, raz y col
        } else {
            //se obtiene el valor de la celda en la primera columna (columna 0) de la fila seleccionada y se convierte a un entero para asignarlo a la variable idc
            idc = Integer.parseInt((String) Tabla.getValueAt(fila,0) .toString());
            //se obtiene el valor de la celda en la segunda columna (columna 1) de la fila seleccionada y se asigna a la variable nom
            String producto = (String) Tabla.getValueAt(fila,1);
            //se obtiene el valor de la celda en la tercera columna (columna 2) de la fila seleccionada y se asigna a la variable raz
            String cantidad = (String) Tabla.getValueAt(fila, 2);
            // se obtiene el valor de la celda en la cuarta columna (columna 3) de la fila seleccionada y se asigna a la variable col
            String descripcion = (String) Tabla.getValueAt(fila, 2);
            
            Id.setText(""+idc); //se establece el valor de idc en el campo de texto Id
            Producto.setText(producto); //se establece el valor de nom en el campo de texto Nombre
            Cantidad.setText(cantidad); //se establece el valor de raz en el campo de texto Raza
            Descripcion.setText(descripcion); //se establece el valor de col en el campo de texto Color
            
        }
    }//GEN-LAST:event_TablaMouseClicked

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        // TODO add your handling code here:
        Nuevo ();
    }//GEN-LAST:event_NuevoActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        Eliminar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_EliminarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        Modificar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_ModificarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        Agregar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_AgregarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jtable().setVisible(true);
            }
        });
    }
    // Este método se llama Modificar y no devuelve ningún valor
  void Modificar() {
      // Obtiene los valores de los campos de texto Id, Nombre, Raza y Color
        String id = Id.getText();
        String producto = Producto.getText();
        String cantidad = Cantidad.getText();
        String descripcion = Descripcion.getText();
        
        try {
            // Verifica si alguno de los campos está vacío
            if (id.equals("") || producto.equals("")|| cantidad.equals("")||descripcion.equals("")) {
                 // Si algún campo está vacío, muestra un mensaje de alerta
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            }else {
                // Si todos los campos tienen valores, crea una cadena SQL para actualizar el registro seleccionado
                String sql  = "Update Inventario set id='"+idc+"', Producto='"+producto+"', Cantidad='"+cantidad+"', Descripcion='"+descripcion+"' where ID=" + idc;
                // Obtiene una conexión a la base de datos
            conet = con1.getConnection();
            // Crea una nueva declaración SQL utilizando la conexión
            st = conet.createStatement();
            // Ejecuta la instrucción SQL para actualizar el registro seleccionado en la tabla animal
            st.executeUpdate(sql);
            // Muestra un mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Datos de inventario modificados");
                    // Limpia la tabla
                    limpiarTabla();
            }
        }catch (Exception e){
            // Si ocurre algún error durante la ejecución, lo atrapa y no hace nada
        }
}
  // Este método se llama consultar y no devuelve ningún valor
    void consultar() {
        // Crea una cadena SQL para seleccionar todos los registros de la tabla animal
        String sql="select * from Inventario";
        
        try{
            // Obtiene una conexión a la base de datos
            conet = con1.getConnection();
            // Crea una nueva declaración SQL utilizando la conexión
            st = conet.createStatement();
            // Ejecuta la instrucción SQL para seleccionar todos los registros de la tabla animal
            rs = st.executeQuery(sql);
            // Crea un arreglo de objetos con una longitud de 4 elementos
            Object[] tienda = new Object[4];
            // Obtiene el modelo de tabla predeterminado de la tabla
            modelo = (DefaultTableModel) Tabla.getModel();
            // Recorre todos los registros seleccionados y agrega sus valores a la tabla
            while (rs.next()){
                tienda [0] = rs.getInt("Id");
                tienda [1] = rs.getString("Producto");
                tienda [2] = rs.getString("Cantidad");
                tienda [3] = rs.getString("Descripcion");
                
                modelo.addRow(tienda);
            }
            // Establece el modelo de tabla actualizado en la tabla
            Tabla.setModel(modelo);            
        }catch (Exception e){
            // Si ocurre algún error durante la ejecución, lo atrapa y no hace nada
    }
    }    
    
    void Agregar(){
        // Obtiene los valores de los campos de texto Id, Nombre, Raza y Color
        String id = Id.getText();
        String producto = Producto.getText();
        String cantidad = Cantidad.getText();
        String descripcion = Descripcion.getText();
        try {
            // Verifica si alguno de los campos está vacío
            if (id.equals("") || producto.equals("") || cantidad.equals("") || descripcion.equals("")) {
                // Si algún campo está vacío, muestra un mensaje de alerta
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
                 // Limpia la tabla, probablemente para borrar cualquier registro existente
            limpiarTabla();
            }else {
                // Si todos los campos tienen valores, crea una cadena SQL para insertar un nuevo registro
            String sql  = "insert into Inventario(Id, Producto, Cantidad, Descripcion) values ('"+id+"','"+producto+"','"+cantidad+"','"+descripcion+"')";
            // Obtiene una conexión a la base de datos
            conet = con1.getConnection();
            // Crea una nueva declaración SQL utilizando la conexión
            st = conet.createStatement();
            // Ejecuta la instrucción SQL para insertar un nuevo registro en la tabla animal
            st.executeUpdate(sql);
             // Muestra un mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Articulo agregado");
                     // Limpia la tabla
                    limpiarTabla();
            }
        }catch (Exception e){
             // Si ocurre algún error durante la ejecución, lo atrapa y no hace nada    
        }
    }
    void limpiarTabla() { // se define la función llamada limpiarTabla() que no devuelve ningún valor (void)
        for (int i = 0; i <=Tabla.getRowCount(); i++){ //se inicia un bucle for que recorre todas las filas de la tabla. La variable i se inicia en cero y se incrementa en uno en cada iteración
            modelo.removeRow(i); //dentro del bucle, se llama al método removeRow() del objeto modelo (que es un DefaultTableModel) para eliminar la fila i de la tabla.
            i = i-1; //debido a que se eliminó una fila de la tabla, se debe restar uno a la variable i para asegurarse de que todas las filas se eliminan correctamente
        }
    }
    // Este método se encarga de eliminar un registro de la base de datos que corresponda con el animal seleccionado en la tabla
    void Eliminar() {
        // Se obtiene el número de fila seleccionado en la tabla
        int fila = Tabla.getSelectedRow();
        try {
            // Si no se ha seleccionado ninguna fila, se muestra un mensaje de advertencia indicando que debe seleccionarse una fila
            if(fila<0) {
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                limpiarTabla();
            }else {
                // Si se ha seleccionado una fila, se construye una consulta SQL que elimina el registro correspondiente al animal seleccionado
                String sql = "Delete from Inventario where Id="+idc;//Cambiar form from
                // Se obtiene la conexión a la base de datos y se crea un objeto Statement para ejecutar la consulta
                conet = con1.getConnection();
                st = conet.createStatement();
                // Se ejecuta la consulta
                st.execute(sql);
                // Se muestra un mensaje indicando que el animal ha sido eliminado
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                // Se llama al método limpiarTabla() para actualizar la tabla
                limpiarTabla();
            }
        } catch (Exception e) {
        }
    }
    void Nuevo(){
        Id.setText("");//establece el valor del campo de texto Id en una cadena vacía, lo que borra cualquier valor que hubiera estado presente anteriormente
        Producto.setText(""); //hace lo mismo para el campo Nombre
        Cantidad.setText(""); // hace lo mismo para el campo Raza
        Descripcion.setText(""); //hace lo mismo para el campo Color
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Descripcion;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Id;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JTextField Producto;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
