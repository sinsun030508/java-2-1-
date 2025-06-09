package database.ex1;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentFrom extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tename;
	private JTextField tfhak;
	private JTextField tecode;
	private JTextField tfgeade;
	private JTextField tfscore;

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				StudentFrom frame = new StudentFrom();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public StudentFrom() {
		setTitle("학생 정보 등록 폼");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 347, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel.setBounds(47, 29, 49, 18);
		contentPane.add(lblNewLabel);

		tename = new JTextField();
		tename.setFont(new Font("굴림", Font.PLAIN, 14));
		tename.setBounds(129, 29, 149, 21);
		contentPane.add(tename);
		tename.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("학과");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(47, 71, 49, 18);
		contentPane.add(lblNewLabel_1);

		tfhak = new JTextField();
		tfhak.setFont(new Font("굴림", Font.PLAIN, 14));
		tfhak.setBounds(129, 71, 149, 21);
		contentPane.add(tfhak);
		tfhak.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("학번");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(47, 102, 49, 18);
		contentPane.add(lblNewLabel_2);

		tecode = new JTextField();
		tecode.setFont(new Font("굴림", Font.PLAIN, 14));
		tecode.setBounds(129, 102, 149, 21);
		contentPane.add(tecode);
		tecode.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("학년");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(47, 133, 49, 18);
		contentPane.add(lblNewLabel_3);

		tfgeade = new JTextField();
		tfgeade.setFont(new Font("굴림", Font.PLAIN, 14));
		tfgeade.setBounds(129, 133, 149, 21);
		contentPane.add(tfgeade);
		tfgeade.setColumns(10);

		JLabel lblNewLabel_4 = new JLabel("학점");
		lblNewLabel_4.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(47, 164, 49, 18);
		contentPane.add(lblNewLabel_4);

		tfscore = new JTextField();
		tfscore.setFont(new Font("굴림", Font.PLAIN, 14));
		tfscore.setBounds(129, 164, 149, 21);
		contentPane.add(tfscore);
		tfscore.setColumns(10);

		JButton btninsert = new JButton("학생 정보 등록");
		btninsert.setFont(new Font("굴림", Font.PLAIN, 14));
		btninsert.setBounds(64, 229, 214, 39);
		contentPane.add(btninsert);

		btninsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String insertSQL = "INSERT INTO members(name, dept, code, grade, score) VALUES (?, ?, ?, ?, ?)";
					int result = DB.executeUpdate(insertSQL,
							tename.getText(),
							tfhak.getText(),
							tecode.getText(),
							Integer.parseInt(tfgeade.getText()),
							Double.parseDouble(tfscore.getText())
					);

					if (result > 0) {
						JOptionPane.showMessageDialog(null, "학생 정보가 성공적으로 등록되었습니다.");
					} else {
						JOptionPane.showMessageDialog(null, "학생 정보 등록에 실패했습니다.");
					}
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "오류: " + ex.getMessage());
				}
			}
		});
	}
}
