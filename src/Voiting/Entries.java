package Voiting;

public class Entries {
    public Participants user;
    public int voteKeyNumber;
    public String voteAnswer;

    public void entries()
    {
        this.user = new Participants("Noname");

    }

    public void entries(Participants user, int voteKeyNumber, String voteAnswer) {
        this.user = user;
        this.voteKeyNumber = voteKeyNumber;
        this.voteAnswer = voteAnswer;
    }
}
