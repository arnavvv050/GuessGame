package guessgame;

 class GuessGame{
	Player p1;//p1 is a instance variable for player objects
	Player p2;
	Player p3;
	public void startgame() {
		p1= new Player();
		p2= new Player();
		p3= new Player();
		int guessp1=0;
		int guessp2=0;
		int guessp3=0;
		boolean p1isright=false;
		boolean p2isright=false;
		boolean p3isright=false;
		int targetNumber = (int)(Math.random()*10);//here a number will be generated which players have to guess
		System.out.println("umm I'll guess a number between 0 and 9");
while(true) {
	System.out.println("Number to guess is"+targetNumber);
	p1.guess();//calling guess method of player
	p2.guess();
	p3.guess();
	
guessp1 = p1.number;// above we assigned guessp1 as 0 for intialization purpose here we are just accessing p1's number variable using dot operator
System.out.println("Player one guessed"+guessp1);
guessp2=p2.number;
System.out.println("Player two guessed"+guessp2);
guessp3=p3.number;
System.out.println("Player 3 guessed"+guessp3);
if(guessp1==targetNumber) {
	p1isright=true;
	
}
if(guessp2==targetNumber) {
	p2isright=true;
	}
if(guessp3==targetNumber) {
	p3isright=true;
	
}

if(p1isright||p2isright||p3isright) {
	System.out.println("We have a winner");
	System.out.println("Player one got it right?"+p1isright);
	System.out.println("Player two got it right?"+p2isright);
	System.out.println("Player three got it right?"+p3isright);
	System.out.println("Game Over");
	break;
}
else {
	System.out.println("Players will have to try again.");
}





}
	
	
	}
	
}
 class Player{
	int number=0;//where the guess goes
	public void guess() {
		number= (int)(Math.random()*10);
		System.out.println("I am guessing "+number);
		
	}
}

public class GameLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
GuessGame game= new GuessGame();
game.startgame();
	}

}
