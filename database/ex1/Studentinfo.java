package database.ex1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Studentinfo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfSearch;
	private JTable table;
	private Object model;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Studentinfo frame = new Studentinfo();
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
	public Studentinfo() {
		setTitle("학생 정보 검색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox cbSelect = new JComboBox();
		cbSelect.setFont(new Font("굴림", Font.PLAIN, 14));
		cbSelect.setBounds(12, 10, 82, 38);
		contentPane.add(cbSelect);
		
		tfSearch = new JTextField();
		tfSearch.setFont(new Font("굴림", Font.PLAIN, 14));
		tfSearch.setBounds(106, 8, 162, 40);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		JButton btnNewButton = new JButton("검색");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectItem = cbSelect.getSelectedItem().toString();
				//String searchText = tfSearch.getText();
				
				String sql = "SELECT * FROM members" + "WHERE" + selectItem + "LIKE '%" + selectItem + "%' " + "ORDER BY ID";
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 14));
		btnNewButton.setBounds(291, 18, 91, 23);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(22, 58, 389, 181);
		contentPane.add(scrollPane);
		
		DefaultTableModel model = new DefaultTableModel();
		table = new JTable(model);
		scrollPane.setViewportView(table);
		
		TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<DefaultTableModel>(model);
		table.setRowSorter(sorter);
		
		String sql = "SELECT * FROM members ORDER BY id";
		
		loadTableData();
	}

	private void loadTableData() {
		// TODO Auto-generated method stub
		
			
		
		
	}
		
}

