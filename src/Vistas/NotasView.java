/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Data.AlumnoData;
import Data.CursadaData;
import Data.MateriaData;
import Modelos.Alumno;
import Modelos.Inscripcion;
import Modelos.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author duvar
 */
public class NotasView extends javax.swing.JInternalFrame {

    private List<Alumno> listaAlumnos;
    private CursadaData cursada;
    private AlumnoData ad;
    private MateriaData md;
    private DefaultTableModel modelo;
    public NotasView(CursadaData inscripcion, AlumnoData alumno,MateriaData materia) {
        initComponents();
        cursada = inscripcion;
        ad = alumno;
        md = materia;
        modelo = new DefaultTableModel();
        listaAlumnos = ad.obtenerAlumnos();
        llenarComboBox();
        armarTabla();
        limpiarTabla();
    }
    
    private void llenarComboBox(){
        cbAlumnos.removeAllItems();
        for (Alumno listaAlumno : listaAlumnos) {
            cbAlumnos.addItem(listaAlumno);
        }
    }
    
    private void armarTabla(){
        ArrayList<Object> columnas = new ArrayList();
        columnas.add("ID");
        columnas.add("Materia");
        columnas.add("Año");
        columnas.add("Nota");
        
        for (Object columna : columnas) {
            modelo.addColumn(columna);
        }
        TlistaMaterias.setModel(modelo);
    }
      private void limpiarTabla() {
       int a = TlistaMaterias.getRowCount()-1;
          for (int i = a; i >= 0; i--) {
              modelo.removeRow(i);
          }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbAlumnos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TlistaMaterias = new javax.swing.JTable();
        jbModificar = new javax.swing.JButton();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Calificaciones");

        jLabel1.setFont(new java.awt.Font("Gurmukhi MT", 0, 24)); // NOI18N
        jLabel1.setText("MANIPULACION DE NOTAS");

        jLabel2.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jLabel2.setText("Alumno");

        cbAlumnos.setFont(new java.awt.Font("Gurmukhi MT", 1, 18)); // NOI18N
        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        TlistaMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        TlistaMaterias.setEditingColumn(3);
        jScrollPane1.setViewportView(TlistaMaterias);

        jbModificar.setFont(new java.awt.Font("Gurmukhi MT", 0, 14)); // NOI18N
        jbModificar.setText("Modificar Nota");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        if(modelo.getRowCount() > 0){
            limpiarTabla();
        }
        Alumno a = (Alumno) cbAlumnos.getSelectedItem();
        List<Inscripcion> materiasInscriptas = cursada.cursadasXAlumno(a);
        for (Inscripcion aux : materiasInscriptas) {
            modelo.addRow(new Object[]{aux.getMateria().getIdMateria(), aux.getMateria().getNombre(), aux.getMateria().getAnio(), aux.getNota()});
        }
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        if(modelo.getRowCount() > 0){
            Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
            int idMateria = (int) TlistaMaterias.getValueAt(TlistaMaterias.getSelectedRow(), 0);
            Materia materia = md.obtenerMateriaXId(idMateria);
            
            Double notaNueva = Double.parseDouble( TlistaMaterias.getValueAt(TlistaMaterias.getSelectedRow() , 3).toString());
            if(notaNueva > 0.0 && notaNueva <= 10.0){
                cursada.modificarNota(alumno, materia, notaNueva);
                JOptionPane.showMessageDialog(this, "Nota modificada con exito");
            }else{
                JOptionPane.showMessageDialog(this, "Nota fuera de rango");
            }
            
//            }catch(NumberFormatException ne){
//                JOptionPane.showMessageDialog(this, "Nota debe ser un numero con decimales:" + ne);
//            }catch(ClassCastException ce){
//                JOptionPane.showMessageDialog(this, "Nota debe ser un numero con decimales:" + ce);
//            }
        }
    }//GEN-LAST:event_jbModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TlistaMaterias;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbModificar;
    // End of variables declaration//GEN-END:variables
}
