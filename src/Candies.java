package newyeargift.newyeargift;

public class Candies {
	int per_candy_weight=5;
    //per candy cost in rupees
    int per_candy_cost=10;
    int total_weight=0;
    int total_cost=0;
    public int total_weight(int n){
        total_weight=n*per_candy_weight;
        return total_weight;
    }
    public int total_cost(int n){
        total_cost=n*per_candy_cost;
        return total_cost;
    }

}
