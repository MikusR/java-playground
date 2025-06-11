package info.mikusr.Hyperskill;

class ThreadUtil {
    public static void printIfDaemon(Thread thread) {
        String ret = thread.isDaemon() ? "daemon" : "not daemon";
        System.out.println(ret);
    }
}