package zero.movies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class administrador extends javax.swing.JFrame {
    
    File peliculas=new File("peliculas.txt");
    File salas=new File("salas.txt");
    File funciones=new File("funciones.txt");
    Listapelicula lp=new Listapelicula();
    Listasala ls=new Listasala();
    Listafuncion lf=new Listafuncion();
    public administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        adsalBtn = new javax.swing.JButton();
        adfunBtn = new javax.swing.JButton();
        adpelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        adsalBtn.setBackground(new java.awt.Color(26, 188, 156));
        adsalBtn.setForeground(new java.awt.Color(255, 255, 255));
        adsalBtn.setText("Salas");
        adsalBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        adsalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adsalBtnActionPerformed(evt);
            }
        });

        adfunBtn.setBackground(new java.awt.Color(26, 188, 156));
        adfunBtn.setForeground(new java.awt.Color(255, 255, 255));
        adfunBtn.setText("Funciones");
        adfunBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        adfunBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adfunBtnActionPerformed(evt);
            }
        });

        adpelBtn.setBackground(new java.awt.Color(26, 188, 156));
        adpelBtn.setForeground(new java.awt.Color(255, 255, 255));
        adpelBtn.setText("Pelicula");
        adpelBtn.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        adpelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adpelBtnActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons100verde/icons8-película.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons100verde/icons8-palomitas.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons100verde/icons8-claqueta-de-cine.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(adpelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(144, 144, 144)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adsalBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adfunBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(113, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adpelBtn)
                    .addComponent(adsalBtn)
                    .addComponent(adfunBtn))
                .addGap(132, 132, 132))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adpelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adpelBtnActionPerformed
        administradorPel adP=new administradorPel();
        lp.createFile();
        fullPeliculas();
       
        adP.lp=lp;
        adP.update();
        adP.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_adpelBtnActionPerformed

    private void adsalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adsalBtnActionPerformed
        administradorSal adS= new administradorSal();
        ls.createFile();
        fullSalas();   
        
        adS.ls=ls;
        adS.update();
        adS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_adsalBtnActionPerformed

    private void adfunBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adfunBtnActionPerformed
        administradorFun adF=new administradorFun();
        adF.setVisible(true);
        //lf.createFile();
        this.dispose();
    }//GEN-LAST:event_adfunBtnActionPerformed
    
    
    
    public void fullPeliculas(){
        String linea="";
        Funcion f=new Funcion();
        
        try{
            FileReader fr=new FileReader(peliculas);BufferedReader br=new BufferedReader(fr);
            while((linea=br.readLine())!= null){
                if(linea.equals("#")){
                    System.out.println("fullPeliculas administrador lista vacia");
                    
                }else{
                    String nombre=f.dividir(linea, "#", 0);
                    String genero=f.dividir(linea, "#", 1);
                    String duracion=f.dividir(linea, "#", 2);
                    int suma=(Integer.parseInt(duracion));                    
                    String imagen=f.dividir(linea, "#", 3);
                    
                    lp.add(new Nodopelicula(nombre,genero,imagen,suma));
                }                
            }
        }catch(Exception e){
            
        }
    }
    
    public void fullSalas(){
        String linea="";
        ls=null;
        ls=new Listasala();
        Funcion f=new Funcion();
        try{
            FileReader fr=new FileReader(salas);BufferedReader br=new BufferedReader(fr);
            while((linea=br.readLine())!= null){
                if(linea.equals("#")){
                    System.out.println("fullSalas administrador lista vaciax");                    
                }else{
                    String nombre=f.dividir(linea, "#", 0);
                    String capacidad=f.dividir(linea, "#", 2);
                    int cap=(Integer.parseInt(capacidad));                    
                    ls.add(new Nodosala(nombre,cap));
                }                
            }
        }catch(Exception e){
            
        }
    }
    
    public void fullFunciones(){
        String linea="";
        Funcion f=new Funcion();
        try{
            FileReader fr=new FileReader(peliculas);BufferedReader br=new BufferedReader(fr);
            while((linea=br.readLine())!= null){
                if(linea.equals("#")){
                    System.out.println("fullPeliculas administrador lista vacia");
                    
                }else{
                    String nombre=f.dividir(linea, "#", 0);
                    String genero=f.dividir(linea, "#", 1);
                    String duracion=f.dividir(linea, "#", 2);
                    int suma=(Integer.parseInt(duracion));                    
                    String imagen=f.dividir(linea, "#", 3);
                    
                    lp.add(new Nodopelicula(nombre,genero,imagen,suma));
                }                
            }
        }catch(Exception e){
            
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
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adfunBtn;
    private javax.swing.JButton adpelBtn;
    private javax.swing.JButton adsalBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
