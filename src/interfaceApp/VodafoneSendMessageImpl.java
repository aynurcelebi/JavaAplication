package interfaceApp;

public class VodafoneSendMessageImpl implements ISendMessage{
    @Override
    public void sendMessageWithSms() {
        System.out.println("Vodafone sms gönderdi..");
    }

    @Override
    public void sendMessageWithMail() {
        System.out.println("Vodafone mail gönderdi..");
    }
}
