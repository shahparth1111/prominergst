import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
@SuppressWarnings("unused")
public class Ledger extends JFrame 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static JScrollPane pane;
	static int indexx;static String GetS="";
	private static JPanel contentPane;
	final static DefaultTableModel model = new DefaultTableModel();
	static JTable table=new JTable();
	static Ledger frame;
	private static JTextField textField;
	static JLabel label;
	private JButton button;
    static int x;
    static JLabel lblExcelFileExported;
    private static JButton btnPrint;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame=new Ledger();
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

	public Ledger() throws IOException {
		setBounds(0, 0, 1920, 1080);
		setUndecorated(true);
		//setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		final Object[] columns = {"UID","PID","Product Name","GST Code","Company Name","Rate","Type","Total Tax",
				"Mrp","Quantity","Stock","Business Date","Company GST","Mfg Date","Expiry Date","Invoice No"};
        model.setColumnIdentifiers(columns);
        
        table.setModel(model);
        table.setForeground(Color.black);
        
    //    table.editingStopped(null);
        Font font = new Font("",0,22);
        table.setFont(font);
     
        ReadFile file=new ReadFile(Data.path+"ledger.txt");
        int liness=Data.getLines(Data.path+"ledger.txt");
        String[] s=file.OpenFile(liness);

        for(int i=0;i<liness;i++)
        {
        	try{
        	final Object[] row = new Object[22];
        	if(s[i]!=null)
        	{
        		int count=0;
				Scanner in=new Scanner(s[i]).useDelimiter("\\§");
        		while(in.hasNext()==true)
        		{
        			String G=in.next();
        			G=G.trim();
        			row[count++]=G;
        		}
        		model.addRow(row);
        	}
        }catch(Exception sve){}
        }
        
        

        
        pane = new JScrollPane(createAlternating(model,columns), JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        pane.setBounds(0, 160, 1920, 887);
        contentPane.setLayout(null);
        getContentPane().add(pane);
        getContentPane().add(pane);
        
        
		

        
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
        
		
		
		
        JLabel label_1 = new JLabel("");
        Image img1=new ImageIcon(this.getClass().getResource("/ERP-Stock.png")).getImage();
        
       
        
        
        String Arr[]={"Date From","05/01/2017"};
        
        String Arr1[]={"Date Till","17/07/2017"};
        
        JLabel label_2 = new JLabel("");
        label_2.setBounds(1068, 124, 195, 34);
        contentPane.add(label_2);
        
        JLabel label_3 = new JLabel("");
        label_3.setBounds(1452, 124, 195, 34);
        contentPane.add(label_3);
        
        final JButton button_1 = new JButton("");
        button_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		try{
        			Home H=new Home();
        			H.setVisible(true);
        		}catch(Exception svd){}
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
        button_1.setBounds(1790, 59, 89, 103);
        contentPane.add(button_1);
        
        lblExcelFileExported = new JLabel("Excel File Exported to Desktop");
        lblExcelFileExported.setVisible(false);
        lblExcelFileExported.setFont(new Font("Times New Roman", Font.PLAIN, 22));
        lblExcelFileExported.setForeground(Color.GREEN);
        lblExcelFileExported.setHorizontalAlignment(SwingConstants.CENTER);
        lblExcelFileExported.setBounds(669, 77, 341, 34);
        contentPane.add(lblExcelFileExported);
        
        
        label_1.setIcon(new ImageIcon(img1));
        label_1.setBounds(0, 0, 1920, 1080);
        contentPane.add(label_1);
        
       
	}

	private static void filter(String query, JTable table1)
	{
		TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(model);
		table1.setRowSorter(tr);
		tr.setRowFilter(RowFilter.regexFilter(query,indexx));
	}
	
	@SuppressWarnings("unchecked")
	private static JComponent createAlternating(final DefaultTableModel model, final Object[] columns) throws IOException
	{
		@SuppressWarnings("serial")
		final JTable table = new JTable( model )
		{
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column)
			{
				Component c = super.prepareRenderer(renderer, row, column);				
				//  Alternate row color
				if (!isRowSelected(row)){
					//c.setBackground(row % 2 == 0 ? getBackground() : Color.LIGHT_GRAY);
					c.setBackground(row % 2 == 0 ? getBackground() : Color.WHITE);
					}
				return c;
			}
		};
		table.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		table.setRowHeight(20);
        table.setColumnSelectionAllowed(true);
        table.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
        table.setCellSelectionEnabled(true);
        table.setSurrendersFocusOnKeystroke(true);
        (table.getColumnModel().getColumn(0)).setPreferredWidth(80);
        (table.getColumnModel().getColumn(1)).setPreferredWidth(80);
        (table.getColumnModel().getColumn(2)).setPreferredWidth(230);
        (table.getColumnModel().getColumn(3)).setPreferredWidth(100);
        (table.getColumnModel().getColumn(4)).setPreferredWidth(235);
        (table.getColumnModel().getColumn(5)).setPreferredWidth(100);
        (table.getColumnModel().getColumn(6)).setPreferredWidth(100);
        (table.getColumnModel().getColumn(7)).setPreferredWidth(100);
        (table.getColumnModel().getColumn(8)).setPreferredWidth(80);
        (table.getColumnModel().getColumn(9)).setPreferredWidth(90);
        (table.getColumnModel().getColumn(10)).setPreferredWidth(90);
        (table.getColumnModel().getColumn(11)).setPreferredWidth(130);
        (table.getColumnModel().getColumn(12)).setPreferredWidth(140);
        (table.getColumnModel().getColumn(13)).setPreferredWidth(130);
        (table.getColumnModel().getColumn(14)).setPreferredWidth(130);
        (table.getColumnModel().getColumn(15)).setPreferredWidth(100);
        table.setSelectionBackground(Color.BLACK);
        table.setSelectionForeground(Color.WHITE);
        DefaultTableCellRenderer cellrenderer=new DefaultTableCellRenderer();
        cellrenderer.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<16;i++)
        {
        	table.getColumnModel().getColumn(i).setCellRenderer(cellrenderer);
        }
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        

		
        
        btnPrint = new JButton("Print");
        btnPrint.setBounds(873, 124, 89, 23);
        btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnPrint.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try {
					table.print();
				} catch (PrinterException e111) {
					// TODO Auto-generated catch block
					e111.printStackTrace();
				}
        	}
        });
        contentPane.add(btnPrint);
        
        try{
		@SuppressWarnings("rawtypes")
		final JComboBox comboBox = new JComboBox(columns);
		comboBox.setBounds(461, 82, 180, 44);
		comboBox.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBox.addItemListener(
				new ItemListener(){
					@Override
					public void itemStateChanged(ItemEvent arg0) {
						// TODO Auto-generated method stub
						GetS=""+columns[comboBox.getSelectedIndex()]+"";
						GetS=GetS.trim();
						for(int i=0;i<columns.length;i++)
						{
							if(GetS.equalsIgnoreCase(columns[i]+""))
							{
								indexx=i;
							}
						}
					}
				}
				
				);
		contentPane.add(comboBox);
        }catch(Exception nn){}
        
        JButton btnNewButton = new JButton("Total");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		label.setText("");
        		double D=0,E=0,F=0,G=0,H=0;
    			try{
					int rowscount=table.getRowCount();
					for(int i=0;i<rowscount;i++)
					{			
							String A="",B="",C="",A1="",B1="";
							A=(table.getValueAt(i, 5).toString());
							D+=(Double.parseDouble(A));
							B=(table.getValueAt(i, 7).toString());
							E+=(Double.parseDouble(B));
							C=(table.getValueAt(i, 8).toString());
							F+=(Double.parseDouble(C));
							A1=(table.getValueAt(i, 9).toString());
							G+=(Double.parseDouble(A1));
							B1=(table.getValueAt(i, 10).toString());
							H+=(Double.parseDouble(B1));
					}
					label.setText("R="+D+"      G="+E+"      M="+F+"      Q="+G+"      S="+H+"");
				}catch(Exception eer){}
        	}
        });
        btnNewButton.setForeground(Color.BLUE);
        btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        btnNewButton.setBounds(772, 1046, 97, 34);
        contentPane.add(btnNewButton);
        
        JButton btnShares = new JButton("Excel");
        btnShares.setBounds(738, 124, 101, 23);
        btnShares.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnShares.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		try{
        		exportTable(table, new File("C:/Users/"+System.getProperty("user.name")+"/Desktop/Exported_Data.xls"));
        		}catch(Exception seedf){}
        	}
        });
        contentPane.add(btnShares);
        
        label = new JLabel("");
        label.setFont(new Font("Times New Roman", Font.BOLD, 22));
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setBounds(873, 1046, 841, 34);
        contentPane.add(label);
        
		 textField = new JTextField();
		 textField.setBounds(25, 82, 383, 44);
	        textField.addKeyListener(new KeyAdapter() {
	        	@Override
	        	public void keyPressed(KeyEvent e) {
	        		String query=textField.getText();
	        		filter(query,table);
	        	}
	        });
	        //table.setVisible(false);
	        contentPane.add(textField);
	        textField.setColumns(10);
	        table.getTableHeader().setFont( new Font( "Arial" , Font.BOLD, 18 ));
	        JTableHeader header = table.getTableHeader();
	        header.setFont( header.getFont().deriveFont(19) );
		return table;
	}
	public static String[] remove_duplicate(String[] Array_R)
	{
		String Avoid_Dup[]=new String[Array_R.length];
		int counter=0;
		for(int i=1;i<Array_R.length;i++)
		{
			if(Array_R[i]!=null){
			int count=0;
			for(int j=i-1;j>=1;j--)
			{
				if(Array_R[j].equals(Array_R[i]))
				{
					count=1;
					break;
				}
			}
			if(count==0)
			{
				
				Avoid_Dup[counter++]=Array_R[i];
			}
			}
		}
		
		return Avoid_Dup;
	}
	
	public static void closee(JFrame frame)
	{
		try{
			frame.dispose();
		}
		catch(Exception ddfff){}
	}
	
	public void Array_Copy(String[] From,String[] To)
	{
		for(int i=0;i<From.length;i++)
		{
			try{
			To[i]=From[i];
			}catch(Exception erre){}
		}
	}
	
	public static void exportTable(JTable table, File file) throws IOException {
		if(file.exists()==false)
		{
			file.createNewFile();
		}
        TableModel model = table.getModel();
        FileWriter out = new FileWriter(file);
        for(int i=0; i < model.getColumnCount(); i++) {
    out.write(model.getColumnName(i) + "\t");
        }
        out.write("\n");

        for(int i=0; i< model.getRowCount(); i++) {
    for(int j=0; j < model.getColumnCount(); j++) {
        out.write(model.getValueAt(i,j).toString()+"\t");
        }
        out.write("\n");
    }

    out.close();
    lblExcelFileExported.setVisible(true);
    System.out.println("write out to: " + file);
}

}
