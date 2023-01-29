package interfaceApp;

public class SendMessageManager {
    TurkcellSendMessageImpl turkcellSendMessage =new TurkcellSendMessageImpl();
    VodafoneSendMessageImpl vodafoneSendMessage = new VodafoneSendMessageImpl();
    public void sendMessage(){
        vodafoneSendMessage.sendMessageWithMail();
        vodafoneSendMessage.sendMessageWithSms();
        turkcellSendMessage.sendMessageWithSms();
        turkcellSendMessage.sendMessageWithMail();
    }
}
