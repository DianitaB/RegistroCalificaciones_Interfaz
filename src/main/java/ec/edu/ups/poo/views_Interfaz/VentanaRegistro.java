package ec.edu.ups.poo.views_Interfaz;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistro extends Frame implements ActionListener {

    private Panel panelSuperior;
    private Button botonAgregar;
    private Button botonModificar;
    private Button botonEliminar;

    private Panel panelCentral;
    private Label labelCedula;
    private Label labelNombre;
    private Label labelApellido;
    private TextField txtCedula;
    private TextField txtNombre;
    private TextField txtApellido;

    private Panel panelInferior;
    private Button botonGuardar;
    private Button botonCancelar;

    public VentanaRegistro() {
        setTitle("Registro de Calificaciones");
        setSize(400, 200);
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);


        panelSuperior = new Panel(new FlowLayout());
        botonAgregar = new Button("Agregar");
        botonModificar = new Button("Modificar");
        botonEliminar = new Button("Eliminar");
        panelSuperior.add(botonAgregar);
        panelSuperior.add(botonModificar);
        panelSuperior.add(botonEliminar);
        add(panelSuperior, BorderLayout.NORTH);


        panelCentral = new Panel(new GridLayout(3, 2, 10, 10));
        labelCedula = new Label("Cédula:");
        txtCedula = new TextField();
        labelNombre = new Label("Nombre:");
        txtNombre = new TextField();
        labelApellido = new Label("Apellido:");
        txtApellido = new TextField();
        panelCentral.add(labelCedula);
        panelCentral.add(txtCedula);
        panelCentral.add(labelNombre);
        panelCentral.add(txtNombre);
        panelCentral.add(labelApellido);
        panelCentral.add(txtApellido);
        add(panelCentral, BorderLayout.CENTER);

        panelInferior = new Panel(new FlowLayout(FlowLayout.CENTER));
        botonGuardar = new Button("Guardar");
        botonCancelar = new Button("Cancelar");
        panelInferior.add(botonGuardar);
        panelInferior.add(botonCancelar);
        add(panelInferior, BorderLayout.SOUTH);

        setVisible(true);
        botonGuardar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("--Datos ingresados--");
        System.out.println("Cédula: " + txtCedula.getText());
        System.out.println("Nombre: " + txtNombre.getText());
        System.out.println("Apellido: " + txtApellido.getText());
    }
}
