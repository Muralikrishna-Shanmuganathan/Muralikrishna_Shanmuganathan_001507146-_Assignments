/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author murali
 */
public class Feedback {
    private String feedback;
    ArrayList<Order> feedbackList = new ArrayList<Order>();
    
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public Feedback(String feedback){
        this.feedback=feedback;
        
    }
    public ArrayList<Order> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(ArrayList<Order> order) {
        this.feedbackList = order;
    }
    
}
