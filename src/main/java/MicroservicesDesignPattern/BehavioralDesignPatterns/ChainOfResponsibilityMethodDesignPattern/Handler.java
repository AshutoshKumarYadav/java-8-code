package MicroservicesDesignPattern.BehavioralDesignPatterns.ChainOfResponsibilityMethodDesignPattern;

public interface Handler {
void setNext(Handler next);
void handleRequest(String request);
}
