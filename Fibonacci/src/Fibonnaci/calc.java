package Fibonnaci;
// 3. 複数のクラスを定義してください。(達成)
// 4. クラスは複数のファイルに定義してください。(達成)

 class Calc {
    /**
     * フィボナッチ数列の漸化式に従い計算を行う
     *  漸化式：Fn = Fn - 1 + Fn -2
     */
    public long[] calc(int num) {
    // 配列を宣言
        long [] fibNum = new long[71];
        if(num >= 0) {fibNum[0] = 0;}
        if(num >= 1) {fibNum[1] = 1;}
        // 条件2：繰り返し構文２個目(for文)
        if(num > 1) {
        for (int i = 2; i <= num; i++) {// 繰り返し処理 (条件2 : 達成)
           fibNum[i] = fibNum[i - 1] + fibNum[i - 2];
        }
        }
        return  fibNum;

    }
    public  String getFibAll(long fibArr[] , int num) {
    	StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= num; i++) sb.append(fibArr[i]).append(" ");
        return sb.toString();
    	}
}