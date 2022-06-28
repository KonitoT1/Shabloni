package fmi;

import java.util.List;

public class Trainee implements Observable{
	private Boolean eLegnal;
	private List<Observer> onlineViewers;
	
	public Trainee()
	{
		
		
	}
	
	public void legni() {
		this.eLegnal = true;	
		System.out.println("Trainee e legnal");
		this.notify();
	}
	
	public void stani() {
		this.eLegnal = false;	
		System.out.println("Trainee e stanal");
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
		return this.eLegnal;
	}
}
