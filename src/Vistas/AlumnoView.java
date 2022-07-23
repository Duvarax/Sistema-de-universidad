
package Vistas;

import Data.AlumnoData;
import Modelos.Alumno;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;


public class AlumnoView extends javax.swing.JInternalFrame {

     private AlumnoData alumno;   
    
  
    public AlumnoView(AlumnoData alumno){
        initComponents();
        limpiarCampos();   
        this.alumno=alumno;
        jbModificar.setEnabled(false);
        jbBorrar.setEnabled(false);
    }
 
       private void limpiarCampos() {
        jtidAlumno.setText("");
        jtDni.setText("");
        jtNombre.setText("");
        jtApellido.setText("");
        jcActivo.setText("");
        jdFechan.setCalendar(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jbBuscar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jtDni = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtidAlumno = new javax.swing.JTextField();
        jcActivo = new javax.swing.JCheckBox();
        jdFechan = new com.toedter.calendar.JDateChooser();
        jrLegajo = new javax.swing.JRadioButton();
        jrDni = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Sección Alumnos");
        setPreferredSize(new java.awt.Dimension(700, 770));

        jLabel1.setFont(new java.awt.Font("Gurmukhi MT", 0, 24)); // NOI18N
        jLabel1.setText("SEECCION ALUMNOS");

        jLabel2.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jLabel3.setText("Apellido");

        jLabel4.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jLabel4.setText("Nombre");

        jbBuscar.setFont(new java.awt.Font("Gurmukhi MT", 0, 14)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbBorrar.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jbBorrar.setText("Baja de alumno");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jbGuardar.setText("Alta de alumno");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jtDni.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtDniFocusLost(evt);
            }
        });

        jtApellido.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N

        jtNombre.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jLabel5.setText("Fecha de nacimiento");

        jLabel6.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jLabel6.setText("Legajo");

        jtidAlumno.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N

        jcActivo.setFont(new java.awt.Font("Gurmukhi MT", 0, 14)); // NOI18N
        jcActivo.setText("Activo");

        Grupo1.add(jrLegajo);
        jrLegajo.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jrLegajo.setText("Buscar por legajo");

