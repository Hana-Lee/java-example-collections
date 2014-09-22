package kr.co.leehana.example.system;

public class ArrayCopyExample {

	private final static int TOTAL_ELEMENTS = 10;

	public static void main(String[] args) {
		int[] src = new int[TOTAL_ELEMENTS];

		for (int i = 0; i < TOTAL_ELEMENTS; i++)
			src[i] = i + 1;

		System.out.print("Source array : ");
		for (int i = 0; i < TOTAL_ELEMENTS; i++)
			System.out.print(src[i] + " ");
		System.out.println();

		int destSize = src.length / 2;
		int[] dest = new int[destSize];
		System.arraycopy(src, 0, dest, 0, destSize);

		System.out.print("Destination array : ");
		for (int i = 0; i < destSize; i++)
			System.out.print(dest[i] + " ");
		System.out.println();
	}
}
