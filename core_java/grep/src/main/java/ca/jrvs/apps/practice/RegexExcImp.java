package ca.jrvs.apps.practice;

public class RegexExcImp implements RegexExc {

  public boolean matchJpeg(String filename) {
    return filename.matches(".+(\\.jpg|\\.jpeg)$");
  }

  public boolean matchIP(String ip) {
    return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
  }

  public boolean isEmptyLine(String line) {
    return line.matches("^\\s*$");
  }
}