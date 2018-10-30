
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
        //crear();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombreTf = new javax.swing.JTextField();
        generoTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addpelbtn = new javax.swing.JButton();
        imagenBtn = new javax.swing.JButton();
        imagenLb = new javax.swing.JLabel();
        rutaTf = new javax.swing.JLabel();
        duracionTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre ");

        jLabel2.setText("Genero");

        addpelbtn.setBackground(new java.awt.Color(255, 153, 102));
        addpelbtn.setText("Aceptar");
        addpelbtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addpelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addpelbtnMouseClicked(evt);
            }
        });

        imagenBtn.setText("Seleccione imagen");
        imagenBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenBtnMouseClicked(evt);
            }
        });

        jLabel3.setText("Duracion");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(imagenLb, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addpelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imagenBtn)
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
                        .addComponent(imagenBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rutaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenLb, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(addpelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addpelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addpelbtnMouseClicked
        Funcion fun= new Funcion();        
        
        administradorPel ad= new administradorPel();
        
        String nombre=nombreTf.getText();
        String genero=generoTf.getText();
        String duracion=duracionTf.getText();
        String ruta=rutaTf.getText();        
        
        
        if(nombre.isEmpty() || genero.isEmpty() || duracion.isEmpty()|| ruta.isEmpty()){
            JOptionPane.showMessageDialog(null, "faltan campos por rellenar");
        }else{
            int dur=fun.HourtoMin(duracion);            
            lp.add(new Nodopelicula(nombre,genero,ruta,dur));
            lp.createFile();
            lp.writeinFile();
            Object[] fila={nombre,genero,dur,ruta};
            DefaultTableModel dtm=(DefaultTableModel)ad.jTable1.getModel();            
            dtm.addRow(fila);
            //zm.lp.consult();
            ad.setVisible(true);
            ad.lp=lp;
            this.dispose();
        }
        
        
        
    }//GEN-LAST:event_addpelbtnMouseClicked

    private void imagenBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenBtnMouseClicked
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
    }//GEN-LAST:event_imagenBtnMouseClicked

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        administradorPel ad= new administradorPel();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed
    
/* 
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
*/  
    public void fullList(){
        Funcion f= new Funcion();
        String linea;
        try{
            FileReader fr=new FileReader(peliculas);BufferedReader br= new BufferedReader(fr);
                    while((linea=br.readLine())!=null){
                        String nombre=f.dividir(linea, "#", 0);
                        String genero=f.dividir(linea, "#", 1);
                        String dur=f.dividir(linea, "#", 2);
                        int duracion=Integer.parseInt(dur);
                        String imagen=f.dividir(linea, "#", 3);
                        lp.add(new Nodopelicula(nombre,genero,imagen,duracion));
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
    private javax.swing.JButton addpelbtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField duracionTf;
    private javax.swing.JTextField generoTf;
    private javax.swing.JButton imagenBtn;
    private javax.swing.JLabel imagenLb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JLabel rutaTf;
    // End of variables declaration//GEN-END:variables
}
