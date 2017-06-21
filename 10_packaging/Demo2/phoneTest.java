class phoneTest{
	public static void main(String[] args){
		phone p = new phone();
		p.setBrand("»ªÎª");
		p.setColor("°µÒ¹ºÚ");
		p.setFlag("ÍÁºÀ°æ");
		p.setPrice(2500);
		
		System.out.println(p.getBrand() + "---------" +  p.getColor() + "--------" + p.getPrice() + "----------" + p.getFlag());
		
	}
}