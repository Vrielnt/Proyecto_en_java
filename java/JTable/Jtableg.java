package JTable;
import base.Conexion2;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Jtableg extends javax.swing.JFrame {
    // Crea un objeto de la clase Conexion (supongo que es una clase personalizada)
Conexion2 conc1 = new Conexion2();
// Crea una variable para almacenar la conexión a la base de datos
   Connection conet;
   // Crea un modelo de tabla predeterminado
   DefaultTableModel modelo;
   // Crea un objeto de tipo Statement para ejecutar instrucciones SQL
   Statement st;
   // Crea un objeto de tipo ResultSet para almacenar los resultados de las consultas SQL
   ResultSet rs;
  // Crea una variable de tipo entero para almacenar el ID del registro actualmente seleccionado en la tabla 
   int idf;
    public Jtableg() {
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
        Id = new javax.swing.JTextField();
        Nombre = new javax.swing.JTextField();
        Direccion = new javax.swing.JTextField();
        Contacto = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("ID:");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Nombre:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Direccion:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Contacto:");

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
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Agregar)
                        .addComponent(Modificar, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Eliminar))
                    .addComponent(Nuevo))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nuevo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(Direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(Contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Proveedores de anime shop");

        Tabla.setBackground(new java.awt.Color(204, 255, 204));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Direccion", "Contacto"
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
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(93, 93, 93))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:
        Eliminar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_EliminarActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
        Agregar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:
        Modificar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_ModificarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
     // TODO add your handling code here:
     Nuevo ();
     
    }//GEN-LAST:event_NuevoActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        //se obtiene la fila seleccionada por el usuario en la tabla
        int fila = Tabla.getSelectedRow();
        //si no se ha seleccionado ninguna fila, se muestra un mensaje de error
        if (fila == -1) {
           JOptionPane.showMessageDialog(null, "No selecciono fila");
           //si se ha seleccionado una fila, se obtienen los valores de las celdas de la fila seleccionada y se asignan a las variables idc, nom, raz y col
        } else {
            //se obtiene el valor de la celda en la primera columna (columna 0) de la fila seleccionada y se convierte a un entero para asignarlo a la variable idc
            idf = Integer.parseInt((String) Tabla.getValueAt(fila,0) .toString());
            //se obtiene el valor de la celda en la segunda columna (columna 1) de la fila seleccionada y se asigna a la variable nom
            String nombre = (String) Tabla.getValueAt(fila,1);
            //se obtiene el valor de la celda en la tercera columna (columna 2) de la fila seleccionada y se asigna a la variable raz
            String direccion = (String) Tabla.getValueAt(fila, 2);
            // se obtiene el valor de la celda en la cuarta columna (columna 3) de la fila seleccionada y se asigna a la variable col
            String contacto = (String) Tabla.getValueAt(fila, 3);
            
            Id.setText(""+idf); //se establece el valor de idc en el campo de texto Id
            Nombre.setText(nombre); //se establece el valor de nom en el campo de texto Nombre
            Direccion.setText(direccion);//se establece el valor de raz en el campo de texto Raza
            Contacto.setText(contacto); //se establece el valor de col en el campo de texto Color  
        }
    }//GEN-LAST:event_TablaMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jtableg().setVisible(true);
            }
        });
    }
          void Modificar() {
      // Obtiene los valores de los campos de texto Id, Nombre, Raza y Color
        String id = Id.getText();
        String nombre = Nombre.getText();
        String direccion = Direccion.getText();
        String contacto = Contacto.getText();        
        try {
            if (id.equals("") || nombre.equals("")|| direccion.equals("")||contacto.equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            }else{
                String sql  = "Update Proveedores set ID='"+idf+"', Nombre='"+nombre+"', Direccion='"+direccion+"', Contacto='"+contacto+"' where ID=" + idf;
                conet = conc1.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null, "Datos de proveedor modificados");
                 limpiarTabla();                
            }
        }catch (Exception e){            
        }
      }
        void consultar() {
        // Crea una cadena SQL para seleccionar todos los registros de la tabla animal
        String sql = "select * from Proveedores";       
        try{
            // Obtiene una conexión a la base de datos
            conet = conc1.getConnection();
            // Crea una nueva declaración SQL utilizando la conexión
            st = conet.createStatement();
            // Ejecuta la instrucción SQL para seleccionar todos los registros de la tabla animal
            rs = st.executeQuery(sql);
            // Crea un arreglo de objetos con una longitud de 4 elementos
            Object[] proveedor = new Object[4];
            // Obtiene el modelo de tabla predeterminado de la tabla
            modelo = (DefaultTableModel) Tabla.getModel();
            // Recorre todos los registros seleccionados y agrega sus valores a la tabla
            while (rs.next()){
                proveedor [0] = rs.getInt("ID");
                proveedor [1] = rs.getString("Nombre");
                proveedor [2] = rs.getString("Direccion");
                proveedor [3] = rs.getString("Contacto");
                modelo.addRow(proveedor);
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
        String nombre = Nombre.getText();
        String direccion = Direccion.getText();
        String contacto = Contacto.getText();
        try {
            // Verifica si alguno de los campos está vacío
            if (id.equals("") || nombre.equals("") || direccion.equals("") || contacto.equals("")) {
                // Si algún campo está vacío, muestra un mensaje de alerta
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
                 // Limpia la tabla, probablemente para borrar cualquier registro existente
            limpiarTabla();
            }else {
                // Si todos los campos tienen valores, crea una cadena SQL para insertar un nuevo registro
            String sql  = "insert into Proveedores(ID, Nombre, Direccion, Contacto) values ('"+id+"','"+nombre+"','"+direccion+"','"+contacto+"')";
            // Obtiene una conexión a la base de datos
            conet = conc1.getConnection();
            // Crea una nueva declaración SQL utilizando la conexión
            st = conet.createStatement();
            // Ejecuta la instrucción SQL para insertar un nuevo registro en la tabla animal
            st.executeUpdate(sql);
             // Muestra un mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Nueva venta agregada");
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
        
            void Eliminar() {
        // Se obtiene el número de fila seleccionado en la tabla
        int fila = Tabla.getSelectedRow();
        try {
            // Si no se ha seleccionado ninguna fila, se muestra un mensaje de advertencia indicando que debe seleccionarse una fila
            if(fila<0) {
                JOptionPane.showMessageDialog(null, "Venta eliminado");
                limpiarTabla();
            }else {
                // Si se ha seleccionado una fila, se construye una consulta SQL que elimina el registro correspondiente al animal seleccionado
                String sql = "Delete from Proveedores where ID="+idf;//Cambiar form from
                // Se obtiene la conexión a la base de datos y se crea un objeto Statement para ejecutar la consulta
                conet = conc1.getConnection();
                st = conet.createStatement();
                // Se ejecuta la consulta
                st.execute(sql);
                // Se muestra un mensaje indicando que el animal ha sido eliminado
                JOptionPane.showMessageDialog(null, "Proveedor eliminado");
                // Se llama al método limpiarTabla() para actualizar la tabla
                limpiarTabla();
            }
        } catch (Exception e) {
        }
    }
 void Nuevo(){
        Id.setText("");//establece el valor del campo de texto Id en una cadena vacía, lo que borra cualquier valor que hubiera estado presente anteriormente
        Nombre.setText(""); //hace lo mismo para el campo Nombre
        Direccion.setText(""); // hace lo mismo para el campo Raza
        Contacto.setText(""); //hace lo mismo para el campo Color
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField Contacto;
    private javax.swing.JTextField Direccion;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Id;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Nuevo;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables
}
