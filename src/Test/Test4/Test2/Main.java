package Test.Test4.Test2;

import java.util.Scanner;  

public class Main {  
  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        Scanner in = new Scanner(System.in);  
        int n = in.nextInt();  
        int[][] Tic = new int [n][n];  
        int i,j,num,tag=-1;  
        for(i=0;i<n;i++)  
            for(j=0;j<n;j++)  
                Tic[j][i]=in.nextInt();  
          in.close();
        for(i=0;i<n;i++){//搜索行  
            num = Tic[0][i];  
            for(j=0;j<n-1;j++)  
            {  
                if(Tic[j][i]!=Tic[j+1][i])break;  
                if(j==n-2)tag=num;  
            }  
        }  
        i=0;  
        for(j=0;j<n;j++){//搜索列  
            num = Tic[0][i];  
            for(i=0;i<n-1;i++)  
            {  
                if(Tic[j][i]!=Tic[j][i+1])break;  
                if(i==n-2)tag=num;  
            }  
        }i=0;  
        for(i=0;i<n-1;i++){//正对角线  
            if(Tic[i][i]!=Tic[i+1][i+1])break;  
            if(i==n-2)tag=Tic[0][0];  
        }  
        for(i=0;i<n-1;i++){//反对角线  
            if(Tic[n-1-i][i]!=Tic[n-2-i][i+1])break;  
            if(i==n-2)tag=Tic[n-1][0];  
        }  
        if(tag==1)  
            System.out.println("X");  
        else if(tag==0)  
            System.out.println("O");  
        else  
            System.out.println("NIL");  
        }  
}  