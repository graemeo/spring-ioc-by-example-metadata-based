package example;

import example.Superpowers;

public class Wonderwoman {
   private Superpowers superpowers;
   private String ability;

   public Wonderwoman() {
   }

   public void setSuperpowers(Superpowers superpowers) {
      this.superpowers = superpowers;
   }

   public String showAbility() {
      if (ability != null && !ability.isEmpty()) {
         superpowers.setAbility(ability);
      }
      else {
         superpowers.setAbility("Agility!");
      }

      return superpowers.getAbility();
   } 
   
   public void setAbility(String ability) {
      this.ability = ability;
   }
}
