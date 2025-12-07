package ThreadSafetyCode.ThreadSafeMsgQueueDesign.Actions;

import ThreadSafetyCode.ThreadSafeMsgQueueDesign.Notifications.EmailProducer;
import ThreadSafetyCode.ThreadSafeMsgQueueDesign.Notifications.PushProducer;
import ThreadSafetyCode.ThreadSafeMsgQueueDesign.Notifications.SMSProducer;

public class MessageQueue {
    static void main(String[] args) {
        NotificationSystem notificationSystem = new NotificationSystem(new Consumer("Event Consumer", "myconsumerservice@xxxxx.com"));
        notificationSystem.addProducer(new EmailProducer());
        notificationSystem.addProducer(new SMSProducer());
        notificationSystem.addProducer(new PushProducer());
        notificationSystem.sendEvent();
        for(int order = 1; order <= 9; order++) {
            System.out.println(notificationSystem.seeNotifications());
        }
    }
}

/*

Sending the Notification 1
	Sender Name: Lets Eat, Sender Email: cafeindia@letseat.com
	Receiver: USER_0, Receiver Email: cafeindia@letseat.com
	Message: Email Update::Your order is out for delivery

Sending the Notification 2
	Sender Name: Lets Eat, Sender Email: cafeindia@letseat.com
	Receiver: USER_0, Receiver Email: cafeindia@letseat.com
	Message: SMS Update::Your order is out for delivery

Sending the Notification 3
	Sender Name: Lets Eat, Sender Email: cafeindia@letseat.com
	Receiver: USER_0, Receiver Email: cafeindia@letseat.com
	Message: Push Update::Your order is out for delivery

Sending the Notification 4
	Sender Name: Lets Eat, Sender Email: cafeindia@letseat.com
	Receiver: USER_0, Receiver Email: cafeindia@letseat.com
	Message: Email Update::Your OTP is 123456 kindly share it at time of delivery

Sending the Notification 5
	Sender Name: Lets Eat, Sender Email: cafeindia@letseat.com
	Receiver: USER_0, Receiver Email: cafeindia@letseat.com
	Message: SMS Update::Your OTP is 123456 kindly share it at time of delivery

Sending the Notification 6
	Sender Name: Lets Eat, Sender Email: cafeindia@letseat.com
	Receiver: USER_0, Receiver Email: cafeindia@letseat.com
	Message: Push Update::Your OTP is 123456 kindly share it at time of delivery

Sending the Notification 7
	Sender Name: Lets Eat, Sender Email: cafeindia@letseat.com
	Receiver: USER_0, Receiver Email: cafeindia@letseat.com
	Message: Email Update::Hurray! you have received your order.

Sending the Notification 8
	Sender Name: Lets Eat, Sender Email: cafeindia@letseat.com
	Receiver: USER_0, Receiver Email: cafeindia@letseat.com
	Message: SMS Update::Hurray! you have received your order.

Sending the Notification 9
	Sender Name: Lets Eat, Sender Email: cafeindia@letseat.com
	Receiver: USER_0, Receiver Email: cafeindia@letseat.com
	Message: Push Update::Hurray! you have received your order.

 */