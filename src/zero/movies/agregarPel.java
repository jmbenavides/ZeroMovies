
package zero.movies;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class agregarPel extends javax.swing.JFrame {

    FileNameExtensionFilter filtro= new FileNameExtensionFilter("Archivo de imgane","jpg");
    String rutaimagen;
    Listapelicula lp= new Listapelicula();
    File peliculas= new File("peliculas.txt");
    
    public agregarPel() {
        initComponents();
        setLocationRelativeTo(null);
        crear();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreTf = new javax.swing.JTextField();
        generoTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        imagenLb = new javax.swing.JLabel();
        rutaTf = new javax.swing.JLabel();
        duracionTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre ");

        jLabel2.setText("Genero");

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setText("jButton1");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Seleccione imagen");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel3.setText("Duracion");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imagenLb, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombreTf, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                .addComponent(generoTf)
                                .addComponent(duracionTf))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(rutaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombreTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(generoTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(duracionTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenLb, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        Funcion fun= new Funcion();        
        Listapelicula lp=new Listapelicula();
        administrador ad= new administrador();
        
        String nombre=nombreTf.getText();
        String genero=generoTf.getText();
        String duracion=duracionTf.getText();
        String ruta=rutaTf.getText();        
        
        
        if(nombre.isEmpty() || genero.isEmpty() || duracion.isEmpty()|| ruta.isEmpty()){
            JOptionPane.showMessageDialog(null, "faltan campos por rellenar");
        }else{
            int dur=fun.HourtoMin(duracion);            
            lp.add(new Nodopelicula(nombre,genero,ruta,dur));
            agregar(nombre, genero,ruta,dur);
            Object[] fila={nombre,genero,ruta,dur};
            DefaultTableModel dtm=(DefaultTableModel)ad.jTable1.getModel();            
            dtm.addRow(fila);
            //zm.lp.consult();
            ad.setVisible(true);
            this.dispose();
        }
        
        
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        JFileChooser jfc= new JFileChooser();
        jfc.setFileFilter(filtro);
        int o=jfc.showOpenDialog(this);
        if(o==JFileChooser.APPROVE_OPTION){
            String rut=jfc.getSelectedFile().getPath();
            
            ImageIcon icon=new ImageIcon(rut);
            Image img=icon.getImage();
            Image newimg=img.getScaledInstance(255 , 365, java.awt.Image.SCALE_SMOOTH);
            ImageIcon newicon= new ImageIcon(newimg);
            imagenLb.setSize(255,365);
            imagenLb.setIcon(newicon);
            rutaTf.setText(rut);
            rutaimagen=rut;
        }
    }//GEN-LAST:event_jButton2MouseClicked
    
    public void agregar(String nombre, String genero, String ruta, int duracion){
        
        System.out.println("");
        
       try{
            FileReader fr = new FileReader(peliculas);BufferedReader br = new BufferedReader(fr);
            if(br.readLine().equals("#")){
                FileWriter fw = new FileWriter(peliculas);BufferedWriter bw = new BufferedWriter(fw);
                bw.write(nombre+"#"+genero+"#"+duracion+"#"+ruta+"#");
                bw.newLine();
                bw.close();
                
            }else{
                
                FileWriter fw = new FileWriter(peliculas, true);BufferedWriter bw = new BufferedWriter(fw);
                bw.write(nombre+"#"+genero+"#"+duracion+"#"+ruta+"#");
                bw.newLine();
                bw.close();
            }
        }catch(IOException e){
            System.out.println("12312");
        } 
    }
    
    public void crear(){
        try{
        // creo el documento en caso de que este no exista y escribo en él el caracter "#" para mostrar que esta vacio
            if(!peliculas.exists()){
                FileWriter fw = new FileWriter(peliculas);BufferedWriter bw = new BufferedWriter(fw);
                bw.write("#");
                bw.newLine();
                bw.close();
            }
        }catch(IOException e){
            
        }
                
    }
    
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
            java.util.logging.Logger.getLogger(agregarPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregarPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregarPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregarPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregarPel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField duracionTf;
    private javax.swing.JTextField generoTf;
    private javax.swing.JLabel imagenLb;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JLabel rutaTf;
    // End of variables declaration//GEN-END:variables
}