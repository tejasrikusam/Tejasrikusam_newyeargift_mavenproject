package newyeargift.newyeargift;

public class Perk {

	int per_choco_weight=13;
    //per chocolate cost in rupees
    int per_choco_cost=10;
    int total_weight;
    int total_cost;
    public int total_weight(int n){
        total_weight=n*per_choco_weight;
        return total_weight;
    }
    public int total_cost(int n){
        total_cost=n*per_choco_cost;
        return total_cost;
    }
}
