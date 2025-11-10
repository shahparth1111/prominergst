import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
					Action logout = new AbstractAction()
					{
					    /**
						 * 
						 */
						private static final long serialVersionUID = 1L;

						public void actionPerformed(ActionEvent e)
					    {
					        JFrame frame = (JFrame)e.getSource();
					        frame.dispose();
					        System.exit(0);
					    }
					};
					 
					InactivityListener listener = new InactivityListener(frame, logout, 10);
					listener.start();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setBounds(0, 0, 1920,1080);
		setUndecorated(true);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		Image img1=new ImageIcon(this.getClass().getResource("/ERP-Home.png")).getImage();
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

		getContentPane().add(lblNewLabel);
		
	}
}
