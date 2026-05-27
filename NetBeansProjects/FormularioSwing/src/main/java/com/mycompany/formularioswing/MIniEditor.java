package com.mycompany.formularioswing;

import javax.swing.*; //trae todas las clases necesarias para crear interfaces gráficas (ventanas, botones, etiquetas, etc.)

public class MIniEditor {
    public static void main(String[] args) {
        //Ventana principal
        JFrame ventana = new JFrame("Mini Editor de Texto");
        ventana.setSize(400, 300); //Define el tamaño de la ventana.
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Hace que el programa termine cuando se cierra la ventana.

        //Barra de menú
        JMenuBar barraMenu = new JMenuBar(); //JMenuBar coloca la barra arriba de la ventana.
        ventana.setJMenuBar(barraMenu);

        //Menú Archivo
        JMenu menuArchivo = new JMenu("Archivo"); //JMenu es el menú desplegable que se verá en la barra.
        barraMenu.add(menuArchivo);

        //Opciones dentro de Archivo
        //JMenuItem son las opciones que el usuario puede seleccionar.
        JMenuItem limpiarItem = new JMenuItem("Limpiar texto");
        JMenuItem salirItem = new JMenuItem("Salir");

        menuArchivo.add(limpiarItem);
        menuArchivo.add(salirItem);

        //Área de texto con scroll
        //JScrollPane envuelve al JTextArea para que aparezcan barras de desplazamiento si el texto es largo.
        JTextArea areaTexto = new JTextArea();
        JScrollPane scroll = new JScrollPane(areaTexto);
        ventana.add(scroll);

        //Acción, limpiar texto
        //Con addActionListener definimos qué pasa cuando el usuario hace clic en cada opción.
        limpiarItem.addActionListener(e -> areaTexto.setText(""));

        //Acción, salir del programa
        salirItem.addActionListener(e -> System.exit(0));

        ventana.setVisible(true);
    }
}
