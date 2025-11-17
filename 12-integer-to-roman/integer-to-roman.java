class Solution {
    public String intToRoman(int num) {
        String str = "";
        while(num>=1000){
            str += "M";
            num -= 1000;
        }
        while(num>=900){
            str += "CM";
            num -= 900;
        }
        while(num>=500){
            str += "D";
            num -= 500;
        }
        while(num>=400){
            str += "CD";
            num -= 400;
        }
        while(num>=100){
            str += "C";
            num -= 100;
        }
        while(num>=90){
            str += "XC";
            num -= 90;
        }
        while(num>=50){
            str += "L";
            num -= 50;
        }
        while(num>=40){
            str += "XL";
            num -= 40;
        }
        while(num>=10){
            str += "X";
            num -= 10;
        }
         while(num>=9){
            str += "IX";
            num -= 9;
        }
        while(num>=5){
            str += "V";
            num -= 5;
        }
        while(num>=4){
            str += "IV";
            num -= 4;
        }
        while(num>=1){
            str += "I";
            num -= 1;
        }
        return str;
    }
}