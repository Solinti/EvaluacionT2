package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class T02 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrecio;
	private JButton btnAdicionar;
	private JButton btnReemplazarUltimo;
	private JButton btnReemplazarPrimero;
	private JButton btnReemplazarPrecio;
	private JButton btnEliminarUltimo;
	private JButton btnOrdenarPrecio;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					T02 frame = new T02();
					frame.setVisible(true);
				} 
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public T02() {
		setTitle("Evaluación T02");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(80, 11, 86, 20);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 42, 404, 408);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		scrollPane.setViewportView(txtS);
		
		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(424, 43, 150, 23);
		contentPane.add(btnAdicionar);
		
		btnReemplazarUltimo = new JButton("Reemplazar último");
		btnReemplazarUltimo.addActionListener(this);
		btnReemplazarUltimo.setBounds(424, 77, 150, 23);
		contentPane.add(btnReemplazarUltimo);
		
		btnReemplazarPrimero = new JButton("Reemplazar primero");
		btnReemplazarPrimero.addActionListener(this);
		btnReemplazarPrimero.setBounds(424, 111, 150, 23);
		contentPane.add(btnReemplazarPrimero);
		
		btnReemplazarPrecio = new JButton("Reemplazar precio");
		btnReemplazarPrecio.addActionListener(this);
		btnReemplazarPrecio.setBounds(424, 145, 150, 23);
		contentPane.add(btnReemplazarPrecio);
		
		btnEliminarUltimo = new JButton("Eliminar ultimo");
		btnEliminarUltimo.addActionListener(this);
		btnEliminarUltimo.setBounds(424, 179, 150, 23);
		contentPane.add(btnEliminarUltimo);
		
		btnOrdenarPrecio = new JButton("Ordenar precio");
		btnOrdenarPrecio.addActionListener(this);
		btnOrdenarPrecio.setBounds(424, 213, 150, 23);
		contentPane.add(btnOrdenarPrecio);
		
		JLabel lblPrecio = new JLabel("Precio:");
		lblPrecio.setBounds(27, 14, 43, 14);
		contentPane.add(lblPrecio);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		if (arg0.getSource() == btnReemplazarUltimo) {
			actionPerformedBtnReemplazarUltimo(arg0);
		}
		if (arg0.getSource() == btnReemplazarPrimero) {
			actionPerformedBtnReemplazarPrimero(arg0);
		}
		if (arg0.getSource() == btnReemplazarPrecio) {
			actionPerformedBtnReemplazarPrecio(arg0);
		}
		if (arg0.getSource() == btnEliminarUltimo) {
			actionPerformedBtnEliminarUltimo(arg0);
		}
		if (arg0.getSource() == btnOrdenarPrecio) {
			actionPerformedBtnOrdenarPrecio(arg0);
		}
		
	}
	
	private void actionPerformedBtnAdicionar(ActionEvent arg0) {
		
	}

	private void actionPerformedBtnReemplazarUltimo(ActionEvent arg0) {
		
	}

	private void actionPerformedBtnReemplazarPrimero(ActionEvent arg0) {
		
	}

	private void actionPerformedBtnReemplazarPrecio(ActionEvent arg0) {
		
	}

	private void actionPerformedBtnEliminarUltimo(ActionEvent arg0) {
		
	}

	private void actionPerformedBtnOrdenarPrecio(ActionEvent arg0) {
		
	}

//  Metodos tipo void (sin parametros)
	void imprimir() {
		imprimir("");
	}
	void limpieza() {
		txtPrecio.setText("");
		txtPrecio.requestFocus();
	}
	void listar() {
		
	}
	//  Metodos tipo void (con parametros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	//  Metodos que retornan valor (sin parametros)
	int leerPrecio()  {
		return Integer.parseInt(txtPrecio.getText().trim());
	}
	
}
