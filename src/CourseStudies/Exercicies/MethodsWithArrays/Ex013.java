package CourseStudies.Exercicies.MethodsWithArrays;

public class Ex013 {
    public static void main(String[] args) {
        int[] A = {0, 1, 2, 3, 4};
        int[] B = {5, 6, 7, 8, 9};

        int[] C = new int[A.length + B.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }

        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }
    }
}
