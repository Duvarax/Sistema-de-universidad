
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


public class InscripcionView extends javax.swing.JInternalFrame {
    private CursadaData cursada;
    private AlumnoData ad;
    private MateriaData md;
    private DefaultTableModel modelo;
    private List<Alumno> listaAlumnos;
    
    public InscripcionView(CursadaData inscripcion, AlumnoData alumnoData, MateriaData materias) {
        initComponents();
        modelo = new DefaultTableModel();
        this.cursada=inscripcion;
        ad = alumnoData;
        listaAlumnos  = ad.obtenerAlumnos();
        md = materias;
        llenarComboBox();
        armarTabla();
        limpiarTabla();
        Binscribir.setEnabled(false);
        jbQuitar.setEnabled(false);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbAlumnos = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbNoInscriptas = new javax.swing.JRadioButton();
        Binscribir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TlistaMaterias = new javax.swing.JTable();
        rbInscriptas = new javax.swing.JRadioButton();
        jbQuitar = new javax.swing.JButton();

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

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Inscripciones");

        cbAlumnos.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        cbAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlumnosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Gurmukhi MT", 0, 24)); // NOI18N
        jLabel1.setText("FORMULARIO DE INSCRIPCION");

        jLabel2.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jLabel2.setText("Alumno:");

        jLabel3.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jLabel3.setText("Listado de materias");

        rbNoInscriptas.setFont(new java.awt.Font("Gurmukhi MT", 0, 14)); // NOI18N
        rbNoInscriptas.setText("No inscriptas");
        rbNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNoInscriptasActionPerformed(evt);
            }
        });

        Binscribir.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        Binscribir.setText("Inscribir");
        Binscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BinscribirActionPerformed(evt);
            }
        });

        TlistaMaterias = new javax.swing.JTable(){
            public boolean isCellEditable(int RowIndex, int colIndex){
                return false;
            }
        };
        TlistaMaterias.setFont(new java.awt.Font("Gurmukhi MT", 0, 12)); // NOI18N
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
        TlistaMaterias.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(TlistaMaterias);

        rbInscriptas.setFont(new java.awt.Font("Gurmukhi MT", 0, 14)); // NOI18N
        rbInscriptas.setText("Inscriptas");
        rbInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInscriptasActionPerformed(evt);
            }
        });

        jbQuitar.setFont(new java.awt.Font("Gurmukhi MT", 0, 18)); // NOI18N
        jbQuitar.setText("Quitar Inscripcion");
        jbQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbQuitarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(Binscribir)
                        .addGap(51, 51, 51)
                        .addComponent(jbQuitar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbInscriptas)
                                    .addComponent(rbNoInscriptas))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbInscriptas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbNoInscriptas)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Binscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNoInscriptasActionPerformed
        limpiarTabla();
        jbQuitar.setEnabled(false);
        Binscribir.setEnabled(true);
        rbNoInscriptas.setSelected(true);
        rbInscriptas.setSelected(false);
        Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
        List<Materia> materiasNoInscriptas = cursada.obtenerMateriasNoCursadas(alumno);
        
        for (Materia aux : materiasNoInscriptas) {
            modelo.addRow(new Object[]{aux.getIdMateria(), aux.getNombre(), aux.getAnio()});
        }
    }//GEN-LAST:event_rbNoInscriptasActionPerformed

    private void BinscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BinscribirActionPerformed

        Integer idMateria = (Integer) TlistaMaterias.getValueAt(TlistaMaterias.getSelectedRow(), 0);
        Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
        Inscripcion inscripcion = new Inscripcion(alumno, md.obtenerMateriaXId(idMateria), 0);
        if(cursada.guardarCursada(inscripcion)){
            JOptionPane.showMessageDialog(this, "Inscripto con exito");
            int x = TlistaMaterias.getSelectedRow();
            modelo.removeRow(x);
        }else{
            JOptionPane.showMessageDialog(this, "Error al inscribir el alumno");
        }
        
        
    }//GEN-LAST:event_BinscribirActionPerformed

    private void rbInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInscriptasActionPerformed
        Binscribir.setEnabled(false);
        jbQuitar.setEnabled(true);
        limpiarTabla();
        rbInscriptas.setSelected(true);
        rbNoInscriptas.setSelected(false);
        Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
        List<Inscripcion> materiasInscriptas = cursada.cursadasXAlumno(alumno);
        
        for (Inscripcion aux : materiasInscriptas) {
            modelo.addRow(new Object[]{aux.getMateria().getIdMateria(), aux.getMateria().getNombre(), aux.getMateria().getAnio()});
        }
//        Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
//        Alumno x = ad.obtenerAlumnoXDNI(alumno.getDni());
//        List<Materia> materiasInscriptas = cursada.cursadasXAlumno(x);
//        
//        for (Materia aux : materiasInscriptas) {
//            modelo.addRow(new Object[]{aux.getIdMateria(), aux.getNombre(), aux.getAnio()});
//        }
        
    
    }//GEN-LAST:event_rbInscriptasActionPerformed

    private void cbAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlumnosActionPerformed
        if(modelo.getRowCount() > 0){
            limpiarTabla();
            rbInscriptas.setSelected(false);
            rbNoInscriptas.setSelected(false);
        }
    }//GEN-LAST:event_cbAlumnosActionPerformed

    private void jbQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbQuitarActionPerformed

        Integer idMateria = (Integer) TlistaMaterias.getValueAt(TlistaMaterias.getSelectedRow(), 0);
         Alumno alumno = (Alumno) cbAlumnos.getSelectedItem();
         Materia materia = md.obtenerMateriaXId(idMateria);
         if(cursada.borrarCursada(alumno, materia)){
             JOptionPane.showMessageDialog(this, "Inscripcion eliminada");
             rbInscriptasActionPerformed(evt);
         }else{
             JOptionPane.showMessageDialog(this, "Error al eliminar la inscripcion");
         }
        
    }//GEN-LAST:event_jbQuitarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Binscribir;
    private javax.swing.JTable TlistaMaterias;
    private javax.swing.JComboBox<Alumno> cbAlumnos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbQuitar;
    private javax.swing.JRadioButton rbInscriptas;
    private javax.swing.JRadioButton rbNoInscriptas;
    // End of variables declaration//GEN-END:variables
}
