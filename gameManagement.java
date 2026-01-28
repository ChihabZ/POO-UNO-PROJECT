
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class gameManagement {
   private final List<player> players;
   private deck deck;
   private int direction = 1;
   private int current = 0;
   private Scanner scan;

   public gameManagement(List<String> var1) {
      this.scan = new Scanner(System.in);
      this.players = new ArrayList();
      this.deck = new deck();
      Iterator var2 = var1.iterator();

      while(var2.hasNext()) {
         String var3 = (String)var2.next();
         this.players.add(new player(var3, this.deck));
      }

      this.initialDeal();
   }

   public gameManagement() {
      this.scan = new Scanner(System.in);
      this.players = new ArrayList();
      this.deck = new deck();
      this.players.add(new player("player", this.deck));
      this.players.add(new bot("BOT", this.deck));
      this.initialDeal();
   }

   private void initialDeal() {
      for(int var1 = 0; var1 < this.players.size(); ++var1) {
         for(int var2 = 0; var2 < 7; ++var2) {
            ((player)this.players.get(var1)).draw(1);
         }
      }

   }

   public void applyEffect(card var1) {
      if (var1 instanceof nonregular var2) {
         if (var2.gettype() == type.SKIP) {
            this.nextPlayer();
         } else if (var2.gettype() == type.REVERSE) {
            if (this.players.size() == 2) {
               this.nextPlayer();
            } else {
               this.direction *= -1;
            }
         } else if (var2.gettype() == type.PLUS2) {
            this.nextPlayer();
            this.getCurrentPlayer().draw(2);
         } else if (var2.gettype() == type.wild_4_plus) {
            this.chooseWildColor(var1, this.getCurrentPlayer());
            this.nextPlayer();
            this.getCurrentPlayer().draw(4);
         } else if (var2.gettype() == type.wild) {
            this.chooseWildColor(var1, this.getCurrentPlayer());
            this.nextPlayer();
         }

      }
   }

   public void chooseWildColor(card var1, player var2) {
      if (var2 instanceof bot) {
         ((bot)var2).chooseColor(var1);
      } else {
         System.out.println("choose a color: 1.RED 2.BLUE 3.GREEN 4.YELLOW");
         int var3 = this.scan.nextInt();
         switch (var3) {
            case 1:
               var1.setColor(color.red);
               break;
            case 2:
               var1.setColor(color.blue);
               break;
            case 3:
               var1.setColor(color.green);
               break;
            case 4:
               var1.setColor(color.yellow);
               break;
            default:
               System.out.println("invalid choice, color set to RED by default");
               var1.setColor(color.red);
         }
      }

   }

   public void nextPlayer() {
      this.current = (this.current + this.direction + this.players.size()) % this.players.size();
   }

   public player getCurrentPlayer() {
      return (player)this.players.get(this.current);
   }

   public card getTopDiscard() {
      return this.deck.getTopDiscard();
   }

   public boolean isGameOver() {
      Iterator var1 = this.players.iterator();

      player var2;
      do {
         if (!var1.hasNext()) {
            return false;
         }

         var2 = (player)var1.next();
      } while(!var2.hasEmptyHand());

      return true;
   }

   public void announceWinner() {
      Iterator var1 = this.players.iterator();

      player var2;
      do {
         if (!var1.hasNext()) {
            return;
         }

         var2 = (player)var1.next();
      } while(!var2.hasEmptyHand());

      System.out.println("                    ╔═════════════════════════════════════════════════════╗");
      System.out.println("                    ║                                                     ║");
      System.out.println("                    ║   ███████      ███      ███       ███    ████████   ║");
      System.out.println("                    ║  ██           █   █     ██ █     █ ██    ██         ║");
      System.out.println("                    ║  ██          █     █    ██  █   █  ██    ████████   ║");
      System.out.println("                    ║  ██    ██   █████████   ██   █ █   ██    ██         ║");
      System.out.println("                    ║   ███████  ██       ██  ██   ███   ██    ████████   ║");
      System.out.println("                    ║                                                     ║");
      System.out.println("                    ║                       O V E R                       ║");
      System.out.println("                    ║                                                     ║");
      System.out.println("                    ╚═════════════════════════════════════════════════════╝");
      System.out.println("THE WINNER IS " + var2.getName() + "!");
   }

   public deck getDeck() {
      return this.deck;
   }
}

/*
 * anyone checking this code should know that game management is not the main
 * game,
 * we built gamemanagement to ease up the manipulation of the player table in
 * the main
 * so its as complementary as the deck and card classes, mostly manipiulating
 * the deck and discard piles
 * and also initial deal and flipping the first card on the table, as well as
 * initiating the components
 * of the table management itself.
 */
// long story short, this is not the main class but a complementary one to help
// us manage the game better.
