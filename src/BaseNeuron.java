public class BaseNeuron {
    private int input1 = 0;
    private double weight = 1.5;
    private double threshold = 2.0;

    public BaseNeuron(int input1) {
        this.input1 = input1;
    }

    //I'm being stupid and summing them, but it works in my mind
    //Then again, I haven't even begun to make the Hopfield yet, so who knows if this works
    //Multiplication just didn't work with BiPolar values
    //(I don't feel like normalization right now)
    public int doFire() {
        if (input1 + weight > threshold) {
            return 1;
        }
        return -1;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public int getInput1() {
        return input1;
    }
}
