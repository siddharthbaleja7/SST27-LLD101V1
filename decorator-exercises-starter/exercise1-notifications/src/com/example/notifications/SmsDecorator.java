package com.example.notifications;

public class SmsDecorator extends NotifierDecorator{
    private final String phoneNo;
    public SmsDecorator(Notifier notifier , String phoneNo){
        super(notifier);
        this.phoneNo =phoneNo;
    }
    @Override
    public void notify(String text){
        System.out.println("[SMS -> " + phoneNo + "]: " + text);
        super.notify(text);
    }
}
