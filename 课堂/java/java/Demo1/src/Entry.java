import java.util.ArrayList;
import java.util.Collections;

import org.omg.CORBA.PUBLIC_MEMBER;


public class Entry {  //∂•º∂¿‡
//	private class  DescComparator implements Compeable() {
//		@Override
//		public int compare(Rational x,Rational y){
//			Rational res =  x.subtract(y);
//			res.simply;
//			return -res.getNumerator();
//		}
//    	  
//      	}			

	public static void main(String[] args) {
		int[] a = {23,11,44,55,77,66,65,88,96};
		bitVector bV = new bitVector(96);
		for(int i = 0;i < a.length;i++){
			bV.setValue(a[i]);
		}
		for(int i = 0;i < a.length;i++){
			if(bV.getValue(i)){
				System.out.printf("%d ",i);
			}
		}
	}
	
	
	
//	private static void disp(ArrayList<Rational> list) {
//		for(int i = 0;i < list.size();i++){
//			System.out.printf("%s ",list.get(i));
//		}
//		System.out.println();
//	}
}
	

