/*
 * import javax.swing.*; import java.awt.*; import java.awt.event.*; import
 * java.sql.*; import java.util.Vector;
 * 
 * public class ScheduleManager extends JFrame { private JTextField dateField,
 * titleField; private JTextArea memoArea; private JButton addButton,
 * loadButton, deleteButton; private JList<String> scheduleList; private
 * DefaultListModel<String> listModel;
 * 
 * private Connection conn; private Vector<Integer> idList = new Vector<>(); //
 * 일정 ID 저장
 * 
 * public ScheduleManager() { setTitle("일정 관리 프로그램"); setSize(500, 400);
 * setDefaultCloseOperation(EXIT_ON_CLOSE); setLocationRelativeTo(null);
 * setLayout(new BorderLayout());
 * 
 * // 입력창 JPanel inputPanel = new JPanel(new GridLayout(3, 2));
 * inputPanel.add(new JLabel("날짜 (YYYY-MM-DD):")); dateField = new JTextField();
 * inputPanel.add(dateField);
 * 
 * inputPanel.add(new JLabel("제목:")); titleField = new JTextField();
 * inputPanel.add(titleField);
 * 
 * inputPanel.add(new JLabel("메모:")); memoArea = new JTextArea(3, 20);
 * inputPanel.add(new JScrollPane(memoArea));
 * 
 * // 버튼 JPanel buttonPanel = new JPanel(); addButton = new JButton("추가");
 * loadButton = new JButton("불러오기"); deleteButton = new JButton("삭제");
 * buttonPanel.add(addButton); buttonPanel.add(loadButton);
 * buttonPanel.add(deleteButton);
 * 
 * // 리스트 listModel = new DefaultListModel<>(); scheduleList = new
 * JList<>(listModel); JScrollPane listScroll = new JScrollPane(scheduleList);
 * 
 * // 배치 add(inputPanel, BorderLayout.NORTH); add(buttonPanel,
 * BorderLayout.CENTER); add(listScroll, BorderLayout.SOUTH);
 * 
 * // DB 연결 connectDB();
 * 
 * // 이벤트 addButton.addActionListener(e -> insertSchedule());
 * loadButton.addActionListener(e -> loadSchedules());
 * deleteButton.addActionListener(e -> deleteSchedule()); }
 * 
 * private void connectDB() { try { String url =
 * "jdbc:mysql://localhost:3306/schedule_db"; String user = "root"; // 사용자 이름
 * String password = "rootroot"; // 비밀번호
 * 
 * conn = DriverManager.getConnection(url, user, password);
 * System.out.println("DB 연결 성공!"); } catch (Exception e) {
 * JOptionPane.showMessageDialog(this, "DB 연결 실패: " + e.getMessage()); } }
 * 
 * private void insertSchedule() { String date = dateField.getText().trim();
 * String title = titleField.getText().trim(); String memo =
 * memoArea.getText().trim();
 * 
 * if (date.isEmpty() || title.isEmpty()) { JOptionPane.showMessageDialog(this,
 * "날짜와 제목은 필수입니다."); return; }
 * 
 * try (PreparedStatement stmt = conn.prepareStatement(
 * "INSERT INTO schedules (date, title, memo) VALUES (?, ?, ?)")) {
 * stmt.setString(1, date); stmt.setString(2, title); stmt.setString(3, memo);
 * stmt.executeUpdate(); JOptionPane.showMessageDialog(this, "일정이 등록되었습니다.");
 * dateField.setText(""); titleField.setText(""); memoArea.setText(""); } catch
 * (SQLException e) { e.printStackTrace(); JOptionPane.showMessageDialog(this,
 * "등록 실패"); } }
 * 
 * private void loadSchedules() { listModel.clear(); idList.clear(); try
 * (Statement stmt = conn.createStatement(); ResultSet rs =
 * stmt.executeQuery("SELECT * FROM schedules ORDER BY date")) {
 * 
 * while (rs.next()) { int id = rs.getInt("id"); String date =
 * rs.getString("date"); String title = rs.getString("title");
 * listModel.addElement(date + " - " + title); idList.add(id); } } catch
 * (SQLException e) { e.printStackTrace(); } }
 * 
 * private void deleteSchedule() { int index = scheduleList.getSelectedIndex();
 * if (index == -1) { JOptionPane.showMessageDialog(this, "삭제할 일정을 선택하세요.");
 * return; }
 * 
 * int id = idList.get(index); try (PreparedStatement stmt =
 * conn.prepareStatement("DELETE FROM schedules WHERE id = ?")) { stmt.setInt(1,
 * id); stmt.executeUpdate(); JOptionPane.showMessageDialog(this, "삭제 완료");
 * loadSchedules(); } catch (SQLException e) { e.printStackTrace(); } }
 * 
 * public static void main(String[] args) { SwingUtilities.invokeLater(() -> new
 * ScheduleManager().setVisible(true)); } }
 */