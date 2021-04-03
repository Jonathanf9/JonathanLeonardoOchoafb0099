package com.istl.vista;

import com.istl.controlador.Inventariodb;
import com.istl.controlador.Personabd;
import com.istl.controlador.Proveedorbd;
import com.istl.modelJTable.ModelTablePersona;
import com.istl.modelo.Persona;
import com.istl.modelo.Proveedor;
import com.istl.utilidad.Utilidad;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import com.istl.modelJTable.ComunicacionVistadeTablas;
import com.istl.modelJTable.ModelTableInventario;
import com.istl.modelJTable.ModelTableProveedor;
import com.istl.modelo.Inventario;
import com.istl.utilidad.UtilidadInventario;
import java.awt.Color;

public class GestionContable extends javax.swing.JFrame implements ComunicacionVistadeTablas {

    private Utilidad utilidad;
    private Personabd controladorPersona;
    private Proveedorbd controladorProveedor;
    private Inventariodb controladorInvenario;
    private Persona personaEditar;
    private GestionPersona gestion;
    private GestionProveedor gestionpro;
    private GestionInventario gestioninven;
    private ModelTablePersona modelTablePersona;
    private ModelTableInventario modelTableInventario;
    private ModelTableProveedor modelTableProveedor;
    private Proveedor proveedoreditar;
    private Inventario inventarioeditar;
    private UtilidadInventario util;

