public class Tile extends House {
	public String upgrade1 = null;
	public String upgrade2 = null;
	public String upgrade3 = null;
	public String upgrade4 = null;
	public String upgrade5 = null;
	
	public Tile(int buildCostWood, int buildCostRock, int buildCostCrop, int yieldWood, int yieldRock, int yieldCrop, String name,	String houseId, String upgradeTo, String upgradeToId, boolean isHouse, String upgrade1, String upgrade2, String upgrade3, String upgrade4, String upgrade5) {
		
		super(buildCostWood, buildCostRock, buildCostCrop, yieldWood, yieldRock, yieldCrop, name, houseId, upgradeTo, upgradeToId, isHouse);
		this.upgrade1 = upgrade1;
		this.upgrade2 = upgrade2;
		this.upgrade3 = upgrade3;
		this.upgrade4 = upgrade4;
		this.upgrade5 = upgrade5;		
	}

	public String getUpgrade1(){
		return upgrade1;
	}
	
	public String getUpgrade2(){
		return upgrade2;
	}
	
	public String getUpgrade3(){
		return upgrade3;
	}
	
	public String getUpgrade4(){
		return upgrade4;
	}
	
	public String getUpgrade5(){
		return upgrade5;
	}
	
	public boolean canBeBuiltOn(String id){
		if (id.equals(upgrade1) || id.equals(upgrade2) || id.equals(upgrade3) || id.equals(upgrade4) || id.equals(upgrade5)){
			return true;
		}
		return false;
	}
	
	public boolean canBuildCrop(){
		if (upgrade1.equals("  C") || upgrade2.equals("  C") || upgrade3.equals("  C") || upgrade4.equals("  C") || upgrade5.equals("  C")){
			return true;
		}
		return false;
	}
	
	public boolean canBuildWood(){
		if (upgrade1.equals("  F") || upgrade2.equals("  F") || upgrade3.equals("  F") || upgrade4.equals("  F") || upgrade5.equals("  F")){
			return true;
		}
		return false;
	}
	
	public boolean canBuildStone(){
		if (upgrade1.equals("  R") || upgrade2.equals("  R") || upgrade3.equals("  R") || upgrade4.equals("  R") || upgrade5.equals("  R")){
			return true;
		}
		return false;
	}
	
}
