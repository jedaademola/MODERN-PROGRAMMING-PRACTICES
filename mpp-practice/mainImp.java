package intermethodref;


import java.util.function.Function;


public class mainImp 
{
	//type:  Class::instanceMethod
		//Function<myNumbers,Integer> nF1 = n -> n.getFir();
		Function<myNumbers,Integer> nF2 = myNumbers::getFir;
		
		//Function<myNumbers,Integer> nS1 = n -> n.getSec();
		Function<myNumbers,Integer> nS2 = myNumbers::getSec;
		
		//Function<myNumbers,Integer> nSm1 = n -> n.addUs();
		Function<myNumbers,Integer> nSm2 = myNumbers::addUs;
		
		//Function<myNumbers,Integer> nSb1 = n -> n.subUs();
		Function<myNumbers,Integer> nSb2 = myNumbers::subUs;
		
		//Function<myNumbers,Integer> nMl1 = n -> n.mulUs();
		  Function<myNumbers,Integer> nMl2 = myNumbers::mulUs;
		  
		//Function<myNumbers,Integer> nDv1 = n -> n.dvdUs();
		  Function<myNumbers,Integer> nDv2 = myNumbers::dvdUs;
		  
	public void eval()
	{
        myNumbers mn1=new myNumbers(4,2);
		System.out.println("Fisrt="+nF2.apply(mn1));
		System.out.println("Second="+nS2.apply(mn1));
		System.out.println("Sum="+nSm2.apply(mn1));
		System.out.println("Sub="+nSb2.apply(mn1));
		System.out.println("Sub="+nMl2.apply(mn1));
		System.out.println("Sub="+nDv2.apply(mn1));
	}
				
	public static void main(String[] args) 
	{
		mainImp e = new mainImp();
		e.eval();
		
	}

}
