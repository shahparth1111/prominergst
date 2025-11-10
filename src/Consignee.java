import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;

public class Consignee extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblDataAdded;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consignee frame = new Consignee();
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
	public Consignee() {
		setBounds(0, 0, 1920,1080);
		setUndecorated(true);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		Image img1=new ImageIcon(this.getClass().getResource("/ERP-Module.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img1));
		
		
		final JButton button = new JButton("");
		button.setOpaque(false);
		button.setBorderPainted(false);
		button.setContentAreaFilled(false);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		button.setBounds(1843, 0, 77, 52);
		getContentPane().add(button);
		
		final JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setState(ICONIFIED);
			}
		});
		button_1.setOpaque(false);
		button_1.setContentAreaFilled(false);
		button_1.setBorderPainted(false);
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_1.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_1.setBounds(1686, 0, 64, 52);
		getContentPane().add(button_1);
		
		final JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				Consigner C=new Consigner();
				C.setVisible(true);
				}catch(Exception css){}
			}
		});
		button_2.setOpaque(false);
		button_2.setContentAreaFilled(false);
		button_2.setBorderPainted(false);
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_2.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_2.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_2.setBounds(1156, 61, 164, 141);
		getContentPane().add(button_2);
		
		final JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Consignee C=new Consignee();
					C.setVisible(true);
					}catch(Exception css){}
			}
		});
		button_3.setOpaque(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_3.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_3.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_3.setBounds(1437, 61, 164, 141);
		getContentPane().add(button_3);
		
		final JButton button_4 = new JButton("");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Stock C=new Stock();
					C.setVisible(true);
					}catch(Exception css){}
			}
		});
		button_4.setOpaque(false);
		button_4.setContentAreaFilled(false);
		button_4.setBorderPainted(false);
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_4.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_4.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_4.setBounds(1714, 61, 164, 141);
		getContentPane().add(button_4);
		
		final JButton button_5 = new JButton("");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Purchase C=new Purchase();
					C.setVisible(true);
					}catch(Exception css){}
			}
		});
		button_5.setOpaque(false);
		button_5.setContentAreaFilled(false);
		button_5.setBorderPainted(false);
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_5.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_5.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_5.setBounds(1131, 237, 199, 153);
		getContentPane().add(button_5);
		
		final JButton button_6 = new JButton("");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Invoice C=new Invoice();
					C.setVisible(true);
					}catch(Exception css){}
			}
		});
		button_6.setOpaque(false);
		button_6.setContentAreaFilled(false);
		button_6.setBorderPainted(false);
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_6.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_6.setBounds(1437, 237, 164, 141);
		getContentPane().add(button_6);
		
		final JButton button_7 = new JButton("");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					E_Return C=new E_Return();
					C.setVisible(true);
					}catch(Exception css){}
			}
		});
		button_7.setOpaque(false);
		button_7.setContentAreaFilled(false);
		button_7.setBorderPainted(false);
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_7.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_7.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_7.setBounds(1702, 237, 164, 141);
		getContentPane().add(button_7);
		
		final JButton button_8 = new JButton("");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Ledger C=new Ledger();
					C.setVisible(true);
					}catch(Exception css){}
			}
		});
		button_8.setOpaque(false);
		button_8.setContentAreaFilled(false);
		button_8.setBorderPainted(false);
		button_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_8.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_8.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_8.setBounds(1144, 425, 164, 141);
		getContentPane().add(button_8);
		
		final JButton button_9 = new JButton("");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Profit_Loss C=new Profit_Loss();
					C.setVisible(true);
					}catch(Exception css){}
			}
		});
		button_9.setOpaque(false);
		button_9.setContentAreaFilled(false);
		button_9.setBorderPainted(false);
		button_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_9.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_9.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_9.setBounds(1437, 425, 164, 141);
		getContentPane().add(button_9);
		
		final JButton button_10 = new JButton("");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Database C=new Database();
					C.setVisible(true);
					}catch(Exception css){}
			}
		});
		button_10.setOpaque(false);
		button_10.setContentAreaFilled(false);
		button_10.setBorderPainted(false);
		button_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_10.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_10.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_10.setBounds(1714, 425, 164, 141);
		getContentPane().add(button_10);
		
		final JButton button_11 = new JButton("");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Audit_Reports C=new Audit_Reports();
					C.setVisible(true);
					}catch(Exception css){}
			}
		});
		button_11.setOpaque(false);
		button_11.setContentAreaFilled(false);
		button_11.setBorderPainted(false);
		button_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_11.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_11.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_11.setBounds(1144, 611, 164, 141);
		getContentPane().add(button_11);
		
		final JButton button_12 = new JButton("");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Premium_Payroll C=new Premium_Payroll();
					C.setVisible(true);
					}catch(Exception css){}
			}
		});
		button_12.setOpaque(false);
		button_12.setContentAreaFilled(false);
		button_12.setBorderPainted(false);
		button_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_12.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_12.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_12.setBounds(1437, 611, 164, 141);
		getContentPane().add(button_12);
		
		final JButton button_13 = new JButton("");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Personal_Bank C=new Personal_Bank();
					C.setVisible(true);
					}catch(Exception css){}
			}
		});
		button_13.setOpaque(false);
		button_13.setContentAreaFilled(false);
		button_13.setBorderPainted(false);
		button_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_13.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_13.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_13.setBounds(1714, 611, 164, 141);
		getContentPane().add(button_13);
		
		final JButton button_14 = new JButton("");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{ 
		            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Prominer\\CGST-Act.pdf");
		        }catch (Exception escf){} 
			}
		});
		button_14.setOpaque(false);
		button_14.setContentAreaFilled(false);
		button_14.setBorderPainted(false);
		button_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_14.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_14.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_14.setBounds(1089, 791, 77, 127);
		getContentPane().add(button_14);
		
		final JButton button_15 = new JButton("");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{ 
		            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Prominer\\IGST-Act.pdf");
		        }catch (Exception escf){} 
			}
		});
		button_15.setOpaque(false);
		button_15.setContentAreaFilled(false);
		button_15.setBorderPainted(false);
		button_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_15.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_15.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_15.setBounds(1260, 791, 77, 127);
		getContentPane().add(button_15);
		
		final JButton button_16 = new JButton("");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{ 
		            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Prominer\\GST Payment Process.pdf");
		        }catch (Exception escf){} 
			}
		});
		button_16.setOpaque(false);
		button_16.setContentAreaFilled(false);
		button_16.setBorderPainted(false);
		button_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_16.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_16.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_16.setBounds(1424, 791, 77, 127);
		getContentPane().add(button_16);
		
		final JButton button_17 = new JButton("");
		button_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{ 
		            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Prominer\\Goods Rates.pdf");
		        }catch (Exception escf){} 
			}
		});
		button_17.setOpaque(false);
		button_17.setContentAreaFilled(false);
		button_17.setBorderPainted(false);
		button_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_17.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_17.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_17.setBounds(1585, 791, 77, 127);
		getContentPane().add(button_17);
		
		final JButton button_18 = new JButton("");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{ 
		            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Prominer\\Service Rates.pdf");
		        }catch (Exception escf){} 
			}
		});
		button_18.setOpaque(false);
		button_18.setContentAreaFilled(false);
		button_18.setBorderPainted(false);
		button_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_18.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_18.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_18.setBounds(1757, 791, 77, 127);
		getContentPane().add(button_18);
		
		final JButton button_19 = new JButton("");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{ 
		            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Prominer\\Abolished Cesses 2015.pdf");
		        }catch (Exception escf){} 
			}
		});
		button_19.setOpaque(false);
		button_19.setContentAreaFilled(false);
		button_19.setBorderPainted(false);
		button_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_19.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_19.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_19.setBounds(1089, 940, 77, 127);
		getContentPane().add(button_19);
		
		final JButton button_20 = new JButton("");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{ 
		            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Prominer\\UT-GST Act.pdf");
		        }catch (Exception escf){} 
			}
		});
		button_20.setOpaque(false);
		button_20.setContentAreaFilled(false);
		button_20.setBorderPainted(false);
		button_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_20.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_20.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_20.setBounds(1260, 940, 77, 127);
		getContentPane().add(button_20);
		
		final JButton button_21 = new JButton("");
		button_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{ 
		            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Prominer\\IGST Exemption.pdf");
		        }catch (Exception escf){} 
			}
		});
		button_21.setOpaque(false);
		button_21.setContentAreaFilled(false);
		button_21.setBorderPainted(false);
		button_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_21.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_21.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_21.setBounds(1424, 931, 77, 127);
		getContentPane().add(button_21);
		
		final JButton button_22 = new JButton("");
		button_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{ 
		            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Prominer\\FAQ GST.pdf");
		        }catch (Exception escf){} 
			}
		});
		button_22.setOpaque(false);
		button_22.setContentAreaFilled(false);
		button_22.setBorderPainted(false);
		button_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_22.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_22.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_22.setBounds(1585, 940, 77, 127);
		getContentPane().add(button_22);
		
		final JButton button_23 = new JButton("");
		button_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{ 
		            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + "C:\\Prominer\\Compensation Cess.pdf");
		        }catch (Exception escf){} 
			}
		});
		button_23.setOpaque(false);
		button_23.setContentAreaFilled(false);
		button_23.setBorderPainted(false);
		button_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_23.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_23.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_23.setBounds(1757, 931, 77, 127);
		getContentPane().add(button_23);
		
		JButton btnViewConsigner = new JButton("View Consignee");
		btnViewConsigner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Consignee3 C=new Consignee3();
					C.setVisible(true);
				}catch(Exception vrs){}
			}
		});
		btnViewConsigner.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnViewConsigner.setBounds(237, 721, 172, 39);
		getContentPane().add(btnViewConsigner);
		
		JButton btnEditConsigner = new JButton("Edit Consignee");
		btnEditConsigner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Consignee1 C=new Consignee1();
					C.setVisible(true);
				}catch(Exception vrs){}
			}
		});
		btnEditConsigner.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnEditConsigner.setBounds(421, 721, 172, 39);
		getContentPane().add(btnEditConsigner);
		
		JButton btnDeleteConsigner = new JButton("Delete Consignee");
		btnDeleteConsigner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Consignee2 C=new Consignee2();
					C.setVisible(true);
				}catch(Exception vrs){}
			}
		});
		btnDeleteConsigner.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnDeleteConsigner.setBounds(605, 721, 189, 39);
		getContentPane().add(btnDeleteConsigner);
		
		
		final JButton button_24 = new JButton("");
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home H=new Home();
				H.setVisible(true);
			}
		});
		button_24.setOpaque(false);
		button_24.setContentAreaFilled(false);
		button_24.setBorderPainted(false);
		button_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_24.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				button_24.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
			}
		});
		button_24.setBounds(860, 1015, 72, 65);
		getContentPane().add(button_24);
		
		textField = new JTextField();
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(480, 225, 247, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(480, 295, 247, 28);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(480, 360, 247, 28);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(480, 426, 247, 28);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(480, 489, 247, 28);
		getContentPane().add(textField_4);
		
		JButton btnAddEntry = new JButton("Add Entry");
		btnAddEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try
				{
					File file=new File(Data.path+"buyer.txt");
					if(file.exists()==false)
					{
						file.createNewFile();
						WriteFile W=new WriteFile(Data.path+"buyer.txt",true);
						W.writeToFile("B001§Select Company§Select Address§Select Contact§Select Email");
					}
					WriteFile W=new WriteFile(Data.path+"buyer.txt",true);
					int compCount=Data.getLines(Data.path+"buyer.txt");
					W.writeToFile("B00"+compCount+"§"+textField.getText()+"§"+textField_1.getText()+"§"+textField_2.getText()+"§"+
							textField_3.getText()+"§"+textField_4.getText());
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					lblDataAdded.setVisible(true);
				}catch(Exception csf){}
			}
		});
		btnAddEntry.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddEntry.setBounds(426, 567, 130, 28);
		getContentPane().add(btnAddEntry);
		
		JLabel lblCompanyName = new JLabel("Company Name");
		lblCompanyName.setForeground(Color.WHITE);
		lblCompanyName.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblCompanyName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyName.setBounds(226, 225, 211, 28);
		getContentPane().add(lblCompanyName);
		
		JLabel lblCompanyAddress = new JLabel("Company Address");
		lblCompanyAddress.setForeground(Color.WHITE);
		lblCompanyAddress.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblCompanyAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyAddress.setBounds(226, 295, 211, 28);
		getContentPane().add(lblCompanyAddress);
		
		JLabel lblContactNumber = new JLabel("GSTIN");
		lblContactNumber.setForeground(Color.WHITE);
		lblContactNumber.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblContactNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNumber.setBounds(226, 360, 211, 28);
		getContentPane().add(lblContactNumber);
		
		JLabel lblContactNumber_1 = new JLabel("Contact Number");
		lblContactNumber_1.setForeground(Color.WHITE);
		lblContactNumber_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblContactNumber_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNumber_1.setBounds(226, 426, 211, 28);
		getContentPane().add(lblContactNumber_1);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(226, 489, 211, 28);
		getContentPane().add(lblEmail);
		
		JLabel lblNewEntry = new JLabel("New Entry");
		lblNewEntry.setForeground(Color.WHITE);
		lblNewEntry.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewEntry.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewEntry.setBounds(338, 127, 275, 58);
		getContentPane().add(lblNewEntry);
		
		lblDataAdded = new JLabel("Data Added");
		lblDataAdded.setVisible(false);
		lblDataAdded.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataAdded.setForeground(Color.GREEN);
		lblDataAdded.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblDataAdded.setBounds(398, 611, 189, 28);
		getContentPane().add(lblDataAdded);
		getContentPane().add(lblNewLabel);
		
	}
}
