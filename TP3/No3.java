package TP3;

public class No3 {
    public static void main(String[] args) {
        int intNum = 5;
        int intOther = 10;
        int sngNum = -3;

        if (intNum > 5){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (intNum >= 5 && intOther < 11){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (sngNum != -1 || intOther < 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (!(intNum > 3) || intNum <= 5){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (!(intOther >= intNum)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (0 - sngNum > 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (4/2 == intOther / intNum){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (intOther % 2 == 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (intOther + 2 * intNum != 30 || !(sngNum > 0)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (intOther > 0 && intNum > 0 || sngNum > 0){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (sngNum > 0 || (intNum >= 0 && -1 * intOther == -10)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
        if (intNum == 5){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (intNum > 0 || (sngNum <= 0 && intOther == 13)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        if (!(!(!(!(intNum > 0))))){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
