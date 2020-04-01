package Fibonnaci;

import java.util.Scanner;


public class main {

	public static void  main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) { // 繰り返し処理 (条件2: 1/2)
		 System.out.println("1から70までの数値を入力してください。(exit quit:終了する)->");
        String val = sc.nextLine();
        // 数値のチェック
        int num =  CheckErr(val);

        // 数値の変換
         Calc cl = new Calc();
         long[]  result = cl.calc(num);
         String fibAll = cl.getFibAll(result, num);

         // 出力処理
          System.out.println("--");
          System.out.println(num + "番目のフィボナッチ数:" + result[num]);
          System.out.println(num + "番目までのフィボナッチ数列:" + fibAll);
          System.out.println("--");
		}
	}

	public static int CheckErr(String val) {
		// 入力データ処理
        int num = 0;
        switch (val) {
        case "exit":
        case "quit":
            System.out.println("終了します.");
            System.exit(0);
        default:
        	try {
        		 num = Integer.parseInt(val); // ここで数値を変換して発生したエラーを
        		} catch (NumberFormatException e) { // ここでcatchして
        			System.out.println("不正な入力値です"); // 何かのフォロー処理を行う
        		}
        break;
        }
        // 数値チェック
        if(num < 0 || 70 < num) {
        	System.out.println("計算できるのは0から70までの数値です");
        	System.exit(0);
        }
        return  num;
	}

}


