/*
 * package W13_01;
 * 
 * import java.awt.EventQueue;
 * 
 * import javax.swing.JFileChooser; import javax.swing.JFrame; import
 * javax.swing.JPanel; import javax.swing.border.EmptyBorder; import
 * javax.swing.filechooser.FileFilter; import
 * javax.swing.filechooser.FileNameExtensionFilter; import javax.swing.JMenuBar;
 * import javax.swing.JMenu; import javax.swing.JMenuItem; import
 * java.awt.event.ActionListener; import java.io.BufferedReader; import
 * java.io.BufferedWriter; import java.io.File; import
 * java.io.FileNotFoundException; import java.io.FileReader; import
 * java.io.FileWriter; import java.io.IOException; import
 * java.awt.event.ActionEvent;
 * 
 * public class taEditor extends JFrame {
 * 
 * private static final long serialVersionUID = 1L; private JPanel contentPane;
 * 
 * private void openFunc() { JFileChooser fc = new JFileChooser(); File curDir =
 * new File("D/Temp"); fc.showOpenDialog(contentPane);
 * 
 * File selectedFile = fc.getSelectedFile();
 * 
 * BufferedReader br = null; String line = null;
 * 
 * try { br=new BufferedReader(new FileReader(selectedFile)); try { while(( line
 * = br.readLine()) != null) { taEditor.append(line + "\n"); } } catch
 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); } }
 * catch (FileNotFoundException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }finally { if(br != null) { try { br.close(); }catch
 * (IOException e) { e.printStackTrace(); } } }
 * 
 * 
 * 
 * }private void saveFunc() { JFileChooser fc = new JFileChooser(); File curDir
 * = new File("D/Temp"); fc.showOpenDialog(contentPane);
 * fc.addChoosableFileFilter(new FileNameExtensionFilter("java", null)); File
 * selectedFile = fc.getSelectedFile();
 * 
 * BufferedWriter bw = null; String line = null;
 * 
 * try { bw=new BufferedWriter(new FileWriter(selectedFile));
 * 
 * try { while(( line = bw.) != null) { taEditor.append(line + "\n"); } } catch
 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); } }
 * catch (FileNotFoundException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }finally {
 * 
 * } } private static void append(String string) { // TODO Auto-generated method
 * stub
 * 
 * }
 *//**
	 * Launch the application.
	 */
/*
 * public static void main(String[] args) { EventQueue.invokeLater(new
 * Runnable() { public void run() { try { taEditor frame = new taEditor();
 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
 * }
 * 
 *//**
	 * Create the frame.
	 *//*
		 * public taEditor() { setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 * setBounds(100, 100, 450, 300);
		 * 
		 * JMenuBar menuBar = new JMenuBar(); setJMenuBar(menuBar);
		 * 
		 * JMenu mnNewMenu = new JMenu("File"); menuBar.add(mnNewMenu);
		 * 
		 * JMenuItem mntmNewMenuItem_1 = new JMenuItem("oftenFile");
		 * mntmNewMenuItem_1.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * 
		 * } }); mnNewMenu.add(mntmNewMenuItem_1);
		 * 
		 * JMenuItem mntmNewMenuItem_2 = new JMenuItem("save");
		 * mntmNewMenuItem_2.addActionListener(new ActionListener() { public void
		 * actionPerformed(ActionEvent e) {
		 * 
		 * } }); mnNewMenu.add(mntmNewMenuItem_2);
		 * 
		 * JMenu mnNewMenu_1 = new JMenu("New menu"); menuBar.add(mnNewMenu_1);
		 * 
		 * JMenuItem mntmNewMenuItem_3 = new JMenuItem("New menu item");
		 * mnNewMenu_1.add(mntmNewMenuItem_3);
		 * 
		 * JMenuItem mntmNewMenuItem_4 = new JMenuItem("New menu item");
		 * mnNewMenu_1.add(mntmNewMenuItem_4);
		 * 
		 * JMenu mnNewMenu_2 = new JMenu("New menu"); menuBar.add(mnNewMenu_2);
		 * 
		 * JMenuItem mntmNewMenuItem_5 = new JMenuItem("New menu item");
		 * mnNewMenu_2.add(mntmNewMenuItem_5);
		 * 
		 * JMenuItem mntmNewMenuItem_6 = new JMenuItem("New menu item");
		 * mnNewMenu_2.add(mntmNewMenuItem_6);
		 * 
		 * JMenu mnNewMenu_3 = new JMenu("New menu"); menuBar.add(mnNewMenu_3);
		 * 
		 * JMenuItem mntmNewMenuItem_7 = new JMenuItem("New menu item");
		 * mnNewMenu_3.add(mntmNewMenuItem_7);
		 * 
		 * JMenuItem mntmNewMenuItem_8 = new JMenuItem("New menu item");
		 * mnNewMenu_3.add(mntmNewMenuItem_8);
		 * 
		 * JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		 * mnNewMenu_3.add(mntmNewMenuItem); contentPane = new JPanel();
		 * contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		 * 
		 * setContentPane(contentPane); contentPane.setLayout(null); } }
		 */