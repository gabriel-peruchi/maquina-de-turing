package telas;

import entidades.CampoDigitalizacao;
import entidades.EstruturaAcao;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelos.ObjetoModeloTabela;
import utils.Arquivos;

public class TelaPrincipal extends javax.swing.JFrame {

    private ObjetoModeloTabela tabelaObjetos;

    private List<CampoDigitalizacao> campos;
    private List<EstruturaAcao> estruturas;

    public TelaPrincipal() {
        initComponents();

        iniciarCampos();
        instanciarCampos();

        iniciarEstruturas();
        atualizarTabela();
    }

    private void atualizarTabela() {
        this.tabelaObjetos = null;
        this.tabelaObjetos = new ObjetoModeloTabela(this.estruturas);
        this.jTableAlgoritmo.setModel(this.tabelaObjetos);
    }

    private void iniciarCampos() {
        this.campos = null;
        this.campos = new ArrayList<>();
    }

    private void iniciarEstruturas() {
        this.estruturas = null;
        this.estruturas = new ArrayList<>();
    }

    private void instanciarCampos() {

        campos.add(new CampoDigitalizacao(0, jTextField1));
        campos.add(new CampoDigitalizacao(1, jTextField2));
        campos.add(new CampoDigitalizacao(2, jTextField3));
        campos.add(new CampoDigitalizacao(3, jTextField4));
        campos.add(new CampoDigitalizacao(4, jTextField5));
        campos.add(new CampoDigitalizacao(5, jTextField6));
        campos.add(new CampoDigitalizacao(6, jTextField7));
        campos.add(new CampoDigitalizacao(7, jTextField8));
        campos.add(new CampoDigitalizacao(8, jTextField9));
        campos.add(new CampoDigitalizacao(9, jTextField10));
        campos.add(new CampoDigitalizacao(10, jTextField11));
        campos.add(new CampoDigitalizacao(11, jTextField12));
        campos.add(new CampoDigitalizacao(12, jTextField13));
        campos.add(new CampoDigitalizacao(13, jTextField14));
        campos.add(new CampoDigitalizacao(14, jTextField15));
        campos.add(new CampoDigitalizacao(15, jTextField16));
        campos.add(new CampoDigitalizacao(16, jTextField17));
        campos.add(new CampoDigitalizacao(17, jTextField18));
        campos.add(new CampoDigitalizacao(18, jTextField19));
    }

    private void setValoresNaTela(EstruturaAcao obj) {
        
        this.txtEstadoAtual.setText(obj.getEstadoAtual());
        this.txtSimboloLido.setText(obj.getSimboloLido());
        this.txtProxEstado.setText(obj.getProximoEstado());
        this.txtSimbEscrever.setText(obj.getSimboloEscrever());

        if (obj.getDirecao().toUpperCase().equals("D")) {
            this.txtDirecao.setText("Direita");
        } else if (obj.getDirecao().toUpperCase().equals("E")) {
            this.txtDirecao.setText("Esquerda");
        } else {
            this.txtDirecao.setText("Para");
        }

    }

