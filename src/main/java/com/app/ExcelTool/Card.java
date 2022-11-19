package com.app.ExcelTool;

public class Card {
	
	private String cardType;
	private String cardFront;
	private String cardBack;
	private String cardExtra;
	private String cardCloze;
	
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public String getCardFront() {
		return cardFront;
	}
	public void setCardFront(String cardFront) {
		this.cardFront = cardFront;
	}
	public String getCardBack() {
		return cardBack;
	}
	public void setCardBack(String cardBack) {
		this.cardBack = cardBack;
	}
	public String getCardExtra() {
		return cardExtra;
	}
	public void setCardExtra(String cardExtra) {
		this.cardExtra = cardExtra;
	}
	public String getCardCloze() {
		return cardCloze;
	}
	public void setCardCloze(String cardCloze) {
		this.cardCloze = cardCloze;
	}
	public Card() {
		super();
	}
	public Card(String cardType, String cardFront, String cardBack, String cardExtra, String cardCloze) {
		super();
		this.cardType = cardType;
		this.cardFront = cardFront;
		this.cardBack = cardBack;
		this.cardExtra = cardExtra;
		this.cardCloze = cardCloze;
	}
	@Override
	public String toString() {
		return "Card [cardType=" + cardType + ", cardFront=" + cardFront + ", cardBack=" + cardBack + ", cardExtra=" + cardExtra + ", cardCloze=" + cardCloze + "]";
	}
}
