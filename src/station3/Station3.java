public class Station3 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう

    }

    public static boolean checkEmailAddress(String email) {
        // 問題1: ここから
        if (email != null) {
            return !email.isEmpty() && email.contains("@");
        } else {
            return false;
        }
        // 問題1: ここまで
    }

    public static void q2(User user) {
        // 問題2: ここから
        if (user != null && user.name == null) {
            user.name = "未設定";
        }
        // 問題2: ここまで
    }
}