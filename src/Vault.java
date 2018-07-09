
public class Vault {
	int vc;
Vault(int c)
{
vc = c;	
}
	boolean tryCode(int c) {
		if (c == vc) {
			return true;
		} else {
			return false;
		}
	}
}
