package com.javarush.task.task21.task2113;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 * Created by Taly on 07.07.2017.
 */
public class Horse { //1. Создадим класс
	String name;    //4. создадим необходимые поля
	double speed;
	double distance;

	public Horse(String name, double speed, double distance) { //5. Создадим конструктор класса Horse
		this.name = name;
		this.speed = speed;
		this.distance = distance;
	}

	public String getName() { //5. Создадим getter’ы и setter’ы для всех полей класса Horse.
		return name;
	}

	public double getSpeed() {
		return speed;
	}

	public double getDistance() {
		return distance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public void move(){ //8. Добавим метод move
		distance += speed * Math.random(); // 12. Добавим "случайное" перемещение лошади
	}

	public void print(){ //8. Добавим метод print
		StringBuilder str = new StringBuilder();    //13. Выведем "бег" лошадей
		for (int i = 0; i < Math.floor(distance); i++) {
			str.append(".");
		}
		System.out.println(str.append(name).toString());
	}
}
