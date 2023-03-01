package test;

import java.util.Spliterator.OfInt;
import java.util.function.IntConsumer;

public class Test_J11 extends Test_ {


	public static void main(String[] args) {
		String s = "testing";
		OfInt x = s.lines().spliterator();
		x.tryAdvance(new IntConsumer() {

			@Override
			public void accept(int value) {
				System.out.println(value);
			}
			
		});
		
		System.out.println("Test_J11 OK");
	}

}