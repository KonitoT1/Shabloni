package fmi;

public class OnlineViewers implements Observer {

	private Observable trainee;
	private Boolean eLegnal;
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
		if(this.eLegnal)
		{
			System.out.println(this.nickname + "e legnal");	
					return;
		}
		
		System.out.println(this.nickname + " e stanal");	
	}

	@Override
	public void setTrainee(Observable trainee) {
		this.trainee = trainee;
		
	}
	
	//TovaOnova.getTova(string tova?);

}
