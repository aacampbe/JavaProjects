import java.util.*;

public class Grades {
	//Q1
	public static int readGrades(int[] grades) {
		return grades.length - 1;
	}
	//Q2
	public static int sum(int[] arr) {
		int sum = 0;
		for(int num:arr){
			sum = sum+num;
		}
		return sum;
	}
	//Q3
	public static int sum(int[] arr,int firstIndex,int lastIndex){
		int sum = 0;
		if(firstIndex>=arr.length||lastIndex >=arr.length||firstIndex < 0||lastIndex< 0 || lastIndex<firstIndex){
			  return -666;
		}
		else{
			for(int i=firstIndex;i<lastIndex+1;i++) {
				sum = sum+arr[i];
			}
		}
		return sum;
	}
	//Q4
	public static double average(int[] arr) {
		double sum = 0.0;
		for(int num:arr){
			sum = sum+num;
		}
		return sum / arr.length;
	}
	//Q5
	public static int maxValue(int[] arr) {
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	//Q6
	public static int maxValue(int[]arr,int firstIndex,int lastIndex){
		int max = 0;
		if(firstIndex>=arr.length||lastIndex >=arr.length||firstIndex < 0||lastIndex< 0 || lastIndex<firstIndex){
			  return -666;
		}
		else{
			for(int i=firstIndex;i<lastIndex+1;i++) {
				if(max < arr[i]){
					max = arr[i];
				}
			}
		}
		return max;
	}
	//Q7
	public static int indexOfFirstMaxValue(int[] arr){
		int max = arr[0];
		int indexOfMaxValue = 0;
		int firstOccurenceIndex = 0;
		boolean duplicate = false;
		for(int i=0;i < arr.length;i++) {
			if(max == arr[firstOccurenceIndex] && duplicate==false){
				duplicate = true;
			}
			else if(max < arr[i]&&duplicate==true){
				max = arr[i];
				indexOfMaxValue = i;
				firstOccurenceIndex = i;
				duplicate = false;
			}
		}
		if(duplicate == true) {
			return firstOccurenceIndex;
		}
		else {
			return indexOfMaxValue;
		}
	}
	//Q8
	public static int minValue(int[] arr) {
		int min = arr[0];
		for(int i=0;i < arr.length;i++) {
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
	//Q9
	public static int minValue(int[]arr,int firstIndex,int lastIndex){
		int min = arr[0];
		if(firstIndex>=arr.length||lastIndex >=arr.length||firstIndex < 0||lastIndex< 0 || lastIndex<firstIndex){
			  return -666;
		}
		else {
			for(int i=firstIndex;i<lastIndex+1;i++) {
				if(min>arr[i]){
					min = arr[i];
				}
			}
		}
		return min;
	}
	//Q10
	public static int indexOfFirstMinValue(int[] arr){
		int min = arr[arr.length-2];
		int indexOfMinValue = arr.length-2;
		int lastOccurenceIndex = arr.length-2;
		boolean duplicate = false;
		for(int i=arr.length-2;i<arr.length-1;i++) {
			if(min == arr[lastOccurenceIndex]&&duplicate==false){
				duplicate = true;
				lastOccurenceIndex = i;
			}
			else if(min > arr[i] &&duplicate==true){
				min = arr[i];
				indexOfMinValue = i;
				duplicate = false;
			}
		}
		if(duplicate == true) {
			return lastOccurenceIndex;
		}
		else {
			return indexOfMinValue;
		}
	}
	//Q11
	public static int numberOfBelowAverageElements(int[] arr) {
		int sum = 0;
		int numberBelowAverage = 0;
		for(int num:arr){
			sum = sum+num;
		}
		int average = sum / arr.length;
		for(int i=0;i < arr.length;i++) {
			if(arr[i] < average) {
				numberBelowAverage = numberBelowAverage + 1;
			}
		}
		return numberBelowAverage;
	}
	//Q12
	public static int numberOfAboveAverageElements(int[] arr){
		int sum = 0;
		int numberAboveAverage = 0;
		for(int num:arr){
			sum = sum+num;
		}
		int average = sum / arr.length;
		for(int i=0;i < arr.length;i++) {
			if(arr[i] > average) {
				numberAboveAverage = numberAboveAverage + 1;
			}
		}
		return numberAboveAverage;
	}
	//Q13
	public static void rotateElements(int[] arr) {
		for(int i=0;i<1;i++) {
			int j,last;
			last = arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
	}
	//Q14
	public static void rotateElements(int[] arr,int rotationCount) {
		for(int i=0;i<rotationCount;i++) {
			int j,last;
			last = arr[arr.length-1];
			for(j=arr.length-1;j>0;j--) {
				arr[j] = arr[j-1];
			}
			arr[0] = last;
		}
	}
	//Q15
	public static void reverseArray(int[] arr) {
		Collections.reverse(Arrays.asList(arr));
	}
	public static void getInfo(int[] grades) {
		for(int grade:grades) {
			System.out.println("Enter a grade : ");
		}
		if(grades.length > 1) {
			System.out.println("Number Of Grades"+" "+"="+" "+Integer.toString(readGrades(grades)));
			System.out.println("Maximum Grade"+" "+"="+" "+maxValue(grades));
			System.out.println("Minimum Grade"+" "+"="+" "+minValue(grades));


		}		
	}
	//Q16
	public static void main(java.lang.String[]args){
		int[] grades1 = new int[]{25,75,-1};
		int[] grades2 = new int[]{5,10,20,30,40,50,60,70,80,90,100,-1};
		int[] grades3 = new int[]{19,15,14,33,76,46,88,78,69,79,75,73,72,-1};
		int[] grades4 = new int[]{-1};
		getInfo(grades1);
		System.out.println();
		getInfo(grades2);
		System.out.println();
		getInfo(grades3);
		System.out.println();
		getInfo(grades4);
		System.out.println();
	}
}
