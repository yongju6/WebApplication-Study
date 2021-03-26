package chapter12;

public class Ex06 {
	public static void main(String[] args) {
//		// 사과를 담을 수 있는 바구니를 만들어서 바구니에 사과를 담아보세요.
//		Apple[] basket = new Apple[3];
//		basket[0] = new Apple();
//		
//		// 바나나를 담을 수 있는 바구니를 만들어서 바구니에 바나나를 담아보세요.
//		Banana[] bananaBasket = new Banana[3];
//		bananaBasket[0] = new Banana();
//		
//		Onion[] onionBasket = new Onion[3];
//		onionBasket[0] = new Onion();
		
		Fruit[] fruitShelf = new Fruit[3];
		fruitShelf[0] = new Apple();
		fruitShelf[1] = new Banana();
//		// 오류
//		fruitShelf[2] = new Onion();
		
		Vegetable[] vegetableShelf = new Vegetable[3];
		vegetableShelf[0] = new Onion();
//		// 오류
//		vegetableShelf[1] = new Apple();
//		vegetableShelf[2] = new Banana();
		
		Product[] productBasket = new Product[3];
		productBasket[0] = new Apple();
		productBasket[1] = new Banana();
		productBasket[2] = new Onion();
		
		
	}
}
