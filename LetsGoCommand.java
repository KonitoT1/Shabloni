package fmi;

public class LetsGoCommand implements Command{ //dai mi .. tova

	private Trainee trainee; //reciever
	
	public LetsGoCommand(Trainee trainee)
	{	
		this.trainee = trainee;
	}
	
	@Override
	public void execute() {
		System.out.println("Lets go");	
		this.trainee.letsGo();
		
	}

	@Override
	public void undo() {
		this.trainee.dontPush();
		
	}

}
