package com.mycompany.formularioswing;

import javax.swing.*; //trae todas las clases necesarias para crear interfaces gráficas (ventanas, botones, etiquetas, etc.)

public class PanelPreferencias {
    public static void main(String[] args) {
        //Ventana principal
        JFrame ventana = new JFrame("Panel de Preferencias");
        ventana.setSize(400, 200);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel principal
        JPanel panel = new JPanel();
        ventana.add(panel);

        //Etiqueta inicial
        JLabel etiqueta = new JLabel("Opciones seleccionadas: Ninguna");
        panel.add(etiqueta);

        //Botón para abrir preferencias
        JButton botonConfig = new JButton("Configurar Preferencias");
        panel.add(botonConfig);

        //Ventana Secundaria (JDialog)
        JDialog dialogo = new JDialog(ventana, "Preferencias", true); //true = modal,  al ser modal bloquea la principal hasta que se cierre.
        dialogo.setSize(300, 200);
        JPanel panelDialogo = new JPanel();
        dialogo.add(panelDialogo);

        //Casillas de verificación
        JCheckBox chkOscuro = new JCheckBox("Modo Oscuro");
        JCheckBox chkNotificaciones = new JCheckBox("Notificaciones");
        JCheckBox chkAutoguardado = new JCheckBox("Autoguardado");

        panelDialogo.add(chkOscuro);
        panelDialogo.add(chkNotificaciones);
        panelDialogo.add(chkAutoguardado);

        // Botón aceptar
        JButton botonAceptar = new JButton("Aceptar");
        panelDialogo.add(botonAceptar);

        //Acción para abrir el diálogo
        //Cuando el usuario hace clic en "Configurar Preferencias", aparece la ventana secundaria.
        botonConfig.addActionListener(e -> dialogo.setVisible(true));

        //Acción para procesar las opciones
        //Aquí se revisa cada JCheckBox con isSelected()
        //Se arma un texto con las opciones elegidas y se actualiza la etiqueta de la ventana principal.
        botonAceptar.addActionListener(e -> {
            StringBuilder seleccion = new StringBuilder();

            if (chkOscuro.isSelected()) seleccion.append("Modo Oscuro ");
            if (chkNotificaciones.isSelected()) seleccion.append("Notificaciones ");
            if (chkAutoguardado.isSelected()) seleccion.append("Autoguardado ");

            if (seleccion.length() == 0) {
                etiqueta.setText("Opciones seleccionadas: Ninguna");
            } else {
                etiqueta.setText("Opciones seleccionadas: " + seleccion.toString());
            }

            dialogo.dispose(); //cerrar el diálogo
        });

         ventana.setVisible(true);
    }    
}
