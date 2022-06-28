package fmi;

public class LegniCommand implements Command{

	private Trainee trainee; //reciever
	
	public LegniCommand(Trainee trainee)
	{	
		this.trainee = trainee;
	}
	
	public void execute() {
		System.out.println(" legni ");	
		this.trainee.legni();
		
	}

	@Override
	public void undo() {
		this.trainee.stani();
		
	}

}
