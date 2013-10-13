public class BaseNeuron {
    private int input1 = 0;
    private double weight = 1.5;
    private double threshold = 2.0;

    public BaseNeuron(int input1) {
        this.input1 = input1;
    }

    //Basic Method
    public int doFireB() {
        if (input1 + weight > threshold) {
            return 1;
        }
        return -1;
    }

    //Hyperbolic Tangent Method
    public boolean doFireT() {
        return Math.tanh(input1) >= 0;
    }

    public void setInput1(int input1) {
        this.input1 = input1;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public int getInput1() {
        return input1;
    }

    public double getWeight() {
        return weight;
    }

    public double getThreshold() {
        return threshold;
    }
}
