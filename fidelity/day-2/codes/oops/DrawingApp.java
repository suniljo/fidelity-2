package com.fidelity.java.oops;

import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Shape sh = null;

		System.out.print("which shape do you want to work with? [1.Rect | 2.Circle]: ");
		int shapeType = sc.nextInt();

		switch (shapeType) {
		case 1:
			System.out.print("enter rectangle color: ");
			String color = sc.next();
			System.out.print("enter length & breadth of rectangle: ");
			int len = sc.nextInt();
			int bre = sc.nextInt();
			sh = new Rectangle(color, len, bre);
			break;
		case 2:
			System.out.print("enter circle color: ");
			color = sc.next();
			System.out.print("enter radius of circle: ");
			float radius = sc.nextFloat();
			sh = new Circle(color, radius);
			break;
		default:
			System.err.println("ERROR: Invalid Option Selection");
		}
		System.out.println();
		
		System.out.println("====================== SHAPE SELECTED : " + sh.getClass().getSimpleName().toUpperCase()+ "======================\n");
		
		System.out.println("Color of \"" + sh.getClass().getSimpleName() + "\"  = "  + sh.getColor());
		sh.area();
	}

}
