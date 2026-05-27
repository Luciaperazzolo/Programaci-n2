package com.mycompany.formularioswing;

import javax.swing.*; //trae todas las clases necesarias para crear interfaces gráficas (ventanas, botones, etiquetas, etc.)
import java.awt.event.*; //permite manejar eventos, como el clic en un botón.

public class FormularioBasico extends JFrame implements ActionListener {
    //JFrame indica que es una ventana.
    //ActionListener indica que puede escuchar acciones.
    
    private JTextField campoNombre;
    private JLabel etiquetaResultado;
    private JButton botonSaludar;
    
    public FormularioBasico() {
        setSize(300, 200); //Define el tamaño de la ventana.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Hace que el programa termine cuando se cierra la ventana.
    
        JPanel panel = new JPanel(); //Crea un panel contenedor es donde se van a poner todos los elementos.
        add(panel); //Lo agrega a la ventana.
    
        panel.add(new JLabel("Introduce tu nombre:")); //Añade una etiqueta con el texto “Introduce tu nombre:”.
        campoNombre = new JTextField(20); //Crea el campo de texto de 20 columnas.
        panel.add(campoNombre); //Lo agrega al panel.

        botonSaludar = new JButton("Saludar"); //Crea el botón “Saludar”.
        botonSaludar.addActionListener(this); //Cuando te hagan clic, avisame a mí (this).
        panel.add(botonSaludar); //Lo agrega al panel.
    
        etiquetaResultado = new JLabel(""); //Crea una etiqueta vacía, se va a usar para mostrar un saludo.
        panel.add(etiquetaResultado);
    }
    
    @Override
    //Se ejecuta cuando el usuario hace clic en el botón.
    public void actionPerformed(ActionEvent e) {
        String nombre = campoNombre.getText(); //Obtiene lo que el usuario escribió en el campo.
        etiquetaResultado.setText("Hola, " + nombre); //Cambia el texto de la etiqueta para mostrar "Hola, [nombre]".
    }
    
    public static void main(String[] args) {
        FormularioBasico ventana = new FormularioBasico();
        ventana.setVisible(true);
    }

}
 