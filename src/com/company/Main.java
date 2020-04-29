package com.company;
// среднее арифметическое в массиве
public class Main {

    public static void main(String[] args) {
	double array[]={0.1,0.2,0.4,0.55,0.54,0.66,0.54,0.66,0.88,0.62};
	int i;
	double x;
	x=0;
	for(i=0;i<10; i++)
    {
        x+=array[i];
    }
        System.out.println(x/10);
    }
}
