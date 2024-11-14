package ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CollectionTest {
	public static void main(String[] args) {
		final int CHUNK_SIZE = 40;
		
		String source = IntStream.rangeClosed(0, 100)
			.mapToObj(e -> e + "명의아해가가도를질주하오")
			.collect(Collectors.joining());
		
		int length = source.length();
		List<String> list = new ArrayList<>(length/CHUNK_SIZE + 10);
		for(int i = 0; i < length; i+= CHUNK_SIZE) {
			int endIndex = Math.min(length, i+CHUNK_SIZE);
			list.add(source.substring(i,endIndex));
		}
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
