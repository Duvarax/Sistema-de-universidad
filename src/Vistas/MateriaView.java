package Vistas;

import Data.Conexion;
import Data.MateriaData;
import Modelos.Materia;
import java.util.*;
import javax.swing.JOptionPane;

public class MateriaView extends javax.swing.JInternalFrame {

    private MateriaData materia;

    public MateriaView(MateriaData materia) {

        initComponents();
        this.materia=materia;
        jbEliminar.setEnabled(false);
        jbModificar.setEnabled(false);
        jtBuscaXId.setEnabled(false);
        jtBuscaXNombre.setEnabled(false);
        jbBuscaMateria.setEnabled(false);
        jbBuscaMateriaXNombre.setEnabled(false);
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        checkbox1 = new java.awt.Checkbox();
        jlNombMat = new javax.swing.JLabel();
        jlNumId = new javax.swing.JLabel();
        jlAnio = new javax.swing.JLabel();
        jtMateria = new javax.swing.JTextField();
        jtNumId = new javax.swing.JTextField();
        jbBuscaMateria = new javax.swing.JButton();
        jbAniadir = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcAnio = new javax.swing.JComboBox<>();
        jlBuscMat = new javax.swing.JLabel();
        jtBuscaXId = new javax.swing.JTextField();
        jcBuscaOk = new javax.swing.JCheckBox();
        jcAct = new javax.swing.JCheckBox();
        jbClean = new javax.swing.JButton();
        jtBuscaXNombre = new javax.swing.JTextField();
        jLXid = new javax.swing.JLabel();
        jLXnombre = new javax.swing.JLabel();
        jbBuscaMateriaXNombre = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        checkbox1.setLabel("checkbox1");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Formulario de Materias");

        jlNombMat.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jlNombMat.setText("Nombre de Materia");

        jlNumId.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jlNumId.setText("Numero de ID");

        jlAnio.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jlAnio.setText("Año Academico");

        jtMateria.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jtMateria.setHighlighter(null);
        jtMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMateriaActionPerformed(evt);
            }
        });

        jtNumId.setEditable(false);
        jtNumId.setBackground(new java.awt.Color(235, 233, 233));
        jtNumId.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N

        jbBuscaMateria.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jbBuscaMateria.setText("Buscar");
        jbBuscaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscaMateriaActionPerformed(evt);
            }
        });

        jbAniadir.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jbAniadir.setText("Añadir");
        jbAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAniadirActionPerformed(evt);
            }
        });

        jbModificar.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jbModificar.setText("Modificar");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Bangla Sangam MN", 0, 24)); // NOI18N
        jLabel4.setText("FORMULARIO DE MATERIA");

        jcAnio.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jcAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        jcAnio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcAnioActionPerformed(evt);
            }
        });

        jlBuscMat.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jlBuscMat.setText("Buscar Materia");

        jtBuscaXId.setFont(new java.awt.Font("Gurmukhi MT", 0, 16)); // NOI18N

        jcBuscaOk.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jcBuscaOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcBuscaOkActionPerformed(evt);
            }
        });

        jcAct.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jcAct.setSelected(true);
        jcAct.setText("Activa");
        jcAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcActActionPerformed(evt);
            }
        });

        jbClean.setFont(new java.awt.Font("Gurmukhi MT", 0, 14)); // NOI18N
        jbClean.setText("Limpiar campos");
        jbClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCleanActionPerformed(evt);
            }
        });

        jtBuscaXNombre.setFont(new java.awt.Font("Gurmukhi MT", 0, 16)); // NOI18N

        jLXid.setFont(new java.awt.Font("Gurmukhi MT", 0, 16)); // NOI18N
        jLXid.setText("ID");

        jLXnombre.setFont(new java.awt.Font("Gurmukhi MT", 0, 16)); // NOI18N
        jLXnombre.setText("Nombre");

        jbBuscaMateriaXNombre.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jbBuscaMateriaXNombre.setText("Buscar");
        jbBuscaMateriaXNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscaMateriaXNombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlNombMat)
                            .addComponent(jlAnio)
                            .addComponent(jlNumId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtNumId, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                        .addComponent(jtMateria)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcAct)
                                    .addComponent(jbClean, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLXnombre)
                                    .addComponent(jLXid)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jbAniadir)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jcBuscaOk)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jlBuscMat))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtBuscaXId, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                    .addComponent(jtBuscaXNombre)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(jbModificar)))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbBuscaMateriaXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jbEliminar)))))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel4)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcAct, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNombMat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlAnio)
                    .addComponent(jcAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNumId)
                    .addComponent(jbClean, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNumId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcBuscaOk)
                            .addComponent(jlBuscMat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtBuscaXId, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLXid)
                            .addComponent(jbBuscaMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtBuscaXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLXnombre)
                            .addComponent(jbBuscaMateriaXNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAniadir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcAnioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcAnioActionPerformed
        
        
    }//GEN-LAST:event_jcAnioActionPerformed

    private void jtMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMateriaActionPerformed


    }//GEN-LAST:event_jtMateriaActionPerformed

