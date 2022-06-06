/*    */ package vini2003.xyz.heal;
/*    */ 
/*    */ import net.fabricmc.api.ModInitializer;
/*    */ import net.minecraft.class_2960;
/*    */ import vini2003.xyz.heal.registry.common.HealCommands;
/*    */ 
/*    */ public class Heal implements ModInitializer {
/*    */   public static final String ID = "heal";
/*    */   
/*    */   public static class_2960 identifier(String path) {
/* 11 */     return new class_2960("heal", path);
/*    */   }
/*    */ 
/*    */   
/*    */   public void onInitialize() {
/* 16 */     HealCommands.initialize();
/*    */   }
/*    */ }


/* Location:              /Users/alex/BAK/vini2003/Mods/Heal/1.0.0/heal-1.0.0+1.16.5.jar!/vini2003/xyz/heal/Heal.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */