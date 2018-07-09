public class vaultRunner {
	public static void main(String[] args) {
		Vault v = new Vault(360);
		JamesBond jb = new JamesBond();
		System.out.println(jb.findCode(v));
	}
}
