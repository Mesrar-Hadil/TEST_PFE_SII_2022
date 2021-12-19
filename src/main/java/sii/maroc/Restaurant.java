package sii.maroc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class Restaurant {
	
	
    private String QuantityofMozarella; 
    private String  QuantityofTomatoes; 
    private String QuantityofFlour;
    
    private int RemainingQuantityMozarella;
    private int RemainingQuantityTomatoes;
    private int RemainingQuantityFlour;

    private String order_restaurant; 
    
	public Restaurant(String QuantityofMozarella, String QuantityofTomatoes, String OliveOil, String pepper) {
		// TODO Auto-generated constructor stub
		this.QuantityofMozarella=QuantityofMozarella;
		this.QuantityofTomatoes=QuantityofTomatoes;
	}

	public Restaurant(String QuantityofFlour, String QuantityofTomatoes, String SeaSalt, String QuantityofMozarella, String OliveOil, String Water) {
		// TODO Auto-generated constructor stub
		this.QuantityofMozarella=QuantityofMozarella;
		this.QuantityofTomatoes= QuantityofTomatoes;
		this.QuantityofFlour=QuantityofFlour;
	}


	public Ticket order(String order_restaurant) {
		// TODO Auto-generated method stub
		
		int SaladtoPrepareIngrediant=0;
		int PizzatoPrepareIngrediant=0;
		
		String Exracted=""; 
		
		Ticket ticket=new Ticket();
		
		if(order_restaurant.contains("Salad")) {
		
			Pattern pattern =Pattern.compile("\\d+"); 
			Matcher m = pattern.matcher(order_restaurant);
			
			if (m.find()) {
			   Exracted= m.group(0);}
			SaladtoPrepareIngrediant=Integer.parseInt(Exracted);
			
		    if ((RemainingQuantityMozarella>=SaladtoPrepareIngrediant) && (RemainingQuantityTomatoes>=(2*SaladtoPrepareIngrediant))) {
		    	ticket.setOrderExisted(true);
		    }
		    return ticket;
		    
		    
		}else if(order_restaurant.contains("Pizza")) {
			
			Pattern pattern =Pattern.compile("\\d+"); 
			Matcher m = pattern.matcher(order_restaurant);
			if (m.find()) {
			   Exracted= m.group(0);}
			PizzatoPrepareIngrediant=Integer.parseInt(Exracted);
			
			if((RemainingQuantityMozarella>=PizzatoPrepareIngrediant)&& (RemainingQuantityTomatoes>=(4*PizzatoPrepareIngrediant))&& (RemainingQuantityFlour>=300*PizzatoPrepareIngrediant)) {
				ticket.setOrderExisted(true);
			}
		return ticket;
		}
		
		
		
		return ticket;
	}

	public Meal retrieve(Ticket ticket) {
		// TODO Auto-generated method stub
        Meal meal =new Meal();
		
		if(ticket.OrderExisted()==true) { 
			meal.MealtoPrepare(true);
		}
		else 
		{meal.MealtoPrepare(true);}
		
		return meal;
	}


	
}
