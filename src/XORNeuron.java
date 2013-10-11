public class XORNeuron
{
    private int input1 = 0;
    private int input2 = 0;

    public XORNeuron(int input1, int input2) {
        this.input1 = input1;
        this.input2 = input2;
    }

    public int doFireNAND() {
        //LAYER ONE
        NANDNeuron NANDL1_1 = new NANDNeuron(this.input1, this.input2);
        int outNANDL1_1 = NANDL1_1.doFire();

        //LAYER TWO
        NANDNeuron NANDL2_1 = new NANDNeuron(this.input1, outNANDL1_1);
        NANDNeuron NANDL2_2 = new NANDNeuron(outNANDL1_1, this.input2);
        int outNANDL2_1 = NANDL2_1.doFire();
        int outNANDL2_2 = NANDL2_2.doFire();

        //LAYER THREE
        NANDNeuron NANDL3_1 = new NANDNeuron(outNANDL2_1, outNANDL2_2);
        return NANDL3_1.doFire();
    }

    public int doFireNOR() {
        //LAYER ONE
        NORNeuron NORL1_1 = new NORNeuron(this.input1, this.input1);
        NORNeuron NORL1_2 = new NORNeuron(this.input2, this.input2);
        int outNORL1_1 = NORL1_1.doFire();
        int outNORL1_2 = NORL1_2.doFire();

        //LAYER TWO
        NORNeuron NORL2_1 = new NORNeuron(outNORL1_1, outNORL1_2);
        NORNeuron NORL2_2 = new NORNeuron(this.input2, this.input1);
        int outNORL2_1 = NORL2_1.doFire();
        int outNORL2_2 = NORL2_2.doFire();

        //LAYER THREE
        NORNeuron NORL3_1 = new NORNeuron(outNORL2_1, outNORL2_2);
        return NORL3_1.doFire();
    }
}