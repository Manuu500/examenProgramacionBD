package view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;

import controlador.ControladorCentroEducativo;
import controlador.ControladorMateria;
import controlador.ControladorNivel;
import model.CentroEducativo;
import model.Materia;
import model.Nivel;

import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelCentroEducativo extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	JComboBox<CentroEducativo> jcbCE;
	JComboBox<Nivel> jcbNivel;
	JComboBox<Materia> jcbMateria;

	/**
	 * Create the panel.
	 */
	public PanelCentroEducativo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Gestion Materias");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridwidth = 7;
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Centro");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jcbCE = new JComboBox<CentroEducativo>();
		cargarCursosEnJCombo();
		jcbCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 4;
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 2;
		gbc_comboBox.gridy = 1;
		add(jcbCE, gbc_comboBox);
		
		JButton btnNewButton = new JButton("Cargar Niveles");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jcbCE.getSelectedIndex() == 0) {
					cargarCursosEnJComboNivelInstituto0();
				}
				
				if(jcbCE.getSelectedIndex() == 1) {
					cargarCursosEnJComboNivelInstituto1();
				}
				
				if(jcbCE.getSelectedIndex() == 2) {
					cargarCursosEnJComboNivelInstituto2();
				}
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 6;
		gbc_btnNewButton.gridy = 1;
		add(btnNewButton, gbc_btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nivel");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_1.gridx = 1;
		gbc_lblNewLabel_1_1.gridy = 2;
		add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		jcbNivel = new JComboBox<Nivel>();
		jcbNivel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridwidth = 4;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 2;
		gbc_comboBox_1.gridy = 2;
		add(jcbNivel, gbc_comboBox_1);
		
		JButton btnNewButton_1 = new JButton("Cargar Materias");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(jcbNivel.getSelectedIndex() == 0) {
					cargarMateriasEnJComboNivelInstituto1();
				}
				
				if(jcbNivel.getSelectedIndex() == 1) {
					cargarMateriasEnJComboNivelInstituto2();
				}
				
				if(jcbNivel.getSelectedIndex() == 2) {
					cargarMateriasEnJComboNivelInstituto3();
				}
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 6;
		gbc_btnNewButton_1.gridy = 2;
		add(btnNewButton_1, gbc_btnNewButton_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Materia");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GridBagConstraints gbc_lblNewLabel_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_1_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1_2.gridx = 1;
		gbc_lblNewLabel_1_2.gridy = 3;
		add(lblNewLabel_1_2, gbc_lblNewLabel_1_2);
		
		jcbMateria = new JComboBox<Materia>();
		jcbMateria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_comboBox_2 = new GridBagConstraints();
		gbc_comboBox_2.gridwidth = 4;
		gbc_comboBox_2.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_2.gridx = 2;
		gbc_comboBox_2.gridy = 3;
		add(jcbMateria, gbc_comboBox_2);
		
		JButton btnNewButton_2 = new JButton("Ver Materia");
		btnNewButton_2.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				cargarEnPantalla(ControladorMateria.ultimoElemento());
			}
		});
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 6;
		gbc_btnNewButton_2.gridy = 3;
		add(btnNewButton_2, gbc_btnNewButton_2);
		
		JLabel lblNewLabel_2 = new JLabel("Datos de la materia");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.gridwidth = 7;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 5;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("id");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 2;
		gbc_lblNewLabel_3.gridy = 7;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 4;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 3;
		gbc_textField.gridy = 7;
		add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Nombre");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 2;
		gbc_lblNewLabel_4.gridy = 8;
		add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 4;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 3;
		gbc_textField_1.gridy = 8;
		add(textField_1, gbc_textField_1);
		
		JLabel lblNewLabel_5 = new JLabel("Codigo");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 2;
		gbc_lblNewLabel_5.gridy = 9;
		add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 4;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 3;
		gbc_textField_2.gridy = 9;
		add(textField_2, gbc_textField_2);
		
		JLabel lblNewLabel_6 = new JLabel("URL Classroom");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 2;
		gbc_lblNewLabel_6.gridy = 10;
		add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 4;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 3;
		gbc_textField_3.gridy = 10;
		add(textField_3, gbc_textField_3);
		
		JLabel lblNewLabel_7 = new JLabel("Fecha Inicio");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 2;
		gbc_lblNewLabel_7.gridy = 11;
		add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridwidth = 4;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 3;
		gbc_textField_4.gridy = 11;
		add(textField_4, gbc_textField_4);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Admite matricula");
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.gridwidth = 7;
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxNewCheckBox.gridx = 0;
		gbc_chckbxNewCheckBox.gridy = 13;
		add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JButton btnNewButton_3 = new JButton("Guardar");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				modificarElemento();
			}
		});
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_3.gridx = 6;
		gbc_btnNewButton_3.gridy = 14;
		add(btnNewButton_3, gbc_btnNewButton_3);

	}

	
	
	/**
	 * 
	 */
	private void cargarCursosEnJCombo() {
		List<CentroEducativo> cursos = ControladorCentroEducativo.encuentraTodos();
		for (CentroEducativo centroEducativo : cursos) {
			this.jcbCE.addItem(centroEducativo);
		}
	}
	
	
	/**
	 * 
	 */
	private void cargarCursosEnJComboNivelInstituto0() {
		List<Nivel> cursos = ControladorNivel.encuentraTodosPrimerInstituto();
		for (Nivel nivel : cursos) {
			this.jcbNivel.addItem(nivel);
		}
	}
	
	/**
	 * 
	 */
	private void cargarCursosEnJComboNivelInstituto1() {
		List<Nivel> cursos = ControladorNivel.encuentraTodosSegundoInstituto();
		for (Nivel nivel : cursos) {
			this.jcbNivel.addItem(nivel);
		}
	}
	
	/**
	 * 
	 */
	private void cargarCursosEnJComboNivelInstituto2() {
		List<Nivel> cursos = ControladorNivel.encuentraTodosPrimerInstituto();
		for (Nivel nivel : cursos) {
			this.jcbNivel.addItem(nivel);
		}
	}
	
	
	/**
	 * 
	 */
	private void cargarMateriasEnJComboNivelInstituto1() {
		List<Materia> cursos = ControladorMateria.encuentraTodosPrimerInstituto();
		for (Materia materia : cursos) {
			this.jcbMateria.addItem(materia);
		}
	}
	
	/**
	 * 
	 */
	private void cargarMateriasEnJComboNivelInstituto2() {
		List<Materia> cursos = ControladorMateria.encuentraTodosSegundoInstituto();
		for (Materia materia : cursos) {
			this.jcbMateria.addItem(materia);
		}
	}
	
	/**
	 * 
	 */
	private void cargarMateriasEnJComboNivelInstituto3() {
		List<Materia> cursos = ControladorMateria.encuentraTodosTercerInstituto();
		for (Materia materia : cursos) {
			this.jcbMateria.addItem(materia);
		}
	}
	
	
	/**
	 * 
	 * @param m
	 */
	private void cargarEnPantalla (Materia m) {
		if (m != null) {
			this.textField.setText(" " + m.getId());
			this.textField_1.setText(m.getNombre());
			this.textField_2.setText(" " + m.getCodigo());
			this.textField_3.setText(m.getUrlClassroom());
			this.textField_4.setText(m.getFechaInicio());
		}
	}	
	
	
	/**
	 * 
	 * @param c
	 */
	private void modificarElemento() {
		cargarEnPantalla(ControladorMateria.modificar());
	}
}
