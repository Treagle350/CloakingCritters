package Characters;

public class Mood {
	int ectasy;
	int admiration;
	int terror;
	int amazement;
	int grief;
	int loathing;
	int rage;
	int vigilance;
	
	public Mood() {
		ectasy = 0;
		admiration = 0;
		terror = 0;
		amazement = 0;
		grief = 0;
		loathing = 0;
		rage = 0;
		vigilance = 0;
	}
	
	public Mood(int ectasy, int admiration, int terror, int amazement, int grief, int loathing, int rage, int vigilance) {
		ectasy = this.ectasy;
		admiration = this.admiration;
		terror = this.terror;
		amazement = this.amazement;
		grief = this.grief;
		loathing = this.loathing;
		rage = this.rage;
		vigilance = this.vigilance;
	}
	
	public Mood(Mood mood) {
		//Superposition of moods ?
	}

}
