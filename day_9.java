import java.util.Scanner;

// //Answer=1///////////////
// public class day_9{
//     public static void main(String[] args) {
//         int n=11;
//         // for (int i = 0; i < n; i++) {
//         //     for (int j = 0; j < n; j++) {
//         //         if(i==0&&j>0&&j<n-2||j==0&&i>0||i==(n-1)/2||j==(n-1)&&i>0){
//         //             System.out.print("*");
//         //         }else{
//         //             System.out.print(" ");
//         //         }
//         //     }
//         //     System.out.print(" ");
//         //     for (int j = 0; j < n; j++) {
//         //         if(j==0||i==0&&j<=(n-2)/2||i==n-1&&j<=(n-2)/2||i==(n-1)/2&&j<=(n-2)/2||j==n-1&&i>0&&i<(n-1)/2||j==n-1&&i>(n-1)/2&&i<n-1){
//         //             System.out.print(" *");
//         //         }else{
//         //             System.out.print(" ");
//         //         }
//         //     }
//         //     System.out.println();
//         // }
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 if(j==0&&i>0&&i<n-1||i==0&&j>0||i==n-1&&j>0){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.print("  ");
//             for (int j = 0; j < n; j++) {
//                 if(j==0||i==0&&j<n-1||i==n-1&&j<n-1||j==n-1&&i<n-1&&i<n+1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.print("  ");
//             for (int j = 0; j < n; j++) {
//                 if(i==0||j==0||i==(n-1)/2||i==n-1){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.print("  ");
//             for (int j = 0; j < n; j++) {
//                 if(i==0||j==0||i==(n-1)/2){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.print("  ");
//             for (int j = 0; j < n; j++) {
//                 if(i==0||j==0||i==n-1||j==n-1&&i>(n-1)/2||i==(n-1)/2&&j>(n-1)/2){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }

//     }
// }
//Answer=2////////////
// public class day_9 {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scan.nextInt();
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }
//Answer=3////////
public class day_9{
    public static void main(String[] args) {
        int n=11;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||j==0||i==n-1||j==n-1||i+j<=(n-1)/2||j-i>=(n-1)/2){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       
    }
}