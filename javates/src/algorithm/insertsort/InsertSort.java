package insertsort;

import java.util.List;

public class InsertSort {

	public void sort(List<Integer> source) {
		if(null == source || source.size() <= 1) {
			return;
		}
		
		for(int i = 1; i < source.size(); i++) {
				for(int j = i - 1; j >= 0; j--) {
					if(source.get(i) < source.get(j)) {
						continue;
					}
					
					
			}
		}
	}
}
