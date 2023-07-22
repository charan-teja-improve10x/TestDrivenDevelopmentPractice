package templerun;

public class FireBall {

    int speed;
    public FireBall(int speed) {
        throw new InvalidFireBallSpeedException();
    }

    public class InvalidFireBallSpeedException extends RuntimeException{
    }


}
