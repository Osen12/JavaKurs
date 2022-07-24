public class AppTest {
    public static void main(String[] args) {

        AndroidApp android = new AndroidApp("AndroidDybal");
        android.runAndroidApp();
        android.nazwa();
        android.appInfo();

        System.out.println("");

        IphoneApp iphone = new IphoneApp("IDybal");
        iphone.runIphoneApp();
        iphone.nazwa();
        iphone.appInfo();

    }
}
