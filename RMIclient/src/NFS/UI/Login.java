/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package NFS.UI;

import NFS.Client;
import NFS.Sockets.JavaSocket.JavaClientSocket;
import NFS.Sockets.ServerListener;
import NFS.Sockets.SocketProcess.SocketClient;
import NFS.Sockets.SocketProcess.SocketProcess;
import NFS.UI.vistasAdmin.InicioAdmin;
import NFS.UI.vistasUsuario.InicioUsuario;
import java.net.Socket;
import java.util.ArrayList;



/**
 *
 * @author Jesus
 */
public class Login extends javax.swing.JFrame {
    public static boolean conectado= true;
    private static SocketProcess SocketCliente;
    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        lblError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lblError = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDesconectar = new javax.swing.JButton();
        btnNotificacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Entrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresa tus datos");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        lblError.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblError.setText("Contraseña o usuario incorrecto");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Contraseña");

        btnDesconectar.setText("Desconectar");
        btnDesconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesconectarActionPerformed(evt);
            }
        });

        btnNotificacion.setText("Enviar notificacion");
        btnNotificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(333, 333, 333)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(297, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(txtNombre))))
                .addGap(295, 295, 295))
            .addGroup(layout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnDesconectar)
                        .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnNotificacion)
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(2, 2, 2)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(lblError)
                .addGap(43, 43, 43))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnDesconectar)
                .addGap(26, 26, 26)
                .addComponent(btnNotificacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(txtNombre.getText().isEmpty()|| txtNombre.getText().isEmpty()){
            lblError.setText("Llena todos los campos");
            lblError.setVisible(true);
        }else{
            if(loginUser(txtNombre.getText(), txtPassword.getText())==0){
                lblError.setText("Contraseña o usuario incorrecto");
                lblError.setVisible(true);

            }else{
                int id = loginUser(txtNombre.getText(), txtPassword.getText());
                if(getRole(id).equals("Admin")){
                    System.out.println("Bienvenido Admin");
                    // Enviar a la vista Admin inicio
                    InicioAdmin inicioAdmin=new InicioAdmin(id,txtNombre.getText(),"Admin");
                    this.setVisible(false);
                    inicioAdmin.setLocationRelativeTo(null); 
                    inicioAdmin.setVisible(true);
                }else if(getRole(id).equals("Empleado")||getRole(id).equals("Cliente")){
                    System.out.println("Bienvenido");
                    InicioUsuario inicioUsuario= new InicioUsuario(id,txtNombre.getText(),getRole(id),"D:\\Escritorio\\Archivos");
                    this.setVisible(false);
                    inicioUsuario.listarArchivos();
                    inicioUsuario.setLocationRelativeTo(null); 
                    inicioUsuario.setVisible(true);
                }
                
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNotificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificacionActionPerformed
        // enviarNotificacion(this.SocketCliente);
    }//GEN-LAST:event_btnNotificacionActionPerformed

    private void btnDesconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesconectarActionPerformed
        // desconectar(this.SocketCliente);
    }//GEN-LAST:event_btnDesconectarActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Login vistaInicio = new Login();
                vistaInicio.setLocationRelativeTo(null); 
                vistaInicio.setVisible(true);
                /*
                // se inicializa lo de los sockets cambiar todo esto a la vista de archivos
                JavaClientSocket javaClientSocket = new JavaClientSocket(1802, "localhost");
                Socket clientSocket = javaClientSocket.get();
                // 2. Se verifica si el socket que se creó está bien
                if (clientSocket == null) {
                    System.out.println("Socket está nulo");
                    return;
                } else {
                    System.out.println("Socket Creado con éxito");
                }
                // 3. Se crea el cliente
                SocketProcess client = new SocketClient(clientSocket);
                SocketCliente=client;
                // 4. Se inicia la sesión
                if (!client.connect()) {
                    System.out.println("Conexión al servidor fallida");
                    return;
                } else {
                    System.out.println("Conectado al servidor");
                }
                
                new Thread(new ServerListener(client)).start();
                */
                
            
            }
        });
    }
    
    public int loginUser(String name,String password){
        Client client = new Client("localhost", "1099", "UsrService");
        return client.loginUser(name, password); 
        
    }
    
    public String getRole(int id){
        Client client = new Client("localhost", "1099", "UsrService");
        return client.getRol(id); 
        
    }
    
    
    // todo esto se movera a la vista de archiv
    
    
    public void enviarNotificacion(SocketProcess client){
        String mensaje = "Archivo agregado, actualizar pagina";
        if (mensaje.isEmpty()) {
            return; // No enviar si el mensaje está vacío
        }
        
        ArrayList<Object> dataRequest = new ArrayList<>();
        dataRequest.add(mensaje);
        dataRequest.add(0);
        client.write(dataRequest);
        
        if("-/DISCONNECT".equals(mensaje)){
         this.conectado=false;
            
        }
    }    
    public void desconectar(SocketProcess client){
        String mensaje = "-/DISCONNECT";
        ArrayList<Object> dataRequest = new ArrayList<>();
        dataRequest.add(mensaje);
        dataRequest.add(0);
        client.write(dataRequest);
         this.conectado=false;
         if (!client.close()) {
                    System.out.println("Fallo al cerrar el cliente");
                }
                System.out.println("Cliente cerrado");
                System.exit(0);
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDesconectar;
    private javax.swing.JButton btnNotificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblError;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}