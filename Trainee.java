package fmi;

import java.util.List;

public class Trainee implements Observable{
	private Boolean isntPushing;
	private List<Observer> onlineViewers;
	
	public Trainee()
	{
		
		
	}
	
	public void dontPush() {
		this.isDown = true;	
		System.out.println("Trainee isnt pushing");
		this.notify();
	}
	
	public void getUp() {
		this.isDown = false;	
		System.out.println("Trainee is up");
		this.notify();
	}

	@Override
	public void subscribe(Observer observer) {
		this.onlineViewers.add(observer);
		observer.setTrainee(this);		
	}

	
	public void notifyObserver() {
		for(Observer viewer : this.onlineViewers) {
			viewer.update();		
		}
			
	}
	
	@Override
	public void unsubscribe(Observer observer) {
		this.onlineViewers.remove(observer);
		observer.setTrainee(null);
	}

	@Override
	public Boolean getUpdate() {
		return this.isntPushing;
	}
}
