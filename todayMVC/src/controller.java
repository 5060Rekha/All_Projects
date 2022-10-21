/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sajja
 */
public class controller {
   private final NewClass model;
   private final view views;
   public controller(NewClass model, view views){
      this.model = model;
      this.views = views; }
   
   
   public void setvalue(int value){
      model.setValue(value); }
   public int getvalue(){
      return model.getValue();  }
   
   public void setDate1(String rollNo){
      model.setDate(rollNo);}
   public String getDate1(){
      return model.getDate(); }
   
    public void setID(int id){
      model.setOwnerID(id);}
   public int getID(){
      return model.getOwnerID(); }
   public void updateView(){
      views.printStudentDetails(model.getValue(), model.getDate(),model.getOwnerID());
   }
}