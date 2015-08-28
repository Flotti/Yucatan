import java.util.ArrayList;

import javax.swing.*;
public class YucatanMain {
	//Gelände als "Gebäude" ohne Baukosten/Ertrag..	
	static Tile cropForrest = new Tile(0,0,0,0,0,0,"Cropfield-Forrest"," cf", " cf", " cf", false,"  C","  F","","","");
	static Tile cropFforrest = new Tile(0,0,0,0,0,0,"Cropfield-Fforrest","cff"," FF"," FF",false,"  C","  F"," FF","","");
	static Tile ccropForrest = new Tile(0,0,0,0,0,0,"Ccropfield-Forrest","ccf", " CC", " CC", false,"  C"," CC","  F","","");	
	static Tile rockForrest = new Tile(0,0,0,0,0,0,"Rock-Forrest"," rf"," rf"," rf",false,"  R","  F","","","");
	static Tile rockFforrest = new Tile(0,0,0,0,0,0,"Rock-Fforrest","rff"," FF"," FF",false,"  R","  F"," FF","","");
	static Tile rrockForrest = new Tile(0,0,0,0,0,0,"Rrock-Forrest","rrf"," RR"," RR",false,"  R","  F"," RR","","");	
	static Tile cropRock = new Tile(0,0,0,0,0,0,"Crop-Rock"," cr"," cr"," cr",false,"  C","  R","","","");
	static Tile ccropRock = new Tile(0,0,0,0,0,0,"Ccrop-Rock","ccr", "CC"," CC",false,"  C","  R"," CC","","");
	static Tile cropRrock = new Tile(0,0,0,0,0,0,"Crop-Rrock","crr"," RR"," RR",false,"  C","  R"," RR","","");	
	static Tile water = new Tile(0,0,0,0,0,0,"Water","www","www","www",false,"trade","","","","");
	static Tile forrest = new Tile(0,0,0,0,0,0,"Forrest","  f","  f","  F",false,"  F","","","","");
	static Tile fforrest = new Tile(0,0,0,0,0,0,"Fforrest"," ff"," ff"," FF",false,"  F"," FF","","","");
	static Tile ffforrest = new Tile(0,0,0,0,0,0,"Ffforrest","fff","fff","FFF",false,"  F"," FF","FFF","","");
	static Tile rock = new Tile(0,0,0,0,0,0,"Rock","  r","  r","  R",false,"  R","","","","");
	static Tile rrock = new Tile(0,0,0,0,0,0,"Rrock"," rr"," rr"," RR",false,"  R"," RR","","","");
	static Tile rrrock = new Tile(0,0,0,0,0,0,"Rrrock","rrr","rrr","RRR",false,"  R"," RR","RRR","","");
	static Tile crop = new Tile(0,0,0,0,0,0,"Cropfield","  c","  c","  C",false,"  C","","","","");
	static Tile ccrop = new Tile(0,0,0,0,0,0,"Ccropfield"," cc"," cc"," CC",false,"  C"," CC"," ","","");
	static Tile cccrop = new Tile(0,0,0,0,0,0,"Cccropfield","ccc","ccc","CCC",false,"  C"," CC","CCC","","");
	
