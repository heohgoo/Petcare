/*package view;

import java.util.Scanner;

import model.GiveFoodModel;

import java.util.Observable;
import java.util.Observer;

public class GiveFoodView implements Observer{
	private GiveFoodModel gm;
	private MainModel mm;
	
	public GiveFoodView(MainModel mm, GiveFoodModel gm) {
		int a, b = 0;
		System.out.println("1.�ٷ� �ֱ�(100g)  2. ����, ��� �� �����Ͽ� ���");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		gm.addObserver(this);
		this.gm = gm;
		this.mm=mm;
		if(num==2) {
		  System.out.println("���ϴ� ��ķ�(g) :");
		  a = sc.next();
		  System.out.println("���ϴ� ��� �� : ");
		  b = sc.next();
		}
		gm.givefood(num, a, b);
	
		sc.close();
	}

	@Override
	public void update(Observable o, Object arg) {
		if (gm.getIsValid() == true) {
			System.out.println("Give Food Complete");
			mm.setSceneNum(2);
		}
		else System.out.println("Error");
		mm.setSceneNum(1);
	}
}
*/