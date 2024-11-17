public class timeRangeCheck {
    /**
     * 対象時間が開始時間と終了時間の範囲内かを判定
     *
     * @param targetTime 対象時間
     * @param startTime  開始時間
     * @param endTime    終了時間
     * @return boolean
     */
    public static boolean isTimeInRange(int targetTime, int startTime, int endTime) {
        // 開始時間と終了時間が同じ場合
        if (startTime == endTime) {
            return true;
        }

        // 開始時間が終了時間より早い
        if (startTime < endTime) {
            return targetTime >= startTime && targetTime < endTime;
        }

        // 開始時間が終了時間より遅い
        return targetTime >= startTime || targetTime < endTime;
    }

    /**
     * 時間が指定された範囲に含まれているかどうかを判定し、結果を表示
     *
     * @param targetTime 対象時間
     * @param startTime  開始時間
     * @param endTime    終了時間
     */
    public static void checkTimeInRange(int targetTime, int startTime, int endTime) {
        if (isTimeInRange(targetTime, startTime, endTime)) {
            System.out.println(targetTime + "時は " + startTime + "時から" + endTime + "時の範囲内です。");
        } else {
            System.out.println(targetTime + "時は " + startTime + "時から" + endTime + "時の範囲外です。");
        }
    }

    public static void main(String[] args) {
        // テストケース
        checkTimeInRange(12, 12, 12); // 12時から12時の場合
        checkTimeInRange(12, 5, 20);  // 5時から20時の場合
        checkTimeInRange(6, 10, 5);  // 10時から5時の場合

    }
}
