package fmi;

public class StaniCommand.java implements Command{ //dai mi .. tova

	private Trainee trainee; //reciever
	
	public StaniCommand.java(Trainee trainee)
	{	
		this.trainee = trainee;
	}
	
	@Override
	public void execute() {
		System.out.println("stani");	
		this.trainee.stani();
		
	}

	@Override
	public void undo() {
		this.trainee.legni();
		
	}

}