//   MODIFICAR UNA MATERIA    
    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        if (jtNumId.getText() != "" && !"".equals(jtMateria.getText())) {
                         

            String matTxt = jtMateria.getText();

            int anio = Integer.parseInt(jcAnio.getSelectedItem().toString());

            Boolean activo = jcAct.isSelected();

            int id = Integer.parseInt(jtNumId.getText().toString());

            Materia mate = new Materia(id, matTxt, anio, activo);

            if(materia.modificarMateria(mate)){
              
                JOptionPane.showMessageDialog(null, "La materia " + matTxt + " se modifico correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar modificar la materia, vuelva a intentar.");
                              
            }
        } else {

            JOptionPane.showMessageDialog(null, "Complete los campos.");

        }
    }//GEN-LAST:event_jbModificarActionPerformed

    
// HABILITA Y DESHABILITA LA BUSQUEDA
    private void jcBuscaOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcBuscaOkActionPerformed

        if (jcBuscaOk.isSelected()) { // DESHABILITA EL BOTON AÑADIR Y HABILITA MODDIFICAR O ELIMINAR

            jbEliminar.setEnabled(true);
            jbAniadir.setEnabled(false);
            jbModificar.setEnabled(true);
            jtBuscaXId.setEnabled(true);
            jtBuscaXNombre.setEnabled(true);
            jbBuscaMateria.setEnabled(true);
            jbBuscaMateriaXNombre.setEnabled(true);
            jtBuscaXId.setText("");
            jtBuscaXNombre.setText("");
        } else {
            
            jbEliminar.setEnabled(false);
            jbAniadir.setEnabled(true);
            jbModificar.setEnabled(false);
            jtBuscaXId.setEnabled(false);
            jtBuscaXNombre.setEnabled(false);
            jbBuscaMateria.setEnabled(false);
            jbBuscaMateriaXNombre.setEnabled(false);
            jtBuscaXId.setText("");
            jtBuscaXNombre.setText("");
        }
            
    }//GEN-LAST:event_jcBuscaOkActionPerformed

    
// AÑADIR UNA MATERIA
    private void jbAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAniadirActionPerformed

        String matTxt = jtMateria.getText();
        Integer anio = Integer.parseInt((String) jcAnio.getSelectedItem());
        Boolean activo = jcAct.isSelected();

        Materia mate = new Materia(matTxt, anio, activo);
        if (materia.agregarMateria(mate) && !"".equals(jtMateria.getText())) {
            JOptionPane.showMessageDialog(null, "La materia " + mate.getNombre() + " fue agregada exitosamente con el ID: " + mate.getIdMateria());

            //limpia campos
            jtMateria.setText("");
            jcAnio.setSelectedIndex(0);
            jtNumId.setText("");
            jcAct.setSelected(true);
        }else{
            JOptionPane.showMessageDialog(null, "ERROR, revise los campos.");
        }

    }//GEN-LAST:event_jbAniadirActionPerformed

    private void jcActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcActActionPerformed

    
//   ELIMINAR UNA MATERIA
    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed

        Integer id = Integer.parseInt(jtNumId.getText());
        if (jtNumId.getText() != "" && !"".equals(jtMateria.getText())) {
            if (materia.borrarMateria(id)) {
                JOptionPane.showMessageDialog(null, "La materia fue eliminada exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "La materia no pudo ser eliminada.");

            }
        } else {

            JOptionPane.showMessageDialog(null, "Complete los campos.");

        }    
            
        //limpia campos
        jtMateria.setText("");
        jcAnio.setSelectedIndex(0);
        jtNumId.setText("");
        jcAct.setSelected(true);
    }//GEN-LAST:event_jbEliminarActionPerformed

    