    private void limparValoresNaTela() {
        this.txtEstadoAtual.setText("");
        this.txtSimboloLido.setText("");
        this.txtProxEstado.setText("");
        this.txtSimbEscrever.setText("");
        this.txtDirecao.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelExecucao = new javax.swing.JPanel();
        jScrollPanePainelFita = new javax.swing.JScrollPane();
        jPanelFita = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jPanelInfo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEstadoAtual = new javax.swing.JTextField();
        txtSimboloLido = new javax.swing.JTextField();
        jButtonExecutarAlgoritmo = new javax.swing.JButton();
        jButtonLimparFita = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtSimbEscrever = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtProxEstado = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDirecao = new javax.swing.JTextField();
        cmbSegundos = new javax.swing.JComboBox<>();
        jLabelAtraso = new javax.swing.JLabel();
        jPanelAlgoritmo = new javax.swing.JPanel();
        jScrollPaneTabelaAlgoritmo = new javax.swing.JScrollPane();
        jTableAlgoritmo = new javax.swing.JTable();
        jButtonGravarAlgoritmo = new javax.swing.JButton();
        jButtonAddLinha = new javax.swing.JButton();
        jButtonRemoveLinha = new javax.swing.JButton();
        jButtonBaixar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Máquina de Turing");
        setResizable(false);

        jPanelExecucao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Fita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jScrollPanePainelFita.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPanePainelFita.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPanePainelFita.setPreferredSize(new java.awt.Dimension(799, 54));

        jPanelFita.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelFita.setName(""); // NOI18N
        jPanelFita.setPreferredSize(new java.awt.Dimension(795, 50));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText(">");

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField14.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField15.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField16.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField17.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField18.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField19.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanelFitaLayout = new javax.swing.GroupLayout(jPanelFita);
        jPanelFita.setLayout(jPanelFitaLayout);
        jPanelFitaLayout.setHorizontalGroup(
            jPanelFitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelFitaLayout.setVerticalGroup(
            jPanelFitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jScrollPanePainelFita.setViewportView(jPanelFita);

        jLabel1.setText("Estado atual: ");

        jLabel2.setText("Simbolo lido: ");

        txtEstadoAtual.setEditable(false);
        txtEstadoAtual.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtEstadoAtual.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txtSimboloLido.setEditable(false);
        txtSimboloLido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSimboloLido.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jButtonExecutarAlgoritmo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/run.png"))); // NOI18N
        jButtonExecutarAlgoritmo.setToolTipText("Executar algoritmo");
        jButtonExecutarAlgoritmo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonExecutarAlgoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecutarAlgoritmoActionPerformed(evt);
            }
        });

