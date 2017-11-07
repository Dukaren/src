import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class MainGUI {

	private JFrame frame;
	private JButton btnNext;
	private JLabel lblText;
    int counter = 1;
	private JLabel lblBackground;
	private JButton btnStart;
	private JLabel lblSchoolEntrance;
	private JLabel lblIan;
	private JLabel lblTextBox;

	//this launches everything
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//This runs the application
	public MainGUI() {
		initialize();
	}

	//This is the creation of the frame itself
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1600, 900);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		//This sets the images
		Image imgTitleScreen = new ImageIcon(this.getClass().getResource("/Opening.jpg")).getImage();
		Image imgBlack = new ImageIcon(this.getClass().getResource("/Black.png")).getImage();
		
		//Character pictures
		Image imgAvish = new ImageIcon(this.getClass().getResource("/Avish.png")).getImage();
		Image imgIan = new ImageIcon(this.getClass().getResource("/Ian.png")).getImage();
		Image imgAlex = new ImageIcon(this.getClass().getResource("/Alex.png")).getImage();
		Image imgAlexk = new ImageIcon(this.getClass().getResource("/Alex(k).png")).getImage();
		Image imgAndy = new ImageIcon(this.getClass().getResource("/Andy.png")).getImage();
		Image imgBilly = new ImageIcon(this.getClass().getResource("/Billy.png")).getImage();
		Image imgConnor = new ImageIcon(this.getClass().getResource("/Canna.png")).getImage();
		Image imgDrew = new ImageIcon(this.getClass().getResource("/Drew.png")).getImage();
		Image imgDylan = new ImageIcon(this.getClass().getResource("/Dylan.png")).getImage();
		Image imgEric = new ImageIcon(this.getClass().getResource("/Eric.png")).getImage();
		Image imgMartin = new ImageIcon(this.getClass().getResource("/MartyBoi.png")).getImage();
		Image imgNick = new ImageIcon(this.getClass().getResource("/Nick.png")).getImage();
		Image imgShawn = new ImageIcon(this.getClass().getResource("/Shawn.png")).getImage();
		Image imgTom = new ImageIcon(this.getClass().getResource("/Tom.png")).getImage();
		
		//sets
		Image imgSchoolEntrance = new ImageIcon(this.getClass().getResource("/SchoolEntrance.png")).getImage();
		Image imgHallway = new ImageIcon(this.getClass().getResource("/Hallway.png")).getImage();
		Image imgPark = new ImageIcon(this.getClass().getResource("/Park.png")).getImage();
		Image imgShoppingDistrict = new ImageIcon(this.getClass().getResource("/ShoppingDistrict.png")).getImage();
		Image imgRoom = new ImageIcon(this.getClass().getResource("/Room.png")).getImage();
		Image imgPrincipalOffice = new ImageIcon(this.getClass().getResource("/PrincipalOffice.png")).getImage();
		Image imgKFCStore = new ImageIcon(this.getClass().getResource("/KFCStore.png")).getImage();
		Image imgHome = new ImageIcon(this.getClass().getResource("/Home.png")).getImage();
		Image imgClassroom = new ImageIcon(this.getClass().getResource("/ClassRoom.png")).getImage();
		
		//Buttons
		Image imgStart = new ImageIcon(this.getClass().getResource("/Hovered.png")).getImage();
		Image imgTextBox = new ImageIcon(this.getClass().getResource("/TextBox.png")).getImage();
		Image imgNextButton = new ImageIcon(this.getClass().getResource("/NextButton.png")).getImage();
		
		
		
		
		btnStart = new JButton("");
		btnStart.setIcon(new ImageIcon(imgStart));
		btnStart.setContentAreaFilled(false);
		btnStart.addActionListener(new ActionListener() 
		{
		//This is the start button creating the rest of the program
			public void actionPerformed(ActionEvent arg0) 
			{			
				lblBackground.setIcon(new ImageIcon(imgBlack));
				lblTextBox.setVisible(true);
				btnNext.setVisible(true);
				btnStart.setVisible(false);
				//Set's the to the first school background
				
			}
		});
		btnStart.setBounds(774, 551, 137, 46);
		frame.getContentPane().add(btnStart);
		
		JButton btnOption1 = new JButton("Talk to Nick");
		btnOption1.setForeground(SystemColor.activeCaption);
		btnOption1.setBackground(SystemColor.activeCaption);
		btnOption1.setBounds(774, 411, 137, 60);
		btnOption1.setVisible(false);
		frame.getContentPane().add(btnOption1);
		
		//This is the text label
		lblText = new JLabel("");
		lblText.setForeground(Color.ORANGE);
		lblText.setHorizontalTextPosition(SwingConstants.CENTER);
		lblText.setHorizontalAlignment(SwingConstants.CENTER);
		lblText.setVerticalTextPosition(SwingConstants.TOP);
		lblText.setVerticalAlignment(SwingConstants.TOP);
		lblText.setFont(new Font("Gabriola", Font.PLAIN, 40));
		lblText.setBackground(UIManager.getColor("Button.darkShadow"));
		lblText.setBounds(201, 762, 1249, 99);
		frame.getContentPane().add(lblText);
		
		//Next button starting
		btnNext = new JButton("");
		btnNext.setIcon(new ImageIcon(imgNextButton));
		btnNext.setContentAreaFilled(false);
		btnNext.setVisible(false);
		btnNext.setFont(new Font("Meiryo", Font.BOLD, 35));
		btnNext.setBounds(1460, 775, 78, 54);
		frame.getContentPane().add(btnNext);
		
		
		//TextBoxArt
		lblTextBox = new JLabel("");
		lblTextBox.setIcon(new ImageIcon(imgTextBox));
		lblTextBox.setVisible(false);
		lblTextBox.setBounds(294, 323, 1009, 538);
		frame.getContentPane().add(lblTextBox);
		
		//Character Pictures
		lblIan = new JLabel("");
		lblIan.setVisible(false);
		lblIan.setIcon(new ImageIcon(imgIan));
		lblIan.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblIan);
				
		JLabel lblAvish = new JLabel("");
		lblAvish.setVisible(false);
		lblAvish.setIcon(new ImageIcon(imgAvish));
		lblAvish.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblAvish);
		
		JLabel lblDylan = new JLabel("");
		lblDylan.setVisible(false);
		lblDylan.setIcon(new ImageIcon(imgDylan));
		lblDylan.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblDylan);
		
		JLabel lblConnor = new JLabel("");
		lblConnor.setVisible(false);
		lblConnor.setIcon(new ImageIcon(imgConnor));
		lblConnor.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblConnor);
		
		JLabel lblAlex = new JLabel("");
		lblAlex.setVisible(false);
		lblAlex.setIcon(new ImageIcon(imgAlex));
		lblAlex.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblAlex);
		
		JLabel lblAlexk = new JLabel("");
		lblAlexk.setVisible(false);
		lblAlexk.setIcon(new ImageIcon(imgAlexk));
		lblAlexk.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblAlexk);
		
		JLabel lblShawn = new JLabel("");
		lblShawn.setVisible(false);
		lblShawn.setIcon(new ImageIcon(imgShawn));
		lblShawn.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblShawn);
		
		JLabel lblEric = new JLabel("");
		lblEric.setVisible(false);
		lblEric.setIcon(new ImageIcon(imgEric));
		lblEric.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblEric);
		
		JLabel lblMartin = new JLabel("");
		lblMartin.setVisible(false);
		lblMartin.setIcon(new ImageIcon(imgMartin));
		lblMartin.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblMartin);
		
		JLabel lblTom = new JLabel("");
		lblTom.setVisible(false);
		lblTom.setIcon(new ImageIcon(imgTom));
		lblTom.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblTom);
		
		JLabel lblNick = new JLabel("");
		lblNick.setVisible(false);
		lblNick.setIcon(new ImageIcon(imgNick));
		lblNick.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblNick);
		
		JLabel lblBilly = new JLabel("");
		lblBilly.setVisible(false);
		lblBilly.setIcon(new ImageIcon(imgBilly));
		lblBilly.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblBilly);
		
		JLabel lblDrew = new JLabel("");
		lblDrew.setVisible(false);
		lblDrew.setIcon(new ImageIcon(imgDrew));
		lblDrew.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblDrew);
		
		JLabel lblAndy = new JLabel("");
		lblAndy.setVisible(false);
		lblAndy.setIcon(new ImageIcon(imgAndy));
		lblAndy.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblAndy);
		
		//This is the background image label
		lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon(imgTitleScreen));
		lblBackground.setBounds(0, 0, 1600, 900);
		frame.getContentPane().add(lblBackground);
		
		btnNext.addActionListener(new ActionListener() {
			//This is the action of clicking the next button
			public void actionPerformed(ActionEvent arg0) {
				//This pulls text from the array and prints it
				textHandler story = new textHandler();
				//String text = story.getText(counter);
				String text = story.textReader("Script/LocalBoysScript.txt", counter);
				System.out.println(text);
				///////////////////////////////////////////////////////////////////////
				//this checks for character appearences.///////////////////////////////
				///////////////////////////////////////////////////////////////////////
				if(text.equals("Ian"))
				{
					lblIan.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Avish"))
				{
					lblAvish.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Dylan"))
				{
					lblDylan.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Alex"))
				{
					lblAlex.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Alexk"))
				{
					lblAlexk.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Nick"))
				{
					lblNick.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Eric"))
				{
					lblEric.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Martin"))
				{
					lblMartin.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Andy"))
				{
					lblAndy.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Billy"))
				{
					lblBilly.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Shawn"))
				{
					lblShawn.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Tom"))
				{
					lblTom.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Drew"))
				{
					lblDrew.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Connor"))
				{
					lblConnor.setVisible(true);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				////////////////////////////////////////////////////
				//THIS IS FOR CHARACTER DISSAPEARANCES//////////////
				////////////////////////////////////////////////////
				
				if(text.equals("Remove Ian"))
				{
					lblIan.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Remove Avish"))
				{
					lblAvish.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("Remove Dylan"))
				{
					lblDylan.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("Remove Alex"))
				{
					lblAlex.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("Remove Alexk"))
				{
					lblAlexk.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Remove Nick"))
				{
					lblNick.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Remove Eric"))
				{
					lblEric.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Remove Martin"))
				{
					lblMartin.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("Remove Andy"))
				{
					lblAndy.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Remove Billy"))
				{
					lblBilly.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Remove Shawn"))
				{
					lblShawn.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Remove Tom"))
				{
					lblTom.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Remove Drew"))
				{
					lblDrew.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				else if(text.equals("Remove Connor"))
				{
					lblConnor.setVisible(false);
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
				}
				////////////////////////////////////////////////////
				//THIS CHECKS FOR CHANGES IN THE SCENE(background)//
				////////////////////////////////////////////////////
				else if(text.equals("Hallway"))
				{
					lblBackground.setIcon(new ImageIcon(imgHallway));
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("SchoolEntrance"))
				{
					lblBackground.setIcon(new ImageIcon(imgSchoolEntrance));
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("Shopping Disctrict"))
				{
					lblBackground.setIcon(new ImageIcon(imgShoppingDistrict));
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("Park"))
				{
					lblBackground.setIcon(new ImageIcon(imgPark));
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("PrincipalOffice"))
				{
					lblBackground.setIcon(new ImageIcon(imgPrincipalOffice));
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("Room"))
				{
					lblBackground.setIcon(new ImageIcon(imgRoom));
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("Home"))
				{
					lblBackground.setIcon(new ImageIcon(imgHome));
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("KFCStore"))
				{
					lblBackground.setIcon(new ImageIcon(imgKFCStore));
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else if(text.equals("Classroom"))
				{
					lblBackground.setIcon(new ImageIcon(imgClassroom));
					counter++;
					text = story.textReader("Script/LocalBoysScript.txt", counter);
					lblText.setText(text);
					counter++;
				}
				else
				{
					lblText.setText(text);
					counter++;
				} 
					
			}		
			
		});

		

		

		
		

		

		

	}
}
