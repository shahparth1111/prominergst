import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Splash {

	static JFrame frame;
	private static final int MYTHREADS = 2;
	static int o=0,p=0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					@SuppressWarnings("unused")
					Splash window = new Splash();
					ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
					Runnable worker = new MyRunnable();
					executor.execute(worker);
					executor.shutdown();
					// Wait until all threads are finish
					while (!executor.isTerminated()) 
					{
						if(o==0)
						{
							o++;
							//Check Product Validity
							//Create & Load data from Database
							//Hide the Files
							//Create Small Repetitive Functions/Methods
							Data D=new Data();
							D.dataLoad();
							frame.dispose();
						}
					}
					@SuppressWarnings("serial")
					Action logout = new AbstractAction()
					{
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
	
	public static class MyRunnable implements Runnable 
	{
		@Override
		public void run()
		{
			if(p==0)
			{
				p++;
				frame.setVisible(true);
			}
		}
	}

	/**
	 * Create the application.
	 */
	public Splash() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1920,1080);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 1920, 1080);
		Image img=new ImageIcon(this.getClass().getResource("/Splash.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		
		
		JLabel label = new JLabel("");
		label.setBounds(969, 811, 80, 80);
		Image img1=new ImageIcon(this.getClass().getResource("/giff.gif")).getImage();
		label.setIcon(new ImageIcon(img1));
		frame.getContentPane().add(label);
		
		
		
		
		frame.getContentPane().add(lblNewLabel);
	}

}
