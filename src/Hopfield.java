public class Hopfield {
    //Each neuron is tied to each other neuron
    //Used for pattern recognition
    public static void main(String[] args) {
        //One input per neuron
        int inputg, inputbl, inputbr, inputr;

        //Starting values
        //These change inside the network
        inputg = 0;
        inputbl = 0;
        inputbr = 0;
        inputr = 0;

        //The four neurons to be used in the network
        BaseNeuron N1 = new BaseNeuron(inputg);
        BaseNeuron N2 = new BaseNeuron(inputbl);
        BaseNeuron N3 = new BaseNeuron(inputbr);
        BaseNeuron N4 = new BaseNeuron(inputr);

        //Connect the neurons to each other
        //GREEN LINE
        N1.setInput1();
    }
}
