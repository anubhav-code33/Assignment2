
class Subset {

	static boolean isSubset(int arr1[], int arr2[], int m,
							int n)
	{
		int i = 0;
		int j = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < m; j++)
				if (arr2[i] == arr1[j])
					break;

			if (j == m)
				return false;
		}

		return true;
	}

	public static void main(String args[])
	{
		int arr1[] = { 12, 1, 13, 22, 4, 7 };
		int arr2[] = { 12, 4, 7, 1 };

		int m = arr1.length;
		int n = arr2.length;

		if (isSubset(arr1, arr2, m, n))
			System.out.print("arr2[] is "
							+ "subset of arr1[] ");
		else
			System.out.print("arr2[] is "
							+ "not a subset of arr1[]");
	}
}
