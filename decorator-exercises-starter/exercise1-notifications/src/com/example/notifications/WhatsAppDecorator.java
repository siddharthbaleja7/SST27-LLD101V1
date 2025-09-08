package com.example.notifications;

public class WhatsAppDecorator extends NotifierDecorator{
    private  final String userName;
    public WhatsAppDecorator(Notifier notifier , String userName){
        super(notifier);
        this.userName = userName;
    }

    @Override
    public void notify(String text){
        System.out.println("[WHATSAPP -> " + userName + "]: " + text);
        super.notify(text);
    }
    
}
