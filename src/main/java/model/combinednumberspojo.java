package model;

/**
 * @author ${user} - cbrucker19
 * CIS175 - Spring 2022
 * ${date}
 */
public class combinednumberspojo {
	
	private int firstNum;
	private int secondNum; 
	private int addTotal;
	private int multiTotal; 
	
	public combinednumberspojo() {
		super();
	}
	public combinednumberspojo(int fn, int sn) {
		this.firstNum = fn;
		this.secondNum = sn; 
	}
	public int getFirstNum() {
		return firstNum;
	}
	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}
	public int getSecondNum() {
		return secondNum;
	}
	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	public int getAddTotal() {
		
		addTotal = firstNum + secondNum; 
		
		return addTotal;
	}
	public int getMultiTotal() {
		multiTotal = firstNum * secondNum;
		
		return multiTotal;
	}
	@Override
	public String toString() {
		return "combinednumberspojo [firstNum=" + firstNum + ", secondNum=" + secondNum;
	}	
}