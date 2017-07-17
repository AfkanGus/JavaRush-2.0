package com.javarush.task.task23.task2312;

/**
 * Created by Taly on 14.07.2017.
 */
public class Room {
	private int width, height;
	private Snake snake;
	private Mouse mouse;
	public static Room game;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Snake getSnake() {
		return snake;
	}

	public void setSnake(Snake snake) {
		this.snake = snake;
	}

	public Mouse getMouse() {
		return mouse;
	}

	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}

	public Room(int width, int height, Snake snake) {
		this.width = width;
		this.height = height;
		this.snake = snake;
	}

	public static void main(String[] args) {
		Snake snake = new Snake(1, 1);
		game = new Room(20, 20, snake);
		snake.setDirection(SnakeDirection.DOWN);
	}

	public void run() {

	}

	public void print() {

	}

	public void createMouse() {
		mouse = new Mouse((int) (Math.random() * getWidth()), (int) (Math.random() * getHeight()));

	}

	public void eatMouse() {
		createMouse();
	}

}
