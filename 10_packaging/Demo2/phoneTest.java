class phoneTest{
	public static void main(String[] args){
		phone p = new phone();
		p.setBrand("��Ϊ");
		p.setColor("��ҹ��");
		p.setFlag("������");
		p.setPrice(2500);
		
		System.out.println(p.getBrand() + "---------" +  p.getColor() + "--------" + p.getPrice() + "----------" + p.getFlag());
		
	}
}