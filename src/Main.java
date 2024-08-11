import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Block> blockchain = new ArrayList<>();


        String[] genesisTransactions = {
                "Tom sent 10 Bitcoins to Jason",
                "James sent 20 Bitcoins to Jerry"
        };

        // If we change anything in the transactions of the block, its digital signature gets changed
        // This will cause the entire blockchain to change, which is not possible
        Block genesisBlock = new Block(0, genesisTransactions);


        // Extra Blocks
        String[] block2Transactions = {
                "Tom sent 25 Bitcoins to Bugatti"
        };
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {
                "Artin sent you 25 Bitcoins to Bugatti",
        };

        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        // System.out.println(block2.getBlockHash());

        // When someone tries to cheat the system, the entire blockchain ledger gets changed
        // However, when compared to the versions of other users, they will know that you cheated

    }
}