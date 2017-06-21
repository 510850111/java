
public class bitVector {
	private int[] words;
	
	public bitVector(int size){
		words  = new int[(size + 31) >> 5];
	}
	
	
	public int size(){
		return words.length << 5;
	}
	
	public boolean getValue(int index) {
		int wi = index >> 5;
		return (words[wi] & (1 << index))  != 0;
	}
	
	public void setValue(int index) {
		int wi = index >> 5;
		words[wi] = (1 << index);
	}
	
	public void clearValue(int index) {
		int wi = index >> 5;
		words[wi] &= ~(1 << index);
	}

}
