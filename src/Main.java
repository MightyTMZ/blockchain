import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Block> blockchain = new ArrayList<>();

        String[] genesisTransactions = {
                "Tom sent you 10 Bitcoins to Jason",
                "James sent 20 Bitcoins to Jerry"
        };
        Block genesisBlock = new Block(0, genesisTransactions);
        System.out.println(genesisBlock.getBlockHash());
    }
}