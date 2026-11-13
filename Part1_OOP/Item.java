// Name: Ilan Lashinker - ID: 324946839 || Name: Darii Sandalov - ID: 345975858


public class Item {
    private String name;
    private int value;
    private boolean isMagical;

    public Item(){
        name = "Unknown";
        value = 0;
        isMagical = false;
    }

    public Item(String name, int value, boolean isMagical){
        this.name = name;
        this.value = value;
        this.isMagical = isMagical;
    }

    public String toString(){
        String magical;

        if(this.isMagical){
            magical = "Magical item";
        }else{
            magical = "Not magical item";
        }


        return "Name: " + this.name + "\n" + "Value: " +this.value + "\n" + magical;
        
    }

    public int getValue(){
        return value;
    }

    public void setValue(int v){
        if(v<0){
            this.value = 0;
        }else{
            this.value = v;
        }
    }


   public boolean isMagical(){
    return isMagical;
   }

   public String getName(){
    return name;
   }
}
