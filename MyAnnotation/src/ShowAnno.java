import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = ElementType.METHOD)
@interface Anno {
	int val();
}


public class ShowAnno {
	@Anno(val = 1)
	private void firstMethod() {
		System.out.println("First method!");
	}

	public void secondMethod() {
		System.out.println("Second method!");
	}

	@Anno(val = 3)
	public void thirdMethod() {
		System.out.println("Third method!");
	}
}
