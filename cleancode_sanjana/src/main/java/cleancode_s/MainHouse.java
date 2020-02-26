package cleancode_s;

public class MainHouse {
	public double sase(String type,double sqrfootsize)
	{
		HouseConstruction hc=new HouseConstruction();
		Sbase sb=hc.type(type);
		double rate=sb.getRate();
		double bill=sqrfootsize*rate;
		return bill;
	}
	}