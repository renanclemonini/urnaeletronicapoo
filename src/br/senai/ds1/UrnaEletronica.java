package br.senai.ds1;

import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Renan
 */
public class UrnaEletronica extends javax.swing.JFrame {

    
    public UrnaEletronica() {
        initComponents();
    }
    
    Candidato c1 = new Candidato("Lula","Geraldo",13,"PT");
    Candidato c2 = new Candidato("Bolsonaro","General Heleno",22,"PL");
    Candidato c3 = new Candidato("Ciro","Ana Paula",12,"PDT");
    Candidato votoBranco = new Candidato("Voto em Branco",0);
    Candidato votoNulo = new Candidato("Voto Nulo", 0);
    
    List<Candidato> listaCandidatos = new ArrayList<>();
    
    public void addLista(){
        listaCandidatos.add(c1);
        listaCandidatos.add(c2);
        listaCandidatos.add(c3);
        listaCandidatos.add(votoBranco);
        listaCandidatos.add(votoNulo);
    }
    
    public void setVotos(Candidato candidato){
        candidato.setVotos(candidato.getVotos()+1);
    }
    
    ImageIcon lula = new ImageIcon("C:\\Users\\rclem\\Pictures\\fotosurna\\lula107x150.jpg");
    ImageIcon geraldo = new ImageIcon("C:\\Users\\rclem\\Pictures\\fotosurna\\geraldo107x150.jpg");
    ImageIcon ciro = new ImageIcon("C:\\Users\\rclem\\Pictures\\fotosurna\\ciro107x150.jpg");
    ImageIcon anapaula = new ImageIcon("C:\\Users\\rclem\\Pictures\\fotosurna\\anapaula107x150.jpeg");
    ImageIcon bolsonaro = new ImageIcon("C:\\Users\\rclem\\Pictures\\fotosurna\\bolsonaro107x150.jpeg");
    ImageIcon braganeto = new ImageIcon("C:\\Users\\rclem\\Pictures\\fotosurna\\braganeto107x150.jpeg");
    
    public void settarTextos(){
        if(txtNumero.getText().equals("12")){
            lblNome.setText(c3.getNome());
            lblPartido.setText(c3.getPartido());
            lblVice.setText(c3.getVice());
            lblFotoPresidente.setIcon(ciro);
            lblFotoVice.setIcon(anapaula);
            lblExibicao.setText("Digite confirma para computar seu voto!");
        }else if(txtNumero.getText().equals("13")){
            lblNome.setText(c1.getNome());
            lblPartido.setText(c1.getPartido());
            lblVice.setText(c1.getVice());
            lblFotoPresidente.setIcon(lula);
            lblFotoVice.setIcon(geraldo);
            lblExibicao.setText("Digite confirma para computar seu voto!");
        }else if(txtNumero.getText().equals("22")){
            lblNome.setText(c2.getNome());
            lblPartido.setText(c2.getPartido());
            lblVice.setText(c2.getVice());
            lblFotoPresidente.setIcon(bolsonaro);
            lblFotoVice.setIcon(braganeto);
            lblExibicao.setText("Digite confirma para computar seu voto!");
        }else if(txtNumero.getText().equals("Branco")){
            lblNome.setText("Voto em Branco");
            lblPartido.setText("---");
            lblVice.setText("---");
            lblExibicao.setText("Digite confirma para computar seu voto!");
        }else if(txtNumero.getText().equals("00")){
            lblNome.setText("Voto nulo");
            lblPartido.setText("---");
            lblVice.setText("---");
            lblExibicao.setText("Digite confirma para computar seu voto!");
        }
    }
    
