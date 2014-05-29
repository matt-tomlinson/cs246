public class Duck implements Comparable {
  String name;
  int weight;
  
  public Duck(String name, int weight) {
    this.name = name;
	this.weight = weight;
  }
  
  public int compareTo(Object objects) {
    
	// Casts Object parameter back to Duck
	Duck otherDuck = (Duck)object;
	
	// Compares the weight of both duck objects
	if (this.weight < otherDuck.weight) {
	  return -1;
	} else if (this.weight == otherDuck.weight) {
	  return 0;
	} else {
	  return 1;
	}
  }
}

public class DuckSortTestDrive {
  public static void main(String[] args) {
    Duck[] ducks = {
	  new Duck("Daffy", 8),
	  new Duck("Betty", 2),
	  new Duck("Bob", 10)
	};
	
	// Print list of ducks before sorted
	System.out.println("Before sorting:");
	display(ducks);
	
	Arrays.sort(ducks);
	
	System.out.println("\nAfter sorting:");
	display(ducks);
  }
  
  public static void display(Duck[] ducks) {
    for (int i = 0; i < ducks.length; i++) {
	  System.out.println(ducks[i]);
	}
  }
}