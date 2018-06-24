/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoicetest;


/**
 *
 * @author FON
 */
public class Invoice {
    private static String partNumber;
    private static String partDes;
    private static int quantity;
    private static double perItem;
    double value;

    public Invoice(String partNumber, String partDes,int quantity,double perItem) {
        Invoice.partNumber=partNumber;
        Invoice.partDes=partDes;
        Invoice.perItem=perItem;
        Invoice.quantity=quantity;
        }

    public double getInvoiceAmount(){
        value=perItem*quantity;
        if(value<0)
            value=0;
        return value;
    } 
    
    public static String getPartNumber() {
        return partNumber;
    }

    public static void setPartNumber(String partNumber) {
        Invoice.partNumber = partNumber;
    }

    public static String getPartDes() {
        return partDes;
    }

    public static void setPartDes(String partDes) {
        Invoice.partDes = partDes;
    }

    public static int getQuantity() {
        if(quantity<0)
            quantity=0;
        return quantity;
    }

    public static void setQuantity(int quantity) {
        Invoice.quantity = quantity;
    }

    public static double getPerItem() {
        return perItem;
    }

    public static void setPerItem(double perItem) {
        Invoice.perItem = perItem;
    }
    
    
    
}
