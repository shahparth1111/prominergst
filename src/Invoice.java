import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import javax.print.PrintException;
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
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Invoice extends JFrame  
{
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	/*Selling rate
	quantity 
	unit gst rate*/
	int productCount=0;
	String sellingrate[]=new String[25];
	String HSN[]=new String[25];
	String quantity[]=new String[25];
	String unit[]=new String[10];
	String gstRatee[]=new String[25];
	String taxAmount[]=new String[25];
	String discount[]=new String[25];
	static String AmtWords1="";
	
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
	JLabel lblStockUpdated;
	private JLabel label;
	String sellDate="";
	JLabel label_1;JLabel label_2;
	JButton btnAddEntry;
	private JLabel lblEntryEdited;
	String UID="",Code="",PID="",companyGST="";
	double totalGST=0;double gstRate=0;
	double totalAmt=0,amtWoTax=0;
	String companyAddress="";
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					
					
					

					Invoice frame = new Invoice();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	@SuppressWarnings("rawtypes")
	public Invoice() throws IOException {
		sellDate=dateFormat.format(date); 
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
					Invoice C=new Invoice();
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
		
		JButton btnViewConsigner = new JButton("New Product");
		btnViewConsigner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Purchase1 C=new Purchase1();
					C.setVisible(true);
				}catch(Exception vrs){}
			}
		});
		btnViewConsigner.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnViewConsigner.setBounds(237, 721, 172, 39);
		getContentPane().add(btnViewConsigner);
		
		JButton btnEditConsigner = new JButton("New Company");
		btnEditConsigner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Invoice C=new Invoice();
					C.setVisible(true);
				}catch(Exception vrs){}
			}
		});
		btnEditConsigner.setFont(new Font("Times New Roman", Font.PLAIN, 21));
		btnEditConsigner.setBounds(421, 721, 172, 39);
		getContentPane().add(btnEditConsigner);
		
		JButton btnDeleteConsigner = new JButton("Bank Balance");
		btnDeleteConsigner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Consigner2 C=new Consigner2();
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
		File fff=new File(Data.path+"Invoice.txt");
		if(fff.exists()==false)
		{
			textField.setText("I17/A1");
			
		}
		else
		{
			int lines=Data.getLines(Data.path+"Invoice.txt");
			textField.setText("I17/A"+(lines)+"");
		}
		textField.setEditable(false);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setBounds(472, 217, 247, 28);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(472, 264, 247, 31);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(472, 317, 247, 28);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(472, 368, 247, 28);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(472, 419, 247, 28);
		getContentPane().add(textField_4);
		
		String[] supplierName=Data.getSecond(Data.path+"product.txt");
		@SuppressWarnings("unchecked")
		final JComboBox comboBox = new JComboBox(supplierName);
		comboBox.setFont(new Font("Times New Roman", Font.PLAIN, 25));

		comboBox.addItemListener(
		new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				try {
					String selected=Data.getLine("P00"+(comboBox.getSelectedIndex()+1)+"", Data.path+"product.txt");
					PID="P00"+(comboBox.getSelectedIndex()+1);
					String thirdWord=Data.getThirdWord(selected);
					String secondWord=Data.getSecondWord(selected);
					textField_4.setText(thirdWord);
					Code=Data.getThirdWord(selected);
					label.setText(secondWord+"");
				}catch (Exception e) {}					
			}
		});
		comboBox.setBounds(314, 114, 345, 28);
		getContentPane().add(comboBox);
		
		
		String[] companyName=Data.getSecond(Data.path+"supplier.txt");
		@SuppressWarnings("unchecked")
		final JComboBox comboBox_1 = new JComboBox(companyName);
		comboBox_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		comboBox_1.addItemListener(
		new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				try {
					String selected=Data.getLine("C00"+(comboBox_1.getSelectedIndex()+1)+"", Data.path+"supplier.txt");
					UID="C00"+(comboBox_1.getSelectedIndex()+1);
					String secondWord=Data.getSecondWord(selected);
					label_2.setText(secondWord+"");
					label_2.setVisible(true);
				}catch (Exception e) {}					
			}
		});
		comboBox_1.setBounds(130, 155, 345, 28);
		getContentPane().add(comboBox_1);
		
		String[] BcompanyName=Data.getSecond(Data.path+"buyer.txt");
		@SuppressWarnings("unchecked")
		final JComboBox comboBox_2 = new JComboBox(BcompanyName);
		comboBox_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		comboBox_2.addItemListener(
		new ItemListener(){
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				try {
					String selected=Data.getLine("B00"+(comboBox_2.getSelectedIndex()+1)+"", Data.path+"buyer.txt");
					UID="B00"+(comboBox_2.getSelectedIndex()+1);
					String secondWord=Data.getSecondWord(selected);
					companyGST=Data.getFourthWord(selected);
					companyAddress=Data.getThirdWord(selected)+" " +
							"(P) :"+Data.getFifthWord(selected)+" "+
							Data.getSixthWord(selected);
					label_1.setText(secondWord+"");
					label_1.setVisible(true);
				}catch (Exception e) {}					
			}
		});
		comboBox_2.setBounds(130, 155, 345, 28);
		getContentPane().add(comboBox_1);
		comboBox_2.setBounds(519, 155, 345, 28);
		getContentPane().add(comboBox_2);
		
		
		btnAddEntry = new JButton("Add Product");
		btnAddEntry.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{			
					String pLine=Data.getProductLine(PID, Data.path+"ledger.txt");// For Quantity & Stock 
					int Stock=Integer.parseInt(Data.getEleventhWord(pLine));
					int MRP=Integer.parseInt(Data.getNinethWord(pLine));
					String mfgDate=Data.getFourteenthWord(pLine);
					String expDate=Data.getFifteenthWord(pLine);
					int Quantity=Integer.parseInt(textField_2.getText());
					Stock-=Quantity;
					int ID=Data.getLines(Data.path+"ledger.txt");
					String addLine=PID+"§"+label.getText()+"§"+Code+"§"+label_1.getText()+"§"+textField_1.getText()+"§"+"Sell"+
					"§"+totalGST+"§"+MRP+"§"+textField_2.getText()+"§"+
					Stock+"§"+sellDate+"§"+companyGST+"§"+
					mfgDate+"§"+expDate+"§"+textField.getText()+"§";
					WriteFile W=new WriteFile(Data.path+"ledger.txt",true);
					W.writeToFile("L00"+ID+"§"+addLine);
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setEditable(false);
					textField_6.setEditable(false);
					textField_7.setEditable(false);
					textField_8.setEditable(false);
					label.setText("");
					lblStockUpdated.setVisible(true);
					comboBox.setSelectedIndex(0);
					comboBox_1.setEditable(false);
					comboBox_2.setEditable(false);
					lblEntryEdited.setVisible(true);
					sellingrate[productCount]=textField_1.getText();
					quantity[productCount]=textField_2.getText();
					unit[productCount]=textField_3.getText();
					HSN[productCount]=Code;
					gstRatee[productCount++]=textField_4.getText();		
					File fff=new File(Data.path+"Invoice.txt");
					if(fff.exists()==false)
					{
						fff.createNewFile();
						WriteFile W1=new WriteFile(Data.path+"Invoice.txt",true);
						W1.writeToFile(companyGST+"§"+textField.getText()+"§"+sellDate+"§"+totalAmt+"§"+
								textField_5.getText()+"§"+textField_8.getText()+"§"+"Regular"+"§"+
								textField_1.getText()+"§"+amtWoTax+"§"+"0"+"§");
						
					}
					else
					{
						WriteFile W1=new WriteFile(Data.path+"Invoice.txt",true);
						W1.writeToFile(companyGST+"§"+textField.getText()+"§"+sellDate+"§"+totalAmt+"§"+
								textField_5.getText()+"§"+textField_8.getText()+"§"+"Regular"+"§"+
								textField_1.getText()+"§"+amtWoTax+"§"+"0"+"§");
					}
				}catch(Exception fsef){}
			}
		});
		

		btnAddEntry.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnAddEntry.setBounds(328, 662, 165, 28);
		getContentPane().add(btnAddEntry);
		
		
		JLabel lblCompanyName = new JLabel("Selling Rate \u20B9");
		lblCompanyName.setForeground(Color.WHITE);
		lblCompanyName.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblCompanyName.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyName.setBounds(218, 263, 211, 28);
		getContentPane().add(lblCompanyName);
		
		JLabel lblCompanyAddress = new JLabel("Vehicle No");
		lblCompanyAddress.setForeground(Color.WHITE);
		lblCompanyAddress.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblCompanyAddress.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompanyAddress.setBounds(218, 522, 211, 28);
		getContentPane().add(lblCompanyAddress);
		
		JLabel lblContactNumber = new JLabel("Quantity");
		lblContactNumber.setForeground(Color.WHITE);
		lblContactNumber.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblContactNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNumber.setBounds(218, 315, 211, 28);
		getContentPane().add(lblContactNumber);
		
		JLabel lblContactNumber_1 = new JLabel("Place of Supply");
		lblContactNumber_1.setForeground(Color.WHITE);
		lblContactNumber_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblContactNumber_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactNumber_1.setBounds(218, 469, 211, 28);
		getContentPane().add(lblContactNumber_1);
		
		JLabel lblEmail = new JLabel("GST Rate");
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setBounds(218, 417, 211, 28);
		getContentPane().add(lblEmail);
		
		JLabel lblNewEntry = new JLabel("Invoice");
		lblNewEntry.setForeground(Color.WHITE);
		lblNewEntry.setFont(new Font("Times New Roman", Font.BOLD, 35));
		lblNewEntry.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewEntry.setBounds(342, 57, 275, 58);
		getContentPane().add(lblNewEntry);
		
		lblEntryEdited = new JLabel("Invoice Created");
		lblEntryEdited.setVisible(false);
		lblEntryEdited.setForeground(Color.GREEN);
		lblEntryEdited.setHorizontalAlignment(SwingConstants.CENTER);
		lblEntryEdited.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblEntryEdited.setBounds(276, 692, 199, 28);
		getContentPane().add(lblEntryEdited);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.GREEN);
		label.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label.setBounds(140, 185, 314, 28);
		getContentPane().add(label);
		
		label_1 = new JLabel("");
		label_1.setVisible(false);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.ORANGE);
		label_1.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label_1.setBounds(472, 185, 303, 28);
		getContentPane().add(label_1);
		
		JLabel lblManufacturingDate = new JLabel("");
		lblManufacturingDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblManufacturingDate.setForeground(Color.WHITE);
		lblManufacturingDate.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblManufacturingDate.setBounds(218, 469, 211, 28);
		getContentPane().add(lblManufacturingDate);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(472, 471, 247, 28);
		getContentPane().add(textField_5);
		
		JLabel lblExpiryDate = new JLabel(" Unit");
		lblExpiryDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblExpiryDate.setForeground(Color.WHITE);
		lblExpiryDate.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblExpiryDate.setBounds(218, 366, 211, 28);
		getContentPane().add(lblExpiryDate);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_6.setColumns(10);
		textField_6.setBounds(472, 524, 247, 28);
		getContentPane().add(textField_6);
		

		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_7.setColumns(10);
		textField_7.setBounds(472, 572, 247, 28);
		getContentPane().add(textField_7);
		
		JLabel lblInvoiceNumber = new JLabel("Invoice Number");
		lblInvoiceNumber.setHorizontalAlignment(SwingConstants.CENTER);
		lblInvoiceNumber.setForeground(Color.WHITE);
		lblInvoiceNumber.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblInvoiceNumber.setBounds(228, 215, 211, 28);
		getContentPane().add(lblInvoiceNumber);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField_8.setColumns(10);
		textField_8.setBounds(472, 621, 247, 28);
		getContentPane().add(textField_8);
		
		JLabel lblReverseChargeApplicable = new JLabel("Reverse Charge ");
		lblReverseChargeApplicable.setHorizontalAlignment(SwingConstants.CENTER);
		lblReverseChargeApplicable.setForeground(Color.WHITE);
		lblReverseChargeApplicable.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblReverseChargeApplicable.setBounds(178, 619, 285, 28);
		getContentPane().add(lblReverseChargeApplicable);
		
		JLabel lblTaxPaid = new JLabel("E-Commerse GSTIN");
		lblTaxPaid.setHorizontalAlignment(SwingConstants.CENTER);
		lblTaxPaid.setForeground(Color.WHITE);
		lblTaxPaid.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblTaxPaid.setBounds(218, 570, 211, 28);
		getContentPane().add(lblTaxPaid);
		
		lblStockUpdated = new JLabel("Stock Updated");
		lblStockUpdated.setVisible(false);
		lblStockUpdated.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		lblStockUpdated.setForeground(Color.ORANGE);
		lblStockUpdated.setHorizontalAlignment(SwingConstants.CENTER);
		lblStockUpdated.setBounds(501, 692, 211, 28);
		getContentPane().add(lblStockUpdated);
		
		label_2 = new JLabel("");
		label_2.setVisible(false);
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.CYAN);
		label_2.setBounds(756, 185, 303, 28);
		getContentPane().add(label_2);

		JButton button_25 = new JButton("Create Invoice");
		button_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				/*	PDFMaker(sellDate,
							textField_1.getText(), 
							label_1.getText(),
							companyAddress,
							companyGST,
							"01 Gujarat",
							"GJ012197",
							"N",
							"Same as Company Name",
							"Same as Company Address",
							quantity,
							unit,
							HSN,
							gstRatee,
							"INR 5,400",
							"INR 65,400",
							"Sixty Four Thousand Five Hundred Only",
							"INR 60,000",
							"Invoice");*/
				}catch(Exception sedf){}
			}
		});
		button_25.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		button_25.setBounds(516, 662, 165, 28);
		getContentPane().add(button_25);
		getContentPane().add(lblNewLabel);
		
	}


	public static void PDFMaker(String Date,
								String InvoiceNo, 
								String companyName,
								String companyAddress,
								String GSTIN,
								String supplyPlace,
								String vehicleNo,
								String reverseCharge,
								String shippingName,
								String shippingAddress,
								String[] productQuantity,
								String[] productUnit,
								String[] HSNCode,
								String[] taxRate,
								String[] taxAmount,
								String netPrice,
								String[] discount,
								String pdfName)throws PrintException, IOException 
	{

		/**
		 * This class is used to modify an existing pdf file using iText jar.
		 * @author Parth Shah
		 */
String productName="Metacin (50x50) 500mg";
		try {

			


			for(int j=0;j<1;j++)
			{
				//Create PdfReader instance.
				PdfReader pdfReader = 
						new PdfReader("Blankk.pdf");
		
				//Create PdfStamper instance.
				PdfStamper pdfStamper = new PdfStamper(pdfReader,
				   new FileOutputStream("C:/Users/"+System.getProperty("user.name")+"/Desktop/"+pdfName+""+".pdf"));

				
				//Create BaseFont instance.
				BaseFont baseFont = BaseFont.createFont(
		                BaseFont.COURIER_BOLD,
		                BaseFont.CP1252, BaseFont.EMBEDDED);
				
				//Get the number of pages in pdf.
				int pages = pdfReader.getNumberOfPages(); 
				
						for(int i=1; i<=pages; i++) { 
							int a=500,b=705;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 12);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(Date+"");
							
							pageContentByte.endText();
						}
						
						for(int i=1; i<=pages; i++) { 
							int a=513,b=690;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 12);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(InvoiceNo+"");
							
							pageContentByte.endText();
						}
						
						
						for(int i=1; i<=pages; i++) { 
							int a=52,b=640;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 12);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(companyName+"");
							
							pageContentByte.endText();
						}
						//Address
						Scanner in=new Scanner(companyAddress);
						String Ad1="",Ad2="",Ad3="",Ad4="";
						int wordCount=0;
						while(in.hasNext()==true)
						{
							String G=in.next();
							wordCount+=G.length();
							if(wordCount<=30)
							{
								Ad1+=G+" ";
							}
							else if(wordCount>30 && wordCount<=60)
							{
								Ad2+=G+" ";
							}
							else if(wordCount>60 && wordCount<=85)
							{
								Ad3+=G+" ";
							}
							else
							{
								Ad4+=G+" ";
							}
						}
						for(int i=1; i<=pages; i++) { 
							int a=52,b=625;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(Ad1+"");
							
							pageContentByte.endText();
						}
						
						for(int i=1; i<=pages; i++) { 
							int a=52,b=610;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(Ad2+"");
							
							pageContentByte.endText();
						}
						
						for(int i=1; i<=pages; i++) { 
							int a=52,b=595;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(Ad3+"");
							
							pageContentByte.endText();
						}
						for(int i=1; i<=pages; i++) { 
							int a=52,b=580;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(Ad4+"");
							
							pageContentByte.endText();
						}
						
						
						for(int i=1; i<=pages; i++) { 
							int a=95,b=565;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(GSTIN+"");
							
							pageContentByte.endText();
						}

						for(int i=1; i<=pages; i++) { 
							int a=402,b=657;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(supplyPlace+"");
							
							pageContentByte.endText();
						}
						
						for(int i=1; i<=pages; i++) { 
							int a=380,b=637;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(vehicleNo+"");
							
							pageContentByte.endText();
						}
						
						for(int i=1; i<=pages; i++) { 
							int a=403,b=618;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(reverseCharge+"");
							
							pageContentByte.endText();
						}
						
						for(int i=1; i<=pages; i++) { 
							int a=403,b=598;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(shippingName+"");
							
							pageContentByte.endText();
						}
						Scanner in1=new Scanner(shippingAddress);
						String Ad11="",Ad21="";
						int wordCount1=0;
						while(in1.hasNext()==true)
						{
							String G1=in1.next();
							wordCount1+=G1.length();
							if(wordCount1<=30)
							{
								Ad11+=G1+" ";
							}
							else if(wordCount1>30 && wordCount1<=60)
							{
								if(G1.equals("Same")==false
										&&
										G1.equals("as")==false
										&&
										G1.equals("Company")==false)
								{
									Ad21+=G1+" ";
								}

							}
						}
						for(int i=1; i<=pages; i++) { 
							int a=411,b=580;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(Ad11+"");
							
							pageContentByte.endText();
						}
						for(int i=1; i<=pages; i++) { 
							int a=411,b=565;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(Ad21+"");
							
							pageContentByte.endText();
						}
						
						for(int i=1; i<=pages; i++) { 
							int a=411,b=565;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 11);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(Ad21+"");
							
							pageContentByte.endText();
						}
						boolean space=false;
						for(int k=0;k<25;k++)
						{
							// Product Description
							if(space==true)
							{
								space=false;
								continue;
							}
							else{
							for(int i=1; i<=pages; i++) { 
								int a=40,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 11);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("1"+"");
								
								pageContentByte.endText();
							}
							
							for(int i=1; i<=pages; i++) { 
								int a=59,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 11);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("2000"+"");
								
								pageContentByte.endText();
							}
							
							for(int i=1; i<=pages; i++) { 
								int a=105,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("50"+"");
								
								pageContentByte.endText();
							}
							
							for(int i=1; i<=pages; i++) { 
								int a=126,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("Bx"+"");
								
								pageContentByte.endText();
							}
							Scanner in2=new Scanner(productName);
							String Ad12="",Ad22="";
							int wordCount2=0;
							while(in2.hasNext()==true)
							{
								String G2=in2.next();
								wordCount2+=G2.length();
								if(wordCount2<=23)
								{
									Ad12+=G2+" ";
								}
								else if(wordCount2>23 && wordCount2<=56)
								{		
									Ad22+=G2+" ";
								}
							}
							if(wordCount2>23)
							{
								for(int i=1; i<=pages; i++) { 
									int a=144,b=526-(k*10);
									//Contain the pdf data.
									PdfContentByte pageContentByte = 
											pdfStamper.getOverContent(i);
									
									pageContentByte.beginText();
									//Set text font and size.
									pageContentByte.setFontAndSize(baseFont, 10);
									pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
									pageContentByte.setTextMatrix(a, b);				
									//Write text
									pageContentByte.showText("Metacin (50x50) 500mg "+"");
									
									pageContentByte.endText();
								}
								
								for(int i=1; i<=pages; i++) { 
									int a=144,b=526-(k*10);
									//Contain the pdf data.
									PdfContentByte pageContentByte = 
											pdfStamper.getOverContent(i);
									
									pageContentByte.beginText();
									//Set text font and size.
									pageContentByte.setFontAndSize(baseFont, 10);
									pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
									pageContentByte.setTextMatrix(a, b);				
									//Write text
									pageContentByte.showText("Metacin (50x50) 500mg "+"");
									
									pageContentByte.endText();
								}
								space=true;
							}
							else
							{
								for(int i=1; i<=pages; i++) { 
									int a=144,b=526-(k*10);
									//Contain the pdf data.
									PdfContentByte pageContentByte = 
											pdfStamper.getOverContent(i);
									
									pageContentByte.beginText();
									//Set text font and size.
									pageContentByte.setFontAndSize(baseFont, 10);
									pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
									pageContentByte.setTextMatrix(a, b);				
									//Write text
									pageContentByte.showText("Metacin (50x50) 500mg "+"");
									
									pageContentByte.endText();
								}
							}
							
							
							for(int i=1; i<=pages; i++) { 
								int a=300,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("0306"+"");
								
								pageContentByte.endText();
							}
							
							for(int i=1; i<=pages; i++) { 
								int a=330,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("2%"+"");
								
								pageContentByte.endText();
							}
							//Total Taxable Amount after discount
							for(int i=1; i<=pages; i++) { 
								int a=350,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("9800"+"");
								
								pageContentByte.endText();
							}
							
						// Tax Rates SGST CGST & IGST
							
							
							for(int i=1; i<=pages; i++) { 
								int a=384,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("9%"+"");
								
								pageContentByte.endText();
							}
							
							for(int i=1; i<=pages; i++) { 
								int a=408,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("9%"+"");
								
								pageContentByte.endText();
							}
							
							for(int i=1; i<=pages; i++) { 
								int a=427,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("-"+"");
								
								pageContentByte.endText();
							}
							
							
							for(int i=1; i<=pages; i++) { 
								int a=450,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("882"+"");
								
								pageContentByte.endText();
							}
							
							for(int i=1; i<=pages; i++) { 
								int a=475,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("882"+"");
								
								pageContentByte.endText();
							}
							
							for(int i=1; i<=pages; i++) { 
								int a=503,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("-"+"");
								
								pageContentByte.endText();
							}
							
							
							
							
							
							
							

							for(int i=1; i<=pages; i++) { 
								int a=530,b=526-(k*10);
								//Contain the pdf data.
								PdfContentByte pageContentByte = 
										pdfStamper.getOverContent(i);
								
								pageContentByte.beginText();
								//Set text font and size.
								pageContentByte.setFontAndSize(baseFont, 10);
								pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
								pageContentByte.setTextMatrix(a, b);				
								//Write text
								pageContentByte.showText("11564"+"");
								
								pageContentByte.endText();
							}
							
							}
						}
							
						
						for(int i=1; i<=pages; i++) { 
							int a=503,b=257;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 10);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText("INR 882"+"");
							
							pageContentByte.endText();
						}
						
						for(int i=1; i<=pages; i++) { 
							int a=503,b=242;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 10);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText("INR 882"+"");
							
							pageContentByte.endText();
						}
						
						for(int i=1; i<=pages; i++) { 
							int a=503,b=226;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 10);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText("-"+"");
							
							pageContentByte.endText();
						}
						
						
							
							
							
						AmtWords A=new AmtWords();
						{
							A.Mainy(Long.parseLong("11564"));

						}
						for(int i=1; i<=pages; i++) { 
							int a=50,b=240;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 10);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText(AmtWords1+" Only");
							
							pageContentByte.endText();
						}
						
						for(int i=1; i<=pages; i++) { 
							int a=503,b=273;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 10);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText("9800"+"");
							
							pageContentByte.endText();
						}
						
						for(int i=1; i<=pages; i++) { 
							int a=423,b=200;
							//Contain the pdf data.
							PdfContentByte pageContentByte = 
									pdfStamper.getOverContent(i);
							
							pageContentByte.beginText();
							//Set text font and size.
							pageContentByte.setFontAndSize(baseFont, 14);
							pageContentByte.setRGBColorFill(0x000, 0x000, 0x000);
							pageContentByte.setTextMatrix(a, b);				
							//Write text
							pageContentByte.showText("INR 11,564/-"+"");
							
							pageContentByte.endText();
						}

							


						
						
						
						
						
						
						
						
						
						
						
						
						
						

				//Close the pdfStamper.
						pdfStamper.close();			
				System.out.println("PDF modified successfully.");
			}
		} catch (Exception e){}
	}
}

