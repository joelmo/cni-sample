public class hello {

    static {
	System.load("/home/joelmo/Documents/cni-sample/sample.so");
    }
    
    public static void main(String argv[]) {
	sample s = new sample();
	s.myJava();
    }

  
}
