package interfaceApp;

public class TurkcellSendMessageImpl implements ISendMessage{
    @Override
    public void sendMessageWithSms() {
        System.out.println("Turkcell sms gönderdi..");
    }

    @Override
    public void sendMessageWithMail() {
        System.out.println("Turkcell mail gönderdi..");
    }
}
