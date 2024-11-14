package p147_TercerExamenParcial;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class JugadorGUI extends JFrame {
    private JTable tablaJugadores;
    private DefaultTableModel modeloTabla;
    private JTextField txtNombre, txtEdad, txtSexo, txtEstadoCivil, txtDescripcion, txtSalario;
    private List<Jugador> jugadores;

    public JugadorGUI() {
        setTitle("Liga de Fútbol - Gestión de Jugadores");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 400);
        setLayout(new BorderLayout());

        
        try {
            jugadores = JugadorUtileria.cargarJugadores();
        } catch (IOException | ClassNotFoundException e) {
            jugadores = new ArrayList<>();
        }

    
        JMenuBar barraMenus = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemGuardar = new JMenuItem("Guardar");
        JMenuItem itemSalir = new JMenuItem("Salir");
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        menuArchivo.addSeparator();
        menuArchivo.add(itemSalir);
        barraMenus.add(menuArchivo);

        JMenu menuAyuda = new JMenu("Ayuda");
        JMenuItem itemAcercaDe = new JMenuItem("Acerca de...");
        menuAyuda.add(itemAcercaDe);
        barraMenus.add(menuAyuda);

        setJMenuBar(barraMenus);

        
        modeloTabla = new DefaultTableModel(new String[]{"Nombre", "Edad", "Sexo", "Estado Civil", "Descripción", "Salario"}, 0);
        tablaJugadores = new JTable(modeloTabla);
        JScrollPane scrollTabla = new JScrollPane(tablaJugadores);
        add(scrollTabla, BorderLayout.CENTER);

      
        JPanel panelDatos = new JPanel(new GridLayout(6, 2));
        panelDatos.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelDatos.add(txtNombre);

        panelDatos.add(new JLabel("Edad:"));
        txtEdad = new JTextField();
        panelDatos.add(txtEdad);

        panelDatos.add(new JLabel("Sexo (H/M):"));
        txtSexo = new JTextField();
        panelDatos.add(txtSexo);

        panelDatos.add(new JLabel("Estado Civil:"));
        txtEstadoCivil = new JTextField();
        panelDatos.add(txtEstadoCivil);

        panelDatos.add(new JLabel("Descripción:"));
        txtDescripcion = new JTextField();
        panelDatos.add(txtDescripcion);

        panelDatos.add(new JLabel("Salario:"));
        txtSalario = new JTextField();
        panelDatos.add(txtSalario);

        add(panelDatos, BorderLayout.EAST);

        
        JPanel panelBotones = new JPanel();
        JButton btnAgregar = new JButton("Agregar");
        JButton btnGuardar = new JButton("Guardar");
        JButton btnMostrarTotal = new JButton("Mostrar Total");
        panelBotones.add(btnAgregar);
        panelBotones.add(btnGuardar);
        panelBotones.add(btnMostrarTotal);
        add(panelBotones, BorderLayout.SOUTH);

       
        itemAbrir.addActionListener(e -> cargarDatos());
        itemGuardar.addActionListener(e -> guardarDatos());
        itemSalir.addActionListener(e -> System.exit(0));
        itemAcercaDe.addActionListener(e -> JOptionPane.showMessageDialog(this, "Aplicación creada para gestionar jugadores de una liga de fútbol."));

        
        btnAgregar.addActionListener(e -> agregarJugador());
        btnGuardar.addActionListener(e -> guardarDatos());
        btnMostrarTotal.addActionListener(e -> mostrarTotal());

        
        cargarTabla();
    }

    private void cargarDatos() {
        try {
            jugadores = JugadorUtileria.cargarJugadores();
            cargarTabla();
        } catch (IOException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error al cargar datos: " + ex.getMessage());
        }
    }

    private void guardarDatos() {
        try {
            JugadorUtileria.guardarJugadores(jugadores);
            JOptionPane.showMessageDialog(this, "Datos guardados correctamente.");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al guardar datos: " + ex.getMessage());
        }
    }

    private void cargarTabla() {
        modeloTabla.setRowCount(0);
        for (Jugador jugador : jugadores) {
            modeloTabla.addRow(new Object[]{
                jugador.getNombre(), jugador.getEdad(), jugador.getSexo(), jugador.getEstadoCivil(),
                jugador.getDescripcion(), jugador.getSalario()
            });
        }
    }

    private void agregarJugador() {
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        char sexo = txtSexo.getText().charAt(0);
        String estadoCivil = txtEstadoCivil.getText();
        String descripcion = txtDescripcion.getText();
        double salario = Double.parseDouble(txtSalario.getText());

        Jugador nuevoJugador = new Jugador(nombre, edad, sexo, estadoCivil, descripcion, salario);
        jugadores.add(nuevoJugador);
        cargarTabla();
    }

    private void mostrarTotal() {
        double totalSalarios = jugadores.stream().mapToDouble(Jugador::getSalario).sum();
        long totalHombres = jugadores.stream().filter(j -> j.getSexo() == 'H').count();
        long totalMujeres = jugadores.stream().filter(j -> j.getSexo() == 'M').count();

        JOptionPane.showMessageDialog(this, "Total Salarios: $" + totalSalarios +
                "\nHombres: " + totalHombres + "\nMujeres: " + totalMujeres);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JugadorGUI().setVisible(true));
    }
}

