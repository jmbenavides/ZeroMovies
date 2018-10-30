
package zero.movies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jorge Benavides
 */
public class administradorSal extends javax.swing.JFrame {
    
    Listasala ls=new Listasala();
    File salas=new File("salas.txt");
    public administradorSal() {
        initComponents();
        update();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        aceptBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Capacidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        deleteBtn.setText("Eliminar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        addBtn.setText("Agregar");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        aceptBtn.setText("jButton1");
        aceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(255, 153, 102));
        backBtn.setText("Atras");
        backBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn)
                                .addGap(53, 53, 53)
                                .addComponent(aceptBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(256, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(deleteBtn)
                    .addComponent(aceptBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d= (DefaultTableModel) jTable1.getModel();
        Object[] data={"",""};
        d.addRow(data);   
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        DefaultTableModel d= (DefaultTableModel) jTable1.getModel();
        d.removeRow(jTable1.getSelectedRow());
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void aceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptBtnActionPerformed
        // TODO add your handling code here:
        fullList();
        ls.consult();
        
        ls.createFile();
        ls.erase();
        ls.writeinFile();
        
    }//GEN-LAST:event_aceptBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        administrador ad=new administrador();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed
    
    
    
    
    
    public void update() {
        String linea;        
        Funcion f= new Funcion();
        
        DefaultTableModel model=(DefaultTableModel)jTable1.getModel();
        // borrando los datos que se encuentran en la tabla
        int modelsize=model.getRowCount();
        // 
        while(modelsize!=0 ){
            model.removeRow(0);
            modelsize--;
        }
        if(salas.exists()){
            try {
                FileReader fr1=new FileReader(salas);BufferedReader br1= new BufferedReader(fr1);
                if(br1.readLine().equals("#")){
                    if(modelsize==1){
                        model.removeRow(0);
                    }
                    
                    JOptionPane.showMessageDialog(null, "Lista de salas vacia ");
                }else{
                    FileReader fr=new FileReader(salas);BufferedReader br= new BufferedReader(fr);
                    while((linea=br.readLine())!=null){
                        String nombre=f.dividir(linea, "#", 0);
                        String capacidad=f.dividir(linea, "#", 1);
                        Object[] fila={nombre,capacidad};
                        model.addRow(fila);
                    }
                    
                }
            } catch (FileNotFoundException ex) {
                
            } catch (IOException ex) {
                
            }   
        }else{
            JOptionPane.showMessageDialog(null, "no hay peliculas");
        }
        
    }
 
    public void fullList(){
        
            DefaultTableModel d= (DefaultTableModel) jTable1.getModel();
            ls=null;
            ls=new Listasala();
            try{
                for (int i = 0; i < d.getRowCount(); i++) {
                    ls.add(new Nodosala(d.getValueAt(i, 0).toString(),Integer.parseInt((String)d.getValueAt(i, 1))));            
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "la capacidad solo puede ser numero");
            }
            
        
        
    }
    
    
    
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
            java.util.logging.Logger.getLogger(administradorSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administradorSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administradorSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administradorSal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administradorSal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptBtn;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
