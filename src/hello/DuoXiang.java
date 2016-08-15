package hello;

import java.util.Scanner;

public class DuoXiang {

	public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int count = 0; //用来判断第几次读到幂次0
	        int[] result = new int[101]; //数组用来存放系数, 默认初始化为0
	        while(count<2){ //第二次读到幂次0时, 终止循环
	            //每次循环读2个数
	            int power = input.nextInt(); // 第一个数为幂次
	            int coefficient = input.nextInt(); // 第二个数为系数
	            if(power==0){
	                count+=1; //读到幂次为0时, 计数+1
	            }
	            result[power]+=coefficient; //数组中下标为幂次的数值, 加上系数
	        }
	        String resultStr = ""; //用来存放结果的字符串
	        boolean isFirst = true; //判断是不是最高次幂项, 最高次幂项前不用写"+"号
	        for(int i=result.length-1;i>=0;i--){ //从最高位开始遍历数组
	            if(result[i]!=0){ //系数不为0则输出, 为0则忽略
	                if(isFirst){ 
	                    isFirst = false; 
	                }else{ //非最高次幂项
	                    if(result[i]>0){ //非最高次幂项系数>0, 则在前面写"+"号;小于0的话, 系数本身就带"-"号, 不用额外添加
	                        resultStr += "+";
	                    }
	                }   
	                if(i==0){ //0次幂项也就是常数项,直接输出系数
	                    resultStr += result[i];
	                }else if(i==1){ //1次幂项, 输出系数+"x"
	                    resultStr += result[i]+"x";
	                }else{ //其他项, 输出系数+"x"+"幂次"
	                    resultStr += result[i]+"x"+i;
	                }
	                 
	                 
	            }
	             
	        }
	        // 如果结果字符里什么也没有, 输出"0";
	        if(resultStr==""){
	            resultStr = "0";
	        }
	        System.out.println(resultStr);
	         
	    }}
