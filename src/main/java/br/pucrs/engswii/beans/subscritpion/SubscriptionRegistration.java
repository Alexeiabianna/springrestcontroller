package br.pucrs.engswii.beans.subscritpion;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionRegistration {

  private List<Subscription> subscriptionRecords;

	private static SubscriptionRegistration subregd = null;

	private SubscriptionRegistration(){
		subscriptionRecords = new ArrayList<Subscription>();
	}

	public static SubscriptionRegistration getInstance() {

		if(subregd == null) {
			subregd = new SubscriptionRegistration();
			return subregd;
		}
		else {
			return subregd;
		}
	}

	public String add(Subscription std) {
		subscriptionRecords.add(std);
    return "Sucessful";
	}
  
}
