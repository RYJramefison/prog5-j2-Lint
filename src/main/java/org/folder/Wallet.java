package org.folder;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Wallet {
    private Color color;
    private Size size;
    private long money;
    private boolean isLost;

    public long addVola(long amount){
        return money += amount;
    }

    public long checkVola(long amount){
        return money -= amount ;
    }

    public void open(){
        System.out.println("the wallet is opened");
    }

    public void close(){
        System.out.println("the wallet is closed");
    }

    public static void main(String[] args) {
        var wallet = new Wallet(Color.RED, Size.MEDIUM, 1000, false);
        System.out.println(wallet);
        System.out.println(wallet.addVola(100));
        System.out.println(wallet);
    }
}
