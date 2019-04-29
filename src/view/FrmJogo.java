package view;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import model.Questao;

public class FrmJogo extends javax.swing.JFrame {
    private String alternativaCorreta;
    private int pontuacao;
    private int numQuestoesBanco;
    private ArrayList<Integer> idQuestoesUsadas = new ArrayList<Integer>();
    
    /**
     * Creates new form FrmJogo
     */
    public FrmJogo() {
        initComponents();
        this.numQuestoesBanco = quantidadeQuestoesBanco();
        carregaPergunta();
        new funcoesNecessariasTodosFormularios(this).setCorBackgroundFormulario();
        new funcoesNecessariasTodosFormularios(this).setIconeFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNumeroPergunta = new javax.swing.JLabel();
        lblPergunta = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnAlternativa1 = new javax.swing.JButton();
        btnAlternativa2 = new javax.swing.JButton();
        btnAlternativa3 = new javax.swing.JButton();
        btnAlternativa4 = new javax.swing.JButton();
        lblPontuacao = new javax.swing.JLabel();
        btnDica1 = new javax.swing.JButton();
        btnDica2 = new javax.swing.JButton();
        btnDica3 = new javax.swing.JButton();
        btnDesistir = new javax.swing.JButton();
        lblPontuacao1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumeroPergunta.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        lblNumeroPergunta.setForeground(new java.awt.Color(206, 196, 21));
        lblNumeroPergunta.setText("1.");
        getContentPane().add(lblNumeroPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblPergunta.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        lblPergunta.setForeground(new java.awt.Color(255, 255, 255));
        lblPergunta.setText("sssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssss");
        lblPergunta.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblPergunta.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        getContentPane().add(lblPergunta, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 560, 60));

        jLabel5.setBackground(new java.awt.Color(206, 196, 21));
        jLabel5.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("B");
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 40, 44));

        jLabel6.setBackground(new java.awt.Color(206, 196, 21));
        jLabel6.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("A");
        jLabel6.setOpaque(true);
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 40, 44));

        jLabel7.setBackground(new java.awt.Color(206, 196, 21));
        jLabel7.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("C");
        jLabel7.setOpaque(true);
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 40, 44));

        jLabel8.setBackground(new java.awt.Color(206, 196, 21));
        jLabel8.setFont(new java.awt.Font("Helvetica", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("D");
        jLabel8.setOpaque(true);
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 40, 44));

        btnAlternativa1.setBackground(new java.awt.Color(255, 255, 255));
        btnAlternativa1.setFont(new java.awt.Font("Helvetica", 0, 15)); // NOI18N
        btnAlternativa1.setText("A. Opção 1");
        btnAlternativa1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlternativa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlternativa1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlternativa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 390, 44));

        btnAlternativa2.setBackground(new java.awt.Color(255, 255, 255));
        btnAlternativa2.setFont(new java.awt.Font("Helvetica", 0, 15)); // NOI18N
        btnAlternativa2.setText("A. Opção 1");
        btnAlternativa2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlternativa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlternativa2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlternativa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 390, 44));

        btnAlternativa3.setBackground(new java.awt.Color(255, 255, 255));
        btnAlternativa3.setFont(new java.awt.Font("Helvetica", 0, 15)); // NOI18N
        btnAlternativa3.setText("A. Opção 1");
        btnAlternativa3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlternativa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlternativa3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlternativa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 390, 44));

        btnAlternativa4.setBackground(new java.awt.Color(255, 255, 255));
        btnAlternativa4.setFont(new java.awt.Font("Helvetica", 0, 15)); // NOI18N
        btnAlternativa4.setText("A. Opção 1");
        btnAlternativa4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAlternativa4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlternativa4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlternativa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 390, 44));

        lblPontuacao.setFont(new java.awt.Font("Helvetica", 0, 24)); // NOI18N
        lblPontuacao.setForeground(new java.awt.Color(255, 255, 255));
        lblPontuacao.setText("00000");
        getContentPane().add(lblPontuacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        btnDica1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dica-eliminar.png"))); // NOI18N
        btnDica1.setBorder(null);
        btnDica1.setBorderPainted(false);
        btnDica1.setContentAreaFilled(false);
        btnDica1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDica1.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dica-eliminar-deletado.png"))); // NOI18N
        btnDica1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDica1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDica1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 100, 100));

        btnDica2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dica-porcentagem.png"))); // NOI18N
        btnDica2.setBorder(null);
        btnDica2.setBorderPainted(false);
        btnDica2.setContentAreaFilled(false);
        btnDica2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDica2.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dica-porcentagem-deletado.png"))); // NOI18N
        btnDica2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDica2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDica2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 100, 100));

        btnDica3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dica-pular.png"))); // NOI18N
        btnDica3.setBorder(null);
        btnDica3.setBorderPainted(false);
        btnDica3.setContentAreaFilled(false);
        btnDica3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDica3.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/dica-pular-deletado.png"))); // NOI18N
        btnDica3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDica3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnDica3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 100, 100));

        btnDesistir.setBackground(new java.awt.Color(0, 0, 0));
        btnDesistir.setFont(new java.awt.Font("Helvetica", 0, 18)); // NOI18N
        btnDesistir.setForeground(new java.awt.Color(196, 0, 34));
        btnDesistir.setText("Desistir");
        btnDesistir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDesistir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesistirActionPerformed(evt);
            }
        });
        getContentPane().add(btnDesistir, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 180, 50));

        lblPontuacao1.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        lblPontuacao1.setForeground(new java.awt.Color(206, 196, 21));
        lblPontuacao1.setText("Pontos: ");
        getContentPane().add(lblPontuacao1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        jLabel1.setFont(new java.awt.Font("Helvetica", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(206, 196, 21));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pular");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 80, -1));

        jLabel2.setFont(new java.awt.Font("Helvetica", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(206, 196, 21));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Porcentagem");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 100, -1));

        jLabel3.setFont(new java.awt.Font("Helvetica", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(206, 196, 21));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Eliminar");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 100, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlternativa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternativa1ActionPerformed
        verificaResposta(btnAlternativa1.getText());
    }//GEN-LAST:event_btnAlternativa1ActionPerformed

    private void btnAlternativa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternativa2ActionPerformed
        verificaResposta(btnAlternativa2.getText());
    }//GEN-LAST:event_btnAlternativa2ActionPerformed

    private void btnAlternativa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternativa3ActionPerformed
        verificaResposta(btnAlternativa3.getText());
    }//GEN-LAST:event_btnAlternativa3ActionPerformed

    private void btnAlternativa4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlternativa4ActionPerformed
        verificaResposta(btnAlternativa4.getText());
    }//GEN-LAST:event_btnAlternativa4ActionPerformed

    private void btnDica1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDica1ActionPerformed
        eliminaAlternativasErradasRandomicamente();
    }//GEN-LAST:event_btnDica1ActionPerformed

    private void btnDica2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDica2ActionPerformed
        porcentagemDasAlternativasSeremACorreta();
    }//GEN-LAST:event_btnDica2ActionPerformed

    private void btnDica3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDica3ActionPerformed
        pulaQuestao();
    }//GEN-LAST:event_btnDica3ActionPerformed

    private void btnDesistirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesistirActionPerformed
        int resposta = JOptionPane.showConfirmDialog(null, "Você realmente deseja encerrar essa partida ?", "ATENÇÃO", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);

        if (resposta == JOptionPane.YES_OPTION) {
            encerraJogo(); 
        }
    }//GEN-LAST:event_btnDesistirActionPerformed
    
    // Elimina uma quantidade random de questões erradas
    private void eliminaAlternativasErradasRandomicamente() {
        Random rand = new Random();
        boolean alternativaEliminadaComSucesso;

        ArrayList<JButton> botoesAlternativa = new ArrayList<JButton>();
        botoesAlternativa.add(btnAlternativa1);
        botoesAlternativa.add(btnAlternativa2);
        botoesAlternativa.add(btnAlternativa3);
        botoesAlternativa.add(btnAlternativa4);
        
        // Quantidade de alternativas que serão eliminadas
        int quantidadeAlternativasParaEliminar = rand.nextInt(3)+1;
        
        for (int i = 0; i < quantidadeAlternativasParaEliminar; i++) {
            alternativaEliminadaComSucesso = false;

            // Indice random do botão do arraylist
            int indexBotaoRandom = rand.nextInt(4);
            
            do {
                try {
                    JButton botao = botoesAlternativa.get(indexBotaoRandom);
                    
                    if (!botao.getText().equals(alternativaCorreta)) {
                        botoesAlternativa.get(indexBotaoRandom).setEnabled(false);
                        botoesAlternativa.remove(indexBotaoRandom);
                        
                        alternativaEliminadaComSucesso = true;
                    }
                    else 
                        indexBotaoRandom = rand.nextInt(4);
                    
                }
                catch (Exception e) {
                    indexBotaoRandom = rand.nextInt(4);
                }

            }while (!alternativaEliminadaComSucesso);
        }
        
       btnDica1.setEnabled(false);
        
    }
    
    // Apresenta uma porcentagem de cada alternativa ser a correta
    private void porcentagemDasAlternativasSeremACorreta() {
        int[] porcentagens = new int[4];
        ArrayList<String> porcentagensRelacionadasComAsAlternativas = new ArrayList<String>();
        
        porcentagens = criaPorcentagens();
        porcentagensRelacionadasComAsAlternativas = relacionaPorcentaemComAsAlternativas(porcentagens);
               
        FrmPorcentagem frmPorcentagem = new FrmPorcentagem(porcentagensRelacionadasComAsAlternativas);
        frmPorcentagem.setVisible(true);
        
        btnDica2.setEnabled(false);
    }
    
    // Cria as porcentagens ficticias
    private int[] criaPorcentagens() {
        Random rand = new Random();
        int porcentagemRestante = 100;
        int porcentagemAlternativaCerta = 0;
        int[] porcentagemAlternativasErradas = new int[3];
        int[] porcentagemDasAlternativas = new int[4];
        
        // Cria a porcentagem da alternativa correta
        /* O looping foi usado para ter maior possibilidade da porcentagem ser maior para a resposta correta */
        for (int i = 0; i < 2; i++) {
            int porcentagem = rand.nextInt(porcentagemRestante);
            if (porcentagem > porcentagemAlternativaCerta)
                porcentagemAlternativaCerta = porcentagem;
        }
        
        porcentagemRestante -= porcentagemAlternativaCerta;
        
        // Cria a porcentagem das alternativas erradas
        for (int i = 0; i < 2; i++) {
            porcentagemAlternativasErradas[i] = rand.nextInt(porcentagemRestante);
            porcentagemRestante -= porcentagemAlternativasErradas[i];
        
        }
        
        // Porcentagem da última alternativa
        porcentagemAlternativasErradas[2] = porcentagemRestante;
        
        porcentagemDasAlternativas[0] = porcentagemAlternativaCerta;
        porcentagemDasAlternativas[1] = porcentagemAlternativasErradas[0];
        porcentagemDasAlternativas[2] = porcentagemAlternativasErradas[1];
        porcentagemDasAlternativas[3] = porcentagemAlternativasErradas[2];
        
        return porcentagemDasAlternativas;
    }
    
    // Relaciona as porcentagens criadas as alternativas
    private ArrayList<String> relacionaPorcentaemComAsAlternativas(int[] porcentagem) {
        String[] botoesDasAlternativas = new String[4];
        int[] porcentagemAlternativasErradas = new int[3];
        int porcentagemAlternativaCorreta;
        int indexAlternativaErrada = 0;
        ArrayList<String> porcentagensRelacionadas = new ArrayList<String>();
        
        porcentagemAlternativaCorreta = porcentagem[0];
        porcentagemAlternativasErradas[0] = porcentagem[1];
        porcentagemAlternativasErradas[1] = porcentagem[2];
        porcentagemAlternativasErradas[2] = porcentagem[3];
        
        botoesDasAlternativas[0] = btnAlternativa1.getText();
        botoesDasAlternativas[1] = btnAlternativa2.getText();
        botoesDasAlternativas[2] = btnAlternativa3.getText();
        botoesDasAlternativas[3] = btnAlternativa4.getText();
         
        for (int i = 0; i < 4; i++) {
            if (botoesDasAlternativas[i].equals(alternativaCorreta)) {
                porcentagensRelacionadas.add(Integer.toString(porcentagemAlternativaCorreta)+"%");
            }
            else {
                porcentagensRelacionadas.add(Integer.toString(porcentagemAlternativasErradas[indexAlternativaErrada])+"%");
                indexAlternativaErrada++;
            }
        }
        
        return porcentagensRelacionadas;
    }
    
    // Pula a questão atual porém dando a pontuação dessa resposta ao jogador
    private void pulaQuestao() {
        this.pontuacao += 100;
        btnDica3.setEnabled(false);
        
        restauraTela();
        carregaPergunta();
    }
    
    // Carrega uma pergunta do banco de dados
    private void carregaPergunta() {
        Questao questao = new Questao();
        int randomId;
        
        if (verificaSeAcabouQuestoes())
            encerraJogo();

        else {
            randomId = idQuestaoRandom();
            questao = questao.getDadosDaQuestao(randomId);
            questao = embaralhaAlternativas(questao);

            this.alternativaCorreta = questao.getAlternativaCorreta();

            atualizaTelaComNovaQuestao(questao);
        }
    }
    
    // Atualiza visualmente a questão, as alternativas, o numero da questão e a pontuação
    private void atualizaTelaComNovaQuestao (Questao questao) {
        // Apresenta o numero da pergunta atual e a pontuação atual
        lblNumeroPergunta.setText(Integer.toString(this.idQuestoesUsadas.size())+".");
        lblPontuacao.setText(Integer.toString(this.pontuacao));

        if (questao.getQuestao().length() >= 64) {
            questao.setQuestao("<html>"+questao.getQuestao().substring(0, 64)+"<br>"+questao.getQuestao().substring(64, questao.getQuestao().length()-1)+"</html>");
        }

        // Apresenta as alternativas nos botões
        lblPergunta.setText(questao.getQuestao());
        btnAlternativa1.setText(questao.getAlternativa1());
        btnAlternativa2.setText(questao.getAlternativa2());
        btnAlternativa3.setText(questao.getAlternativa3());
        btnAlternativa4.setText(questao.getAlternativa4());
    }
    
    // Verifica se a alternativa que o jogador clicou é a correta
    private void verificaResposta(String resposta) {
        boolean terminarJogo = false;
        int indexQuestaoAtual = idQuestoesUsadas.size() -1;
        
        if (resposta.equals(this.alternativaCorreta)) {
            this.pontuacao += 100;
            
        }
        else {
            encerraJogo();
            return;
        }
        
        carregaPergunta();
        restauraTela();
    }
    
    // Pega a quantidade de perguntas que tem no banco
    private int quantidadeQuestoesBanco() {
        Questao quantidade = new Questao();
        return quantidade.getQuantidadeQuestoes();
    }
    
    // Pegar uma questão random do banco de dados que ainda não foi usada
    private int idQuestaoRandom() {     
        Random rand = new Random();
        int idQuestaoRandom;
        boolean questaoFoiUsada;
        
        do {           
            idQuestaoRandom = rand.nextInt(this.numQuestoesBanco)+1;
            questaoFoiUsada = verificaSeQuestaoFoiUsada(idQuestaoRandom); 
            
        } while (questaoFoiUsada);
        
        this.idQuestoesUsadas.add(idQuestaoRandom);
        
        return idQuestaoRandom;
    }
    
    // Termina o jogo, e passa o jogador para a tela de pontuação
    private void encerraJogo() {
        String pontuacaoFinal = Integer.toString(pontuacao);

        new FrmPontuacao(pontuacaoFinal).setVisible(true);
        this.setVisible(false);
    }
    
    // Verifica se há mais alguma questão para ser usada
    private boolean verificaSeAcabouQuestoes() {
        if (this.idQuestoesUsadas.size() == this.numQuestoesBanco)
            return true;
        
        return false;
    }
    
    // Verifica se a questão solicitada já foi usada na partida
    private boolean verificaSeQuestaoFoiUsada(int idQuestaoSolicitada) {
        boolean questaoFoiUsada = false;
        Random rand = new Random();
            
        for (Integer idUsado : this.idQuestoesUsadas) {
            if (idQuestaoSolicitada == idUsado) {
                questaoFoiUsada = true;
                break;

            }
        }
        
        return questaoFoiUsada;
    }
    
    // Deixa os componentes do form de modo que foi iniciado
    private void restauraTela() {
        btnAlternativa1.setEnabled(true);
        btnAlternativa2.setEnabled(true);
        btnAlternativa3.setEnabled(true);
        btnAlternativa4.setEnabled(true);
    }
    
    // Embaralha as alternativas para que elas fiquem em posições diferentes
    // (Não deixando nas mesmas posições que veio do banco)
    private Questao embaralhaAlternativas(Questao questao) {
        Random rand = new Random();
        int numeroDeAlternativas;
        ArrayList<String> alternativas;
        String[] alternativasEmbaralhadas = new String[4];
        
        alternativas = new ArrayList<String>();
        alternativas.add(questao.getAlternativa1());
        alternativas.add(questao.getAlternativa2());
        alternativas.add(questao.getAlternativa3());
        alternativas.add(questao.getAlternativa4());
            
        numeroDeAlternativas = alternativas.size();
        
        for (int i = 0; i < numeroDeAlternativas; i++) {
            int randomIndex = rand.nextInt(alternativas.size());
            alternativasEmbaralhadas[i] = alternativas.get(randomIndex);
            alternativas.remove(randomIndex);
        }
        
        questao.setAlternativa1(alternativasEmbaralhadas[0]);
        questao.setAlternativa2(alternativasEmbaralhadas[1]);
        questao.setAlternativa3(alternativasEmbaralhadas[2]);
        questao.setAlternativa4(alternativasEmbaralhadas[3]);
        
        return questao;
    }
    
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
            java.util.logging.Logger.getLogger(FrmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlternativa1;
    private javax.swing.JButton btnAlternativa2;
    private javax.swing.JButton btnAlternativa3;
    private javax.swing.JButton btnAlternativa4;
    private javax.swing.JButton btnDesistir;
    private javax.swing.JButton btnDica1;
    private javax.swing.JButton btnDica2;
    private javax.swing.JButton btnDica3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblNumeroPergunta;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblPontuacao;
    private javax.swing.JLabel lblPontuacao1;
    // End of variables declaration//GEN-END:variables
}
