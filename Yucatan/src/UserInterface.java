import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
public class UserInterface extends JPanel implements MouseListener, MouseMotionListener{
	static int mouseX = 0 , mouseY = 0;
	static int squareSize;
	static int iconSize;
	static int buildingChoice = -1;
	static int buildingChoice2 = -1;
	static ArrayList<House> allBuildings = new ArrayList<House>();
//	int counter = 0;
	public UserInterface(int squareSize){
		initialize();
		this.squareSize = squareSize;
		this.iconSize = squareSize-1;
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	private static void initialize() {
		// TODO Auto-generated method stub
		allBuildings.add(YucatanMain.woodCutter);
		allBuildings.add(YucatanMain.wwoodCutter);
		allBuildings.add(YucatanMain.wwwoodCutter);
		allBuildings.add(YucatanMain.stoneCutter);
		allBuildings.add(YucatanMain.sstoneCutter);
		allBuildings.add(YucatanMain.ssstoneCutter);
		allBuildings.add(YucatanMain.farmer);
		allBuildings.add(YucatanMain.ffarmer);
		allBuildings.add(YucatanMain.fffarmer);
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		this.setBackground(Color.darkGray);
//		System.out.println("sysout repaint"+counter);
//		counter +=1;
		
		//Bilder einladen
		Image waterImage = new ImageIcon("water.png").getImage();
		Image forestImage = new ImageIcon("forest.png").getImage();
		Image fforestImage = new ImageIcon("fforest.png").getImage();
		Image ffforestImage = new ImageIcon("ffforest.png").getImage();
		Image rockImage = new ImageIcon("rock.png").getImage();
		Image rrockImage = new ImageIcon("rrock.png").getImage();
		Image rrrockImage = new ImageIcon("rrrock.png").getImage();
		Image cropImage = new ImageIcon("crop.png").getImage();
		Image ccropImage = new ImageIcon("ccrop.png").getImage();
		Image cccropImage = new ImageIcon("cccrop.png").getImage();
		Image woodCutterImage = new ImageIcon("woodCutter.png").getImage();
		Image wwoodCutterImage = new ImageIcon("wwoodCutter.png").getImage();
		Image wwwoodCutterImage = new ImageIcon("wwwoodCutter.png").getImage();
		Image stoneCutterImage = new ImageIcon("stoneCutter.png").getImage();
		Image sstoneCutterImage = new ImageIcon("sstoneCutter.png").getImage();
		Image ssstoneCutterImage = new ImageIcon("ssstoneCutter.png").getImage();
		Image farmerImage = new ImageIcon("farmer.png").getImage();
		Image ffarmerImage = new ImageIcon("ffarmer.png").getImage();
		Image fffarmerImage = new ImageIcon("fffarmer.png").getImage();
		Image cfarmerImage = new ImageIcon("cfarmer.png").getImage();
		Image ccfarmerImage = new ImageIcon("ccfarmer.png").getImage();
		Image cffarmerImage = new ImageIcon("cffarmer.png").getImage();
		Image fwoodCutterImage = new ImageIcon("fwoodCutter.png").getImage();
		Image ffwoodCutterImage = new ImageIcon("ffwoodCutter.png").getImage();
		Image fwwoodCutterImage = new ImageIcon("fwwoodCutter.png").getImage();
		Image rstoneCutterImage = new ImageIcon("rstoneCutter.png").getImage();
		Image rrstoneCutterImage = new ImageIcon("rrstoneCutter.png").getImage();
		Image rsstoneCutterImage = new ImageIcon("rsstoneCutter.png").getImage();		
		Image cropForrestImage = new ImageIcon("cropForrest.png").getImage();
		Image cropFforrestImage = new ImageIcon("cropFforrest.png").getImage();
		Image ccropForrestImage = new ImageIcon("ccropForrest.png").getImage();		
		Image rockForrestImage = new ImageIcon("rockForrest.png").getImage();
		Image rrockForrestImage = new ImageIcon("rrockForrest.png").getImage();
		Image rockFforrestImage = new ImageIcon("rockFforrest.png").getImage();		
		Image cropRockImage = new ImageIcon("cropRock.png").getImage();
		Image cropRrockImage = new ImageIcon("cropRrock.png").getImage();
		Image ccropRockImage = new ImageIcon("ccropRock.png").getImage();
		
		//map zeichnen
		for (int i = 0; i < 100; i++){
			Image tempImage = null; 
			switch (YucatanMain.map[i/10][i%10].getHouseId()) {
				
				case " cf": tempImage = cropForrestImage;
					break;
				case "cff": tempImage = cropFforrestImage;
					break;
				case "ccf": tempImage = ccropForrestImage;
					break;
				case " rf": tempImage = rockForrestImage;
					break;
				case "rrf": tempImage = rrockForrestImage;
					break;
				case "rff": tempImage = rockFforrestImage;
					break;
				case " cr": tempImage = cropRockImage;
					break;
				case "ccr": tempImage = ccropRockImage;
					break;
				case "crr": tempImage = cropRrockImage;
					break;	
				case "www": tempImage = waterImage;
					break;					
				case "  f": tempImage = forestImage;
					break;					
				case " ff": tempImage = fforestImage;
					break;					
				case "fff": tempImage = ffforestImage;
					break;					
				case "  r": tempImage = rockImage;
					break;					
				case " rr": tempImage = rrockImage;
					break;					
				case "rrr": tempImage = rrrockImage;
					break;					
				case "  c": tempImage = cropImage;
					break;					
				case " cc": tempImage = ccropImage;
					break;					
				case "ccc": tempImage = cccropImage;
					break;
					
				case "  F": tempImage = woodCutterImage;
					switch (YucatanMain.mapStart[i/10][i%10].getUpgradeToId()){
						case " FF": tempImage = fwoodCutterImage;
							break;
						case "FFF": tempImage = ffwoodCutterImage;
							break;
					}
					break;
					
				case " FF": 
					switch (YucatanMain.mapStart[i/10][i%10].getUpgradeToId()){
						case " FF": tempImage = wwoodCutterImage;
							break;
						case "FFF": tempImage = fwwoodCutterImage;
							break;
					}
					break;
					
				case "FFF": tempImage = wwwoodCutterImage;
					break;
					
				case "  R": 
					tempImage = stoneCutterImage;
					switch (YucatanMain.mapStart[i/10][i%10].getUpgradeToId()){
						case " RR": tempImage = rstoneCutterImage;
							break;
						case "RRR": tempImage = rrstoneCutterImage;
							break;
					}
					break;
					
				case " RR": 
					switch(YucatanMain.mapStart[i/10][i%10].getUpgradeToId()){
						case " RR": tempImage = sstoneCutterImage;
							break;
						case "RRR": tempImage = rsstoneCutterImage;
							break;
					}
					break;
					
				case "RRR": tempImage = ssstoneCutterImage;
					break;
					
				case "  C": tempImage = farmerImage;
					switch(YucatanMain.mapStart[i/10][i%10].getUpgradeToId()){
						case " CC": tempImage = cfarmerImage;
							break;
						case "CCC": tempImage = ccfarmerImage;
							break;
					}
					break;
					
				case " CC": 
					switch(YucatanMain.mapStart[i/10][i%10].getUpgradeToId()){
						case " CC": tempImage = ffarmerImage;
							break;
						case "CCC": tempImage = cffarmerImage;
							break;
					}
					break;
					
				case "CCC": tempImage = fffarmerImage;
					break;					
			}
			g.drawImage(tempImage, ((i/10)*squareSize), ((i%10)*squareSize), iconSize, iconSize, this);
		}
	}
	
	
	@Override
	public void mouseMoved(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1 && e.getX()<(10*squareSize) && e.getY()<(10*squareSize)){//leftklick and if inside the map
			mouseX = e.getX();
			mouseY = e.getY();
			House tempTile = YucatanMain.map[(mouseX/squareSize)][(mouseY/squareSize)]; 
			
//			ArrayList<House> allBuildings = new ArrayList<House>();
//			allBuildings.add(YucatanMain.woodCutter);
//			allBuildings.add(YucatanMain.wwoodCutter);
//			allBuildings.add(YucatanMain.wwwoodCutter);
//			allBuildings.add(YucatanMain.stoneCutter);
//			allBuildings.add(YucatanMain.sstoneCutter);
//			allBuildings.add(YucatanMain.ssstoneCutter);
//			allBuildings.add(YucatanMain.farmer);
//			allBuildings.add(YucatanMain.ffarmer);
//			allBuildings.add(YucatanMain.fffarmer);
					
			if (tempTile.getIsHouse()){															 // wenn das ausgewählte Feld ein Haus ist				
				Object[] option = {tempTile.getUpgradeTo(),"Cancel"}; 							// Angezeigte Bauption zum anklicken für das ausgewählte Tile
				String tempUpgradeId = tempTile.getUpgradeToId(); 								// ID der möglichen Upgrademöglichkeit
				String[] chosenString = {tempUpgradeId,"xxx"}; 									// ID der Häuser für auswählbare Optionen
				String chosenBuilding = null; 													// ID der ausgewählten Upgrade Option
				String newBuilding = null;											 			// x-,y-Position des Tiles + ID vom ausgewähltem Upgrade
				House newBuilding2 = null;														 // Hausobjekt, was neu gebaut wird
				Boolean buildable = YucatanMain.mapStart[(mouseX/squareSize)][(mouseY/squareSize)].canBeBuiltOn(tempUpgradeId); // darf Gebäude dort erweitert werden?
				
				if (buildable){																	// wenn Erweiterung auf Ausgangstile gebaut werden darf
					buildingChoice = JOptionPane.showOptionDialog(null, "Which Building?", "Building Options", 
									 JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, null);
					
					if (!chosenString[buildingChoice].equals(chosenString[1])){ 					// wenn Auswahl nicht "Cancel" ist
						chosenBuilding = chosenString[buildingChoice];
						newBuilding = ""+ mouseX/squareSize + mouseY/squareSize + chosenBuilding;		
						
						for (int i = 0; i < allBuildings.size(); i++){								// gehe Liste an allen Häusern durch
							String tempId = allBuildings.get(i).getHouseId(); 						//nimm HausID des Gebäudes der Schleife
							
							if (tempUpgradeId.equals(tempId)){ 										// wenn HausID der Schleife == ausgewählte Upgrade ID 
								newBuilding2 = allBuildings.get(i); 								// speicher das ausgewählte Gebäude der Schleife
							}
						YucatanMain.makeMove(newBuilding, newBuilding2); 							//führe move aus: übergebe String x-,y-Position + ID vom ausgewähltem Upgrade + neues Hausobjekt
						}
					}	
				}
			}
			
			else{
				Boolean farmable = YucatanMain.mapStart[(mouseX/squareSize)][(mouseY/squareSize)].canBuildCrop();
				Boolean woodable = YucatanMain.mapStart[(mouseX/squareSize)][(mouseY/squareSize)].canBuildWood();
				Boolean stoneable = YucatanMain.mapStart[(mouseX/squareSize)][(mouseY/squareSize)].canBuildStone();
				
				String farm = "Cancel";
				String wood = "Cancel";
				String stone = "Cancel";
				
				if (farmable){
					farm = YucatanMain.farmer.getName();
				}				
				if (woodable){
					wood = YucatanMain.woodCutter.getName();
				}				
				if (stoneable){
					stone = YucatanMain.stoneCutter.getName();
				}
				
				if(!farmable && !woodable && stoneable){					
					Object[] option = {stone, "Cancel"};
					String[] chosenString = {YucatanMain.stoneCutter.getHouseId(),"xxx"};
					buildingChoice = JOptionPane.showOptionDialog(null, "Which Building?", "Building Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, null);
					if (!option[buildingChoice].equals("Cancel")){
						String newBuilding = "" + mouseX/squareSize + mouseY/squareSize + chosenString[buildingChoice];
						House newBuilding2 = YucatanMain.stoneCutter;
						YucatanMain.makeMove(newBuilding, newBuilding2);						
					}
				}
				if(!farmable && !stoneable && woodable){					
					Object[] option = {wood, "Cancel"};
					String[] chosenString = {YucatanMain.woodCutter.getHouseId(),"xxx"};
					buildingChoice = JOptionPane.showOptionDialog(null, "Which Building?", "Building Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, null);
					if (!option[buildingChoice].equals("Cancel")){
						String newBuilding = "" + mouseX/squareSize + mouseY/squareSize + chosenString[buildingChoice];
						House newBuilding2 = YucatanMain.woodCutter;
						YucatanMain.makeMove(newBuilding, newBuilding2);						
					}
				}
				if(!stoneable && !woodable && farmable){					
					Object[] option = {farm, "Cancel"};
					String[] chosenString = {YucatanMain.farmer.getHouseId(),"xxx"};
					buildingChoice = JOptionPane.showOptionDialog(null, "Which Building?", "Building Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, null);
					if (!option[buildingChoice].equals("Cancel")){
						String newBuilding = "" + mouseX/squareSize + mouseY/squareSize + chosenString[buildingChoice];
						House newBuilding2 = YucatanMain.farmer;
						YucatanMain.makeMove(newBuilding, newBuilding2);						
					}
				}
				
				if (!stoneable && woodable && farmable){
					Object[] option = {farm, wood, "Cancel"};
					String[] chosenString = {YucatanMain.farmer.getHouseId(), YucatanMain.woodCutter.getHouseId(),"xxx"};
					House[] tempHouse = {YucatanMain.farmer, YucatanMain.woodCutter};
					buildingChoice = JOptionPane.showOptionDialog(null, "Which Building?", "Building Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, null);
					if (!option[buildingChoice].equals("Cancel")){
						String newBuilding = "" + mouseX/squareSize + mouseY/squareSize + chosenString[buildingChoice];
						House newBuilding2 = tempHouse[buildingChoice];
						YucatanMain.makeMove(newBuilding, newBuilding2);						
					}
				}
				
				if (stoneable && !woodable && farmable){
					Object[] option = {farm, stone, "Cancel"};
					String[] chosenString = {YucatanMain.farmer.getHouseId(), YucatanMain.stoneCutter.getHouseId(),"xxx"};
					House[] tempHouse = {YucatanMain.farmer, YucatanMain.stoneCutter};
					buildingChoice = JOptionPane.showOptionDialog(null, "Which Building?", "Building Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, null);
					if (!option[buildingChoice].equals("Cancel")){
						String newBuilding = "" + mouseX/squareSize + mouseY/squareSize + chosenString[buildingChoice];
						House newBuilding2 = tempHouse[buildingChoice];
						YucatanMain.makeMove(newBuilding, newBuilding2);						
					}
				}
				
				if (stoneable && woodable && !farmable){
					Object[] option = {stone, wood, "Cancel"};
					String[] chosenString = {YucatanMain.stoneCutter.getHouseId(), YucatanMain.woodCutter.getHouseId(),"xxx"};
					House[] tempHouse = {YucatanMain.stoneCutter, YucatanMain.woodCutter};
					buildingChoice = JOptionPane.showOptionDialog(null, "Which Building?", "Building Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, null);
					if (!option[buildingChoice].equals("Cancel")){
						String newBuilding = "" + mouseX/squareSize + mouseY/squareSize + chosenString[buildingChoice];
						House newBuilding2 = tempHouse[buildingChoice];
						YucatanMain.makeMove(newBuilding, newBuilding2);						
					}
				}
				
				if (stoneable && woodable && farmable){
					Object[] option = {farm, wood, stone};
					String[] chosenString = {YucatanMain.farmer.getHouseId(),YucatanMain.woodCutter.getHouseId(),YucatanMain.stoneCutter.getHouseId()};
					House[] chosenHouse = {YucatanMain.farmer, YucatanMain.woodCutter, YucatanMain.stoneCutter};
					buildingChoice = JOptionPane.showOptionDialog(null, "Which Building?", "Building Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, null);
					
					if (!option[buildingChoice].equals("Cancel")){
						String newBuilding = "" + mouseX/squareSize + mouseY/squareSize + chosenString[buildingChoice];
						House newBuilding2 = chosenHouse[buildingChoice];
						YucatanMain.makeMove(newBuilding, newBuilding2);
					}	
				}
			}
		}
		
		if (e.getButton() == MouseEvent.BUTTON3 && e.getX()<(10*squareSize) && e.getY()<(10*squareSize)){
			Object[] option = {"Delete","Cancel"};			
			mouseX = e.getX();
			mouseY = e.getY();
			if (YucatanMain.map[mouseX/squareSize][mouseY/squareSize].getIsHouse()){
				buildingChoice = JOptionPane.showOptionDialog(null, "Delete Building?", "Building Options", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, option, null);
				if (buildingChoice == 0){
					String delete = "" + mouseX/squareSize + mouseY/squareSize;
					YucatanMain.deleteHouse(delete);
				}
			}
		}
		
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {}	
	@Override
	public void mouseClicked(MouseEvent e) {}	
	@Override
	public void mouseDragged(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}
	

	
	
}
