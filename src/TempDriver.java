/*
This class is currently being used to test the integrity and truthfulness of the neuron logic.
I have no idea if it will even be used in the final release.
 */

public class TempDriver {
    public static void main(String[] args) {
        XNORNeuron XNOR1 = new XNORNeuron(1, 1);
        System.out.println(XNOR1.doFireNAND());
        System.out.println(XNOR1.doFireNOR());
    }
}
