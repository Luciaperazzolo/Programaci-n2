package com.mycompany.formularioswing;

import javax.swing.*; //trae todas las clases necesarias para crear interfaces gráficas (ventanas, botones, etiquetas, etc.)

public class PantallaLogin extends JFrame{

    //Contraseña secreta predefinida
    private final String claveSecreta = "1234";

    public PantallaLogin() {
        //Definimos la ventana y un panel para organizar los componentes.
        setTitle("Login");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel principal
        JPanel panel = new JPanel();
        add(panel);

        //Etiqueta y campo de usuario
        JLabel lblUsuario = new JLabel("Usuario:");
        JTextField txtUsuario = new JTextField(15);

        //Etiqueta y campo de contraseña
        JLabel lblClave = new JLabel("Contraseña:");
        JPasswordField txtClave = new JPasswordField("", 15); //JPasswordField es como un JTextField pero oculta lo que se escribe.
        txtClave.setEchoChar('*'); //oculta caracteres con asteriscos

        //Botón de acceso
        JButton btnAcceder = new JButton("Acceder");

        //Agregar componentes al panel
        panel.add(lblUsuario);
        panel.add(txtUsuario);
        panel.add(lblClave);
        panel.add(txtClave);
        panel.add(btnAcceder);

        //Acción del botón
        btnAcceder.addActionListener(e -> {
            String usuario = txtUsuario.getText();
            char[] claveIngresada = txtClave.getPassword(); //getPassword() devuelve un char[] por seguridad. 
                                                            //Lo convertimos a String para comparar con la clave guardada.

            //Convertimos el arreglo de chars a String
            String clave = new String(claveIngresada);

            if (clave.equals(claveSecreta)) {
                JOptionPane.showMessageDialog(this,
                        "Acceso correcto. Bienvenido " + usuario + "!");
            } else {
                JOptionPane.showMessageDialog(this,
                        "Contraseña incorrecta. Intente nuevamente.");
            }
        });
    }
    public static void main(String[] args) {
        PantallaLogin ventana = new PantallaLogin();
        ventana.setVisible(true);
    }


}
