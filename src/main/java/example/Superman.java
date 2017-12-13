package example;

import example.Wonderwoman;
import example.Superpowers;

public class Superman {

   private Wonderwoman wonderwoman;
   private Superpowers superpowers;
  
   public Superman(Wonderwoman wonderwoman) {
      this.wonderwoman = wonderwoman;
   }

   public void setSuperpowers(Superpowers superpowers) {
      this.superpowers = superpowers;
   }

   public String showAbility() {
      superpowers.setAbility("Superhuman strength!");
   
      return superpowers.getAbility();
   }

   public String showWonderwomansAbility() {
      return wonderwoman.showAbility();
   }
}
