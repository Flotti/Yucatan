public class House {
	private int buildCostWood;
	private int buildCostRock;
	private int buildCostCrop;
	private int yieldWood;
	private int yieldRock;
	private int yieldCrop;
	private String name;
	private String houseId;
	private String upgradeTo;
	private String upgradeToId;
//	private String upgradeFrom;
	private boolean isHouse;
	
	public House(int buildCostWood, int buildCostRock, int buildCostCrop, int yieldWood, int yieldRock, int yieldCrop, String name, String houseId, String upgradeTo, String upgradeToId, boolean isHouse){
		this.buildCostWood = buildCostWood;
		this.buildCostRock = buildCostRock;
		this.buildCostCrop = buildCostCrop;
		this.yieldWood = yieldWood;
		this.yieldRock = yieldRock;
		this.yieldCrop = yieldCrop;
		this.name = name;
		this.houseId = houseId;
		this.upgradeTo = upgradeTo;
		this.upgradeToId = upgradeToId;
//		this.upgradeFrom = upgradeFrom;
		this.isHouse = isHouse;
	}
	
	public void setBuildCostWood(int buildCostWood){
		this.buildCostWood = buildCostWood;
	}
	
	public void setBuildCostRock(int buildCostRock){
		this.buildCostRock = buildCostRock;
	}
	
	public void setBuildCostCrop(int buildCostCrop){
		this.buildCostCrop = buildCostCrop;
	}
	
	public void setYieldWood(int yieldWood){
		this.yieldWood = yieldWood;
	}	
	
	public void setYieldRock(int yieldRock){
		this.yieldRock = yieldRock;
	}
	
	public void setYieldCrop(int yieldCrop){
		this.yieldCrop = yieldCrop;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setHouseId(String houseId){
		this.houseId = houseId;
	}
	
	public void setUpgradeTo(String upgradeTo){
		this.upgradeTo = upgradeTo;
	}
	
	public int getBuildCostWood(){
		return buildCostWood;
	}
	
	public int getBuildCostRock(){
		return buildCostRock;
	}
	
	public int getBuildCostCrop(){
		return buildCostCrop;
	}
	
	public int getYieldWood(){
		return yieldWood;
	}

	public int getYieldRock(){
		return yieldRock;
	}
	
	public int getYieldCrop(){
		return yieldCrop;
	}

	public String getName(){
		return name;
	}
	
	public String getHouseId(){
		return houseId;
	}
	
	public String getUpgradeTo(){
		return upgradeTo;
	}
	
	public String getUpgradeToId(){
		return upgradeToId;
	}
	
//	public String getUpgradeFrom(){
//		return upgradeFrom;
//	}
	
	public boolean getIsHouse(){
		return isHouse;
	}
	
	public boolean getIsHouse(String houseId){
		return isHouse;
	}
	
}
