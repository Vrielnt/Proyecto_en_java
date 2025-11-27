package JTable;
import base.Conexion3;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class NewJFrame extends javax.swing.JFrame {
    Conexion3 conx1 = new Conexion3();
    Connection conet;
   // Crea un modelo de tabla predeterminado
   DefaultTableModel modelo;
   // Crea un objeto de tipo Statement para ejecutar instrucciones SQL
   Statement st;
   // Crea un objeto de tipo ResultSet para almacenar los resultados de las consultas SQL
   ResultSet rs;
  // Crea una variable de tipo entero para almacenar el ID del registro actualmente seleccionado en la tabla 
   int idg;
    public NewJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        consultar();        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        Producto = new javax.swing.JTextField();
        Cantidad = new javax.swing.JTextField();
        Total = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setText("Id:");

        jLabel2.setText("Producto:");

        jLabel3.setText("Cantidad:");

        jLabel4.setText("Total:");

        Agregar.setText("AGREGAR");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        Modificar.setText("MODIFICAR");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });

        Eliminar.setText("ELIMINAR");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Nuevo.setText("LIMPIAR");
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
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(Total))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Id)
                            .addComponent(Producto, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Agregar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Nuevo))
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Agregar)
                        .addGap(5, 5, 5)
                        .addComponent(Modificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Eliminar)
                        .addGap(18, 18, 18)
                        .addComponent(Nuevo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Bienvenido a anime shop");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Producto", "Cantidad", "Total"
            }
        ));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        Agregar();
        consultar();
        Nuevo();        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        Modificar();
        consultar();
        Nuevo();        // TODO add your handling code here:
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        Eliminar();
        consultar();
        Nuevo();        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
Nuevo();        
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
            idg = Integer.parseInt((String) Tabla.getValueAt(fila,0) .toString());
            //se obtiene el valor de la celda en la segunda columna (columna 1) de la fila seleccionada y se asigna a la variable nom
            String producto = (String) Tabla.getValueAt(fila,1);
            //se obtiene el valor de la celda en la tercera columna (columna 2) de la fila seleccionada y se asigna a la variable raz
            String cantidad = (String) Tabla.getValueAt(fila, 2);
            // se obtiene el valor de la celda en la cuarta columna (columna 3) de la fila seleccionada y se asigna a la variable col
            String total = (String) Tabla.getValueAt(fila, 2);
            
            Id.setText(""+idg); //se establece el valor de idc en el campo de texto Id
            Producto.setText(producto); //se establece el valor de nom en el campo de texto Nombre
            Cantidad.setText(cantidad); //se establece el valor de raz en el campo de texto Raza
            Total.setText(total); //se establece el valor de col en el campo de texto Color
            
        }
    }//GEN-LAST:event_TablaMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }
          void Modificar() {
      // Obtiene los valores de los campos de texto Id, Nombre, Raza y Color
        String id = Id.getText();
        String producto = Producto.getText();
        String cantidad = Cantidad.getText();
        String total = Total.getText();        
        try {
            if (id.equals("") || producto.equals("")|| cantidad.equals("")||total.equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            }else{
                String sql  = "Update Ventas set ID='"+idg+"', Producto='"+producto+"', Cantidad='"+cantidad+"', Total='"+total+"' where ID=" + idg;
                conet = conx1.getConnection();
                st = conet.createStatement();
                st.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null, "Datos de animal modificados");
                 limpiarTabla();                
            }
        }catch (Exception e){            
        }
      }
        void consultar() {
        // Crea una cadena SQL para seleccionar todos los registros de la tabla animal
        String sql = "select * from Ventas";       
        try{
            // Obtiene una conexión a la base de datos
            conet = conx1.getConnection();
            // Crea una nueva declaración SQL utilizando la conexión
            st = conet.createStatement();
            // Ejecuta la instrucción SQL para seleccionar todos los registros de la tabla animal
            rs = st.executeQuery(sql);
            // Crea un arreglo de objetos con una longitud de 4 elementos
            Object[] venta = new Object[4];
            // Obtiene el modelo de tabla predeterminado de la tabla
            modelo = (DefaultTableModel) Tabla.getModel();
            // Recorre todos los registros seleccionados y agrega sus valores a la tabla
            while (rs.next()){
                venta [0] = rs.getInt("ID");
                venta [1] = rs.getString("Producto");
                venta [2] = rs.getString("Cantidad");
                venta [3] = rs.getInt("Total");
                modelo.addRow(venta);
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
        String total = Total.getText();
        try {
            // Verifica si alguno de los campos está vacío
            if (id.equals("") || producto.equals("") || cantidad.equals("") || total.equals("")) {
                // Si algún campo está vacío, muestra un mensaje de alerta
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
                 // Limpia la tabla, probablemente para borrar cualquier registro existente
            limpiarTabla();
            }else {
                // Si todos los campos tienen valores, crea una cadena SQL para insertar un nuevo registro
            String sql  = "insert into Ventas(ID, Producto ,Cantidad, Total) values ('"+id+"','"+producto+"','"+cantidad+"','"+total+"')";
            // Obtiene una conexión a la base de datos
            conet = conx1.getConnection();
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
                String sql = "Delete from Ventas where ID="+idg;//Cambiar form from
                // Se obtiene la conexión a la base de datos y se crea un objeto Statement para ejecutar la consulta
                conet = conx1.getConnection();
                st = conet.createStatement();
                // Se ejecuta la consulta
                st.execute(sql);
                // Se muestra un mensaje indicando que el animal ha sido eliminado
                JOptionPane.showMessageDialog(null, "Venta eliminado");
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
        Total.setText(""); //hace lo mismo para el campo Color
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Id;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JTextField Producto;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
