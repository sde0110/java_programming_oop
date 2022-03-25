package myclass.java;

public class BlockDemo {
		static { System.out.println("static block"); }
		{ 
		System.out.println("non-static block"); 
		}
		public static void main(String[] args) {
			boolean condition = true;
			if (condition) { // begin block 1
				System.out.println("Condition is true.");
		} // end block 1
			else { // begin block 2
				System.out.println("Condition is false.");
		} // end block 2
		
		BlockDemo bd = new BlockDemo ();
		System.out.println("1 BlockDemo created");
			
		new BlockDemo();
		System.out.println("2 BlockDemo created");

		}
}