        jButtonLimparFita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/clear.png"))); // NOI18N
        jButtonLimparFita.setToolTipText("Limpar fita");
        jButtonLimparFita.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLimparFita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparFitaActionPerformed(evt);
            }
        });

        jLabel4.setText("Simbolo escrever: ");

        txtSimbEscrever.setEditable(false);
        txtSimbEscrever.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSimbEscrever.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel3.setText("Próximo estado: ");

        txtProxEstado.setEditable(false);
        txtProxEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtProxEstado.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel5.setText("Direção: ");

        txtDirecao.setEditable(false);
        txtDirecao.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDirecao.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        cmbSegundos.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cmbSegundos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2" }));
        cmbSegundos.setSelectedIndex(1);
        cmbSegundos.setFocusable(false);

        jLabelAtraso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/relogio.png"))); // NOI18N
        jLabelAtraso.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanelInfoLayout = new javax.swing.GroupLayout(jPanelInfo);
        jPanelInfo.setLayout(jPanelInfoLayout);
        jPanelInfoLayout.setHorizontalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSimboloLido, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtEstadoAtual, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSimbEscrever, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtProxEstado))
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanelInfoLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabelAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonExecutarAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonLimparFita, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2))))
        );
        jPanelInfoLayout.setVerticalGroup(
            jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelInfoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtSimboloLido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtProxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEstadoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSimbEscrever, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonLimparFita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExecutarAlgoritmo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelInfoLayout.createSequentialGroup()
                        .addGroup(jPanelInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelAtraso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbSegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11))))
        );

        javax.swing.GroupLayout jPanelExecucaoLayout = new javax.swing.GroupLayout(jPanelExecucao);
        jPanelExecucao.setLayout(jPanelExecucaoLayout);
        jPanelExecucaoLayout.setHorizontalGroup(
            jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                        .addComponent(jScrollPanePainelFita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                        .addComponent(jPanelInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanelExecucaoLayout.setVerticalGroup(
            jPanelExecucaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExecucaoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPanePainelFita, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanelInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelAlgoritmo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Algoritmo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        jTableAlgoritmo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estado Atual", "Simbolo Lido", "Proximo Estado", "Simbolo Escrever", "Direção"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableAlgoritmo.getTableHeader().setReorderingAllowed(false);
        jScrollPaneTabelaAlgoritmo.setViewportView(jTableAlgoritmo);
        if (jTableAlgoritmo.getColumnModel().getColumnCount() > 0) {
            jTableAlgoritmo.getColumnModel().getColumn(0).setResizable(false);
            jTableAlgoritmo.getColumnModel().getColumn(1).setResizable(false);
            jTableAlgoritmo.getColumnModel().getColumn(2).setResizable(false);
            jTableAlgoritmo.getColumnModel().getColumn(4).setResizable(false);
        }

        jButtonGravarAlgoritmo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/save.png"))); // NOI18N
        jButtonGravarAlgoritmo.setToolTipText("Gravar algoritmo");
        jButtonGravarAlgoritmo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonGravarAlgoritmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGravarAlgoritmoActionPerformed(evt);
            }
        });

        jButtonAddLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/add.png"))); // NOI18N
        jButtonAddLinha.setToolTipText("Adicionar linha");
        jButtonAddLinha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAddLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddLinhaActionPerformed(evt);
            }
        });

        jButtonRemoveLinha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/remove.png"))); // NOI18N
        jButtonRemoveLinha.setToolTipText("Remover linha");
        jButtonRemoveLinha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonRemoveLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveLinhaActionPerformed(evt);
            }
        });

        jButtonBaixar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/baixar.png"))); // NOI18N
        jButtonBaixar.setToolTipText("Importar algoritimo");
        jButtonBaixar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonBaixar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBaixarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelAlgoritmoLayout = new javax.swing.GroupLayout(jPanelAlgoritmo);
        jPanelAlgoritmo.setLayout(jPanelAlgoritmoLayout);
        jPanelAlgoritmoLayout.setHorizontalGroup(
            jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlgoritmoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTabelaAlgoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAlgoritmoLayout.createSequentialGroup()
                        .addComponent(jButtonBaixar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonGravarAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAddLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonRemoveLinha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelAlgoritmoLayout.setVerticalGroup(
            jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAlgoritmoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelAlgoritmoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonBaixar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonGravarAlgoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRemoveLinha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddLinha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTabelaAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelAlgoritmo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelExecucao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelExecucao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelAlgoritmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGravarAlgoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGravarAlgoritmoActionPerformed
        this.estruturas = null;
        this.estruturas = this.tabelaObjetos.getListaObjetos();

        Arquivos.salvarArquivoDialog(this, estruturas);
    }//GEN-LAST:event_jButtonGravarAlgoritmoActionPerformed

    private void jButtonExecutarAlgoritmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecutarAlgoritmoActionPerformed

        this.estruturas = null;

        this.estruturas = this.tabelaObjetos.getListaObjetos();

        Object itemTempo = cmbSegundos.getSelectedItem();

        int tempo = (int) Float.parseFloat((String) itemTempo) * 1000;

        if (!this.estruturas.isEmpty()) {
            new Thread() {

                @Override
                public void run() {

                    boolean parou = false;
                    String estadoAtual = ">";
                    int posicaoAtual = 0;

                    while (!parou) {

                        CampoDigitalizacao campo = getCampoPorPosicao(posicaoAtual);
                        campo.setCor(Color.YELLOW);

                        if (campo.getTexto().isEmpty()) {
                            campo.setTexto(" ");
                        }

                        EstruturaAcao obj = getEstrutura(estadoAtual, campo);

                        if (obj == null) {

                            JOptionPane.showMessageDialog(null, "Algorítimo incorreto", "ERRO", JOptionPane.ERROR_MESSAGE);
                            campo.setCor(Color.white);
                            break;

                        }

                        setValoresNaTela(obj);

                        estadoAtual = obj.getProximoEstado();
                        campo.setTexto(obj.getSimboloEscrever());

                        switch (obj.getDirecao().toUpperCase()) {
                            case "D":
                                posicaoAtual++;
                                break;
                            case "E":
                                posicaoAtual--;
                                break;
                            default:
                                parou = true;
                                break;
                        }

                        try {
                            Thread.sleep(tempo);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                        }

                        campo.setCor(Color.white);
                    }

                    limparValoresNaTela();
                    JOptionPane.showMessageDialog(null, "Finalizado");
                }
            }.start();
        } else {
            JOptionPane.showMessageDialog(null, "Informe um algoritmo!");
        }
    }//GEN-LAST:event_jButtonExecutarAlgoritmoActionPerformed

    private void jButtonAddLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddLinhaActionPerformed
        this.estruturas.add(new EstruturaAcao());
        atualizarTabela();
    }//GEN-LAST:event_jButtonAddLinhaActionPerformed

    private void jButtonRemoveLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveLinhaActionPerformed
        if (jTableAlgoritmo.getSelectedRow() != -1) {
            this.estruturas.remove(jTableAlgoritmo.getSelectedRow());
            atualizarTabela();
        }
    }//GEN-LAST:event_jButtonRemoveLinhaActionPerformed

    private void jButtonLimparFitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparFitaActionPerformed
        this.campos.forEach((c) -> {
            if (c.getPosicao() == 0) {
                c.setTexto(">");
            } else {
                c.setTexto("");
            }
            c.setCor(Color.WHITE);
        });
    }//GEN-LAST:event_jButtonLimparFitaActionPerformed

    private void jButtonBaixarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBaixarActionPerformed
        limparTabela();

        String caminhoArquivo = Arquivos.abrirArquivoDialog(this);

        if (caminhoArquivo == null) {
            return;
        }

        try (Scanner scan = new Scanner(Arquivos.lerArquivo(caminhoArquivo))) {
            while (scan.hasNextLine()) {
                String[] linhaSplit = scan.nextLine().split(";");
                this.estruturas.add(new EstruturaAcao(linhaSplit[0], linhaSplit[1],
                        linhaSplit[2], linhaSplit[3], linhaSplit[4]));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Verifique se o tipo do arquivo estA correto\n"
                    + "Exemplo : 0;0;0;0;0", "ERRO", JOptionPane.ERROR_MESSAGE);
        } finally {
            atualizarTabela();
        }
    }//GEN-LAST:event_jButtonBaixarActionPerformed

    public void limitaCaracterer(java.awt.event.KeyEvent evt) {

        JTextField txt = (JTextField) evt.getComponent();

        boolean max = txt.getText().length() > 0;
        if (max) {
            evt.consume();
        }
    }

    private CampoDigitalizacao getCampoPorPosicao(int pos) {
        for (CampoDigitalizacao c : this.campos) {
            if (c.getPosicao() == pos) {
                return c;
            }
        }
        return null;
    }

    private EstruturaAcao getEstrutura(String estadoAtual, CampoDigitalizacao campo) {
        for (EstruturaAcao obj : this.estruturas) {
            if (estadoAtual.equals(obj.getEstadoAtual())
                    && campo.getTextField().getText().equals((obj.getSimboloLido()))) {

                return obj;
            }
        }

        return null;
    }

    private void limparTabela() {
        iniciarEstruturas();
        atualizarTabela();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbSegundos;
    private javax.swing.JButton jButtonAddLinha;
    private javax.swing.JButton jButtonBaixar;
    private javax.swing.JButton jButtonExecutarAlgoritmo;
    private javax.swing.JButton jButtonGravarAlgoritmo;
    private javax.swing.JButton jButtonLimparFita;
    private javax.swing.JButton jButtonRemoveLinha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAtraso;
    private javax.swing.JPanel jPanelAlgoritmo;
    private javax.swing.JPanel jPanelExecucao;
    private javax.swing.JPanel jPanelFita;
    private javax.swing.JPanel jPanelInfo;
    private javax.swing.JScrollPane jScrollPanePainelFita;
    private javax.swing.JScrollPane jScrollPaneTabelaAlgoritmo;
    private javax.swing.JTable jTableAlgoritmo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtDirecao;
    private javax.swing.JTextField txtEstadoAtual;
    private javax.swing.JTextField txtProxEstado;
    private javax.swing.JTextField txtSimbEscrever;
    private javax.swing.JTextField txtSimboloLido;
    // End of variables declaration//GEN-END:variables
}
