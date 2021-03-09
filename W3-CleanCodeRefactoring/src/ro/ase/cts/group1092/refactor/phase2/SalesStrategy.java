package ro.ase.cts.group1092.refactor.phase2;

import ro.ase.cts.g1092.refactor.exception.InvalidValueException;

public class SalesStrategy {
	public static final int FIDELITY_YEARS_THRESHOLD=10;
	public static final float FIDELITY_DISCOUNT=0.15f;
	public static final float NORMAL_DISCOUNT=0.1f;
	
	public float ComputeFinalPrice(ProductType productType, float initialPrice, int yearsSinceRegistration) throws InvalidValueException
	  {
		if(initialPrice <= 0 || yearsSinceRegistration < 0) {
			throw new InvalidValueException();
		}
	    float finalResult = 0;
	    float fidelityDiscount = (yearsSinceRegistration > 10) ? (float)15/100 : (float)yearsSinceRegistration/100; 
	   switch(productType){ 
	    case NEW:
	      finalResult = initialPrice;
	   break;
	    case DISCOUNTED:
	    finalResult = 
	    	(initialPrice - (ProductType.DISCOUNTED.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.DISCOUNTED.getDiscount()  * initialPrice));
	    break;
	    case LIMITED_STOCK:
	      finalResult = 
	      	(initialPrice - (ProductType.LIMITED_STOCK.getDiscount() * initialPrice)) - fidelityDiscount * (initialPrice - (ProductType.LIMITED_STOCK.getDiscount() * initialPrice));
	    break;
	    case LEGACY:
	      finalResult = 
	      	(initialPrice - (ProductType.LEGACY.getDiscount() * initialPrice)) - fidelityDiscount * (ProductType.LEGACY.getDiscount() - (0.35f * initialPrice));
	    break;
	    default :
	    	throw new UnsupportedOperationException("Type not managed");
	   }
	    return finalResult;
	  }
}
