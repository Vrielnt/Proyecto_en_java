package JTable;
import base.Conexion1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Jtable1 extends javax.swing.JFrame {
    Conexion1 cone1 = new Conexion1();
    Connection cont2;
   // Crea un modelo de tabla predeterminado
   DefaultTableModel modelo3;
   // Crea un objeto de tipo Statement para ejecutar instrucciones SQL
   Statement st;
   // Crea un objeto de tipo ResultSet para almacenar los resultados de las consultas SQL
   ResultSet rs;
  // Crea una variable de tipo entero para almacenar el ID del registro actualmente seleccionado en la tabla 
   int ide;
    public Jtable1() {
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
        Nombre = new javax.swing.JTextField();
        Contacto = new javax.swing.JTextField();
        Tipo = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel1.setText("Id:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Contacto:");

        jLabel4.setText("Tipo:");

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

        Nuevo.setText("NUEVO");
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
                        .addComponent(Tipo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(Contacto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabel1)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Id)
                            .addComponent(Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Agregar)
                    .addComponent(Modificar)
                    .addComponent(Eliminar)
                    .addComponent(Nuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Modificar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nuevo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Personas en anime shop");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Apellidos", "Telefono"
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
      Agregar();
      consultar();
      Nuevo();
    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
     Modificar();
        consultar();
        Nuevo();
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
     Eliminar();
        consultar();
        Nuevo(); 
    }//GEN-LAST:event_EliminarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
       Nuevo();
    }//GEN-LAST:event_NuevoActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked

    int fila = Tabla.getSelectedRow();
    if (fila == -1){
        JOptionPane.showMessageDialog(null, "No seleeciono fila");
    }else{
        ide = Integer.parseInt((String) Tabla.getValueAt(fila,0) .toString());
        String nombre = (String) Tabla.getValueAt(fila,1);
        String contacto = (String) Tabla.getValueAt(fila, 2);
        String tipo = (String) Tabla.getValueAt(fila, 2);
        
        Id.setText(""+ide); 
        Nombre.setText(nombre);
        Contacto.setText(contacto);
        Tipo.setText(tipo);
    }

    }//GEN-LAST:event_TablaMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Jtable1().setVisible(true);
            }
        });
    }
      void Modificar() {
      // Obtiene los valores de los campos de texto Id, Nombre, Raza y Color
        String id = Id.getText();
        String nombre = Nombre.getText();
        String contacto = Contacto.getText();
        String tipo = Tipo.getText();
        
        try {
            if (id.equals("") || nombre.equals("")|| contacto.equals("")||tipo.equals("")) {
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
            }else{
                String sql  = "Update Personas set id='"+ide+"', Nombre='"+nombre+"', Contacto='"+contacto+"', Tipo='"+tipo+"' where ID=" + ide;
                cont2 = cone1.getConnection();
                st = cont2.createStatement();
                st.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null, "Datos de la persona modificados");
                 limpiarTabla();
                
            }
        }catch (Exception e){
            
        }
      }
        void consultar() {
        // Crea una cadena SQL para seleccionar todos los registros de la tabla animal
        String sql = "select * from Personas";
        
        try{
            // Obtiene una conexión a la base de datos
            cont2 = cone1.getConnection();
            // Crea una nueva declaración SQL utilizando la conexión
            st = cont2.createStatement();
            // Ejecuta la instrucción SQL para seleccionar todos los registros de la tabla animal
            rs = st.executeQuery(sql);
            // Crea un arreglo de objetos con una longitud de 4 elementos
            Object[] persona = new Object[4];
            // Obtiene el modelo de tabla predeterminado de la tabla
            modelo3 = (DefaultTableModel) Tabla.getModel();
            // Recorre todos los registros seleccionados y agrega sus valores a la tabla
            while (rs.next()){
                persona [0] = rs.getInt("Id");
                persona [1] = rs.getString("Nombre");
                persona [2] = rs.getString("Contacto");
                persona [3] = rs.getString("Tipo");
                
                modelo3.addRow(persona);
            }
            // Establece el modelo de tabla actualizado en la tabla
            Tabla.setModel(modelo3);
            
        }catch (Exception e){
            // Si ocurre algún error durante la ejecución, lo atrapa y no hace nada
    }
    }
      
        void Agregar(){
        // Obtiene los valores de los campos de texto Id, Nombre, Raza y Color
        String id = Id.getText();
        String nombre = Nombre.getText();
        String contacto = Contacto.getText();
        String tipo = Tipo.getText();
        try {
            // Verifica si alguno de los campos está vacío
            if (id.equals("") || nombre.equals("") || contacto.equals("") || tipo.equals("")) {
                // Si algún campo está vacío, muestra un mensaje de alerta
                JOptionPane.showMessageDialog(null, "Faltan ingresar datos");
                 // Limpia la tabla, probablemente para borrar cualquier registro existente
            limpiarTabla();

            }else {
                // Si todos los campos tienen valores, crea una cadena SQL para insertar un nuevo registro
            String sql  = "insert into Personas(ID, Nombre, Contacto, Tipo) values ('"+id+"','"+nombre+"','"+contacto+"','"+tipo+"')";
            // Obtiene una conexión a la base de datos
            cont2 = cone1.getConnection();
            // Crea una nueva declaración SQL utilizando la conexión
            st = cont2.createStatement();
            // Ejecuta la instrucción SQL para insertar un nuevo registro en la tabla animal
            st.executeUpdate(sql);
             // Muestra un mensaje de éxito
                    JOptionPane.showMessageDialog(null, "Nueva Persona agregado");
                     // Limpia la tabla
                    limpiarTabla();
            }
        }catch (Exception e){
             // Si ocurre algún error durante la ejecución, lo atrapa y no hace nada    
        }
    }
    void limpiarTabla() { // se define la función llamada limpiarTabla() que no devuelve ningún valor (void)
        for (int i = 0; i <=Tabla.getRowCount(); i++){ //se inicia un bucle for que recorre todas las filas de la tabla. La variable i se inicia en cero y se incrementa en uno en cada iteración
            modelo3.removeRow(i); //dentro del bucle, se llama al método removeRow() del objeto modelo (que es un DefaultTableModel) para eliminar la fila i de la tabla.
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
                JOptionPane.showMessageDialog(null, "Persona eliminada");
                limpiarTabla();
            }else {
                // Si se ha seleccionado una fila, se construye una consulta SQL que elimina el registro correspondiente al animal seleccionado
                String sql = "Delete from Personas where ID="+ide;//Cambiar form from
                // Se obtiene la conexión a la base de datos y se crea un objeto Statement para ejecutar la consulta
                cont2 = cone1.getConnection();
                st = cont2.createStatement();
                // Se ejecuta la consulta
                st.execute(sql);
                // Se muestra un mensaje indicando que el animal ha sido eliminado
                JOptionPane.showMessageDialog(null, "Persona eliminada");
                // Se llama al método limpiarTabla() para actualizar la tabla
                limpiarTabla();
            }
        } catch (Exception e) {
        }
    }

        void Nuevo(){
        Id.setText("");//establece el valor del campo de texto Id en una cadena vacía, lo que borra cualquier valor que hubiera estado presente anteriormente
        Nombre.setText(""); //hace lo mismo para el campo Nombre
        Contacto.setText(""); // hace lo mismo para el campo Raza
        Tipo.setText(""); //hace lo mismo para el campo Color
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JTextField Contacto;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField Id;
    private javax.swing.JButton Modificar;
    private javax.swing.JTextField Nombre;
    private javax.swing.JButton Nuevo;
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField Tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
