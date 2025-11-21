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

    public String addVola(long amount){
        if(this.isLost){
            return "your wallet is lost, so you cannot add money";
        }
        this.money += amount ;
        return  amount + " added in your wallet";
    }

    public String checkVola(long amount){
        return money + " in your wallet" ;
    }

    public String getVola(long amount){
        if(this.isLost){
            return "your wallet is lost, so you cannot retrieve money";
        }
        this.money -= amount ;
        return  amount + " retrieve in your wallet";
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
