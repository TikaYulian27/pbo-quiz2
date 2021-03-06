/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tika.GUI.Transaksi;
import java.util.*;
/**
 *
 * @author Tika Yln
 */
public class Transaksi {
    
    //membuat atribut yang dibutuhkan class Transaksi
    private final String code;
    private ArrayList<Item> items = new ArrayList<>();
    private float total;

    //membuat kontruktor dan diisi dengan parameter
    public Transaksi(String code, ArrayList<Item> items) {
        this.code = code;
        this.items = items;
    }
    
    public void setTotal(){
        float total = 0;
        for(Item item : this.items){
            total += item.getTotal();
        }
        this.total = total;
    }
    
    //mencetak transaksi
    public String Info(){
        setTotal();
        String str = "";
        str += "Kode\t\t:"+ this.code +"\n";
        str += "Daftar Belanja :\n";
        for (Item item : this.items){
            str += "\t"+ item.getNama()+" "+ item.getJumlah()+" "+ item.getTotal()+"\n";
        }
        str += "Total\t\t:" + this.total;
        return str;
    }
    
    
}