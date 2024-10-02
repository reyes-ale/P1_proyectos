/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GamesFront;
// DUO: ALejandra Reyes & Hanne Mendoza

import javax.swing.JOptionPane;
import java.util.Random;
import java.text.DecimalFormat;

public class Games extends javax.swing.JFrame {
    
    public Games() {
        JOptionPane.showMessageDialog(null, "Bienvenido a Swimming Olympics! \nPresione START para empezar la simulación de la olimpiada");
        setLocation(190,100); 
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnStart = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        btnResults = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        labelPic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnOmega = new javax.swing.JButton();
        btnSpeedo = new javax.swing.JButton();
        btnCoke = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        btnStart.setBackground(new java.awt.Color(51, 51, 51));
        btnStart.setText("START");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnFinish.setBackground(new java.awt.Color(51, 51, 51));
        btnFinish.setText("FINISH");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        btnResults.setBackground(new java.awt.Color(204, 153, 0));
        btnResults.setText("RESULTS");
        btnResults.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnResults, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(216, 216, 216)
                .addComponent(btnFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResults)
                    .addComponent(btnFinish)
                    .addComponent(btnStart))
                .addGap(16, 16, 16))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        labelPic.setBackground(new java.awt.Color(0, 0, 0));
        labelPic.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 24)); // NOI18N
        labelPic.setForeground(new java.awt.Color(0, 0, 0));
        labelPic.setText("OLYMPICS GAMES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelPic)
                .addGap(331, 331, 331))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(labelPic)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel1.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        jLabel2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel2.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        jLabel3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel3.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        jLabel4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        jLabel4.setText("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - ");

        jLabel5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("]");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("]");

        jLabel7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("]");

        jLabel8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("]");

        jLabel9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("]");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        btnOmega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GamesFront/omega.png"))); // NOI18N
        btnOmega.setText("jButton6");
        btnOmega.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOmegaMouseClicked(evt);
            }
        });

        btnSpeedo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GamesFront/speedo.png"))); // NOI18N
        btnSpeedo.setText("jButton5");
        btnSpeedo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSpeedoMouseClicked(evt);
            }
        });

        btnCoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GamesFront/coke.png"))); // NOI18N
        btnCoke.setText("jButton7");
        btnCoke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCokeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnCoke, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSpeedo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(btnOmega, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCoke, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOmega, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSpeedo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCokeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCokeMouseClicked
        JOptionPane.showMessageDialog(null, "¡Destapa la felicidad con Coca Cola!");
    }//GEN-LAST:event_btnCokeMouseClicked

    private void btnSpeedoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSpeedoMouseClicked
        JOptionPane.showMessageDialog(null, "Encuentra formas de lograrlo, no excusas!");
    }//GEN-LAST:event_btnSpeedoMouseClicked

    private void btnOmegaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOmegaMouseClicked
        JOptionPane.showMessageDialog(null, "Recording Olympic Dreams since 1932");
    }//GEN-LAST:event_btnOmegaMouseClicked

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        Random rand = new Random();
        Object [] opciones = {"2","3","4","5"};
        
        int elijio = JOptionPane.showOptionDialog(null, "Seleccione el numero de nadadores", "Nadadores",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
        
        switch (elijio) {
            
            case 0:     
                JOptionPane.showMessageDialog(null, "Competencia en Modo Normal");
                JOptionPane.showMessageDialog(null, "Ha comenzado la competencia!");
                float [][] matriz = new float [2][3];
                DecimalFormat df = new DecimalFormat("#.00");
                
                for(int i = 0 ; i < matriz.length ; i++){
                    for(int j = 0 ; j < matriz[i].length ; j++){                        
                        float nad1 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad2 = 10 + ( 50 - 10 ) * rand.nextFloat();  
                        if(i==0){
                         matriz[i][j]+= nad1; 
                         
                        }else{
                            matriz[i][j]+=nad2;
                        }                        
                    }                    
                }
                
                
                for(int i = 0 ; i < matriz.length ; i++){
                    for(int j = 0 ; j < matriz[i].length ; j++){
                        System.out.print(df.format(matriz[i][j])+ " ");                        
                    }
                    System.out.println("");
                }
                
                float [] sumaNadadores = sumfilas(2,3,matriz);
                imprimir_arreglo(sumaNadadores);
                
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Competencia en Modo Eliminatoria");
                float [][] matriz2 = new float [3][3];
                DecimalFormat df2 = new DecimalFormat("#.00");
                
                
                for(int i = 0 ; i < matriz2.length ; i++){
                    for(int j = 0 ; j < matriz2[i].length ; j++){                        
                        float nad1 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad2 = 10 + ( 50 - 10 ) * rand.nextFloat();  
                        float nad3 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        if(i==0){
                         matriz2[i][j] += nad1;   
                        }else if(i==1){
                            matriz2[i][j] += nad2;
                        }else{
                            matriz2[i][j] += nad3;
                        }                        
                    }                    
                }
                for(int i = 0 ; i < matriz2.length ; i++){
                    for(int j = 0 ; j < matriz2[i].length ; j++){
                        System.out.print(df2.format(matriz2[i][j])+ " ");                        
                    }
                    System.out.println("");
                }
                
                float [] sumaNadadores2 = sumfilas(3,3,matriz2);
                imprimir_arreglo(sumaNadadores2);
                
                break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "Competencia en Modo Eliminatoria");
                float [][] matriz3 = new float [4][3];
                DecimalFormat df3 = new DecimalFormat("#.00");
               
                
                for(int i = 0 ; i < matriz3.length ; i++){
                    for(int j = 0 ; j < matriz3[i].length ; j++){                        
                        float nad1 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad2 = 10 + ( 50 - 10 ) * rand.nextFloat();  
                        float nad3 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad4 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        if(i==0){
                         matriz3[i][j] += nad1;   
                        }else if(i==1){
                            matriz3[i][j] += nad2;
                        }else if(i==2){
                            matriz3[i][j] += nad3;
                        }else{
                            matriz3[i][j]+= nad4;
                        }                        
                    }                    
                }
                
                for(int i = 0 ; i < matriz3.length ; i++){
                    for(int j = 0 ; j < matriz3[i].length ; j++){
                        System.out.print(df3.format(matriz3[i][j])+ " ");                        
                    }
                    System.out.println("");
                }
                
                float [] sumaNadadores3 = sumfilas(4,3,matriz3);
                imprimir_arreglo(sumaNadadores3);
                
                break;
                
            case 3:
                JOptionPane.showMessageDialog(null, "Competencia en Modo Eliminatoria");
                float [][] matriz4 = new float [5][3];
                DecimalFormat df4 = new DecimalFormat("#.00");
               
                
                for(int i = 0 ; i < matriz4.length ; i++){
                    for(int j = 0 ; j < matriz4[i].length ; j++){                        
                        float nad1 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad2 = 10 + ( 50 - 10 ) * rand.nextFloat();  
                        float nad3 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad4 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        float nad5 = 10 + ( 50 - 10 ) * rand.nextFloat();
                        
                        if(i==0){
                         matriz4[i][j] += nad1;   
                        }else if(i==1){
                            matriz4[i][j] += nad2;
                        }else if(i==2){
                            matriz4[i][j] += nad3;
                        }else if(i==3){
                            matriz4[i][j]+= nad4;
                        }else{
                            matriz4[i][j]+= nad5;
                        }                        
                    }                    
                }
                
                for(int i = 0 ; i < matriz4.length ; i++){
                    for(int j = 0 ; j < matriz4[i].length ; j++){
                        System.out.print(df4.format(matriz4[i][j])+ " ");                        
                    }
                    System.out.println("");
                }
                
                float [] sumaNadadores4 = sumfilas(5,3,matriz4);
                imprimir_arreglo(sumaNadadores4);
                
                break;                
       
        }//switch        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnResultsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResultsActionPerformed

    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFinishActionPerformed

    public static float [] sumfilas (int filas, float columnas, float [][] matriz){
        float [] fil = new float [filas];        
            for (int i=0; i <matriz.length; i++){
                float num;
                float suma=0;                
                for (int j=0; j< matriz[i].length; j++){
                    num=matriz[i][j];
                    suma+=num;
                    fil[i]=suma;
                }
            }
        return fil;
    }
    
    public static void imprimir_arreglo(float [] size){
        DecimalFormat df5 = new DecimalFormat("#.00");
        for (int i = 0; i < size.length; i++){            
            System.out.print("[" + df5.format(size[i]) + "]");
        }
    }
    
    /*public static float [] Resultados(float matriz[][], float [] resultado, float filaActual){
        float [] temporal = new float[matriz.length];
        //caso base
        
          for (int i=0; i <matriz.length; i++){
                float num;
                float suma=0;                
                for (int j=0; j< matriz[i].length; j++){
                    num=matriz[i][j];
                    suma+=num;
                    fil[i]=suma;
                }
            }
        if(filaActual < matriz.length){
            int SumaFila = 0;
            
            for(int i =0 ; i<matriz[filaActual]; i++){
                SumaFila + = matriz[i];
            }
        }
         for (int i=0; i <matriz.length; i++){
                                
                for (int j=0; j< matriz[i].length; j++){
                    
                }
            }
         return temporal;
    }*/
    
    /*public static float[] regmejorTiempo (float [][] matriz, float mejorestiempos, int indice){
        int ronda=3;
        
        for (int i=0; i <matriz.length; i++){               
                for (int j=0; j< matriz[i].length; j++){
                   if (i<matriz.length){
                       if (tiempo[indice]<mejorestiempos)
        }  
                }
            }
       
    */
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCoke;
    private javax.swing.JButton btnFinish;
    private javax.swing.JButton btnOmega;
    private javax.swing.JButton btnResults;
    private javax.swing.JButton btnSpeedo;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelPic;
    // End of variables declaration//GEN-END:variables
}
