package Pages;

import Tools.ISearch;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class MessageToSendProtocol {

    public interface IRecepient {
        IMessageBody setRecipientName(String message);
    }

    public interface IMessageBody extends ISendButtonClick {
        ISendButtonClick setMessageBody(String message);
    }

    public interface ISendButtonClick {
        IMessage build();
    }

    public interface IMessage {
        String getRecipientName();

        String getMessageBody();


    }
    public static class SMS implements IRecepient, IMessageBody, ISendButtonClick, IMessage{

        private String recipientName;
        private String messageBodyText;

        public ISearch getSearch() {
            return Search;
        }

        public void setSearch(ISearch search) {
            Search = search;
        }

        ISearch Search;


        public SMS() {}

        public IRecepient get(){
           return new SMS();
        }

        public WebElement getMessageBodyField() {
            return Search.Id("io.appium.android.apis:id/sms_content");
        }

        public WebElement getRecipientField() {
            return Search.Id("io.appium.android.apis:id/sms_recipient");
        }

        public IMessageBody setRecipientName(String name) {
            this.recipientName = name;
            getRecipientField().sendKeys(recipientName);
            return this;
        }

        public ISendButtonClick setMessageBody(String message) {
            this.messageBodyText = message;
            getMessageBodyField().sendKeys(messageBodyText);
            return this;
        }

        public IMessage build(){
            return this;
        }

        //getters

        public String getRecipientName() {
            return recipientName;
        }

        public String getMessageBody() {
            return messageBodyText;
        }

        public ArrayList<IMessage> construct(){
            ArrayList<IMessage> smss = new ArrayList();
            smss.add(SMS.this.get()
                    .setRecipientName(recipientName)
                    .setMessageBody(messageBodyText)
                    .build());
            return smss;
        };

    }
}


