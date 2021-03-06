package calculadoracientifica;

import java.io.Serializable;
import org.mariuszgromada.math.mxparser.*;
/**
 *
 * @author rdo4
 */
public class Calculadora extends javax.swing.JPanel implements Serializable{

    private StringBuilder pantalla;
    private String resultado;
    private boolean activado = true;
    private Expression operacion;

    public Calculadora() {
        initComponents();
        pantalla = new StringBuilder();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelResultado = new javax.swing.JPanel();
        TextFieldInput = new javax.swing.JTextField();
        TextFieldOutput = new javax.swing.JTextField();
        PanelBotones = new javax.swing.JPanel();
        BotonAns = new javax.swing.JButton();
        BotonDel = new javax.swing.JButton();
        BotonAC = new javax.swing.JButton();
        ComboDR = new javax.swing.JComboBox<>();
        BotonAbsoluto = new javax.swing.JButton();
        BotonBase10 = new javax.swing.JButton();
        BotonSeno = new javax.swing.JButton();
        BotonInvSeno = new javax.swing.JButton();
        BotonSenoHiper = new javax.swing.JButton();
        Boton7 = new javax.swing.JButton();
        Boton8 = new javax.swing.JButton();
        Boton9 = new javax.swing.JButton();
        BotonSuma = new javax.swing.JButton();
        BotonPI = new javax.swing.JButton();
        BotonEuler = new javax.swing.JButton();
        BotonCoseno = new javax.swing.JButton();
        BotonInvCoseno = new javax.swing.JButton();
        BotonCosHiper = new javax.swing.JButton();
        Boton4 = new javax.swing.JButton();
        Boton5 = new javax.swing.JButton();
        Boton6 = new javax.swing.JButton();
        BotonResta = new javax.swing.JButton();
        BotonCuadrado = new javax.swing.JButton();
        BotonPotenciaN = new javax.swing.JButton();
        BotonTangente = new javax.swing.JButton();
        BotonInvTangente = new javax.swing.JButton();
        BotonTanHiper = new javax.swing.JButton();
        Boton1 = new javax.swing.JButton();
        Boton2 = new javax.swing.JButton();
        Boton3 = new javax.swing.JButton();
        BotonMultiplicaion = new javax.swing.JButton();
        BotonRaiz = new javax.swing.JButton();
        BotonFactorial = new javax.swing.JButton();
        BotonLog = new javax.swing.JButton();
        BotonLog2 = new javax.swing.JButton();
        BotonLogN = new javax.swing.JButton();
        BotonPunto = new javax.swing.JButton();
        Boton0 = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        BotonDivision = new javax.swing.JButton();
        BotonComa = new javax.swing.JButton();
        BotonParIzq = new javax.swing.JButton();
        BotonParDer = new javax.swing.JButton();
        BotonLn = new javax.swing.JButton();
        BotonResiduo = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));
        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        PanelResultado.setBackground(new java.awt.Color(79, 92, 103));
        PanelResultado.setMinimumSize(new java.awt.Dimension(600, 150));
        PanelResultado.setPreferredSize(new java.awt.Dimension(600, 150));
        PanelResultado.setLayout(new java.awt.GridLayout(2, 0));

        TextFieldInput.setBackground(new java.awt.Color(79, 92, 103));
        TextFieldInput.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        TextFieldInput.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldInput.setBorder(null);
        PanelResultado.add(TextFieldInput);

        TextFieldOutput.setEditable(false);
        TextFieldOutput.setBackground(new java.awt.Color(79, 92, 103));
        TextFieldOutput.setForeground(new java.awt.Color(255, 255, 255));
        TextFieldOutput.setBorder(null);
        PanelResultado.add(TextFieldOutput);

        add(PanelResultado);

        PanelBotones.setBackground(new java.awt.Color(79, 92, 103));
        PanelBotones.setMinimumSize(new java.awt.Dimension(600, 244));
        PanelBotones.setLayout(new java.awt.GridLayout(5, 9));

        BotonAns.setBackground(new java.awt.Color(54, 67, 82));
        BotonAns.setForeground(new java.awt.Color(255, 255, 255));
        BotonAns.setText("Ans");
        BotonAns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAnsActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonAns);

        BotonDel.setBackground(new java.awt.Color(54, 67, 82));
        BotonDel.setForeground(new java.awt.Color(255, 255, 255));
        BotonDel.setText("Del");
        BotonDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDelActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonDel);

        BotonAC.setBackground(new java.awt.Color(54, 67, 82));
        BotonAC.setForeground(new java.awt.Color(255, 51, 51));
        BotonAC.setText("AC");
        BotonAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonACActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonAC);

        ComboDR.setBackground(new java.awt.Color(54, 67, 82));
        ComboDR.setForeground(new java.awt.Color(255, 255, 255));
        ComboDR.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Degrees", "Radians" }));
        PanelBotones.add(ComboDR);

        BotonAbsoluto.setBackground(new java.awt.Color(50, 45, 50));
        BotonAbsoluto.setForeground(new java.awt.Color(255, 255, 255));
        BotonAbsoluto.setText("| x |");
        BotonAbsoluto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAbsolutoActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonAbsoluto);

        BotonBase10.setBackground(new java.awt.Color(50, 45, 50));
        BotonBase10.setForeground(new java.awt.Color(255, 255, 255));
        BotonBase10.setText("10^n");
        BotonBase10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBase10ActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonBase10);

        BotonSeno.setBackground(new java.awt.Color(50, 45, 50));
        BotonSeno.setForeground(new java.awt.Color(255, 255, 255));
        BotonSeno.setText("sen");
        BotonSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSenoActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonSeno);

        BotonInvSeno.setBackground(new java.awt.Color(50, 45, 50));
        BotonInvSeno.setForeground(new java.awt.Color(255, 255, 255));
        BotonInvSeno.setText("sen????");
        BotonInvSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInvSenoActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonInvSeno);

        BotonSenoHiper.setBackground(new java.awt.Color(50, 45, 50));
        BotonSenoHiper.setForeground(new java.awt.Color(255, 255, 255));
        BotonSenoHiper.setText("senh");
        BotonSenoHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSenoHiperActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonSenoHiper);

        Boton7.setBackground(new java.awt.Color(90, 106, 124));
        Boton7.setForeground(new java.awt.Color(255, 255, 255));
        Boton7.setText("7");
        Boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton7ActionPerformed(evt);
            }
        });
        PanelBotones.add(Boton7);

        Boton8.setBackground(new java.awt.Color(90, 106, 124));
        Boton8.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Boton8.setForeground(new java.awt.Color(255, 255, 255));
        Boton8.setText("8");
        Boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton8ActionPerformed(evt);
            }
        });
        PanelBotones.add(Boton8);

        Boton9.setBackground(new java.awt.Color(90, 106, 124));
        Boton9.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Boton9.setForeground(new java.awt.Color(255, 255, 255));
        Boton9.setText("9");
        Boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton9ActionPerformed(evt);
            }
        });
        PanelBotones.add(Boton9);

        BotonSuma.setBackground(new java.awt.Color(54, 67, 82));
        BotonSuma.setForeground(new java.awt.Color(255, 255, 255));
        BotonSuma.setText("+");
        BotonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumaActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonSuma);

        BotonPI.setBackground(new java.awt.Color(50, 45, 50));
        BotonPI.setForeground(new java.awt.Color(255, 255, 255));
        BotonPI.setText("??");
        BotonPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPIActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonPI);

        BotonEuler.setBackground(new java.awt.Color(50, 45, 50));
        BotonEuler.setForeground(new java.awt.Color(255, 255, 255));
        BotonEuler.setText("e");
        BotonEuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEulerActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonEuler);

        BotonCoseno.setBackground(new java.awt.Color(50, 45, 50));
        BotonCoseno.setForeground(new java.awt.Color(255, 255, 255));
        BotonCoseno.setText("cos");
        BotonCoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCosenoActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonCoseno);

        BotonInvCoseno.setBackground(new java.awt.Color(50, 45, 50));
        BotonInvCoseno.setForeground(new java.awt.Color(255, 255, 255));
        BotonInvCoseno.setText("cos????");
        BotonInvCoseno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInvCosenoActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonInvCoseno);

        BotonCosHiper.setBackground(new java.awt.Color(50, 45, 50));
        BotonCosHiper.setForeground(new java.awt.Color(255, 255, 255));
        BotonCosHiper.setText("cosh");
        BotonCosHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCosHiperActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonCosHiper);

        Boton4.setBackground(new java.awt.Color(90, 106, 124));
        Boton4.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Boton4.setForeground(new java.awt.Color(255, 255, 255));
        Boton4.setText("4");
        Boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton4ActionPerformed(evt);
            }
        });
        PanelBotones.add(Boton4);

        Boton5.setBackground(new java.awt.Color(90, 106, 124));
        Boton5.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Boton5.setForeground(new java.awt.Color(255, 255, 255));
        Boton5.setText("5");
        Boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton5ActionPerformed(evt);
            }
        });
        PanelBotones.add(Boton5);

        Boton6.setBackground(new java.awt.Color(90, 106, 124));
        Boton6.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Boton6.setForeground(new java.awt.Color(255, 255, 255));
        Boton6.setText("6");
        Boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton6ActionPerformed(evt);
            }
        });
        PanelBotones.add(Boton6);

        BotonResta.setBackground(new java.awt.Color(54, 67, 82));
        BotonResta.setForeground(new java.awt.Color(255, 255, 255));
        BotonResta.setText("-");
        BotonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRestaActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonResta);

        BotonCuadrado.setBackground(new java.awt.Color(50, 45, 50));
        BotonCuadrado.setForeground(new java.awt.Color(255, 255, 255));
        BotonCuadrado.setText("x??");
        BotonCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCuadradoActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonCuadrado);

        BotonPotenciaN.setBackground(new java.awt.Color(50, 45, 50));
        BotonPotenciaN.setForeground(new java.awt.Color(255, 255, 255));
        BotonPotenciaN.setText("x^n");
        BotonPotenciaN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPotenciaNActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonPotenciaN);

        BotonTangente.setBackground(new java.awt.Color(50, 45, 50));
        BotonTangente.setForeground(new java.awt.Color(255, 255, 255));
        BotonTangente.setText("tan");
        BotonTangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTangenteActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonTangente);

        BotonInvTangente.setBackground(new java.awt.Color(50, 45, 50));
        BotonInvTangente.setForeground(new java.awt.Color(255, 255, 255));
        BotonInvTangente.setText("tan????");
        BotonInvTangente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInvTangenteActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonInvTangente);

        BotonTanHiper.setBackground(new java.awt.Color(50, 45, 50));
        BotonTanHiper.setForeground(new java.awt.Color(255, 255, 255));
        BotonTanHiper.setText("tanh");
        BotonTanHiper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTanHiperActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonTanHiper);

        Boton1.setBackground(new java.awt.Color(90, 106, 124));
        Boton1.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Boton1.setForeground(new java.awt.Color(255, 255, 255));
        Boton1.setText("1");
        Boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton1ActionPerformed(evt);
            }
        });
        PanelBotones.add(Boton1);

        Boton2.setBackground(new java.awt.Color(90, 106, 124));
        Boton2.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Boton2.setForeground(new java.awt.Color(255, 255, 255));
        Boton2.setText("2");
        Boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton2ActionPerformed(evt);
            }
        });
        PanelBotones.add(Boton2);

        Boton3.setBackground(new java.awt.Color(90, 106, 124));
        Boton3.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Boton3.setForeground(new java.awt.Color(255, 255, 255));
        Boton3.setText("3");
        Boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton3ActionPerformed(evt);
            }
        });
        PanelBotones.add(Boton3);

        BotonMultiplicaion.setBackground(new java.awt.Color(54, 67, 82));
        BotonMultiplicaion.setForeground(new java.awt.Color(255, 255, 255));
        BotonMultiplicaion.setText("??");
        BotonMultiplicaion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMultiplicaionActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonMultiplicaion);

        BotonRaiz.setBackground(new java.awt.Color(50, 45, 50));
        BotonRaiz.setForeground(new java.awt.Color(255, 255, 255));
        BotonRaiz.setText("???");
        BotonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRaizActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonRaiz);

        BotonFactorial.setBackground(new java.awt.Color(50, 45, 50));
        BotonFactorial.setForeground(new java.awt.Color(255, 255, 255));
        BotonFactorial.setText("x!");
        BotonFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFactorialActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonFactorial);

        BotonLog.setBackground(new java.awt.Color(50, 45, 50));
        BotonLog.setForeground(new java.awt.Color(255, 255, 255));
        BotonLog.setText("log10");
        BotonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLogActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonLog);

        BotonLog2.setBackground(new java.awt.Color(50, 45, 50));
        BotonLog2.setForeground(new java.awt.Color(255, 255, 255));
        BotonLog2.setText("log2");
        BotonLog2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLog2ActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonLog2);

        BotonLogN.setBackground(new java.awt.Color(50, 45, 50));
        BotonLogN.setForeground(new java.awt.Color(255, 255, 255));
        BotonLogN.setText("logn");
        BotonLogN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLogNActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonLogN);

        BotonPunto.setBackground(new java.awt.Color(54, 67, 82));
        BotonPunto.setForeground(new java.awt.Color(255, 255, 255));
        BotonPunto.setText(".");
        BotonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPuntoActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonPunto);

        Boton0.setBackground(new java.awt.Color(90, 106, 124));
        Boton0.setFont(new java.awt.Font("Roboto", 0, 15)); // NOI18N
        Boton0.setForeground(new java.awt.Color(255, 255, 255));
        Boton0.setText("0");
        Boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton0ActionPerformed(evt);
            }
        });
        PanelBotones.add(Boton0);

        BotonIgual.setBackground(new java.awt.Color(255, 90, 90));
        BotonIgual.setForeground(new java.awt.Color(255, 255, 255));
        BotonIgual.setText("=");
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonIgual);

        BotonDivision.setBackground(new java.awt.Color(54, 67, 82));
        BotonDivision.setForeground(new java.awt.Color(255, 255, 255));
        BotonDivision.setText("??");
        BotonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDivisionActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonDivision);

        BotonComa.setBackground(new java.awt.Color(50, 45, 50));
        BotonComa.setForeground(new java.awt.Color(255, 255, 255));
        BotonComa.setText(",");
        BotonComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonComaActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonComa);

        BotonParIzq.setBackground(new java.awt.Color(50, 45, 50));
        BotonParIzq.setForeground(new java.awt.Color(255, 255, 255));
        BotonParIzq.setText("(");
        BotonParIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonParIzqActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonParIzq);

        BotonParDer.setBackground(new java.awt.Color(50, 45, 50));
        BotonParDer.setForeground(new java.awt.Color(255, 255, 255));
        BotonParDer.setText(")");
        BotonParDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonParDerActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonParDer);

        BotonLn.setBackground(new java.awt.Color(50, 45, 50));
        BotonLn.setForeground(new java.awt.Color(255, 255, 255));
        BotonLn.setText("ln");
        BotonLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLnActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonLn);

        BotonResiduo.setBackground(new java.awt.Color(50, 45, 50));
        BotonResiduo.setForeground(new java.awt.Color(255, 255, 255));
        BotonResiduo.setText("mod");
        BotonResiduo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResiduoActionPerformed(evt);
            }
        });
        PanelBotones.add(BotonResiduo);

        add(PanelBotones);
    }// </editor-fold>//GEN-END:initComponents

    private void BotonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLogActionPerformed
        addNumberAndOperation("log10(");
        activado = true;
    }//GEN-LAST:event_BotonLogActionPerformed

    private void Boton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton4ActionPerformed
        addNumberAndOperation("4");
        activado = true;
    }//GEN-LAST:event_Boton4ActionPerformed

    private void BotonEulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEulerActionPerformed
        addNumberAndOperation("e");
        activado = true;
    }//GEN-LAST:event_BotonEulerActionPerformed

    private void Boton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton6ActionPerformed
        addNumberAndOperation("6");
        activado = true;
    }//GEN-LAST:event_Boton6ActionPerformed

    private void BotonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRestaActionPerformed
        if (activado == true) {
            addNumberAndOperation("-");
            activado = false;
        }
    }//GEN-LAST:event_BotonRestaActionPerformed

    private void BotonMultiplicaionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMultiplicaionActionPerformed
        if (activado == true) {
            addNumberAndOperation("*");
            activado =false;
        }
    }//GEN-LAST:event_BotonMultiplicaionActionPerformed

    private void Boton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton8ActionPerformed
        addNumberAndOperation("8");
        activado = true;
    }//GEN-LAST:event_Boton8ActionPerformed

    private void BotonTangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTangenteActionPerformed
        addNumberAndOperation("tan(");
        activado = true;
    }//GEN-LAST:event_BotonTangenteActionPerformed

    private void BotonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRaizActionPerformed
        addNumberAndOperation("sqrt(");
        activado = true;
    }//GEN-LAST:event_BotonRaizActionPerformed

    private void BotonACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonACActionPerformed
        TextFieldInput.setText("");
        TextFieldOutput.setText("");
        pantalla.setLength(0);
    }//GEN-LAST:event_BotonACActionPerformed

    private void Boton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton1ActionPerformed
        addNumberAndOperation("1");
        activado = true;
    }//GEN-LAST:event_Boton1ActionPerformed

    private void Boton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton2ActionPerformed
        addNumberAndOperation("2");
        activado = true;
    }//GEN-LAST:event_Boton2ActionPerformed

    private void Boton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton3ActionPerformed
        addNumberAndOperation("3");
        activado = true;
    }//GEN-LAST:event_Boton3ActionPerformed

    private void Boton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton5ActionPerformed
        addNumberAndOperation("5");
        activado = true;
        
    }//GEN-LAST:event_Boton5ActionPerformed

    private void Boton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton7ActionPerformed
        addNumberAndOperation("7");
        activado = true;
        
    }//GEN-LAST:event_Boton7ActionPerformed

    private void Boton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton9ActionPerformed
        addNumberAndOperation("9");
        activado = true;
        
    }//GEN-LAST:event_Boton9ActionPerformed

    private void Boton0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton0ActionPerformed
        
        addNumberAndOperation("0");
        activado = true;
            

    }//GEN-LAST:event_Boton0ActionPerformed

    private void BotonAnsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAnsActionPerformed
        if (!resultado.equals("")){
            addNumberAndOperation(resultado);
            TextFieldInput.setText(resultado);
          
        } 
    }//GEN-LAST:event_BotonAnsActionPerformed

    private void BotonDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDelActionPerformed
        if (pantalla.length() > 0) {
            String nuevaPantalla = pantalla.substring(0, pantalla.length() - 1);
            pantalla.setLength(0);
            pantalla.append(nuevaPantalla);
            TextFieldInput.setText(pantalla.toString());
        }
    }//GEN-LAST:event_BotonDelActionPerformed

    private void BotonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPuntoActionPerformed
        if (activado == true) {
            addNumberAndOperation(".");
            activado = false;
        }
        
        
    }//GEN-LAST:event_BotonPuntoActionPerformed

    private void BotonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumaActionPerformed
        if (activado == true) {
            addNumberAndOperation("+");
            activado = false;
        }
    }//GEN-LAST:event_BotonSumaActionPerformed

    private void BotonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDivisionActionPerformed
        if (activado == true) {
            addNumberAndOperation("/");
            activado = false;
        }
    }//GEN-LAST:event_BotonDivisionActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
        if(pantalla.length() > 0){
            System.out.println(pantalla.toString());
            
            operacion = new Expression(pantalla.toString());
            resultado = String.valueOf(operacion.calculate());
            System.out.println("operacion : " + resultado);
            TextFieldOutput.setText(resultado);
//            
            
        }
    }//GEN-LAST:event_BotonIgualActionPerformed

    private void BotonAbsolutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAbsolutoActionPerformed
        addNumberAndOperation("abs(");
        activado = true;
    }//GEN-LAST:event_BotonAbsolutoActionPerformed

    private void BotonBase10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBase10ActionPerformed
        addNumberAndOperation("*10^");
        activado = true;
    }//GEN-LAST:event_BotonBase10ActionPerformed

    private void BotonSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSenoActionPerformed
        addNumberAndOperation("sin(");
        activado = true;
    }//GEN-LAST:event_BotonSenoActionPerformed

    private void BotonPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPIActionPerformed
        addNumberAndOperation("pi");
        activado = true;
    }//GEN-LAST:event_BotonPIActionPerformed

    private void BotonCosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCosenoActionPerformed
        addNumberAndOperation("cos(");
        activado = true;
    }//GEN-LAST:event_BotonCosenoActionPerformed

    private void BotonCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCuadradoActionPerformed
        addNumberAndOperation("^2");
        activado = true;
    }//GEN-LAST:event_BotonCuadradoActionPerformed

    private void BotonPotenciaNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPotenciaNActionPerformed
        addNumberAndOperation("^");
        activado = true;
    }//GEN-LAST:event_BotonPotenciaNActionPerformed

    private void BotonFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFactorialActionPerformed
        addNumberAndOperation("!");
        activado = true;
    }//GEN-LAST:event_BotonFactorialActionPerformed

    private void BotonParIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonParIzqActionPerformed
        addNumberAndOperation("(");
        activado = true;
    }//GEN-LAST:event_BotonParIzqActionPerformed

    private void BotonParDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonParDerActionPerformed
        addNumberAndOperation(")");
        activado = true;
    }//GEN-LAST:event_BotonParDerActionPerformed

    private void BotonLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLnActionPerformed
        addNumberAndOperation("ln(");
        activado = true;
    }//GEN-LAST:event_BotonLnActionPerformed

    private void BotonInvSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInvSenoActionPerformed
        addNumberAndOperation("asin(");
        activado = true;
    }//GEN-LAST:event_BotonInvSenoActionPerformed

    private void BotonInvCosenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInvCosenoActionPerformed
        addNumberAndOperation("acos(");
        activado = true;
    }//GEN-LAST:event_BotonInvCosenoActionPerformed

    private void BotonInvTangenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInvTangenteActionPerformed
        addNumberAndOperation("atan(");
        activado = true;
    }//GEN-LAST:event_BotonInvTangenteActionPerformed

    private void BotonLog2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLog2ActionPerformed
        addNumberAndOperation("log2(");
        activado = true;
    }//GEN-LAST:event_BotonLog2ActionPerformed

    private void BotonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonComaActionPerformed
        addNumberAndOperation(",");
        activado = true;
    }//GEN-LAST:event_BotonComaActionPerformed

    private void BotonSenoHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSenoHiperActionPerformed
        addNumberAndOperation("sinh(");
        activado = true;
    }//GEN-LAST:event_BotonSenoHiperActionPerformed

    private void BotonCosHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCosHiperActionPerformed
        addNumberAndOperation("cosh(");
        activado = true;
    }//GEN-LAST:event_BotonCosHiperActionPerformed

    private void BotonTanHiperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTanHiperActionPerformed
        addNumberAndOperation("tanh(");
        activado = true;
    }//GEN-LAST:event_BotonTanHiperActionPerformed

    private void BotonLogNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLogNActionPerformed
        addNumberAndOperation("log(");
        activado = true;
    }//GEN-LAST:event_BotonLogNActionPerformed

    private void BotonResiduoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResiduoActionPerformed
        addNumberAndOperation("mod(");
        activado = true;
    }//GEN-LAST:event_BotonResiduoActionPerformed

  
    private void addNumberAndOperation(String valor){
        if(TextFieldInput.getText().equals("")){
            pantalla.setLength(0);
            System.out.println("i am here");
        } 
        pantalla.append(valor);
        TextFieldInput.setText(pantalla.toString());
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton0;
    private javax.swing.JButton Boton1;
    private javax.swing.JButton Boton2;
    private javax.swing.JButton Boton3;
    private javax.swing.JButton Boton4;
    private javax.swing.JButton Boton5;
    private javax.swing.JButton Boton6;
    private javax.swing.JButton Boton7;
    private javax.swing.JButton Boton8;
    private javax.swing.JButton Boton9;
    private javax.swing.JButton BotonAC;
    private javax.swing.JButton BotonAbsoluto;
    private javax.swing.JButton BotonAns;
    private javax.swing.JButton BotonBase10;
    private javax.swing.JButton BotonComa;
    private javax.swing.JButton BotonCosHiper;
    private javax.swing.JButton BotonCoseno;
    private javax.swing.JButton BotonCuadrado;
    private javax.swing.JButton BotonDel;
    private javax.swing.JButton BotonDivision;
    private javax.swing.JButton BotonEuler;
    private javax.swing.JButton BotonFactorial;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonInvCoseno;
    private javax.swing.JButton BotonInvSeno;
    private javax.swing.JButton BotonInvTangente;
    private javax.swing.JButton BotonLn;
    private javax.swing.JButton BotonLog;
    private javax.swing.JButton BotonLog2;
    private javax.swing.JButton BotonLogN;
    private javax.swing.JButton BotonMultiplicaion;
    private javax.swing.JButton BotonPI;
    private javax.swing.JButton BotonParDer;
    private javax.swing.JButton BotonParIzq;
    private javax.swing.JButton BotonPotenciaN;
    private javax.swing.JButton BotonPunto;
    private javax.swing.JButton BotonRaiz;
    private javax.swing.JButton BotonResiduo;
    private javax.swing.JButton BotonResta;
    private javax.swing.JButton BotonSeno;
    private javax.swing.JButton BotonSenoHiper;
    private javax.swing.JButton BotonSuma;
    private javax.swing.JButton BotonTanHiper;
    private javax.swing.JButton BotonTangente;
    private javax.swing.JComboBox<String> ComboDR;
    private javax.swing.JPanel PanelBotones;
    private javax.swing.JPanel PanelResultado;
    private javax.swing.JTextField TextFieldInput;
    private javax.swing.JTextField TextFieldOutput;
    // End of variables declaration//GEN-END:variables
}
