package com.javarush.task.task27.task2712.ad;

/**
 * Created by Taly on 30.01.2018.
 */
public class Advertisement {
	private Object content; // видео
	private String name; // имя/название
	private long initialAmount; // начальная сумма, стоимость рекламы в копейках. Используем long, чтобы избежать проблем с округлением
	private int hits; // количество оплаченных показов
	private int duration; // продолжительность в секундах
	private long amountPerOneDisplaying; //стоимость одного показа рекламного объявления в копейках

	public Advertisement(Object content, String name, long initialAmount, int hits, int duration) {
		this.content = content;
		this.name = name;
		this.initialAmount = initialAmount;
		this.hits = hits;
		this.duration = duration;
		this.amountPerOneDisplaying = initialAmount / hits;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHits() {
		return hits;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public long getAmountPerOneDisplaying() {
		return amountPerOneDisplaying;
	}

	public void revalidate() {
		if (hits <= 0)
			throw new UnsupportedOperationException();
		if (hits == 1) {
			amountPerOneDisplaying += initialAmount % amountPerOneDisplaying;
		}
		hits--;
	}
}
