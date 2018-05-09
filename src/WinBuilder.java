import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JScrollPane;

public class WinBuilder extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WinBuilder frame = new WinBuilder();
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
	public WinBuilder() {
		setTitle("\u6F0F\u6D1E\u5355\u81EA\u52A8\u83B7\u53D6\u5DE5\u5177_v1.0");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 558, 458);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u8F93\u5165\u4F60\u7684cookie");
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		lblNewLabel.setBounds(15, 15, 167, 21);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		textField.setBounds(15, 51, 506, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lbldts = new JLabel("\u8F93\u5165DTS\u94FE\u63A5");
		lbldts.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		lbldts.setBounds(15, 104, 133, 21);
		contentPane.add(lbldts);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 18));
		textArea.setBounds(15, 140, 506, 165);
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 140, 506, 165);
		scrollPane.add(textArea);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		contentPane.add(scrollPane);
		scrollPane.setViewportView(textArea);
		
		JButton button = new JButton("\u751F\u6210\u6587\u4EF6");
		button.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 20));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String cookie = textField.getText();
				String[] urlList = textArea.getText().split("\n");
				for(int i = 0;i < urlList.length; i++) {
					System.out.println(urlList[i]);
				}
				textArea.append("\n*************************");
			}
		});
		button.setBounds(188, 332, 135, 38);
		contentPane.add(button);

	}
}
