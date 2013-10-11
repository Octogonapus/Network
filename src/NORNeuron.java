public class NORNeuron
{
    private int input1 = 0;
    private int input2 = 0;
    private double weight = 1.0;
    private double threshold = 0.9;

    public NORNeuron(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public int doFire()
    {
        if (this.input1 == -1)
            this.input1 = 0;
        else if (this.input2 == -1) {
            this.input2 = 0;
        }

        if (this.input1 * this.weight + this.input2 * this.weight > this.threshold) {
            return -1;
        }
        return 1;
    }

    //SETTERS
    public void setInput1(int input1)
    {
        this.input1 = input1;
    }

    public void setInput2(int input2) {
        this.input2 = input2;
    }

    public void setInputs(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    //GETTERS
    public int getInput1() {
        return this.input1;
    }

    public int getInput2() {
        return this.input2;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getThreshold() {
        return this.threshold;
    }
}