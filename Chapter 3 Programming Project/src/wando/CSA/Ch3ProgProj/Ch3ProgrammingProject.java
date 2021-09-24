package wando.CSA.Ch3ProgProj;
	public class Ch3ProgrammingProject		{
		public static void main (String[]args) 	{
	System.out.println("Question 1: Circle Trip Length");
			double Diameter = 10;	//type the diameter here
				Diameter = CircumfrenceCalc(Diameter);
					System.out.println("The length of this trip will be: "+Diameter+"\n --------------");
	System.out.println("Question 2: City Distances");
			int x1 = 29, y1 = 16, x2 = 34, y2 = 8;
			double d;
				d = distance(x1, x2, y1, y2);
					System.out.println("Distance from Baltimare to Manehattan is " +d);
			x1 = 6; y1 = 19; x1 = 22; y2 = 7;
				d = distance(x1, x2, y1, y2);
					System.out.println("Distance from Los Pegasus to Neighargra Falls is " +d);
			x1 = 25; y1 = 24; x1 = 16; y2 = 14;
				d = distance(x1, x2, y1, y2);
					System.out.println("Distance from The Badlands to Ponyville is " +d+"\n --------------");
	System.out.println("Question 3: Ritvik's 3-stop Tour of Equestria!!!");
			x1 = 18; y1 = 10; x1 = 7; y2 = 18;
				d = distance(x1, x2, y1, y2);
						double d1 = d;
					System.out.println("Distance from Cantario to Los Pegasus is " +d);
			x1 = 7; y1 = 18; x1 = 14; y2 = 7;
				d = distance(x1, x2, y1, y2);
						double d2 = d;
					System.out.println("Distance from Los Pegasus to Cloudesdale is " +d);
			x1 = 14; y1 = 7; x1 = 18; y2 = 10;
				d = distance(x1, x2, y1, y2);
						double d3 = d;
					System.out.println("Distance from Cloudesdale to Los Pegasus is " +d+"\n --------------");
	System.out.println("Question 4: Total Trip Length (values from Question 3)");
				double dt = d1+d2+d3;
					System.out.println("Distance Total for Cantario to Los Pegasus to Cloudesdale and\nback to Los Pegasus"
										+ "is "+ dt);
												}
			public static double CircumfrenceCalc(double x)	{
				return x*Math.PI;
										}
			public static double distance(int x1, int x2, int y1, int y2) {
				return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
										}
													}