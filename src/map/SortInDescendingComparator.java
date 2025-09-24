package map;

	import java.util.Comparator;
	import java.util.Map;

	public class SortInDescendingComparator implements Comparator<Integer>{
	    @Override
	    public int compare(Integer e1, Integer e2) {
	        return e2-e1; // descending order
	    }
	}