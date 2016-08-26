package Test.Test5.Test1;

import java.util.Scanner;  
public class Main {  
      
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Scanner in = new Scanner(System.in);  
          
        String str = in.nextLine();  
        String[] ss = str.split(" ");//以空格为间隔 把str分割为若干个字符串 放入数组ss  
        int i;  
        for(i=0;i<ss.length-1;i++)  
            if(ss[i].length()!=0)//长度为0的字符串不输出  
                {System.out.print(ss[i].length()+" ");}  
        if(ss[i].length()!=1)//最后一位如果只有.不输出 且最后一位无空格  
            System.out.println(ss[i].length()-1);  
        in.close();
    }  
}  