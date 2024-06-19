package demo6;

import utils.Keyboard;

public class ProductApp {
	
	private ProductService service = new ProductService();

	private void displayMenu() {
		System.out.println("--------------------------------------------------");
		System.out.println("1.전체조회 2.상세조회 3.등록 4.수정 5.삭제 0.종료");
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		System.out.print("메뉴번호 입력: ");
		int menuNo = Keyboard.readInt();
		
		if (menuNo == 1) {
			viewAllProducts();
		} else if (menuNo == 2) {
			viewProductDetail();
		} else if (menuNo == 3) {
			addNewProduct();
		} else if (menuNo == 4) {
			modifyProductInfo();
		} else if (menuNo == 5) {
			removeProduct();
		} else if (menuNo == 0) {
			System.out.println("<< 프로그램 종료 >>");
			System.exit(0);
		}	
		
		System.out.println();
		System.out.println();

		displayMenu();
	}
	
	private void viewAllProducts() {
		System.out.println("<< 전체 상품 조회 >>");

		System.out.println("-----------------------------------------");
		System.out.println("번호\t가격\t할인가격\t이름");
		System.out.println("-----------------------------------------");
		
		
	}
	
	private void viewProductDetail() {
		System.out.println("<< 상품 상세 조회 >>");

	}
	
	private void addNewProduct() {
		System.out.println("<< 신규 상품 등록 >>");

	}
	
	private void modifyProductInfo() {
		System.out.println("<< 상품 정보 수정 >>");

	}
	
	private void removeProduct() {
		System.out.println("<< 상품정보 삭제 >>");

	}
	
	public static void main(String[] args) {
		ProductApp app = new ProductApp();
		app.displayMenu();
	}
}