        Grupo1.add(jrDni);
        jrDni.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jrDni.setText("Buscar por D.N.I.");
        jrDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDniActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gurmukhi MT", 0, 14)); // NOI18N
        jLabel7.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jdFechan, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcActivo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtidAlumno, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jrLegajo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jrDni)
                                        .addGap(18, 18, 18)
                                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbGuardar)
                                .addGap(62, 62, 62)
                                .addComponent(jbModificar)
                                .addGap(50, 50, 50)
                                .addComponent(jbBorrar)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdFechan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcActivo)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jrDni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jrLegajo)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
     
        if(jrLegajo.isSelected()){
        int legajo = Integer.parseInt(jtidAlumno.getText());
        Alumno aux =alumno.obtenerAlumnoXId(legajo);
        if(aux != null){
            jtDni.setText(aux.getDni()+"");
            jtApellido.setText(aux.getApellido());
            jtNombre.setText(aux.getNombre());
            jdFechan.setDate(Date.valueOf(aux.getFechNac()));
            if(aux.isActivo()){
            jcActivo.setSelected(aux.isActivo());
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(this,"El alumno se encuentra inactivo en la base de datos");
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);
            }
        }else{
            JOptionPane.showMessageDialog(this,"El numero de legajo no se encuentra registrado en la base de datos");
            limpiarCampos();
        }
        }
        
        if(jrDni.isSelected()){
        long dni=Long.parseLong(jtDni.getText());  
        
        Alumno aux2= alumno.obtenerAlumnoXDNI(dni);
        if(aux2 != null){
            jtidAlumno.setText(aux2.getIdAlumno()+"");
            jtApellido.setText(aux2.getApellido());
            jtNombre.setText(aux2.getNombre());
            jdFechan.setDate(Date.valueOf(aux2.getFechNac()));
            if(aux2.isActivo()){
            jcActivo.setSelected(aux2.isActivo());
            jbModificar.setEnabled(true);
            jbBorrar.setEnabled(true);
        }else{
                JOptionPane.showMessageDialog(this,"El alumno se encuentra inactivo en la base de datos");
                 jbModificar.setEnabled(true);
                 jbBorrar.setEnabled(true);
            }
        }else{
            JOptionPane.showMessageDialog(this,"El numero de legajo no se encuentra registrado en la base de datos");
            limpiarCampos();
        }
        }
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
                 
       
              int id=Integer.parseInt(jtidAlumno.getText());
              if(alumno.borrarAlumno(id)){
                   JOptionPane.showMessageDialog(this, "Alumno dado de baja"); 
                   limpiarCampos();
                   jbModificar.setEnabled(false);
                   jbBorrar.setEnabled(false);
              }                        
        
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       
         
         long dni=Long.parseLong(jtDni.getText()); 
     
         String nombre=jtNombre.getText();
         String apellido=jtApellido.getText();
         
         
         //Obtenemos la fecha del jcalendar y la pasamos a LocalDate            
     
         
         Calendar fechaActual = new GregorianCalendar();
         int añoActual = fechaActual.get(Calendar.YEAR);  


         SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
         String fecha = formato.format(jdFechan.getDate());
         
         
         String [] partes = fecha.split("-");
         String año = partes[2];
        
         int edad = añoActual - Integer.parseInt(año);
    
         
         LocalDate fechaN = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));

         Boolean activo= jcActivo.isEnabled();
         Alumno a=new Alumno(apellido, nombre, fechaN, dni, activo);
         jtidAlumno.setText(a.getIdAlumno()+"");
         int legajo=Integer.parseInt(jtidAlumno.getText());
         if(edad<17 || edad>90){// tiene que tener entre 17 y 90 años para ser estudiante
             JOptionPane.showMessageDialog(this,"Edad ingresada incorrecta, por favor verifíquelo");
         }else if( alumno.agregarAlumno(a)){    
                jtidAlumno.setText(a.getIdAlumno()+"");
                legajo=Integer.parseInt(jtidAlumno.getText());
                JOptionPane.showMessageDialog(this,"Alumno: "+a.getApellido()+" "+a.getNombre()+" \nDni: "+a.getDni()+"\nEdad: "+edad+" años\nLegajo:"+legajo+"\nAgregado con éxito!");
                limpiarCampos();
            }/*else{
                JOptionPane.showMessageDialog(this,"El alumno ya se encuentra en la base de datos. \nO el dni ingresado es incorrecto");
            }*/
        
        
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtDniFocusLost
       
        try{
            long dni=Integer.parseInt(jtDni.getText());
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this,"Debe ingresar un número");
            jtDni.requestFocus();
        }
        
    }//GEN-LAST:event_jtDniFocusLost

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
       
        int id=0;
        try{
            id=Integer.parseInt(jtidAlumno.getText());
        }catch(Exception ex){
        
             JOptionPane.showMessageDialog(this, "El campo legajo debe ser numérico");
             jtidAlumno.requestFocus();
        }
        String nombre=jtNombre.getText();
        String apellido=jtApellido.getText();
        long dni=Long.parseLong(jtDni.getText());
      
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
        String fecha = formato.format(jdFechan.getDate());
        LocalDate fechaN = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
         
        Boolean activo = jcActivo.isSelected();
        Alumno a=new Alumno(id,apellido, nombre, fechaN, dni, activo);
        if(alumno.modificarAlumno(a)){ 
             String legajo=jtidAlumno.getText();
             JOptionPane.showMessageDialog(this, "Modificación realizada con éxito: \nAlumno: "+jtApellido.getText()+" "+jtNombre.getText()+"\nLegajo: "+ legajo+"\nDni: "+dni+"\nFecha de nacimiento: "+fecha);
             limpiarCampos();
             jbModificar.setEnabled(false);
             jbBorrar.setEnabled(false); 
       
        }else{
             JOptionPane.showMessageDialog(this, "Error al intentar modificar la los datos, intentelo nuevamente");
         }       
                
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jrDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrDniActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JCheckBox jcActivo;
    private com.toedter.calendar.JDateChooser jdFechan;
    private javax.swing.JRadioButton jrDni;
    private javax.swing.JRadioButton jrLegajo;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtidAlumno;
    // End of variables declaration//GEN-END:variables
}
