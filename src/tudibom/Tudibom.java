/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tudibom;

import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Erick
 */
public class Tudibom extends javax.swing.JFrame {

    /**
     * Creates new form Tudibom
     */
    public Tudibom() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        this.setTitle("Tudibom");

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja fazer log out?", "Comfirmação", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

                if(result == JOptionPane.YES_OPTION) {
                    try {
                        SqlDAO.conexao.close();
                    } catch (SQLException e1) {
                        e1.printStackTrace();
                    }
                    System.exit(0);
                }
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null}
                },
                new String[]{
                        "Descrição", "Marca", "Valor", "Validade", "Prateleira"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
        }

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Descrição", "Marca", "Valor", "Validade", "Tipo", "Perecível/Tóxico", "Prateleira"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
            jTable2.getColumnModel().getColumn(4).setResizable(false);
            jTable2.getColumnModel().getColumn(5).setResizable(false);
            jTable2.getColumnModel().getColumn(6).setResizable(false);
        }

        atualizaTabela();

        jButton1.setText("Salvar");
        jButton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                acaoAdicionarProduto();
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Ingrediente", "Limpeza"}));
        jComboBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getItem().toString().equalsIgnoreCase("ingrediente"))
                    jLabel2.setText("Perecível");
                else
                    jLabel2.setText("Tóxico");
            }
        });

        jLabel1.setText("Tipo");

        jLabel2.setText("Perecível");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sim", "Não" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1283, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(82, 82, 82)
                                                .addComponent(jButton1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(jLabel1)
                                                                .addComponent(jLabel2)))
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void acaoAdicionarProduto() {

        if(jTable1.getCellEditor()!=null)
            jTable1.getCellEditor().stopCellEditing();

		String descrição = jTable1.getModel().getValueAt(0, 0).toString();
		String marca = jTable1.getModel().getValueAt(0, 1).toString();
		String valor = jTable1.getModel().getValueAt(0, 2).toString();
		String validade = jTable1.getModel().getValueAt(0, 3).toString();
    	String tipoDeProduto = jComboBox1.getSelectedItem().toString();
    	String caracteristicaDoProduto = jComboBox2.getSelectedItem().toString();
        String prateleira = jTable1.getModel().getValueAt(0, 4).toString();
    	
    	boolean caracteristicaDoProduto2 = caracteristicaDoProduto.equalsIgnoreCase("sim");


        if(!Util.isIntegerNumber(prateleira)){
            JOptionPane.showMessageDialog(null, "O valor da prateleira deve ser um número");
            return;
        }

        if(!Util.isDateFormat(validade)){
            JOptionPane.showMessageDialog(null, "A validade deve seguir o padrão DD-MM-AAAA");
            return;
        }

        if(!Util.isMoneyNumber(valor)){
            JOptionPane.showMessageDialog(null, "O campo \"Valor\" está inválido");
            return;
        }

    	try {
    		String insert = "insert into "+tipoDeProduto+ " values(default,'" +descrição+ "','" +marca+ "'," +valor+ ",'" +validade+ "',"
					+caracteristicaDoProduto2+ ", " + prateleira + ");";
			System.out.println(insert);
			SqlDAO.chaveDeAcesso.execute(insert);
			
			jTable1.getModel().setValueAt("", 0, 0);
			jTable1.getModel().setValueAt("", 0, 1);
			jTable1.getModel().setValueAt("", 0, 2);
			jTable1.getModel().setValueAt("", 0, 3);
            jTable1.getModel().setValueAt("", 0, 4);
			
			atualizaTabela();

		} catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha ao salvar produto:\n" + e.getMessage());
		}		
	}
    
    void atualizaTabela(){
    	String consultarIngrediente = "SELECT * From ingrediente;";
    	String consultarLimpeza = "SELECT * From limpeza;";
    	
    	
    	try {
    		DefaultTableModel tableModel = (DefaultTableModel) jTable2.getModel();
			ResultSet resultadoIngrediente = SqlDAO.chaveDeAcesso.executeQuery(consultarIngrediente);
			limpaTabela(tableModel);
			
			while (resultadoIngrediente.next()){
				
				String descrição = resultadoIngrediente.getString("descricao");
				String marca = resultadoIngrediente.getString("Marca");
				String valor = resultadoIngrediente.getString("Valor");
				String validade = resultadoIngrediente.getString("DataValidade");
				String tipo = "Ingrediente";
				String caracteristica = resultadoIngrediente.getString("Eperecivel");
                String prateleira = resultadoIngrediente.getString("Prateleira");
				
				caracteristica = caracteristica.equalsIgnoreCase("t") ? "Sim" : "Não";
				
				tableModel.addRow(new String [] {descrição, marca, valor, validade, tipo, caracteristica, prateleira});
			}
			
			
	
			ResultSet resultadoLimpeza = SqlDAO.chaveDeAcesso.executeQuery(consultarLimpeza);
			while (resultadoLimpeza.next()){
				
				String descrição = resultadoLimpeza.getString("descricao");
				String marca = resultadoLimpeza.getString("Marca");
				String valor = resultadoLimpeza.getString("Valor");
				String validade = resultadoLimpeza.getString("DataValidade");
				String tipo = "Limpeza";
				String caracteristica = resultadoLimpeza.getString("Etoxico");
                String prateleira = resultadoLimpeza.getString("Prateleira");

                caracteristica = caracteristica.equalsIgnoreCase("t") ? "Sim" : "Não";

				tableModel.addRow(new String [] {descrição, marca, valor, validade, tipo, caracteristica, prateleira});
			}
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }

	private static void limpaTabela(DefaultTableModel tableModel) {
		int nroDeLinhas = tableModel.getRowCount();
		for ( int i = nroDeLinhas-1 ; i >= 0 ; i-- )
			tableModel.removeRow(i);		
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
            java.util.logging.Logger.getLogger(Tudibom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tudibom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tudibom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tudibom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
