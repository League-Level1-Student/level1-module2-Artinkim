public class JamesBond {
	int findCode(Vault v)
	{
	for(int i = 1000000;i>=-1;i--)	
	{
	if(v.tryCode(i))
	{
	return i;	
	}
	}
	return -1;
	
	}
}
