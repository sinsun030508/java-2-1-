package baicke.project;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JSpinner;

public class project1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	// 클래스 상단 (필드 영역)
	private DefaultListModel<String> listModel;
	private JList<String> list;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					project1 frame = new project1();
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
	public project1() {
		setTitle("메크로 프로젝트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 455);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("마우스이동");
		btnNewButton.setBounds(463, 88, 122, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("딜레이");
		btnNewButton_1.setBounds(463, 154, 122, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("키보드 입력");
		btnNewButton_2.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        JFrame keyFrame = new JFrame("키보드 입력창");
		        keyFrame.setSize(400, 300);
		        keyFrame.setLocationRelativeTo(project1.this);
		        keyFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		        keyFrame.getContentPane().setLayout(null);

		        // 키 표시 라벨
		        JLabel keyLabel = new JLabel("키를 눌러보세요");
		        keyLabel.setBounds(100, 40, 200, 30);
		        keyFrame.getContentPane().add(keyLabel);
		        
		        // 저장 버튼
		        JButton saveButton = new JButton("저장");
		        saveButton.setBounds(140, 90, 100, 30);
		        keyFrame.getContentPane().add(saveButton);
		     // ✅ 저장 버튼에서 기존 모델에 추가
		        saveButton.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                String labelText = keyLabel.getText();
		                if (labelText.startsWith("눌린 키: ")) {
		                    String key = labelText.substring(6);
		                    listModel.addElement(key);  // 기존 메인 프레임의 리스트에 추가됨
		                }
		            }
		        });

		        // 키 입력 시 라벨에 표시
		        keyFrame.addKeyListener(new KeyAdapter() {
		            @Override
		            public void keyPressed(KeyEvent e) {
		                String keyText = KeyEvent.getKeyText(e.getKeyCode());
		                keyLabel.setText("눌린 키: " + keyText);
		            }
		        });

		        // 저장 버튼 누르면 라벨의 텍스트를 리스트에 추가
		        saveButton.addActionListener(new ActionListener() {
		            @Override
		            public void actionPerformed(ActionEvent e) {
		                String labelText = keyLabel.getText();
		                if (labelText.startsWith("눌린 키: ")) {
		                    String key = labelText.substring(6); // "눌린 키: " 제거
		                    listModel.addElement(key); // 리스트에 추가
		                }
		            }
		        });

		        keyFrame.setVisible(true);
		        keyFrame.requestFocusInWindow();
		    }
		    
		});

  				
		btnNewButton_2.setBounds(463, 121, 122, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("마우스좌클릭");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_3.setBounds(463, 24, 122, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_3_1 = new JButton("마우스우클릭");
		btnNewButton_3_1.setBounds(463, 55, 122, 23);
		contentPane.add(btnNewButton_3_1);
		

		listModel = new DefaultListModel<>();
		list = new JList<>(listModel); // 기존 list 변수 재사용
		list.setBounds(12, 24, 422, 315);
		contentPane.add(list);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(79, 361, 142, 22);
		contentPane.add(spinner);

	}
}
