package interfaceApp;

public class TestClass {

    public static void main(String[] args) {
        TurkcellSendMessageImpl turkcellSendMessage = new TurkcellSendMessageImpl();
        VodafoneSendMessageImpl vodafoneSendMessage = new VodafoneSendMessageImpl();
        TurktelekomSendMessageImpl turktelekomSendMessage = new TurktelekomSendMessageImpl();

        SendMessageManager sendMessageManager = new SendMessageManager(turktelekomSendMessage);

        sendMessageManager.sendMessage();



    }
}
