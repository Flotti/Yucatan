import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.Box;
import java.awt.Component;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Dimension;
import java.awt.Color;


public class Menu extends JPanel {

	private int woodBank = 10;
	private int stoneBank = 4;
	private int cornBank = 16;

	public Menu() {
		setPreferredSize(new Dimension(200, 650));
		setBackground(Color.LIGHT_GRAY);
		setMinimumSize(new Dimension(200, 650));
		setMaximumSize(new Dimension(200, 650));
		setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		Box verticalBox = Box.createVerticalBox();
		add(verticalBox);
		
		Box horizontalBox_2 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_2);
		
		JLabel lblNewLabel_4 = new JLabel("Wood");
		horizontalBox_2.add(lblNewLabel_4);
		
		Component horizontalGlue = Box.createHorizontalGlue();
		horizontalGlue.setPreferredSize(new Dimension(10, 0));
		horizontalGlue.setMinimumSize(new Dimension(10, 0));
		horizontalGlue.setMaximumSize(new Dimension(10, 0));
		horizontalBox_2.add(horizontalGlue);
		
		JLabel lblNewLabel_5 = new JLabel("" + woodBank);
		horizontalBox_2.add(lblNewLabel_5);
		
		Box horizontalBox_1 = Box.createHorizontalBox();
		verticalBox.add(horizontalBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Stone");
		horizontalBox_1.add(lblNewLabel_2);
		
		Component horizontalGlue_1 = Box.createHorizontalGlue();
		horizontalGlue_1.setPreferredSize(new Dimension(10, 0));
		horizontalGlue_1.setMinimumSize(new Dimension(10, 0));
		horizontalGlue_1.setMaximumSize(new Dimension(10, 0));
		horizontalBox_1.add(horizontalGlue_1);
		
		JLabel lblNewLabel_3 = new JLabel("" + stoneBank);
		horizontalBox_1.add(lblNewLabel_3);
		
		Box horizontalBox = Box.createHorizontalBox();
		verticalBox.add(horizontalBox);
		
		JLabel lblNewLabel = new JLabel("Corn");
		horizontalBox.add(lblNewLabel);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalGlue_2.setPreferredSize(new Dimension(10, 0));
		horizontalGlue_2.setMinimumSize(new Dimension(10, 0));
		horizontalGlue_2.setMaximumSize(new Dimension(10, 0));
		horizontalBox.add(horizontalGlue_2);
		
		JLabel lblNewLabel_1 = new JLabel(""+ cornBank);
		horizontalBox.add(lblNewLabel_1);

	}
	
	public void addWoodBank(int woodIncome){
		woodBank = woodBank + woodIncome;
	}
	
	public void addStoneBank(int stoneIncome){
		stoneBank = stoneBank + stoneIncome;
	}
	
	public void addCornBank(int cornIncome){
		cornBank = cornBank + cornIncome;
	}
	
	public int getWoodBank(){
		return woodBank;
	}
	
	public int getStoneBank(){
		return stoneBank;
	}
	
	public int getCornBank(){
		return cornBank;
	}
	
	public boolean woodPayable(int woodCost){
		if ((woodBank - woodCost) < 0){
			return false;
		}		
		return true;
	}
	
	public boolean stonePayable(int stoneCost){
		if ((stoneBank - stoneCost) < 0){
			return false;
		}		
		return true;
		}
	
	public boolean cornPayable(int cornCost){
		if ((cornBank - cornCost) < 0){
			return false;
		}				
		return true;		
	}	
}
