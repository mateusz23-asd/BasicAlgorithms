public class BasicAlgorithms {
	/*
	 10 basic algorithm
	 */
	public static void main (String[] args) {
		int sum = 0;
		int[] sumArr = RandomArr(10);
		String[] paint1 = {"red", "black", "silver", "beige", "gold", "violet", "brown"};
		String[] paint2 = {"blue", "orange", "beige", "pink", "gray", "black", "indigo",
							"yellow", "white"};
		String[] colors = {"blue", "red", "purple", "orange", "yellow", 
				"black", "white", "brown" , "green"};
		System.out.println("I used 3 arrays for the quests.");
		System.out.println();
		// num Array
		for(int s : sumArr) {
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println();
		//String arrays
		for(String s : paint1) {
			System.out.print(s + ", ");
		}
		System.out.println();
		for(String s : paint2) {
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("-- 1. Summary algorithm. --");
		System.out.println();
		for (int i = 0; i < sumArr.length; i++) {
			sum += sumArr[i];
		}
		System.out.println("The summary of the array is, " + sum + ".");
		System.out.println();
		// 2. Counting
		System.out.println("-- 2. Counting (even or odd). --");
		System.out.println();
		int odd = 0;
		int even= 0;
		for (int i = 0; i < sumArr.length; i++) {
			if(sumArr[i] %2 == 0) { // count the even ones
				even++;
			}else  odd++;
		}
		System.out.println("There are " + even + " even numbers in the array.");
		System.out.println("There are " + odd + " odd numbers in the array.");
		System.out.println();
		System.out.println("-- 3. Determination --");
		System.out.println();
		boolean flag = false;
		for (int i = 0; i < colors.length; i++) {
			if (colors[i].equals("green")) {
				flag = true;
				break;
			}
		}
		System.out.printf("%s", flag ? "There is green in the array" : "There isn't green in the array");
		System.out.println();
		System.out.println();
		System.out.println("-- 4. Selevetion --");
		System.out.println();
		int n = 0;
		while(!colors[n].equals("orange")) {
			n++;
		}
		System.out.println("The index of the orange color, " + n +".");
		System.out.println();
		System.out.println("-- 5. Linear searching --");
		System.out.println();
		int b = 0;
		while(b < colors.length && !colors[b].equals("orange")) {
			b++;
		}
		System.out.println("The index of the orange is, " + b + ".");
		System.out.println();
		System.out.println("-- 6. Sorting --");
		System.out.println();
		int[] oddNumbers = new int[sumArr.length];
		int index = 0;
		for (int i = 0; i < oddNumbers.length; i++) {
			if(sumArr[i] %2 == 0){
				oddNumbers[index] = sumArr[i];
				index ++;
			}
		}
		for(int s : oddNumbers) {
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println();
		System.out.println("-- 7. Assortment (sorted by even or odd) --");
		System.out.println();
		int[][] sortedArray = new int[2][sumArr.length];
		int oddS = 0, evenS = 0;
		for (int i = 0; i < sumArr.length; i++) {
			if(sumArr[i] %2 != 0) {
				 sortedArray[0][evenS]= sumArr[i];
				 evenS++;
			}else {
				sortedArray[1][oddS] = sumArr[i];
				oddS++;
			}
		}
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < sumArr.length; j++) {
				System.out.print(sortedArray[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("-- 8. Section --");
		System.out.println();
		String[] section = new String[Math.min(paint1.length, paint2.length)];
		int y = 0;
		for (int i = 0; i < paint1.length; i++) {
			for (int j = 0; j < paint2.length; j++) {
				if(paint1[i].equals(paint2[j])) {
					section[y] = paint1[i];
					y++;
				}
			}
		}
		for(String s : section) {
			System.out.print(s + ", " );
		}
		System.out.println();
		System.out.println();
		System.out.println("-- 9. Union --");
		System.out.println();
		String[] union = new String[paint1.length + paint2.length];
		System.arraycopy(paint1, 0, union, 0, paint1.length);
		int indx = paint1.length;
		boolean turn = true;
		for (int i = 0; i < paint2.length; i++) {
			for (int j = 0; j < paint1.length; j++) {
				if (paint2[i].equals(paint1[j])) {
					turn = false;
					break;
				}
			}
			if(turn) {
				union[indx] = paint2[i];
				indx++;
			}
			turn = true;
		}
		for(String s : union) {
			System.out.print(s + ", ");
		}
		System.out.println();
		System.out.println();
		System.out.println("-- 10. Maximum and Minimum --");
		System.out.println();
		int max = 0;
		for (int i = 0; i < sumArr.length; i++) {
			if(max < sumArr[i]) {
				max = sumArr[i];
			}
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < sumArr.length; i++) {
			if(min > sumArr[i]) {
				min = sumArr[i];
			}
		}
		System.out.println("The maximum number is: " + max);
		System.out.println("the minimum number is: " + min);
		System.out.println();
	}
	private static int[] RandomArr(int size) {
		int[] randomArr = new int[size];
		for (int i = 0; i < randomArr.length; i++) {
			randomArr[i] = (int) (Math.random()* (50 - 1 + 1) +1);
		}
		return randomArr;
	}
}
