package demo21;

import java.util.Date;

public class Photoshop {
	
	private Date date;
	private java.sql.Date day;

	// 선 그리기 기능
	public void drawLine(Pen pen) {
		pen.draw();
	}
	
	public Pen selectPen(int no) {
		Pen redPen = new Pen() {
			public void draw() {
				System.out.println("빨간 펜으로 그린다.");
			}
		};
	
		Pen yellowPen = new Pen() {
			public void draw() {
				System.out.println("노란 펜으로 그린다.");
			}
		};

		Pen bluePen = new Pen() {
			public void draw() {
				System.out.println("파란 펜으로 그린다.");
			}
		};
		
		Pen selectedPen = null;
		switch (no) {
		case 1:
			selectedPen = redPen;
			break;
		case 2:
			selectedPen = yellowPen;
			break;
		case 3:
			selectedPen = bluePen;
			break;
		default:
			selectedPen = () -> System.out.println("까만 색으로 그린다.");
		}
		
		return selectedPen;
		
	}

	public static void main(String[] args) {
		Photoshop app = new Photoshop();
		Pen pen = app.selectPen(2);
		app.drawLine(pen);
	}
	
}