	//die Häuser, welche gebaut werden können (KostenHolz,Stein,Mais,ErtragHolz,Stein,Mais,Name,HausID,upgradezu,isHouse?)
	static House woodCutter = new House(2,1,2,1,0,0,"Woodcutter","  F","Woodcutter lvl2"," FF",true);
	static House wwoodCutter = new House(2,0,2,2,0,0,"Woodcutter lvl2"," FF","Woodcutter lvl3","FFF",true);
	static House wwwoodCutter = new House(2,0,2,3,0,0,"Woodcutter lvl3","FFF","geht nicht","FFFF",true);
	static House stoneCutter = new House(2,1,2,0,1,0,"Stonecutter","  R","Stonecutter lvl2"," RR",true);
	static House sstoneCutter = new House(2,0,2,0,2,0,"Stonecutter lvl2"," RR","Stonecutter lvl3","RRR",true);
	static House ssstoneCutter = new House(2,0,2,0,3,0,"Stonecutter lvl3","RRR","geht nicht","RRRR",true);
	static House farmer = new House (2,1,2,0,0,1,"Farmer","  C","Farmer lvl2"," CC",true);
	static House ffarmer = new House(2,0,2,0,0,2,"Farmer lvl2,"," CC","Farmer lvl3","CCC",true);
	static House fffarmer = new House(2,0,2,0,0,3,"Farmer lvl3","CCC","geht nicht","CCCC",true);	
	
	
	public static Tile mapStart[][]={
		{cropForrest, forrest, rock, fforrest, rrock, crop, ccropForrest, cccrop, rrrock, rockForrest},
		{water, cropForrest, rock, fforrest, rrock, crop, ccropForrest, cccrop, rrrock, rockForrest},
		{water, cropFforrest, rock, fforrest, rrock, crop, ccropForrest, cccrop, rrrock, ffforrest},
		{water, forrest, cropFforrest, cropRrock, cropRrock, cropRrock, ccropForrest, cccrop, rrrock, ffforrest},
		{water, forrest, cropFforrest, cropRrock, rrock, crop, ccrop, cccrop, rrrock, ffforrest},
		{water, forrest, cropFforrest, fforrest, rrock, crop, ccrop, cccrop, rrrock, ffforrest},
		{water, forrest, ccropRock, ccropRock, rrock, cropRock, cropRock, cropRock, rockFforrest, ffforrest},
		{water, forrest, ccropRock, ccropRock, rrock, crop, ccrop, cccrop, rockFforrest, ffforrest},
		{water, forrest, rock, fforrest, rrock, crop, ccrop, cccrop, rockFforrest, ffforrest},
		{water, forrest, rock, fforrest, rrock, crop, ccrop, cccrop, rockFforrest, ffforrest}};
	 
	public static House map[][] = {
		{cropForrest, forrest, rock, fforrest, rrock, crop, ccropForrest, cccrop, rrrock, rockForrest},
		{water, cropForrest, rock, fforrest, rrock, crop, ccropForrest, cccrop, rrrock, rockForrest},
		{water, cropFforrest, rock, fforrest, rrock, crop, ccropForrest, cccrop, rrrock, ffforrest},
		{water, forrest, cropFforrest, cropRrock, cropRrock, cropRrock, ccropForrest, cccrop, rrrock, ffforrest},
		{water, forrest, cropFforrest, cropRrock, rrock, crop, ccrop, cccrop, rrrock, ffforrest},
		{water, forrest, cropFforrest, fforrest, rrock, crop, ccrop, cccrop, rrrock, ffforrest},
		{water, forrest, ccropRock, ccropRock, rrock, cropRock, cropRock, cropRock, rockFforrest, ffforrest},
		{water, forrest, ccropRock, ccropRock, rrock, crop, ccrop, cccrop, rockFforrest, ffforrest},
		{water, forrest, rock, fforrest, rrock, crop, ccrop, cccrop, rockFforrest, ffforrest},
		{water, forrest, rock, fforrest, rrock, crop, ccrop, cccrop, rockFforrest, ffforrest}};
	
	public static void main(String[] args) {
		JFrame f = new JFrame("Yucatan");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		UserInterface ui = new UserInterface(64);
		Box verticalBox = Box.createHorizontalBox();
		Menu menu = new Menu();
		verticalBox.add(ui);
		verticalBox.add(menu);
		f.add(verticalBox);		
		f.setSize(900, 650);
		f.setVisible(true);
		} 
	

		public static void makeMove (String move, House newHouse){
			//String move = xTile,yTile,newId; newHouse
			map[Character.getNumericValue(move.charAt(0))][Character.getNumericValue(move.charAt(1))] = newHouse;
		}
		
		public static void deleteHouse (String delete){
			map[Character.getNumericValue(delete.charAt(0))][Character.getNumericValue(delete.charAt(1))] = mapStart[Character.getNumericValue(delete.charAt(0))][Character.getNumericValue(delete.charAt(1))];
		}
		
}
