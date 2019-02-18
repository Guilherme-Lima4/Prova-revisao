package operacoes;

public class Operacoes {
	
	
		public double soma(double a, double b) {
			double total = a + b;
			return total;
		}
		
		public double mult(double a, double b) {
			double total = a * b;
			return total;
		}
		
		public double divi(double a, double b) {
			double total = a / b;
			return total;
		}
		
		public double sub(double a, double b) {
			double total = a - b;
			return total;
		}
		
		public double porcen(double a, double b) {
			double total = a*(b/100);
			return total;
		}
	
		public double potenc(double a, double b) {
			double total = Math.pow(a, b);
			return total;		
		}
		
		public double raiz(double a) {
			double total = Math.sqrt(a);
			return total;
		}
		
		
		
		
		
		public static void main(String[] args)	{
		Operacoes obj = new Operacoes();
		System.out.println(obj.soma(100, 200));
		System.out.println(obj.mult(10, 100));
		System.out.println(obj.divi(100, 10));
		System.out.println(obj.sub(100, 50));
		System.out.println(obj.porcen(50, 100));
		System.out.println(obj.potenc(5, 2));
		System.out.println(obj.raiz(81));
	}
	}