    public void settarVotos(){
        if(txtNumero.getText().equals("12")){
            setVotos(c3);
            lblExibicao.setText("Obrigado por exercer seu direito!");
            JOptionPane.showMessageDialog(null, "Voto em " + c3.getNome() + " computado com sucesso!");
            lblExibicao.setText("Digite o numero e após confirmação dos dados pressione confirma para computar o voto.");
        }else if(txtNumero.getText().equals("13")){
            setVotos(c1);
            lblExibicao.setText("Obrigado por exercer seu direito!");
            JOptionPane.showMessageDialog(null, "Voto em " + c1.getNome() + " computado com sucesso!");
            lblExibicao.setText("Digite o numero e após confirmação dos dados pressione confirma para computar o voto.");
        }else if(txtNumero.getText().equals("22")){
            setVotos(c2);
            lblExibicao.setText("Obrigado por exercer seu direito!");
            JOptionPane.showMessageDialog(null, "Voto em " + c2.getNome() + " computado com sucesso!");
            lblExibicao.setText("Digite o numero e após confirmação dos dados pressione confirma para computar o voto.");
        }else if(txtNumero.getText().equals("Branco")){
            setVotos(votoBranco);
            lblExibicao.setText("Obrigado por exercer seu direito!");
            JOptionPane.showMessageDialog(null, "Voto em branco computado com sucesso!");
            lblExibicao.setText("Digite o numero e após confirmação dos dados pressione confirma para computar o voto.");
        }else if(txtNumero.getText().equals("00")){
            setVotos(votoNulo);
            lblExibicao.setText("Obrigado por exercer seu direito!");
            JOptionPane.showMessageDialog(null, "Voto nulo computado com sucesso!");
            lblExibicao.setText("Digite o numero e após confirmação dos dados pressione confirma para computar o voto.");
        }
    }
    
