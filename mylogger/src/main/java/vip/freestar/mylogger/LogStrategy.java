package vip.freestar.mylogger;

public interface LogStrategy {

  void log(int priority, String tag, String message);
}
