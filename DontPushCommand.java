package fmi;

public class DontPushCommand implements Command{

	private Trainee trainee; //reciever
	
	public DontPushCommand(Trainee trainee)
	{	
		this.trainee = trainee;
	}
	
	public void execute() {
		System.out.println("Dont push.");	
		this.trainee.dontPush();
		
	}

	@Override
	public void undo() {
		this.trainee.letsGo();
		
	}

}
