public class App {
        public static void main(String[] args) throws Exception {
            System.out.println("Wizards and Warlocks\n");
            //creating the objects
            Wizard Eura = new Wizard("Eura", 30, 60, 200);
            Warlock Spam = new Warlock("Spam", 10, 100, 250);

            //the implementation of method nameDisplay();
            Eura.nameDisplay();
            Spam.nameDisplay();

            //start of the sequence
            Eura.hailStorm(Spam);
            Eura.showStats();
            Eura.showStats();

            Spam.maelStorm(Eura);
            //implementation of method showStats();
            Eura.showStats();
            Spam.showStats();

            //the use of regen spell
            Eura.healSpell();
            Eura.showStats();
            Spam.showStats();

            Spam.fireBall(Eura);
            Eura.showStats();
            Spam.showStats();

            Eura.lightning(Spam);
            //the levelUp(); method
            Eura.levelUp();
        }
    }

