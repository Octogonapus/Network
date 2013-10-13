public class TempDriver {
    public static void main(String[] args) {
        //Make the four neurons and give them inputs
        BaseNeuron N1 = new BaseNeuron(1);
        BaseNeuron N2 = new BaseNeuron(1);
        BaseNeuron N3 = new BaseNeuron(-1);
        BaseNeuron N4 = new BaseNeuron(1);

        //Make a blank weight matrix
        int weightMatrix[][] = {
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0},
                {0,0,0,0}
        };

        //Get the input matrix
        int inputMatrix[][] = {
                {1},
                {1},
                {-1},
                {1}
        };

        //Transpose the input matrix
        int inputMatrixT[][] = {
                {1, 1, -1, 1}
        };

        //Multiply the input matrix by its transposed matrix
        int resultMatrix[][] = {
                {1, 1, -1, 1},
                {1, 1, -1, 1},
                {-1, -1, 1, -1},
                {1, 1, -1, 1}
        };

        //Set the NW diagonal to 0 for a contributing matrix
        int contribMatrix[][] = {
                {0, 1, -1, 1},
                {1, 0, -1, 1},
                {-1, -1, 0, -1},
                {1, 1, -1, 0}
        };

        int outputMatrix[] = {N1.doFireB(), N2.doFireB(), N3.doFireB(), N4.doFireB()};
    }
}