package sii.maroc;

public class Meal {
	
private boolean MealtoPrepare=false;
    
    
	public boolean MealtoPrepare() {
		return MealtoPrepare;
	}

	public void MealtoPrepare(boolean MealtoPrepare2) {
		this.MealtoPrepare = MealtoPrepare;
		
	}

	public int servedDishes() {
		// TODO Auto-generated method stub
		if (MealtoPrepare==true) 
			return 1;
		else
			return 0;
	}

	public int cookingDuration() {
		// TODO Auto-generated method stub
		return 0;
	}

}
