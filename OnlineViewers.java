package fmi;

public class OnlineViewers implements Observer {

	private Observable trainee;
	private Boolean isntPushing;
	private String nickname;
	
	public OnlineViewers(String nickname)
	{
		this.nickname = nickname;
		
	}
	
	@Override
	public void update() {
		this.trainee.getUpdate();
		if(this.trainee == null)
		{
			System.out.println("No trainee.");	
			return;			
		}
		this.is = trainee.getUpdate();
		if(this.isntPushing)
		{
			System.out.println(this.nickname + " isnt Pushing");	
					return;
		}
		
		System.out.println(this.nickname + " is Going");	
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
		
	}
	
	//TovaOnova.getTova(string tova?);

}