    public void limparTelas(){
        txtNumero.setText("");
        lblNome.setText("");
        lblPartido.setText("");
        lblVice.setText("");
        lblFotoPresidente.setIcon(null);
        lblFotoVice.setIcon(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnGeneral = new javax.swing.JPanel();
        pnButtons = new javax.swing.JPanel();
        btnValue7 = new javax.swing.JButton();
        btnValue8 = new javax.swing.JButton();
        btnValue1 = new javax.swing.JButton();
        btnValue9 = new javax.swing.JButton();
        btnValue0 = new javax.swing.JButton();
        btnBranco = new javax.swing.JButton();
        btnValue2 = new javax.swing.JButton();
        btnCorrige = new javax.swing.JButton();
        btnValue3 = new javax.swing.JButton();
        btnConfirma = new javax.swing.JButton();
        btnValue4 = new javax.swing.JButton();
        btnValue5 = new javax.swing.JButton();
        btnValue6 = new javax.swing.JButton();
        pnScreen = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPartido = new javax.swing.JLabel();
        lblVice = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lblExibicao = new javax.swing.JLabel();
        lblFotoPresidente = new javax.swing.JLabel();
        lblFotoVice = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemResultados = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Urna Eletrônica");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        pnGeneral.setBackground(new java.awt.Color(255, 255, 255));
        pnGeneral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        pnButtons.setBackground(new java.awt.Color(0, 0, 0));
        pnButtons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnValue7.setBackground(new java.awt.Color(0, 0, 0));
        btnValue7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnValue7.setForeground(new java.awt.Color(255, 255, 255));
        btnValue7.setText("7");
        btnValue7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue7ActionPerformed(evt);
            }
        });

        btnValue8.setBackground(new java.awt.Color(0, 0, 0));
        btnValue8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnValue8.setForeground(new java.awt.Color(255, 255, 255));
        btnValue8.setText("8");
        btnValue8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue8ActionPerformed(evt);
            }
        });

        btnValue1.setBackground(new java.awt.Color(0, 0, 0));
        btnValue1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnValue1.setForeground(new java.awt.Color(255, 255, 255));
        btnValue1.setText("1");
        btnValue1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValue1MouseClicked(evt);
            }
        });

        btnValue9.setBackground(new java.awt.Color(0, 0, 0));
        btnValue9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnValue9.setForeground(new java.awt.Color(255, 255, 255));
        btnValue9.setText("9");
        btnValue9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue9ActionPerformed(evt);
            }
        });

        btnValue0.setBackground(new java.awt.Color(0, 0, 0));
        btnValue0.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnValue0.setForeground(new java.awt.Color(255, 255, 255));
        btnValue0.setText("0");
        btnValue0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue0ActionPerformed(evt);
            }
        });

        btnBranco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnBranco.setText("Branco");
        btnBranco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrancoActionPerformed(evt);
            }
        });

        btnValue2.setBackground(new java.awt.Color(0, 0, 0));
        btnValue2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnValue2.setForeground(new java.awt.Color(255, 255, 255));
        btnValue2.setText("2");
        btnValue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue2ActionPerformed(evt);
            }
        });

        btnCorrige.setBackground(new java.awt.Color(255, 255, 102));
        btnCorrige.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCorrige.setText("Corrige");
        btnCorrige.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCorrigeMouseClicked(evt);
            }
        });

        btnValue3.setBackground(new java.awt.Color(0, 0, 0));
        btnValue3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnValue3.setForeground(new java.awt.Color(255, 255, 255));
        btnValue3.setText("3");
        btnValue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue3ActionPerformed(evt);
            }
        });

        btnConfirma.setBackground(new java.awt.Color(0, 255, 102));
        btnConfirma.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnConfirma.setText("Confirma");
        btnConfirma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmaActionPerformed(evt);
            }
        });

        btnValue4.setBackground(new java.awt.Color(0, 0, 0));
        btnValue4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnValue4.setForeground(new java.awt.Color(255, 255, 255));
        btnValue4.setText("4");
        btnValue4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue4ActionPerformed(evt);
            }
        });

        btnValue5.setBackground(new java.awt.Color(0, 0, 0));
        btnValue5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnValue5.setForeground(new java.awt.Color(255, 255, 255));
        btnValue5.setText("5");
        btnValue5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue5ActionPerformed(evt);
            }
        });

        btnValue6.setBackground(new java.awt.Color(0, 0, 0));
        btnValue6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnValue6.setForeground(new java.awt.Color(255, 255, 255));
        btnValue6.setText("6");
        btnValue6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValue6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnButtonsLayout = new javax.swing.GroupLayout(pnButtons);
        pnButtons.setLayout(pnButtonsLayout);
        pnButtonsLayout.setHorizontalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsLayout.createSequentialGroup()
                        .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnValue4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnValue7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnValue0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnButtonsLayout.createSequentialGroup()
                                .addComponent(btnValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btnValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnButtonsLayout.createSequentialGroup()
                                .addComponent(btnValue5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btnValue6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnButtonsLayout.createSequentialGroup()
                                .addComponent(btnValue8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btnValue9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsLayout.createSequentialGroup()
                        .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
        );
        pnButtonsLayout.setVerticalGroup(
            pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnButtonsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValue1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValue2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValue3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValue4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValue5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValue6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnValue7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValue8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValue9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(btnValue0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBranco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCorrige, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Número:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nome:");

        lblNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Partido:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vice-Presidente:");

        lblPartido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblVice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        txtNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Presidente");

        lblExibicao.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblExibicao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExibicao.setText("Digite o numero e após confirmação dos dados pressione confirma para computar o voto.");

        lblFotoPresidente.setBackground(new java.awt.Color(204, 204, 255));
        lblFotoPresidente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblFotoVice.setBackground(new java.awt.Color(204, 204, 255));
        lblFotoVice.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout pnScreenLayout = new javax.swing.GroupLayout(pnScreen);
        pnScreen.setLayout(pnScreenLayout);
        pnScreenLayout.setHorizontalGroup(
            pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnScreenLayout.createSequentialGroup()
                .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnScreenLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnScreenLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnScreenLayout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pnScreenLayout.createSequentialGroup()
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnScreenLayout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(pnScreenLayout.createSequentialGroup()
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(pnScreenLayout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblVice, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(24, 24, 24)
                        .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFotoPresidente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFotoVice, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnScreenLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(lblExibicao, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnScreenLayout.setVerticalGroup(
            pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnScreenLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnScreenLayout.createSequentialGroup()
                        .addComponent(lblFotoPresidente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblFotoVice, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnScreenLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(61, 61, 61)
                        .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPartido, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblVice, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(lblExibicao, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Simulador de Urna Eletrônica");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logoJE.png"))); // NOI18N

        javax.swing.GroupLayout pnGeneralLayout = new javax.swing.GroupLayout(pnGeneral);
        pnGeneral.setLayout(pnGeneralLayout);
        pnGeneralLayout.setHorizontalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnGeneralLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnGeneralLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(pnButtons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(pnGeneralLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnGeneralLayout.setVerticalGroup(
            pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGeneralLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addGap(5, 5, 5)
                .addGroup(pnGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnButtons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/page.png"))); // NOI18N
        jMenu1.setText("Resultados");

        itemResultados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/information.png"))); // NOI18N
        itemResultados.setText("Ver Votos");
        itemResultados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemResultadosActionPerformed(evt);
            }
        });
        jMenu1.add(itemResultados);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnValue1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValue1MouseClicked
        // TODO add your handling code here:
        lblExibicao.setText("Digite o numero e após confirmação dos dados pressione confirma para computar o voto.");
        txtNumero.setText(txtNumero.getText() + "1");
        settarTextos();
    }//GEN-LAST:event_btnValue1MouseClicked

    private void btnCorrigeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCorrigeMouseClicked
        // TODO add your handling code here:
        limparTelas();
        lblExibicao.setText("Digite o numero e após confirmação dos dados pressione confirma para computar o voto.");
    }//GEN-LAST:event_btnCorrigeMouseClicked

    private void btnValue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue2ActionPerformed
        // TODO add your handling code here:
        txtNumero.setText(txtNumero.getText() + "2");
        settarTextos();
    }//GEN-LAST:event_btnValue2ActionPerformed

    private void btnValue3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue3ActionPerformed
        // TODO add your handling code here:
        txtNumero.setText(txtNumero.getText() + "3");
        settarTextos();
    }//GEN-LAST:event_btnValue3ActionPerformed

    private void btnValue4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue4ActionPerformed
        // TODO add your handling code here:
        txtNumero.setText(txtNumero.getText() + "4");
        settarTextos();
    }//GEN-LAST:event_btnValue4ActionPerformed

    private void btnValue5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue5ActionPerformed
        // TODO add your handling code here:
        txtNumero.setText(txtNumero.getText() + "5");
        settarTextos();
    }//GEN-LAST:event_btnValue5ActionPerformed

    private void btnValue6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue6ActionPerformed
        // TODO add your handling code here:
        txtNumero.setText(txtNumero.getText() + "6");
        settarTextos();
    }//GEN-LAST:event_btnValue6ActionPerformed

    private void btnValue7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue7ActionPerformed
        // TODO add your handling code here:
        txtNumero.setText(txtNumero.getText() + "7");
        settarTextos();
    }//GEN-LAST:event_btnValue7ActionPerformed

    private void btnValue8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue8ActionPerformed
        // TODO add your handling code here:
        txtNumero.setText(txtNumero.getText() + "8");
        settarTextos();
    }//GEN-LAST:event_btnValue8ActionPerformed

    private void btnValue9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue9ActionPerformed
        // TODO add your handling code here:
        txtNumero.setText(txtNumero.getText() + "9");
        settarTextos();
    }//GEN-LAST:event_btnValue9ActionPerformed

    private void btnValue0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValue0ActionPerformed
        // TODO add your handling code here:
        txtNumero.setText(txtNumero.getText() + "0");
        settarTextos();
    }//GEN-LAST:event_btnValue0ActionPerformed

    private void btnBrancoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrancoActionPerformed
        // TODO add your handling code here:
        txtNumero.setText("Branco");
        settarTextos();
    }//GEN-LAST:event_btnBrancoActionPerformed

    private void btnConfirmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmaActionPerformed
        // TODO add your handling code here:
        settarVotos();
        limparTelas();
        addLista();
    }//GEN-LAST:event_btnConfirmaActionPerformed

    private void itemResultadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemResultadosActionPerformed
        // TODO add your handling code here:
        String str = "";
        if(listaCandidatos.isEmpty()){
            JOptionPane.showMessageDialog(null, "Enesima zerada");
        }else{
            str += "\nCandidato "+c1.getNome()+" possui "+c1.getVotos()+" votos validos.";
            str += "\nCandidato "+c2.getNome()+" possui "+c2.getVotos()+" votos validos.";
            str += "\nCandidato "+c3.getNome()+" possui "+c3.getVotos()+" votos validos.";
            str += "\n Votos em Branco: "+votoBranco.getVotos();
            str += "\n Votos Nulo: "+votoNulo.getVotos();
            JOptionPane.showMessageDialog(null, str);
        }
    }//GEN-LAST:event_itemResultadosActionPerformed

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
            java.util.logging.Logger.getLogger(UrnaEletronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UrnaEletronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UrnaEletronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UrnaEletronica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UrnaEletronica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBranco;
    private javax.swing.JButton btnConfirma;
    private javax.swing.JButton btnCorrige;
    private javax.swing.JButton btnValue0;
    private javax.swing.JButton btnValue1;
    private javax.swing.JButton btnValue2;
    private javax.swing.JButton btnValue3;
    private javax.swing.JButton btnValue4;
    private javax.swing.JButton btnValue5;
    private javax.swing.JButton btnValue6;
    private javax.swing.JButton btnValue7;
    private javax.swing.JButton btnValue8;
    private javax.swing.JButton btnValue9;
    private javax.swing.JMenuItem itemResultados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblExibicao;
    private javax.swing.JLabel lblFotoPresidente;
    private javax.swing.JLabel lblFotoVice;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblPartido;
    private javax.swing.JLabel lblVice;
    private javax.swing.JPanel pnButtons;
    private javax.swing.JPanel pnGeneral;
    private javax.swing.JPanel pnScreen;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
