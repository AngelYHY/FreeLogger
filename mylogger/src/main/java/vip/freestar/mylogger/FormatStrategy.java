package vip.freestar.mylogger;

public interface FormatStrategy {

  void log(int priority, String tag, String message);
}
