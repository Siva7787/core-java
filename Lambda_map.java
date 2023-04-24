package lambda_expressions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda_map {

	public static void main(String[] args) {
		List<Integer>marks=Arrays.asList(78,68,48,74,95,71,46,78);
		marks.stream().map(mark->mark+2).forEach(mark->System.out.println(mark));
		
		System.out.println("****************************************");
		
		marks.stream().filter(i->i%2==0).map(mark->mark/10).forEach(mark->System.out.println(mark));
		
		System.out.println("****************************************");
		
		List<Integer>marks_list=marks.stream().map(map->(map/10)+5).filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(marks_list);
		
		System.out.println("****************************************");

		Set<Integer> marks_set=marks.stream().map(map->map/5+10).filter(i->i%2!=0).collect(Collectors.toSet());
		System.out.println(marks_set);
	}

}
