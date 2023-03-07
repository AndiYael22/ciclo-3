public class VHotel extends javax.swing.JFrame {

    private static VHotel                       marcoVHotel;
    public  static javax.swing.JLabel[]         arrayEtiquetas = new javax.swing.JLabel[80];
    private static Hotel                        claseHotel;
    private static javax.swing.DefaultListModel modeloListaCategorias;
    private static javax.swing.DefaultListModel modeloListaClientes;
    private static javax.swing.DefaultListModel modeloListaHabitaciones;
    private static Acerca                       acercaDe;
    private static int                          banderaNuevaCategoria;
    private static int                          banderaNuevoCliente;
    private        java.text.DateFormat         dateFormatter;

    public VHotel() {
        initComponents();
        //Modelo de lista para la JList de las categorías.
        modeloListaCategorias = new javax.swing.DefaultListModel();
        //Modelo de lista para la JList de los clientes.
        modeloListaClientes = new javax.swing.DefaultListModel();
        //Modelo de lista para la JList de las habitaciones.
        modeloListaHabitaciones = new javax.swing.DefaultListModel();
        //Se crea el diálogo modal.
        acercaDe = new Acerca(marcoVHotel, true);
        //Se crea la clase manejadora del Hotel.
        claseHotel = new Hotel();
        //Se inicializa la bandera de las categorías.
        banderaNuevaCategoria = 0;
        //Se asignan los modelos de las listas.
        asignarModelos();
        //Se crea la lista de categorías por defecto.
        crearListaCategoriasPorDefecto();
        //Se crea un formateador para las fechas.
        dateFormatter = java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT,
                                                             java.util.Locale.getDefault());
        //Se crea el array de etiquetas.
        crearArrayEtiquetas();
        //Se inicializan las habitaciones a vacías.
        actualizarHabitaciones();
        //Se deshabilita la creación y eliminación de categorías.
        jbNuevaCategoria.setVisible(false);
        jbEliminarCategoria.setVisible(false);
    }//Constructor
    
    private void initComponents() {//GEN-BEGIN:initComponents
        jtpContenedor = new javax.swing.JTabbedPane();
        jpBaseDatos = new javax.swing.JPanel();
        jpBorde = new javax.swing.JPanel();
        jbCargar = new javax.swing.JButton();
        jbSalvar = new javax.swing.JButton();
        jpHabitaciones = new javax.swing.JPanel();
        jpPlanta4 = new javax.swing.JPanel();
        jpPlanta3 = new javax.swing.JPanel();
        jpPlanta2 = new javax.swing.JPanel();
        jpPlanta1 = new javax.swing.JPanel();
        jlPlanta1 = new javax.swing.JLabel();
        jlPlanta2 = new javax.swing.JLabel();
        jlPlanta3 = new javax.swing.JLabel();
        jlPlanta4 = new javax.swing.JLabel();
        jl411 = new javax.swing.JLabel();
        jl401 = new javax.swing.JLabel();
        jl402 = new javax.swing.JLabel();
        jl412 = new javax.swing.JLabel();
        jl413 = new javax.swing.JLabel();
        jl403 = new javax.swing.JLabel();
        jl404 = new javax.swing.JLabel();
        jl414 = new javax.swing.JLabel();
        jl415 = new javax.swing.JLabel();
        jl405 = new javax.swing.JLabel();
        jl406 = new javax.swing.JLabel();
        jl416 = new javax.swing.JLabel();
        jl417 = new javax.swing.JLabel();
        jl407 = new javax.swing.JLabel();
        jl408 = new javax.swing.JLabel();
        jl418 = new javax.swing.JLabel();
        jl419 = new javax.swing.JLabel();
        jl409 = new javax.swing.JLabel();
        jl410 = new javax.swing.JLabel();
        jl420 = new javax.swing.JLabel();
        jl311 = new javax.swing.JLabel();
        jl301 = new javax.swing.JLabel();
        jl302 = new javax.swing.JLabel();
        jl312 = new javax.swing.JLabel();
        jl313 = new javax.swing.JLabel();
        jl303 = new javax.swing.JLabel();
        jl304 = new javax.swing.JLabel();
        jl314 = new javax.swing.JLabel();
        jl315 = new javax.swing.JLabel();
        jl305 = new javax.swing.JLabel();
        jl306 = new javax.swing.JLabel();
        jl316 = new javax.swing.JLabel();
        jl317 = new javax.swing.JLabel();
        jl307 = new javax.swing.JLabel();
        jl308 = new javax.swing.JLabel();
        jl318 = new javax.swing.JLabel();
        jl319 = new javax.swing.JLabel();
        jl309 = new javax.swing.JLabel();
        jl310 = new javax.swing.JLabel();
        jl320 = new javax.swing.JLabel();
        jl201 = new javax.swing.JLabel();
        jl211 = new javax.swing.JLabel();
        jl212 = new javax.swing.JLabel();
        jl202 = new javax.swing.JLabel();
        jl203 = new javax.swing.JLabel();
        jl213 = new javax.swing.JLabel();
        jl214 = new javax.swing.JLabel();
        jl204 = new javax.swing.JLabel();
        jl205 = new javax.swing.JLabel();
        jl215 = new javax.swing.JLabel();
        jl216 = new javax.swing.JLabel();
        jl206 = new javax.swing.JLabel();
        jl207 = new javax.swing.JLabel();
        jl217 = new javax.swing.JLabel();
        jl218 = new javax.swing.JLabel();
        jl208 = new javax.swing.JLabel();
        jl209 = new javax.swing.JLabel();
        jl219 = new javax.swing.JLabel();
        jl220 = new javax.swing.JLabel();
        jl210 = new javax.swing.JLabel();
        jl111 = new javax.swing.JLabel();
        jl101 = new javax.swing.JLabel();
        jl102 = new javax.swing.JLabel();
        jl112 = new javax.swing.JLabel();
        jl113 = new javax.swing.JLabel();
        jl103 = new javax.swing.JLabel();
        jl104 = new javax.swing.JLabel();
        jl114 = new javax.swing.JLabel();
        jl115 = new javax.swing.JLabel();
        jl105 = new javax.swing.JLabel();
        jl106 = new javax.swing.JLabel();
        jl116 = new javax.swing.JLabel();
        jl117 = new javax.swing.JLabel();
        jl107 = new javax.swing.JLabel();
        jl108 = new javax.swing.JLabel();
        jl118 = new javax.swing.JLabel();
        jl119 = new javax.swing.JLabel();
        jl109 = new javax.swing.JLabel();
        jl110 = new javax.swing.JLabel();
        jl120 = new javax.swing.JLabel();
        jpGHabitaciones = new javax.swing.JPanel();
        jlListaHabitaciones = new javax.swing.JLabel();
        jlDatosHabitacion = new javax.swing.JLabel();
        jpDatosHabitacion = new javax.swing.JPanel();
        jtfCategoriaHabitacion = new javax.swing.JTextField();
        jlCategoriaHabitacion = new javax.swing.JLabel();
        jlPrecioHabitacion = new javax.swing.JLabel();
        jtfPrecioHabitacion = new javax.swing.JTextField();
        jpDatosClienteHabitacion = new javax.swing.JPanel();
        jlApellidosClienteHabitacion = new javax.swing.JLabel();
        jlDireccionClienteHabitacion = new javax.swing.JLabel();
        jtfDireccionClienteHabitacion = new javax.swing.JTextField();
        jtfApellidosClienteHabitacion = new javax.swing.JTextField();
        jlDNIClienteHabitacion = new javax.swing.JLabel();
        jlNombreClienteHabitacion = new javax.swing.JLabel();
        jtfNombreClienteHabitacion = new javax.swing.JTextField();
        jtfDNIClienteHabitacion = new javax.swing.JTextField();
        jlFechaEntradaHabitacion = new javax.swing.JLabel();
        jlFechaSalidaHabitacion = new javax.swing.JLabel();
        jtfFechaSalidaHabitacion = new javax.swing.JTextField();
        jtfFechaEntradaHabitacion = new javax.swing.JTextField();
        jspListaHabitaciones = new javax.swing.JScrollPane();
        jlstListaHabitaciones = new javax.swing.JList();
        jpClientes = new javax.swing.JPanel();
        jlListaClientes = new javax.swing.JLabel();
        jpDatosCliente = new javax.swing.JPanel();
        jlDNICliente = new javax.swing.JLabel();
        jtfDNICliente = new javax.swing.JTextField();
        jlNombreCliente = new javax.swing.JLabel();
        jtfNombreCliente = new javax.swing.JTextField();
        jlApellidosCliente = new javax.swing.JLabel();
        jtfApellido1Cliente = new javax.swing.JTextField();
        jtfApellido2Cliente = new javax.swing.JTextField();
        jlDireccionCliente = new javax.swing.JLabel();
        jtfDireccionCliente = new javax.swing.JTextField();
        jlNHabitacion = new javax.swing.JLabel();
        jlFechaEntrada = new javax.swing.JLabel();
        jtfFechaEntrada = new javax.swing.JTextField();
        jlFechaSalida = new javax.swing.JLabel();
        jtfFechaSalida = new javax.swing.JTextField();
        jtfNHabitacionCliente = new javax.swing.JTextField();
        jcbNHabitacionCliente = new javax.swing.JComboBox();
        jbAceptarCliente = new javax.swing.JButton();
        jbCancelarCliente = new javax.swing.JButton();
        jlFormatoEntrada = new javax.swing.JLabel();
        jlFormatoSalida = new javax.swing.JLabel();
        jbNuevoCliente = new javax.swing.JButton();
        jbModificarCliente = new javax.swing.JButton();
        jbEliminarCliente = new javax.swing.JButton();
        jspListaClientes = new javax.swing.JScrollPane();
        jlstListaClientes = new javax.swing.JList();
        jpCategoriasPrecios = new javax.swing.JPanel();
        jpDatosCategoria = new javax.swing.JPanel();
        jlPrecioCategoria = new javax.swing.JLabel();
        jtfPrecioCategoria = new javax.swing.JTextField();
        jlDescripcionCategoria = new javax.swing.JLabel();
        jtfDescripcionCategoria = new javax.swing.JTextField();
        jbAceptarCategoria = new javax.swing.JButton();
        jbCancelarCategoria = new javax.swing.JButton();
        jlNombreCategoria = new javax.swing.JLabel();
        jtfNombreCategoria = new javax.swing.JTextField();
        jlListaCategorias = new javax.swing.JLabel();
        jbModificarCategoria = new javax.swing.JButton();
        jbNuevaCategoria = new javax.swing.JButton();
        jbEliminarCategoria = new javax.swing.JButton();
        jspListacategorias = new javax.swing.JScrollPane();
        jlstListaCategorias = new javax.swing.JList();
        jmbMenu = new javax.swing.JMenuBar();
        jmArchivo = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jmAyuda = new javax.swing.JMenu();
        jmiAcerca = new javax.swing.JMenuItem();

        getContentPane().setLayout(null);

        setTitle("VHotel");
        setFont(new java.awt.Font("Verdana", 0, 10));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jtpContenedor.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        jtpContenedor.setFont(new java.awt.Font("Verdana", 1, 10));
        jpBaseDatos.setLayout(null);

        jpBaseDatos.setFont(new java.awt.Font("Verdana", 0, 10));
        jpBorde.setLayout(null);

        jpBorde.setBorder(new javax.swing.border.EtchedBorder());
        jbCargar.setFont(new java.awt.Font("Verdana", 1, 10));
        jbCargar.setText("Cargar BD");
        jbCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCargarActionPerformed(evt);
            }
        });

        jpBorde.add(jbCargar);
        jbCargar.setBounds(20, 20, 140, 24);

        jbSalvar.setFont(new java.awt.Font("Verdana", 1, 10));
        jbSalvar.setText("Salvar BD");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jpBorde.add(jbSalvar);
        jbSalvar.setBounds(20, 60, 140, 24);

        jpBaseDatos.add(jpBorde);
        jpBorde.setBounds(220, 140, 180, 105);

        jtpContenedor.addTab("  Base de Datos  ", jpBaseDatos);

        jpHabitaciones.setLayout(null);

        jpHabitaciones.setFont(new java.awt.Font("Verdana", 0, 10));
        jpPlanta4.setBackground((java.awt.Color) javax.swing.UIManager.getDefaults().get("CheckBoxMenuItem.acceleratorForeground"));
        jpHabitaciones.add(jpPlanta4);
        jpPlanta4.setBounds(10, 90, 590, 5);

        jpPlanta3.setBackground((java.awt.Color) javax.swing.UIManager.getDefaults().get("CheckBoxMenuItem.acceleratorForeground"));
        jpHabitaciones.add(jpPlanta3);
        jpPlanta3.setBounds(10, 185, 590, 5);

        jpPlanta2.setBackground((java.awt.Color) javax.swing.UIManager.getDefaults().get("CheckBoxMenuItem.acceleratorForeground"));
        jpHabitaciones.add(jpPlanta2);
        jpPlanta2.setBounds(10, 280, 590, 5);

        jpPlanta1.setBackground((java.awt.Color) javax.swing.UIManager.getDefaults().get("CheckBoxMenuItem.acceleratorForeground"));
        jpHabitaciones.add(jpPlanta1);
        jpPlanta1.setBounds(10, 375, 590, 5);

        jlPlanta1.setFont(new java.awt.Font("Verdana", 1, 10));
        jlPlanta1.setText("PLANTA 1");
        jpHabitaciones.add(jlPlanta1);
        jlPlanta1.setBounds(10, 355, 60, 14);

        jlPlanta2.setFont(new java.awt.Font("Verdana", 1, 10));
        jlPlanta2.setText("PLANTA 2");
        jpHabitaciones.add(jlPlanta2);
        jlPlanta2.setBounds(10, 260, 56, 14);

        jlPlanta3.setFont(new java.awt.Font("Verdana", 1, 10));
        jlPlanta3.setText("PLANTA 3");
        jpHabitaciones.add(jlPlanta3);
        jlPlanta3.setBounds(10, 165, 56, 14);

        jlPlanta4.setFont(new java.awt.Font("Verdana", 1, 10));
        jlPlanta4.setText("PLANTA 4");
        jpHabitaciones.add(jlPlanta4);
        jlPlanta4.setBounds(10, 70, 56, 14);

        jl411.setFont(new java.awt.Font("Verdana", 1, 10));
        jl411.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl411.setText("411");
        jl411.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl411);
        jl411.setBounds(100, 10, 35, 35);

        jl401.setFont(new java.awt.Font("Verdana", 1, 10));
        jl401.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl401.setText("401");
        jl401.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl401);
        jl401.setBounds(100, 50, 35, 35);

        jl402.setFont(new java.awt.Font("Verdana", 1, 10));
        jl402.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl402.setText("402");
        jl402.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl402);
        jl402.setBounds(150, 50, 35, 35);

        jl412.setFont(new java.awt.Font("Verdana", 1, 10));
        jl412.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl412.setText("412");
        jl412.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl412);
        jl412.setBounds(150, 10, 35, 35);

        jl413.setFont(new java.awt.Font("Verdana", 1, 10));
        jl413.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl413.setText("413");
        jl413.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl413);
        jl413.setBounds(200, 10, 35, 35);

        jl403.setFont(new java.awt.Font("Verdana", 1, 10));
        jl403.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl403.setText("403");
        jl403.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl403);
        jl403.setBounds(200, 50, 35, 35);

        jl404.setFont(new java.awt.Font("Verdana", 1, 10));
        jl404.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl404.setText("404");
        jl404.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl404);
        jl404.setBounds(250, 50, 35, 35);

        jl414.setFont(new java.awt.Font("Verdana", 1, 10));
        jl414.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl414.setText("414");
        jl414.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl414);
        jl414.setBounds(250, 10, 35, 35);

        jl415.setFont(new java.awt.Font("Verdana", 1, 10));
        jl415.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl415.setText("415");
        jl415.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl415);
        jl415.setBounds(300, 10, 35, 35);

        jl405.setFont(new java.awt.Font("Verdana", 1, 10));
        jl405.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl405.setText("405");
        jl405.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl405);
        jl405.setBounds(300, 50, 35, 35);

        jl406.setFont(new java.awt.Font("Verdana", 1, 10));
        jl406.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl406.setText("406");
        jl406.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl406);
        jl406.setBounds(350, 50, 35, 35);

        jl416.setFont(new java.awt.Font("Verdana", 1, 10));
        jl416.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl416.setText("416");
        jl416.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl416);
        jl416.setBounds(350, 10, 35, 35);

        jl417.setFont(new java.awt.Font("Verdana", 1, 10));
        jl417.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl417.setText("417");
        jl417.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl417);
        jl417.setBounds(400, 10, 35, 35);

        jl407.setFont(new java.awt.Font("Verdana", 1, 10));
        jl407.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl407.setText("407");
        jl407.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl407);
        jl407.setBounds(400, 50, 35, 35);

        jl408.setFont(new java.awt.Font("Verdana", 1, 10));
        jl408.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl408.setText("408");
        jl408.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl408);
        jl408.setBounds(450, 50, 35, 35);

        jl418.setFont(new java.awt.Font("Verdana", 1, 10));
        jl418.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl418.setText("418");
        jl418.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl418);
        jl418.setBounds(450, 10, 35, 35);

        jl419.setFont(new java.awt.Font("Verdana", 1, 10));
        jl419.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl419.setText("419");
        jl419.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl419);
        jl419.setBounds(500, 10, 35, 35);

        jl409.setFont(new java.awt.Font("Verdana", 1, 10));
        jl409.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl409.setText("409");
        jl409.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl409);
        jl409.setBounds(500, 50, 35, 35);

        jl410.setFont(new java.awt.Font("Verdana", 1, 10));
        jl410.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl410.setText("410");
        jl410.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl410);
        jl410.setBounds(550, 50, 35, 35);

        jl420.setFont(new java.awt.Font("Verdana", 1, 10));
        jl420.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl420.setText("420");
        jl420.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl420);
        jl420.setBounds(550, 10, 35, 35);

        jl311.setFont(new java.awt.Font("Verdana", 1, 10));
        jl311.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl311.setText("311");
        jl311.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl311);
        jl311.setBounds(100, 105, 35, 35);

        jl301.setFont(new java.awt.Font("Verdana", 1, 10));
        jl301.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl301.setText("301");
        jl301.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl301);
        jl301.setBounds(100, 145, 35, 35);

        jl302.setFont(new java.awt.Font("Verdana", 1, 10));
        jl302.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl302.setText("302");
        jl302.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl302);
        jl302.setBounds(150, 145, 35, 35);

        jl312.setFont(new java.awt.Font("Verdana", 1, 10));
        jl312.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl312.setText("312");
        jl312.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl312);
        jl312.setBounds(150, 105, 35, 35);

        jl313.setFont(new java.awt.Font("Verdana", 1, 10));
        jl313.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl313.setText("313");
        jl313.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl313);
        jl313.setBounds(200, 105, 35, 35);

        jl303.setFont(new java.awt.Font("Verdana", 1, 10));
        jl303.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl303.setText("303");
        jl303.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl303);
        jl303.setBounds(200, 145, 35, 35);

        jl304.setFont(new java.awt.Font("Verdana", 1, 10));
        jl304.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl304.setText("304");
        jl304.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl304);
        jl304.setBounds(250, 145, 35, 35);

        jl314.setFont(new java.awt.Font("Verdana", 1, 10));
        jl314.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl314.setText("314");
        jl314.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl314);
        jl314.setBounds(250, 105, 35, 35);

        jl315.setFont(new java.awt.Font("Verdana", 1, 10));
        jl315.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl315.setText("315");
        jl315.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl315);
        jl315.setBounds(300, 105, 35, 35);

        jl305.setFont(new java.awt.Font("Verdana", 1, 10));
        jl305.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl305.setText("305");
        jl305.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl305);
        jl305.setBounds(300, 145, 35, 35);

        jl306.setFont(new java.awt.Font("Verdana", 1, 10));
        jl306.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl306.setText("306");
        jl306.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl306);
        jl306.setBounds(350, 145, 35, 35);

        jl316.setFont(new java.awt.Font("Verdana", 1, 10));
        jl316.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl316.setText("316");
        jl316.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl316);
        jl316.setBounds(350, 105, 35, 35);

        jl317.setFont(new java.awt.Font("Verdana", 1, 10));
        jl317.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl317.setText("317");
        jl317.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl317);
        jl317.setBounds(400, 105, 35, 35);

        jl307.setFont(new java.awt.Font("Verdana", 1, 10));
        jl307.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl307.setText("307");
        jl307.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl307);
        jl307.setBounds(400, 145, 35, 35);

        jl308.setFont(new java.awt.Font("Verdana", 1, 10));
        jl308.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl308.setText("308");
        jl308.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl308);
        jl308.setBounds(450, 145, 35, 35);

        jl318.setFont(new java.awt.Font("Verdana", 1, 10));
        jl318.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl318.setText("318");
        jl318.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl318);
        jl318.setBounds(450, 105, 35, 35);

        jl319.setFont(new java.awt.Font("Verdana", 1, 10));
        jl319.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl319.setText("319");
        jl319.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl319);
        jl319.setBounds(500, 105, 35, 35);

        jl309.setFont(new java.awt.Font("Verdana", 1, 10));
        jl309.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl309.setText("309");
        jl309.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl309);
        jl309.setBounds(500, 145, 35, 35);

        jl310.setFont(new java.awt.Font("Verdana", 1, 10));
        jl310.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl310.setText("310");
        jl310.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl310);
        jl310.setBounds(550, 145, 35, 35);

        jl320.setFont(new java.awt.Font("Verdana", 1, 10));
        jl320.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl320.setText("320");
        jl320.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl320);
        jl320.setBounds(550, 105, 35, 35);

        jl201.setFont(new java.awt.Font("Verdana", 1, 10));
        jl201.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl201.setText("201");
        jl201.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl201);
        jl201.setBounds(100, 240, 35, 35);

        jl211.setFont(new java.awt.Font("Verdana", 1, 10));
        jl211.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl211.setText("211");
        jl211.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl211);
        jl211.setBounds(100, 200, 35, 35);

        jl212.setFont(new java.awt.Font("Verdana", 1, 10));
        jl212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl212.setText("212");
        jl212.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl212);
        jl212.setBounds(150, 200, 35, 35);

        jl202.setFont(new java.awt.Font("Verdana", 1, 10));
        jl202.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl202.setText("202");
        jl202.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl202);
        jl202.setBounds(150, 240, 35, 35);

        jl203.setFont(new java.awt.Font("Verdana", 1, 10));
        jl203.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl203.setText("203");
        jl203.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl203);
        jl203.setBounds(200, 240, 35, 35);

        jl213.setFont(new java.awt.Font("Verdana", 1, 10));
        jl213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl213.setText("213");
        jl213.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl213);
        jl213.setBounds(200, 200, 35, 35);

        jl214.setFont(new java.awt.Font("Verdana", 1, 10));
        jl214.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl214.setText("214");
        jl214.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl214);
        jl214.setBounds(250, 200, 35, 35);

        jl204.setFont(new java.awt.Font("Verdana", 1, 10));
        jl204.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl204.setText("204");
        jl204.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl204);
        jl204.setBounds(250, 240, 35, 35);

        jl205.setFont(new java.awt.Font("Verdana", 1, 10));
        jl205.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl205.setText("205");
        jl205.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl205);
        jl205.setBounds(300, 240, 35, 35);

        jl215.setFont(new java.awt.Font("Verdana", 1, 10));
        jl215.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl215.setText("215");
        jl215.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl215);
        jl215.setBounds(300, 200, 35, 35);

        jl216.setFont(new java.awt.Font("Verdana", 1, 10));
        jl216.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl216.setText("216");
        jl216.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl216);
        jl216.setBounds(350, 200, 35, 35);

        jl206.setFont(new java.awt.Font("Verdana", 1, 10));
        jl206.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl206.setText("206");
        jl206.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl206);
        jl206.setBounds(350, 240, 35, 35);

        jl207.setFont(new java.awt.Font("Verdana", 1, 10));
        jl207.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl207.setText("207");
        jl207.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl207);
        jl207.setBounds(400, 240, 35, 35);

        jl217.setFont(new java.awt.Font("Verdana", 1, 10));
        jl217.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl217.setText("217");
        jl217.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl217);
        jl217.setBounds(400, 200, 35, 35);

        jl218.setFont(new java.awt.Font("Verdana", 1, 10));
        jl218.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl218.setText("218");
        jl218.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl218);
        jl218.setBounds(450, 200, 35, 35);

        jl208.setFont(new java.awt.Font("Verdana", 1, 10));
        jl208.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl208.setText("208");
        jl208.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl208);
        jl208.setBounds(450, 240, 35, 35);

        jl209.setFont(new java.awt.Font("Verdana", 1, 10));
        jl209.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl209.setText("209");
        jl209.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl209);
        jl209.setBounds(500, 240, 35, 35);

        jl219.setFont(new java.awt.Font("Verdana", 1, 10));
        jl219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl219.setText("219");
        jl219.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl219);
        jl219.setBounds(500, 200, 35, 35);

        jl220.setFont(new java.awt.Font("Verdana", 1, 10));
        jl220.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl220.setText("220");
        jl220.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl220);
        jl220.setBounds(550, 200, 35, 35);

        jl210.setFont(new java.awt.Font("Verdana", 1, 10));
        jl210.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl210.setText("210");
        jl210.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl210);
        jl210.setBounds(550, 240, 35, 35);

        jl111.setFont(new java.awt.Font("Verdana", 1, 10));
        jl111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl111.setText("111");
        jl111.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl111);
        jl111.setBounds(100, 295, 35, 35);

        jl101.setFont(new java.awt.Font("Verdana", 1, 10));
        jl101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl101.setText("101");
        jl101.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl101);
        jl101.setBounds(100, 335, 35, 35);

        jl102.setFont(new java.awt.Font("Verdana", 1, 10));
        jl102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl102.setText("102");
        jl102.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl102);
        jl102.setBounds(150, 335, 35, 35);

        jl112.setFont(new java.awt.Font("Verdana", 1, 10));
        jl112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl112.setText("112");
        jl112.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl112);
        jl112.setBounds(150, 295, 35, 35);

        jl113.setFont(new java.awt.Font("Verdana", 1, 10));
        jl113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl113.setText("113");
        jl113.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl113);
        jl113.setBounds(200, 295, 35, 35);

        jl103.setFont(new java.awt.Font("Verdana", 1, 10));
        jl103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl103.setText("103");
        jl103.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl103);
        jl103.setBounds(200, 335, 35, 35);

        jl104.setFont(new java.awt.Font("Verdana", 1, 10));
        jl104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl104.setText("104");
        jl104.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl104);
        jl104.setBounds(250, 335, 35, 35);

        jl114.setFont(new java.awt.Font("Verdana", 1, 10));
        jl114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl114.setText("114");
        jl114.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl114);
        jl114.setBounds(250, 295, 35, 35);

        jl115.setFont(new java.awt.Font("Verdana", 1, 10));
        jl115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl115.setText("115");
        jl115.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl115);
        jl115.setBounds(300, 295, 35, 35);

        jl105.setFont(new java.awt.Font("Verdana", 1, 10));
        jl105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl105.setText("105");
        jl105.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl105);
        jl105.setBounds(300, 335, 35, 35);

        jl106.setFont(new java.awt.Font("Verdana", 1, 10));
        jl106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl106.setText("106");
        jl106.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl106);
        jl106.setBounds(350, 335, 35, 35);

        jl116.setFont(new java.awt.Font("Verdana", 1, 10));
        jl116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl116.setText("116");
        jl116.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl116);
        jl116.setBounds(350, 295, 35, 35);

        jl117.setFont(new java.awt.Font("Verdana", 1, 10));
        jl117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl117.setText("117");
        jl117.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl117);
        jl117.setBounds(400, 295, 35, 35);

        jl107.setFont(new java.awt.Font("Verdana", 1, 10));
        jl107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl107.setText("107");
        jl107.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl107);
        jl107.setBounds(400, 335, 35, 35);

        jl108.setFont(new java.awt.Font("Verdana", 1, 10));
        jl108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl108.setText("108");
        jl108.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl108);
        jl108.setBounds(450, 335, 35, 35);

        jl118.setFont(new java.awt.Font("Verdana", 1, 10));
        jl118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl118.setText("118");
        jl118.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl118);
        jl118.setBounds(450, 295, 35, 35);

        jl119.setFont(new java.awt.Font("Verdana", 1, 10));
        jl119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl119.setText("119");
        jl119.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl119);
        jl119.setBounds(500, 295, 35, 35);

        jl109.setFont(new java.awt.Font("Verdana", 1, 10));
        jl109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl109.setText("109");
        jl109.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl109);
        jl109.setBounds(500, 335, 35, 35);

        jl110.setFont(new java.awt.Font("Verdana", 1, 10));
        jl110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl110.setText("110");
        jl110.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl110);
        jl110.setBounds(550, 335, 35, 35);

        jl120.setFont(new java.awt.Font("Verdana", 1, 10));
        jl120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl120.setText("120");
        jl120.setBorder(new javax.swing.border.EtchedBorder());
        jpHabitaciones.add(jl120);
        jl120.setBounds(550, 295, 35, 35);

        jtpContenedor.addTab("  Habitaciones  ", jpHabitaciones);

        jpGHabitaciones.setLayout(null);

        jpGHabitaciones.setFont(new java.awt.Font("Verdana", 0, 10));
        jlListaHabitaciones.setFont(new java.awt.Font("Verdana", 1, 10));
        jlListaHabitaciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlListaHabitaciones.setText("Habitaciones Ocupadas");
        jpGHabitaciones.add(jlListaHabitaciones);
        jlListaHabitaciones.setBounds(19, 20, 132, 14);

        jlDatosHabitacion.setFont(new java.awt.Font("Verdana", 1, 10));
        jlDatosHabitacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlDatosHabitacion.setText("Datos de la Habitaci\u00f3n");
        jpGHabitaciones.add(jlDatosHabitacion);
        jlDatosHabitacion.setBounds(170, 20, 127, 14);

        jpDatosHabitacion.setLayout(null);

        jpDatosHabitacion.setBorder(new javax.swing.border.EtchedBorder());
        jtfCategoriaHabitacion.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfCategoriaHabitacion.setEnabled(false);
        jpDatosHabitacion.add(jtfCategoriaHabitacion);
        jtfCategoriaHabitacion.setBounds(140, 20, 260, 18);

        jlCategoriaHabitacion.setFont(new java.awt.Font("Verdana", 1, 10));
        jlCategoriaHabitacion.setText("Categor\u00eda:");
        jpDatosHabitacion.add(jlCategoriaHabitacion);
        jlCategoriaHabitacion.setBounds(20, 20, 60, 14);

        jlPrecioHabitacion.setFont(new java.awt.Font("Verdana", 1, 10));
        jlPrecioHabitacion.setText("Precio:");
        jpDatosHabitacion.add(jlPrecioHabitacion);
        jlPrecioHabitacion.setBounds(20, 50, 40, 14);

        jtfPrecioHabitacion.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfPrecioHabitacion.setEnabled(false);
        jpDatosHabitacion.add(jtfPrecioHabitacion);
        jtfPrecioHabitacion.setBounds(140, 50, 260, 18);

        jpDatosClienteHabitacion.setLayout(null);

        jpDatosClienteHabitacion.setBorder(new javax.swing.border.TitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 0, 10)));
        jlApellidosClienteHabitacion.setFont(new java.awt.Font("Verdana", 1, 10));
        jlApellidosClienteHabitacion.setText("Apellidos:");
        jpDatosClienteHabitacion.add(jlApellidosClienteHabitacion);
        jlApellidosClienteHabitacion.setBounds(20, 90, 56, 14);

        jlDireccionClienteHabitacion.setFont(new java.awt.Font("Verdana", 1, 10));
        jlDireccionClienteHabitacion.setText("Direcci\u00f3n:");
        jpDatosClienteHabitacion.add(jlDireccionClienteHabitacion);
        jlDireccionClienteHabitacion.setBounds(20, 120, 57, 14);

        jtfDireccionClienteHabitacion.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfDireccionClienteHabitacion.setEnabled(false);
        jpDatosClienteHabitacion.add(jtfDireccionClienteHabitacion);
        jtfDireccionClienteHabitacion.setBounds(140, 120, 220, 18);

        jtfApellidosClienteHabitacion.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfApellidosClienteHabitacion.setEnabled(false);
        jpDatosClienteHabitacion.add(jtfApellidosClienteHabitacion);
        jtfApellidosClienteHabitacion.setBounds(140, 90, 220, 18);

        jlDNIClienteHabitacion.setFont(new java.awt.Font("Verdana", 1, 10));
        jlDNIClienteHabitacion.setText("DNI:");
        jpDatosClienteHabitacion.add(jlDNIClienteHabitacion);
        jlDNIClienteHabitacion.setBounds(20, 30, 27, 14);

        jlNombreClienteHabitacion.setFont(new java.awt.Font("Verdana", 1, 10));
        jlNombreClienteHabitacion.setText("Nombre:");
        jpDatosClienteHabitacion.add(jlNombreClienteHabitacion);
        jlNombreClienteHabitacion.setBounds(20, 60, 50, 14);

        jtfNombreClienteHabitacion.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfNombreClienteHabitacion.setEnabled(false);
        jpDatosClienteHabitacion.add(jtfNombreClienteHabitacion);
        jtfNombreClienteHabitacion.setBounds(140, 60, 220, 18);

        jtfDNIClienteHabitacion.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfDNIClienteHabitacion.setEnabled(false);
        jpDatosClienteHabitacion.add(jtfDNIClienteHabitacion);
        jtfDNIClienteHabitacion.setBounds(140, 30, 220, 18);

        jlFechaEntradaHabitacion.setFont(new java.awt.Font("Verdana", 1, 10));
        jlFechaEntradaHabitacion.setText("Fecha de Entrada:");
        jpDatosClienteHabitacion.add(jlFechaEntradaHabitacion);
        jlFechaEntradaHabitacion.setBounds(20, 150, 103, 14);

        jlFechaSalidaHabitacion.setFont(new java.awt.Font("Verdana", 1, 10));
        jlFechaSalidaHabitacion.setText("Fecha de Salida:");
        jpDatosClienteHabitacion.add(jlFechaSalidaHabitacion);
        jlFechaSalidaHabitacion.setBounds(20, 180, 92, 14);

        jtfFechaSalidaHabitacion.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfFechaSalidaHabitacion.setEnabled(false);
        jpDatosClienteHabitacion.add(jtfFechaSalidaHabitacion);
        jtfFechaSalidaHabitacion.setBounds(140, 180, 220, 18);

        jtfFechaEntradaHabitacion.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfFechaEntradaHabitacion.setEnabled(false);
        jpDatosClienteHabitacion.add(jtfFechaEntradaHabitacion);
        jtfFechaEntradaHabitacion.setBounds(140, 150, 220, 18);

        jpDatosHabitacion.add(jpDatosClienteHabitacion);
        jpDatosClienteHabitacion.setBounds(20, 90, 380, 220);

        jpGHabitaciones.add(jpDatosHabitacion);
        jpDatosHabitacion.setBounds(170, 40, 420, 330);

        jspListaHabitaciones.setBorder(new javax.swing.border.EtchedBorder());
        jlstListaHabitaciones.setFont(new java.awt.Font("Verdana", 0, 10));
        jlstListaHabitaciones.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlstListaHabitaciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jlstListaHabitacionesMouseReleased(evt);
            }
        });

        jspListaHabitaciones.setViewportView(jlstListaHabitaciones);

        jpGHabitaciones.add(jspListaHabitaciones);
        jspListaHabitaciones.setBounds(20, 40, 130, 330);

        jtpContenedor.addTab("  Gesti\u00f3n de Habitaciones  ", jpGHabitaciones);

        jpClientes.setLayout(null);

        jpClientes.setFont(new java.awt.Font("Verdana", 0, 10));
        jlListaClientes.setFont(new java.awt.Font("Verdana", 1, 10));
        jlListaClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlListaClientes.setText("Lista de Clientes");
        jpClientes.add(jlListaClientes);
        jlListaClientes.setBounds(20, 20, 130, 14);

        jpDatosCliente.setLayout(null);

        jpDatosCliente.setBorder(new javax.swing.border.EtchedBorder());
        jlDNICliente.setFont(new java.awt.Font("Verdana", 1, 10));
        jlDNICliente.setText("DNI:");
        jpDatosCliente.add(jlDNICliente);
        jlDNICliente.setBounds(20, 20, 27, 14);

        jtfDNICliente.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfDNICliente.setEnabled(false);
        jpDatosCliente.add(jtfDNICliente);
        jtfDNICliente.setBounds(140, 20, 260, 18);

        jlNombreCliente.setFont(new java.awt.Font("Verdana", 1, 10));
        jlNombreCliente.setText("Nombre:");
        jpDatosCliente.add(jlNombreCliente);
        jlNombreCliente.setBounds(20, 50, 50, 14);

        jtfNombreCliente.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfNombreCliente.setEnabled(false);
        jpDatosCliente.add(jtfNombreCliente);
        jtfNombreCliente.setBounds(140, 50, 260, 18);

        jlApellidosCliente.setFont(new java.awt.Font("Verdana", 1, 10));
        jlApellidosCliente.setText("Apellidos:");
        jpDatosCliente.add(jlApellidosCliente);
        jlApellidosCliente.setBounds(20, 80, 56, 14);

        jtfApellido1Cliente.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfApellido1Cliente.setEnabled(false);
        jpDatosCliente.add(jtfApellido1Cliente);
        jtfApellido1Cliente.setBounds(140, 80, 130, 18);

        jtfApellido2Cliente.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfApellido2Cliente.setEnabled(false);
        jpDatosCliente.add(jtfApellido2Cliente);
        jtfApellido2Cliente.setBounds(270, 80, 130, 18);

        jlDireccionCliente.setFont(new java.awt.Font("Verdana", 1, 10));
        jlDireccionCliente.setText("Direcci\u00f3n:");
        jpDatosCliente.add(jlDireccionCliente);
        jlDireccionCliente.setBounds(20, 110, 57, 14);

        jtfDireccionCliente.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfDireccionCliente.setEnabled(false);
        jpDatosCliente.add(jtfDireccionCliente);
        jtfDireccionCliente.setBounds(140, 110, 260, 18);

        jlNHabitacion.setFont(new java.awt.Font("Verdana", 1, 10));
        jlNHabitacion.setText("N\u00ba Habitaci\u00f3n:");
        jpDatosCliente.add(jlNHabitacion);
        jlNHabitacion.setBounds(20, 140, 81, 14);

        jlFechaEntrada.setFont(new java.awt.Font("Verdana", 1, 10));
        jlFechaEntrada.setText("Fecha de Entrada:");
        jpDatosCliente.add(jlFechaEntrada);
        jlFechaEntrada.setBounds(20, 170, 103, 14);

        jtfFechaEntrada.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfFechaEntrada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfFechaEntrada.setEnabled(false);
        jpDatosCliente.add(jtfFechaEntrada);
        jtfFechaEntrada.setBounds(140, 170, 60, 18);

        jlFechaSalida.setFont(new java.awt.Font("Verdana", 1, 10));
        jlFechaSalida.setText("Fecha de Salida:");
        jpDatosCliente.add(jlFechaSalida);
        jlFechaSalida.setBounds(20, 200, 92, 14);

        jtfFechaSalida.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfFechaSalida.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtfFechaSalida.setEnabled(false);
        jpDatosCliente.add(jtfFechaSalida);
        jtfFechaSalida.setBounds(140, 200, 60, 18);

        jtfNHabitacionCliente.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfNHabitacionCliente.setEnabled(false);
        jpDatosCliente.add(jtfNHabitacionCliente);
        jtfNHabitacionCliente.setBounds(140, 140, 260, 18);

        jcbNHabitacionCliente.setFont(new java.awt.Font("Verdana", 0, 10));
        jcbNHabitacionCliente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216", "217", "218", "219", "220", "301", "302", "303", "304", "305", "306", "307", "308", "309", "310", "311", "312", "313", "314", "315", "316", "317", "318", "319", "320", "401", "402", "403", "404", "405", "406", "407", "408", "409", "410", "411", "412", "413", "414", "415", "416", "417", "418", "419", "420" }));
        jcbNHabitacionCliente.setEnabled(false);
        jcbNHabitacionCliente.setVisible(false);
        jpDatosCliente.add(jcbNHabitacionCliente);
        jcbNHabitacionCliente.setBounds(140, 140, 260, 18);

        jbAceptarCliente.setFont(new java.awt.Font("Verdana", 1, 10));
        jbAceptarCliente.setText("Aceptar");
        jbAceptarCliente.setEnabled(false);
        jbAceptarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarClienteActionPerformed(evt);
            }
        });

        jpDatosCliente.add(jbAceptarCliente);
        jbAceptarCliente.setBounds(140, 285, 130, 24);

        jbCancelarCliente.setFont(new java.awt.Font("Verdana", 1, 10));
        jbCancelarCliente.setText("Cancelar");
        jbCancelarCliente.setEnabled(false);
        jbCancelarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarClienteActionPerformed(evt);
            }
        });

        jpDatosCliente.add(jbCancelarCliente);
        jbCancelarCliente.setBounds(270, 285, 130, 24);

        jlFormatoEntrada.setFont(new java.awt.Font("Verdana", 0, 10));
        jlFormatoEntrada.setText("dd/mm/aa");
        jpDatosCliente.add(jlFormatoEntrada);
        jlFormatoEntrada.setBounds(210, 170, 60, 14);

        jlFormatoSalida.setFont(new java.awt.Font("Verdana", 0, 10));
        jlFormatoSalida.setText("dd/mm/aa");
        jpDatosCliente.add(jlFormatoSalida);
        jlFormatoSalida.setBounds(210, 200, 60, 14);

        jpClientes.add(jpDatosCliente);
        jpDatosCliente.setBounds(170, 40, 420, 330);

        jbNuevoCliente.setFont(new java.awt.Font("Verdana", 1, 10));
        jbNuevoCliente.setText("Nuevo Cliente");
        jbNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoClienteActionPerformed(evt);
            }
        });

        jpClientes.add(jbNuevoCliente);
        jbNuevoCliente.setBounds(170, 15, 140, 24);

        jbModificarCliente.setFont(new java.awt.Font("Verdana", 1, 10));
        jbModificarCliente.setText("Modificar Cliente");
        jbModificarCliente.setEnabled(false);
        jbModificarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarClienteActionPerformed(evt);
            }
        });

        jpClientes.add(jbModificarCliente);
        jbModificarCliente.setBounds(310, 15, 140, 24);

        jbEliminarCliente.setFont(new java.awt.Font("Verdana", 1, 10));
        jbEliminarCliente.setText("Eliminar Cliente");
        jbEliminarCliente.setEnabled(false);
        jbEliminarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarClienteActionPerformed(evt);
            }
        });

        jpClientes.add(jbEliminarCliente);
        jbEliminarCliente.setBounds(450, 15, 140, 24);

        jlstListaClientes.setFont(new java.awt.Font("Verdana", 0, 10));
        jlstListaClientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlstListaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jlstListaClientesMouseReleased(evt);
            }
        });

        jspListaClientes.setViewportView(jlstListaClientes);

        jpClientes.add(jspListaClientes);
        jspListaClientes.setBounds(20, 40, 130, 330);

        jtpContenedor.addTab("  Clientes ", jpClientes);

        jpCategoriasPrecios.setLayout(null);

        jpCategoriasPrecios.setFont(new java.awt.Font("Verdana", 0, 10));
        jpDatosCategoria.setLayout(null);

        jpDatosCategoria.setBorder(new javax.swing.border.EtchedBorder());
        jlPrecioCategoria.setFont(new java.awt.Font("Verdana", 1, 10));
        jlPrecioCategoria.setText("Precio:");
        jpDatosCategoria.add(jlPrecioCategoria);
        jlPrecioCategoria.setBounds(20, 50, 40, 14);

        jtfPrecioCategoria.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfPrecioCategoria.setEnabled(false);
        jpDatosCategoria.add(jtfPrecioCategoria);
        jtfPrecioCategoria.setBounds(140, 50, 260, 18);

        jlDescripcionCategoria.setFont(new java.awt.Font("Verdana", 1, 10));
        jlDescripcionCategoria.setText("Descripci\u00f3n:");
        jpDatosCategoria.add(jlDescripcionCategoria);
        jlDescripcionCategoria.setBounds(20, 80, 70, 14);

        jtfDescripcionCategoria.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfDescripcionCategoria.setEnabled(false);
        jpDatosCategoria.add(jtfDescripcionCategoria);
        jtfDescripcionCategoria.setBounds(140, 80, 260, 18);

        jbAceptarCategoria.setFont(new java.awt.Font("Verdana", 1, 10));
        jbAceptarCategoria.setText("Aceptar");
        jbAceptarCategoria.setEnabled(false);
        jbAceptarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAceptarCategoriaActionPerformed(evt);
            }
        });

        jpDatosCategoria.add(jbAceptarCategoria);
        jbAceptarCategoria.setBounds(140, 285, 130, 24);

        jbCancelarCategoria.setFont(new java.awt.Font("Verdana", 1, 10));
        jbCancelarCategoria.setText("Cancelar");
        jbCancelarCategoria.setEnabled(false);
        jbCancelarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarCategoriaActionPerformed(evt);
            }
        });

        jpDatosCategoria.add(jbCancelarCategoria);
        jbCancelarCategoria.setBounds(270, 285, 130, 24);

        jlNombreCategoria.setFont(new java.awt.Font("Verdana", 1, 10));
        jlNombreCategoria.setText("Nombre:");
        jpDatosCategoria.add(jlNombreCategoria);
        jlNombreCategoria.setBounds(20, 20, 49, 14);

        jtfNombreCategoria.setFont(new java.awt.Font("Verdana", 0, 10));
        jtfNombreCategoria.setEnabled(false);
        jpDatosCategoria.add(jtfNombreCategoria);
        jtfNombreCategoria.setBounds(140, 20, 260, 18);

        jpCategoriasPrecios.add(jpDatosCategoria);
        jpDatosCategoria.setBounds(170, 40, 420, 330);

        jlListaCategorias.setFont(new java.awt.Font("Verdana", 1, 10));
        jlListaCategorias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlListaCategorias.setText("Lista de Categor\u00edas");
        jpCategoriasPrecios.add(jlListaCategorias);
        jlListaCategorias.setBounds(20, 20, 130, 14);

        jbModificarCategoria.setFont(new java.awt.Font("Verdana", 1, 10));
        jbModificarCategoria.setText("Modificar Categor\u00eda");
        jbModificarCategoria.setEnabled(false);
        jbModificarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarCategoriaActionPerformed(evt);
            }
        });

        jpCategoriasPrecios.add(jbModificarCategoria);
        jbModificarCategoria.setBounds(440, 15, 150, 24);

        jbNuevaCategoria.setFont(new java.awt.Font("Verdana", 1, 10));
        jbNuevaCategoria.setText("Nueva Categor\u00eda");
        jbNuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevaCategoriaActionPerformed(evt);
            }
        });

        jpCategoriasPrecios.add(jbNuevaCategoria);
        jbNuevaCategoria.setBounds(170, 15, 130, 24);

        jbEliminarCategoria.setFont(new java.awt.Font("Verdana", 1, 10));
        jbEliminarCategoria.setText("Eliminar Categor\u00eda");
        jbEliminarCategoria.setEnabled(false);
        jbEliminarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarCategoriaActionPerformed(evt);
            }
        });

        jpCategoriasPrecios.add(jbEliminarCategoria);
        jbEliminarCategoria.setBounds(300, 15, 140, 24);

        jlstListaCategorias.setFont(new java.awt.Font("Verdana", 0, 10));
        jlstListaCategorias.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlstListaCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jlstListaCategoriasMouseReleased(evt);
            }
        });

        jspListacategorias.setViewportView(jlstListaCategorias);

        jpCategoriasPrecios.add(jspListacategorias);
        jspListacategorias.setBounds(20, 40, 130, 330);

        jtpContenedor.addTab("  Categor\u00edas & Precios ", jpCategoriasPrecios);

        getContentPane().add(jtpContenedor);
        jtpContenedor.setBounds(10, 10, 615, 415);

        jmbMenu.setFont(new java.awt.Font("Verdana", 1, 12));
        jmArchivo.setText("Archivo");
        jmArchivo.setFont(new java.awt.Font("Verdana", 1, 10));
        jmiSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        jmiSalir.setFont(new java.awt.Font("Verdana", 1, 10));
        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });

        jmArchivo.add(jmiSalir);

        jmbMenu.add(jmArchivo);

        jmAyuda.setText("Ayuda");
        jmAyuda.setFont(new java.awt.Font("Verdana", 1, 10));
        jmiAcerca.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jmiAcerca.setFont(new java.awt.Font("Verdana", 1, 10));
        jmiAcerca.setText("Acerca de...");
        jmiAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAcercaActionPerformed(evt);
            }
        });

        jmAyuda.add(jmiAcerca);

        jmbMenu.add(jmAyuda);

        setJMenuBar(jmbMenu);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-640)/2, (screenSize.height-480)/2, 640, 480);
    }//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        claseHotel.salvarClientesCategorias();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCargarActionPerformed
        claseHotel.cargarClientesCategorias();
        actualizarHabitaciones();
        actualizarListaHabitaciones();
        actualizarListaCategorias();
        actualizarListaClientes();
    }//GEN-LAST:event_jbCargarActionPerformed

    private void jlstListaHabitacionesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlstListaHabitacionesMouseReleased
        if(modeloListaHabitaciones.isEmpty() == false) {
            int indiceCategoria;
            //Se rellenan los datos de la categoría correspondiente a la habitación.
            //Plantas 1,2 = C <> Planta 3 = B <> Planta 4 = A
            if(Integer.valueOf(jlstListaHabitaciones.getModel().getElementAt(jlstListaHabitaciones.getSelectedIndex()).toString()).intValue() < 301)
                indiceCategoria = 0;
            else if(Integer.valueOf(jlstListaHabitaciones.getModel().getElementAt(jlstListaHabitaciones.getSelectedIndex()).toString()).intValue() < 401)
                indiceCategoria = 1;
            else
                indiceCategoria = 2;
            jtfCategoriaHabitacion.setText(((Categoria)(claseHotel.listaCategorias.get(indiceCategoria))).idCategoria);
            jtfPrecioHabitacion.setText(String.valueOf(((Categoria)(claseHotel.listaCategorias.get(indiceCategoria))).precioCategoria));
            //Se rellenan los datos del cliente que está en esa habitación.
            Cliente clienteTemp = tomarCliente(Integer.valueOf(jlstListaHabitaciones.getModel().getElementAt(jlstListaHabitaciones.getSelectedIndex()).toString()).intValue());
            jtfDNIClienteHabitacion.setText(clienteTemp.dniCliente);
            jtfNombreClienteHabitacion.setText(clienteTemp.nombreCliente);
            jtfApellidosClienteHabitacion.setText(clienteTemp.apellido1Cliente + " " + clienteTemp.apellido2Cliente);
            jtfDireccionClienteHabitacion.setText(clienteTemp.direccionCliente);
            jtfFechaEntradaHabitacion.setText(dateFormatter.format(clienteTemp.fechaEntrada));
            if(clienteTemp.fechaSalida != null)
                jtfFechaSalidaHabitacion.setText(dateFormatter.format(clienteTemp.fechaSalida));
        }//if
    }//GEN-LAST:event_jlstListaHabitacionesMouseReleased

    private void jbEliminarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarClienteActionPerformed
        if(!modeloListaClientes.isEmpty()) {
            claseHotel.eliminarCliente(jlstListaClientes.getSelectedIndex());
            jbModificarCliente.setEnabled(false);
            jbEliminarCliente.setEnabled(false);
            jtfDNICliente.setText("");
            jtfNombreCliente.setText("");
            jtfApellido1Cliente.setText("");
            jtfApellido2Cliente.setText("");
            jtfDireccionCliente.setText("");
            jtfNHabitacionCliente.setText("");
            jtfFechaEntrada.setText("");
            jtfFechaSalida.setText("");
            actualizarListaClientes();
            actualizarHabitaciones();
            actualizarListaHabitaciones();
        }//if
    }//GEN-LAST:event_jbEliminarClienteActionPerformed

    private void jbModificarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarClienteActionPerformed
        if(!modeloListaCategorias.isEmpty()) {
            //Se habilitan los campos para su edición y los botones.
            jbNuevoCliente.setEnabled(false);
            jbModificarCliente.setEnabled(false);
            jbEliminarCliente.setEnabled(false);
            jbAceptarCliente.setEnabled(true);
            jbCancelarCliente.setEnabled(true);
            jlstListaClientes.setEnabled(false);
            jtfDNICliente.setEnabled(true);
            jtfNombreCliente.setEnabled(true);
            jtfApellido1Cliente.setEnabled(true);
            jtfApellido2Cliente.setEnabled(true);
            jtfDireccionCliente.setEnabled(true);
            jtfNHabitacionCliente.setVisible(false);
            jcbNHabitacionCliente.setVisible(true);
            jcbNHabitacionCliente.setEnabled(true);
            jtfFechaEntrada.setEnabled(true);
            jtfFechaSalida.setEnabled(true);
            //Se deshabilita el TabbedPane para no poder cambiar de ficha.
            jtpContenedor.setEnabled(false);
            banderaNuevoCliente = 0;
        }//if
    }//GEN-LAST:event_jbModificarClienteActionPerformed

    private void jlstListaClientesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlstListaClientesMouseReleased
        if(modeloListaClientes.isEmpty() == false && jlstListaClientes.isEnabled() == true) {
            //Se rellenan los campos a partir de la categoría seleccionada.
            jbModificarCliente.setEnabled(true);
            jbEliminarCliente.setEnabled(true);
            jtfDNICliente.setText(claseHotel.tomarCliente(jlstListaClientes.getSelectedIndex()).dniCliente);
            jtfNombreCliente.setText(claseHotel.tomarCliente(jlstListaClientes.getSelectedIndex()).nombreCliente);
            jtfApellido1Cliente.setText(claseHotel.tomarCliente(jlstListaClientes.getSelectedIndex()).apellido1Cliente);
            jtfApellido2Cliente.setText(claseHotel.tomarCliente(jlstListaClientes.getSelectedIndex()).apellido2Cliente);
            jtfDireccionCliente.setText(claseHotel.tomarCliente(jlstListaClientes.getSelectedIndex()).direccionCliente);
            jtfNHabitacionCliente.setText(String.valueOf(claseHotel.tomarCliente(jlstListaClientes.getSelectedIndex()).numeroHabitacion));
            jtfFechaEntrada.setText(dateFormatter.format(claseHotel.tomarCliente(jlstListaClientes.getSelectedIndex()).fechaEntrada));
            if(claseHotel.tomarCliente(jlstListaClientes.getSelectedIndex()).fechaSalida != null)
                jtfFechaSalida.setText(dateFormatter.format(claseHotel.tomarCliente(jlstListaClientes.getSelectedIndex()).fechaSalida));
        }//if
    }//GEN-LAST:event_jlstListaClientesMouseReleased

    private void jbNuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevaCategoriaActionPerformed
        //Se habilitan los campos para su edición y los botones.
        jbNuevaCategoria.setEnabled(false);
        jbModificarCategoria.setEnabled(false);
        jbEliminarCategoria.setEnabled(false);
        jtfNombreCategoria.setEnabled(true);
        jtfNombreCategoria.setText("");
        jtfPrecioCategoria.setEnabled(true);
        jtfPrecioCategoria.setText("");
        jtfDescripcionCategoria.setEnabled(true);
        jtfDescripcionCategoria.setText("");
        jbAceptarCategoria.setEnabled(true);
        jbCancelarCategoria.setEnabled(true);
        jlstListaCategorias.setEnabled(false);
        //Se deshabilita el TabbedPane para no poder cambiar de ficha.
        jtpContenedor.setEnabled(false);
        banderaNuevaCategoria = 1;
    }//GEN-LAST:event_jbNuevaCategoriaActionPerformed

    private void jbEliminarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarCategoriaActionPerformed
        if(!modeloListaCategorias.isEmpty()) {
            claseHotel.eliminarCategoria(jlstListaCategorias.getSelectedIndex());
            jbModificarCategoria.setEnabled(false);
            jbEliminarCategoria.setEnabled(false);
            jtfNombreCategoria.setText("");
            jtfPrecioCategoria.setText("");
            jtfDescripcionCategoria.setText("");
            actualizarListaCategorias();
        }//if
    }//GEN-LAST:event_jbEliminarCategoriaActionPerformed

    private void jlstListaCategoriasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlstListaCategoriasMouseReleased
        if(modeloListaCategorias.isEmpty() == false && jlstListaCategorias.isEnabled() == true) {
            //Se rellenan los campos a partir de la categoría seleccionada.
            jbModificarCategoria.setEnabled(true);
            jbEliminarCategoria.setEnabled(true);
            jtfNombreCategoria.setText(claseHotel.tomarCategoria(jlstListaCategorias.getSelectedIndex()).idCategoria);
            jtfPrecioCategoria.setText(String.valueOf((claseHotel.tomarCategoria(jlstListaCategorias.getSelectedIndex()).precioCategoria)));
            jtfDescripcionCategoria.setText(claseHotel.tomarCategoria(jlstListaCategorias.getSelectedIndex()).descripcionCategoria);
        }//if
    }//GEN-LAST:event_jlstListaCategoriasMouseReleased

    private void jbCancelarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarCategoriaActionPerformed
        //Se habilitan los campos para su edición y los botones.
        jbNuevaCategoria.setEnabled(true);
        jtfNombreCategoria.setEnabled(false);
        jtfPrecioCategoria.setEnabled(false);
        jtfDescripcionCategoria.setEnabled(false);
        jbAceptarCategoria.setEnabled(false);
        jbCancelarCategoria.setEnabled(false);
        jlstListaCategorias.setEnabled(true);
        //Si hay un elemento seleccionado se actualizan los campos.
        if(!jlstListaCategorias.isSelectionEmpty()) {
            //Se llama al evento de la lista para refrescar los campos.
            jlstListaCategoriasMouseReleased(null);
        }//if
        //Se habilita de nuevo el TabbedPane.
        jtpContenedor.setEnabled(true);
        //Se seleccionó "Modificar Categoría".
        if(banderaNuevaCategoria == 0) {
            jbModificarCategoria.setEnabled(true);
            jbEliminarCategoria.setEnabled(true);
        }//if
    }//GEN-LAST:event_jbCancelarCategoriaActionPerformed

    private void jbAceptarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarCategoriaActionPerformed
        //Se habilitan los campos para su edición y los botones.
        jbNuevaCategoria.setEnabled(true);
        jbModificarCategoria.setEnabled(false);
        jbEliminarCategoria.setEnabled(false);
        jtfNombreCategoria.setEnabled(false);
        jtfPrecioCategoria.setEnabled(false);
        jtfDescripcionCategoria.setEnabled(false);
        jbAceptarCategoria.setEnabled(false);
        jbCancelarCategoria.setEnabled(false);
        jlstListaCategorias.setEnabled(true);
        //Si todos los campos están rellenos, se hacen las operaciones.
        if(jtfNombreCategoria.getText().length() != 0 &&
           jtfPrecioCategoria.getText().length() != 0 &&
           jtfDescripcionCategoria.getText().length() != 0) {
            //Si se seleccionó "Nueva Categoria".
            if(banderaNuevaCategoria == 1) {
                claseHotel.nuevaCategoria(jtfNombreCategoria.getText(),
                                          Integer.parseInt(jtfPrecioCategoria.getText()),
                                          jtfDescripcionCategoria.getText());
            } else {        
                //Se guardan los cambios.
                claseHotel.modificarCategoria(jlstListaCategorias.getSelectedIndex(),
                                              jtfNombreCategoria.getText(),
                                              Integer.parseInt(jtfPrecioCategoria.getText()),
                                              jtfDescripcionCategoria.getText());
            }//if-else
        } else {
            System.out.println("Los datos de la Categoria no son validos.");
        }//if-else
        //Se habilita de nuevo el TabbedPane.
        jtpContenedor.setEnabled(true);
        jtfNombreCategoria.setText("");
        jtfPrecioCategoria.setText("");
        jtfDescripcionCategoria.setText("");
        actualizarListaCategorias();
        actualizarListaHabitaciones();
    }//GEN-LAST:event_jbAceptarCategoriaActionPerformed

    private void jbModificarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarCategoriaActionPerformed
        if(!modeloListaCategorias.isEmpty()) {
            //Se habilitan los campos para su edición y los botones.
            jbNuevaCategoria.setEnabled(false);
            jbModificarCategoria.setEnabled(false);
            jbEliminarCategoria.setEnabled(false);
            jtfNombreCategoria.setEnabled(true);
            jtfPrecioCategoria.setEnabled(true);
            jtfDescripcionCategoria.setEnabled(true);
            jbAceptarCategoria.setEnabled(true);
            jbCancelarCategoria.setEnabled(true);
            jlstListaCategorias.setEnabled(false);
            //Se deshabilita el TabbedPane para no poder cambiar de ficha.
            jtpContenedor.setEnabled(false);
            banderaNuevaCategoria = 0;
        }//if
    }//GEN-LAST:event_jbModificarCategoriaActionPerformed

    private void jbCancelarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarClienteActionPerformed
        //Se (des)habilitan los cuadros de texto y los botones.
        jbNuevoCliente.setEnabled(true);
        jbAceptarCliente.setEnabled(false);
        jbCancelarCliente.setEnabled(false);
        jlstListaClientes.setEnabled(true);
        jtfDNICliente.setEnabled(false);
        jtfNombreCliente.setEnabled(false);
        jtfApellido1Cliente.setEnabled(false);
        jtfApellido2Cliente.setEnabled(false);
        jtfDireccionCliente.setEnabled(false);
        jtfNHabitacionCliente.setVisible(true);
        jcbNHabitacionCliente.setVisible(false);
        jcbNHabitacionCliente.setEnabled(false);
        jtfFechaEntrada.setEnabled(false);
        jtfFechaSalida.setEnabled(false);
        //Si hay un elemento seleccionado se actualizan los campos.
        if(!jlstListaClientes.isSelectionEmpty()) {
            //Se llama al evento de la lista para refrescar los campos.
            jlstListaClientesMouseReleased(null);
        }//if
        //Se habilita de nuevo el TabbedPane.
        jtpContenedor.setEnabled(true);
        //Se seleccionó "Modificar Cliente".
        if(banderaNuevoCliente == 0) {
            jbModificarCliente.setEnabled(true);
            jbEliminarCliente.setEnabled(true);
        }//if
    }//GEN-LAST:event_jbCancelarClienteActionPerformed

    private void jbAceptarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAceptarClienteActionPerformed
        //Se (des)habilitan los cuadros de texto y los botones.
        jbNuevoCliente.setEnabled(true);
        jbAceptarCliente.setEnabled(false);
        jbCancelarCliente.setEnabled(false);
        jlstListaClientes.setEnabled(true);
        jtfDNICliente.setEnabled(false);
        jtfNombreCliente.setEnabled(false);
        jtfApellido1Cliente.setEnabled(false);
        jtfApellido2Cliente.setEnabled(false);
        jtfDireccionCliente.setEnabled(false);
        jtfNHabitacionCliente.setVisible(true);
        jcbNHabitacionCliente.setVisible(false);
        jcbNHabitacionCliente.setEnabled(false);
        jtfFechaEntrada.setEnabled(false);
        jtfFechaSalida.setEnabled(false);
        //Si todos los campos están rellenos, se hacen las operaciones.
        if(jtfDNICliente.getText().length()         != 0 &&
           jtfNombreCliente.getText().length()      != 0 &&
           jtfApellido1Cliente.getText().length()   != 0 &&
           jtfApellido2Cliente.getText().length()   != 0 &&
           jtfDireccionCliente.getText().length()   != 0 &&
           jcbNHabitacionCliente.getSelectedIndex() != -1 &&
           jtfFechaEntrada.getText().length()       != 0) {
           //Si se seleccionó "Nuevo Cliente".
            java.util.Date fechaEntrada = null;
            java.util.Date fechaSalida = null;
            try {
                fechaEntrada = dateFormatter.parse(jtfFechaEntrada.getText());
                if(jtfFechaSalida.getText().length() != 0)
                    fechaSalida = dateFormatter.parse(jtfFechaSalida.getText());
                else
                    fechaSalida = null;
            } catch(Exception e) {
                System.out.println("Error -> " + e.toString());
            }//try-catch
            if(habitacionOcupada(Integer.parseInt(jcbNHabitacionCliente.getModel().getSelectedItem().toString())) == false) { 
                if(banderaNuevoCliente == 1) {
                    claseHotel.nuevoCliente(jtfDNICliente.getText(), jtfNombreCliente.getText(), 
                                            jtfApellido1Cliente.getText(), jtfApellido2Cliente.getText(), 
                                            jtfDireccionCliente.getText(), Integer.parseInt(jcbNHabitacionCliente.getModel().getSelectedItem().toString()),
                                            fechaEntrada, fechaSalida);
                } else {        
                    claseHotel.modificarCliente(jlstListaClientes.getSelectedIndex(),
                                                jtfDNICliente.getText(), jtfNombreCliente.getText(),
                                                jtfApellido1Cliente.getText(), jtfApellido2Cliente.getText(),
                                                jtfDireccionCliente.getText(), Integer.parseInt(jcbNHabitacionCliente.getModel().getSelectedItem().toString()),
                                                fechaEntrada, fechaSalida);
                }//if-else
            } else {
                System.out.println("La Habitacion seleccionada esta ocupada.");
            }//if-else
        } else {
            System.out.println("Los datos del Cliente no son validos.");
        }//if-else
        //Se habilita de nuevo el TabbedPane.
        jtpContenedor.setEnabled(true);
        jtfDNICliente.setText("");
        jtfNombreCliente.setText("");
        jtfApellido1Cliente.setText("");
        jtfApellido2Cliente.setText("");
        jtfDireccionCliente.setText("");
        jtfNHabitacionCliente.setText("");
        jtfFechaEntrada.setText("");
        jtfFechaSalida.setText("");
        actualizarListaClientes();
        actualizarHabitaciones();
        actualizarListaHabitaciones();
    }//GEN-LAST:event_jbAceptarClienteActionPerformed

    private void jbNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoClienteActionPerformed
        //Se habilitan los campos para su edición y los botones.
        jbNuevoCliente.setEnabled(false);
        jbModificarCliente.setEnabled(false);
        jbEliminarCliente.setEnabled(false);
        jbAceptarCliente.setEnabled(true);
        jbCancelarCliente.setEnabled(true);
        jlstListaClientes.setEnabled(false);
        jtfDNICliente.setEnabled(true);
        jtfDNICliente.setText("");
        jtfNombreCliente.setEnabled(true);
        jtfNombreCliente.setText("");
        jtfApellido1Cliente.setEnabled(true);
        jtfApellido1Cliente.setText("");
        jtfApellido2Cliente.setEnabled(true);
        jtfApellido2Cliente.setText("");
        jtfDireccionCliente.setEnabled(true);
        jtfDireccionCliente.setText("");
        jtfNHabitacionCliente.setVisible(false);
        jtfNHabitacionCliente.setText("");
        jcbNHabitacionCliente.setVisible(true);
        jcbNHabitacionCliente.setEnabled(true);
        jcbNHabitacionCliente.setSelectedIndex(-1);
        jtfFechaEntrada.setEnabled(true);
        jtfFechaEntrada.setText("");
        jtfFechaSalida.setEnabled(true);
        jtfFechaSalida.setText("");
        jtpContenedor.setEnabled(false);
        banderaNuevoCliente = 1;
    }//GEN-LAST:event_jbNuevoClienteActionPerformed

    private void jmiAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAcercaActionPerformed
        //Se muestra el diálogo modal acercaDe.
        acercaDe.show();
    }//GEN-LAST:event_jmiAcercaActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed
    
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    public static void main(String args[]) {
        //Se crea el jFrame y se muestra.
        marcoVHotel = new VHotel();
        marcoVHotel.show();
    }//main
    
    //Crea un array con todas las etiquetas de las habitaciones.
    private void crearArrayEtiquetas() {
        //Planta 1.
        arrayEtiquetas[0] = jl101;  arrayEtiquetas[1] = jl102;
        arrayEtiquetas[2] = jl103;  arrayEtiquetas[3] = jl104;
        arrayEtiquetas[4] = jl105;  arrayEtiquetas[5] = jl106;
        arrayEtiquetas[6] = jl107;  arrayEtiquetas[7] = jl108;
        arrayEtiquetas[8] = jl109;  arrayEtiquetas[9] = jl110;
        arrayEtiquetas[10] = jl111; arrayEtiquetas[11] = jl112;
        arrayEtiquetas[12] = jl113; arrayEtiquetas[13] = jl114;
        arrayEtiquetas[14] = jl115; arrayEtiquetas[15] = jl116;
        arrayEtiquetas[16] = jl117; arrayEtiquetas[17] = jl118;
        arrayEtiquetas[18] = jl119; arrayEtiquetas[19] = jl120;
        //Planta 2.
        arrayEtiquetas[20] = jl201; arrayEtiquetas[21] = jl202;
        arrayEtiquetas[22] = jl203; arrayEtiquetas[23] = jl204;
        arrayEtiquetas[24] = jl205; arrayEtiquetas[25] = jl206;
        arrayEtiquetas[26] = jl207; arrayEtiquetas[27] = jl208;
        arrayEtiquetas[28] = jl209; arrayEtiquetas[29] = jl210;
        arrayEtiquetas[30] = jl211; arrayEtiquetas[31] = jl212;
        arrayEtiquetas[32] = jl213; arrayEtiquetas[33] = jl214;
        arrayEtiquetas[34] = jl215; arrayEtiquetas[35] = jl216;
        arrayEtiquetas[36] = jl217; arrayEtiquetas[37] = jl218;
        arrayEtiquetas[38] = jl219; arrayEtiquetas[39] = jl220;
        //Planta 3.
        arrayEtiquetas[40] = jl301; arrayEtiquetas[41] = jl302;
        arrayEtiquetas[42] = jl303; arrayEtiquetas[43] = jl304;
        arrayEtiquetas[44] = jl305; arrayEtiquetas[45] = jl306;
        arrayEtiquetas[46] = jl307; arrayEtiquetas[47] = jl308;
        arrayEtiquetas[48] = jl309; arrayEtiquetas[49] = jl310;
        arrayEtiquetas[50] = jl311; arrayEtiquetas[51] = jl312;
        arrayEtiquetas[52] = jl313; arrayEtiquetas[53] = jl314;
        arrayEtiquetas[54] = jl315; arrayEtiquetas[55] = jl316;
        arrayEtiquetas[56] = jl317; arrayEtiquetas[57] = jl318;
        arrayEtiquetas[58] = jl319; arrayEtiquetas[59] = jl320;
        //Planta 4.
        arrayEtiquetas[60] = jl401; arrayEtiquetas[61] = jl402;
        arrayEtiquetas[62] = jl403; arrayEtiquetas[63] = jl404;
        arrayEtiquetas[64] = jl405; arrayEtiquetas[65] = jl406;
        arrayEtiquetas[66] = jl407; arrayEtiquetas[67] = jl408;
        arrayEtiquetas[68] = jl409; arrayEtiquetas[69] = jl410;
        arrayEtiquetas[70] = jl411; arrayEtiquetas[71] = jl412;
        arrayEtiquetas[72] = jl413; arrayEtiquetas[73] = jl414;
        arrayEtiquetas[74] = jl415; arrayEtiquetas[75] = jl416;
        arrayEtiquetas[76] = jl417; arrayEtiquetas[77] = jl418;
        arrayEtiquetas[78] = jl419; arrayEtiquetas[79] = jl420;
    }//crearArrayEtiquetas
    
    //Pone como llenas (rojas) las habitaciones.
    private void actualizarHabitaciones() {
        int c;
        //Primero se ponen todas vacias.
        vaciarHabitaciones();
        //Después se buscan las ocupadas y se ponen ocupadas.
        llenarHabitaciones();
    }//actualizarHabitaciones
    
    //Pone como vacías (verdes) las habitaciones.
    private void vaciarHabitaciones() {
        int c;
        for(c=0; c<80; c++) {
            arrayEtiquetas[c].setBackground(new java.awt.Color(0,150,0));
        }//for
    }//vaciarHabitaciones
    
    //Busca las habitaciones ocupadas, en base a la lista de clientes.
    private void llenarHabitaciones() {
        int c, numHab;
        for(c=0; c<claseHotel.listaClientes.size(); c++) {
            if(((Cliente)(claseHotel.listaClientes.get(c))).fechaSalida == null) {
                numHab = ((Cliente)(claseHotel.listaClientes.get(c))).numeroHabitacion;
                arrayEtiquetas[numHab-((((numHab/100)-1)*80)+101)].setBackground(new java.awt.Color(255,0,0));
            }//if
        }//for
    }//llenarHabitaciones
    
    //Comprueba si la habitación está ocupada o no.
    private boolean habitacionOcupada(int numeroHabitacion) {
        int c;
        for(c=0; c<claseHotel.listaClientes.size(); c++) {
            if(((Cliente)(claseHotel.listaClientes.get(c))).numeroHabitacion == numeroHabitacion) {
                return true;
            }//if
        }//for
        return false;
    }//habitacionOcupada
    
    //Devuelve el objeto cliente en base a la habitación que ocupa.
    private Cliente tomarCliente(int numeroHabitacion) {
        int c;
        for(c=0; c<claseHotel.listaClientes.size(); c++) {
            if(((Cliente)(claseHotel.listaClientes.get(c))).numeroHabitacion == numeroHabitacion)
                return (Cliente)(claseHotel.listaClientes.get(c));
        }//for
        return null;
    }//tomarCliente
    
    //Se asignan los modelos de listas a las listas.
    private void asignarModelos() {
        jlstListaCategorias.setModel(modeloListaCategorias);
        jlstListaClientes.setModel(modeloListaClientes);
        jlstListaHabitaciones.setModel(modeloListaHabitaciones);
    }//asignarModelos
    
    //Se crean las 3 categorías por defecto.
    private void crearListaCategoriasPorDefecto() {
        //Se rellena la lista (LinkedList) de categorías.
        claseHotel.crearCategoriasPorDefecto();
        //Se actualiza la lista de categorías.
        actualizarListaCategorias();
    }//crearListaCategoriasPorDefecto
    
    //Se actualiza la lista (JList) de categorías.
    private void actualizarListaCategorias() {
        //Contador.
        int contador;
        //Se borra el contenido de la lista.
        modeloListaCategorias.clear();
        //Se rellena.
        for(contador=0; contador<claseHotel.listaCategorias.size(); contador++) {
            modeloListaCategorias.addElement(((Categoria)
                                              claseHotel.listaCategorias.
                                              get(contador)).idCategoria);
        }//for
    }//actualizarListaCategorias
    
    //Se actualiza la lista (JList) de clientes.
    private void actualizarListaClientes() {
        //Contador.
        int contador;
        //Se borra el contenido de la lista.
        modeloListaClientes.clear();
        //Se rellena.
        for(contador=0; contador<claseHotel.listaClientes.size(); contador++) {
            modeloListaClientes.addElement(((Cliente)
                                              claseHotel.listaClientes.
                                              get(contador)).nombreCliente);
        }//for
    }//actualizarListaCategorias
    
    //Se actualiza la lista (JList) de habitaciones.
    private void actualizarListaHabitaciones() {
        int contador;
        modeloListaHabitaciones.clear();
        jtfCategoriaHabitacion.setText("");
        jtfPrecioHabitacion.setText("");
        jtfDNIClienteHabitacion.setText("");
        jtfNombreClienteHabitacion.setText("");
        jtfApellidosClienteHabitacion.setText("");
        jtfDireccionClienteHabitacion.setText("");
        jtfFechaEntradaHabitacion.setText("");
        jtfFechaSalidaHabitacion.setText("");
        for(contador=0; contador<arrayEtiquetas.length; contador++) {
            if(arrayEtiquetas[contador].getBackground().getRed() == 255) {
                modeloListaHabitaciones.addElement(arrayEtiquetas[contador].getText());
            }//if
        }//for
    }//actualizarListaHabitaciones

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAceptarCategoria;
    private javax.swing.JButton jbAceptarCliente;
    private javax.swing.JButton jbCancelarCategoria;
    private javax.swing.JButton jbCancelarCliente;
    private javax.swing.JButton jbCargar;
    private javax.swing.JButton jbEliminarCategoria;
    private javax.swing.JButton jbEliminarCliente;
    private javax.swing.JButton jbModificarCategoria;
    private javax.swing.JButton jbModificarCliente;
    private javax.swing.JButton jbNuevaCategoria;
    private javax.swing.JButton jbNuevoCliente;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox jcbNHabitacionCliente;
    private javax.swing.JLabel jl101;
    private javax.swing.JLabel jl102;
    private javax.swing.JLabel jl103;
    private javax.swing.JLabel jl104;
    private javax.swing.JLabel jl105;
    private javax.swing.JLabel jl106;
    private javax.swing.JLabel jl107;
    private javax.swing.JLabel jl108;
    private javax.swing.JLabel jl109;
    private javax.swing.JLabel jl110;
    private javax.swing.JLabel jl111;
    private javax.swing.JLabel jl112;
    private javax.swing.JLabel jl113;
    private javax.swing.JLabel jl114;
    private javax.swing.JLabel jl115;
    private javax.swing.JLabel jl116;
    private javax.swing.JLabel jl117;
    private javax.swing.JLabel jl118;
    private javax.swing.JLabel jl119;
    private javax.swing.JLabel jl120;
    private javax.swing.JLabel jl201;
    private javax.swing.JLabel jl202;
    private javax.swing.JLabel jl203;
    private javax.swing.JLabel jl204;
    private javax.swing.JLabel jl205;
    private javax.swing.JLabel jl206;
    private javax.swing.JLabel jl207;
    private javax.swing.JLabel jl208;
    private javax.swing.JLabel jl209;
    private javax.swing.JLabel jl210;
    private javax.swing.JLabel jl211;
    private javax.swing.JLabel jl212;
    private javax.swing.JLabel jl213;
    private javax.swing.JLabel jl214;
    private javax.swing.JLabel jl215;
    private javax.swing.JLabel jl216;
    private javax.swing.JLabel jl217;
    private javax.swing.JLabel jl218;
    private javax.swing.JLabel jl219;
    private javax.swing.JLabel jl220;
    private javax.swing.JLabel jl301;
    private javax.swing.JLabel jl302;
    private javax.swing.JLabel jl303;
    private javax.swing.JLabel jl304;
    private javax.swing.JLabel jl305;
    private javax.swing.JLabel jl306;
    private javax.swing.JLabel jl307;
    private javax.swing.JLabel jl308;
    private javax.swing.JLabel jl309;
    private javax.swing.JLabel jl310;
    private javax.swing.JLabel jl311;
    private javax.swing.JLabel jl312;
    private javax.swing.JLabel jl313;
    private javax.swing.JLabel jl314;
    private javax.swing.JLabel jl315;
    private javax.swing.JLabel jl316;
    private javax.swing.JLabel jl317;
    private javax.swing.JLabel jl318;
    private javax.swing.JLabel jl319;
    private javax.swing.JLabel jl320;
    private javax.swing.JLabel jl401;
    private javax.swing.JLabel jl402;
    private javax.swing.JLabel jl403;
    private javax.swing.JLabel jl404;
    private javax.swing.JLabel jl405;
    private javax.swing.JLabel jl406;
    private javax.swing.JLabel jl407;
    private javax.swing.JLabel jl408;
    private javax.swing.JLabel jl409;
    private javax.swing.JLabel jl410;
    private javax.swing.JLabel jl411;
    private javax.swing.JLabel jl412;
    private javax.swing.JLabel jl413;
    private javax.swing.JLabel jl414;
    private javax.swing.JLabel jl415;
    private javax.swing.JLabel jl416;
    private javax.swing.JLabel jl417;
    private javax.swing.JLabel jl418;
    private javax.swing.JLabel jl419;
    private javax.swing.JLabel jl420;
    private javax.swing.JLabel jlApellidosCliente;
    private javax.swing.JLabel jlApellidosClienteHabitacion;
    private javax.swing.JLabel jlCategoriaHabitacion;
    private javax.swing.JLabel jlDNICliente;
    private javax.swing.JLabel jlDNIClienteHabitacion;
    private javax.swing.JLabel jlDatosHabitacion;
    private javax.swing.JLabel jlDescripcionCategoria;
    private javax.swing.JLabel jlDireccionCliente;
    private javax.swing.JLabel jlDireccionClienteHabitacion;
    private javax.swing.JLabel jlFechaEntrada;
    private javax.swing.JLabel jlFechaEntradaHabitacion;
    private javax.swing.JLabel jlFechaSalida;
    private javax.swing.JLabel jlFechaSalidaHabitacion;
    private javax.swing.JLabel jlFormatoEntrada;
    private javax.swing.JLabel jlFormatoSalida;
    private javax.swing.JLabel jlListaCategorias;
    private javax.swing.JLabel jlListaClientes;
    private javax.swing.JLabel jlListaHabitaciones;
    private javax.swing.JLabel jlNHabitacion;
    private javax.swing.JLabel jlNombreCategoria;
    private javax.swing.JLabel jlNombreCliente;
    private javax.swing.JLabel jlNombreClienteHabitacion;
    private javax.swing.JLabel jlPlanta1;
    private javax.swing.JLabel jlPlanta2;
    private javax.swing.JLabel jlPlanta3;
    private javax.swing.JLabel jlPlanta4;
    private javax.swing.JLabel jlPrecioCategoria;
    private javax.swing.JLabel jlPrecioHabitacion;
    private javax.swing.JList jlstListaCategorias;
    private javax.swing.JList jlstListaClientes;
    private javax.swing.JList jlstListaHabitaciones;
    private javax.swing.JMenu jmArchivo;
    private javax.swing.JMenu jmAyuda;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiAcerca;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JPanel jpBaseDatos;
    private javax.swing.JPanel jpBorde;
    private javax.swing.JPanel jpCategoriasPrecios;
    private javax.swing.JPanel jpClientes;
    private javax.swing.JPanel jpDatosCategoria;
    private javax.swing.JPanel jpDatosCliente;
    private javax.swing.JPanel jpDatosClienteHabitacion;
    private javax.swing.JPanel jpDatosHabitacion;
    private javax.swing.JPanel jpGHabitaciones;
    private javax.swing.JPanel jpHabitaciones;
    private javax.swing.JPanel jpPlanta1;
    private javax.swing.JPanel jpPlanta2;
    private javax.swing.JPanel jpPlanta3;
    private javax.swing.JPanel jpPlanta4;
    private javax.swing.JScrollPane jspListaClientes;
    private javax.swing.JScrollPane jspListaHabitaciones;
    private javax.swing.JScrollPane jspListacategorias;
    private javax.swing.JTextField jtfApellido1Cliente;
    private javax.swing.JTextField jtfApellido2Cliente;
    private javax.swing.JTextField jtfApellidosClienteHabitacion;
    private javax.swing.JTextField jtfCategoriaHabitacion;
    private javax.swing.JTextField jtfDNICliente;
    private javax.swing.JTextField jtfDNIClienteHabitacion;
    private javax.swing.JTextField jtfDescripcionCategoria;
    private javax.swing.JTextField jtfDireccionCliente;
    private javax.swing.JTextField jtfDireccionClienteHabitacion;
    private javax.swing.JTextField jtfFechaEntrada;
    private javax.swing.JTextField jtfFechaEntradaHabitacion;
    private javax.swing.JTextField jtfFechaSalida;
    private javax.swing.JTextField jtfFechaSalidaHabitacion;
    private javax.swing.JTextField jtfNHabitacionCliente;
    private javax.swing.JTextField jtfNombreCategoria;
    private javax.swing.JTextField jtfNombreCliente;
    private javax.swing.JTextField jtfNombreClienteHabitacion;
    private javax.swing.JTextField jtfPrecioCategoria;
    private javax.swing.JTextField jtfPrecioHabitacion;
    private javax.swing.JTabbedPane jtpContenedor;
    // End of variables declaration//GEN-END:variables
    
}//VHotel
