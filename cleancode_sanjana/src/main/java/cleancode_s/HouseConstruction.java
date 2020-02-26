package cleancode_s;

public class HouseConstruction {

	 public Sbase type (String type){  
      if(type.equalsIgnoreCase("Standard")) {  
             return new Standard();  
           }   
       else if(type.equalsIgnoreCase("AboveStandard")){  
            return new AboveStandard();  
        }   
      else if(type.equalsIgnoreCase("HighStandard")) {  
            return new HighStandard();  
      } 
      else if(type.equalsIgnoreCase("FullyHighStandard")) {  
           return new FullyHighStandard();  
    }
      return null;
}
}