// OBTENER MATERIA POR ID
    private void jbBuscaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscaMateriaActionPerformed
        jtMateria.setText("");
        jcAnio.setSelectedIndex(0);
        jtNumId.setText("");

        try{

            if (jcBuscaOk.isSelected() && jtBuscaXId.getText() != null) {

                int id = Integer.parseInt(jtBuscaXId.getText());
                Materia mm = materia.obtenerMateriaXId(id);
                if(mm != null){
                    jtMateria.setText(mm.getNombre());
                    jcAnio.setSelectedItem(String.valueOf(mm.getAnio()));
                    jtNumId.setText(mm.getIdMateria() + "");
                    jcAct.setSelected(mm.isActivo());
                } else {
                    JOptionPane.showMessageDialog(null, "No se ha encontrado la materia con el ID ingresado.");

                }
            } else {

                JOptionPane.showMessageDialog(null, "Debe Ingresar un ID primero y/o tildar el campo para buscar");

            }
        } catch(Exception ex) {
                
            JOptionPane.showMessageDialog(null, "Debe Ingresar un ID valido.");

        }
    }//GEN-LAST:event_jbBuscaMateriaActionPerformed
       
    
// LIMPIA TODOS LOS CAMPOS
    private void jbCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCleanActionPerformed

        //limpia campos
        jtMateria.setText("");
        jcAnio.setSelectedIndex(0);
        jtNumId.setText("");
        jcAct.setSelected(true);
        jcBuscaOk.setSelected(false);
        jtBuscaXId.setText("");
        jbAniadir.setEnabled(true);
        jbModificar.setEnabled(false);
        jbEliminar.setEnabled(false);
        jtBuscaXNombre.setText("");
        jtBuscaXId.setEnabled(false);
        jtBuscaXNombre.setEnabled(false);
        jbBuscaMateria.setEnabled(false);
        jbBuscaMateriaXNombre.setEnabled(false);

    }//GEN-LAST:event_jbCleanActionPerformed

    
// BUSCA MATERIA POR NOMBRE
    private void jbBuscaMateriaXNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscaMateriaXNombreActionPerformed


        jtMateria.setText("");
        jcAnio.setSelectedIndex(0);
        jtNumId.setText("");

        if (jcBuscaOk.isSelected()) { // DESHABILITA EL BOTON AÑADIR Y HABILITA MODDIFICAR O ELIMINAR

            jbEliminar.setEnabled(true);
            jbAniadir.setEnabled(false);
            jbModificar.setEnabled(true);

        }

        if (jcBuscaOk.isSelected() && jtBuscaXNombre.getText() != null) {

            String nombre = (jtBuscaXNombre.getText());
            Materia mm = materia.obtenerMateriaXNombre(nombre);
            if(mm != null){
                jtMateria.setText(mm.getNombre());
                jcAnio.setSelectedItem(String.valueOf(mm.getAnio()));
                jtNumId.setText(mm.getIdMateria() + "");
                jcAct.setSelected(mm.isActivo());
            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado la materia con el nombre ingresado.");

            }
        } else {

            JOptionPane.showMessageDialog(null, "Debe Ingresar un nombre primero y/o tildar el campo para buscar");

        }

        
    }//GEN-LAST:event_jbBuscaMateriaXNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private java.awt.Canvas canvas1;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLXid;
    private javax.swing.JLabel jLXnombre;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbAniadir;
    private javax.swing.JButton jbBuscaMateria;
    private javax.swing.JButton jbBuscaMateriaXNombre;
    private javax.swing.JButton jbClean;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JCheckBox jcAct;
    private javax.swing.JComboBox<String> jcAnio;
    private javax.swing.JCheckBox jcBuscaOk;
    private javax.swing.JLabel jlAnio;
    private javax.swing.JLabel jlBuscMat;
    private javax.swing.JLabel jlNombMat;
    private javax.swing.JLabel jlNumId;
    private javax.swing.JTextField jtBuscaXId;
    private javax.swing.JTextField jtBuscaXNombre;
    private javax.swing.JTextField jtMateria;
    private javax.swing.JTextField jtNumId;
    // End of variables declaration//GEN-END:variables

}
