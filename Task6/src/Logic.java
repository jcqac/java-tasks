import java.text.DecimalFormat;
import java.util.ArrayList;

public class Logic 
{
	private ArrayList<Paint> allPaints = new ArrayList<Paint>();
	private Room room;
	DecimalFormat df = new DecimalFormat("#.00");
	
	public void addRoom(Room rm)
	{
		room = rm;
	}
	
	public void addPaint(Paint pt)
	{
		allPaints.add(pt);
	}
	
	public double calculateCosts(Paint pt)
	{
		return (Math.ceil((room.totalArea()/pt.totalAreaCovered()))*pt.getCost());
	}
	
	public String formatCosts()
	{
		String temp = "";
		for(Paint paint: allPaints)
		{
			temp += paint.getName() + " will cover a total of " + df.format(paint.totalAreaCovered()) + "m^2" + " each can will cost: £" + df.format(paint.getCost())
					+ "\nYour room has the surface area of " + df.format(room.totalArea()) + "m^2" + " you will need " +  (int)Math.ceil((room.totalArea()/paint.totalAreaCovered())) + " cans of paint"
					+ "\neach can costs: £" + df.format(paint.getCost()) + " so the total cost is: £" + df.format(calculateCosts(paint)) + "\n\n";
		}
		return temp;
	}
		
	public String findCheapest()
	{
		String temp = "";
		double lcost = 0;
		for(Paint paint: allPaints)
		{
			double tcost = calculateCosts(paint); 
			if (tcost < lcost || lcost == 0)
			{
				lcost = tcost;
				temp = paint.getName() +" is the cheapest at total cost of: £" + df.format(lcost);
			}		
		}
		return temp;
	}
	
	public String leastWastage(Room rm)
	{
		String temp = "";
		double lwaste = 0;
		for(Paint paint: allPaints)
		{
			double cans = Math.ceil((room.totalArea()/paint.totalAreaCovered())); 
			double arealeft = cans*paint.totalAreaCovered() - rm.totalArea();
			
			if (arealeft < lwaste || lwaste == 0)
			{
				lwaste = arealeft;
				temp = paint.getName() +" wastes the least amount of paint it can still cover: " + df.format(lwaste) + "m^2";
			}		
		}
		return temp;
	}
	
}
