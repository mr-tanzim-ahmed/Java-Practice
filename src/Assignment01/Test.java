import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String args[]){
		List <String> list = List.of("a", "b", "c");
		List <String> name =  new ArrayList<>();
		name.addAll(list);
		for (String s : name) {
			System.out.println(s);
		}
	}

}
