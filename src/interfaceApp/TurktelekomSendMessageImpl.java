package interfaceApp;

public class TurktelekomSendMessageImpl implements ISendMessage{
    @Override
    public void sendMessageWithSms() {
        System.out.println("Turktelekom sms gönderdi..");
    }

    @Override
    public void sendMessageWithMail() {
        System.out.println("Turktelekom mail gönderdi..");
    }
}
