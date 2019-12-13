import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Search extends JFrame {

	private JPanel panel;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Search frame = new Search();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Search() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 591, 352);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		panel.setLayout(null);
		
		JLabel lblAlert = new JLabel("\uB3C4\uC11C \uAC80\uC0C9");
		lblAlert.setFont(new Font("굴림", Font.PLAIN, 24));
		lblAlert.setBounds(12, 10, 104, 27);
		panel.add(lblAlert);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 64, 560, 197);
		panel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"도서번호", "책 제목", "평점", "후기"
			}
		));
		scrollPane.setViewportView(table);
		
		JButton btnEdit = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		btnEdit.setBackground(Color.WHITE);
		btnEdit.setBounds(406, 271, 142, 35);
		panel.add(btnEdit);
		
		JButton btnDel = new JButton("\uCC1C\uD558\uAE30");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDel.setBackground(Color.WHITE);
		btnDel.setBounds(232, 271, 142, 35);
		panel.add(btnDel);
		
		JButton btnClose = new JButton("\uAC80\uC0C9");
		btnClose.setFont(new Font("굴림", Font.PLAIN, 11));
		btnClose.setBackground(Color.WHITE);
		btnClose.setBounds(392, 10, 55, 23);
		panel.add(btnClose);
		
		textField = new JTextField();
		textField.setBounds(232, 10, 157, 23);
		panel.add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("\uBCC4\uC810\uC21C");
		rdbtnNewRadioButton.setBounds(263, 39, 61, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("\uC870\uD68C\uC21C");
		rdbtnNewRadioButton_1.setBounds(194, 39, 61, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("\uD6C4\uAE30 \uAC2F\uC218\uC21C");
		rdbtnNewRadioButton_2.setBounds(336, 39, 92, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JButton button = new JButton("\uC870\uD68C\uD558\uAE30");
		button.setBackground(Color.WHITE);
		button.setBounds(49, 271, 142, 35);
		panel.add(button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\uB9CC\uD654\uCC45", "\uC18C\uC124", "\uD559\uC2B5\uC9C0", "\uC544\uB3D9", "\uBB38\uD559", "\uC601\uBB38\uD559", "\uC778\uBB38", "\uCCA0\uD559", "\uC2EC\uB9AC", "\uACBD\uC81C", "\uACBD\uC601", "\uC790\uAE30 \uACC4\uBC1C\uC11C", "\uC5EC\uD589"}));
		comboBox.setBounds(147, 10, 73, 23);
		panel.add(comboBox);
		
		JButton btnNewButton = new JButton("\uC774\uB2EC\uC758 \uB3C4\uC11C\uB85C");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 11));
		btnNewButton.setBounds(459, 10, 104, 23);
		panel.add(btnNewButton);
	}
}