    public GestionContable() {
        controladorPersona = new Personabd();
        controladorProveedor = new Proveedorbd();
        controladorInvenario = new Inventariodb();
        modelTablePersona = new ModelTablePersona(controladorPersona.obtenerPersonas(), this);
        modelTableProveedor = new ModelTableProveedor(controladorProveedor.obtenerProveedor(), this);
        modelTableInventario = new ModelTableInventario(controladorInvenario.obtenerInventario(), this);
        initComponents();
        cajastexto();
        rbbottomcedula.setSelected(true);
        this.setLocationRelativeTo(null);
        utilidad = new Utilidad();
        util = new UtilidadInventario();
        gestion = new GestionPersona(txtcedula, txtnombre, txtapellido, txtdireccion, txttelefono, txtcorreo, cmbgenero, jdatefechanacimiento, utilidad, this);
        gestionpro = new GestionProveedor(txtrucpro, txtrazonpro, txtactividadpro, txtnombrepro, txtapellidopro, txttelefonopro, txtcorreopro, txtdireccionpro, jdatefechavencimientopro, this);
        gestioninven = new GestionInventario(txtcodigoin, txtcantidadin, txtdescripcionin, txtpreciosiniva, txtprecioconiva, txtpreciomayorita, txtprecioclientefijo, txtprecioclientenormal, jdfechacaducidadonve, utilidad, this);
        bneliminar.setEnabled(false);
        bneditar.setEnabled(false);
        bneliminarpro.setEnabled(false);
        bneditarpro.setEnabled(false);
        bneditarinve.setEnabled(false);
        bneliminarinve.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        botongrupo = new javax.swing.ButtonGroup();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        panelclientes = new javax.swing.JPanel();
        bnlimpiar = new javax.swing.JButton();
        bnguardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlcedula = new javax.swing.JLabel();
        ljdireccion = new javax.swing.JLabel();
        jlapellido = new javax.swing.JLabel();
        jlnombre = new javax.swing.JLabel();
        ljcorreo = new javax.swing.JLabel();
        jlcorreo = new javax.swing.JLabel();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jlcorreo2 = new javax.swing.JLabel();
        cmbgenero = new javax.swing.JComboBox<>();
        rbbottomcedula = new javax.swing.JRadioButton();
        rbbottompasaporte = new javax.swing.JRadioButton();
        jlcorreo6 = new javax.swing.JLabel();
        jdatefechanacimiento = new com.toedter.calendar.JDateChooser();
        bneliminar = new javax.swing.JButton();
        bnregistro = new javax.swing.JButton();
        bneditar = new javax.swing.JButton();
        jlcorreo1 = new javax.swing.JLabel();
        cmbbusqueda = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtbuscarparametro = new javax.swing.JTextField();
        bnbuscarpersona = new javax.swing.JButton();
        panelproveedores = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bnlimpiarpro = new javax.swing.JButton();
        bnregistropro = new javax.swing.JButton();
        bneliminarpro = new javax.swing.JButton();
        bneditarpro = new javax.swing.JButton();
        bnguardarpro = new javax.swing.JButton();
        jlcorreo3 = new javax.swing.JLabel();
        cmbbusquedapro = new javax.swing.JComboBox<>();
        txtbuscarparametropro = new javax.swing.JTextField();
        bnbuscarproveedores = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jlcedula2 = new javax.swing.JLabel();
        ljdireccion2 = new javax.swing.JLabel();
        jlapellido2 = new javax.swing.JLabel();
        jlnombre2 = new javax.swing.JLabel();
        ljcorreo2 = new javax.swing.JLabel();
        jlcorreo4 = new javax.swing.JLabel();
        txtrucpro = new javax.swing.JTextField();
        txtrazonpro = new javax.swing.JTextField();
        txtactividadpro = new javax.swing.JTextField();
        txtnombrepro = new javax.swing.JTextField();
        txtapellidopro = new javax.swing.JTextField();
        txttelefonopro = new javax.swing.JTextField();
        jlcorreo5 = new javax.swing.JLabel();
        txtcorreopro = new javax.swing.JTextField();
        jlcorreo7 = new javax.swing.JLabel();
        txtdireccionpro = new javax.swing.JTextField();
        jlcorreo9 = new javax.swing.JLabel();
        jdatefechavencimientopro = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtproveedor = new javax.swing.JTable();
        panelinventario = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jlcedula3 = new javax.swing.JLabel();
        ljdireccion3 = new javax.swing.JLabel();
        jlapellido3 = new javax.swing.JLabel();
        jlnombre3 = new javax.swing.JLabel();
        ljcorreo3 = new javax.swing.JLabel();
        txtcodigoin = new javax.swing.JTextField();
        txtdescripcionin = new javax.swing.JTextField();
        txtpreciosiniva = new javax.swing.JTextField();
        txtprecioconiva = new javax.swing.JTextField();
        txtcantidadin = new javax.swing.JTextField();
        jlapellido4 = new javax.swing.JLabel();
        txtpreciomayorita = new javax.swing.JTextField();
        jlapellido5 = new javax.swing.JLabel();
        txtprecioclientefijo = new javax.swing.JTextField();
        jlapellido6 = new javax.swing.JLabel();
        txtprecioclientenormal = new javax.swing.JTextField();
        jlapellido7 = new javax.swing.JLabel();
        jdfechacaducidadonve = new com.toedter.calendar.JDateChooser();
        jPanel6 = new javax.swing.JPanel();
        bnlimpiarinve = new javax.swing.JButton();
        bneliminarinve = new javax.swing.JButton();
        bneditarinve = new javax.swing.JButton();
        bnguardarinve = new javax.swing.JButton();
        jlcorreo8 = new javax.swing.JLabel();
        cmbbusquedainven = new javax.swing.JComboBox<>();
        txtbuscarparametroinventario = new javax.swing.JTextField();
        bnbuscarinventario = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtproveedor1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        panelventas = new javax.swing.JPanel();
        panelventas1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtnumerodenotaventa = new javax.swing.JTextField();
        txtcedulanota = new javax.swing.JTextField();
        txtnombrenota = new javax.swing.JTextField();
        txttelefononota = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtdireccionnota = new javax.swing.JTextField();
        txtfechanota = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtproductonota = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtcantidadnota = new javax.swing.JTextField();
        bnagregarnota = new javax.swing.JButton();
        bnagregarnota1 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablanotadeventa = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuarchivo = new javax.swing.JMenu();
        jmenusalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmenuaccionbuscar = new javax.swing.JMenuItem();
        jMenueditar = new javax.swing.JMenuItem();
        jmenueliminar = new javax.swing.JMenuItem();
        jmenuguardar = new javax.swing.JMenuItem();
        menueditar = new javax.swing.JMenu();
        Acerca_de = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de ventas");
        setResizable(false);

        jTabbedPane2.setBackground(new java.awt.Color(254, 248, 83));
        jTabbedPane2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        panelclientes.setBackground(new java.awt.Color(254, 248, 83));

        bnlimpiar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        bnlimpiar.setText("Limpiar");
        bnlimpiar.setToolTipText("Limpiar campos");
        bnlimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bnlimpiarMouseClicked(evt);
            }
        });
        bnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnlimpiarActionPerformed(evt);
            }
        });

        bnguardar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        bnguardar.setText("Guardar");
        bnguardar.setToolTipText("Guardar registro");
        bnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnguardarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Registro  Usuarios");

        jPanel1.setBackground(new java.awt.Color(55, 121, 228));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setToolTipText("");

        jlcedula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcedula.setText("CEDULA");

        ljdireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ljdireccion.setText("DIRECCIÓN");

        jlapellido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlapellido.setText("APELLIDO");

        jlnombre.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlnombre.setText("NOMBRE");

        ljcorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ljcorreo.setText("CORREO");

        jlcorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo.setText("TELÉFONO");

        txtcedula.setToolTipText("Ingrese una cedula correcta");
        txtcedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcedulaFocusLost(evt);
            }
        });
        txtcedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtcedulaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtcedulaMouseExited(evt);
            }
        });

        txtnombre.setToolTipText("Ingrese nombre");
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtapellido.setToolTipText("Ingrese apellido");

        txtdireccion.setToolTipText("Ingrese una dirección");

        txtcorreo.setToolTipText("Ingrese un correo valido");

        txttelefono.setToolTipText("Ingrse un teléfono correcto");

        jlcorreo2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo2.setText("GÉNERO");

        cmbgenero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbgenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No definido", "Hombre", "Mujer" }));
        cmbgenero.setToolTipText("Seleccione un género");
        cmbgenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbgeneroActionPerformed(evt);
            }
        });

        botongrupo.add(rbbottomcedula);
        rbbottomcedula.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbbottomcedula.setText("Cédula");

        botongrupo.add(rbbottompasaporte);
        rbbottompasaporte.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        rbbottompasaporte.setText("Pasaporte");

        jlcorreo6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo6.setText("FECHA NACIMIENTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ljdireccion)
                    .addComponent(jlnombre)
                    .addComponent(ljcorreo)
                    .addComponent(jlcorreo)
                    .addComponent(jlcorreo2)
                    .addComponent(jlcorreo6)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jlcedula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlapellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtcedula, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                    .addComponent(txtnombre)
                    .addComponent(txtcorreo)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txttelefono)
                    .addComponent(jdatefechanacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbgenero, 0, 344, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(rbbottomcedula)
                .addGap(18, 18, 18)
                .addComponent(rbbottompasaporte)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jlcedula))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rbbottomcedula)
                        .addComponent(rbbottompasaporte)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnombre)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlapellido)
                    .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ljdireccion)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ljcorreo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcorreo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlcorreo2)
                    .addComponent(cmbgenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlcorreo6)
                    .addComponent(jdatefechanacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bneliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        bneliminar.setText("Eliminar");
        bneliminar.setToolTipText("Eliminar registro");
        bneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneliminarActionPerformed(evt);
            }
        });

        bnregistro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro de implementacion09.png"))); // NOI18N
        bnregistro.setText("Ver registro");
        bnregistro.setToolTipText("Ver registros");
        bnregistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bnregistroMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bnregistroMouseReleased(evt);
            }
        });
        bnregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnregistroActionPerformed(evt);
            }
        });

        bneditar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        bneditar.setText("Editar");
        bneditar.setToolTipText("Editar registro");
        bneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneditarActionPerformed(evt);
            }
        });

        jlcorreo1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo1.setText("Buscar ");

        cmbbusqueda.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbbusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cédula", "Nombres", "Apellidos", "Telefono", "Correo" }));

        jTable1.setBackground(new java.awt.Color(51, 255, 153));
        jTable1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jTable1.setModel(modelTablePersona);
        jTable1.setToolTipText("Seleccione registro");
        jScrollPane1.setViewportView(jTable1);

        txtbuscarparametro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtbuscarparametro.setToolTipText("Para realizar la busquedad ingrese algun parametro");
        txtbuscarparametro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarparametroKeyReleased(evt);
            }
        });

        bnbuscarpersona.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnbuscarpersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        bnbuscarpersona.setText("Buscar");
        bnbuscarpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbuscarpersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelclientesLayout = new javax.swing.GroupLayout(panelclientes);
        panelclientes.setLayout(panelclientesLayout);
        panelclientesLayout.setHorizontalGroup(
            panelclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelclientesLayout.createSequentialGroup()
                .addGroup(panelclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelclientesLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(panelclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 689, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelclientesLayout.createSequentialGroup()
                                .addGroup(panelclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelclientesLayout.createSequentialGroup()
                                        .addComponent(jlcorreo1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(panelclientesLayout.createSequentialGroup()
                                        .addGap(34, 34, 34)
                                        .addComponent(bneditar)
                                        .addGap(29, 29, 29)
                                        .addComponent(bnguardar)))
                                .addGroup(panelclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelclientesLayout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(bneliminar)
                                        .addGap(36, 36, 36)
                                        .addComponent(bnregistro))
                                    .addGroup(panelclientesLayout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(txtbuscarparametro, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(73, 73, 73)
                                        .addComponent(bnbuscarpersona))))))
                    .addGroup(panelclientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(132, Short.MAX_VALUE))
            .addGroup(panelclientesLayout.createSequentialGroup()
                .addGroup(panelclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bnlimpiar)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelclientesLayout.setVerticalGroup(
            panelclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelclientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bneditar)
                    .addComponent(bnguardar)
                    .addComponent(bneliminar)
                    .addComponent(bnregistro)
                    .addComponent(bnlimpiar))
                .addGap(24, 24, 24)
                .addGroup(panelclientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcorreo1)
                    .addComponent(cmbbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscarparametro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnbuscarpersona))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jTabbedPane2.addTab("Clientes", panelclientes);

        panelproveedores.setBackground(new java.awt.Color(254, 248, 83));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setText("Registro  Proveedores");

        jPanel3.setBackground(new java.awt.Color(254, 248, 83));

        bnlimpiarpro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnlimpiarpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        bnlimpiarpro.setText("Limpiar");
        bnlimpiarpro.setToolTipText("Limpiar campos");
        bnlimpiarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnlimpiarproActionPerformed(evt);
            }
        });

        bnregistropro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnregistropro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/registro de implementacion09.png"))); // NOI18N
        bnregistropro.setText("Ver registro");
        bnregistropro.setToolTipText("Ver registros");
        bnregistropro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnregistroproActionPerformed(evt);
            }
        });

        bneliminarpro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bneliminarpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        bneliminarpro.setText("Eliminar");
        bneliminarpro.setToolTipText("Eliminar registro");
        bneliminarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneliminarproActionPerformed(evt);
            }
        });

        bneditarpro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bneditarpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        bneditarpro.setText("Editar");
        bneditarpro.setToolTipText("Editar registro");
        bneditarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneditarproActionPerformed(evt);
            }
        });

        bnguardarpro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnguardarpro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        bnguardarpro.setText("Guardar");
        bnguardarpro.setToolTipText("Guardar registro");
        bnguardarpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnguardarproActionPerformed(evt);
            }
        });

        jlcorreo3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo3.setText("Buscar ");

        cmbbusquedapro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbbusquedapro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ruc", "Nombre", "Razón social", "Tipo de actividad", "Apellido", "Telefono", "Correo" }));

        txtbuscarparametropro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtbuscarparametropro.setToolTipText("Ingrese los datos a buscar");
        txtbuscarparametropro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarparametroproKeyReleased(evt);
            }
        });

        bnbuscarproveedores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnbuscarproveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        bnbuscarproveedores.setText("Buscar");
        bnbuscarproveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbuscarproveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(bneditarpro)
                        .addGap(18, 18, 18)
                        .addComponent(bnguardarpro)
                        .addGap(32, 32, 32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jlcorreo3)
                        .addGap(18, 18, 18)
                        .addComponent(cmbbusquedapro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(txtbuscarparametropro, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bnbuscarproveedores)
                .addGap(61, 61, 61))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(290, 290, 290)
                    .addComponent(bneliminarpro)
                    .addGap(18, 18, 18)
                    .addComponent(bnregistropro)
                    .addGap(18, 18, 18)
                    .addComponent(bnlimpiarpro)
                    .addContainerGap(72, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bnguardarpro)
                    .addComponent(bneditarpro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcorreo3)
                    .addComponent(cmbbusquedapro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscarparametropro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnbuscarproveedores))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bneliminarpro)
                        .addComponent(bnregistropro)
                        .addComponent(bnlimpiarpro))
                    .addContainerGap(57, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(55, 121, 228));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setToolTipText("");
        jPanel4.setName("Registro"); // NOI18N

        jlcedula2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcedula2.setText("RUC");

        ljdireccion2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ljdireccion2.setText("NOMBRE DE REPRESENTANTE");

        jlapellido2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlapellido2.setText("TIPO DE ACTIVIDAD");

        jlnombre2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlnombre2.setText("RAZÓN SOCIAL");

        ljcorreo2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ljcorreo2.setText("APELLIDO DE REPRESENTATE");

        jlcorreo4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo4.setText("TELÉFONO");

        txtrucpro.setToolTipText("Ingrese el ruc");

        txtrazonpro.setToolTipText("Ingrese la rázon social");

        txtactividadpro.setToolTipText("Ingrese el tipo de actividad");

        txtnombrepro.setToolTipText("Ingrese el nombre del representante");

        txtapellidopro.setToolTipText("Ingrese el apellido del representante");

        txttelefonopro.setToolTipText("Ingrese el teléfono");

        jlcorreo5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo5.setText("CORREO");

        txtcorreopro.setToolTipText("Ingrse el correo electrónico");

        jlcorreo7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo7.setText("DIRECCIÓN");

        txtdireccionpro.setToolTipText("Ingrese la dirección");

        jlcorreo9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo9.setText("FECHA DE VENCIMIENTO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ljdireccion2)
                    .addComponent(jlapellido2)
                    .addComponent(jlnombre2)
                    .addComponent(ljcorreo2)
                    .addComponent(jlcorreo4)
                    .addComponent(jlcedula2)
                    .addComponent(jlcorreo5)
                    .addComponent(jlcorreo7)
                    .addComponent(jlcorreo9))
                .addGap(80, 80, 80)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtdireccionpro)
                    .addComponent(txtrazonpro)
                    .addComponent(txtapellidopro)
                    .addComponent(txtnombrepro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtactividadpro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txttelefonopro)
                    .addComponent(txtcorreopro)
                    .addComponent(txtrucpro)
                    .addComponent(jdatefechavencimientopro, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcedula2)
                    .addComponent(txtrucpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlnombre2)
                    .addComponent(txtrazonpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtactividadpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlapellido2))
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ljdireccion2)
                    .addComponent(txtnombrepro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ljcorreo2)
                    .addComponent(txtapellidopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefonopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcorreo4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcorreopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcorreo5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccionpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlcorreo7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlcorreo9)
                    .addComponent(jdatefechavencimientopro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
        );

        jtproveedor.setBackground(new java.awt.Color(51, 255, 153));
        jtproveedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtproveedor.setModel(modelTableProveedor);
        jtproveedor.setToolTipText("Seleccione registro");
        jScrollPane2.setViewportView(jtproveedor);

        javax.swing.GroupLayout panelproveedoresLayout = new javax.swing.GroupLayout(panelproveedores);
        panelproveedores.setLayout(panelproveedoresLayout);
        panelproveedoresLayout.setHorizontalGroup(
            panelproveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproveedoresLayout.createSequentialGroup()
                .addGroup(panelproveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelproveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelproveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelproveedoresLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelproveedoresLayout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelproveedoresLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        panelproveedoresLayout.setVerticalGroup(
            panelproveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelproveedoresLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.getAccessibleContext().setAccessibleName("");

        jTabbedPane2.addTab("Proveedores", panelproveedores);

        panelinventario.setBackground(new java.awt.Color(254, 248, 83));

        jPanel5.setBackground(new java.awt.Color(55, 121, 228));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setToolTipText("");
        jPanel5.setName("Registro"); // NOI18N

        jlcedula3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcedula3.setText("CÓDIGO DE PRODUCTO");

        ljdireccion3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ljdireccion3.setText("PRECIO COMPRA CON IVA");

        jlapellido3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlapellido3.setText("PRECIO COMPRA SIN IVA");

        jlnombre3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlnombre3.setText("DESCRIPCIÓN");

        ljcorreo3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        ljcorreo3.setText("CANTIDAD DE PRODUCTOS");

        txtcodigoin.setToolTipText("Ingrese el código del producto");

        txtdescripcionin.setToolTipText("Ingrese una descripción del producto");

        txtpreciosiniva.setToolTipText("Ingrese el precio sin iva");
        txtpreciosiniva.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpreciosinivaFocusLost(evt);
            }
        });

        txtprecioconiva.setToolTipText("Ingrese el precio con iva");

        txtcantidadin.setToolTipText("Ingrese la cantidad del producto");

        jlapellido4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlapellido4.setText("PRECIO MAYORISTA");

        txtpreciomayorita.setToolTipText("Ingrese el precio mayorista");

        jlapellido5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlapellido5.setText("PRECIO CLIENTE FIJO");

        txtprecioclientefijo.setToolTipText("Ingrese el precio cliente fijo");

        jlapellido6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlapellido6.setText("PRECIO CLIENTE NORMAL");

        txtprecioclientenormal.setToolTipText("Ingrese el precio cliente normal");
        txtprecioclientenormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioclientenormalActionPerformed(evt);
            }
        });

        jlapellido7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlapellido7.setText("FECHA DE CADUCIDAD");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlnombre3)
                    .addComponent(jlcedula3)
                    .addComponent(jlapellido3)
                    .addComponent(jlapellido4)
                    .addComponent(jlapellido6))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtdescripcionin, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtcodigoin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ljcorreo3)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlapellido5)
                                .addComponent(ljdireccion3)
                                .addComponent(jlapellido7))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtpreciosiniva, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(txtpreciomayorita)
                            .addComponent(txtprecioclientenormal))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtprecioconiva, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidadin, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprecioclientefijo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdfechacaducidadonve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcedula3)
                    .addComponent(txtcodigoin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcantidadin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ljcorreo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlnombre3)
                            .addComponent(txtdescripcionin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ljdireccion3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlapellido3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtpreciosiniva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlapellido5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlapellido4)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtpreciomayorita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlapellido7)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlapellido6)
                            .addComponent(txtprecioclientenormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txtprecioconiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtprecioclientefijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdfechacaducidadonve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(254, 248, 83));

        bnlimpiarinve.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnlimpiarinve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/limpiar.png"))); // NOI18N
        bnlimpiarinve.setText("Limpiar");
        bnlimpiarinve.setToolTipText("Limpiar campos");
        bnlimpiarinve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnlimpiarinveActionPerformed(evt);
            }
        });

        bneliminarinve.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bneliminarinve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        bneliminarinve.setText("Eliminar");
        bneliminarinve.setToolTipText("Eliminar registro");
        bneliminarinve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneliminarinveActionPerformed(evt);
            }
        });

        bneditarinve.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bneditarinve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        bneditarinve.setText("Editar");
        bneditarinve.setToolTipText("Editar registro");
        bneditarinve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bneditarinveActionPerformed(evt);
            }
        });

        bnguardarinve.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnguardarinve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/guardar.png"))); // NOI18N
        bnguardarinve.setText("Guardar");
        bnguardarinve.setToolTipText("Guardar registro");
        bnguardarinve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnguardarinveActionPerformed(evt);
            }
        });

        jlcorreo8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlcorreo8.setText("Buscar ");

        cmbbusquedainven.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbbusquedainven.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CÓDIGO", "DESCRIPCIÓN" }));
        cmbbusquedainven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbusquedainvenActionPerformed(evt);
            }
        });

        txtbuscarparametroinventario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtbuscarparametroinventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarparametroinventarioKeyReleased(evt);
            }
        });

        bnbuscarinventario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        bnbuscarinventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscar.png"))); // NOI18N
        bnbuscarinventario.setText("Buscar");
        bnbuscarinventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnbuscarinventarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jlcorreo8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbbusquedainven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbuscarparametroinventario, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bnbuscarinventario)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(bneditarinve)
                        .addGap(44, 44, 44)
                        .addComponent(bnguardarinve)
                        .addGap(50, 50, 50)
                        .addComponent(bneliminarinve)
                        .addGap(41, 41, 41)
                        .addComponent(bnlimpiarinve)
                        .addGap(154, 154, 154))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bneliminarinve)
                    .addComponent(bneditarinve)
                    .addComponent(bnguardarinve)
                    .addComponent(bnlimpiarinve))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlcorreo8)
                    .addComponent(cmbbusquedainven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscarparametroinventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnbuscarinventario))
                .addContainerGap())
        );

        jtproveedor1.setBackground(new java.awt.Color(51, 255, 153));
        jtproveedor1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtproveedor1.setModel(modelTableInventario);
        jtproveedor1.setToolTipText("Seleccione registro");
        jScrollPane3.setViewportView(jtproveedor1);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel3.setText("Registro  Inventario");

        javax.swing.GroupLayout panelinventarioLayout = new javax.swing.GroupLayout(panelinventario);
        panelinventario.setLayout(panelinventarioLayout);
        panelinventarioLayout.setHorizontalGroup(
            panelinventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinventarioLayout.createSequentialGroup()
                .addGroup(panelinventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelinventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelinventarioLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelinventarioLayout.createSequentialGroup()
                            .addGap(44, 44, 44)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panelinventarioLayout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jLabel3))))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        panelinventarioLayout.setVerticalGroup(
            panelinventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelinventarioLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Inventario", panelinventario);

        panelventas.setBackground(new java.awt.Color(254, 248, 83));

        javax.swing.GroupLayout panelventasLayout = new javax.swing.GroupLayout(panelventas);
        panelventas.setLayout(panelventasLayout);
        panelventasLayout.setHorizontalGroup(
            panelventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 915, Short.MAX_VALUE)
        );
        panelventasLayout.setVerticalGroup(
            panelventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 606, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("", panelventas);

        panelventas1.setBackground(new java.awt.Color(254, 248, 83));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setText("NOTA DE VENTA");

        jPanel2.setBackground(new java.awt.Color(55, 121, 228));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("NÚMERO NOTA VENTA");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("CÉDULA O RUC CLIENTE");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("NOMBRE DEL CLIENTE ");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("TELÉFONO");

        txtcedulanota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcedulanotaFocusLost(evt);
            }
        });

        txtnombrenota.setEditable(false);

        txttelefononota.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("DIRECCIÓN");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("FECHA VENTA");

        txtdireccionnota.setEditable(false);

        txtfechanota.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtnumerodenotaventa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtnombrenota, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(198, 198, 198)
                                .addComponent(txtdireccionnota, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtcedulanota, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(93, 93, 93)
                                .addComponent(txttelefononota, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addComponent(txtfechanota, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnumerodenotaventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcedulanota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtnombrenota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(txtdireccionnota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefononota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(txtfechanota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel7.setBackground(new java.awt.Color(55, 121, 228));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("ID PRODUCTO");

        txtproductonota.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtproductonotaFocusLost(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel12.setText("CANTIDAD");

        txtcantidadnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadnotaActionPerformed(evt);
            }
        });

        bnagregarnota.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bnagregarnota.setText("AGREGAR");
        bnagregarnota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnagregarnotaActionPerformed(evt);
            }
        });

        bnagregarnota1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        bnagregarnota1.setText("BUSQUEDA AVANZADA");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(26, 26, 26)
                .addComponent(txtproductonota, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtcantidadnota, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bnagregarnota)
                .addGap(18, 18, 18)
                .addComponent(bnagregarnota1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtproductonota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtcantidadnota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnagregarnota)
                    .addComponent(bnagregarnota1))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(254, 248, 83));

        tablanotadeventa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CANTIDAD", "DESCRIPCIÓN", "SUB TOTAL", "TOTAL"
            }
        ));
        jScrollPane4.setViewportView(tablanotadeventa);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelventas1Layout = new javax.swing.GroupLayout(panelventas1);
        panelventas1.setLayout(panelventas1Layout);
        panelventas1Layout.setHorizontalGroup(
            panelventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelventas1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(panelventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(panelventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        panelventas1Layout.setVerticalGroup(
            panelventas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelventas1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Venta", panelventas1);

        jMenuBar1.setBackground(new java.awt.Color(55, 121, 228));
        jMenuBar1.setForeground(new java.awt.Color(102, 255, 102));

        menuarchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portafolio.png"))); // NOI18N
        menuarchivo.setText("Archivo");

        jmenusalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenusalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/exit-regular-24.png"))); // NOI18N
        jmenusalir.setText("Salir");
        jmenusalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenusalirActionPerformed(evt);
            }
        });
        menuarchivo.add(jmenusalir);

        jMenu3.setText("Accion persona");
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jmenuaccionbuscar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenuaccionbuscar.setText("Buscar");
        jmenuaccionbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuaccionbuscarActionPerformed(evt);
            }
        });
        jMenu3.add(jmenuaccionbuscar);

        jMenueditar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenueditar.setText("Editar");
        jMenueditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenueditarActionPerformed(evt);
            }
        });
        jMenu3.add(jMenueditar);

        jmenueliminar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenueliminar.setText("Eliminar");
        jmenueliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenueliminarActionPerformed(evt);
            }
        });
        jMenu3.add(jmenueliminar);

        jmenuguardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jmenuguardar.setText("Guardar");
        jmenuguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmenuguardarActionPerformed(evt);
            }
        });
        jMenu3.add(jmenuguardar);

        menuarchivo.add(jMenu3);

        jMenuBar1.add(menuarchivo);

        menueditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        menueditar.setText("Editar");
        jMenuBar1.add(menueditar);

        Acerca_de.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar el implementar09.png"))); // NOI18N
        Acerca_de.setText("Acerca de ");
        Acerca_de.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Acerca_deMouseClicked(evt);
            }
        });
        jMenuBar1.add(Acerca_de);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void editar() {
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Persona personaEditarLocal = gestion.guardarEditar(true);
        if (personaEditarLocal != null) {
            personaEditarLocal.setIdPersona(personaEditar.getIdPersona());
            try {
                if (controladorPersona.editar(personaEditarLocal)) {
                    JOptionPane.showMessageDialog(rootPane, "Persona editada con exito del sitema.");
                    gestion.limpiar();
                    personaEditar = null;
                    tabla();
                    bnguardar.setEnabled(true);
                    bneditar.setEnabled(false);
                    bneliminar.setEnabled(false);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede editar persona", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } catch (HeadlessException | SQLException e) {
            }

        }
    }

    public void editarProveedor() {
        if (proveedoreditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay un proveedpr para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Proveedor proveedorEditarLocal = gestionpro.guardarEditar(true);
        if (proveedorEditarLocal != null) {
            proveedorEditarLocal.setIdProveedor(proveedoreditar.getIdProveedor());
            try {
                if (controladorProveedor.editar(proveedorEditarLocal)) {
                    JOptionPane.showMessageDialog(rootPane, "Proveedor editada con exito del sitema.");
                    gestionpro.limpiar();
                    personaEditar = null;
                    tablaproveedor();
                    bnguardarpro.setEnabled(true);
                    bneditarpro.setEnabled(false);
                    bneliminarpro.setEnabled(false);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede editar proveedor", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } catch (HeadlessException | SQLException e) {
            }

        }
    }

    public void guardar() {
        //metodo para agregar
        if (controladorPersona.buscarPersonas(txtcedula.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, " La persona con ese número de cédula ya se encuentra registrada en el sistema. ");
        } else {
            controladorPersona = new Personabd();
            if (controladorPersona.RegistrarPersona(gestion.guardarEditar(false))) {
                JOptionPane.showMessageDialog(rootPane, "Usuario Guardado", "Guardado", JOptionPane.INFORMATION_MESSAGE);
                gestion.limpiar();
                tabla();
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al guardar", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    public void guardarproveedor() {

        controladorProveedor = new Proveedorbd();
        if (controladorProveedor.Registrarproveedor(gestionpro.guardarEditar(false))) {
            JOptionPane.showMessageDialog(rootPane, "Proveedor Guardado", "Guardado", JOptionPane.INFORMATION_MESSAGE);
            tablaproveedor();
            gestionpro.limpiar();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al guardar", "ERROR", JOptionPane.ERROR_MESSAGE);

        }

    }

    public void guardarInventario() {

        controladorInvenario = new Inventariodb();

        if (controladorInvenario.RegistrarInventario(gestioninven.guardarEditar(false))) {
            JOptionPane.showMessageDialog(rootPane, "Inventario Guardado", "Guardado", JOptionPane.INFORMATION_MESSAGE);
            tablaInventario();
            gestioninven.limpiar();

        } else {
            JOptionPane.showMessageDialog(rootPane, "Error al guardar", "ERROR", JOptionPane.ERROR_MESSAGE);
            gestioninven.limpiar();
        }

    }

    public void buscarcedula() {
        Persona persona = controladorPersona.buscarPersonas(txtcedula.getText());

        if (persona != null) {
            personaEditar = persona;
            txtcedula.setText(persona.getCedula());
            txtnombre.setText(persona.getNombre());
            txtapellido.setText(persona.getApellido());
            txtdireccion.setText(persona.getDireccion());
            txttelefono.setText(persona.getTelefono());
            txtcorreo.setText(persona.getCorreo());
            txttelefono.setText(persona.getTelefono());
            cmbgenero.setSelectedItem(persona.getGenero());
            personaEditar = persona;

        } else {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona en la base de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
            txttelefono.setText("");
            txttelefono.requestFocus();
        }
    }

    public void eliminar() {
        if (personaEditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay un registro seleccionada para eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (personaEditar != null) {
            int confirmar = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO DE ELIMINAR A ESTE REGISTRO", "confirmar salida",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirmar == JOptionPane.YES_OPTION) {
                if (personaEditar != null) {
                    if (controladorPersona.eliminar(personaEditar)) {
                        JOptionPane.showMessageDialog(rootPane, "Persona eliminada con éxito del sistema.");
                        gestion.limpiar();
                        personaEditar = null;
                        tabla();
                        bnguardar.setEnabled(true);
                        bneditar.setEnabled(false);
                        bneliminar.setEnabled(false);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "No se puede eliminar persona", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Acción cancelada", "Alerta", JOptionPane.INFORMATION_MESSAGE);
                bnguardar.setEnabled(true);
                bneditar.setEnabled(false);
                bneliminar.setEnabled(false);
                gestion.limpiar();
            }
        }
    }

    public void eliminarProveedor() {
        if (proveedoreditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay una persona seleccionada para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (proveedoreditar != null) {
            proveedoreditar.setIdProveedor(proveedoreditar.getIdProveedor());
            int confirmar = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO DE ELIMINAR A ESTE REGISTRO", "confirmar salida",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirmar == JOptionPane.YES_OPTION) {
                if (controladorProveedor.eliminarProveedor(proveedoreditar)) {
                    JOptionPane.showMessageDialog(rootPane, "Proveedor eliminado con exito del sitema.");
                    gestionpro.limpiar();
                    proveedoreditar = null;
                    tablaproveedor();
                    bnguardarpro.setEnabled(true);
                    bneditarpro.setEnabled(false);
                    bneliminarpro.setEnabled(false);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede eliminar el proveedor", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Accion cancelada", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                gestionpro.limpiar();

            }

        }
    }

    public void eliminarInventario() {
        if (inventarioeditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay un inventario seleccionada para Eliminar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (inventarioeditar != null) {
            inventarioeditar.setId_inventario(inventarioeditar.getId_inventario());
            int confirmar = JOptionPane.showConfirmDialog(null, "¿ESTA SEGURO DE ELIMINAR A ESTE INVENTARIO", "confirmar salida",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (confirmar == JOptionPane.YES_OPTION) {
                if (controladorInvenario.eliminarInvetario(inventarioeditar)) {
                    JOptionPane.showMessageDialog(rootPane, "Proveedor eliminado con exito del sitema.");
                    gestioninven.limpiar();
                    proveedoreditar = null;
                    tablaInventario();
                    bneliminarinve.setEnabled(false);
                    bneditarinve.setEnabled(false);
                    bnguardarinve.setEnabled(true);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede eliminar el proveedor", "ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(rootPane, "Accion cancelada", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                gestioninven.limpiar();

            }

        }
    }

    public void editarInventero() {
        if (inventarioeditar == null) {
            JOptionPane.showMessageDialog(rootPane, "No hay un proveedpr para editar", "ERROR", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Inventario inventarioEditarLocal = gestioninven.guardarEditar(true);
        if (inventarioEditarLocal != null) {
            inventarioEditarLocal.setId_inventario(inventarioeditar.getId_inventario());
            try {
                if (controladorInvenario.editar(inventarioEditarLocal)) {
                    JOptionPane.showMessageDialog(rootPane, "Inventario editado con exito del sitema.");
                    gestioninven.limpiar();
                    inventarioeditar = null;
                    tablaInventario();
                    bneliminarinve.setEnabled(false);
                    bneditarinve.setEnabled(false);
                    bnguardarinve.setEnabled(true);

                } else {
                    JOptionPane.showMessageDialog(rootPane, "No se puede editar Inventario", "ERROR", JOptionPane.ERROR_MESSAGE);

                }

            } catch (HeadlessException | SQLException e) {
            }

        }
    }

    private void jmenusalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenusalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmenusalirActionPerformed

    private void jmenuaccionbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuaccionbuscarActionPerformed
        buscarcedula();
    }//GEN-LAST:event_jmenuaccionbuscarActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenueditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenueditarActionPerformed
        editar();
    }//GEN-LAST:event_jMenueditarActionPerformed

    private void jmenueliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenueliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_jmenueliminarActionPerformed

    private void jmenuguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmenuguardarActionPerformed
        guardar();
    }//GEN-LAST:event_jmenuguardarActionPerformed
    void tabla() {
        List<Persona> persona = controladorPersona.obtenerPersonas();
        modelTablePersona.setPersonas(persona);
        modelTablePersona.fireTableDataChanged();

    }

    void tablaproveedor() {
        List<Proveedor> proveedor = controladorProveedor.obtenerProveedor();
        modelTableProveedor.setProveedor(proveedor);
        modelTableProveedor.fireTableDataChanged();
    }

    void tablaInventario() {
        List<Inventario> inventario = controladorInvenario.obtenerInventario();
        modelTableInventario.setInventario(inventario);
        modelTableInventario.fireTableDataChanged();
    }
    public void buscarInventario() {
        System.out.println("Combo" + cmbbusquedainven.getSelectedIndex());
        switch (cmbbusquedainven.getSelectedIndex()) {
            case 0://Codigo
                modelTableInventario.setInventario(controladorInvenario.busquedadInventarioCodigo(txtbuscarparametroinventario.getText()));
                modelTableInventario.fireTableDataChanged();
                break;
            case 1://7Descripcion
                modelTableInventario.setInventario(controladorInvenario.buscarInventarioDescripcion(txtbuscarparametroinventario.getText()));
                modelTableInventario.fireTableDataChanged();
                break;
        }
    }

    private void Acerca_deMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Acerca_deMouseClicked
        Acerca_de a = new Acerca_de(this,true);
        a.setVisible(true);
    }//GEN-LAST:event_Acerca_deMouseClicked

    private void bnagregarnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnagregarnotaActionPerformed
        agregardatos();
        txtproductonota.setText("");
        txtcantidadnota.setText("");
    }//GEN-LAST:event_bnagregarnotaActionPerformed

    private void txtcantidadnotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadnotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadnotaActionPerformed

    private void txtproductonotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtproductonotaFocusLost
        controladorInvenario.busquedadInventarioCodigo(txtproductonota.getText());
    }//GEN-LAST:event_txtproductonotaFocusLost

    private void txtcedulanotaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcedulanotaFocusLost

        Persona per = controladorPersona.buscarPersonas(txtcedulanota.getText());
        if (controladorPersona.buscarPersonas(txtcedulanota.getText()) == null) {
            JOptionPane.showMessageDialog(rootPane, "No existe un registro con ese número de cédula");
        } else {
            txtnombrenota.setText(per.getNombre() + " " + per.getApellido());
            txtdireccionnota.setText(per.getDireccion());
            txttelefononota.setText(per.getTelefono());
        }
    }//GEN-LAST:event_txtcedulanotaFocusLost

    private void bnbuscarinventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbuscarinventarioActionPerformed
        System.out.println("Combo" + cmbbusquedainven.getSelectedIndex());
        switch (cmbbusquedainven.getSelectedIndex()) {
            case 0://Codigo
            modelTableInventario.setInventario(controladorInvenario.busquedadInventarioCodigo(txtbuscarparametroinventario.getText()));
            modelTableInventario.fireTableDataChanged();
            break;
            case 1://7Descripcion
            modelTableInventario.setInventario(controladorInvenario.buscarInventarioDescripcion(txtbuscarparametroinventario.getText()));
            modelTableInventario.fireTableDataChanged();
            break;
        }
    }//GEN-LAST:event_bnbuscarinventarioActionPerformed

    private void txtbuscarparametroinventarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarparametroinventarioKeyReleased
        buscarInventario();
    }//GEN-LAST:event_txtbuscarparametroinventarioKeyReleased

    private void cmbbusquedainvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbusquedainvenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbbusquedainvenActionPerformed

    private void bnguardarinveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnguardarinveActionPerformed
        guardarInventario();
    }//GEN-LAST:event_bnguardarinveActionPerformed

    private void bneditarinveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneditarinveActionPerformed
        editarInventero();
    }//GEN-LAST:event_bneditarinveActionPerformed

    private void bneliminarinveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarinveActionPerformed
        eliminarInventario();
    }//GEN-LAST:event_bneliminarinveActionPerformed

    private void bnlimpiarinveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnlimpiarinveActionPerformed
        gestioninven.limpiar();
        bneditarinve.setEnabled(false);
        bneliminarinve.setEnabled(false);
        bnguardarinve.setEnabled(true);
    }//GEN-LAST:event_bnlimpiarinveActionPerformed

    private void txtprecioclientenormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioclientenormalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioclientenormalActionPerformed

    private void txtpreciosinivaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpreciosinivaFocusLost
        double a = utilidad.precioIva(Double.parseDouble(txtpreciosiniva.getText()));
        txtprecioconiva.setText(String.valueOf(a));
        double mayorista = utilidad.precioMayorita(Double.parseDouble(txtprecioconiva.getText()));
        txtpreciomayorita.setText(String.valueOf(mayorista));
        double fijo = utilidad.precioClienteFijo(Double.parseDouble(txtprecioconiva.getText()));
        txtprecioclientefijo.setText(String.valueOf(fijo));
        double normal = utilidad.precioClienteNormal(Double.parseDouble(txtprecioconiva.getText()));
        txtprecioclientenormal.setText(String.valueOf(normal));
        // JOptionPane.showMessageDialog(rootPane, Math.round(normal * 100)/100d);
    }//GEN-LAST:event_txtpreciosinivaFocusLost

    private void bnbuscarproveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbuscarproveedoresActionPerformed

    }//GEN-LAST:event_bnbuscarproveedoresActionPerformed

    private void txtbuscarparametroproKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarparametroproKeyReleased
        buscarProveedor();
    }//GEN-LAST:event_txtbuscarparametroproKeyReleased

    private void bnguardarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnguardarproActionPerformed

        guardarproveedor();
    }//GEN-LAST:event_bnguardarproActionPerformed

    private void bneditarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneditarproActionPerformed
        editarProveedor();
    }//GEN-LAST:event_bneditarproActionPerformed

    private void bneliminarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarproActionPerformed
        eliminarProveedor();
    }//GEN-LAST:event_bneliminarproActionPerformed

    private void bnregistroproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnregistroproActionPerformed
        //        List<Proveedor> obtenerProveedor = controladorProveedor.obtenerProveedor();
        //        proveedoreditar = obtenerProveedor.get(obtenerProveedor.size() - 1);
        //        txtrucpro.setText(proveedoreditar.getRuc());
        //        txtrazonpro.setText(proveedoreditar.getRazonSocial());
        //        txtactividadpro.setText(proveedoreditar.getTipoActividad());
        //        txtnombrepro.setText(proveedoreditar.getNombreRepresentante());
        //        txtapellidopro.setText(proveedoreditar.getApellidoRepresentante());
        //        txttelefonopro.setText(proveedoreditar.getTelefono());
        //        txtcorreopro.setText(proveedoreditar.getCorreo());
        //        txtdireccionpro.setText(proveedoreditar.getDireccionpro());
        //        jdatefechanacimiento.setDate(proveedoreditar.getFecha_vencimiento());
    }//GEN-LAST:event_bnregistroproActionPerformed

    private void bnlimpiarproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnlimpiarproActionPerformed
        gestionpro.limpiar();
        bnguardarpro.setEnabled(true);
        bneditarpro.setEnabled(false);
        bneliminarpro.setEnabled(false);
    }//GEN-LAST:event_bnlimpiarproActionPerformed

    private void bnbuscarpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnbuscarpersonaActionPerformed
        System.out.println("Combo" + cmbbusqueda.getSelectedIndex());
        switch (cmbbusqueda.getSelectedIndex()) {
            case 0://Cedula
            modelTablePersona.setPersonas((List<Persona>) controladorPersona.buscarPersonas(txtbuscarparametro.getText()));
            modelTablePersona.fireTableDataChanged();
            break;
            case 1://Nombres
            modelTablePersona.setPersonas(controladorPersona.buscarPersonasNombre(txtbuscarparametro.getText()));
            modelTablePersona.fireTableDataChanged();
            break;
        }
    }//GEN-LAST:event_bnbuscarpersonaActionPerformed

    private void txtbuscarparametroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarparametroKeyReleased
        buscarCliente();
    }//GEN-LAST:event_txtbuscarparametroKeyReleased

    private void bneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneditarActionPerformed
        editar();
    }//GEN-LAST:event_bneditarActionPerformed

    private void bnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnregistroActionPerformed
        List<Persona> obtenerPersonas = controladorPersona.obtenerPersonas();
        personaEditar = obtenerPersonas.get(obtenerPersonas.size() - 1);
        txtcedula.setText(personaEditar.getCedula());
        txtnombre.setText(personaEditar.getNombre());
        txtapellido.setText(personaEditar.getApellido());
        txtdireccion.setText(personaEditar.getDireccion());
        txttelefono.setText(personaEditar.getTelefono());
        txtcorreo.setText(personaEditar.getCorreo());
    }//GEN-LAST:event_bnregistroActionPerformed

    private void bnregistroMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnregistroMouseReleased
        bnregistro.setBackground(Color.WHITE);
    }//GEN-LAST:event_bnregistroMouseReleased

    private void bnregistroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnregistroMousePressed
        bnregistro.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_bnregistroMousePressed

    private void bneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bneliminarActionPerformed
        eliminar();
    }//GEN-LAST:event_bneliminarActionPerformed

    private void cmbgeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbgeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbgeneroActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtcedulaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcedulaMouseExited
        txtcedula.setBackground(Color.WHITE);
    }//GEN-LAST:event_txtcedulaMouseExited

    private void txtcedulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcedulaMouseEntered
        txtcedula.setBackground(new Color(153, 204, 255));
    }//GEN-LAST:event_txtcedulaMouseEntered

    private void txtcedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcedulaFocusLost

        if (rbbottomcedula.isSelected()) {
            if (txtcedula.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "LLene los campos de cedula", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtcedula.requestFocus();
                return;
            } else if (!utilidad.validadorDeCedula(txtcedula.getText())) {
                JOptionPane.showMessageDialog(this, "Error de cedula", "ERROR", JOptionPane.ERROR_MESSAGE);
                txtcedula.requestFocus();
                return;

            }
        } else if (rbbottompasaporte.isSelected()) {

        }
    }//GEN-LAST:event_txtcedulaFocusLost

    private void bnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnguardarActionPerformed
        guardar();
    }//GEN-LAST:event_bnguardarActionPerformed

    private void bnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnlimpiarActionPerformed
        gestion.limpiar();
        bnguardar.setEnabled(true);
        bneliminar.setEnabled(false);
        bneditar.setEnabled(false);
    }//GEN-LAST:event_bnlimpiarActionPerformed

    private void bnlimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bnlimpiarMouseClicked
        //JOptionPane.showMessageDialog(rootPane, "Has limpiado los campos correctamente");
    }//GEN-LAST:event_bnlimpiarMouseClicked
    void cajastexto(){
        txtprecioconiva.setEditable(false);
        txtpreciomayorita.setEditable(false);
        txtprecioclientefijo.setEditable(false);
        txtprecioclientenormal.setEditable(false);
    }
    private void buscarCliente() {
        System.out.println("Combo" + cmbbusqueda.getSelectedIndex());
        switch (cmbbusqueda.getSelectedIndex()) {
            case 0://Cedula
                modelTablePersona.setPersonas(controladorPersona.buscarPersonasCedula(txtbuscarparametro.getText()));
                modelTablePersona.fireTableDataChanged();
                break;
            case 1://Nombres
                modelTablePersona.setPersonas(controladorPersona.buscarPersonasNombre(txtbuscarparametro.getText()));
                modelTablePersona.fireTableDataChanged();
                break;
        }

    }

    private void buscarProveedor() {
        System.out.println("Combo" + cmbbusquedapro.getSelectedIndex());
        switch (cmbbusquedapro.getSelectedIndex()) {
            case 0://Cedula
                modelTableProveedor.setProveedor(controladorProveedor.buscarProveedorRuc(txtbuscarparametro.getText()));
                modelTableProveedor.fireTableDataChanged();
                break;
            case 1://Nombres
                modelTableProveedor.setProveedor(controladorProveedor.buscarProveedorNombre(txtbuscarparametro.getText()));
                modelTableProveedor.fireTableDataChanged();
                break;
        }

    }

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
            java.util.logging.Logger.getLogger(GestionContable.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionContable.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionContable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acerca_de;
    private javax.swing.JButton bnagregarnota;
    private javax.swing.JButton bnagregarnota1;
    private javax.swing.JButton bnbuscarinventario;
    private javax.swing.JButton bnbuscarpersona;
    private javax.swing.JButton bnbuscarproveedores;
    private javax.swing.JButton bneditar;
    private javax.swing.JButton bneditarinve;
    private javax.swing.JButton bneditarpro;
    private javax.swing.JButton bneliminar;
    private javax.swing.JButton bneliminarinve;
    private javax.swing.JButton bneliminarpro;
    private javax.swing.JButton bnguardar;
    private javax.swing.JButton bnguardarinve;
    private javax.swing.JButton bnguardarpro;
    private javax.swing.JButton bnlimpiar;
    private javax.swing.JButton bnlimpiarinve;
    private javax.swing.JButton bnlimpiarpro;
    private javax.swing.JButton bnregistro;
    private javax.swing.JButton bnregistropro;
    private javax.swing.ButtonGroup botongrupo;
    private javax.swing.JComboBox<String> cmbbusqueda;
    private javax.swing.JComboBox<String> cmbbusquedainven;
    private javax.swing.JComboBox<String> cmbbusquedapro;
    private javax.swing.JComboBox<String> cmbgenero;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenueditar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser jdatefechanacimiento;
    private com.toedter.calendar.JDateChooser jdatefechavencimientopro;
    private com.toedter.calendar.JDateChooser jdfechacaducidadonve;
    private javax.swing.JLabel jlapellido;
    private javax.swing.JLabel jlapellido2;
    private javax.swing.JLabel jlapellido3;
    private javax.swing.JLabel jlapellido4;
    private javax.swing.JLabel jlapellido5;
    private javax.swing.JLabel jlapellido6;
    private javax.swing.JLabel jlapellido7;
    private javax.swing.JLabel jlcedula;
    private javax.swing.JLabel jlcedula2;
    private javax.swing.JLabel jlcedula3;
    private javax.swing.JLabel jlcorreo;
    private javax.swing.JLabel jlcorreo1;
    private javax.swing.JLabel jlcorreo2;
    private javax.swing.JLabel jlcorreo3;
    private javax.swing.JLabel jlcorreo4;
    private javax.swing.JLabel jlcorreo5;
    private javax.swing.JLabel jlcorreo6;
    private javax.swing.JLabel jlcorreo7;
    private javax.swing.JLabel jlcorreo8;
    private javax.swing.JLabel jlcorreo9;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JLabel jlnombre2;
    private javax.swing.JLabel jlnombre3;
    private javax.swing.JMenuItem jmenuaccionbuscar;
    private javax.swing.JMenuItem jmenueliminar;
    private javax.swing.JMenuItem jmenuguardar;
    private javax.swing.JMenuItem jmenusalir;
    private javax.swing.JTable jtproveedor;
    private javax.swing.JTable jtproveedor1;
    private javax.swing.JLabel ljcorreo;
    private javax.swing.JLabel ljcorreo2;
    private javax.swing.JLabel ljcorreo3;
    private javax.swing.JLabel ljdireccion;
    private javax.swing.JLabel ljdireccion2;
    private javax.swing.JLabel ljdireccion3;
    private javax.swing.JMenu menuarchivo;
    private javax.swing.JMenu menueditar;
    private javax.swing.JPanel panelclientes;
    private javax.swing.JPanel panelinventario;
    private javax.swing.JPanel panelproveedores;
    private javax.swing.JPanel panelventas;
    private javax.swing.JPanel panelventas1;
    private javax.swing.JRadioButton rbbottomcedula;
    private javax.swing.JRadioButton rbbottompasaporte;
    private javax.swing.JTable tablanotadeventa;
    private javax.swing.JTextField txtactividadpro;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtapellidopro;
    private javax.swing.JTextField txtbuscarparametro;
    private javax.swing.JTextField txtbuscarparametroinventario;
    private javax.swing.JTextField txtbuscarparametropro;
    private javax.swing.JTextField txtcantidadin;
    private javax.swing.JTextField txtcantidadnota;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtcedulanota;
    private javax.swing.JTextField txtcodigoin;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtcorreopro;
    private javax.swing.JTextField txtdescripcionin;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdireccionnota;
    private javax.swing.JTextField txtdireccionpro;
    private javax.swing.JTextField txtfechanota;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnombrenota;
    private javax.swing.JTextField txtnombrepro;
    private javax.swing.JTextField txtnumerodenotaventa;
    private javax.swing.JTextField txtprecioclientefijo;
    private javax.swing.JTextField txtprecioclientenormal;
    private javax.swing.JTextField txtprecioconiva;
    private javax.swing.JTextField txtpreciomayorita;
    private javax.swing.JTextField txtpreciosiniva;
    private javax.swing.JTextField txtproductonota;
    private javax.swing.JTextField txtrazonpro;
    private javax.swing.JTextField txtrucpro;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txttelefononota;
    private javax.swing.JTextField txttelefonopro;
    // End of variables declaration//GEN-END:variables

    public void clickPersona(Persona p) {

        // System.out.println("Persona" + p.toString());
        txtcedula.setText(p.getCedula());
        txtnombre.setText(p.getNombre());
        txtapellido.setText(p.getApellido());
        txtdireccion.setText(p.getDireccion());
        txttelefono.setText(p.getTelefono());
        txtcorreo.setText(p.getCorreo());
        cmbgenero.setSelectedItem(p.getGenero());
        jdatefechanacimiento.setDate(p.getFecha_nacimiento());
        personaEditar = p;
        bnguardar.setEnabled(false);
        bneliminar.setEnabled(true);
        bneditar.setEnabled(true);
        

    }

    @Override
    public void clickProveedor(Proveedor pro) {
        txtrucpro.setText(pro.getRuc());
        txtrazonpro.setText(pro.getRazonSocial());
        txtactividadpro.setText(pro.getTipoActividad());
        txtnombrepro.setText(pro.getNombreRepresentante());
        txtapellidopro.setText(pro.getApellidoRepresentante());
        txttelefonopro.setText(pro.getTelefono());
        txtcorreopro.setText(pro.getCorreo());
        txtdireccionpro.setText(pro.getDireccionpro());
        jdatefechavencimientopro.setDate(pro.getFecha_vencimiento());
        proveedoreditar = pro;
        bnguardarpro.setEnabled(false);
        bneliminarpro.setEnabled(true);
        bneditarpro.setEnabled(true);
        
    }

    @Override
    public void clickInventario(Inventario in) {
        txtcodigoin.setText(in.getCodigo_pro());
        txtcantidadin.setText(Integer.toString(in.getCan_productos()));
        txtdescripcionin.setText(in.getDescripcion());
        txtpreciosiniva.setText(in.getPrecios_compra_sin_iva());
        txtprecioconiva.setText(in.getPrecios_compra_con_iva());
        txtpreciomayorita.setText(in.getPrecio_mayorita());
        txtprecioclientefijo.setText(in.getCliente_fijo());
        txtprecioclientenormal.setText(in.getCliente_normal());
        jdfechacaducidadonve.setDate(in.getFecha_caducidad());
        inventarioeditar = in;
        bneditarinve.setEnabled(true);
        bneliminarinve.setEnabled(true);
        bnguardarinve.setEnabled(false);

    }
}
