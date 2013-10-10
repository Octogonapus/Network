public class AndNeuron {
    private int input1 = 0;
    private int input2 = 0;
    private double weight = 1;
    private double threshold = 1.5;

    public AndNeuron(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    //Something about (e^p + e^-p) / (e^p - e^-p)
    //How do implements?
    //Sticking to regular if-threshold for now

    //Logical AND must sum inputs
    public int doFire() {
        if ((input1 * weight) + (input2 * weight) > threshold) {
            return 1;
        } else {
            return -1;
        }
    }
}
