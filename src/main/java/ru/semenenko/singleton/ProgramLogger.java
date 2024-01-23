package ru.semenenko.singleton;

public class ProgramLogger {
    private static ProgramLogger programLogger;
    private static String logInfo = "This is log file... \n\n";

    private ProgramLogger() {

    }

    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    public void addLogInfo(String log) {
        logInfo += log + "\n";
    }

    public void showLogInfo(){
        System.out.println(logInfo);
    }
}
