package CourseStudies.Exercicies.MethodsWithArrays;

public class Ex012 {
    public static void main(String[] args) {
        int[] A = {1, 2, 4, 5, 6, 213, 42, 99};
        int[] B = {99,2,4,2,1,2,5,2};

        int[] C = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            C[i] = A[i] * B[i];
        }

        for (int i = 0; i < C.length; i++) {
            System.out.println(C[i]);
        }

    }
}
