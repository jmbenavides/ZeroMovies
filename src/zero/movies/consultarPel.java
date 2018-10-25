/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zero.movies;

import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jorge Benavides
 */
public class consultarPel extends javax.swing.JFrame {

    /**
     * Creates new form consultarPel
     */
    
    Listapelicula lp=new Listapelicula();
    File peliculas = new File("peliculas.txt");
    int numfila=-1;
    public consultarPel() {
        initComponents();
        setLocationRelativeTo(null);
        fullList();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        duracionTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nombreTf = new javax.swing.JTextField();
        generoTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        imagenLb = new javax.swing.JLabel();
        rutaTf = new javax.swing.JLabel();
        reloadBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        duracionTf.setEnabled(false);
        duracionTf.setFocusable(false);

        jLabel3.setText("Duracion");

        nombreTf.setEnabled(false);
        nombreTf.setFocusable(false);

        generoTf.setEnabled(false);
        generoTf.setFocusable(false);

        jLabel1.setText("Nombre ");

        jLabel2.setText("Genero");

        backBtn.setBackground(new java.awt.Color(255, 153, 102));
        backBtn.setText("jButton1");
        backBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBtnMouseClicked(evt);
            }
        });

        reloadBtn.setBackground(new java.awt.Color(255, 153, 102));
        reloadBtn.setText("jButton1");
        reloadBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        reloadBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reloadBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(imagenLb, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreTf, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE)
                                    .addComponent(generoTf)
                                    .addComponent(duracionTf)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(rutaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(220, 220, 220)
                        .addComponent(reloadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addGap(52, 52, 52)
                        .addComponent(rutaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(imagenLb, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reloadBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseClicked
        
        administrador ad= new administrador();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnMouseClicked

    private void reloadBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reloadBtnMouseClicked
        // TODO add your handling code here:
        update();
    }//GEN-LAST:event_reloadBtnMouseClicked
    
    
    
    
    
    public void fullList(){
        Funcion f= new Funcion();
        String linea;
        try{
            FileReader fr=new FileReader(peliculas);BufferedReader br= new BufferedReader(fr);
            
                    while((linea=br.readLine())!=null){
                        if("#".equals(linea) || linea==null){
                            System.out.println("archivo vacio");
                        }else{
                            String nombre=f.dividir(linea, "#", 0);
                            String genero=f.dividir(linea, "#", 1);
                            String dur=f.dividir(linea, "#", 2);
                            
                            int duracion=Integer.parseInt(dur);
                            String imagen=f.dividir(linea, "#", 3);
                            lp.add(new Nodopelicula(nombre,genero,imagen,duracion));
                        }    
                    }
            
        }catch(IOException e){
            
        }
    }
    
    public void update(){
        System.out.println("Update numfila"+numfila);
        String linea;int cont=0;
        System.out.println("Update intro");
        Funcion f= new Funcion();
        try{
            FileReader fr=new FileReader(peliculas);BufferedReader br= new BufferedReader(fr);
                while((linea=br.readLine())!=null && numfila!=cont){

                        String nombre=f.dividir(linea, "#", 0);
                        String genero=f.dividir(linea, "#", 1);
                        String dur=f.dividir(linea, "#", 2);

                        int duracion=Integer.parseInt(dur);
                        String imagen=f.dividir(linea, "#", 3);
                        System.out.println("Update intro 2");
                        cont++;
                }
                System.out.println("cont:"+cont+" numfila:"+numfila);
                if(cont==numfila){
                    System.out.println("Update linea "+linea);
                    
                    String nombre=f.dividir(linea, "#", 0);
                    String genero=f.dividir(linea, "#", 1);
                    String dur=f.dividir(linea, "#", 2);
                    String imagen=f.dividir(linea, "#", 3);
                    
                    this.nombreTf.setText(nombre);
                    this.generoTf.setText(genero);
                    this.duracionTf.setText(dur);
                    
                    String rut=imagen;
                    ImageIcon icon=new ImageIcon(rut);
                    Image img=icon.getImage();
                    Image newimg=img.getScaledInstance(255 , 365, java.awt.Image.SCALE_SMOOTH);
                    ImageIcon newicon= new ImageIcon(newimg);
                    imagenLb.setSize(255,365);
                    imagenLb.setIcon(newicon);
                    rutaTf.setText(rut);
                }

            
        }catch(IOException e){
            System.out.println("Update error");
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
            java.util.logging.Logger.getLogger(consultarPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultarPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultarPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultarPel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new consultarPel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField duracionTf;
    private javax.swing.JTextField generoTf;
    private javax.swing.JLabel imagenLb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombreTf;
    private javax.swing.JButton reloadBtn;
    private javax.swing.JLabel rutaTf;
    // End of variables declaration//GEN-END:variables
}
