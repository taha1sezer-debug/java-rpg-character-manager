public class GameCharacter {

    //PRIVATE VERIABLES
    private String name;
    private  double basePower;
    private double itemBonusPercentage;
    private double totalPower;

    // STATIC VARIABLE
    static int characterCount =0;
    // CONSTRUCTOR
    public GameCharacter(String name,double basePower,double itemBonusPercentage){
    this.name=name;
    this.basePower=basePower;
    this.itemBonusPercentage=itemBonusPercentage;
    this.totalPower = basePower + (basePower * (itemBonusPercentage / 100));

    characterCount++;
    }

    // GETTER METHOD
    public String getName(){
        return name;
    }
    public double getBasePower(){
        return basePower;
    }
    public double getItemBonusPercentage(){
        return itemBonusPercentage;
    }
    public double getTotalPower() {
        return basePower + (basePower * itemBonusPercentage / 100);
    }
    public static int getCharacterCount() {
        return characterCount;
    }

    //SETTER METHOD
    public void setName(String name) {
        this.name = name;
    }
    public void setBasePower(double basePower) {
        this.basePower = basePower;
    }
    public void setItemBonusPercentage(double itemBonusPercentage) {
        this.itemBonusPercentage = itemBonusPercentage;
    }

    public String getRarityTier() {
        double totalPower = getTotalPower();

        if (totalPower >= 9000) {
            return "Legendary";
        } else if (totalPower >= 7000) {
            return "Epic";
        } else if (totalPower >= 5000) {
            return "Rare";
        } else if (totalPower >= 3000) {
            return "Uncommon";
        } else {
            return "Common";
        }
    }
}
