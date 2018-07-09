public class Minion {
	
private String name; 
private int eyes; 
private String color; 
private String master;

Minion(String n, int e,String c,String m)
{
name = n;
eyes = e;
color = c;
master = m;
}

void setName(String n)
{
name = n;	
}
void setColor(String c)
{
color = c;	
}
void setMaster(String m)
{
master = m;	
}
void setEyes(int e)
{
eyes = e;	
}

String getName()
{
return this.name;
}
String getColor()
{
return this.color;
}
String getMaster()
{
return this.master;
}
int getEyes()
{
return this.eyes;
}

	
	 // Create a constructor, and getters and setters for the member variables. If they’re done right, these tests will pass.
	
	
	
}
