package br.pucrs.engswii.controllers.subscription;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.pucrs.engswii.beans.subscritpion.Subscription;
import br.pucrs.engswii.beans.subscritpion.SubscriptionRegistration;
import br.pucrs.engswii.beans.subscritpion.SubscriptionReply;

@RestController
public class SubscriptionRegistrationController {

  @PostMapping("/subscription")
  public SubscriptionReply subscription(@RequestBody Subscription subscription) {
    System.out.println("In Register Subscription");		           
		SubscriptionReply subRegReply = new SubscriptionReply();

		subRegReply.setDiscipline(subscription.getDiscipline());   
		subRegReply.setUser(subscription.getUser());
		subRegReply.setRegistrationStatus(SubscriptionRegistration.getInstance().add(subscription));   
    
    return subRegReply;
  }
  
}
